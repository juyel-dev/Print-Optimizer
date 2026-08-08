package com.juyel.printreadyai.infra

import android.content.Context
import androidx.credentials.CredentialManager
import androidx.credentials.GetCredentialRequest
import androidx.credentials.exceptions.GetCredentialException
import com.google.android.libraries.identity.googleid.GetGoogleIdOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

object AuthManager {
    private val auth = FirebaseAuth.getInstance()
    private val firestore = FirebaseFirestore.getInstance()
    
    val currentUser get() = auth.currentUser
    val isSignedIn get() = auth.currentUser != null
    
    suspend fun signInWithGoogle(context: Context): Result<Unit> {
        return try {
            val googleIdOption = GetGoogleIdOption.Builder()
                .setServerClientId(context.getString(com.juyel.printreadyai.R.string.default_web_client_id))
                .setFilterByAuthorizedAccounts(false)
                .build()
            
            val request = GetCredentialRequest.Builder()
                .addCredentialOption(googleIdOption)
                .build()
            
            val credentialManager = CredentialManager.create(context)
            val response = credentialManager.getCredential(context, request)
            
            val credential = response.credential
            if (credential is GoogleIdTokenCredential) {
                val idToken = credential.idToken
                
                val authCredential = GoogleAuthProvider.getCredential(idToken, null)
                val user = auth.signInWithCredential(authCredential).await().user
                
                user?.let { u ->
                    val userDoc = mapOf(
                        "uid" to u.uid,
                        "email" to u.email,
                        "name" to u.displayName,
                        "photoUrl" to u.photoUrl?.toString(),
                        "plan" to "guest",
                        "createdAt" to System.currentTimeMillis()
                    )
                    firestore.collection("users").document(u.uid).set(userDoc).await()
                }
                
                Result.success(Unit)
            } else {
                Result.failure(Exception("Not a Google credential"))
            }
        } catch (e: GetCredentialException) {
            Result.failure(e)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    fun signOut() {
        auth.signOut()
    }
}

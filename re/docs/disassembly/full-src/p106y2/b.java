package p106y2;

import I.m;
import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15977c;

    public b(String id, String idToken, String str, String str2, String str3, Uri uri, String str4) {
        o.f(id, "id");
        o.f(idToken, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str4);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.f15977c = idToken;
        if (id.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (idToken.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }
}

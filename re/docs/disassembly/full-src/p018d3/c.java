package p018d3;

import T1.z;
import Y1.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p004a3.a;
import p009b3.e;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f11031d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f11033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f11034c = new d();

    public c(Context context, a aVar) {
        this.f11032a = context;
        this.f11033b = aVar;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e3) {
            throw new e(e3.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", "Firebase options used while communicating with Firebase server APIs: " + str2 + ", " + str3 + (TextUtils.isEmpty(str) ? "" : androidx.compose.foundation.text.modifiers.a.y(", ", str)));
    }

    public static long d(String str) {
        z.a("Invalid Expiration Timestamp.", f11031d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static a e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        W1.a aVarA = b.a();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarA.f1696b = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.f1698d = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b bVarA = aVarA.a();
                jsonReader.endObject();
                bVar = bVarA;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(strNextString, strNextString2, strNextString3, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        W1.a aVarA = b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarA.f1696b = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                aVarA.f1698d = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        aVarA.f1697c = 1;
        return aVarA.a();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public final HttpURLConnection c(URL url, String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f11032a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            Y2.e eVar = (Y2.e) this.f11033b.get();
            if (eVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) p000a.a.b(((Y2.c) eVar).a()));
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                } catch (ExecutionException e5) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e5);
                }
            }
            String string = null;
            try {
                PackageInfo packageInfoC = p003a2.c.a(context).c(64, context.getPackageName());
                Signature[] signatureArr = packageInfoC.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    bArrDigest = null;
                } else {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 2) {
                            messageDigest = null;
                            break;
                        }
                        try {
                            messageDigest = MessageDigest.getInstance("SHA1");
                            if (messageDigest != null) {
                                break;
                            }
                            i5++;
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
                    if (messageDigest == null) {
                        bArrDigest = null;
                    } else {
                        bArrDigest = messageDigest.digest(packageInfoC.signatures[0].toByteArray());
                    }
                }
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i6 = 0; i6 < length; i6++) {
                        char[] cArr = b.f1849a;
                        sb.append(cArr[(bArrDigest[i6] & 240) >>> 4]);
                        sb.append(cArr[bArrDigest[i6] & 15]);
                    }
                    string = sb.toString();
                }
            } catch (PackageManager.NameNotFoundException e6) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e6);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}

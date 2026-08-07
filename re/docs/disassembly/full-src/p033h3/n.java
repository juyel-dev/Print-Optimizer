package p033h3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.internal.ads.R3;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import o4.l;
import p101x2.o;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final URL f11482o;
    public volatile Future p;
    public o q;

    public n(URL url) {
        this.f11482o = url;
    }

    public final Bitmap c() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f11482o;
        if (zIsLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrU = l.u(new R3(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrU.length + " bytes from " + url);
            }
            if (bArrU.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrU, 0, bArrU.length);
            if (bitmapDecodeByteArray == null) {
                throw new IOException("Failed to decode image: " + url);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p.cancel(true);
    }
}

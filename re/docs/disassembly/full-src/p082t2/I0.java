package p082t2;

import androidx.compose.ui.graphics.Fields;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends AbstractC2250n0 {
    public static byte[] o(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[Fields.RotationZ];
            while (true) {
                int i5 = inputStream.read(bArr);
                if (i5 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i5);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // p082t2.AbstractC2250n0
    public final boolean n() {
        return false;
    }
}

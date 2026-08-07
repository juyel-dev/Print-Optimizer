package p017d1;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11015a;

    public m(long j5) {
        this.f11015a = j5;
    }

    public static m a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        m mVar = new m(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return mVar;
                    }
                    m mVar2 = new m(jsonReader.nextLong());
                    jsonReader.close();
                    return mVar2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f11015a == ((m) obj).f11015a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f11015a;
        return ((int) ((j5 >>> 32) ^ j5)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f11015a + "}";
    }
}

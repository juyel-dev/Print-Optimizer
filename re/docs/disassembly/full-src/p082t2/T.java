package p082t2;

import T1.z;
import com.google.android.gms.internal.measurement.Q;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class T implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final URL f12538o;
    public final byte[] p;
    public final O q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f12540s;
    public final /* synthetic */ P t;

    public T(P p, String str, URL url, byte[] bArr, Map map, O o5) {
        this.t = p;
        z.e(str);
        this.f12538o = url;
        this.p = bArr;
        this.q = o5;
        this.f12539r = str;
        this.f12540s = map;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        int i5;
        Throwable th;
        int i6;
        IOException iOException;
        int responseCode;
        Map<String, List<String>> headerFields;
        String str = this.f12539r;
        P p = this.t;
        C2226b0 c2226b0 = ((C2236g0) p.f12783a).f12682j;
        C2236g0.d(c2226b0);
        c2226b0.w();
        OutputStream outputStream = null;
        try {
            URL url = this.f12538o;
            try {
                synchronized (Q.class) {
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(61000);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoInput(true);
                try {
                    Map map3 = this.f12540s;
                    if (map3 != null) {
                        for (Map.Entry entry : map3.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.p;
                    if (bArr == null) {
                        responseCode = httpURLConnection.getResponseCode();
                        headerFields = httpURLConnection.getHeaderFields();
                        byte[] bArrU = P.U(httpURLConnection);
                        httpURLConnection.disconnect();
                        p.m().t(new M(this.f12539r, this.q, responseCode, (IOException) null, bArrU, headerFields));
                        return;
                    }
                    byte[] bArrY = p.k().Y(bArr);
                    p.j().f12479n.f(Integer.valueOf(bArrY.length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(bArrY.length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrY);
                        outputStream2.close();
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            headerFields = httpURLConnection.getHeaderFields();
                            try {
                                byte[] bArrU2 = P.U(httpURLConnection);
                                httpURLConnection.disconnect();
                                p.m().t(new M(this.f12539r, this.q, responseCode, (IOException) null, bArrU2, headerFields));
                                return;
                            } catch (IOException e) {
                                e = e;
                                i6 = responseCode;
                                map2 = headerFields;
                                iOException = e;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e3) {
                                        p.j().f12472f.h("Error closing HTTP compressed POST connection output stream. appId", L.q(str), e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                p.m().t(new M(this.f12539r, this.q, i6, iOException, (byte[]) null, map2));
                            } catch (Throwable th2) {
                                th = th2;
                                i5 = responseCode;
                                map = headerFields;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e5) {
                                        p.j().f12472f.h("Error closing HTTP compressed POST connection output stream. appId", L.q(str), e5);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                p.m().t(new M(this.f12539r, this.q, i5, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            map2 = null;
                            i6 = responseCode;
                        } catch (Throwable th3) {
                            map = null;
                            th = th3;
                            i5 = responseCode;
                        }
                    } catch (IOException e7) {
                        map2 = null;
                        i6 = 0;
                        outputStream = outputStream2;
                        iOException = e7;
                    } catch (Throwable th4) {
                        map = null;
                        i5 = 0;
                        outputStream = outputStream2;
                        th = th4;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        p.m().t(new M(this.f12539r, this.q, i5, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                } catch (IOException e8) {
                    e = e8;
                    map2 = null;
                    i6 = 0;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    p.m().t(new M(this.f12539r, this.q, i6, iOException, (byte[]) null, map2));
                } catch (Throwable th5) {
                    th = th5;
                    map = null;
                    i5 = 0;
                    th = th;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    p.m().t(new M(this.f12539r, this.q, i5, (IOException) null, (byte[]) null, map));
                    throw th;
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                p.m().t(new M(this.f12539r, this.q, i6, iOException, (byte[]) null, map2));
            } catch (IOException e9) {
                e = e9;
                httpURLConnection = null;
                map2 = null;
                i6 = 0;
                iOException = e;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                p.m().t(new M(this.f12539r, this.q, i6, iOException, (byte[]) null, map2));
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = null;
                map = null;
                i5 = 0;
                th = th;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                p.m().t(new M(this.f12539r, this.q, i5, (IOException) null, (byte[]) null, map));
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (Throwable th7) {
            th = th7;
        }
    }
}

package p105y1;

import Y1.b;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.ads.Fl;
import com.google.android.gms.internal.ads.Gl;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p085u1.k;
import p090v1.C2366q;

/* JADX INFO: renamed from: y1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2799j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15939a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15940b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15941c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15942d = false;
    public boolean e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15943f = "";
    public Gl g;

    public static void e(Context context, String str, boolean z3, boolean z4) {
        if (context instanceof Activity) {
            F.f15900l.post(new RunnableC2798i(context, str, z3, z4));
        } else {
            AbstractC1223ib.r("Can not create dialog without Activity Context");
        }
    }

    public static final String j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", k.f13311A.f13314c.v(context, str2));
        new t(context);
        r rVarA = t.a(0, str, map, null);
        try {
            return (String) rVarA.f5646o.get(((Integer) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9822e4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            AbstractC1223ib.q("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            rVarA.cancel(true);
            return null;
        } catch (TimeoutException e3) {
            AbstractC1223ib.q("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e3);
            rVarA.cancel(true);
            return null;
        } catch (Exception e5) {
            AbstractC1223ib.q("Error retrieving a response from: ".concat(String.valueOf(str)), e5);
            return null;
        }
    }

    public final void a(Context context) {
        Gl gl;
        if (!((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.i8)).booleanValue() || (gl = this.g) == null) {
            return;
        }
        gl.d(new BinderC2797h(this, context), Fl.f3678r);
    }

    public final void b(Context context, String str, String str2) {
        F f5 = k.f13311A.f13314c;
        F.p(context, k(context, (String) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9801a4), str, str2));
    }

    public final void c(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = k(context, (String) C2366q.f13480d.f13483c.a(AbstractC1869x7.d4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        F f5 = k.f13311A.f13314c;
        F.i(context, str, builderBuildUpon.build().toString());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    public final void d(boolean z3) {
        synchronized (this.f15939a) {
            try {
                this.e = z3;
                if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.i8)).booleanValue()) {
                    k.f13311A.g.c().b(z3);
                    Gl gl = this.g;
                    if (gl != null) {
                        if (gl.f3824r) {
                            if (z3) {
                                if (gl.p) {
                                    gl.m();
                                }
                            }
                        } else if (z3) {
                            gl.h();
                            if (gl.p) {
                                gl.m();
                            }
                        }
                        if (!gl.f()) {
                            gl.l();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(Context context, String str, String str2) {
        C1693t7 c1693t7 = AbstractC1869x7.f9813c4;
        C2366q c2366q = C2366q.f13480d;
        String strJ = j(context, k(context, (String) c2366q.f13483c.a(c1693t7), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            AbstractC1223ib.m("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            d(zEquals);
            if (((Boolean) c2366q.f13483c.a(AbstractC1869x7.i8)).booleanValue()) {
                D dC = k.f13311A.g.c();
                if (true != zEquals) {
                    str = "";
                }
                dC.a(str);
            }
            return zEquals;
        } catch (JSONException e) {
            AbstractC1223ib.t("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final boolean g() {
        boolean z3;
        synchronized (this.f15939a) {
            z3 = this.e;
        }
        return z3;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f15939a) {
            z3 = this.f15942d;
        }
        return z3;
    }

    public final boolean i(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        AbstractC1223ib.m("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003b, B:14:0x0043, B:16:0x0054, B:19:0x0066, B:11:0x0034, B:20:0x006b, B:21:0x006d), top: B:26:0x000b, inners: #1, #2 }] */
    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f15939a) {
            if (TextUtils.isEmpty(this.f15940b)) {
                F f5 = k.f13311A.f13314c;
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    b.d(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    AbstractC1223ib.m("Error reading from internal storage.");
                    str5 = "";
                }
                this.f15940b = str5;
                if (TextUtils.isEmpty(str5)) {
                    F f6 = k.f13311A.f13314c;
                    String string = UUID.randomUUID().toString();
                    this.f15940b = string;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(string.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        AbstractC1223ib.q("Error writing to file in internal storage.", e);
                    }
                    str4 = this.f15940b;
                } else {
                    str4 = this.f15940b;
                }
            } else {
                str4 = this.f15940b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }
}

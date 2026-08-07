package p013c2;

import Q1.f;
import R3.b;
import T1.z;
import Y2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p008b2.a;
import p104y0.m;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static Boolean e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f2555f = null;
    public static boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f2556h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Boolean f2557i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static j f2561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static k f2562n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2563a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f2558j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f2559k = new b(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f2560l = new d(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f2552b = new d(22);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f2553c = new d(23);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f2554d = new d(24);

    public e(Context context) {
        this.f2563a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (z.m(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0212 A[Catch: all -> 0x0210, TRY_ENTER, TryCatch #1 {, blocks: (B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219), top: B:153:0x00b6, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0272  */
    /* JADX WARN: Code duplicated, block: B:121:0x027a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0284  */
    /* JADX WARN: Code duplicated, block: B:132:0x029d A[Catch: all -> 0x029b, TryCatch #7 {all -> 0x029b, blocks: (B:132:0x029d, B:133:0x02b4, B:128:0x0293, B:129:0x029a, B:134:0x02b5, B:135:0x02e1, B:27:0x00b1, B:105:0x021c, B:106:0x0226, B:109:0x0229, B:110:0x022a, B:111:0x0231), top: B:158:0x007c, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x009d A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #10 {all -> 0x008d, blocks: (B:9:0x0053, B:13:0x0081, B:21:0x0097, B:24:0x009d, B:27:0x00b1, B:105:0x021c, B:106:0x0226, B:109:0x0229, B:110:0x022a, B:111:0x0231, B:112:0x0232, B:114:0x0250, B:116:0x025e), top: B:162:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc A[Catch: all -> 0x0210, TryCatch #1 {, blocks: (B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219), top: B:153:0x00b6, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TRY_ENTER, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0192 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ad A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01be A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01f8 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0200 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0208 A[Catch: all -> 0x0127, b -> 0x012a, RemoteException -> 0x012d, TryCatch #10 {RemoteException -> 0x012d, b -> 0x012a, all -> 0x0127, blocks: (B:29:0x00b5, B:35:0x00c1, B:37:0x00c8, B:38:0x00e3, B:42:0x00e9, B:44:0x00f1, B:46:0x00f5, B:47:0x0103, B:54:0x0111, B:62:0x0145, B:64:0x014d, B:66:0x0155, B:67:0x015c, B:61:0x0130, B:70:0x015f, B:71:0x0160, B:72:0x0167, B:73:0x0168, B:74:0x016f, B:77:0x0172, B:78:0x0173, B:80:0x0192, B:82:0x01a5, B:84:0x01ad, B:90:0x01e9, B:92:0x01ef, B:93:0x01f8, B:94:0x01ff, B:85:0x01be, B:86:0x01c5, B:88:0x01c8, B:89:0x01d9, B:95:0x0200, B:96:0x0207, B:97:0x0208, B:98:0x020f, B:104:0x021b, B:39:0x00e4, B:40:0x00e6, B:30:0x00b6, B:32:0x00bc, B:33:0x00be, B:101:0x0212, B:102:0x0219, B:48:0x0104, B:52:0x010e), top: B:163:0x00b5, inners: #0, #1, #9 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x029d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00c8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0173, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [c2.i] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static e c(Context context, d dVar, String str) throws Throwable {
        ?? r1;
        ?? r10;
        e eVar;
        int i5;
        Boolean bool;
        j jVarH;
        int i6;
        a aVarS3;
        Object objO3;
        e eVar2;
        i iVar;
        k kVar;
        i iVar2;
        boolean z3;
        a aVarS4;
        Cursor cursor;
        int i7;
        Context context2 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = f2558j;
        i iVar3 = (i) threadLocal.get();
        i iVar4 = new i();
        threadLocal.set(iVar4);
        b bVar = f2559k;
        Long l5 = (Long) bVar.get();
        long jLongValue = l5.longValue();
        try {
            bVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            d dVarF = dVar.f(context2, str, f2560l);
            int i8 = dVarF.f2549a;
            try {
                int i9 = dVarF.f2550b;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i8 + " and remote module " + str + ":" + i9);
                    int i10 = dVarF.f2551c;
                    try {
                        if (i10 != 0) {
                            if (i10 != -1) {
                                i9 = i9;
                                if (i10 == 1 || (i7 = dVarF.f2550b) != 0) {
                                    if (i10 == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                        eVar = new e(applicationContext);
                                    } else {
                                        if (i10 == 1) {
                                            throw new b("VersionPolicy returned invalid code:" + i10);
                                        }
                                        try {
                                            i5 = dVarF.f2550b;
                                            try {
                                                synchronized (e.class) {
                                                    if (g(context)) {
                                                        throw new b("Remote loading disabled");
                                                    }
                                                    bool = e;
                                                }
                                                if (bool != null) {
                                                    throw new b("Failed to determine which loading route to use.");
                                                }
                                                if (bool.booleanValue()) {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i5);
                                                    synchronized (e.class) {
                                                        kVar = f2562n;
                                                    }
                                                    if (kVar != null) {
                                                        throw new b("DynamiteLoaderV2 was not cached.");
                                                    }
                                                    iVar2 = (i) threadLocal.get();
                                                    if (iVar2 != null || iVar2.f2567a == null) {
                                                        throw new b("No result cursor");
                                                    }
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor2 = iVar2.f2567a;
                                                    new p008b2.b(null);
                                                    synchronized (e.class) {
                                                        z3 = f2556h >= 2;
                                                    }
                                                    if (z3) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        aVarS4 = kVar.T3(new p008b2.b(applicationContext2), str, i5, new p008b2.b(cursor2));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        aVarS4 = kVar.S3(new p008b2.b(applicationContext2), str, i5, new p008b2.b(cursor2));
                                                    }
                                                    Context context3 = (Context) p008b2.b.o3(aVarS4);
                                                    if (context3 == null) {
                                                        throw new b("Failed to get module context");
                                                    }
                                                    eVar2 = new e(context3);
                                                } else {
                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i5);
                                                    jVarH = h(context);
                                                    if (jVarH != null) {
                                                        throw new b("Failed to create IDynamiteLoader.");
                                                    }
                                                    Parcel parcelR1 = jVarH.R1(jVarH.X1(), 6);
                                                    i6 = parcelR1.readInt();
                                                    parcelR1.recycle();
                                                    if (i6 >= 3) {
                                                        iVar = (i) threadLocal.get();
                                                        if (iVar != null) {
                                                            throw new b("No cached result cursor holder");
                                                        }
                                                        aVarS3 = jVarH.T3(new p008b2.b(context2), str, i5, new p008b2.b(iVar.f2567a));
                                                    } else if (i6 == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        aVarS3 = jVarH.U3(new p008b2.b(context2), str, i5);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        aVarS3 = jVarH.S3(new p008b2.b(context2), str, i5);
                                                    }
                                                    objO3 = p008b2.b.o3(aVarS3);
                                                    if (objO3 != null) {
                                                        throw new b("Failed to load remote module.");
                                                    }
                                                    eVar2 = new e((Context) objO3);
                                                }
                                                eVar = eVar2;
                                            } catch (RemoteException e3) {
                                                throw new b("Failed to load remote module.", e3);
                                            } catch (b e5) {
                                                throw e5;
                                            } catch (Throwable th) {
                                                Y1.b.a(context2, th);
                                                throw new b("Failed to load remote module.", th);
                                            }
                                        } catch (b e6) {
                                            Log.w("DynamiteModule", "Failed to load remote module: " + e6.getMessage());
                                            int i11 = dVarF.f2549a;
                                            if (i11 == 0 || dVar.f(context2, str, new m(i11, 1)).f2551c != -1) {
                                                throw new b("Remote load failed. No local fallback found.", e6);
                                            }
                                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                            eVar = new e(applicationContext);
                                        }
                                    }
                                    if (jLongValue == 0) {
                                        f2559k.remove();
                                    } else {
                                        f2559k.set(l5);
                                    }
                                    cursor = iVar4.f2567a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    f2558j.set(iVar3);
                                    return eVar;
                                }
                            } else if (dVarF.f2549a != 0) {
                                i10 = -1;
                                i9 = i9;
                                if (i10 == 1) {
                                }
                                if (i10 == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    eVar = new e(applicationContext);
                                } else {
                                    if (i10 == 1) {
                                        throw new b("VersionPolicy returned invalid code:" + i10);
                                    }
                                    i5 = dVarF.f2550b;
                                    synchronized (e.class) {
                                        if (g(context)) {
                                            throw new b("Remote loading disabled");
                                        }
                                        bool = e;
                                        if (bool != null) {
                                            throw new b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i5);
                                            synchronized (e.class) {
                                                kVar = f2562n;
                                                if (kVar != null) {
                                                    throw new b("DynamiteLoaderV2 was not cached.");
                                                }
                                                iVar2 = (i) threadLocal.get();
                                                if (iVar2 != null) {
                                                }
                                                throw new b("No result cursor");
                                            }
                                        }
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i5);
                                        jVarH = h(context);
                                        if (jVarH != null) {
                                            throw new b("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel parcelR2 = jVarH.R1(jVarH.X1(), 6);
                                        i6 = parcelR2.readInt();
                                        parcelR2.recycle();
                                        if (i6 >= 3) {
                                            iVar = (i) threadLocal.get();
                                            if (iVar != null) {
                                                throw new b("No cached result cursor holder");
                                            }
                                            aVarS3 = jVarH.T3(new p008b2.b(context2), str, i5, new p008b2.b(iVar.f2567a));
                                        } else if (i6 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            aVarS3 = jVarH.U3(new p008b2.b(context2), str, i5);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            aVarS3 = jVarH.S3(new p008b2.b(context2), str, i5);
                                        }
                                        objO3 = p008b2.b.o3(aVarS3);
                                        if (objO3 != null) {
                                            throw new b("Failed to load remote module.");
                                        }
                                        eVar2 = new e((Context) objO3);
                                        eVar = eVar2;
                                    }
                                }
                                if (jLongValue == 0) {
                                    f2559k.remove();
                                } else {
                                    f2559k.set(l5);
                                }
                                cursor = iVar4.f2567a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                f2558j.set(iVar3);
                                return eVar;
                            }
                        }
                        i9 = i7;
                        throw new b("No acceptable module " + str + " found. Local version is " + dVarF.f2549a + " and remote version is " + dVarF.f2550b + ".");
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = context2;
                        r10 = i9;
                        if (jLongValue == 0) {
                            f2559k.remove();
                        } else {
                            f2559k.set(l5);
                        }
                        Cursor cursor3 = r1.f2567a;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        f2558j.set(r10);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r10 = iVar3;
                    r1 = iVar4;
                }
            } catch (Throwable th4) {
                th = th4;
                r1 = iVar4;
                r10 = iVar3;
            }
        } catch (Throwable th5) {
            th = th5;
            r1 = iVar4;
            r10 = iVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[Catch: all -> 0x0037, TryCatch #9 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b8, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0097, B:43:0x009f, B:38:0x0072, B:40:0x0078, B:41:0x0089, B:46:0x00a2, B:49:0x00a5, B:50:0x00af, B:17:0x003f), top: B:143:0x0027, inners: #5 }] */
    public static int d(Context context, String str, boolean z3) {
        Throwable th;
        RemoteException e3;
        int i5;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = e;
                boolean z4 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z3, true);
                                                String str2 = f2555f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderG = g.G();
                                                    if (classLoaderG == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = f2555f;
                                                            z.i(str3);
                                                            classLoaderG = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f2555f;
                                                            z.i(str4);
                                                            classLoaderG = new h(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderG);
                                                    declaredField.set(null, classLoaderG);
                                                    e = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e5) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e5.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z3, false);
                    } catch (b e6) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e6.getMessage());
                        return 0;
                    }
                }
                j jVarH = h(context);
                try {
                    if (jVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelR1 = jVarH.R1(jVarH.X1(), 6);
                        int i6 = parcelR1.readInt();
                        parcelR1.recycle();
                        if (i6 >= 3) {
                            ThreadLocal threadLocal = f2558j;
                            i iVar = (i) threadLocal.get();
                            if (iVar != null && (cursor = iVar.f2567a) != null) {
                                return cursor.getInt(0);
                            }
                            p008b2.b bVar = new p008b2.b(context);
                            long jLongValue = ((Long) f2559k.get()).longValue();
                            Parcel parcelX1 = jVarH.X1();
                            p059n2.a.c(parcelX1, bVar);
                            parcelX1.writeString(str);
                            parcelX1.writeInt(z3 ? 1 : 0);
                            parcelX1.writeLong(jLongValue);
                            Cursor cursor3 = (Cursor) p008b2.b.o3(p076s.b.i(jVarH.R1(parcelX1, 7)));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i5 = cursor3.getInt(0);
                                        if (i5 > 0) {
                                            i iVar2 = (i) threadLocal.get();
                                            if (iVar2 == null || iVar2.f2567a != null) {
                                                z4 = false;
                                            } else {
                                                iVar2.f2567a = cursor3;
                                            }
                                            cursor2 = z4 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e7) {
                                    e3 = e7;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i6 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            p008b2.b bVar2 = new p008b2.b(context);
                            Parcel parcelX2 = jVarH.X1();
                            p059n2.a.c(parcelX2, bVar2);
                            parcelX2.writeString(str);
                            parcelX2.writeInt(z3 ? 1 : 0);
                            Parcel parcelR2 = jVarH.R1(parcelX2, 5);
                            i5 = parcelR2.readInt();
                            parcelR2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            p008b2.b bVar3 = new p008b2.b(context);
                            Parcel parcelX3 = jVarH.X1();
                            p059n2.a.c(parcelX3, bVar3);
                            parcelX3.writeString(str);
                            parcelX3.writeInt(z3 ? 1 : 0);
                            Parcel parcelR3 = jVarH.R1(parcelX3, 3);
                            i5 = parcelR3.readInt();
                            parcelR3.recycle();
                        }
                        return i5;
                    } catch (RemoteException e8) {
                        e3 = e8;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            Y1.b.a(context, th5);
            throw th5;
        }
    }

    public static int e(Context context, String str, boolean z3, boolean z4) throws Throwable {
        boolean z5;
        Cursor cursor = null;
        try {
            try {
                boolean z6 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z3 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f2559k.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z7 = false;
                            int i5 = cursorQuery.getInt(0);
                            if (i5 > 0) {
                                synchronized (e.class) {
                                    try {
                                        f2555f = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f2556h = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z5 = cursorQuery.getInt(columnIndex2) != 0;
                                            g = z5;
                                        } else {
                                            z5 = false;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                i iVar = (i) f2558j.get();
                                if (iVar == null || iVar.f2567a != null) {
                                    z6 = false;
                                } else {
                                    iVar.f2567a = cursorQuery;
                                }
                                cursor = z6 ? null : cursorQuery;
                                z7 = z5;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z4 && z7) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i5;
                            if (e instanceof b) {
                                throw e;
                            }
                            throw new b("V2 version check failed: " + e.getMessage(), e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th2) {
                        cursor = cursorQuery;
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public static void f(ClassLoader classLoader) throws b {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 4);
            }
            f2562n = kVar;
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e5) {
            e = e5;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e6) {
            e = e6;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e7) {
            e = e7;
            throw new b("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e8) {
            e = e8;
            throw new b("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f2557i)) {
            return true;
        }
        boolean z3 = false;
        if (f2557i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (f.f969b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z3 = true;
            }
            f2557i = Boolean.valueOf(z3);
            if (z3 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = f2561m;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 4);
                }
                if (jVar != null) {
                    f2561m = jVar;
                    return jVar;
                }
            } catch (Exception e3) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e3.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f2563a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e3) {
            throw new b("Failed to instantiate module class: ".concat(str), e3);
        }
    }
}

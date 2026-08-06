package p003a2;

import C3.r;
import O3.c;
import U1.b;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.AbstractC0657s;
import androidx.lifecycle.InterfaceC0683w;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.google.android.gms.internal.ads.C0761Kd;
import com.google.android.gms.internal.ads.C1926yd;
import com.google.android.gms.internal.ads.S7;
import com.notescrafter.app.R;
import g4.p;
import g4.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C2167f;
import kotlin.jvm.internal.InterfaceC2166e;
import kotlin.jvm.internal.o;
import p010c.F;
import p010c.G;
import p013c2.g;
import p015d.e;
import p015d.f;
import p015d.h;
import p015d.k;
import p102x3.AbstractC2616p0;
import p102x3.C2590n6;
import p102x3.C2606o6;
import t4.AbstractC2325a;
import t4.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f1950a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f1951b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1952c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f1953d;

    public static String C(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        j jVar = j.f13258r;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        o.e(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i5 = 0;
        g.d(encoded.length, 0, length);
        j jVarB = new j(r.I(encoded, 0, length)).b("SHA-256");
        byte[] map = AbstractC2325a.f13247a;
        byte[] bArr = jVarB.f13259o;
        o.f(bArr, "<this>");
        o.f(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length2 = bArr.length - (bArr.length % 3);
        int i6 = 0;
        while (i5 < length2) {
            byte b5 = bArr[i5];
            int i7 = i5 + 2;
            byte b6 = bArr[i5 + 1];
            i5 += 3;
            byte b7 = bArr[i7];
            bArr2[i6] = map[(b5 & 255) >> 2];
            bArr2[i6 + 1] = map[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            int i8 = i6 + 3;
            bArr2[i6 + 2] = map[((b6 & 15) << 2) | ((b7 & 255) >> 6)];
            i6 += 4;
            bArr2[i8] = map[b7 & 63];
        }
        int length3 = bArr.length - length2;
        if (length3 == 1) {
            byte b8 = bArr[i5];
            bArr2[i6] = map[(b8 & 255) >> 2];
            bArr2[1 + i6] = map[(b8 & 3) << 4];
            bArr2[2 + i6] = 61;
            bArr2[i6 + 3] = 61;
        } else if (length3 == 2) {
            int i9 = i5 + 1;
            byte b9 = bArr[i5];
            byte b10 = bArr[i9];
            bArr2[i6] = map[(b9 & 255) >> 2];
            bArr2[1 + i6] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            bArr2[i6 + 2] = map[(b10 & 15) << 2];
            bArr2[i6 + 3] = 61;
        }
        sb.append(new String(bArr2, W3.a.f1714a));
        return sb.toString();
    }

    public static boolean D(Parcel parcel, int i5) {
        N(parcel, i5, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder E(Parcel parcel, int i5) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iH);
        return strongBinder;
    }

    public static int F(Parcel parcel, int i5) {
        N(parcel, i5, 4);
        return parcel.readInt();
    }

    public static long G(Parcel parcel, int i5) {
        N(parcel, i5, 8);
        return parcel.readLong();
    }

    public static int H(Parcel parcel, int i5) {
        return (i5 & (-65536)) != -65536 ? (char) (i5 >> 16) : parcel.readInt();
    }

    public static void I(Parcel parcel, int i5) {
        parcel.setDataPosition(parcel.dataPosition() + H(parcel, i5));
    }

    public static void J(int i5, Object[] array) {
        o.f(array, "array");
        if (i5 < array.length) {
            array[i5] = null;
        }
    }

    public static int K(Parcel parcel) {
        int i5 = parcel.readInt();
        int iH = H(parcel, i5);
        char c5 = (char) i5;
        int iDataPosition = parcel.dataPosition();
        if (c5 != 20293) {
            throw new b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i5))), parcel);
        }
        int i6 = iH + iDataPosition;
        if (i6 < iDataPosition || i6 > parcel.dataSize()) {
            throw new b(p035i0.a.m("Size read is invalid start=", " end=", iDataPosition, i6), parcel);
        }
        return i6;
    }

    public static void L(Context context) {
        boolean z3;
        Object obj = C0761Kd.f4479b;
        if (((Boolean) S7.f5617a.p()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (C0761Kd.f4479b) {
                        z3 = C0761Kd.f4480c;
                    }
                    if (z3) {
                        return;
                    }
                    J2.b bVarD = new C1926yd(context).d();
                    AbstractC1223ib.r("Updating ad debug logging enablement.");
                    AbstractC0773Md.m(bVarD, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e) {
                AbstractC1223ib.t("Fail to determine debug setting.", e);
            }
        }
    }

    public static void M(Parcel parcel, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        throw new b(p035i0.a.p(p035i0.a.q("Expected size ", i6, " got ", i5, " (0x"), Integer.toHexString(i5), ")"), parcel);
    }

    public static void N(Parcel parcel, int i5, int i6) {
        int iH = H(parcel, i5);
        if (iH == i6) {
            return;
        }
        throw new b(p035i0.a.p(p035i0.a.q("Expected size ", i6, " got ", iH, " (0x"), Integer.toHexString(iH), ")"), parcel);
    }

    public static final void a(int i5, O3.a aVar, Composer composer, boolean z3) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-361453782);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(aVar) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, (i6 >> 3) & 14);
            composerStartRestartGroup.startReplaceableGroup(-971159753);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new h(z3, stateRememberUpdatedState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h hVar = (h) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-971159481);
            boolean zChanged = composerStartRestartGroup.changed(hVar) | composerStartRestartGroup.changed(z3);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new e(hVar, z3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((O3.a) objRememberedValue2, composerStartRestartGroup, 0);
            G gA = k.a(composerStartRestartGroup);
            if (gA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            F onBackPressedDispatcher = gA.getOnBackPressedDispatcher();
            InterfaceC0683w interfaceC0683w = (InterfaceC0683w) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(-971159120);
            boolean zChanged2 = composerStartRestartGroup.changed(onBackPressedDispatcher) | composerStartRestartGroup.changed(interfaceC0683w) | composerStartRestartGroup.changed(hVar);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new f(onBackPressedDispatcher, interfaceC0683w, hVar, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(interfaceC0683w, onBackPressedDispatcher, (c) objRememberedValue3, composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p015d.g(z3, aVar, i5, 0));
        }
    }

    public static final void b(O3.a onNavigateBack, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onNavigateBack, "onNavigateBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1419201036);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onNavigateBack) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1419201036, i6, -1, "com.notescrafter.ui.screens.LiveChatScreen (LiveChatScreen.kt:23)");
            }
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m2141ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(853877936, true, new C2606o6(1, onNavigateBack), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, AbstractC2616p0.f15392c, composerStartRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2590n6(i5, 0, onNavigateBack));
        }
    }

    public static void c(Throwable th, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        o.f(th, "<this>");
        o.f(exception, "exception");
        if (th != exception) {
            Integer num = K3.a.f623a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = J3.a.f588a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static void d(StringBuilder sb, Object obj, c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static D3.c e(D3.c cVar) {
        cVar.l();
        cVar.q = true;
        return cVar.p > 0 ? cVar : D3.c.f248r;
    }

    public static v g(String str, p pVar) {
        o.f(str, "<this>");
        Charset charset = W3.a.f1714a;
        if (pVar != null) {
            Pattern pattern = p.f11330d;
            Charset charsetA = pVar.a(null);
            if (charsetA == null) {
                String str2 = pVar + "; charset=utf-8";
                o.f(str2, "<this>");
                try {
                    pVar = p111z2.b.k(str2);
                } catch (IllegalArgumentException unused) {
                    pVar = null;
                }
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        o.e(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        h4.b.c(bytes.length, 0, length);
        return new v(pVar, length, bytes, 0);
    }

    public static Bundle h(Parcel parcel, int i5) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iH);
        return bundle;
    }

    public static byte[] i(Parcel parcel, int i5) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iH);
        return bArrCreateByteArray;
    }

    public static D3.c j() {
        return new D3.c(10);
    }

    public static Parcelable k(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iH);
        return parcelable;
    }

    public static String l(Parcel parcel, int i5) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iH);
        return string;
    }

    public static String[] m(Parcel parcel, int i5) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iH);
        return strArrCreateStringArray;
    }

    public static ArrayList n(Parcel parcel, int i5) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iH);
        return arrayListCreateStringArrayList;
    }

    public static Object[] o(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iH);
        return objArrCreateTypedArray;
    }

    public static ArrayList p(Parcel parcel, int i5, Parcelable.Creator creator) {
        int iH = H(parcel, i5);
        int iDataPosition = parcel.dataPosition();
        if (iH == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iH);
        return arrayListCreateTypedArrayList;
    }

    public static void q(String str, String str2, Object obj) {
        String strX = x(str);
        if (Log.isLoggable(strX, 3)) {
            Log.d(strX, String.format(str2, obj));
        }
    }

    public static boolean r(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        int i5 = AbstractC0657s.f2269a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = androidx.core.view.r.f2265d;
        androidx.core.view.r rVar = (androidx.core.view.r) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (rVar == null) {
            rVar = new androidx.core.view.r();
            rVar.f2266a = null;
            rVar.f2267b = null;
            rVar.f2268c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
        }
        WeakReference weakReference2 = rVar.f2268c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        rVar.f2268c = new WeakReference(keyEvent);
        if (rVar.f2267b == null) {
            rVar.f2267b = new SparseArray();
        }
        SparseArray sparseArray = rVar.f2267b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static void s(String str, String str2, Exception exc) {
        String strX = x(str);
        if (Log.isLoggable(strX, 6)) {
            Log.e(strX, str2, exc);
        }
    }

    public static void t(Parcel parcel, int i5) {
        if (parcel.dataPosition() != i5) {
            throw new b(AbstractC1421mz.h(i5, "Overread allowed size end="), parcel);
        }
    }

    public static final Class u(C2167f c2167f) {
        Class clsA = c2167f.a();
        o.d(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    public static final Class v(U3.c cVar) {
        o.f(cVar, "<this>");
        Class clsA = ((InterfaceC2166e) cVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    public static final int w(int i5, int i6, int i7) {
        if (i7 > 0) {
            if (i5 >= i6) {
                return i6;
            }
            int i8 = i6 % i7;
            if (i8 < 0) {
                i8 += i7;
            }
            int i9 = i5 % i7;
            if (i9 < 0) {
                i9 += i7;
            }
            int i10 = (i8 - i9) % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            return i6 - i10;
        }
        if (i7 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i5 <= i6) {
            return i6;
        }
        int i11 = -i7;
        int i12 = i5 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        int i13 = i6 % i11;
        if (i13 < 0) {
            i13 += i11;
        }
        int i14 = (i12 - i13) % i11;
        if (i14 < 0) {
            i14 += i11;
        }
        return i6 + i14;
    }

    public static String x(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static synchronized boolean y(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f1950a;
        if (context2 != null && (bool = f1951b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f1951b = null;
        if (Y1.b.h()) {
            f1951b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f1951b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f1951b = Boolean.FALSE;
            }
        }
        f1950a = applicationContext;
        return f1951b.booleanValue();
    }

    public static List z(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        o.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public abstract void A(String str);

    public abstract void B(p042j3.c cVar);

    public abstract List f(String str, List list);
}

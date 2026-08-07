package p013c2;

import A2.t;
import B3.l;
import B3.n;
import C3.AbstractC0127g;
import F3.h;
import F3.j;
import J.d;
import K.a;
import K2.i;
import O3.c;
import O3.e;
import P2.b;
import S.s;
import X3.InterfaceC0200y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0683w;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p010c.F;
import p010c.G;
import p015d.f;
import p015d.k;
import p015d.o;
import p015d.p;
import t4.InterfaceC2332h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f2565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f2566b;

    public static void A(Parcel parcel, int i5, List list) {
        if (list == null) {
            return;
        }
        int iE = E(parcel, i5);
        parcel.writeStringList(list);
        H(parcel, iE);
    }

    public static void C(Parcel parcel, int i5, Parcelable[] parcelableArr, int i6) {
        if (parcelableArr == null) {
            return;
        }
        int iE = E(parcel, i5);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i6);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        H(parcel, iE);
    }

    public static void D(Parcel parcel, int i5, List list) {
        if (list == null) {
            return;
        }
        int iE = E(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            Parcelable parcelable = (Parcelable) list.get(i6);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        H(parcel, iE);
    }

    public static int E(Parcel parcel, int i5) {
        parcel.writeInt(i5 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final Bundle F() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", "958189564512-u6dke84iolme02slo0u8v9giego48imb.apps.googleusercontent.com");
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
  0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader G() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (f2565a == null) {
            Thread thread2 = f2566b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f2566b.getContextClassLoader();
                    } catch (SecurityException e3) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e3.getMessage());
                    }
                }
                f2565a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i6];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i6++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i5 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i5];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i5++;
                                }
                                if (thread == null) {
                                    try {
                                        f fVar = new f(threadGroup, "GmsDynamite");
                                        try {
                                            fVar.setContextClassLoader(null);
                                            fVar.start();
                                            thread = fVar;
                                        } catch (SecurityException e5) {
                                            e = e5;
                                            thread = fVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                        }
                                    } catch (SecurityException e6) {
                                        e = e6;
                                    }
                                }
                            } catch (SecurityException e7) {
                                e = e7;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f2566b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f2566b.getContextClassLoader();
                    }
                }
                f2565a = contextClassLoader;
            }
        }
        return f2565a;
    }

    public static void H(Parcel parcel, int i5) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i5 - 4);
        parcel.writeInt(iDataPosition - i5);
        parcel.setDataPosition(iDataPosition);
    }

    public static void I(Parcel parcel, int i5, int i6) {
        parcel.writeInt(i5 | (i6 << 16));
    }

    public static final void a(boolean z3, e eVar, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-642000585);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(eVar) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(eVar, composerStartRestartGroup, (i6 >> 3) & 14);
            composerStartRestartGroup.startReplaceableGroup(-723524056);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1071578902);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                e eVar2 = (e) stateRememberUpdatedState.getValue();
                o oVar = new o(z3);
                oVar.f10957d = coroutineScope;
                oVar.e = eVar2;
                composerStartRestartGroup.updateRememberedValue(oVar);
                obj = oVar;
            }
            o oVar2 = (o) obj;
            composerStartRestartGroup.endReplaceableGroup();
            e eVar3 = (e) stateRememberUpdatedState.getValue();
            composerStartRestartGroup.startReplaceableGroup(-1071578713);
            boolean zChanged = composerStartRestartGroup.changed(eVar3) | composerStartRestartGroup.changed(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                oVar2.e = (e) stateRememberUpdatedState.getValue();
                oVar2.f10957d = coroutineScope;
                composerStartRestartGroup.updateRememberedValue(B3.o.f154a);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Boolean boolValueOf = Boolean.valueOf(z3);
            composerStartRestartGroup.startReplaceableGroup(-1071578541);
            boolean zChanged2 = composerStartRestartGroup.changed(oVar2) | composerStartRestartGroup.changed(z3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new p(oVar2, z3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (e) objRememberedValue4, composerStartRestartGroup, i6 & 14);
            G gA = k.a(composerStartRestartGroup);
            if (gA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            F onBackPressedDispatcher = gA.getOnBackPressedDispatcher();
            InterfaceC0683w interfaceC0683w = (InterfaceC0683w) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(-1071578150);
            boolean zChanged3 = composerStartRestartGroup.changed(onBackPressedDispatcher) | composerStartRestartGroup.changed(interfaceC0683w) | composerStartRestartGroup.changed(oVar2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new f(onBackPressedDispatcher, interfaceC0683w, oVar2, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(interfaceC0683w, onBackPressedDispatcher, (c) objRememberedValue5, composerStartRestartGroup, 0);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p015d.g(z3, eVar, i5, 1));
        }
    }

    public static final Exception b(a aVar, String str, d dVar) {
        return new d(aVar, str);
    }

    public static final boolean c(int i5, int i6, int i7, byte[] a5, byte[] b5) {
        kotlin.jvm.internal.o.f(a5, "a");
        kotlin.jvm.internal.o.f(b5, "b");
        for (int i8 = 0; i8 < i7; i8++) {
            if (a5[i8 + i5] != b5[i8 + i6]) {
                return false;
            }
        }
        return true;
    }

    public static final void d(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("size=" + j5 + " offset=" + j6 + " byteCount=" + j7);
        }
    }

    public static final double e(int i5, int i6, int i7, int i8, X0.f fVar) {
        double d4 = ((double) i7) / ((double) i5);
        double d5 = ((double) i8) / ((double) i6);
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d4, d5);
        }
        if (iOrdinal == 1) {
            return Math.min(d4, d5);
        }
        throw new t();
    }

    public static b h(String str, String str2) {
        p042j3.a aVar = new p042j3.a(str, str2);
        P2.a aVarB = b.b(p042j3.a.class);
        aVarB.f888c = 1;
        aVarB.g = new N.b(aVar, 5);
        return aVarB.b();
    }

    public static S.t i(Context context) {
        ProviderInfo providerInfo;
        D.e eVar;
        ApplicationInfo applicationInfo;
        Y2.d cVar = Build.VERSION.SDK_INT >= 28 ? new S.c(8) : new Y2.d(8);
        PackageManager packageManager = context.getPackageManager();
        p000a.a.g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            eVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrA = cVar.a(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrA) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new D.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                eVar = null;
            }
        }
        if (eVar == null) {
            return null;
        }
        return new S.t(new s(context, eVar));
    }

    public static int j(int i5, int i6, String str, boolean z3) {
        while (i5 < i6) {
            char cCharAt = str.charAt(i5);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z3)) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static Object k(F3.g gVar, Object obj, e operation) {
        kotlin.jvm.internal.o.f(operation, "operation");
        return operation.invoke(obj, gVar);
    }

    public static b l(String str, i iVar) {
        P2.a aVarB = b.b(p042j3.a.class);
        aVarB.f888c = 1;
        aVarB.a(P2.j.a(Context.class));
        aVarB.g = new p033h3.f(2, str, iVar);
        return aVarB.b();
    }

    public static F3.g m(F3.g gVar, h key) {
        kotlin.jvm.internal.o.f(key, "key");
        if (kotlin.jvm.internal.o.b(gVar.getKey(), key)) {
            return gVar;
        }
        return null;
    }

    public static B3.e n(O3.a initializer) {
        B3.f[] fVarArr = B3.f.f147o;
        kotlin.jvm.internal.o.f(initializer, "initializer");
        n nVar = n.f153a;
        B3.p pVar = new B3.p();
        pVar.f155o = initializer;
        pVar.p = nVar;
        return pVar;
    }

    public static l o(O3.a initializer) {
        kotlin.jvm.internal.o.f(initializer, "initializer");
        return new l(initializer);
    }

    public static F3.i p(F3.g gVar, h key) {
        kotlin.jvm.internal.o.f(key, "key");
        return kotlin.jvm.internal.o.b(gVar.getKey(), key) ? j.f418o : gVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long q(int i5, String str) {
        int iJ = j(0, i5, str, false);
        Matcher matcher = g4.k.f11309m.matcher(str);
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int iK0 = -1;
        int i9 = -1;
        int i10 = -1;
        while (iJ < i5) {
            int iJ2 = j(iJ + 1, i5, str, true);
            matcher.region(iJ, iJ2);
            if (i7 == -1 && matcher.usePattern(g4.k.f11309m).matches()) {
                String strGroup = matcher.group(1);
                kotlin.jvm.internal.o.e(strGroup, "matcher.group(1)");
                i7 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                kotlin.jvm.internal.o.e(strGroup2, "matcher.group(2)");
                i9 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                kotlin.jvm.internal.o.e(strGroup3, "matcher.group(3)");
                i10 = Integer.parseInt(strGroup3);
            } else if (i8 == -1 && matcher.usePattern(g4.k.f11308l).matches()) {
                String strGroup4 = matcher.group(1);
                kotlin.jvm.internal.o.e(strGroup4, "matcher.group(1)");
                i8 = Integer.parseInt(strGroup4);
            } else if (iK0 == -1) {
                Pattern pattern = g4.k.f11307k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.o.e(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.o.e(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    kotlin.jvm.internal.o.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    kotlin.jvm.internal.o.e(strPattern, "MONTH_PATTERN.pattern()");
                    iK0 = W3.j.k0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i6 != -1 && matcher.usePattern(g4.k.f11306j).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.o.e(strGroup6, "matcher.group(1)");
                    i6 = Integer.parseInt(strGroup6);
                }
            } else if (i6 != -1) {
            }
            iJ = j(iJ2 + 1, i5, str, false);
        }
        if (70 <= i6 && i6 < 100) {
            i6 += 1900;
        }
        if (i6 >= 0 && i6 < 70) {
            i6 += 2000;
        }
        if (i6 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iK0 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i8 || i8 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 < 0 || i10 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(h4.b.f11527f);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i6);
        gregorianCalendar.set(2, iK0 - 1);
        gregorianCalendar.set(5, i8);
        gregorianCalendar.set(11, i7);
        gregorianCalendar.set(12, i9);
        gregorianCalendar.set(13, i10);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static F3.i r(F3.g gVar, F3.i context) {
        kotlin.jvm.internal.o.f(context, "context");
        return context == j.f418o ? gVar : (F3.i) context.fold(gVar, F3.b.q);
    }

    public static void s(Window window, boolean z3) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            B.c.f(window, z3);
        } else {
            if (i5 >= 30) {
                B.c.e(window, z3);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final String t(int i5) {
        int i6 = 0;
        if (i5 == 0) {
            return "0";
        }
        char[] cArr = u4.b.f13335a;
        char[] cArr2 = {cArr[(i5 >> 28) & 15], cArr[(i5 >> 24) & 15], cArr[(i5 >> 20) & 15], cArr[(i5 >> 16) & 15], cArr[(i5 >> 12) & 15], cArr[(i5 >> 8) & 15], cArr[(i5 >> 4) & 15], cArr[i5 & 15]};
        while (i6 < 8 && cArr2[i6] == '0') {
            i6++;
        }
        AbstractC0127g.Companion.getClass();
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(p035i0.a.k("startIndex: ", i6, ", endIndex: 8, size: 8"));
        }
        if (i6 <= 8) {
            return new String(cArr2, i6, 8 - i6);
        }
        throw new IllegalArgumentException(p035i0.a.k("startIndex: ", i6, " > endIndex: 8"));
    }

    public static void u(Parcel parcel, int i5, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iE = E(parcel, i5);
        parcel.writeBundle(bundle);
        H(parcel, iE);
    }

    public static void v(Parcel parcel, int i5, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iE = E(parcel, i5);
        parcel.writeByteArray(bArr);
        H(parcel, iE);
    }

    public static void w(Parcel parcel, int i5, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iE = E(parcel, i5);
        parcel.writeStrongBinder(iBinder);
        H(parcel, iE);
    }

    public static void x(Parcel parcel, int i5, Parcelable parcelable, int i6) {
        if (parcelable == null) {
            return;
        }
        int iE = E(parcel, i5);
        parcelable.writeToParcel(parcel, i6);
        H(parcel, iE);
    }

    public static void y(Parcel parcel, int i5, String str) {
        if (str == null) {
            return;
        }
        int iE = E(parcel, i5);
        parcel.writeString(str);
        H(parcel, iE);
    }

    public static void z(Parcel parcel, int i5, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iE = E(parcel, i5);
        parcel.writeStringArray(strArr);
        H(parcel, iE);
    }

    public abstract void B(InterfaceC2332h interfaceC2332h);

    public abstract long f();

    public abstract g4.p g();
}

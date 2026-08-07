package p000a;

import A.e;
import O3.c;
import S1.p;
import T1.C0149f;
import T1.z;
import W3.q;
import X3.D;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.os.StrictMode;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.google.android.gms.internal.ads.C0807Sb;
import com.google.android.gms.internal.ads.RunnableC1805vo;
import g4.m;
import g4.u;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p015d.d;
import p022f.f;
import p035i0.b;
import p074r0.g;
import p088v.h;
import p088v.j;
import p088v.k;
import p101x2.l;
import p101x2.n;
import p101x2.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static j a(D d4) {
        h hVar = new h();
        hVar.f13386c = new k();
        j jVar = new j(hVar);
        hVar.f13385b = jVar;
        hVar.f13384a = p035i0.a.class;
        try {
            d4.c(new b(0, hVar, d4));
            hVar.f13384a = "Deferred.asListenableFuture";
        } catch (Exception e) {
            jVar.p.k(e);
        }
        return jVar;
    }

    public static Object b(p101x2.h hVar) throws InterruptedException {
        z.h("Must not be called on the main application thread");
        z.g();
        z.j(hVar, "Task must not be null");
        if (hVar.f()) {
            return x(hVar);
        }
        e eVar = new e(25);
        n nVar = p101x2.j.f13715b;
        hVar.c(nVar, eVar);
        hVar.b(nVar, eVar);
        o oVar = (o) hVar;
        oVar.f13721b.d(new l(nVar, (p101x2.b) eVar));
        oVar.p();
        ((CountDownLatch) eVar.p).await();
        return x(hVar);
    }

    public static Object c(o oVar, long j5, TimeUnit timeUnit) throws TimeoutException {
        z.h("Must not be called on the main application thread");
        z.g();
        z.j(oVar, "Task must not be null");
        z.j(timeUnit, "TimeUnit must not be null");
        if (oVar.f()) {
            return x(oVar);
        }
        e eVar = new e(25);
        n nVar = p101x2.j.f13715b;
        oVar.c(nVar, eVar);
        oVar.b(nVar, eVar);
        oVar.f13721b.d(new l(nVar, (p101x2.b) eVar));
        oVar.p();
        if (((CountDownLatch) eVar.p).await(j5, timeUnit)) {
            return x(oVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static o f(Executor executor, Callable callable) {
        z.j(executor, "Executor must not be null");
        o oVar = new o();
        executor.execute(new RunnableC1805vo(23, oVar, callable));
        return oVar;
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p013c2.g.e(r9, r1, kotlin.jvm.internal.o.b(r7, r2) ? r0.getWidth() : Z0.e.d(r7.f1745a, r8), kotlin.jvm.internal.o.b(r7, r2) ? r0.getHeight() : Z0.e.d(r7.f1746b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap i(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, X0.g r7, X0.f r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.a.i(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, X0.g, X0.f, boolean):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] j(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            jArr[i5] = iArr[i5];
        }
        return jArr;
    }

    public static int l(char c5) {
        int iDigit = Character.digit((int) c5, 10);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new IllegalArgumentException("Char " + c5 + " is not a decimal digit");
    }

    public static final boolean m(char c5, char c6, boolean z3) {
        if (c5 == c6) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static o n(Exception exc) {
        o oVar = new o();
        oVar.l(exc);
        return oVar;
    }

    public static o o(Object obj) {
        o oVar = new o();
        oVar.m(obj);
        return oVar;
    }

    public static u p(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return u.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return u.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return u.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return u.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return u.SPDY_3;
        }
        if (str.equals("quic")) {
            return u.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final g q(View view) {
        kotlin.jvm.internal.o.f(view, "<this>");
        return (g) V3.l.D(V3.l.G(V3.l.E(view, p074r0.h.p), p074r0.h.q));
    }

    public static void r(J2.b bVar) {
        if (!bVar.isDone()) {
            throw new IllegalStateException(t("Future was expected to be done: %s", bVar));
        }
        boolean z3 = false;
        while (true) {
            try {
                bVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean s(char c5) {
        return Character.isWhitespace(c5) || Character.isSpaceChar(c5);
    }

    public static String t(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i5 = 0;
        for (int i6 = 0; i6 < objArr.length; i6++) {
            Object obj = objArr[i6];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i6] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i7 = 0;
        while (i5 < objArr.length && (iIndexOf = str.indexOf("%s", i7)) != -1) {
            sb3.append((CharSequence) str, i7, iIndexOf);
            sb3.append(objArr[i5]);
            i7 = iIndexOf + 2;
            i5++;
        }
        sb3.append((CharSequence) str, i7, str.length());
        if (i5 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i5]);
            for (int i8 = i5 + 1; i8 < objArr.length; i8++) {
                sb3.append(", ");
                sb3.append(objArr[i8]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static final p015d.l v(Q3.a aVar, c cVar, Composer composer) {
        composer.startReplaceableGroup(-1408504823);
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composer, 0);
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(cVar, composer, 0);
        String str = (String) RememberSaveableKt.m3500rememberSaveable(new Object[0], (Saver) null, (String) null, (O3.a) d.p, composer, 3072, 6);
        ProvidableCompositionLocal providableCompositionLocal = p015d.j.f10949a;
        composer.startReplaceableGroup(1418020823);
        f fVar = (f) composer.consume(p015d.j.f10949a);
        if (fVar == null) {
            Object baseContext = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof f) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            fVar = (f) baseContext;
        }
        composer.endReplaceableGroup();
        if (fVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        p010c.k kVarA = fVar.a();
        composer.startReplaceableGroup(-1672765924);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new p015d.a();
            composer.updateRememberedValue(objRememberedValue);
        }
        p015d.a aVar2 = (p015d.a) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1672765850);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new p015d.l(aVar2, stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        p015d.l lVar = (p015d.l) objRememberedValue2;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1672765582);
        boolean zChanged = composer.changed(aVar2) | composer.changed(kVarA) | composer.changed(str) | composer.changed(aVar) | composer.changed(stateRememberUpdatedState2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            Object cVar2 = new p015d.c(aVar2, kVarA, str, aVar, stateRememberUpdatedState2);
            composer.updateRememberedValue(cVar2);
            objRememberedValue3 = cVar2;
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(kVarA, str, aVar, (c) objRememberedValue3, composer, 0);
        composer.endReplaceableGroup();
        return lVar;
    }

    public static Object w(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            AbstractC1223ib.q("Unexpected exception.", th);
            C0807Sb.f(context).b("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }

    public static Object x(p101x2.h hVar) throws ExecutionException {
        if (hVar.g()) {
            return hVar.e();
        }
        if (((o) hVar).f13723d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.d());
    }

    public R1.c d(Context context, Looper looper, C0149f c0149f, Object obj, R1.g gVar, R1.h hVar) {
        return e(context, looper, c0149f, obj, (p) gVar, (p) hVar);
    }

    public R1.c e(Context context, Looper looper, C0149f c0149f, Object obj, p pVar, p pVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x006a A[EDGE_INSN: B:133:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b1  */
    public static g4.c u(m mVar) {
        int i5;
        int i6;
        int length;
        int length2;
        String string;
        String string2;
        int i7;
        m headers = mVar;
        kotlin.jvm.internal.o.f(headers, "headers");
        int size = mVar.size();
        int i8 = 0;
        boolean z3 = true;
        String str = null;
        boolean z4 = false;
        boolean z5 = false;
        int iY = -1;
        int iY2 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int iY3 = -1;
        int iY4 = -1;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (i8 < size) {
            String strI = headers.i(i8);
            String strL = headers.l(i8);
            if (!q.T(strI, "Cache-Control")) {
                if (!q.T(strI, "Pragma")) {
                    i5 = size;
                }
                i8++;
                headers = mVar;
                size = i5;
            } else {
                if (str == null) {
                    str = strL;
                }
                i6 = 0;
                while (i6 < strL.length()) {
                    length = strL.length();
                    length2 = i6;
                    while (true) {
                        if (length2 < length) {
                            size = size;
                            if (W3.j.d0("=,;", strL.charAt(length2))) {
                                break;
                            }
                            length2++;
                            size = size;
                        } else {
                            size = size;
                            length2 = strL.length();
                            break;
                        }
                    }
                    String strSubstring = strL.substring(i6, length2);
                    kotlin.jvm.internal.o.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = W3.j.I0(strSubstring).toString();
                    if (length2 != strL.length() || strL.charAt(length2) == ',' || strL.charAt(length2) == ';') {
                        z3 = z3;
                        i6 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = h4.b.f11523a;
                        int length4 = strL.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strL.charAt(length3);
                                int i9 = length4;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    i7 = 1;
                                    break;
                                }
                                length3++;
                                length4 = i9;
                            } else {
                                i7 = 1;
                                length3 = strL.length();
                                break;
                            }
                        }
                        if (length3 < strL.length()) {
                            z3 = z3;
                            if (strL.charAt(length3) == '\"') {
                                int i10 = length3 + i7;
                                int iJ0 = W3.j.j0(strL, '\"', i10, false, 4);
                                string2 = strL.substring(i10, iJ0);
                                kotlin.jvm.internal.o.e(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                i6 = iJ0 + 1;
                            }
                        } else {
                            z3 = z3;
                        }
                        int length5 = strL.length();
                        int length6 = length3;
                        while (true) {
                            if (length6 < length5) {
                                int i11 = length5;
                                if (W3.j.d0(",;", strL.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i11;
                            } else {
                                length6 = strL.length();
                                break;
                            }
                        }
                        String strSubstring2 = strL.substring(length3, length6);
                        kotlin.jvm.internal.o.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        string2 = W3.j.I0(strSubstring2).toString();
                        i6 = length6;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iY = h4.b.y(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iY2 = h4.b.y(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iY3 = h4.b.y(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iY4 = h4.b.y(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z9 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z10 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z11 = true;
                    }
                }
                i5 = size;
                i8++;
                headers = mVar;
                size = i5;
            }
            z3 = false;
            i6 = 0;
            while (i6 < strL.length()) {
                length = strL.length();
                length2 = i6;
                while (true) {
                    if (length2 < length) {
                        size = size;
                        if (W3.j.d0("=,;", strL.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        size = size;
                    } else {
                        size = size;
                        length2 = strL.length();
                        break;
                    }
                }
                String strSubstring3 = strL.substring(i6, length2);
                kotlin.jvm.internal.o.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = W3.j.I0(strSubstring3).toString();
                if (length2 != strL.length()) {
                    z3 = z3;
                    i6 = length2 + 1;
                    string2 = null;
                } else {
                    z3 = z3;
                    i6 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iY = h4.b.y(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iY2 = h4.b.y(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iY3 = h4.b.y(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iY4 = h4.b.y(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z9 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z10 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z11 = true;
                }
            }
            i5 = size;
            i8++;
            headers = mVar;
            size = i5;
        }
        return new g4.c(z4, z5, iY, iY2, z6, z7, z8, iY3, iY4, z9, z10, z11, !z3 ? null : str);
    }

    public static final void k(int i5, int i6) {
        if (i5 > i6) {
            throw new IndexOutOfBoundsException(p035i0.a.l("toIndex (", i5, ") is greater than size (", i6, ")."));
        }
    }

    public static void h(int i5) {
        if (2 > i5 || i5 >= 37) {
            StringBuilder sbJ = AbstractC1421mz.j("radix ", i5, " was not in valid range ");
            sbJ.append(new T3.e(2, 36, 1));
            throw new IllegalArgumentException(sbJ.toString());
        }
    }
}

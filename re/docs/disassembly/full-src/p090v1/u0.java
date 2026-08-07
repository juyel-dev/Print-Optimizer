package p090v1;

import J2.b;
import P1.l;
import P1.n;
import Q1.e;
import R1.d;
import T1.InterfaceC0146c;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.ads.A2;
import com.google.android.gms.internal.ads.AbstractC0803Rd;
import com.google.android.gms.internal.ads.AbstractC1022du;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1328ku;
import com.google.android.gms.internal.ads.AbstractC1678st;
import com.google.android.gms.internal.ads.AbstractC1766ut;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.AbstractC1943yu;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.B2;
import com.google.android.gms.internal.ads.BinderC0794Qa;
import com.google.android.gms.internal.ads.C0768Le;
import com.google.android.gms.internal.ads.C0780Ne;
import com.google.android.gms.internal.ads.C0789Pb;
import com.google.android.gms.internal.ads.C0809Sd;
import com.google.android.gms.internal.ads.C0843Yb;
import com.google.android.gms.internal.ads.C0933br;
import com.google.android.gms.internal.ads.C0962cd;
import com.google.android.gms.internal.ads.C0970cl;
import com.google.android.gms.internal.ads.C1019dr;
import com.google.android.gms.internal.ads.C1045eG;
import com.google.android.gms.internal.ads.C1123g6;
import com.google.android.gms.internal.ads.C1146gm;
import com.google.android.gms.internal.ads.C1263jG;
import com.google.android.gms.internal.ads.C1264ja;
import com.google.android.gms.internal.ads.C1307kG;
import com.google.android.gms.internal.ads.C1341l6;
import com.google.android.gms.internal.ads.C1359lh;
import com.google.android.gms.internal.ads.C1362lk;
import com.google.android.gms.internal.ads.C1412mq;
import com.google.android.gms.internal.ads.C1453nn;
import com.google.android.gms.internal.ads.C1464ny;
import com.google.android.gms.internal.ads.C1493oj;
import com.google.android.gms.internal.ads.C1538pk;
import com.google.android.gms.internal.ads.C1844wj;
import com.google.android.gms.internal.ads.C1987zu;
import com.google.android.gms.internal.ads.C2;
import com.google.android.gms.internal.ads.Cq;
import com.google.android.gms.internal.ads.D2;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.E;
import com.google.android.gms.internal.ads.E7;
import com.google.android.gms.internal.ads.Ft;
import com.google.android.gms.internal.ads.Fv;
import com.google.android.gms.internal.ads.Gr;
import com.google.android.gms.internal.ads.Gv;
import com.google.android.gms.internal.ads.H;
import com.google.android.gms.internal.ads.InterfaceC0734Ga;
import com.google.android.gms.internal.ads.InterfaceC0815Td;
import com.google.android.gms.internal.ads.InterfaceC0828Ve;
import com.google.android.gms.internal.ads.InterfaceC0901b2;
import com.google.android.gms.internal.ads.InterfaceC1177hG;
import com.google.android.gms.internal.ads.InterfaceC1597qz;
import com.google.android.gms.internal.ads.InterfaceC1711ti;
import com.google.android.gms.internal.ads.InterfaceC1812vv;
import com.google.android.gms.internal.ads.J2;
import com.google.android.gms.internal.ads.Jm;
import com.google.android.gms.internal.ads.Jz;
import com.google.android.gms.internal.ads.K;
import com.google.android.gms.internal.ads.Mn;
import com.google.android.gms.internal.ads.N5;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.RunnableC0927bl;
import com.google.android.gms.internal.ads.RunnableC1102fm;
import com.google.android.gms.internal.ads.Sk;
import com.google.android.gms.internal.ads.T3;
import com.google.android.gms.internal.ads.Vr;
import com.google.android.gms.internal.ads.W0;
import com.google.android.gms.internal.ads.Xq;
import com.google.android.gms.internal.ads.Yq;
import com.google.android.gms.internal.ads.Zq;
import com.razorpay.AppSignatureHelper;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p062o0.h;
import p085u1.k;
import p101x2.a;
import p101x2.c;
import p101x2.i;
import p105y1.B;
import p105y1.F;
import p105y1.v;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 implements c, a, InterfaceC0901b2, InterfaceC0146c, InterfaceC0815Td, A1.c, InterfaceC1597qz, InterfaceC1711ti, Fv, InterfaceC1812vv, Xq, Yq, InterfaceC1177hG {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static u0 f13498r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13499o;
    public Object p;
    public Object q;

    public /* synthetic */ u0(int i5, Object obj, Object obj2) {
        this.f13499o = i5;
        this.p = obj;
        this.q = obj2;
    }

    public static u0 n() {
        u0 u0Var;
        synchronized (u0.class) {
            try {
                if (f13498r == null) {
                    f13498r = new u0(0);
                }
                u0Var = f13498r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1812vv, A2.c
    /* JADX INFO: renamed from: a */
    public b mo6685a() {
        b bVarT0;
        Cq cq = (Cq) this.p;
        C0843Yb c0843Yb = (C0843Yb) this.q;
        cq.getClass();
        long jLongValue = ((Long) C2366q.f13480d.f13483c.a(AbstractC1869x7.Z9)).longValue();
        C1146gm c1146gm = (C1146gm) cq.f3101r;
        synchronized (c1146gm) {
            if (c1146gm.p) {
                bVarT0 = AbstractC1678st.t0(c1146gm.f7535o, jLongValue, TimeUnit.MILLISECONDS, c1146gm.u);
            } else {
                c1146gm.p = true;
                c1146gm.f7539w = c0843Yb;
                c1146gm.a();
                bVarT0 = AbstractC1678st.t0(c1146gm.f7535o, jLongValue, TimeUnit.MILLISECONDS, c1146gm.u);
                bVarT0.a(new RunnableC1102fm(c1146gm, 1), AbstractC0803Rd.f5538f);
            }
        }
        return bVarT0;
    }

    public ArrayList b(String str) {
        h hVarH = h.h(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            hVarH.j(1);
        } else {
            hVarH.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.p;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarH);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            hVarH.p();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            hVarH.p();
            throw th;
        }
    }

    public void c(boolean z3, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.p)) {
            map = new HashMap((Map) this.p);
        }
        synchronized (((Map) this.q)) {
            map2 = new HashMap((Map) this.q);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).Q(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((i) entry2.getKey()).c(new d(status));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0255  */
    /* JADX WARN: Code duplicated, block: B:128:0x0260  */
    /* JADX WARN: Code duplicated, block: B:130:0x0269  */
    /* JADX WARN: Code duplicated, block: B:131:0x0272  */
    /* JADX WARN: Code duplicated, block: B:133:0x027a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0282  */
    /* JADX WARN: Code duplicated, block: B:136:0x0285  */
    /* JADX WARN: Code duplicated, block: B:138:0x028d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0291  */
    /* JADX WARN: Code duplicated, block: B:141:0x0299  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02af  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:152:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:158:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:168:0x0306  */
    /* JADX WARN: Code duplicated, block: B:170:0x0316  */
    /* JADX WARN: Code duplicated, block: B:171:0x0330  */
    /* JADX WARN: Code duplicated, block: B:173:0x0340  */
    /* JADX WARN: Code duplicated, block: B:175:0x0344  */
    /* JADX WARN: Code duplicated, block: B:181:0x0353  */
    /* JADX WARN: Code duplicated, block: B:183:0x035b  */
    /* JADX WARN: Code duplicated, block: B:184:0x035d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0365  */
    /* JADX WARN: Code duplicated, block: B:187:0x0367  */
    /* JADX WARN: Code duplicated, block: B:189:0x036a  */
    /* JADX WARN: Code duplicated, block: B:191:0x036d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0370  */
    /* JADX WARN: Code duplicated, block: B:196:0x037a  */
    /* JADX WARN: Code duplicated, block: B:197:0x037f  */
    /* JADX WARN: Code duplicated, block: B:219:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:239:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2 A[PHI: r3
  0x01e2: PHI (r3v6 int) = (r3v5 int), (r3v5 int), (r3v5 int), (r3v28 int) binds: [B:92:0x01d0, B:94:0x01e0, B:98:0x01f0, B:127:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x0316, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.InterfaceC0901b2
    public void d(byte[] bArr, int i5, int i6, p012c1.c cVar) {
        D2 d2C;
        String strTrim;
        String string;
        int i7;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b5;
        boolean z3;
        u0 u0Var = this;
        int i8 = -1;
        int i9 = 1;
        Vr vr = (Vr) u0Var.p;
        vr.g(bArr, i5 + i6);
        vr.i(i5);
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = vr.f5995b;
            Charset charset = AbstractC1766ut.f9377c;
            String strH = vr.H(charset);
            String str = null;
            if (strH == null || !strH.startsWith("WEBVTT")) {
                vr.i(i10);
                throw C0962cd.a(null, "Expected WEBVTT. Got ".concat(String.valueOf(vr.H(charset))));
            }
            while (!TextUtils.isEmpty(vr.H(AbstractC1766ut.f9377c))) {
                u0Var = this;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r6 = 0;
                int i11 = i8;
                int i12 = 0;
                while (i11 == i8) {
                    i12 = vr.f5995b;
                    String strH2 = vr.H(AbstractC1766ut.f9377c);
                    if (strH2 == null) {
                        i11 = 0;
                    } else if ("STYLE".equals(strH2)) {
                        i11 = 2;
                    } else {
                        i11 = strH2.startsWith("NOTE") ? i9 : 3;
                    }
                }
                vr.i(i12);
                if (i11 == 0) {
                    E.m(new Cq(arrayList2), cVar);
                    return;
                }
                if (i11 == i9) {
                    while (!TextUtils.isEmpty(vr.H(AbstractC1766ut.f9377c))) {
                    }
                } else {
                    if (i11 != 2) {
                        Pattern pattern = J2.f4299a;
                        Charset charset2 = AbstractC1766ut.f9377c;
                        String strH3 = vr.H(charset2);
                        if (strH3 == null) {
                            d2C = null;
                        } else {
                            Pattern pattern2 = J2.f4299a;
                            Matcher matcher2 = pattern2.matcher(strH3);
                            if (matcher2.matches()) {
                                d2C = J2.c(null, matcher2, vr, arrayList);
                            } else {
                                String strH4 = vr.H(charset2);
                                if (strH4 != null) {
                                    Matcher matcher3 = pattern2.matcher(strH4);
                                    if (matcher3.matches()) {
                                        d2C = J2.c(strH3.trim(), matcher3, vr, arrayList);
                                    } else {
                                        d2C = null;
                                    }
                                } else {
                                    d2C = null;
                                }
                            }
                        }
                        if (d2C != null) {
                            arrayList2.add(d2C);
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        vr.H(AbstractC1766ut.f9377c);
                        A2 a5 = (A2) u0Var.q;
                        StringBuilder sb = a5.f2731b;
                        sb.setLength(0);
                        int i13 = vr.f5995b;
                        while (!TextUtils.isEmpty(vr.H(AbstractC1766ut.f9377c))) {
                        }
                        byte[] bArr2 = vr.f5994a;
                        int i14 = vr.f5995b;
                        Vr vr2 = a5.f2730a;
                        vr2.g(bArr2, i14);
                        vr2.i(i13);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            A2.b(vr2);
                            if (vr2.n() >= 5 && "::cue".equals(vr2.a(5, AbstractC1766ut.f9377c))) {
                                int i15 = vr2.f5995b;
                                String strA = A2.a(vr2, sb);
                                if (strA == null) {
                                    strTrim = str;
                                } else if ("{".equals(strA)) {
                                    vr2.i(i15);
                                    strTrim = "";
                                } else {
                                    if ("(".equals(strA)) {
                                        int i16 = vr2.f5995b;
                                        int i17 = vr2.f5996c;
                                        int i18 = r6 == true ? 1 : 0;
                                        while (i16 < i17 && i18 == 0) {
                                            int i19 = i16 + 1;
                                            int i20 = ((char) vr2.f5994a[i16]) == ')' ? i9 : r6 == true ? 1 : 0;
                                            i16 = i19;
                                            i18 = i20;
                                        }
                                        strTrim = vr2.a((i16 + i8) - vr2.f5995b, AbstractC1766ut.f9377c).trim();
                                    } else {
                                        strTrim = str;
                                    }
                                    if (!")".equals(A2.a(vr2, sb))) {
                                        strTrim = str;
                                    }
                                }
                            } else {
                                strTrim = str;
                            }
                            if (strTrim == null || !"{".equals(A2.a(vr2, sb))) {
                                break;
                            }
                            B2 b6 = new B2();
                            b6.f2816a = "";
                            b6.f2817b = "";
                            b6.f2818c = Collections.emptySet();
                            b6.f2819d = "";
                            b6.e = str;
                            b6.g = r6;
                            b6.f2822i = r6;
                            b6.f2823j = i8;
                            b6.f2824k = i8;
                            b6.f2825l = i8;
                            b6.f2826m = i8;
                            b6.f2828o = i8;
                            b6.p = r6;
                            if (!"".equals(strTrim)) {
                                int iIndexOf = strTrim.indexOf(91);
                                if (iIndexOf != i8) {
                                    Matcher matcher4 = A2.f2728c.matcher(strTrim.substring(iIndexOf));
                                    if (matcher4.matches()) {
                                        String strGroup2 = matcher4.group(i9);
                                        strGroup2.getClass();
                                        b6.f2819d = strGroup2;
                                    }
                                    strTrim = strTrim.substring(r6 == true ? 1 : 0, iIndexOf);
                                }
                                int i21 = Ft.f3701a;
                                String[] strArrSplit = strTrim.split("\\.", i8);
                                String str2 = strArrSplit[r6 == true ? 1 : 0];
                                int iIndexOf2 = str2.indexOf(35);
                                if (iIndexOf2 != i8) {
                                    b6.f2817b = str2.substring(r6 == true ? 1 : 0, iIndexOf2);
                                    b6.f2816a = str2.substring(iIndexOf2 + i9);
                                } else {
                                    b6.f2817b = str2;
                                }
                                int length = strArrSplit.length;
                                if (length > i9) {
                                    b6.f2818c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i9, length)));
                                }
                                str = null;
                            }
                            while (r6 == 0) {
                                int i22 = vr2.f5995b;
                                String strA2 = A2.a(vr2, sb);
                                ?? r15 = (strA2 == null || "}".equals(strA2)) ? i9 : r6;
                                if (r15 == 0) {
                                    vr2.i(i22);
                                    A2.b(vr2);
                                    String strC = A2.c(vr2, sb);
                                    if (!"".equals(strC) && ":".equals(A2.a(vr2, sb))) {
                                        A2.b(vr2);
                                        StringBuilder sb2 = new StringBuilder();
                                        boolean z4 = false;
                                        while (true) {
                                            if (z4) {
                                                string = sb2.toString();
                                                break;
                                            }
                                            int i23 = vr2.f5995b;
                                            boolean z5 = z4;
                                            String strA3 = A2.a(vr2, sb);
                                            if (strA3 == null) {
                                                string = null;
                                                break;
                                            } else if ("}".equals(strA3) || ";".equals(strA3)) {
                                                vr2.i(i23);
                                                z4 = true;
                                            } else {
                                                sb2.append(strA3);
                                                z4 = z5;
                                            }
                                        }
                                        if (string != null && !"".equals(string)) {
                                            int i24 = vr2.f5995b;
                                            String strA4 = A2.a(vr2, sb);
                                            if (";".equals(strA4)) {
                                                if ("color".equals(strC)) {
                                                    i7 = 1;
                                                    b6.f2820f = Mn.a(string, true);
                                                    b6.g = true;
                                                } else {
                                                    i7 = 1;
                                                    if ("background-color".equals(strC)) {
                                                        b6.f2821h = Mn.a(string, true);
                                                        b6.f2822i = true;
                                                    } else if ("ruby-position".equals(strC)) {
                                                        if ("over".equals(string)) {
                                                            b6.f2828o = 1;
                                                        } else if ("under".equals(string)) {
                                                            b6.f2828o = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strC)) {
                                                        if ("all".equals(string)) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        b6.p = z3;
                                                    } else if ("text-decoration".equals(strC)) {
                                                        if ("underline".equals(string)) {
                                                            b6.f2823j = 1;
                                                        }
                                                    } else if ("font-family".equals(strC)) {
                                                        b6.e = AbstractC1678st.n(string);
                                                    } else if ("font-weight".equals(strC)) {
                                                        i7 = 1;
                                                        if ("font-style".equals(strC)) {
                                                            if ("italic".equals(string)) {
                                                                b6.f2825l = 1;
                                                            }
                                                        } else if ("font-size".equals(strC)) {
                                                            matcher = A2.f2729d.matcher(AbstractC1678st.n(string));
                                                            if (matcher.matches()) {
                                                                strGroup = matcher.group(2);
                                                                strGroup.getClass();
                                                                iHashCode = strGroup.hashCode();
                                                                if (iHashCode != 37) {
                                                                    if (iHashCode != 3240) {
                                                                        if (iHashCode != 3592) {
                                                                            b5 = -1;
                                                                        } else {
                                                                            b5 = 0;
                                                                        }
                                                                    } else if (strGroup.equals("em")) {
                                                                        b5 = 1;
                                                                    } else {
                                                                        b5 = -1;
                                                                    }
                                                                } else if (strGroup.equals("%")) {
                                                                    b5 = 2;
                                                                } else {
                                                                    b5 = -1;
                                                                }
                                                                if (b5 != 0) {
                                                                    i9 = 1;
                                                                    if (b5 != 1) {
                                                                        b6.f2826m = 2;
                                                                    } else {
                                                                        if (b5 == 2) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        b6.f2826m = 3;
                                                                    }
                                                                } else {
                                                                    i9 = 1;
                                                                    b6.f2826m = 1;
                                                                }
                                                                String strGroup3 = matcher.group(i9);
                                                                strGroup3.getClass();
                                                                b6.f2827n = Float.parseFloat(strGroup3);
                                                            } else {
                                                                Sk.l("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                            }
                                                        }
                                                    } else if ("bold".equals(string)) {
                                                        i7 = 1;
                                                        b6.f2824k = 1;
                                                    }
                                                }
                                                i9 = i7;
                                            } else if ("}".equals(strA4)) {
                                                vr2.i(i24);
                                                if ("color".equals(strC)) {
                                                    i7 = 1;
                                                    b6.f2820f = Mn.a(string, true);
                                                    b6.g = true;
                                                } else {
                                                    i7 = 1;
                                                    if ("background-color".equals(strC)) {
                                                        b6.f2821h = Mn.a(string, true);
                                                        b6.f2822i = true;
                                                    } else if ("ruby-position".equals(strC)) {
                                                        if ("over".equals(string)) {
                                                            b6.f2828o = 1;
                                                        } else if ("under".equals(string)) {
                                                            b6.f2828o = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strC)) {
                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        b6.p = z3;
                                                    } else if ("text-decoration".equals(strC)) {
                                                        if ("underline".equals(string)) {
                                                            b6.f2823j = 1;
                                                        }
                                                    } else if ("font-family".equals(strC)) {
                                                        b6.e = AbstractC1678st.n(string);
                                                    } else if ("font-weight".equals(strC)) {
                                                        i7 = 1;
                                                        if ("font-style".equals(strC)) {
                                                            if ("italic".equals(string)) {
                                                                b6.f2825l = 1;
                                                            }
                                                        } else if ("font-size".equals(strC)) {
                                                            matcher = A2.f2729d.matcher(AbstractC1678st.n(string));
                                                            if (matcher.matches()) {
                                                                Sk.l("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                            } else {
                                                                strGroup = matcher.group(2);
                                                                strGroup.getClass();
                                                                iHashCode = strGroup.hashCode();
                                                                if (iHashCode != 37) {
                                                                    if (iHashCode != 3240) {
                                                                        if (iHashCode != 3592 && strGroup.equals("px")) {
                                                                            b5 = 0;
                                                                        } else {
                                                                            b5 = -1;
                                                                        }
                                                                    } else if (strGroup.equals("em")) {
                                                                        b5 = 1;
                                                                    } else {
                                                                        b5 = -1;
                                                                    }
                                                                } else if (strGroup.equals("%")) {
                                                                    b5 = 2;
                                                                } else {
                                                                    b5 = -1;
                                                                }
                                                                if (b5 != 0) {
                                                                    i9 = 1;
                                                                    if (b5 != 1) {
                                                                        b6.f2826m = 2;
                                                                    } else {
                                                                        if (b5 == 2) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        b6.f2826m = 3;
                                                                    }
                                                                } else {
                                                                    i9 = 1;
                                                                    b6.f2826m = 1;
                                                                }
                                                                String strGroup4 = matcher.group(i9);
                                                                strGroup4.getClass();
                                                                b6.f2827n = Float.parseFloat(strGroup4);
                                                            }
                                                        }
                                                    } else if ("bold".equals(string)) {
                                                        i7 = 1;
                                                        b6.f2824k = 1;
                                                    }
                                                }
                                                i9 = i7;
                                            }
                                        }
                                        i9 = 1;
                                    }
                                }
                                str = strA2;
                                r6 = r15;
                                r6 = 0;
                            }
                            if ("}".equals(str)) {
                                arrayList3.add(b6);
                            }
                            i8 = -1;
                            r6 = 0;
                            str = null;
                        }
                        arrayList.addAll(arrayList3);
                    }
                    u0Var = this;
                    i8 = -1;
                    str = null;
                }
            }
        } catch (C0962cd e) {
            throw new IllegalArgumentException(e);
        }
    }

    public K e(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.q)) {
            if (!((AtomicBoolean) this.q).get()) {
                try {
                    constructorA = ((H) this.p).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.q).set(true);
                    constructorA = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (K) constructorA.newInstance(objArr);
        } catch (Exception e3) {
            throw new IllegalStateException("Unexpected error creating extractor", e3);
        }
    }

    @Override // p101x2.a
    public Object f(p101x2.h hVar) {
        Bundle bundle;
        P1.a aVar = (P1.a) this.p;
        aVar.getClass();
        return (hVar.g() && (bundle = (Bundle) hVar.e()) != null && bundle.containsKey("google.messenger")) ? aVar.a((Bundle) this.q).k(n.f885o, P1.b.p) : hVar;
    }

    public synchronized Map g() {
        try {
            if (((Map) this.q) == null) {
                this.q = Collections.unmodifiableMap(new HashMap((HashMap) this.p));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.q;
    }

    @Override // p101x2.c
    public void h(p101x2.h hVar) {
        F2.h hVar2 = (F2.h) this.p;
        i iVar = (i) this.q;
        synchronized (hVar2.f407f) {
            hVar2.e.remove(iVar);
        }
    }

    public void i(String str, String str2) {
        ((ConcurrentHashMap) this.p).put(str, str2);
    }

    @Override // T1.InterfaceC0146c
    public void i0(Q1.b bVar) {
        synchronized (((N5) this.q).p) {
            ((C1341l6) this.p).c(new RuntimeException("Connection failed."));
        }
    }

    public void j(C1412mq c1412mq) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.p;
        concurrentHashMap.put("aai", c1412mq.f8352w);
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.j6)).booleanValue()) {
            String str = c1412mq.f8341n0;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            concurrentHashMap.put("rid", str);
        }
    }

    public boolean k(int i5) {
        return ((W0) this.p).f6012a.get(i5);
    }

    @Override // com.google.android.gms.internal.ads.Xq
    public Object l(Object obj) {
        Jm jm = (Jm) this.p;
        jm.getClass();
        ContentValues contentValues = new ContentValues();
        T3 t5 = (T3) this.q;
        contentValues.put("timestamp", Long.valueOf(t5.f5750a));
        contentValues.put("gws_query_id", (String) t5.f5752c);
        contentValues.put("url", (String) t5.f5753d);
        contentValues.put("event_state", Integer.valueOf(t5.f5751b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        F f5 = k.f13311A.f13314c;
        Context context = jm.f4373o;
        v vVarI = F.I(context);
        if (vVarI != null) {
            try {
                vVarI.zze(new p008b2.b(context));
            } catch (RemoteException e) {
                B.x("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Fv
    /* JADX INFO: renamed from: m */
    public void mo6681m(Object obj) {
        View view;
        switch (this.f13499o) {
            case 17:
                Gr gr = (Gr) obj;
                C1493oj c1493oj = (C1493oj) this.q;
                InterfaceC0828Ve interfaceC0828VeL = c1493oj.f8624k.l();
                if (c1493oj.f8627n.c() && gr != null && interfaceC0828VeL != null && (view = (View) this.p) != null) {
                    k.f13311A.f13327v.getClass();
                    C1538pk.r(new Gv(29, gr, view));
                    break;
                }
                break;
            default:
                ((C1019dr) ((C1123g6) this.q).t).f7004c.d1(new C0933br((Zq) this.p, 0));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Fv
    public void o(Throwable th) {
        switch (this.f13499o) {
            case 17:
                if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.y4)).booleanValue()) {
                    k.f13311A.g.f("omid native display exp", th);
                }
                break;
            default:
                ((C1019dr) ((C1123g6) this.q).t).f7004c.d1(new C0789Pb(24, (Zq) this.p, th));
                break;
        }
    }

    public void p() {
        ((C0970cl) this.q).f6846b.execute(new RunnableC0927bl(this, 0));
    }

    @Override // A1.c
    public void r(l lVar) {
        InterfaceC0734Ga interfaceC0734Ga = (InterfaceC0734Ga) this.p;
        try {
            String canonicalName = ((BinderC0794Qa) this.q).f5444o.getClass().getCanonicalName();
            int i5 = lVar.f879b;
            String str = (String) lVar.f880c;
            AbstractC1223ib.m(canonicalName + "failed to load mediation ad: ErrorCode = " + i5 + ". ErrorMessage = " + str + ". ErrorDomain = " + ((String) lVar.f881d));
            interfaceC0734Ga.A3(lVar.a());
            interfaceC0734Ga.G0(i5, str);
            interfaceC0734Ga.y(i5);
        } catch (RemoteException e) {
            AbstractC1223ib.q("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1177hG
    public C1987zu t(int i5, C1359lh c1359lh, int[] iArr) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Point point;
        AbstractC1943yu abstractC1943yu = C1307kG.f7984j;
        int i11 = ((int[]) this.q)[i5];
        C1045eG c1045eG = (C1045eG) this.p;
        int i12 = c1045eG.f8608a;
        if (i12 == Integer.MAX_VALUE || (i7 = c1045eG.f8609b) == Integer.MAX_VALUE) {
            i6 = Integer.MAX_VALUE;
        } else {
            char c5 = 0;
            int i13 = Integer.MAX_VALUE;
            while (true) {
                c1359lh.getClass();
                if (c5 > 0) {
                    break;
                }
                C2 c6 = c1359lh.f8164c[0];
                int i14 = c6.q;
                if (i14 > 0 && (i8 = c6.f2980r) > 0) {
                    if ((i14 > i8) != (i12 > i7)) {
                        i10 = i12;
                        i9 = i7;
                    } else {
                        i9 = i12;
                        i10 = i7;
                    }
                    int i15 = i14 * i10;
                    int i16 = i8 * i9;
                    if (i15 >= i16) {
                        int i17 = Ft.f3701a;
                        point = new Point(i9, ((i16 + i14) - 1) / i14);
                    } else {
                        int i18 = Ft.f3701a;
                        point = new Point(((i15 + i8) - 1) / i8, i10);
                    }
                    int i19 = c6.q;
                    int i20 = i19 * i8;
                    if (i19 >= ((int) (point.x * 0.98f)) && i8 >= ((int) (point.y * 0.98f)) && i20 < i13) {
                        i13 = i20;
                    }
                }
                c5 = 1;
            }
            i6 = i13;
        }
        Object[] objArrCopyOf = new Object[4];
        char c7 = 0;
        int i21 = 0;
        while (true) {
            c1359lh.getClass();
            if (c7 > 0) {
                return AbstractC1328ku.t(i21, objArrCopyOf);
            }
            int iA = c1359lh.f8164c[0].a();
            C1263jG c1263jG = new C1263jG(i5, c1359lh, c1045eG, iArr[0], i6 == Integer.MAX_VALUE || (iA != -1 && iA <= i6));
            c7 = 1;
            int i22 = i21 + 1;
            int length = objArrCopyOf.length;
            if (length < i22) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC1022du.d(length, i22));
            }
            objArrCopyOf[i21] = c1263jG;
            i21 = i22;
        }
    }

    public /* synthetic */ u0(int i5, Object obj, boolean z3, Object obj2) {
        this.f13499o = i5;
        this.p = obj2;
        this.q = obj;
    }

    public u0(int i5) {
        this.f13499o = i5;
        switch (i5) {
            case 4:
                this.p = Collections.synchronizedMap(new WeakHashMap());
                this.q = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 5:
                e eVar = e.f967d;
                this.p = new SparseIntArray();
                this.q = eVar;
                break;
            case 8:
                this.p = new Vr();
                this.q = new A2();
                break;
            case 24:
                C1844wj c1844wj = new C1844wj(22);
                this.p = c1844wj;
                this.q = new C1362lk(c1844wj, 22);
                break;
            case 25:
                break;
            case 26:
                this.p = new HashMap();
                break;
            default:
                this.p = new Object();
                this.q = new p067p1.l(new ArrayList());
                new ArrayList();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1597qz
    public Jz a() {
        AtomicInteger atomicInteger = C0780Ne.f5051I;
        Jz jzA = ((InterfaceC1597qz) this.p).a();
        byte[] bArr = (byte[]) this.q;
        return new C0768Le(new C1464ny(bArr), bArr.length, jzA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0815Td
    /* JADX INFO: renamed from: a */
    public void mo6689a() {
        switch (this.f13499o) {
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                B.w("callJs > getEngine: Promise rejected");
                ((C0809Sd) this.p).c(new J.a("Unable to obtain a JavascriptEngine."));
                ((C1264ja) this.q).f();
                break;
            default:
                E7 e7 = (E7) ((C1453nn) this.p).f8447b;
                D7 d7 = (D7) this.q;
                Parcel parcelX1 = e7.X1();
                AbstractC1955z5.e(parcelX1, d7);
                e7.L3(parcelX1, 1);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1711ti
    /* JADX INFO: renamed from: l */
    public void mo6677l(Object obj) {
        ((p071q1.b) obj).q((String) this.p, (String) this.q);
    }

    public u0(int i5, String str, ArrayList arrayList, byte[] bArr) {
        this.f13499o = 9;
        this.p = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.q = bArr;
    }

    public u0(H h5) {
        this.f13499o = 7;
        this.p = h5;
        this.q = new AtomicBoolean(false);
    }

    public u0(W0 w4, SparseArray sparseArray) {
        this.f13499o = 27;
        this.p = w4;
        SparseBooleanArray sparseBooleanArray = w4.f6012a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            int iA = w4.a(i5);
            RD rd = (RD) sparseArray.get(iA);
            rd.getClass();
            sparseArray2.append(iA, rd);
        }
        this.q = sparseArray2;
    }

    public u0(C0970cl c0970cl) {
        this.f13499o = 19;
        this.q = c0970cl;
        this.p = new ConcurrentHashMap();
    }

    public u0(WorkDatabase_Impl workDatabase_Impl) {
        this.f13499o = 2;
        this.p = workDatabase_Impl;
        this.q = new H0.b(workDatabase_Impl, 6);
    }
}

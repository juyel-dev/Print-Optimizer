package p083t3;

import C3.C;
import N0.C0135c;
import a4.AbstractC0211j;
import a4.F;
import a4.T;
import android.app.Application;
import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.X;
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import p011c0.d;
import p042j3.c;
import p087u3.a;
import p087u3.b;
import p087u3.e;
import p087u3.t;
import p087u3.u;

/* JADX INFO: loaded from: classes2.dex */
public final class Y extends X {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f13122w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f13123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PDFProcessor f13124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f13125d;
    public final T e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f13126f;
    public final T g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F f13127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T f13128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f13129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T f13130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F f13131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final T f13132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F f13133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T f13134o;
    public final F p;
    public final T q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F f13135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T f13136s;
    public final F t;
    public final T u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final F f13137v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c cVar = new c(10);
        cVar.k(kotlin.jvm.internal.F.a(Y.class), new C0135c(4));
        f13122w = cVar.o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y(Application application) {
        this.f13123b = application;
        this.f13124c = new PDFProcessor(application);
        this.f13125d = application.getSharedPreferences("enhance_prefs", 0);
        T tB = AbstractC0211j.b(0);
        this.e = tB;
        this.f13126f = new F(tB);
        C c5 = C.f167o;
        T tB2 = AbstractC0211j.b(c5);
        this.g = tB2;
        this.f13127h = new F(tB2);
        T tB3 = AbstractC0211j.b(c5);
        this.f13128i = tB3;
        this.f13129j = new F(tB3);
        T tB4 = AbstractC0211j.b(new b(false, false, false, false, 0, false, null, null, 255, null));
        this.f13130k = tB4;
        this.f13131l = new F(tB4);
        T tB5 = AbstractC0211j.b(new e(null, null, null, 0, 0, false, false, 127, null));
        this.f13132m = tB5;
        this.f13133n = new F(tB5);
        f();
        T tB6 = AbstractC0211j.b(new t(0, 0, 0, 0, "idle"));
        this.f13134o = tB6;
        this.p = new F(tB6);
        T tB7 = AbstractC0211j.b(u.c.INSTANCE);
        this.q = tB7;
        this.f13135r = new F(tB7);
        T tB8 = AbstractC0211j.b(0L);
        this.f13136s = tB8;
        this.t = new F(tB8);
        T tB9 = AbstractC0211j.b(0L);
        this.u = tB9;
        this.f13137v = new F(tB9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File e() {
        return this.f13124c.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        p087u3.d dVarValueOf;
        a aVarValueOf;
        p087u3.c cVarValueOf;
        SharedPreferences sharedPreferences = this.f13125d;
        b bVar = new b(sharedPreferences.getBoolean("invert_colors", true), sharedPreferences.getBoolean("clear_background", true), sharedPreferences.getBoolean("grayscale", false), sharedPreferences.getBoolean("black_and_white", false), sharedPreferences.getInt("background_threshold", 180), false, null, null, Fields.SpotShadowColor, null);
        T t = this.f13130k;
        t.getClass();
        t.j(null, bVar);
        String string = sharedPreferences.getString("quality", "HIGH");
        String str = string != null ? string : "HIGH";
        String string2 = sharedPreferences.getString("document_size", "A4");
        String str2 = string2 != null ? string2 : "A4";
        String string3 = sharedPreferences.getString("orientation", "PORTRAIT");
        String str3 = string3 != null ? string3 : "PORTRAIT";
        int i5 = sharedPreferences.getInt("nup_rows", 3);
        int i6 = sharedPreferences.getInt("nup_cols", 1);
        boolean z3 = sharedPreferences.getBoolean("add_separation_lines", false);
        boolean z4 = sharedPreferences.getBoolean("add_page_numbers", true);
        try {
            dVarValueOf = p087u3.d.valueOf(str);
        } catch (Exception unused) {
            dVarValueOf = p087u3.d.HIGH;
        }
        p087u3.d dVar = dVarValueOf;
        try {
            aVarValueOf = a.valueOf(str2);
        } catch (Exception unused2) {
            aVarValueOf = a.A4;
        }
        a aVar = aVarValueOf;
        try {
            cVarValueOf = p087u3.c.valueOf(str3);
        } catch (Exception unused3) {
            cVarValueOf = p087u3.c.PORTRAIT;
        }
        e eVar = new e(dVar, aVar, cVarValueOf, i5, i6, z3, z4);
        T t5 = this.f13132m;
        t5.getClass();
        t5.j(null, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i5) {
        Integer numValueOf = Integer.valueOf(i5);
        T t = this.e;
        t.getClass();
        t.j(null, numValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        T t = this.e;
        t.getClass();
        t.j(null, 0);
        C c5 = C.f167o;
        T t5 = this.g;
        t5.getClass();
        t5.j(null, c5);
        T t6 = this.f13128i;
        t6.getClass();
        t6.j(null, c5);
        f();
        t tVar = new t(0, 0, 0, 0, "idle");
        T t7 = this.f13134o;
        t7.getClass();
        t7.j(null, tVar);
        this.q.i(u.c.INSTANCE);
        T t8 = this.f13136s;
        t8.getClass();
        t8.j(null, 0L);
        T t9 = this.u;
        t9.getClass();
        t9.j(null, 0L);
        System.gc();
    }
}

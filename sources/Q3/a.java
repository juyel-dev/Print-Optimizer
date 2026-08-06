package Q3;

import J0.h;
import J0.i;
import T3.c;
import X3.A;
import X3.C0185i;
import X3.H;
import Z0.b;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.AbstractC0677p;
import androidx.lifecycle.EnumC0676o;
import androidx.lifecycle.InterfaceC0682v;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.C1412mq;
import com.google.android.gms.internal.ads.C1693t7;
import com.google.android.gms.internal.ads.C1722tt;
import com.google.android.gms.internal.ads.C1844wj;
import com.google.android.gms.internal.ads.Ct;
import com.google.android.gms.internal.ads.Dt;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1781v7;
import e4.d;
import e4.e;
import g4.m;
import g4.p;
import g4.q;
import g4.r;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.o;
import o4.l;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.g;
import p085u1.k;
import p090v1.C2362o;
import p090v1.C2366q;
import p092v3.j;
import p105y1.B;
import p105y1.F;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static File D(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i5 = 0; i5 < 100; i5++) {
            File file = new File(cacheDir, str + i5);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static Comparable F(Dp a5, Dp b5) {
        o.f(a5, "a");
        o.f(b5, "b");
        return a5.compareTo(b5) >= 0 ? a5 : b5;
    }

    public static String G(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb.append(str.charAt(i5));
            if (str2.length() > i5) {
                sb.append(str2.charAt(i5));
            }
        }
        return sb.toString();
    }

    public static MappedByteBuffer H(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void N(Context context, String token) {
        o.f(token, "token");
        SharedPreferences sharedPreferences = context.getSharedPreferences("auth_prefs", 0);
        String string = sharedPreferences.getString("jwt", null);
        if (string == null) {
            return;
        }
        e eVar = H.f1766a;
        A.t(A.a(d.f11107o), null, null, new j(string, sharedPreferences, token, null), 3);
    }

    public static c O(T3.e eVar) {
        return new c(eVar.p, eVar.f1308o, -eVar.q);
    }

    public static int P(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d4 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d4 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d4);
    }

    public static int Q(float f5) {
        if (Float.isNaN(f5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f5);
    }

    public static long R(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d4);
    }

    public static c S(T3.e eVar, int i5) {
        o.f(eVar, "<this>");
        boolean z3 = i5 > 0;
        Integer numValueOf = Integer.valueOf(i5);
        if (z3) {
            if (eVar.q <= 0) {
                i5 = -i5;
            }
            return new c(eVar.f1308o, eVar.p, i5);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static T3.e T(int i5, int i6) {
        if (i6 > Integer.MIN_VALUE) {
            return new T3.e(i5, i6 - 1, 1);
        }
        T3.e eVar = T3.e.f1311r;
        return T3.e.f1311r;
    }

    public static int U(int i5) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i6 = 0; i6 < 6; i6++) {
            int i7 = iArr[i6];
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == i5) {
                return i7;
            }
        }
        return 1;
    }

    public static WindowManager.LayoutParams V() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C2366q.f13480d.f13483c.a(AbstractC1869x7.Z6)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject W(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i5 = point2.x;
                    C2362o c2362o = C2362o.f13474f;
                    jSONObject3.put("x", c2362o.f13475a.d(context, i5));
                    jSONObject3.put("y", c2362o.f13475a.d(context, point2.y));
                    jSONObject3.put("start_x", c2362o.f13475a.d(context, point.x));
                    jSONObject3.put("start_y", c2362o.f13475a.d(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    AbstractC1223ib.q("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e3) {
                e = e3;
                jSONObject = jSONObject2;
                AbstractC1223ib.q("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01de  */
    public static JSONObject X(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        Map map3;
        int[] iArr;
        JSONObject jSONObject;
        boolean z3;
        Map map4 = map2;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i5 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i5];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        JSONObject jSONObject5 = jSONObject2;
                        try {
                            C2362o c2362o = C2362o.f13474f;
                            try {
                                C0743Hd c0743Hd = c2362o.f13475a;
                                C0743Hd c0743Hd2 = c2362o.f13475a;
                                jSONObject4.put("width", c0743Hd.d(context, measuredWidth));
                                jSONObject4.put("height", c0743Hd2.d(context, view2.getMeasuredHeight()));
                                jSONObject4.put("x", c0743Hd2.d(context, iArr3[0] - iArr2[0]));
                                jSONObject4.put("y", c0743Hd2.d(context, iArr3[1] - iArr2[1]));
                                jSONObject4.put("relative_to", "ad_view");
                                jSONObject3.put("frame", jSONObject4);
                                Rect rect = new Rect();
                                if (view2.getLocalVisibleRect(rect)) {
                                    jSONObject = d0(context, rect);
                                } else {
                                    jSONObject = new JSONObject();
                                    jSONObject.put("width", 0);
                                    jSONObject.put("height", 0);
                                    jSONObject.put("x", c0743Hd2.d(context, iArr3[0] - iArr2[0]));
                                    jSONObject.put("y", c0743Hd2.d(context, iArr3[1] - iArr2[1]));
                                    jSONObject.put("relative_to", "ad_view");
                                }
                                jSONObject3.put("visible_bounds", jSONObject);
                                if (((String) entry.getKey()).equals("3010")) {
                                    C1693t7 c1693t7 = AbstractC1869x7.T6;
                                    C2366q c2366q = C2366q.f13480d;
                                    SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
                                    SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v8 = c2366q.f13483c;
                                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(c1693t7)).booleanValue()) {
                                        jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                    }
                                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v8.a(AbstractC1869x7.U6)).booleanValue()) {
                                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                        jSONObject3.put("view_width_layout_type", e0(layoutParams.width) - 1);
                                        jSONObject3.put("view_height_layout_type", e0(layoutParams.height) - 1);
                                    }
                                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v8.a(AbstractC1869x7.V6)).booleanValue()) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Integer.valueOf(view2.getId()));
                                        for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                            arrayList.add(Integer.valueOf(((View) parent).getId()));
                                        }
                                        jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                    }
                                    if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.W6)).booleanValue() && scaleType != null) {
                                        jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                    }
                                }
                                if (view2 instanceof TextView) {
                                    try {
                                        TextView textView = (TextView) view2;
                                        jSONObject3.put("text_color", textView.getCurrentTextColor());
                                        iArr = iArr2;
                                        try {
                                            jSONObject3.put("font_size", textView.getTextSize());
                                            jSONObject3.put("text", textView.getText());
                                        } catch (JSONException unused) {
                                            map3 = map2;
                                            jSONObject2 = jSONObject5;
                                            AbstractC1223ib.s("Unable to get asset views information");
                                            map4 = map3;
                                            iArr2 = iArr;
                                            i5 = 2;
                                            it = it2;
                                        }
                                    } catch (JSONException unused2) {
                                        iArr = iArr2;
                                    }
                                } else {
                                    iArr = iArr2;
                                }
                                map3 = map2;
                                if (map3 != null) {
                                    try {
                                        if (map3.containsKey(entry.getKey()) && view2.isClickable()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (JSONException unused3) {
                                        jSONObject2 = jSONObject5;
                                        AbstractC1223ib.s("Unable to get asset views information");
                                        map4 = map3;
                                        iArr2 = iArr;
                                        i5 = 2;
                                        it = it2;
                                    }
                                } else {
                                    z3 = false;
                                }
                                jSONObject3.put("is_clickable", z3);
                                jSONObject2 = jSONObject5;
                                try {
                                    jSONObject2.put((String) entry.getKey(), jSONObject3);
                                } catch (JSONException unused4) {
                                    AbstractC1223ib.s("Unable to get asset views information");
                                }
                            } catch (JSONException unused5) {
                                map3 = map2;
                                iArr = iArr2;
                                jSONObject2 = jSONObject5;
                                AbstractC1223ib.s("Unable to get asset views information");
                                map4 = map3;
                                iArr2 = iArr;
                                i5 = 2;
                                it = it2;
                            }
                        } catch (JSONException unused6) {
                            map3 = map4;
                        }
                    } catch (JSONException unused7) {
                        map3 = map4;
                        iArr = iArr2;
                    }
                    map4 = map3;
                    iArr2 = iArr;
                    i5 = 2;
                    it = it2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject Y(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                F f5 = k.f13311A.f13314c;
                jSONObject.put("can_show_on_lock_screen", F.B(view));
                boolean z3 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z3 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z3);
            } catch (JSONException unused) {
                AbstractC1223ib.s("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject Z(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z3 = true;
                if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.S6)).booleanValue()) {
                    F f5 = k.f13311A.f13314c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                } else {
                    F f6 = k.f13311A.f13314c;
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                        z3 = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z3);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    public static JSONObject a0(Context context, View view) {
        String str;
        byte b5;
        JSONObject jSONObjectD0;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                    iArr2[1] = Math.min(viewGroup.getMeasuredHeight(), iArr2[1]);
                }
                JSONObject jSONObject2 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                C2362o c2362o = C2362o.f13474f;
                C0743Hd c0743Hd = c2362o.f13475a;
                C0743Hd c0743Hd2 = c2362o.f13475a;
                jSONObject2.put("width", c0743Hd.d(context, measuredWidth));
                jSONObject2.put("height", c0743Hd2.d(context, view.getMeasuredHeight()));
                jSONObject2.put("x", c0743Hd2.d(context, iArr[0]));
                jSONObject2.put("y", c0743Hd2.d(context, iArr[1]));
                jSONObject2.put("maximum_visible_width", c0743Hd2.d(context, iArr2[0]));
                jSONObject2.put("maximum_visible_height", c0743Hd2.d(context, iArr2[1]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectD0 = d0(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", c0743Hd2.d(context, iArr[0]));
                    jSONObject3.put("y", c0743Hd2.d(context, iArr[1]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectD0 = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectD0);
            } catch (Exception unused) {
                AbstractC1223ib.s("Unable to get native ad view bounding box");
            }
            if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.u5)).booleanValue()) {
                ViewParent parent2 = view.getParent();
                if (parent2 != null) {
                    try {
                        str = (String) parent2.getClass().getMethod("getTemplateTypeName", null).invoke(parent2, null);
                    } catch (IllegalAccessException e) {
                        e = e;
                        AbstractC1223ib.q("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                    } catch (NoSuchMethodException unused2) {
                        str = "";
                    } catch (SecurityException e3) {
                        e = e3;
                        AbstractC1223ib.q("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                    } catch (InvocationTargetException e5) {
                        e = e5;
                        AbstractC1223ib.q("Cannot access method getTemplateTypeName: ", e);
                        str = "";
                    }
                } else {
                    str = "";
                }
                try {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -2066603854) {
                        if (iHashCode == 2019754500 && str.equals("medium_template")) {
                            b5 = 1;
                        } else {
                            b5 = -1;
                        }
                    } else if (str.equals("small_template")) {
                        b5 = 0;
                    } else {
                        b5 = -1;
                    }
                    if (b5 == 0) {
                        jSONObject.put("native_template_type", 1);
                    } else if (b5 != 1) {
                        jSONObject.put("native_template_type", 0);
                    } else {
                        jSONObject.put("native_template_type", 2);
                    }
                } catch (JSONException e6) {
                    AbstractC1223ib.q("Could not log native template signal to JSON", e6);
                }
            }
            if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.U6)).booleanValue()) {
                try {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    jSONObject.put("view_width_layout_type", e0(layoutParams.width) - 1);
                    jSONObject.put("view_height_layout_type", e0(layoutParams.height) - 1);
                } catch (Exception unused3) {
                    B.w("Unable to get native ad view layout types");
                }
            }
        }
        return jSONObject;
    }

    public static boolean b0(Context context, C1412mq c1412mq) {
        Ct ct;
        if (!c1412mq.f8303N) {
            return false;
        }
        C1693t7 c1693t7 = AbstractC1869x7.X6;
        C2366q c2366q = C2366q.f13480d;
        boolean zBooleanValue = ((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC1781v7 sharedPreferencesOnSharedPreferenceChangeListenerC1781v7 = c2366q.f13483c;
        if (zBooleanValue) {
            return ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.a7)).booleanValue();
        }
        String str = (String) sharedPreferencesOnSharedPreferenceChangeListenerC1781v7.a(AbstractC1869x7.Y6);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            C1844wj c1844wjS = C1844wj.s(new C1722tt(';'));
            Iterator itP = ((Dt) c1844wjS.p).p(c1844wjS, str);
            do {
                ct = (Ct) itP;
                if (ct.hasNext()) {
                }
            } while (!((String) ct.next()).equals(packageName));
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(AbstractC0677p abstractC0677p, H3.c cVar) throws Throwable {
        b bVar;
        AbstractC0677p abstractC0677p2;
        E e;
        Throwable th;
        InterfaceC0682v interfaceC0682v;
        InterfaceC0682v interfaceC0682v2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.f1881r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f1881r = i5 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar);
            }
        } else {
            bVar = new b(cVar);
        }
        Object obj = bVar.q;
        G3.a aVar = G3.a.f448o;
        int i6 = bVar.f1881r;
        B3.o oVar = B3.o.f154a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e = bVar.p;
            abstractC0677p2 = bVar.f1880o;
            try {
                o4.d.y(obj);
                interfaceC0682v2 = (InterfaceC0682v) e.f11694o;
                if (interfaceC0682v2 != null) {
                    abstractC0677p2.c(interfaceC0682v2);
                }
                return oVar;
            } catch (Throwable th2) {
                th = th2;
                interfaceC0682v = (InterfaceC0682v) e.f11694o;
                if (interfaceC0682v != null) {
                    abstractC0677p2.c(interfaceC0682v);
                }
                throw th;
            }
        }
        o4.d.y(obj);
        if (abstractC0677p.b().compareTo(EnumC0676o.f2349r) >= 0) {
            return oVar;
        }
        E e3 = new E();
        try {
            bVar.f1880o = abstractC0677p;
            bVar.p = e3;
            bVar.f1881r = 1;
            C0185i c0185i = new C0185i(1, l.n(bVar));
            c0185i.u();
            Z0.c cVar2 = new Z0.c(c0185i);
            e3.f11694o = cVar2;
            abstractC0677p.a(cVar2);
            if (c0185i.t() == aVar) {
                return aVar;
            }
            abstractC0677p2 = abstractC0677p;
            e = e3;
            interfaceC0682v2 = (InterfaceC0682v) e.f11694o;
            if (interfaceC0682v2 != null) {
                abstractC0677p2.c(interfaceC0682v2);
            }
            return oVar;
        } catch (Throwable th3) {
            abstractC0677p2 = abstractC0677p;
            e = e3;
            th = th3;
            interfaceC0682v = (InterfaceC0682v) e.f11694o;
            if (interfaceC0682v != null) {
                abstractC0677p2.c(interfaceC0682v);
            }
            throw th;
        }
    }

    public static boolean c0(int i5) {
        C1693t7 c1693t7 = AbstractC1869x7.f9774V2;
        C2366q c2366q = C2366q.f13480d;
        if (((Boolean) c2366q.f13483c.a(c1693t7)).booleanValue()) {
            return ((Boolean) c2366q.f13483c.a(AbstractC1869x7.f9779W2)).booleanValue() || i5 <= 15299999;
        }
        return true;
    }

    public static String d(int i5, int i6, String str) {
        if (i5 < 0) {
            return p000a.a.t("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i6 >= 0) {
            return p000a.a.t("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }

    public static JSONObject d0(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i5 = rect.right - rect.left;
        C2362o c2362o = C2362o.f13474f;
        jSONObject.put("width", c2362o.f13475a.d(context, i5));
        int i6 = rect.bottom - rect.top;
        C0743Hd c0743Hd = c2362o.f13475a;
        jSONObject.put("height", c0743Hd.d(context, i6));
        jSONObject.put("x", c0743Hd.d(context, rect.left));
        jSONObject.put("y", c0743Hd.d(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int e0(int i5) {
        if (i5 != -2) {
            return i5 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static void i(int i5, int i6) {
        String strT;
        if (i5 < 0 || i5 >= i6) {
            if (i5 < 0) {
                strT = p000a.a.t("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i6 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i6);
                    throw new IllegalArgumentException(sb.toString());
                }
                strT = p000a.a.t("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i6));
            }
            throw new IndexOutOfBoundsException(strT);
        }
    }

    public static void j(int i5, int i6) {
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(d(i5, i6, "index"));
        }
    }

    public static void k(int i5, int i6, int i7) {
        String strD;
        if (i5 < 0 || i6 < i5 || i6 > i7) {
            if (i5 < 0 || i5 > i7) {
                strD = d(i5, i7, "start index");
            } else {
                strD = (i6 < 0 || i6 > i7) ? d(i6, i7, "end index") : p000a.a.t("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static final void l(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                p003a2.a.c(th, th2);
            }
        }
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float n(float f5, float f6) {
        return f5 < f6 ? f6 : f5;
    }

    public static float o(float f5, float f6) {
        return f5 > f6 ? f6 : f5;
    }

    public static double p(double d4, double d5, double d6) {
        if (d5 <= d6) {
            if (d4 < d5) {
                return d5;
            }
            return d4 > d6 ? d6 : d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d6 + " is less than minimum " + d5 + '.');
    }

    public static float q(float f5, float f6, float f7) {
        if (f6 <= f7) {
            if (f5 < f6) {
                return f6;
            }
            return f5 > f7 ? f7 : f5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f7 + " is less than minimum " + f6 + '.');
    }

    public static int r(int i5, int i6, int i7) {
        if (i6 <= i7) {
            if (i5 < i6) {
                return i6;
            }
            return i5 > i7 ? i7 : i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i7 + " is less than minimum " + i6 + '.');
    }

    public static long s(long j5, long j6, long j7) {
        if (j6 <= j7) {
            if (j5 < j6) {
                return j6;
            }
            return j5 > j7 ? j7 : j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j7 + " is less than minimum " + j6 + '.');
    }

    public static Comparable t(Comparable comparable, T3.b range) {
        o.f(range, "range");
        T3.a aVar = (T3.a) range;
        if (aVar.a()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        float f5 = aVar.f1306a;
        if (aVar.b(comparable, Float.valueOf(f5)) && !aVar.b(Float.valueOf(f5), comparable)) {
            return Float.valueOf(f5);
        }
        float f6 = aVar.f1307b;
        return (!aVar.b(Float.valueOf(f6), comparable) || aVar.b(comparable, Float.valueOf(f6))) ? comparable : Float.valueOf(f6);
    }

    public static int u(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static boolean v(File file, Resources resources, int i5) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i5);
            try {
                boolean zW = w(file, inputStreamOpenRawResource);
                m(inputStreamOpenRawResource);
                return zW;
            } catch (Throwable th) {
                th = th;
                m(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean w(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[Fields.RotationZ];
                    while (true) {
                        int i5 = inputStream.read(bArr);
                        if (i5 == -1) {
                            m(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i5);
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static q x(String str, String str2, g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        p pVar = r.g;
        K2.b.b(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            K2.b.b(sb, str2);
        }
        String string = sb.toString();
        o.e(string, "StringBuilder().apply(builderAction).toString()");
        p042j3.c cVar = new p042j3.c(12);
        cVar.n("Content-Disposition", string);
        m mVarP = cVar.p();
        if (mVarP.g("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (mVarP.g("Content-Length") == null) {
            return new q(mVarP, gVar);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    public abstract Constructor A(Class cls);

    public abstract String[] B(Class cls);

    public p042j3.c C(Context context, Object obj) {
        return null;
    }

    public abstract boolean E(Class cls);

    public abstract View I(int i5);

    public abstract boolean J();

    public abstract Object K(int i5, Intent intent);

    public abstract void L(h hVar, h hVar2);

    public abstract void M(h hVar, Thread thread);

    public abstract boolean f(i iVar, J0.d dVar, J0.d dVar2);

    public abstract boolean g(i iVar, Object obj, Object obj2);

    public abstract boolean h(i iVar, h hVar, h hVar2);

    public abstract Intent y(Context context, Object obj);

    public abstract Method z(Class cls, Field field);
}

package p065o3;

import androidx.compose.foundation.text.modifiers.a;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p051l3.d;
import p051l3.g;
import p051l3.p;
import p072q3.c;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f12185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12187d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f12188f;
    public final /* synthetic */ Method g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f12190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f12191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TypeToken f12192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f12193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f12194m;

    public i(String str, Field field, boolean z3, boolean z4, boolean z5, Method method, boolean z6, p pVar, d dVar, TypeToken typeToken, boolean z7, boolean z8) {
        this.f12188f = z5;
        this.g = method;
        this.f12189h = z6;
        this.f12190i = pVar;
        this.f12191j = dVar;
        this.f12192k = typeToken;
        this.f12193l = z7;
        this.f12194m = z8;
        this.f12184a = str;
        this.f12185b = field;
        this.f12186c = field.getName();
        this.f12187d = z3;
        this.e = z4;
    }

    public final void a(b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.f12187d) {
            Field field = this.f12185b;
            boolean z3 = this.f12188f;
            Method method = this.g;
            if (z3) {
                if (method == null) {
                    m.b(obj, field);
                } else {
                    m.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new g(a.z("Accessor ", c.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            bVar.p(this.f12184a);
            boolean z4 = this.f12189h;
            p nVar = this.f12190i;
            if (!z4) {
                nVar = new n(this.f12191j, nVar, this.f12192k.getType());
            }
            nVar.b(bVar, objInvoke);
        }
    }
}

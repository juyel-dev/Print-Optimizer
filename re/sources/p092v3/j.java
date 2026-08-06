package p092v3;

import B3.o;
import F3.d;
import G3.a;
import O3.e;
import X3.InterfaceC0200y;
import android.content.SharedPreferences;
import android.util.Log;
import g4.p;
import g4.s;
import g4.t;
import g4.x;
import h4.b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends H3.j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f13539o;
    public final /* synthetic */ SharedPreferences p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, SharedPreferences sharedPreferences, String str2, d dVar) {
        super(2, dVar);
        this.f13539o = str;
        this.p = sharedPreferences;
        this.q = str2;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new j(this.f13539o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        jVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        String str = this.q;
        a aVar = a.f448o;
        o4.d.y(obj);
        try {
            s sVar = new s();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            sVar.a(15L, timeUnit);
            sVar.f11357s = b.b(15L, timeUnit);
            t tVar = new t(sVar);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fcm_token", str);
            jSONObject.put("platform", "android");
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            M0.b bVar = new M0.b();
            bVar.k("https://notescrafter.com/api/notifications/register");
            Pattern pattern = p.f11330d;
            bVar.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
            bVar.c("Authorization", "Bearer ".concat(this.f13539o));
            x xVarF = tVar.a(bVar.d()).f();
            if (xVarF.g()) {
                Log.d("NotesCrafterFCM", "FCM token registered with backend ✓");
                this.p.edit().putString("fcm_token", str).apply();
            } else {
                new Integer(Log.w("NotesCrafterFCM", "FCM token registration failed: " + xVarF.f11402r));
            }
        } catch (Exception e) {
            new Integer(Log.e("NotesCrafterFCM", "FCM token registration error", e));
        }
        return o.f154a;
    }
}

package p092v3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O3.e;
import X3.InterfaceC0200y;
import android.content.SharedPreferences;
import android.util.Log;
import g4.p;
import g4.s;
import g4.t;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f13540o;
    public final /* synthetic */ SharedPreferences p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, SharedPreferences sharedPreferences, String str2, d dVar) {
        super(2, dVar);
        this.f13540o = str;
        this.p = sharedPreferences;
        this.q = str2;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new k(this.f13540o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        kVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        try {
            s sVar = new s();
            sVar.a(10L, TimeUnit.SECONDS);
            t tVar = new t(sVar);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fcm_token", this.q);
            String string = jSONObject.toString();
            kotlin.jvm.internal.o.e(string, "toString(...)");
            b bVar = new b();
            bVar.k("https://notescrafter.com/api/notifications/register");
            Pattern pattern = p.f11330d;
            bVar.i("DELETE", p003a2.a.g(string, p111z2.b.k("application/json")));
            bVar.c("Authorization", "Bearer ".concat(this.f13540o));
            tVar.a(bVar.d()).f();
            this.p.edit().remove("fcm_token").apply();
            Log.d("NotesCrafterFCM", "FCM token unregistered on logout");
        } catch (Exception e) {
            Log.e("NotesCrafterFCM", "FCM unregister error", e);
        }
        return o.f154a;
    }
}

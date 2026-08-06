package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import P0.b;
import X3.A;
import X3.InterfaceC0200y;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.p;
import g4.t;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p042j3.c;
import p087u3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class U0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13113o;
    public final /* synthetic */ PrintOrderViewModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(PrintOrderViewModel printOrderViewModel, d dVar) {
        super(2, dVar);
        this.p = printOrderViewModel;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new U0(this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f13113o;
        if (i5 == 0) {
            o4.d.y(obj);
            this.f13113o = 1;
            if (A.g(2000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        PrintOrderViewModel printOrderViewModel = this.p;
        Iterable iterable = (Iterable) printOrderViewModel.g.getValue();
        ArrayList<m> arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            m mVar = (m) obj2;
            if (mVar.getR2FileKey() != null && kotlin.jvm.internal.o.b(mVar.getUploadStatus(), "success")) {
                arrayList.add(obj2);
            }
        }
        for (m item : arrayList) {
            b bVar = new b(item, 1);
            C2117x c2117x = printOrderViewModel.f10891c;
            c2117x.getClass();
            kotlin.jvm.internal.o.f(item, "item");
            String r2FileKey = item.getR2FileKey();
            if (r2FileKey == null) {
                Throwable thA = k.a(o4.d.d(new Exception("No R2 file key")));
                if (thA != null) {
                    Log.e("PrintOrderViewModel", "Failed to sync draft " + item.getId() + " to cloud", thA);
                }
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("r2_file_key", r2FileKey);
                    String fileName = item.getFileName();
                    if (fileName == null) {
                        fileName = "";
                    }
                    jSONObject.put("name", fileName);
                    jSONObject.put("notebook_name", item.getName());
                    jSONObject.put("pages", item.getPages());
                    jSONObject.put("copies", item.getCopies());
                    jSONObject.put("color_mode", item.getColor() == p087u3.j.COLOR ? "color" : "bw");
                    jSONObject.put("duplex_mode", item.getDuplex() == p087u3.k.SINGLE ? "single" : "double");
                    jSONObject.put("paper_size", item.getSize());
                    jSONObject.put("binding_type", item.getBinding());
                    String string = jSONObject.toString();
                    kotlin.jvm.internal.o.e(string, "toString(...)");
                    M0.b bVarC = c2117x.c("https://notescrafter.com/api/print/drafts");
                    Pattern pattern = p.f11330d;
                    bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
                    ((t) c2117x.q).a(bVarC.d()).e(new c(bVar, 29));
                } catch (Exception e) {
                    Throwable thA2 = k.a(o4.d.d(e));
                    if (thA2 != null) {
                        Log.e("PrintOrderViewModel", "Failed to sync draft " + item.getId() + " to cloud", thA2);
                    }
                }
            }
        }
        return o.f154a;
    }
}

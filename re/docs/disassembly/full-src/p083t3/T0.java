package p083t3;

import B3.o;
import C3.u;
import C3.v;
import C3.w;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.T;
import androidx.compose.ui.graphics.Fields;
import com.notescrafter.PrintOrderViewModel;
import java.util.ArrayList;
import java.util.List;
import p087u3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class T0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13109o;
    public final /* synthetic */ List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(PrintOrderViewModel printOrderViewModel, List list, d dVar) {
        super(2, dVar);
        this.f13109o = printOrderViewModel;
        this.p = list;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new T0(this.f13109o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        T0 t5 = (T0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        t5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        T t = this.f13109o.g;
        Iterable iterable = (Iterable) t.getValue();
        ArrayList arrayList = new ArrayList(w.Y(iterable));
        int i5 = 0;
        for (Object obj2 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                v.X();
                throw null;
            }
            m mVarCopy = (m) obj2;
            Long l5 = (Long) u.s0(i5, this.p);
            if (l5 != null) {
                mVarCopy = mVarCopy.copy((55295 & 1) != 0 ? mVarCopy.id : null, (55295 & 2) != 0 ? mVarCopy.name : null, (55295 & 4) != 0 ? mVarCopy.pages : 0, (55295 & 8) != 0 ? mVarCopy.color : null, (55295 & 16) != 0 ? mVarCopy.duplex : null, (55295 & 32) != 0 ? mVarCopy.size : null, (55295 & 64) != 0 ? mVarCopy.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? mVarCopy.copies : 0, (55295 & Fields.RotationX) != 0 ? mVarCopy.fileName : null, (55295 & Fields.RotationY) != 0 ? mVarCopy.previewUri : null, (55295 & Fields.RotationZ) != 0 ? mVarCopy.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? mVarCopy.uploadStatus : null, (55295 & Fields.TransformOrigin) != 0 ? mVarCopy.uploadProgress : 0, (55295 & Fields.Shape) != 0 ? mVarCopy.uploadError : null, (55295 & Fields.Clip) != 0 ? mVarCopy.pricePaise : l5, (55295 & Fields.CompositingStrategy) != 0 ? mVarCopy.localPath : null);
            }
            arrayList.add(mVarCopy);
            i5 = i6;
        }
        t.getClass();
        t.j(null, arrayList);
        return o.f154a;
    }
}

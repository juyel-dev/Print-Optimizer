package p102x3;

import B3.h;
import B3.o;
import O3.e;
import Q3.a;
import android.graphics.RectF;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntSize;

/* JADX INFO: renamed from: x3.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2492h4 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15142o = 1;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15144s;

    public /* synthetic */ C2492h4(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.p = mutableState;
        this.q = mutableState2;
        this.f15143r = mutableState3;
        this.f15144s = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        RectF rectF;
        switch (this.f15142o) {
            case 0:
                Offset offset = (Offset) obj2;
                ((PointerInputChange) obj).consume();
                PointerInputScope pointerInputScope = (PointerInputScope) this.f15144s;
                float fM6573getWidthimpl = IntSize.m6573getWidthimpl(pointerInputScope.mo341getSizeYbymL2g());
                float fM6572getHeightimpl = IntSize.m6572getHeightimpl(pointerInputScope.mo341getSizeYbymL2g());
                if (fM6573getWidthimpl > 0.0f && fM6572getHeightimpl > 0.0f) {
                    float fM3686getXimpl = Offset.m3686getXimpl(offset.m3696unboximpl()) / fM6573getWidthimpl;
                    float fM3687getYimpl = Offset.m3687getYimpl(offset.m3696unboximpl()) / fM6572getHeightimpl;
                    int iOrdinal = ((EnumC2454ee) this.p.getValue()).ordinal();
                    MutableState mutableState = this.q;
                    if (iOrdinal == 1) {
                        RectF rectF2 = (RectF) mutableState.getValue();
                        if (rectF2 != null) {
                            mutableState.setValue(new RectF(rectF2.left, rectF2.top, a.q(rectF2.right + fM3686getXimpl, 0.0f, 1.0f), a.q(rectF2.bottom + fM3687getYimpl, 0.0f, 1.0f)));
                        }
                    } else if (iOrdinal == 2) {
                        RectF rectF3 = (RectF) mutableState.getValue();
                        if (rectF3 != null) {
                            float fQ = a.q(rectF3.left + fM3686getXimpl, 0.0f, a.n(1.0f - rectF3.width(), 0.0f));
                            float fQ2 = a.q(rectF3.top + fM3687getYimpl, 0.0f, a.n(1.0f - rectF3.height(), 0.0f));
                            mutableState.setValue(new RectF(fQ, fQ2, rectF3.width() + fQ, rectF3.height() + fQ2));
                        }
                    } else if (iOrdinal == 3 && (rectF = (RectF) mutableState.getValue()) != null) {
                        float fQ3 = rectF.left;
                        float fQ4 = rectF.top;
                        float fQ5 = rectF.right;
                        float fQ6 = rectF.bottom;
                        int iOrdinal2 = ((Z3) this.f15143r.getValue()).ordinal();
                        if (iOrdinal2 == 1) {
                            fQ3 = a.q(fQ3 + fM3686getXimpl, 0.0f, a.n(fQ5 - 0.02f, 0.0f));
                            fQ4 = a.q(fQ4 + fM3687getYimpl, 0.0f, a.n(fQ6 - 0.02f, 0.0f));
                        } else if (iOrdinal2 == 2) {
                            fQ5 = a.q(fQ5 + fM3686getXimpl, a.o(fQ3 + 0.02f, 1.0f), 1.0f);
                            fQ4 = a.q(fQ4 + fM3687getYimpl, 0.0f, a.n(fQ6 - 0.02f, 0.0f));
                        } else if (iOrdinal2 == 3) {
                            fQ3 = a.q(fQ3 + fM3686getXimpl, 0.0f, a.n(fQ5 - 0.02f, 0.0f));
                            fQ6 = a.q(fQ6 + fM3687getYimpl, a.o(0.02f + fQ4, 1.0f), 1.0f);
                        } else if (iOrdinal2 == 4) {
                            fQ5 = a.q(fQ5 + fM3686getXimpl, a.o(fQ3 + 0.02f, 1.0f), 1.0f);
                            fQ6 = a.q(fQ6 + fM3687getYimpl, a.o(0.02f + fQ4, 1.0f), 1.0f);
                        }
                        mutableState.setValue(new RectF(fQ3, fQ4, fQ5, fQ6));
                    }
                }
                break;
            default:
                h hVar = (h) obj;
                String str = (String) obj2;
                this.p.setValue(Boolean.FALSE);
                if (hVar != null) {
                    this.q.setValue((String) hVar.f148o);
                    this.f15143r.setValue((String) hVar.p);
                } else {
                    if (str == null) {
                        str = "Invalid pincode";
                    }
                    ((MutableState) this.f15144s).setValue(str);
                }
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2492h4(PointerInputScope pointerInputScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f15144s = pointerInputScope;
        this.p = mutableState;
        this.q = mutableState2;
        this.f15143r = mutableState3;
    }
}

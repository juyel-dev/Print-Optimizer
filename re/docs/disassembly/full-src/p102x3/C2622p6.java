package p102x3;

import B3.o;
import F3.g;
import F3.h;
import O3.e;
import Q3.a;
import X3.C0176b0;
import X3.InterfaceC0178c0;
import X3.InterfaceC0188l;
import X3.l0;
import android.graphics.RectF;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Fields;
import b4.u;
import c4.r;
import p087u3.q;

/* JADX INFO: renamed from: x3.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2622p6 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15404o;
    public final /* synthetic */ Object p;

    public /* synthetic */ C2622p6(Object obj, int i5) {
        this.f15404o = i5;
        this.p = obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15404o) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                MutableState mutableState = (MutableState) this.p;
                float fWidth = ((RectF) mutableState.getValue()).width();
                float fHeight = ((RectF) mutableState.getValue()).height();
                float fQ = a.q(((RectF) mutableState.getValue()).left + fFloatValue, 0.0f, 1.0f - fWidth);
                float fQ2 = a.q(((RectF) mutableState.getValue()).top + fFloatValue2, 0.0f, 1.0f - fHeight);
                mutableState.setValue(new RectF(fQ, fQ2, fWidth + fQ, fHeight + fQ2));
                return o.f154a;
            case 1:
                String city = (String) obj;
                String state = (String) obj2;
                kotlin.jvm.internal.o.f(city, "city");
                kotlin.jvm.internal.o.f(state, "state");
                MutableState mutableState2 = (MutableState) this.p;
                q qVar = (q) mutableState2.getValue();
                mutableState2.setValue(qVar.copy((12287 & 1) != 0 ? qVar.firstName : null, (12287 & 2) != 0 ? qVar.lastName : null, (12287 & 4) != 0 ? qVar.fullName : null, (12287 & 8) != 0 ? qVar.flatHouse : null, (12287 & 16) != 0 ? qVar.areaStreet : null, (12287 & 32) != 0 ? qVar.landmark : null, (12287 & 64) != 0 ? qVar.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar.city : city, (12287 & Fields.RotationX) != 0 ? qVar.state : state, (12287 & Fields.RotationY) != 0 ? qVar.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar.shippingAddressId : null));
                return o.f154a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                g gVar = (g) obj2;
                h key = gVar.getKey();
                g gVar2 = ((u) this.p).p.get(key);
                if (key == C0176b0.f1783o) {
                    InterfaceC0178c0 interfaceC0178c0 = (InterfaceC0178c0) gVar2;
                    InterfaceC0178c0 parent = (InterfaceC0178c0) gVar;
                    while (true) {
                        if (parent == null) {
                            parent = null;
                        } else if (parent != interfaceC0178c0 && (parent instanceof r)) {
                            InterfaceC0188l interfaceC0188l = (InterfaceC0188l) l0.p.get((r) parent);
                            parent = interfaceC0188l != null ? interfaceC0188l.getParent() : null;
                        }
                    }
                    if (parent != interfaceC0178c0) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC0178c0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (interfaceC0178c0 != null) {
                        iIntValue++;
                    }
                } else if (gVar != gVar2) {
                    iIntValue = Integer.MIN_VALUE;
                } else {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
        }
    }
}

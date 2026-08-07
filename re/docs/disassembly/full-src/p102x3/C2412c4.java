package p102x3;

import B3.o;
import C3.u;
import O3.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import com.razorpay.AppSignatureHelper;
import java.util.List;
import p087u3.h;

/* JADX INFO: renamed from: x3.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2412c4 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14859o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ C2412c4(int i5, MutableState mutableState, MutableState mutableState2) {
        this.f14859o = i5;
        this.p = mutableState;
        this.q = mutableState2;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14859o) {
            case 0:
                MutableState mutableState = this.p;
                if (!((List) mutableState.getValue()).isEmpty()) {
                    h hVar = (h) u.w0((List) mutableState.getValue());
                    mutableState.setValue(u.o0((List) mutableState.getValue()));
                    MutableState mutableState2 = this.q;
                    mutableState2.setValue(u.A0((List) mutableState2.getValue(), hVar));
                }
                break;
            case 1:
                MutableState mutableState3 = this.p;
                if (!((List) mutableState3.getValue()).isEmpty()) {
                    h hVar2 = (h) u.w0((List) mutableState3.getValue());
                    mutableState3.setValue(u.o0((List) mutableState3.getValue()));
                    MutableState mutableState4 = this.q;
                    mutableState4.setValue(u.A0((List) mutableState4.getValue(), hVar2));
                }
                break;
            case 2:
                this.p.setValue(Boolean.FALSE);
                this.q.setValue(null);
                break;
            case 3:
                this.p.setValue(EnumC2454ee.f14979o);
                this.q.setValue(Z3.f14726o);
                break;
            case 4:
                this.p.setValue(null);
                this.q.setValue(null);
                break;
            case 5:
                this.p.setValue(null);
                this.q.setValue(null);
                break;
            case 6:
                this.p.setValue(null);
                this.q.setValue(null);
                break;
            case 7:
                this.p.setValue(Boolean.FALSE);
                this.q.setValue(null);
                break;
            case 8:
                this.p.setValue(null);
                this.q.setValue(null);
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                this.p.setValue(Boolean.FALSE);
                this.q.setValue("");
                break;
            case 10:
                this.p.setValue(Boolean.FALSE);
                this.q.setValue(null);
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                this.p.setValue("list");
                Gd.v(this.q, true);
                break;
            case Matrix.TranslateX /* 12 */:
                this.p.setValue(null);
                Gd.w(this.q, true);
                break;
            default:
                this.p.setValue(null);
                Gd.w(this.q, true);
                break;
        }
        return o.f154a;
    }
}

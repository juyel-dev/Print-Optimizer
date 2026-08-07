package p102x3;

import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import com.razorpay.AppSignatureHelper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Bb implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13819o;
    public final /* synthetic */ MutableState p;

    public /* synthetic */ Bb(int i5, MutableState mutableState) {
        this.f13819o = i5;
        this.p = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        o oVar = o.f154a;
        MutableState mutableState = this.p;
        switch (this.f13819o) {
            case 0:
                mutableState.setValue(null);
                return oVar;
            case 1:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return oVar;
            case 2:
                List list = AbstractC2452ec.f14975a;
                mutableState.setValue("confirmed");
                return oVar;
            case 3:
                List list2 = AbstractC2452ec.f14975a;
                mutableState.setValue("drafts");
                return oVar;
            case 4:
                return Integer.valueOf(((List) mutableState.getValue()).size() + 1);
            case 5:
                Gd.v(mutableState, false);
                return oVar;
            case 6:
                Gd.w(mutableState, false);
                return oVar;
            case 7:
                List list3 = Kd.f14143a;
                mutableState.setValue("bw");
                return oVar;
            case 8:
                List list4 = Kd.f14143a;
                mutableState.setValue("color");
                return oVar;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                mutableState.setValue(null);
                return oVar;
            case 10:
                mutableState.setValue(null);
                return oVar;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                List list5 = Ee.f13941a;
                mutableState.setValue(Boolean.TRUE);
                return oVar;
            case Matrix.TranslateX /* 12 */:
                mutableState.setValue(Boolean.TRUE);
                return oVar;
            case Matrix.TranslateY /* 13 */:
                mutableState.setValue(Boolean.FALSE);
                return oVar;
            case Matrix.TranslateZ /* 14 */:
                mutableState.setValue(Boolean.TRUE);
                return oVar;
            case 15:
                mutableState.setValue(Boolean.TRUE);
                return oVar;
            default:
                mutableState.setValue(Boolean.FALSE);
                return oVar;
        }
    }
}

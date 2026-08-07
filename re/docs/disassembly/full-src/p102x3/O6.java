package p102x3;

import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.razorpay.AppSignatureHelper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O6 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14255o;
    public final /* synthetic */ MutableState p;

    public /* synthetic */ O6(int i5, MutableState mutableState) {
        this.f14255o = i5;
        this.p = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14255o) {
            case 0:
                this.p.setValue(null);
                return o.f154a;
            case 1:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case 2:
                this.p.setValue(null);
                return o.f154a;
            case 3:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case 4:
                return (String) this.p.getValue();
            case 5:
                return (String) this.p.getValue();
            case 6:
                return (String) this.p.getValue();
            case 7:
                return (String) this.p.getValue();
            case 8:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case 10:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                this.p.setValue(null);
                return o.f154a;
            case Matrix.TranslateX /* 12 */:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case Matrix.TranslateY /* 13 */:
                this.p.setValue(null);
                return o.f154a;
            case Matrix.TranslateZ /* 14 */:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case 15:
                this.p.setValue(null);
                return o.f154a;
            case 16:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case 17:
                MutableState mutableState = this.p;
                mutableState.setValue(Boolean.valueOf(!Ja.d(mutableState)));
                return o.f154a;
            case 18:
                this.p.setValue(Boolean.FALSE);
                return o.f154a;
            case 19:
                this.p.setValue(Boolean.FALSE);
                return o.f154a;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                this.p.setValue(Boolean.TRUE);
                return o.f154a;
            case 21:
                this.p.setValue(Boolean.TRUE);
                return o.f154a;
            case 22:
                this.p.setValue(null);
                return o.f154a;
            case 23:
                this.p.setValue(Boolean.FALSE);
                return o.f154a;
            case 24:
                this.p.setValue(null);
                return o.f154a;
            case 25:
                this.p.setValue(Boolean.FALSE);
                return o.f154a;
            case 26:
                this.p.setValue(null);
                return o.f154a;
            case 27:
                MutableState mutableState2 = this.p;
                mutableState2.setValue(Integer.valueOf((((Number) mutableState2.getValue()).intValue() + 2) % 3));
                return o.f154a;
            case 28:
                MutableState mutableState3 = this.p;
                mutableState3.setValue(Integer.valueOf((((Number) mutableState3.getValue()).intValue() + 1) % 3));
                return o.f154a;
            default:
                this.p.setValue(null);
                return o.f154a;
        }
    }
}

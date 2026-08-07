package p083t3;

import A2.t;
import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.razorpay.AppSignatureHelper;
import p102x3.B6;
import p102x3.EnumC2380a4;
import p102x3.EnumC2422ce;
import p102x3.EnumC2604o4;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13027o;
    public final /* synthetic */ MutableState p;

    public /* synthetic */ I(int i5, MutableState mutableState) {
        this.f13027o = i5;
        this.p = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        EnumC2422ce enumC2422ce;
        switch (this.f13027o) {
            case 0:
                this.p.setValue("contact-us");
                return o.f154a;
            case 1:
                this.p.setValue("how-to-print");
                return o.f154a;
            case 2:
                this.p.setValue("print-order-shipping");
                return o.f154a;
            case 3:
                this.p.setValue("how-to-print");
                return o.f154a;
            case 4:
                this.p.setValue("how-to-print");
                return o.f154a;
            case 5:
                this.p.setValue("how-to-print");
                return o.f154a;
            case 6:
                this.p.setValue("settings");
                return o.f154a;
            case 7:
                this.p.setValue("settings");
                return o.f154a;
            case 8:
                this.p.setValue("settings");
                return o.f154a;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                this.p.setValue("community");
                return o.f154a;
            case 10:
                this.p.setValue(null);
                return o.f154a;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                this.p.setValue(null);
                return o.f154a;
            case Matrix.TranslateX /* 12 */:
                this.p.setValue(Boolean.TRUE);
                return o.f154a;
            case Matrix.TranslateY /* 13 */:
                this.p.setValue(Boolean.FALSE);
                return o.f154a;
            case Matrix.TranslateZ /* 14 */:
                this.p.setValue(null);
                return o.f154a;
            case 15:
                this.p.setValue(null);
                return o.f154a;
            case 16:
                this.p.setValue(EnumC2604o4.f15367o);
                return o.f154a;
            case 17:
                this.p.setValue(EnumC2604o4.p);
                return o.f154a;
            case 18:
                this.p.setValue(EnumC2380a4.f14770o);
                return o.f154a;
            case 19:
                this.p.setValue(EnumC2380a4.p);
                return o.f154a;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                this.p.setValue(Boolean.TRUE);
                return o.f154a;
            case 21:
                this.p.setValue(Boolean.FALSE);
                return o.f154a;
            case 22:
                MutableState mutableState = this.p;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return o.f154a;
            case 23:
                this.p.setValue(Boolean.TRUE);
                return o.f154a;
            case 24:
                this.p.setValue(Boolean.FALSE);
                return o.f154a;
            case 25:
                this.p.setValue("");
                return o.f154a;
            case 26:
                return Float.valueOf(((Number) this.p.getValue()).floatValue());
            case 27:
                MutableState mutableState2 = this.p;
                int iOrdinal = ((EnumC2422ce) mutableState2.getValue()).ordinal();
                if (iOrdinal == 0) {
                    enumC2422ce = EnumC2422ce.p;
                } else if (iOrdinal == 1) {
                    enumC2422ce = EnumC2422ce.q;
                } else {
                    if (iOrdinal != 2) {
                        throw new t();
                    }
                    enumC2422ce = EnumC2422ce.f14895o;
                }
                mutableState2.setValue(enumC2422ce);
                return o.f154a;
            case 28:
                this.p.setValue(B6.f13795o);
                return o.f154a;
            default:
                this.p.setValue(B6.p);
                return o.f154a;
        }
    }
}

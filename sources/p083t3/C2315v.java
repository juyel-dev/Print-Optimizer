package p083t3;

import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.razorpay.AppSignatureHelper;

/* JADX INFO: renamed from: t3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2315v implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13219o;
    public final /* synthetic */ MutableState p;

    public /* synthetic */ C2315v(int i5, MutableState mutableState) {
        this.f13219o = i5;
        this.p = mutableState;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13219o) {
            case 0:
                this.p.setValue("print-order-upload");
                break;
            case 1:
                this.p.setValue("print-order-upload");
                break;
            case 2:
                this.p.setValue("help");
                break;
            case 3:
                this.p.setValue("live-chat");
                break;
            case 4:
                this.p.setValue("contact-us");
                break;
            case 5:
                this.p.setValue("dashboard");
                break;
            case 6:
                this.p.setValue("pomodoro-setup");
                break;
            case 7:
                this.p.setValue("tools");
                break;
            case 8:
                this.p.setValue("tools");
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                this.p.setValue("tools");
                break;
            case 10:
                this.p.setValue("tools");
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                this.p.setValue("contact-us");
                break;
            case Matrix.TranslateX /* 12 */:
                this.p.setValue("tools");
                break;
            case Matrix.TranslateY /* 13 */:
                this.p.setValue("tools");
                break;
            case Matrix.TranslateZ /* 14 */:
                this.p.setValue("tools");
                break;
            case 15:
                this.p.setValue("tools");
                break;
            case 16:
                this.p.setValue("tools");
                break;
            case 17:
                this.p.setValue("how-to-print");
                break;
            case 18:
                this.p.setValue("tools");
                break;
            case 19:
                this.p.setValue("how-to-print");
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                this.p.setValue("print-price-calculator");
                break;
            case 21:
                this.p.setValue(null);
                break;
            case 22:
                this.p.setValue("my-orders");
                break;
            case 23:
                this.p.setValue("contact-us");
                break;
            case 24:
                this.p.setValue("how-to-print");
                break;
            case 25:
                this.p.setValue("how-to-print");
                break;
            case 26:
                this.p.setValue("print-order-shipping");
                break;
            case 27:
                this.p.setValue("how-to-print");
                break;
            case 28:
                this.p.setValue("print-order-upload");
                break;
            default:
                this.p.setValue("print-order-checkout");
                break;
        }
        return o.f154a;
    }
}

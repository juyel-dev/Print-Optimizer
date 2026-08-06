package p083t3;

import B3.o;
import O3.a;
import androidx.compose.ui.graphics.Matrix;
import com.notescrafter.utils.AnalyticsManager;
import com.razorpay.AppSignatureHelper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13089o;
    public final /* synthetic */ a p;

    public /* synthetic */ O(int i5, a aVar) {
        this.f13089o = i5;
        this.p = aVar;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13089o) {
            case 0:
                this.p.invoke();
                break;
            case 1:
                this.p.invoke();
                break;
            case 2:
                this.p.invoke();
                break;
            case 3:
                this.p.invoke();
                break;
            case 4:
                this.p.invoke();
                break;
            case 5:
                this.p.invoke();
                break;
            case 6:
                this.p.invoke();
                break;
            case 7:
                this.p.invoke();
                break;
            case 8:
                this.p.invoke();
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                this.p.invoke();
                break;
            case 10:
                this.p.invoke();
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                this.p.invoke();
                break;
            case Matrix.TranslateX /* 12 */:
                this.p.invoke();
                break;
            case Matrix.TranslateY /* 13 */:
                this.p.invoke();
                break;
            case Matrix.TranslateZ /* 14 */:
                this.p.invoke();
                break;
            case 15:
                this.p.invoke();
                break;
            case 16:
                this.p.invoke();
                break;
            case 17:
                this.p.invoke();
                break;
            case 18:
                AnalyticsManager.INSTANCE.logCtaClick("Print_Deliver_CTA", "Success_Screen");
                this.p.invoke();
                break;
            default:
                this.p.invoke();
                break;
        }
        return o.f154a;
    }
}

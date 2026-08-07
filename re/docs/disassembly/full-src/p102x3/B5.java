package p102x3;

import B3.o;
import O3.a;
import O3.c;
import androidx.compose.ui.graphics.Matrix;
import com.notescrafter.utils.AnalyticsManager;
import com.razorpay.AppSignatureHelper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B5 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13794o;
    public final /* synthetic */ c p;

    public /* synthetic */ B5(c cVar, int i5) {
        this.f13794o = i5;
        this.p = cVar;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13794o) {
            case 0:
                this.p.invoke("contact-us");
                break;
            case 1:
                this.p.invoke(Float.valueOf(0.95f));
                break;
            case 2:
                this.p.invoke(Float.valueOf(1.05f));
                break;
            case 3:
                AnalyticsManager.INSTANCE.logCtaClick("Community_Pass", "Settings_Screen");
                this.p.invoke("community-pass");
                break;
            case 4:
                AnalyticsManager.INSTANCE.logCtaClick("My_Addresses", "Settings_Screen");
                this.p.invoke("my-addresses");
                break;
            case 5:
                AnalyticsManager.INSTANCE.logCtaClick("Features", "Settings_Screen");
                this.p.invoke("features");
                break;
            case 6:
                AnalyticsManager.INSTANCE.logCtaClick("My_Downloads", "Settings_Screen");
                this.p.invoke("downloads");
                break;
            case 7:
                AnalyticsManager.INSTANCE.logCtaClick("How_To_Print", "Settings_Screen");
                this.p.invoke("how-to-print");
                break;
            case 8:
                AnalyticsManager.INSTANCE.logCtaClick("About_Us", "Settings_Screen");
                this.p.invoke("about-us");
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                AnalyticsManager.INSTANCE.logCtaClick("Community", "Settings_Screen");
                this.p.invoke("community");
                break;
            case 10:
                AnalyticsManager.INSTANCE.logCtaClick("Help_Center", "Settings_Screen");
                this.p.invoke("help");
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                AnalyticsManager.INSTANCE.logCtaClick("Contact_Us", "Settings_Screen");
                this.p.invoke("contact-us");
                break;
            case Matrix.TranslateX /* 12 */:
                AnalyticsManager.INSTANCE.logCtaClick("Privacy_Policy", "Settings_Screen");
                this.p.invoke("privacy-policy");
                break;
            case Matrix.TranslateY /* 13 */:
                AnalyticsManager.INSTANCE.logCtaClick("Terms_Of_Service", "Settings_Screen");
                this.p.invoke("terms-of-service");
                break;
            case Matrix.TranslateZ /* 14 */:
                AnalyticsManager.INSTANCE.logCtaClick("Refund_Policy", "Settings_Screen");
                this.p.invoke("refund-policy");
                break;
            default:
                AnalyticsManager.INSTANCE.logCtaClick("Shipping_Policy", "Settings_Screen");
                this.p.invoke("shipping-policy");
                break;
        }
        return o.f154a;
    }
}

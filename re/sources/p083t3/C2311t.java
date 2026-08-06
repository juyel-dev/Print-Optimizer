package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.notescrafter.utils.AnalyticsManager;

/* JADX INFO: renamed from: t3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2311t extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f13215o;
    public final /* synthetic */ State p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2311t(MutableState mutableState, State state, d dVar) {
        super(2, dVar);
        this.f13215o = mutableState;
        this.p = state;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2311t(this.f13215o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2311t c2311t = (C2311t) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2311t.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        String strH;
        a aVar = a.f448o;
        o4.d.y(obj);
        MutableState mutableState = this.f13215o;
        switch ((String) mutableState.getValue()) {
            case "refund-policy":
                strH = "Refund_Policy_Screen";
                break;
            case "how-to-print":
                strH = "How_Print_Screen";
                break;
            case "community":
                strH = "Community_Screen";
                break;
            case "privacy-policy":
                strH = "Privacy_Policy_Screen";
                break;
            case "features":
                strH = "Features_Screen";
                break;
            case "help":
                strH = "Help_Center_Screen";
                break;
            case "home":
                State state = this.p;
                switch (S.c(state)) {
                    case -1:
                        strH = "Downloads_Screen";
                        break;
                    case 0:
                        strH = "Landing_Screen";
                        break;
                    case 1:
                        strH = "Upload_Screen";
                        break;
                    case 2:
                        strH = "Reorder_Screen";
                        break;
                    case 3:
                        strH = "Preview_Screen";
                        break;
                    case 4:
                        strH = "Enhance_Screen";
                        break;
                    case 5:
                        strH = "Processing_Screen";
                        break;
                    case 6:
                        strH = "Success_Screen";
                        break;
                    default:
                        strH = AbstractC1421mz.h(S.c(state), "Unknown_Step_");
                        break;
                }
            case "contact-us":
                strH = "Contact_Us_Screen";
                break;
            case "terms-of-service":
                strH = "Terms_Service_Screen";
                break;
            case "shipping-policy":
                strH = "Shipping_Policy_Screen";
                break;
            case "pomodoro-setup":
                strH = "Pomodoro_Setup_Screen";
                break;
            case "pomodoro-timer":
                strH = "Pomodoro_Timer_Screen";
                break;
            case "settings":
                strH = "Settings_Screen";
                break;
            case "about-us":
                strH = "About_Us_Screen";
                break;
            default:
                strH = (String) mutableState.getValue();
                break;
        }
        AnalyticsManager.INSTANCE.logScreenView(strH);
        return o.f154a;
    }
}

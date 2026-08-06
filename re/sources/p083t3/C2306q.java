package p083t3;

import B3.o;
import O3.a;
import O3.c;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.RectF;
import android.widget.Toast;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.utils.AnalyticsManager;
import com.notescrafter.utils.ExamItem;
import com.notescrafter.utils.ToDoItem;
import com.notescrafter.utils.ToDoManager;
import com.razorpay.AppSignatureHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p036i2.e;
import p087u3.d;
import p087u3.i;
import p087u3.q;
import p087u3.v;
import p102x3.AbstractC2595nb;
import p102x3.AbstractC2642qa;
import p102x3.B6;

/* JADX INFO: renamed from: t3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2306q implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13208o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13209r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2306q(Object obj, Object obj2, Object obj3, int i5) {
        this.f13208o = i5;
        this.p = obj;
        this.q = obj2;
        this.f13209r = obj3;
    }

    /* JADX DEBUG: Class process forced to load method for inline: u3.e.copy$default(u3.e, u3.d, u3.a, u3.c, int, int, boolean, boolean, int, java.lang.Object):u3.e */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        o oVar = o.f154a;
        Object obj = this.p;
        Object obj2 = this.f13209r;
        Object obj3 = this.q;
        switch (this.f13208o) {
            case 0:
                A.t((InterfaceC0200y) obj, null, null, new r((SnackbarHostState) obj3, (e) obj2, null), 3);
                break;
            case 1:
                d dVar = (d) obj;
                AnalyticsManager.INSTANCE.logCtaClick("Quality_" + dVar.name(), "Enhance_Screen");
                ((c) obj3).invoke(p087u3.e.copy$default((p087u3.e) obj2, dVar, null, null, 0, 0, false, false, 126, null));
                break;
            case 2:
                p087u3.a aVar = (p087u3.a) obj;
                AnalyticsManager.INSTANCE.logCtaClick("Size_" + aVar.name(), "Enhance_Screen");
                ((c) obj3).invoke(p087u3.e.copy$default((p087u3.e) obj2, null, aVar, null, 0, 0, false, false, 125, null));
                break;
            case 3:
                RectF rectF = (RectF) ((MutableState) obj3).getValue();
                String lowerCase = ((B6) ((MutableState) obj2).getValue()).name().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.o.e(lowerCase, "toLowerCase(...)");
                ((O3.e) obj).invoke(rectF, lowerCase);
                break;
            case 4:
                List list = AbstractC2642qa.f15449c;
                MutableState mutableState = (MutableState) obj3;
                List list2 = (List) mutableState.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list2) {
                    if (((ToDoItem) obj4).getId() != ((ToDoItem) obj2).getId()) {
                        arrayList.add(obj4);
                    }
                }
                mutableState.setValue(arrayList);
                ((ToDoManager) obj).saveTasks((List) mutableState.getValue());
                break;
            case 5:
                AbstractC2595nb.e((MutableState) obj3, false);
                ((MutableState) obj2).setValue(Boolean.TRUE);
                Toast.makeText((Context) obj, "OTP sent via WhatsApp!", 0).show();
                break;
            case 6:
                ((MutableState) obj3).setValue((v) obj);
                ((MutableState) obj2).setValue(Boolean.TRUE);
                break;
            case 7:
                String addressId = ((v) obj3).getId();
                Context context = (Context) obj2;
                J j5 = new J(context, 5);
                D d4 = new D(context, 3);
                PrintOrderViewModel printOrderViewModel = (PrintOrderViewModel) obj;
                printOrderViewModel.getClass();
                kotlin.jvm.internal.o.f(addressId, "addressId");
                p019e0.a aVarH = Q.h(printOrderViewModel);
                e4.e eVar = H.f1766a;
                A.t(aVarH, e4.d.f11107o, null, new S0(printOrderViewModel, addressId, j5, d4, null), 2);
                break;
            case 8:
                MutableState mutableState2 = (MutableState) obj3;
                String str = (String) mutableState2.getValue();
                mutableState2.setValue(null);
                if (str != null) {
                    Context context2 = (Context) obj2;
                    J j6 = new J(context2, 6);
                    D d5 = new D(context2, 4);
                    PrintOrderViewModel printOrderViewModel2 = (PrintOrderViewModel) obj;
                    printOrderViewModel2.getClass();
                    p019e0.a aVarH2 = Q.h(printOrderViewModel2);
                    e4.e eVar2 = H.f1766a;
                    A.t(aVarH2, e4.d.f11107o, null, new C2295k0(printOrderViewModel2, str, j6, d5, null), 2);
                }
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                q qVar = (q) obj3;
                ((c) obj).invoke(qVar.copy((12287 & 1) != 0 ? qVar.firstName : null, (12287 & 2) != 0 ? qVar.lastName : null, (12287 & 4) != 0 ? qVar.fullName : null, (12287 & 8) != 0 ? qVar.flatHouse : null, (12287 & 16) != 0 ? qVar.areaStreet : null, (12287 & 32) != 0 ? qVar.landmark : null, (12287 & 64) != 0 ? qVar.addressType : (i) obj2, (12287 & Fields.SpotShadowColor) != 0 ? qVar.city : null, (12287 & Fields.RotationX) != 0 ? qVar.state : null, (12287 & Fields.RotationY) != 0 ? qVar.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar.shippingAddressId : null));
                break;
            case 10:
                ((MutableState) obj).setValue("add");
                ((MutableState) obj2).setValue(new q(null, null, null, null, null, null, null, null, null, null, null, ((q) ((State) obj3).getValue()).getPhone(), false, null, 14335, null));
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                ((c) obj).invoke((List) ((MutableState) obj2).getValue());
                ((a) obj3).invoke();
                break;
            default:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : (List) obj3) {
                    if (((ExamItem) obj5).getId() != ((ExamItem) obj2).getId()) {
                        arrayList2.add(obj5);
                    }
                }
                ((c) obj).invoke(arrayList2);
                break;
        }
        return oVar;
    }
}

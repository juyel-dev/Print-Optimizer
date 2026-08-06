package p083t3;

import B3.j;
import B3.k;
import C3.u;
import C3.w;
import O3.c;
import X3.A;
import X3.C0194s;
import a4.T;
import android.util.Log;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.utils.ToDoItem;
import com.notescrafter.utils.ToDoManager;
import com.razorpay.AppSignatureHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import p011c0.d;
import p087u3.b;
import p087u3.g;
import p087u3.m;
import p087u3.q;
import p087u3.v;
import p102x3.AbstractC2642qa;
import p102x3.C2417c9;
import p102x3.C2435db;
import p102x3.J3;
import p102x3.R4;
import p102x3.T9;
import p102x3.V3;
import p102x3.Va;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13018o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13019r;

    public /* synthetic */ F(int i5, MutableState mutableState, MutableState mutableState2, Object obj) {
        this.f13018o = i5;
        this.f13019r = mutableState;
        this.p = obj;
        this.q = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.c
    public final Object invoke(Object obj) {
        int i5 = 1;
        switch (this.f13018o) {
            case 0:
                List newEdits = (List) obj;
                o.f(newEdits, "newEdits");
                List list = (List) ((State) this.q).getValue();
                MutableState mutableState = (MutableState) this.f13019r;
                Integer num = (Integer) mutableState.getValue();
                o.c(num);
                g gVar = (g) list.get(num.intValue());
                Integer num2 = (Integer) mutableState.getValue();
                o.c(num2);
                int iIntValue = num2.intValue();
                g updatedPage = g.copy$default(gVar, 0, null, false, null, 0, newEdits, null, 95, null);
                Y y4 = (Y) this.p;
                o.f(updatedPage, "updatedPage");
                T t = y4.f13128i;
                ArrayList arrayListJ0 = u.J0((Collection) t.getValue());
                if (iIntValue >= 0 && iIntValue < arrayListJ0.size()) {
                    arrayListJ0.set(iIntValue, updatedPage);
                    t.j(null, arrayListJ0);
                }
                mutableState.setValue(null);
                break;
            case 1:
                PrintOrderViewModel printOrderViewModel = (PrintOrderViewModel) this.p;
                C2435db c2435db = (C2435db) this.q;
                C2291i0 c2291i0 = (C2291i0) this.f13019r;
                d dVar = PrintOrderViewModel.f10861f0;
                Object obj2 = ((k) obj).f150o;
                if (!(obj2 instanceof j)) {
                    JSONObject jSONObject = (JSONObject) obj2;
                    A.t(Q.h(printOrderViewModel), null, null, new F0(c2435db, printOrderViewModel, jSONObject.getString("orderId").toString(), jSONObject.getString("razorpayOrderId"), jSONObject.optString("rzp_key", ""), jSONObject.optLong("totalAmountPaise", 0L), null), 3);
                }
                Throwable thA = k.a(obj2);
                if (thA != null) {
                    printOrderViewModel.f10895e0 = null;
                    A.t(Q.h(printOrderViewModel), null, null, new G0(c2291i0, thA, null), 3);
                }
                break;
            case 2:
                d dVar2 = PrintOrderViewModel.f10861f0;
                PrintOrderViewModel printOrderViewModel2 = (PrintOrderViewModel) this.p;
                A.t(Q.h(printOrderViewModel2), null, null, new d1((k) obj, printOrderViewModel2, (C2291i0) this.q, (String) this.f13019r, null), 3);
                break;
            case 3:
                d dVar3 = PrintOrderViewModel.f10861f0;
                Object obj3 = ((k) obj).f150o;
                if (!(obj3 instanceof j)) {
                    PrintOrderViewModel printOrderViewModel3 = (PrintOrderViewModel) this.p;
                    A.t(Q.h(printOrderViewModel3), null, null, new C2297l0(printOrderViewModel3, (m) this.q, (File) obj3, null), 3);
                }
                Throwable thA2 = k.a(obj3);
                if (thA2 != null) {
                    Log.e("PrintOrderViewModel", "Failed to download preview PDF ".concat((String) this.f13019r), thA2);
                }
                break;
            case 4:
                PrintOrderViewModel printOrderViewModel4 = (PrintOrderViewModel) this.p;
                A.t(Q.h(printOrderViewModel4), null, null, new I0((k) obj, printOrderViewModel4, (J3) this.q, (C2321y) this.f13019r, null), 3);
                break;
            case 5:
                Object obj4 = ((k) obj).f150o;
                boolean z3 = obj4 instanceof j;
                R4 r4 = (R4) this.f13019r;
                PrintOrderViewModel printOrderViewModel5 = (PrintOrderViewModel) this.p;
                v vVar = (v) this.q;
                if (!z3) {
                    A.t(Q.h(printOrderViewModel5), null, null, new K0(printOrderViewModel5, (List) obj4, vVar, r4, null), 3);
                }
                if (k.a(obj4) != null) {
                    A.t(Q.h(printOrderViewModel5), null, null, new L0(printOrderViewModel5, vVar, r4, null), 3);
                }
                break;
            case 6:
                A.t(Q.h((PrintOrderViewModel) this.p), null, null, new O0((k) obj, (C2306q) this.q, (Va) this.f13019r, null), 3);
                break;
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    ((MutableState) this.f13019r).setValue(Boolean.TRUE);
                } else {
                    b bVar = (b) this.q;
                    ((c) this.p).invoke(bVar.copy((247 & 1) != 0 ? bVar.invertColors : false, (247 & 2) != 0 ? bVar.clearBackground : false, (247 & 4) != 0 ? bVar.grayscale : false, (247 & 8) != 0 ? bVar.blackAndWhite : false, (247 & 16) != 0 ? bVar.backgroundThreshold : 0, (247 & 32) != 0 ? bVar.removeLogo : false, (247 & 64) != 0 ? bVar.logoBox : null, (247 & Fields.SpotShadowColor) != 0 ? bVar.logoShape : null));
                }
                break;
            case 8:
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                o.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                MutableState mutableState2 = (MutableState) this.f13019r;
                List list2 = (List) mutableState2.getValue();
                LazyVerticalGrid.items(list2.size(), null, null, new V3(list2, 3), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C2417c9(list2, mutableState2, (MutableState) this.p, (MutableState) this.q, 0)));
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                List list3 = AbstractC2642qa.f15449c;
                MutableState mutableState3 = (MutableState) this.f13019r;
                List<ToDoItem> list4 = (List) mutableState3.getValue();
                ArrayList arrayList = new ArrayList(w.Y(list4));
                for (ToDoItem toDoItemCopy$default : list4) {
                    if (toDoItemCopy$default.getId() == ((ToDoItem) this.q).getId()) {
                        toDoItemCopy$default = ToDoItem.copy$default(toDoItemCopy$default, 0L, null, zBooleanValue, 3, null);
                    }
                    arrayList.add(toDoItemCopy$default);
                }
                mutableState3.setValue(arrayList);
                ((ToDoManager) this.p).saveTasks((List) mutableState3.getValue());
                break;
            case 10:
                LazyListScope LazyColumn = (LazyListScope) obj;
                o.f(LazyColumn, "$this$LazyColumn");
                List list5 = (List) this.p;
                LazyColumn.items(list5.size(), null, new V3(list5, 9), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new T9(list5, (q) this.q, (c) this.f13019r, i5)));
                break;
            default:
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                o.f(LazyColumn2, "$this$LazyColumn");
                MutableState mutableState4 = (MutableState) this.f13019r;
                List list6 = (List) mutableState4.getValue();
                C0194s c0194s = new C0194s(10);
                LazyColumn2.items(list6.size(), new p035i0.b(4, c0194s, list6), new V3(list6, 12), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C2417c9((c) this.p, mutableState4, (MutableState) this.q, list6)));
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ F(ToDoManager toDoManager, MutableState mutableState, ToDoItem toDoItem) {
        this.f13018o = 9;
        this.p = toDoManager;
        this.f13019r = mutableState;
        this.q = toDoItem;
    }

    public /* synthetic */ F(Object obj, Object obj2, Object obj3, int i5) {
        this.f13018o = i5;
        this.p = obj;
        this.q = obj2;
        this.f13019r = obj3;
    }
}

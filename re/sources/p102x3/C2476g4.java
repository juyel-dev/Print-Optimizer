package p102x3;

import O3.c;
import Q3.a;
import X3.A;
import X3.C0194s;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntSize;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.service.PDFProcessor;
import java.util.List;
import kotlin.jvm.internal.o;
import p035i0.b;

/* JADX INFO: renamed from: x3.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2476g4 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15056o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15058s;
    public final /* synthetic */ Object t;

    public /* synthetic */ C2476g4(Context context, InterfaceC0200y interfaceC0200y, PrintOrderViewModel printOrderViewModel, PDFProcessor pDFProcessor, MutableState mutableState) {
        this.f15056o = 3;
        this.t = context;
        this.q = interfaceC0200y;
        this.f15057r = printOrderViewModel;
        this.f15058s = pDFProcessor;
        this.p = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f15056o) {
            case 0:
                Offset offset = (Offset) obj;
                PointerInputScope pointerInputScope = (PointerInputScope) this.t;
                float fM6573getWidthimpl = IntSize.m6573getWidthimpl(pointerInputScope.mo341getSizeYbymL2g());
                float fM6572getHeightimpl = IntSize.m6572getHeightimpl(pointerInputScope.mo341getSizeYbymL2g());
                if (fM6573getWidthimpl > 0.0f && fM6572getHeightimpl > 0.0f) {
                    float fM3686getXimpl = Offset.m3686getXimpl(offset.m3696unboximpl()) / fM6573getWidthimpl;
                    float fM3687getYimpl = Offset.m3687getYimpl(offset.m3696unboximpl()) / fM6572getHeightimpl;
                    MutableState mutableState = this.p;
                    RectF rectF = (RectF) mutableState.getValue();
                    MutableState mutableState2 = (MutableState) this.q;
                    if (rectF != null) {
                        RectF rectF2 = (RectF) mutableState.getValue();
                        o.c(rectF2);
                        boolean zE = AbstractC2588n4.e(fM3686getXimpl, fM3687getYimpl, rectF2.left, rectF2.top);
                        MutableState mutableState3 = (MutableState) this.f15057r;
                        if (zE) {
                            mutableState2.setValue(EnumC2454ee.f14980r);
                            mutableState3.setValue(Z3.p);
                        } else if (AbstractC2588n4.e(fM3686getXimpl, fM3687getYimpl, rectF2.right, rectF2.top)) {
                            mutableState2.setValue(EnumC2454ee.f14980r);
                            mutableState3.setValue(Z3.q);
                        } else if (AbstractC2588n4.e(fM3686getXimpl, fM3687getYimpl, rectF2.left, rectF2.bottom)) {
                            mutableState2.setValue(EnumC2454ee.f14980r);
                            mutableState3.setValue(Z3.f14727r);
                        } else if (AbstractC2588n4.e(fM3686getXimpl, fM3687getYimpl, rectF2.right, rectF2.bottom)) {
                            mutableState2.setValue(EnumC2454ee.f14980r);
                            mutableState3.setValue(Z3.f14728s);
                        } else if (fM3686getXimpl < rectF2.left || fM3686getXimpl > rectF2.right || fM3687getYimpl < rectF2.top || fM3687getYimpl > rectF2.bottom) {
                            mutableState2.setValue(EnumC2454ee.p);
                            float fQ = a.q(fM3686getXimpl, 0.0f, 1.0f);
                            float fQ2 = a.q(fM3687getYimpl, 0.0f, 1.0f);
                            mutableState.setValue(new RectF(fQ, fQ2, fQ + 0.01f, 0.01f + fQ2));
                            ((MutableState) this.f15058s).setValue(Boolean.TRUE);
                        } else {
                            mutableState2.setValue(EnumC2454ee.q);
                        }
                    } else {
                        mutableState2.setValue(EnumC2454ee.p);
                        float fQ3 = a.q(fM3686getXimpl, 0.0f, 1.0f);
                        float fQ4 = a.q(fM3687getYimpl, 0.0f, 1.0f);
                        mutableState.setValue(new RectF(fQ3, fQ4, fQ3 + 0.01f, 0.01f + fQ4));
                        ((MutableState) this.f15058s).setValue(Boolean.TRUE);
                    }
                }
                break;
            case 1:
                String newVal = (String) obj;
                o.f(newVal, "newVal");
                StringBuilder sb = new StringBuilder();
                int length = newVal.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt = newVal.charAt(i5);
                    if (Character.isDigit(cCharAt) || cCharAt == '.') {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                o.e(string, "toString(...)");
                String str = (String) this.t;
                switch (str.hashCode()) {
                    case 84277:
                        if (str.equals("Top")) {
                            this.p.setValue(string);
                        }
                        break;
                    case 2364455:
                        if (str.equals("Left")) {
                            ((MutableState) this.f15057r).setValue(string);
                        }
                        break;
                    case 78959100:
                        if (str.equals("Right")) {
                            ((MutableState) this.f15058s).setValue(string);
                        }
                        break;
                    case 1995605579:
                        if (str.equals("Bottom")) {
                            ((MutableState) this.q).setValue(string);
                        }
                        break;
                }
                break;
            case 2:
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                o.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                C0194s c0194s = new C0194s(9);
                List list = (List) this.t;
                LazyVerticalGrid.items(list.size(), new b(2, c0194s, list), null, new V3(list, 6), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new W3(list, list, (c) this.f15057r, (c) this.f15058s, this.p, (MutableState) this.q)));
                break;
            default:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    A.t((InterfaceC0200y) this.q, null, null, new Fd((String) this.p.getValue(), (Context) this.t, uri, (PrintOrderViewModel) this.f15057r, (PDFProcessor) this.f15058s, null), 3);
                }
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ C2476g4(Object obj, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i5) {
        this.f15056o = i5;
        this.t = obj;
        this.p = mutableState;
        this.q = mutableState2;
        this.f15057r = mutableState3;
        this.f15058s = mutableState4;
    }

    public /* synthetic */ C2476g4(List list, c cVar, c cVar2, MutableState mutableState, MutableState mutableState2) {
        this.f15056o = 2;
        this.t = list;
        this.f15057r = cVar;
        this.f15058s = cVar2;
        this.p = mutableState;
        this.q = mutableState2;
    }
}

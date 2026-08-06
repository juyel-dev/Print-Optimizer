package p097w3;

import C3.w;
import O3.c;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import p102x3.C2477g5;
import p102x3.V3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13616o;
    public final /* synthetic */ List p;

    public /* synthetic */ g(List list, int i5) {
        this.f13616o = i5;
        this.p = list;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f13616o) {
            case 0:
                DrawScope Canvas = (DrawScope) obj;
                o.f(Canvas, "$this$Canvas");
                float fM3755getWidthimpl = Size.m3755getWidthimpl(Canvas.mo4477getSizeNHjbRc());
                float fM3752getHeightimpl = Size.m3752getHeightimpl(Canvas.mo4477getSizeNHjbRc());
                List list = this.p;
                ArrayList arrayList = new ArrayList(w.Y(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long jM3696unboximpl = ((Offset) it.next()).m3696unboximpl();
                    arrayList.add(Offset.m3675boximpl(OffsetKt.Offset(Offset.m3686getXimpl(jM3696unboximpl) * fM3755getWidthimpl, Offset.m3687getYimpl(jM3696unboximpl) * fM3752getHeightimpl)));
                }
                DrawScope.m4468drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.Companion.m4232getPointsr_lszbg(), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(1)), StrokeCap.Companion.m4280getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                break;
            case 1:
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                o.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                List list2 = this.p;
                LazyVerticalGrid.items(list2.size(), null, null, new V3(list2, 1), ComposableLambdaKt.composableLambdaInstance(699646206, true, new C2477g5(list2, 0)));
                break;
            default:
                LazyListScope LazyRow = (LazyListScope) obj;
                o.f(LazyRow, "$this$LazyRow");
                List list3 = this.p;
                LazyRow.items(list3.size(), null, new V3(list3, 7), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C2477g5(list3, 1)));
                break;
        }
        return B3.o.f154a;
    }
}

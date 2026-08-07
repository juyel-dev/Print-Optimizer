package p102x3;

import B3.h;
import O3.c;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import p107y3.a;

/* JADX INFO: renamed from: x3.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2510i6 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15180o;
    public final /* synthetic */ State p;

    public /* synthetic */ C2510i6(State state, int i5) {
        this.f15180o = i5;
        this.p = state;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f15180o) {
            case 0:
                DrawScope Canvas = (DrawScope) obj;
                o.f(Canvas, "$this$Canvas");
                DrawScope.m4458drawCircleVaOC9Bg$default(Canvas, Color.m3926copywmQWz5c$default(a.f15978a, 0.16f * ((Number) this.p.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), Size.m3754getMinDimensionimpl(Canvas.mo4477getSizeNHjbRc()) / 2, 0L, 0.0f, null, null, 0, 124, null);
                return B3.o.f154a;
            case 1:
                String str = (String) obj;
                if (str == null) {
                    str = "guest";
                }
                h hVar = (h) ((Map) this.p.getValue()).get(str);
                if (hVar == null) {
                    hVar = new h(Double.valueOf(1.25d), Double.valueOf(3.35d));
                }
                return "₹".concat(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{hVar.f148o}, 1)));
            case 2:
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = "guest";
                }
                h hVar2 = (h) ((Map) this.p.getValue()).get(str2);
                if (hVar2 == null) {
                    hVar2 = new h(Double.valueOf(1.25d), Double.valueOf(3.35d));
                }
                return "₹".concat(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{hVar2.p}, 1)));
            default:
                ContentDrawScope drawWithContent = (ContentDrawScope) obj;
                o.f(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                State state = this.p;
                if (((Number) state.getValue()).floatValue() > 0.0f) {
                    float f5 = 2;
                    float fM3752getHeightimpl = Size.m3752getHeightimpl(drawWithContent.mo4477getSizeNHjbRc()) / f5;
                    DrawScope.m4463drawLineNGM6Ib0$default(drawWithContent, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(0.0f, fM3752getHeightimpl), OffsetKt.Offset(((Number) state.getValue()).floatValue() * Size.m3755getWidthimpl(drawWithContent.mo4477getSizeNHjbRc()), fM3752getHeightimpl), drawWithContent.mo349toPx0680j_4(Dp.m6403constructorimpl(f5)), StrokeCap.Companion.m4280getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                }
                return B3.o.f154a;
        }
    }
}

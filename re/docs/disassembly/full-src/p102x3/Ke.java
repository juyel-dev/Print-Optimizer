package p102x3;

import C3.v;
import O3.c;
import O3.f;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Ke implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14144o;

    public Ke(MutableState mutableState) {
        this.f14144o = mutableState;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(208254077, iIntValue, -1, "com.notescrafter.ui.screens.AnalogClock.<anonymous> (ToDoScreen.kt:852)");
            }
            Dp a5 = Dp.m6401boximpl(BoxWithConstraints.mo577getMaxWidthD9Ej5fM());
            Dp b5 = Dp.m6401boximpl(BoxWithConstraints.mo576getMaxHeightD9Ej5fM());
            o.f(a5, "a");
            o.f(b5, "b");
            if (a5.compareTo(b5) > 0) {
                a5 = b5;
            }
            final float fM6417unboximpl = a5.m6417unboximpl();
            Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(Modifier.Companion, fM6417unboximpl);
            composer.startReplaceGroup(-1865613896);
            boolean zChanged = composer.changed(fM6417unboximpl);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState mutableState = this.f14144o;
                objRememberedValue = new c() { // from class: x3.Je
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        DrawScope Canvas = (DrawScope) obj4;
                        o.f(Canvas, "$this$Canvas");
                        float f5 = fM6417unboximpl;
                        float f6 = 2;
                        float fMo349toPx0680j_4 = Canvas.mo349toPx0680j_4(f5) / f6;
                        long jOffset = OffsetKt.Offset(Canvas.mo349toPx0680j_4(f5) / f6, Canvas.mo349toPx0680j_4(f5) / f6);
                        Brush.Companion companion = Brush.Companion;
                        long j5 = jOffset;
                        DrawScope.m4457drawCircleV9BoPsw$default(Canvas, Brush.Companion.m3880radialGradientP_VxKs$default(companion, v.S(Color.m3917boximpl(ColorKt.Color(4280163886L)), Color.m3917boximpl(ColorKt.Color(4278848015L))), jOffset, fMo349toPx0680j_4, 0, 8, (Object) null), fMo349toPx0680j_4, 0L, 0.0f, null, null, 0, 124, null);
                        DrawScope.m4457drawCircleV9BoPsw$default(Canvas, companion.m3892sweepGradientUv8p0NA(v.S(Color.m3917boximpl(ColorKt.Color(4289222135L)), Color.m3917boximpl(ColorKt.Color(4284704497L)), Color.m3917boximpl(ColorKt.Color(4289222135L))), j5), fMo349toPx0680j_4, 0L, 0.0f, new Stroke(Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(f6)), 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 12) {
                                long j6 = j5;
                                DrawScope drawScope = Canvas;
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(((Number) mutableState.getValue()).longValue());
                                int i6 = calendar.get(10);
                                int i7 = calendar.get(12);
                                float f7 = (calendar.get(14) / 1000.0f) + calendar.get(13);
                                float f8 = (f7 / 60.0f) + i7;
                                float f9 = 90;
                                double radians = Math.toRadians((((f8 / 60.0f) + i6) * 30) - f9);
                                Color.Companion companion2 = Color.Companion;
                                long jM3964getWhite0d7_KjU = companion2.m3964getWhite0d7_KjU();
                                double d4 = fMo349toPx0680j_4;
                                double d5 = 0.5d * d4;
                                long jOffset2 = OffsetKt.Offset((float) ((Math.cos(radians) * d5) + ((double) Offset.m3686getXimpl(j6))), (float) ((Math.sin(radians) * d5) + ((double) Offset.m3687getYimpl(j6))));
                                float fMo349toPx0680j_5 = drawScope.mo349toPx0680j_4(Dp.m6403constructorimpl((float) 4.5d));
                                StrokeCap.Companion companion3 = StrokeCap.Companion;
                                DrawScope.m4463drawLineNGM6Ib0$default(drawScope, jM3964getWhite0d7_KjU, j6, jOffset2, fMo349toPx0680j_5, companion3.m4280getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                float f10 = 6;
                                double radians2 = Math.toRadians((f8 * f10) - f9);
                                double d6 = d4 * 0.72d;
                                float f11 = 3;
                                DrawScope.m4463drawLineNGM6Ib0$default(drawScope, Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), j6, OffsetKt.Offset((float) ((Math.cos(radians2) * d6) + ((double) Offset.m3686getXimpl(j6))), (float) ((Math.sin(radians2) * d6) + ((double) Offset.m3687getYimpl(j6)))), drawScope.mo349toPx0680j_4(Dp.m6403constructorimpl(f11)), companion3.m4280getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                double radians3 = Math.toRadians((f7 * f10) - f9);
                                double d7 = d4 * 0.85d;
                                long jOffset3 = OffsetKt.Offset((float) ((Math.cos(radians3) * d7) + ((double) Offset.m3686getXimpl(j6))), (float) ((Math.sin(radians3) * d7) + ((double) Offset.m3687getYimpl(j6))));
                                double d8 = d4 * 0.15d;
                                DrawScope.m4463drawLineNGM6Ib0$default(drawScope, ColorKt.Color(4289222135L), OffsetKt.Offset((float) (((double) Offset.m3686getXimpl(j6)) - (Math.cos(radians3) * d8)), (float) (((double) Offset.m3687getYimpl(j6)) - (Math.sin(radians3) * d8))), jOffset3, drawScope.mo349toPx0680j_4(Dp.m6403constructorimpl((float) 1.75d)), companion3.m4280getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                DrawScope.m4458drawCircleVaOC9Bg$default(drawScope, ColorKt.Color(4284704497L), drawScope.mo349toPx0680j_4(Dp.m6403constructorimpl(f10)), j6, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                                DrawScope.m4458drawCircleVaOC9Bg$default(drawScope, companion2.m3964getWhite0d7_KjU(), drawScope.mo349toPx0680j_4(Dp.m6403constructorimpl(f11)), j6, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                                return B3.o.f154a;
                            }
                            double radians4 = Math.toRadians((i5 * 30) - 90);
                            boolean z3 = i5 % 3 == 0;
                            double dMo349toPx0680j_4 = fMo349toPx0680j_4 - Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(z3 ? 14 : 8));
                            int i8 = i5;
                            DrawScope.m4463drawLineNGM6Ib0$default(Canvas, z3 ? ColorKt.Color(4289222135L) : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset((float) ((Math.cos(radians4) * dMo349toPx0680j_4) + ((double) Offset.m3686getXimpl(j5))), (float) ((Math.sin(radians4) * dMo349toPx0680j_4) + ((double) Offset.m3687getYimpl(j5)))), OffsetKt.Offset((float) ((Math.cos(radians4) * ((double) (fMo349toPx0680j_4 - Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(f6))))) + ((double) Offset.m3686getXimpl(j5))), (float) ((Math.sin(radians4) * ((double) (fMo349toPx0680j_4 - Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl(f6))))) + ((double) Offset.m3687getYimpl(j5)))), Canvas.mo349toPx0680j_4(Dp.m6403constructorimpl((float) (z3 ? 2.5d : 1.25d))), StrokeCap.Companion.m4280getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            i5 = i8 + 1;
                            f6 = f6;
                            j5 = j5;
                            Canvas = Canvas;
                        }
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CanvasKt.Canvas(modifierM713size3ABfNKs, (c) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

package p102x3;

import O3.g;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2665s2 implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2665s2 f15516o = new C2665s2();

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        o.f(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(860775749, iIntValue2, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintLandingScreenKt.lambda-1.<anonymous> (PrintLandingScreen.kt:317)");
        }
        if (iIntValue == 0) {
            composer.startReplaceGroup(-1645330885);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("🚚  Get ");
            FontWeight.Companion companion = FontWeight.Companion;
            FontWeight extraBold = companion.getExtraBold();
            Color.Companion companion2 = Color.Companion;
            int iPushStyle = builder.pushStyle(new SpanStyle(companion2.m3964getWhite0d7_KjU(), 0L, extraBold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
            try {
                builder.append("FREE SHIPPING");
                builder.pop(iPushStyle);
                builder.append(" automatically on orders of ");
                int iPushStyle2 = builder.pushStyle(new SpanStyle(ColorKt.Color(4294828103L), 0L, companion.getExtraBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                try {
                    builder.append("5+ notebooks!");
                    builder.pop(iPushStyle2);
                    TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), null, companion.getMedium(), null, 0L, null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer, 200112, 0, 261584);
                    composer.endReplaceGroup();
                } catch (Throwable th) {
                    builder.pop(iPushStyle2);
                    throw th;
                }
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        } else {
            composer.startReplaceGroup(-1644160046);
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
            builder2.append("📚  Print Notes from Just ");
            long jColor = ColorKt.Color(4294828103L);
            GenericFontFamily monospace = FontFamily.Companion.getMonospace();
            FontWeight.Companion companion3 = FontWeight.Companion;
            int iPushStyle3 = builder2.pushStyle(new SpanStyle(jColor, 0L, companion3.getExtraBold(), (FontStyle) null, (FontSynthesis) null, monospace, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65498, (AbstractC2168g) null));
            try {
                builder2.append("₹0.89/Page");
                builder2.pop(iPushStyle3);
                builder2.append(" with ");
                FontWeight extraBold2 = companion3.getExtraBold();
                Color.Companion companion4 = Color.Companion;
                int iPushStyle4 = builder2.pushStyle(new SpanStyle(companion4.m3964getWhite0d7_KjU(), 0L, extraBold2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (AbstractC2168g) null));
                try {
                    builder2.append("Community Passes");
                    builder2.pop(iPushStyle4);
                    TextKt.m2433TextIbK3jfQ(builder2.toAnnotatedString(), SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), null, companion3.getMedium(), null, 0L, null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer, 200112, 0, 261584);
                    composer.endReplaceGroup();
                } catch (Throwable th3) {
                    builder2.pop(iPushStyle4);
                    throw th3;
                }
            } catch (Throwable th4) {
                builder2.pop(iPushStyle3);
                throw th4;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}

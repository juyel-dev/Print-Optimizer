package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.app.R;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2621p5 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f15403o;

    public C2621p5(a aVar) {
        this.f15403o = aVar;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope ProductContainer = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(ProductContainer, "$this$ProductContainer");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1121408973, iIntValue, -1, "com.notescrafter.ui.screens.GlobalHomeScreen.<anonymous>.<anonymous>.<anonymous> (GlobalHomeScreen.kt:151)");
            }
            List listS = v.S(Integer.valueOf(R.drawable.ncp_gallery_1), Integer.valueOf(R.drawable.ncp_gallery_2), Integer.valueOf(R.drawable.ncp_gallery_3), Integer.valueOf(R.drawable.ncp_gallery_4), Integer.valueOf(R.drawable.ncp_gallery_5), Integer.valueOf(R.drawable.ncp_gallery_6));
            composer.startReplaceGroup(-57390042);
            boolean zChanged = composer.changed(listS);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2573m5(listS, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (a) objRememberedValue, composer, 0, 3);
            composer.startReplaceGroup(-57387654);
            boolean zChanged2 = composer.changed(pagerStateRememberPagerState) | composer.changed(listS);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new C2589n5(pagerStateRememberPagerState, listS, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(pagerStateRememberPagerState, (e) objRememberedValue2, composer, 0);
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 12;
            Modifier modifierG = b.g(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 2.0f, false, 2, null), f5);
            float fM6403constructorimpl = Dp.m6403constructorimpl(1);
            Color.Companion companion2 = Color.Companion;
            PagerKt.m907HorizontalPageroI3XNZo(pagerStateRememberPagerState, b.e(f5, modifierG, fM6403constructorimpl, Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), null, null, 0, 0.0f, null, null, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-230570411, true, new C2605o5(listS), composer, 54), composer, 0, 3072, 8188);
            float f6 = 14;
            b.m(f6, companion, composer, 6);
            float f7 = 8;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.background$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f7), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4286331629L)), Color.m3917boximpl(ColorKt.Color(4283385573L)), Color.m3917boximpl(ColorKt.Color(4286331629L))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f7));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("🎉  Flat 10% off first order — use code ");
            long jColor = ColorKt.Color(4294828103L);
            GenericFontFamily monospace = FontFamily.Companion.getMonospace();
            FontWeight.Companion companion4 = FontWeight.Companion;
            int iPushStyle = builder.pushStyle(new SpanStyle(jColor, 0L, companion4.getExtraBold(), (FontStyle) null, (FontSynthesis) null, monospace, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65498, (AbstractC2168g) null));
            try {
                builder.append("FIRST10");
                builder.pop(iPushStyle);
                TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), null, Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), null, companion4.getMedium(), null, 0L, null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer, 200064, 0, 261586);
                b.n(composer, f5, companion, composer, 6);
                TextKt.m2432Text4IGK_g("An online custom printed notebook printing service that transforms your PDFs into professionally printed and bound notebooks, delivered anywhere in India within 3–7 days.", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 390, 6, 64506);
                b.m(f6, companion, composer, 6);
                AbstractC2684t5.e("Print & Deliver", "Get custom printed notebooks at your doorstep", "₹0.89/page", v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), this.f15403o, composer, 3510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        return B3.o.f154a;
    }
}

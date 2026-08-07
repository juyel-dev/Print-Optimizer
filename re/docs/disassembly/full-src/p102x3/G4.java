package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material.icons.outlined.BrushKt;
import androidx.compose.material.icons.outlined.ExpandMoreKt;
import androidx.compose.material.icons.outlined.PaletteKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.service.PDFProcessor;
import java.util.List;
import kotlin.jvm.internal.o;
import p083t3.I;
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class G4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f13978o;
    public final /* synthetic */ b p;
    public final /* synthetic */ PDFProcessor q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f13979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f13980s;

    public G4(List list, b bVar, PDFProcessor pDFProcessor, c cVar, MutableIntState mutableIntState) {
        this.f13978o = list;
        this.p = bVar;
        this.q = pDFProcessor;
        this.f13979r = cVar;
        this.f13980s = mutableIntState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-681009609, iIntValue, -1, "com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:169)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MutableIntState mutableIntState = this.f13980s;
            int intValue = mutableIntState.getIntValue();
            composer.startReplaceGroup(-2089213534);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new P0.b(mutableIntState, 4);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            List list = this.f13978o;
            b bVar = this.p;
            Z4.g(list, bVar, this.q, intValue, (c) objRememberedValue, modifierFillMaxWidth$default, composer, 221184);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(20)), composer, 6);
            composer.startReplaceGroup(-2089202743);
            boolean zChanged = composer.changed(bVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = (bVar.getGrayscale() && bVar.getBlackAndWhite()) ? "bw" : "color";
                composer.updateRememberedValue(objRememberedValue2);
            }
            String str = (String) objRememberedValue2;
            composer.endReplaceGroup();
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            List listS = v.S(new Ze(PaletteKt.getPalette(outlined), "color", "Color Printing"), new Ze(BrushKt.getBrush(outlined), "bw", "B & W Printing"));
            composer.startReplaceGroup(-2089180959);
            boolean zChangedInstance = composer.changedInstance(bVar);
            c cVar = this.f13979r;
            boolean zChanged2 = zChangedInstance | composer.changed(cVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new E4(bVar, cVar);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Z4.j(listS, str, (c) objRememberedValue3, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer, 24582);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, 6);
            composer.startReplaceGroup(-2089142805);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState = (MutableState) objRememberedValue4;
            composer.endReplaceGroup();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composer.startReplaceGroup(-2089135511);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = new I(22, mutableState);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierFillMaxWidth$default2, false, null, null, (a) objRememberedValue5, 7, null), 0.0f, Dp.m6403constructorimpl(8), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
            a constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2432Text4IGK_g("ADVANCED FILTERS CONTROL", (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 12779910, 0, 65370);
            IconKt.m1877Iconww6aTOc(((Boolean) mutableState.getValue()).booleanValue() ? KeyboardArrowUpKt.getKeyboardArrowUp(Icons.INSTANCE.getDefault()) : ExpandMoreKt.getExpandMore(outlined), (String) null, (Modifier) null, p107y3.a.f15978a, composer, 3120, 4);
            composer.endNode();
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, ((Boolean) mutableState.getValue()).booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1329995141, true, new F4(bVar, cVar), composer, 54), composer, 1572870, 30);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import P0.b;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EditKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import kotlin.jvm.internal.o;
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public final class Ma implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f14199o;
    public final /* synthetic */ a p;
    public final /* synthetic */ a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14200r;

    public Ma(g gVar, a aVar, a aVar2, int i5) {
        this.f14199o = gVar;
        this.p = aVar;
        this.q = aVar2;
        this.f14200r = i5;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        g gVar;
        int i5;
        int i6;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer2.changed(GlassCard) ? 4 : 2;
        }
        int i7 = iIntValue & 19;
        B3.o oVar = B3.o.f154a;
        if (i7 == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-197043851, iIntValue, -1, "com.notescrafter.ui.screens.PageThumbnail.<anonymous> (PreviewScreen.kt:615)");
            }
            g gVar2 = this.f14199o;
            Bitmap thumbnail = gVar2.getThumbnail();
            composer2.startReplaceGroup(-168825192);
            int i8 = this.f14200r;
            B3.o oVar2 = null;
            if (thumbnail != null) {
                ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(thumbnail), AbstractC1421mz.h(i8, "Page "), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ContentScale.Companion.getCrop(), 0.0f, null, 0, composer2, 24960, 232);
                oVar2 = oVar;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-168825055);
            if (oVar2 == null) {
                Modifier.Companion companion = Modifier.Companion;
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, 0), p107y3.a.g, null, 2, null);
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM207backgroundbw27NRU$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                a constructor = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                a constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i9 = MaterialTheme.$stable;
                TextStyle titleMedium = materialTheme.getTypography(composer2, i9).getTitleMedium();
                long j5 = p107y3.a.q;
                TextKt.m2432Text4IGK_g("Blank", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium, composer2, 390, 0, 65530);
                composer = composer2;
                TextKt.m2432Text4IGK_g("Slide", (Modifier) null, j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i9).getBodyMedium(), composer, 390, 0, 65530);
                composer.endNode();
                composer.endNode();
            } else {
                composer = composer2;
            }
            composer.endReplaceGroup();
            if (!gVar2.isSelected()) {
                composer.startReplaceGroup(-937656994);
                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(p107y3.a.e, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                composer.endReplaceGroup();
                gVar = gVar2;
            } else if (gVar2.getEdits().isEmpty()) {
                gVar = gVar2;
                composer.startReplaceGroup(-935143886);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-937377250);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                composer.startReplaceGroup(-168781536);
                gVar = gVar2;
                boolean zChangedInstance = composer.changedInstance(gVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    i5 = 6;
                    objRememberedValue = new b(gVar, 6);
                    composer.updateRememberedValue(objRememberedValue);
                } else {
                    i5 = 6;
                }
                composer.endReplaceGroup();
                CanvasKt.Canvas(modifierFillMaxSize$default, (c) objRememberedValue, composer, i5);
                composer.endReplaceGroup();
            }
            composer.startReplaceGroup(-168710700);
            if (!gVar.isSelected() || gVar.getEdits().isEmpty()) {
                i6 = 4;
            } else {
                Modifier.Companion companion4 = Modifier.Companion;
                Alignment.Companion companion5 = Alignment.Companion;
                float f5 = 4;
                float f6 = 2;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(p076s.b.g(PaddingKt.m668padding3ABfNKs(GlassCard.align(companion4, companion5.getBottomStart()), Dp.m6403constructorimpl(8)), f5), p107y3.a.f15978a, null, 2, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f6));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
                ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                a constructor3 = companion6.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                e eVarG3 = p035i0.a.g(companion6, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion5.getCenterVertically(), composer, 48);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion4);
                a constructor4 = companion6.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                e eVarG4 = p035i0.a.g(companion6, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageVector edit = EditKt.getEdit(Icons.Outlined.INSTANCE);
                Color.Companion companion7 = Color.Companion;
                IconKt.m1877Iconww6aTOc(edit, (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(10)), companion7.m3964getWhite0d7_KjU(), composer, 3504, 0);
                androidx.compose.foundation.text.modifiers.a.q(f6, companion4, composer, 6);
                i6 = 4;
                TextKt.m2432Text4IGK_g("Edited", (Modifier) null, companion7.m3964getWhite0d7_KjU(), TextUnitKt.getSp(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 3462, 0, 65522);
                composer.endNode();
                composer.endNode();
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-168683793);
            if (gVar.isSelected()) {
                boolean zIsEmpty = gVar.getEdits().isEmpty();
                IconButtonKt.IconButton(!zIsEmpty ? this.p : this.q, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(GlassCard.align(Modifier.Companion, Alignment.Companion.getTopEnd()), Dp.m6403constructorimpl(i6)), Dp.m6403constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(p107y3.a.e, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, ComposableLambdaKt.rememberComposableLambda(1642924261, true, new La(!zIsEmpty), composer, 54), composer, 196608, 28);
            }
            composer.endReplaceGroup();
            Modifier.Companion companion8 = Modifier.Companion;
            Alignment.Companion companion9 = Alignment.Companion;
            Modifier modifierAlign = GlassCard.align(companion8, companion9.getBottomEnd());
            float f7 = 8;
            float f8 = i6;
            Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(p076s.b.g(PaddingKt.m668padding3ABfNKs(modifierAlign, Dp.m6403constructorimpl(f7)), f8), Color.m3926copywmQWz5c$default(p107y3.a.e, 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f7), Dp.m6403constructorimpl(f8));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN5);
            ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
            a constructor5 = companion10.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
            e eVarG5 = p035i0.a.g(companion10, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion10.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            TextKt.m2432Text4IGK_g(String.valueOf(i8), (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196992, 0, 65498);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return oVar;
    }
}

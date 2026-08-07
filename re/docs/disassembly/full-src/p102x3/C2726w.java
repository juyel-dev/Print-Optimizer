package p102x3;

import B3.m;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ComputerKt;
import androidx.compose.material.icons.outlined.FavoriteKt;
import androidx.compose.material.icons.outlined.RocketLaunchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import java.util.Iterator;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2726w implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2726w f15657o = new C2726w();

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i5;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1136161872, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$CommunityPassScreenKt.lambda-1.<anonymous> (CommunityPassScreen.kt:415)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 24;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer, 48);
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
            Modifier modifierM206backgroundbw27NRU = BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(52)), Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            float f6 = 1;
            float fM6403constructorimpl = Dp.m6403constructorimpl(f6);
            long j5 = p107y3.a.f15980c;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM206backgroundbw27NRU, fM6403constructorimpl, Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM220borderxT4_qwU);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            IconKt.m1877Iconww6aTOc(RocketLaunchKt.getRocketLaunch(outlined), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(26)), j5, composer, 3504, 0);
            composer.endNode();
            float f7 = 14;
            b.m(f7, companion, composer, 6);
            long jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
            FontWeight bold = FontWeight.Companion.getBold();
            long sp = TextUnitKt.getSp(18);
            TextAlign.Companion companion4 = TextAlign.Companion;
            int i6 = 6;
            TextKt.m2432Text4IGK_g("Why Your Support Matters", (Modifier) null, jM3964getWhite0d7_KjU, sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion4.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 130514);
            b.m(4, companion, composer, 6);
            TextKt.m2432Text4IGK_g("Every pass directly funds the mission.", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion4.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 130546);
            Composer composer2 = composer;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, 6);
            composer2.startReplaceGroup(767644366);
            Iterator it = v.S(new m(RocketLaunchKt.getRocketLaunch(outlined), "Fund Development", "New features, improvements, and ongoing innovations"), new m(ComputerKt.getComputer(outlined), "Cover Costs", "Hosting, domains, infrastructure, and API services"), new m(FavoriteKt.getFavorite(outlined), "Stay Independent", "Zero ads, zero tracking, zero compromises")).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    v.X();
                    throw null;
                }
                m mVar = (m) next;
                ImageVector imageVector = (ImageVector) mVar.f152o;
                String str = (String) mVar.p;
                String str2 = (String) mVar.q;
                composer2.startReplaceGroup(767644564);
                if (i7 > 0) {
                    i5 = 16;
                    b.m(16, Modifier.Companion, composer2, i6);
                } else {
                    i5 = 16;
                }
                composer2.endReplaceGroup();
                Modifier.Companion companion5 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7));
                Alignment.Companion companion6 = Alignment.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion6.getTop(), composer2, 54);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                a constructor3 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                e eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f8 = 10;
                Modifier modifierF = b.f(f8, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(36)), Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
                float fM6403constructorimpl2 = Dp.m6403constructorimpl(f6);
                long j6 = p107y3.a.f15980c;
                Iterator it2 = it;
                Modifier modifierE = b.e(f8, modifierF, fM6403constructorimpl2, Color.m3926copywmQWz5c$default(j6, 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                a constructor4 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
                e eVarG4 = p035i0.a.g(companion7, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                IconKt.m1877Iconww6aTOc(imageVector, (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(18)), j6, composer2, 3504, 0);
                composer2.endNode();
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion5, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer2, 0);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                a constructor5 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                e eVarG5 = p035i0.a.g(companion7, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion7.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Composer composer3 = composer2;
                TextKt.m2432Text4IGK_g(str, (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                TextKt.m2432Text4IGK_g(str2, PaddingKt.m672paddingqDBjuR0$default(companion5, 0.0f, Dp.m6403constructorimpl(2), 0.0f, 0.0f, 13, null), p107y3.a.p, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(i5), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 6, 130032);
                composer3.endNode();
                composer3.endNode();
                it = it2;
                i7 = i8;
                composer2 = composer3;
                i6 = 6;
            }
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

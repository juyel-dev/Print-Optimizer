package p102x3;

import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.BoltKt;
import androidx.compose.material.icons.outlined.LightbulbKt;
import androidx.compose.material.icons.outlined.PublicKt;
import androidx.compose.material.icons.outlined.RocketLaunchKt;
import androidx.compose.material.icons.outlined.VerifiedUserKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
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
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.j;

/* JADX INFO: renamed from: x3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2471g {
    public static final void a(Modifier modifier, Composer composer, int i5) {
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1719262773);
        int i6 = i5 | 6;
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719262773, i6, -1, "com.notescrafter.ui.screens.AboutUsScreen (AboutUsScreen.kt:26)");
            }
            float f5 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i7 = MaterialTheme.$stable;
            TextStyle displaySmall = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight bold = companion4.getBold();
            long j5 = p107y3.a.f15990o;
            TextAlign.Companion companion5 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g("About NotesCrafter", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f5), 0.0f, 0.0f, 13, null), j5, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion5.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, displaySmall, composerStartRestartGroup, 197046, 0, 64984);
            Modifier.Companion companion6 = companion;
            TextKt.m2432Text4IGK_g("Free, privacy-first PDF tools that work entirely on your device", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(12), 1, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion5.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i7).getBodyLarge(), composerStartRestartGroup, 438, 0, 65016);
            float f6 = 24;
            b.m(f6, companion6, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            j.a(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2710v.f15628a, composerStartRestartGroup, 196614, 30);
            b.m(f6, companion6, composer2, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            b("100%", "Free", RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composer2, 54);
            b("Offline", "Processing", RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composer2, 54);
            b.n(composer2, f5, companion6, composer2, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            a constructor3 = companion3.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            b("Zero", "Data Collection", RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composer2, 54);
            b("No", "Login Required", RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composer2, 54);
            b.n(composer2, f6, companion6, composer2, 6);
            TextKt.m2432Text4IGK_g("What We Do", PaddingKt.m670paddingVpY3zN4$default(companion6, 0.0f, Dp.m6403constructorimpl(f5), 1, null), j5, 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion5.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getHeadlineSmall(), composer2, 197046, 0, 64984);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion2.getStart(), composer2, 6);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion6);
            a constructor4 = companion3.getConstructor();
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            d(432, composer2, RocketLaunchKt.getRocketLaunch(outlined), "Native Processing", "All PDF processing happens locally on your device using native C++ code. No servers, no uploads.");
            d(432, composer2, LightbulbKt.getLightbulb(outlined), "Open & Transparent", "Our approach is open. We don't collect or store your data.");
            d(432, composer2, PublicKt.getPublic(outlined), "Works Offline", "NotesCrafter works perfectly without internet. Process PDFs anywhere, anytime.");
            composer2.endNode();
            b.m(f6, companion6, composer2, 6);
            j.a(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2710v.f15629b, composer2, 196614, 30);
            b.m(f6, companion6, composer2, 6);
            TextKt.m2432Text4IGK_g("Powered by Modern Technology", PaddingKt.m670paddingVpY3zN4$default(companion6, 0.0f, Dp.m6403constructorimpl(f5), 1, null), j5, 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion5.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getHeadlineSmall(), composer2, 197046, 0, 64984);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            float f7 = 8;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
            a constructor5 = companion3.getConstructor();
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
            e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
            c("Native C++", "Processing", RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composer2, 54);
            c("Jetpack Compose", "Modern UI", RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composer2, 54);
            b.n(composer2, f7, companion6, composer2, 6);
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getTop(), composer2, 6);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default4);
            a constructor6 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
            e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap6);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
            c("PdfRenderer", "Rendering", RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composer2, 54);
            c("Android Security", "Sandboxed", RowScope.weight$default(rowScopeInstance, companion6, 1.0f, false, 2, null), composer2, 54);
            composer2.endNode();
            b.m(32, companion6, composer2, 6);
            TextKt.m2432Text4IGK_g("Our Core Values", PaddingKt.m670paddingVpY3zN4$default(companion6, 0.0f, Dp.m6403constructorimpl(f5), 1, null), j5, 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getHeadlineSmall(), composer2, 197046, 0, 65496);
            d(432, composer2, VerifiedUserKt.getVerifiedUser(outlined), "Privacy First", "Your files never leave your device.");
            d(432, composer2, BoltKt.getBolt(outlined), "Lightning Fast", "Instant processing without uploads.");
            d(432, composer2, PublicKt.getPublic(outlined), "Accessible", "Free tools for everyone, everywhere.");
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(100)), composer2, 6);
            composer2.endNode();
            modifier2 = companion6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                modifier2 = companion6;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2375a(modifier2, i5, 0));
        }
    }

    public static final void b(String str, String str2, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1853619444);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853619444, i6, -1, "com.notescrafter.ui.screens.StatCard (AboutUsScreen.kt:269)");
            }
            j.a(modifier, 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(209924271, true, new C2423d(str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 6) & 14) | 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2407c(str, str2, modifier, i5, 0));
        }
    }

    public static final void c(String str, String str2, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(420493561);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(420493561, i6, -1, "com.notescrafter.ui.screens.TechItem (AboutUsScreen.kt:254)");
            }
            j.a(modifier, 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1223201612, true, new C2439e(str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 6) & 14) | 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2407c(str, str2, modifier, i5, 1));
        }
    }

    public static final void d(int i5, Composer composer, ImageVector icon, String str, String str2) {
        int i6;
        Composer composer2;
        o.f(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-749561835);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-749561835, i6, -1, "com.notescrafter.ui.screens.ValueItem (AboutUsScreen.kt:293)");
            }
            composer2 = composerStartRestartGroup;
            j.a(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(8), 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-288131504, true, new C2455f(icon, str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2391b(icon, str, str2, i5));
        }
    }
}

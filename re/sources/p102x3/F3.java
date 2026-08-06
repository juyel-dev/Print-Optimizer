package p102x3;

import O3.a;
import O3.c;
import O3.e;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ScheduleKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F3 {
    /* JADX WARN: Code duplicated, block: B:100:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:103:0x0305  */
    /* JADX WARN: Code duplicated, block: B:104:0x0309  */
    /* JADX WARN: Code duplicated, block: B:107:0x031a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0328  */
    /* JADX WARN: Code duplicated, block: B:112:0x0394  */
    /* JADX WARN: Code duplicated, block: B:115:0x039d  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:79:0x016c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0170  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0218  */
    public static final void a(final ImageVector icon, final String str, final String str2, final String str3, final String str4, Modifier modifier, Composer composer, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        Composer composer2;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        o.f(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-432427705);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(str3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(str4) ? Fields.Clip : Fields.Shape;
        }
        int i8 = i6 & 32;
        if (i8 == 0) {
            if ((196608 & i5) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? Fields.RenderEffect : 65536;
            }
            if ((i7 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                if (i8 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-432427705, i7, -1, "com.notescrafter.ui.screens.ContactMethodItem (ContactUsScreen.kt:339)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Companion companion = Alignment.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(48)), 8), p107y3.a.g, null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default);
                constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                long j5 = p107y3.a.f15978a;
                int i9 = i7;
                IconKt.m1877Iconww6aTOc(icon, (String) null, (Modifier) null, j5, composerStartRestartGroup, (i7 & 14) | 3120, 4);
                composerStartRestartGroup.endNode();
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion3, Dp.m6403constructorimpl(16)), composerStartRestartGroup, 6);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
                constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG3 = p035i0.a.g(companion2, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                FontWeight.Companion companion4 = FontWeight.Companion;
                composer2 = composerStartRestartGroup;
                TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, companion4.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, ((i9 >> 3) & 14) | 196992, 0, 131034);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i10 = MaterialTheme.$stable;
                TextStyle bodySmall = materialTheme.getTypography(composer2, i10).getBodySmall();
                long j6 = p107y3.a.p;
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall, composer2, ((i9 >> 6) & 14) | 384, 0, 65530);
                TextKt.m2432Text4IGK_g(str3, (Modifier) null, j5, 0L, (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, ((i9 >> 9) & 14) | 196992, 0, 131034);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer2, 48);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion3);
                constructor4 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
                eVarG4 = p035i0.a.g(companion2, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                IconKt.m1877Iconww6aTOc(ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(14)), j5, composer2, 3504, 0);
                androidx.compose.foundation.text.modifiers.a.q(4, companion3, composer2, 6);
                TextKt.m2432Text4IGK_g(str4, (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i10).getBodySmall(), composer2, ((i9 >> 12) & 14) | 384, 0, 65530);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.B3
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        String str5 = str;
                        String str6 = str2;
                        String str7 = str3;
                        String str8 = str4;
                        Modifier modifier5 = modifier4;
                        F3.a(icon, str5, str6, str7, str8, modifier5, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 196608;
        modifier2 = modifier;
        if ((i7 & 74899) == 74898) {
            if (i8 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432427705, i7, -1, "com.notescrafter.ui.screens.ContactMethodItem (ContactUsScreen.kt:339)");
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Horizontal start2 = arrangement2.getStart();
            Alignment.Companion companion5 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(start2, companion5.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
            constructor = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG = p035i0.a.g(companion6, composerM3407constructorimpl, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap5);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion6.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier.Companion companion7 = Modifier.Companion;
            Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(48)), 8), p107y3.a.g, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default2);
            constructor2 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG2 = p035i0.a.g(companion6, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap6);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier6, companion6.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            long j7 = p107y3.a.f15978a;
            int i11 = i7;
            IconKt.m1877Iconww6aTOc(icon, (String) null, (Modifier) null, j7, composerStartRestartGroup, (i7 & 14) | 3120, 4);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion7, Dp.m6403constructorimpl(16)), composerStartRestartGroup, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion7);
            constructor3 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG3 = p035i0.a.g(companion6, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap7);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier7, companion6.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            FontWeight.Companion companion8 = FontWeight.Companion;
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, companion8.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, ((i11 >> 3) & 14) | 196992, 0, 131034);
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            TextStyle bodySmall2 = materialTheme2.getTypography(composer2, i12).getBodySmall();
            long j8 = p107y3.a.p;
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2, composer2, ((i11 >> 6) & 14) | 384, 0, 65530);
            TextKt.m2432Text4IGK_g(str3, (Modifier) null, j7, 0L, (FontStyle) null, companion8.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, ((i11 >> 9) & 14) | 196992, 0, 131034);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion5.getCenterVertically(), composer2, 48);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, companion7);
            constructor4 = companion6.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
            eVarG4 = p035i0.a.g(companion6, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap8);
            if (composerM3407constructorimpl4.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            } else {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier8, companion6.getSetModifier());
            IconKt.m1877Iconww6aTOc(ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(14)), j7, composer2, 3504, 0);
            androidx.compose.foundation.text.modifiers.a.q(4, companion7, composer2, 6);
            TextKt.m2432Text4IGK_g(str4, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composer2, i12).getBodySmall(), composer2, ((i11 >> 12) & 14) | 384, 0, 65530);
            if (S2.b(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i8 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432427705, i7, -1, "com.notescrafter.ui.screens.ContactMethodItem (ContactUsScreen.kt:339)");
            }
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement arrangement3 = Arrangement.INSTANCE;
            Arrangement.Horizontal start3 = arrangement3.getStart();
            Alignment.Companion companion9 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(start3, companion9.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
            ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
            constructor = companion10.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG = p035i0.a.g(companion10, composerM3407constructorimpl, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap9);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier9, companion10.getSetModifier());
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            Modifier.Companion companion11 = Modifier.Companion;
            Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(48)), 8), p107y3.a.g, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getCenter(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default3);
            constructor2 = companion10.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG2 = p035i0.a.g(companion10, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap10);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier10, companion10.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            long j9 = p107y3.a.f15978a;
            int i13 = i7;
            IconKt.m1877Iconww6aTOc(icon, (String) null, (Modifier) null, j9, composerStartRestartGroup, (i7 & 14) | 3120, 4);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion11, Dp.m6403constructorimpl(16)), composerStartRestartGroup, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion9.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion11);
            constructor3 = companion10.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG3 = p035i0.a.g(companion10, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap11);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier11, companion10.getSetModifier());
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            FontWeight.Companion companion12 = FontWeight.Companion;
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, companion12.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, ((i13 >> 3) & 14) | 196992, 0, 131034);
            MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            TextStyle bodySmall3 = materialTheme3.getTypography(composer2, i14).getBodySmall();
            long j10 = p107y3.a.p;
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3, composer2, ((i13 >> 6) & 14) | 384, 0, 65530);
            TextKt.m2432Text4IGK_g(str3, (Modifier) null, j9, 0L, (FontStyle) null, companion12.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, ((i13 >> 9) & 14) | 196992, 0, 131034);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion9.getCenterVertically(), composer2, 48);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer2, companion11);
            constructor4 = companion10.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
            eVarG4 = p035i0.a.g(companion10, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap12);
            if (composerM3407constructorimpl4.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            } else {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier12, companion10.getSetModifier());
            IconKt.m1877Iconww6aTOc(ScheduleKt.getSchedule(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(14)), j9, composer2, 3504, 0);
            androidx.compose.foundation.text.modifiers.a.q(4, companion11, composer2, 6);
            TextKt.m2432Text4IGK_g(str4, (Modifier) null, j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composer2, i14).getBodySmall(), composer2, ((i13 >> 12) & 14) | 384, 0, 65530);
            if (S2.b(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.B3
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    String str8 = str4;
                    Modifier modifier6 = modifier5;
                    F3.a(icon, str5, str6, str7, str8, modifier6, (Composer) obj, iUpdateChangedFlags, i6);
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final void b(a onNavigateBack, a onNavigateToHelp, a onNavigateToLiveChat, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onNavigateBack, "onNavigateBack");
        o.f(onNavigateToHelp, "onNavigateToHelp");
        o.f(onNavigateToLiveChat, "onNavigateToLiveChat");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1249014902);
        if ((i5 & 48) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onNavigateToHelp) ? 32 : 16) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onNavigateToLiveChat) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 145) == 144 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249014902, i6, -1, "com.notescrafter.ui.screens.ContactUsScreen (ContactUsScreen.kt:42)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f5 = 16;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5)), scrollStateRememberScrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            a constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i7 = MaterialTheme.$stable;
            TextKt.m2432Text4IGK_g("Contact Us", PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, Dp.m6403constructorimpl(f5), 0.0f, Dp.m6403constructorimpl(8), 5, null), p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i7).getHeadlineLarge(), composerStartRestartGroup, 197046, 0, 65496);
            TextKt.m2432Text4IGK_g("Have questions? We would love to hear from you. Select a support option below to connect with us instantly.", PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(32), 7, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i7).getBodyLarge(), composerStartRestartGroup, 438, 0, 65016);
            float f6 = 24;
            j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f6), 7, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(939757577, true, new C3(onNavigateToLiveChat, context), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1299751602, true, new D3(context), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            b.m(f6, companion, composerStartRestartGroup, 6);
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(262741201, true, new E3(onNavigateToHelp), composerStartRestartGroup, 54), composerStartRestartGroup, 196662, 28);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(48)), composer2, 6);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a((Object) onNavigateBack, (Object) onNavigateToHelp, (Object) onNavigateToLiveChat, i5, 1));
        }
    }

    public static final void c(Context context) {
        try {
            try {
                String str = "https://api.whatsapp.com/send?phone=916203770581&text=" + URLEncoder.encode("Hi NotesCrafter, I need help with printing my notes. Can you please call/chat with me?", "UTF-8");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setPackage("com.whatsapp");
                context.startActivity(intent);
            } catch (Exception unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://wa.me/916203770581?text=" + URLEncoder.encode("Hi NotesCrafter, I need help with printing my notes. Can you please call/chat with me?", "UTF-8"))));
            }
        } catch (Exception unused2) {
            Toast.makeText(context, "WhatsApp is not installed on this device", 0).show();
        }
    }
}

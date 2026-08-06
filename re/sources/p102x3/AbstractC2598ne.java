package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import W3.j;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.ArrowForwardIosKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.notescrafter.app.R;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p076s.b;
import p092v3.h;

/* JADX INFO: renamed from: x3.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2598ne {
    public static final void a(final ImageVector icon, final String str, final a onClick, Modifier modifier, final long j5, final long j6, final String str2, final boolean z3, Composer composer, final int i5) {
        int i6;
        Composer composer2;
        final Modifier modifier2;
        o.f(icon, "icon");
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(178843038);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i6 | 3072;
        if ((i5 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(j5) ? Fields.Clip : Fields.Shape;
        }
        if ((i5 & 196608) == 0) {
            i7 |= composerStartRestartGroup.changed(j6) ? Fields.RenderEffect : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
        }
        if ((i7 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178843038, i7, -1, "com.notescrafter.ui.screens.SettingsItem (SettingsScreen.kt:580)");
            }
            composerStartRestartGroup.startReplaceGroup(-720689271);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i8 = i7;
            composer2 = composerStartRestartGroup;
            Modifier modifierScale = ScaleKt.scale(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), AnimateAsStateKt.animateFloatAsState(PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue() ? 0.97f : 1.0f, null, 0.0f, "click_scale", null, composerStartRestartGroup, 3072, 22).getValue().floatValue());
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierScale);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f5 = 16;
            float f6 = 14;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m240clickableO2vRcR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), mutableInteractionSource, (Indication) composer2.consume(IndicationKt.getLocalIndication()), false, null, null, onClick, 28, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f6));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
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
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(38)), 10), j6, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM207backgroundbw27NRU$default);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(20));
            int i9 = i8 >> 3;
            IconKt.m1877Iconww6aTOc(icon, (String) null, modifierM713size3ABfNKs, j5, composer2, (i8 & 14) | 432 | (i9 & 7168), 0);
            b.u(composer2, f5, companion, composer2, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
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
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i10).getBodyLarge(), composer2, (i9 & 14) | 196992, 0, 65498);
            composer2.startReplaceGroup(-282648875);
            if (str2 != null && !j.m0(str2)) {
                b.m(2, companion, composer2, 6);
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i10).getBodySmall(), composer2, ((i8 >> 18) & 14) | 384, 0, 65530);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            IconKt.m1877Iconww6aTOc(ArrowForwardIosKt.getArrowForwardIos(Icons.AutoMirrored.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f6)), Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 3504, 0);
            composer2.endNode();
            composer2.startReplaceGroup(-1597881984);
            if (z3) {
                DividerKt.m1794HorizontalDivider9IZ8Weo(PaddingKt.m672paddingqDBjuR0$default(companion, Dp.m6403constructorimpl(70), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 438, 0);
            }
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.fe
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    String str3 = str;
                    String str4 = str2;
                    boolean z4 = z3;
                    AbstractC2598ne.a(icon, str3, onClick, modifier2, j5, j6, str4, z4, (Composer) obj, iUpdateChangedFlags);
                    return B3.o.f154a;
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x037b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0387  */
    /* JADX WARN: Code duplicated, block: B:126:0x038b  */
    /* JADX WARN: Code duplicated, block: B:129:0x039c  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:136:0x0443  */
    /* JADX WARN: Code duplicated, block: B:137:0x0523  */
    /* JADX WARN: Code duplicated, block: B:140:0x060f  */
    /* JADX WARN: Code duplicated, block: B:143:0x061b  */
    /* JADX WARN: Code duplicated, block: B:144:0x061f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0630  */
    /* JADX WARN: Code duplicated, block: B:149:0x063e  */
    /* JADX WARN: Code duplicated, block: B:152:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:155:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:156:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:159:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:161:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:164:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:78:0x0224  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static final void b(c onNavigate, h authManager, Modifier modifier, Composer composer, int i5) {
        int i6;
        long jColor;
        Brush brushM3876horizontalGradient8A3gB4$default;
        String str;
        String str2;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        float f5;
        MaterialTheme materialTheme;
        int i7;
        FontWeight.Companion companion;
        Composer composer2;
        ?? r15;
        int i8;
        Modifier modifier2;
        float f6;
        int i9;
        ComposeUiNode.Companion companion2;
        Modifier.Companion companion3;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        c cVar;
        Modifier modifier3;
        o.f(onNavigate, "onNavigate");
        o.f(authManager, "authManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-173898781);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onNavigate) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(authManager) ? 32 : 16;
        }
        int i10 = i6 | 384;
        if ((i10 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
            composer2 = composerStartRestartGroup;
            cVar = onNavigate;
        } else {
            Modifier.Companion companion4 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-173898781, i10, -1, "com.notescrafter.ui.screens.SettingsScreen (SettingsScreen.kt:44)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(F3.j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            State stateCollectAsState = SnapshotStateKt.collectAsState(authManager.e, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(authManager.g, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(authManager.f13527i, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(authManager.f13529k, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(authManager.f13531m, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState6 = SnapshotStateKt.collectAsState(authManager.f13533o, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState7 = SnapshotStateKt.collectAsState(authManager.q, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState8 = SnapshotStateKt.collectAsState(authManager.f13536v, null, composerStartRestartGroup, 0, 1);
            if (((Boolean) stateCollectAsState2.getValue()).booleanValue()) {
                String str3 = (String) stateCollectAsState6.getValue();
                if (str3 != null) {
                    switch (str3) {
                        case "annual":
                            jColor = ColorKt.Color(4286680312L);
                            break;
                        case "lifetime":
                            jColor = ColorKt.Color(4280472558L);
                            break;
                        case "monthly":
                            jColor = ColorKt.Color(4287931320L);
                            break;
                        case "half_yearly":
                            jColor = ColorKt.Color(4294286859L);
                            break;
                        default:
                            jColor = p107y3.a.f15994w;
                            break;
                    }
                } else {
                    jColor = p107y3.a.f15994w;
                }
            } else {
                jColor = p107y3.a.f15978a;
            }
            long j5 = jColor;
            if (((Boolean) stateCollectAsState2.getValue()).booleanValue()) {
                String str4 = (String) stateCollectAsState6.getValue();
                if (str4 != null) {
                    switch (str4) {
                        case "annual":
                            brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4284704497L)), Color.m3917boximpl(ColorKt.Color(4286680312L))), 0.0f, 0.0f, 0, 14, (Object) null);
                            break;
                        case "lifetime":
                            brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4278630100L)), Color.m3917boximpl(ColorKt.Color(4280472558L))), 0.0f, 0.0f, 0, 14, (Object) null);
                            break;
                        case "monthly":
                            brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4284773515L)), Color.m3917boximpl(ColorKt.Color(4287931320L))), 0.0f, 0.0f, 0, 14, (Object) null);
                            break;
                        case "half_yearly":
                            brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4292441862L)), Color.m3917boximpl(ColorKt.Color(4294286859L))), 0.0f, 0.0f, 0, 14, (Object) null);
                            break;
                        default:
                            brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15994w), Color.m3917boximpl(p107y3.a.f15995x)), 0.0f, 0.0f, 0, 14, (Object) null);
                            break;
                    }
                } else {
                    brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15994w), Color.m3917boximpl(p107y3.a.f15995x)), 0.0f, 0.0f, 0, 14, (Object) null);
                }
            } else {
                brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null);
            }
            if (((Boolean) stateCollectAsState2.getValue()).booleanValue()) {
                String str5 = (String) stateCollectAsState6.getValue();
                if (str5 != null) {
                    switch (str5) {
                        case "annual":
                            str = "Platinum Pass ✨";
                            break;
                        case "lifetime":
                            str = "Diamond Pass ✨";
                            break;
                        case "monthly":
                            str = "Silver Pass ✨";
                            break;
                        case "half_yearly":
                            str = "Gold Pass ✨";
                            break;
                        default:
                            str = "Active Pass ✨";
                            break;
                    }
                } else {
                    str = "Active Pass ✨";
                }
            } else {
                str = "Free Account";
            }
            String str6 = str;
            float f7 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6403constructorimpl(f7));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion5 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
            a constructor4 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG3 = p035i0.a.g(companion6, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap);
            if (composerM3407constructorimpl4.getInserting()) {
                str2 = str6;
            } else {
                str2 = str6;
                if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier, companion6.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f8 = 4;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(companion4, Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f7));
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
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
                e eVarG4 = p035i0.a.g(companion6, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap2);
                if (composerM3407constructorimpl.getInserting()) {
                    f5 = f7;
                } else {
                    f5 = f7;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion6.getSetModifier());
                    materialTheme = MaterialTheme.INSTANCE;
                    i7 = MaterialTheme.$stable;
                    TextStyle displaySmall = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
                    companion = FontWeight.Companion;
                    FontWeight bold = companion.getBold();
                    long j6 = p107y3.a.f15990o;
                    TextKt.m2432Text4IGK_g("Settings & Info", (Modifier) null, j6, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, displaySmall, composerStartRestartGroup, 196998, 0, 65498);
                    b.m(f8, companion4, composerStartRestartGroup, 6);
                    TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                    long j7 = p107y3.a.q;
                    TextKt.m2432Text4IGK_g("Manage your profile, preferences, and view legal guidelines.", (Modifier) null, j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium, composerStartRestartGroup, 390, 0, 65530);
                    composerStartRestartGroup.endNode();
                    if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(-1951932492);
                        float f9 = 8;
                        TextKt.m2432Text4IGK_g("Account", PaddingKt.m672paddingqDBjuR0$default(companion4, Dp.m6403constructorimpl(f9), 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 6, null), Color.m3926copywmQWz5c$default(p107y3.a.f15980c, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i7).getLabelLarge(), composerStartRestartGroup, 12779910, 0, 65368);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(j5, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                        float fM6403constructorimpl = Dp.m6403constructorimpl(6);
                        r15 = 1;
                        i8 = 54;
                        C2486ge c2486ge = new C2486ge(j5, onNavigate, authManager, context, brushM3876horizontalGradient8A3gB4$default, stateCollectAsState5, stateCollectAsState3, stateCollectAsState4, str2, stateCollectAsState2, stateCollectAsState6, stateCollectAsState7);
                        composer2 = composerStartRestartGroup;
                        p097w3.j.a(modifierFillMaxWidth$default, 0L, jM3926copywmQWz5c$default, fM6403constructorimpl, null, ComposableLambdaKt.rememberComposableLambda(-1808349607, true, c2486ge, composer2, 54), composer2, 199686, 18);
                        composer2.endReplaceGroup();
                        companion2 = companion6;
                        companion3 = companion4;
                        modifier2 = null;
                        f6 = 0.0f;
                        i9 = 6;
                    } else {
                        composer2 = composerStartRestartGroup;
                        r15 = 1;
                        i8 = 54;
                        composer2.startReplaceGroup(-1945310582);
                        Modifier.Companion companion7 = companion4;
                        modifier2 = null;
                        f6 = 0.0f;
                        i9 = 6;
                        companion2 = companion6;
                        p097w3.j.a(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), 0L, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m6403constructorimpl(6), null, ComposableLambdaKt.rememberComposableLambda(1740527202, true, new C2518ie(coroutineScope, authManager, context, stateCollectAsState8), composer2, 54), composer2, 200070, 18);
                        composer2.endReplaceGroup();
                        companion3 = companion7;
                    }
                    float f10 = 24;
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f10)), composer2, i9);
                    c("Product", modifier2, ComposableLambdaKt.rememberComposableLambda(232938206, r15, new C2534je(onNavigate), composer2, i8), composer2, 390);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f10)), composer2, i9);
                    c("Company", modifier2, ComposableLambdaKt.rememberComposableLambda(-1845362859, r15, new C2550ke(onNavigate), composer2, i8), composer2, 390);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f10)), composer2, i9);
                    c("Legal", modifier2, ComposableLambdaKt.rememberComposableLambda(-1596084458, r15, new C2566le(onNavigate), composer2, i8), composer2, 390);
                    b.m(48, companion3, composer2, i9);
                    Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, f6, r15, modifier2), f6, Dp.m6403constructorimpl(32), r15, modifier2);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getCenterHorizontally(), composer2, 48);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default);
                    constructor2 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                    eVarG = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion2.getSetModifier());
                    float f11 = 14;
                    Modifier modifierG = b.g(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(60)), f11);
                    Color.Companion companion8 = Color.Companion;
                    Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f11, BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl((float) r15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(12));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs2);
                    constructor3 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                    eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier4, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    cVar = onNavigate;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_real_logo, composer2, 0), "NotesCrafter Logo", SizeKt.fillMaxSize$default(companion3, f6, r15, modifier2), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                    b.n(composer2, f5, companion3, composer2, 6);
                    TextKt.m2432Text4IGK_g("NotesCrafter for Android", (Modifier) null, j6, 0L, (FontStyle) null, companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getTitleMedium(), composer2, 196998, 0, 65498);
                    b.m(6, companion3, composer2, 6);
                    TextKt.m2432Text4IGK_g("© 2026 NotesCrafter. All rights reserved.", (Modifier) null, j7, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getBodySmall(), composer2, 3462, 0, 65522);
                    composer2.endNode();
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(100)), composer2, 6);
                    composer2.endNode();
                    modifier3 = companion3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        modifier3 = companion3;
                    }
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG4);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion6.getSetModifier());
                materialTheme = MaterialTheme.INSTANCE;
                i7 = MaterialTheme.$stable;
                TextStyle displaySmall2 = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
                companion = FontWeight.Companion;
                FontWeight bold2 = companion.getBold();
                long j8 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g("Settings & Info", (Modifier) null, j8, 0L, (FontStyle) null, bold2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, displaySmall2, composerStartRestartGroup, 196998, 0, 65498);
                b.m(f8, companion4, composerStartRestartGroup, 6);
                TextStyle bodyMedium2 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                long j9 = p107y3.a.q;
                TextKt.m2432Text4IGK_g("Manage your profile, preferences, and view legal guidelines.", (Modifier) null, j9, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium2, composerStartRestartGroup, 390, 0, 65530);
                composerStartRestartGroup.endNode();
                if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1951932492);
                    float f12 = 8;
                    TextKt.m2432Text4IGK_g("Account", PaddingKt.m672paddingqDBjuR0$default(companion4, Dp.m6403constructorimpl(f12), 0.0f, 0.0f, Dp.m6403constructorimpl(f12), 6, null), Color.m3926copywmQWz5c$default(p107y3.a.f15980c, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i7).getLabelLarge(), composerStartRestartGroup, 12779910, 0, 65368);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(j5, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                    float fM6403constructorimpl2 = Dp.m6403constructorimpl(6);
                    r15 = 1;
                    i8 = 54;
                    C2486ge c2486ge2 = new C2486ge(j5, onNavigate, authManager, context, brushM3876horizontalGradient8A3gB4$default, stateCollectAsState5, stateCollectAsState3, stateCollectAsState4, str2, stateCollectAsState2, stateCollectAsState6, stateCollectAsState7);
                    composer2 = composerStartRestartGroup;
                    p097w3.j.a(modifierFillMaxWidth$default2, 0L, jM3926copywmQWz5c$default2, fM6403constructorimpl2, null, ComposableLambdaKt.rememberComposableLambda(-1808349607, true, c2486ge2, composer2, 54), composer2, 199686, 18);
                    composer2.endReplaceGroup();
                    companion2 = companion6;
                    companion3 = companion4;
                    modifier2 = null;
                    f6 = 0.0f;
                    i9 = 6;
                } else {
                    composer2 = composerStartRestartGroup;
                    r15 = 1;
                    i8 = 54;
                    composer2.startReplaceGroup(-1945310582);
                    Modifier.Companion companion9 = companion4;
                    modifier2 = null;
                    f6 = 0.0f;
                    i9 = 6;
                    companion2 = companion6;
                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), 0L, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m6403constructorimpl(6), null, ComposableLambdaKt.rememberComposableLambda(1740527202, true, new C2518ie(coroutineScope, authManager, context, stateCollectAsState8), composer2, 54), composer2, 200070, 18);
                    composer2.endReplaceGroup();
                    companion3 = companion9;
                }
                float f13 = 24;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f13)), composer2, i9);
                c("Product", modifier2, ComposableLambdaKt.rememberComposableLambda(232938206, r15, new C2534je(onNavigate), composer2, i8), composer2, 390);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f13)), composer2, i9);
                c("Company", modifier2, ComposableLambdaKt.rememberComposableLambda(-1845362859, r15, new C2550ke(onNavigate), composer2, i8), composer2, 390);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f13)), composer2, i9);
                c("Legal", modifier2, ComposableLambdaKt.rememberComposableLambda(-1596084458, r15, new C2566le(onNavigate), composer2, i8), composer2, 390);
                b.m(48, companion3, composer2, i9);
                Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, f6, r15, modifier2), f6, Dp.m6403constructorimpl(32), r15, modifier2);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default2);
                constructor2 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                eVarG = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap5);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier5, companion2.getSetModifier());
                float f14 = 14;
                Modifier modifierG2 = b.g(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(60)), f14);
                Color.Companion companion10 = Color.Companion;
                Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(b.e(f14, BackgroundKt.m207backgroundbw27NRU$default(modifierG2, Color.m3926copywmQWz5c$default(companion10.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl((float) r15), Color.m3926copywmQWz5c$default(companion10.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(12));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs3);
                constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap6);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier6, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                cVar = onNavigate;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_real_logo, composer2, 0), "NotesCrafter Logo", SizeKt.fillMaxSize$default(companion3, f6, r15, modifier2), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                b.n(composer2, f5, companion3, composer2, 6);
                TextKt.m2432Text4IGK_g("NotesCrafter for Android", (Modifier) null, j8, 0L, (FontStyle) null, companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getTitleMedium(), composer2, 196998, 0, 65498);
                b.m(6, companion3, composer2, 6);
                TextKt.m2432Text4IGK_g("© 2026 NotesCrafter. All rights reserved.", (Modifier) null, j9, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getBodySmall(), composer2, 3462, 0, 65522);
                composer2.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(100)), composer2, 6);
                composer2.endNode();
                modifier3 = companion3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    modifier3 = companion3;
                }
            }
            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier, companion6.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            float f15 = 4;
            Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(companion4, Dp.m6403constructorimpl(f15), Dp.m6403constructorimpl(f7));
            MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN5);
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
            e eVarG5 = p035i0.a.g(companion6, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap7);
            if (composerM3407constructorimpl.getInserting()) {
                f5 = f7;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion6.getSetModifier());
                materialTheme = MaterialTheme.INSTANCE;
                i7 = MaterialTheme.$stable;
                TextStyle displaySmall3 = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
                companion = FontWeight.Companion;
                FontWeight bold3 = companion.getBold();
                long j10 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g("Settings & Info", (Modifier) null, j10, 0L, (FontStyle) null, bold3, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, displaySmall3, composerStartRestartGroup, 196998, 0, 65498);
                b.m(f15, companion4, composerStartRestartGroup, 6);
                TextStyle bodyMedium3 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
                long j11 = p107y3.a.q;
                TextKt.m2432Text4IGK_g("Manage your profile, preferences, and view legal guidelines.", (Modifier) null, j11, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium3, composerStartRestartGroup, 390, 0, 65530);
                composerStartRestartGroup.endNode();
                if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1951932492);
                    float f16 = 8;
                    TextKt.m2432Text4IGK_g("Account", PaddingKt.m672paddingqDBjuR0$default(companion4, Dp.m6403constructorimpl(f16), 0.0f, 0.0f, Dp.m6403constructorimpl(f16), 6, null), Color.m3926copywmQWz5c$default(p107y3.a.f15980c, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i7).getLabelLarge(), composerStartRestartGroup, 12779910, 0, 65368);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(j5, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                    float fM6403constructorimpl3 = Dp.m6403constructorimpl(6);
                    r15 = 1;
                    i8 = 54;
                    C2486ge c2486ge3 = new C2486ge(j5, onNavigate, authManager, context, brushM3876horizontalGradient8A3gB4$default, stateCollectAsState5, stateCollectAsState3, stateCollectAsState4, str2, stateCollectAsState2, stateCollectAsState6, stateCollectAsState7);
                    composer2 = composerStartRestartGroup;
                    p097w3.j.a(modifierFillMaxWidth$default3, 0L, jM3926copywmQWz5c$default3, fM6403constructorimpl3, null, ComposableLambdaKt.rememberComposableLambda(-1808349607, true, c2486ge3, composer2, 54), composer2, 199686, 18);
                    composer2.endReplaceGroup();
                    companion2 = companion6;
                    companion3 = companion4;
                    modifier2 = null;
                    f6 = 0.0f;
                    i9 = 6;
                } else {
                    composer2 = composerStartRestartGroup;
                    r15 = 1;
                    i8 = 54;
                    composer2.startReplaceGroup(-1945310582);
                    Modifier.Companion companion11 = companion4;
                    modifier2 = null;
                    f6 = 0.0f;
                    i9 = 6;
                    companion2 = companion6;
                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), 0L, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m6403constructorimpl(6), null, ComposableLambdaKt.rememberComposableLambda(1740527202, true, new C2518ie(coroutineScope, authManager, context, stateCollectAsState8), composer2, 54), composer2, 200070, 18);
                    composer2.endReplaceGroup();
                    companion3 = companion11;
                }
                float f17 = 24;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f17)), composer2, i9);
                c("Product", modifier2, ComposableLambdaKt.rememberComposableLambda(232938206, r15, new C2534je(onNavigate), composer2, i8), composer2, 390);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f17)), composer2, i9);
                c("Company", modifier2, ComposableLambdaKt.rememberComposableLambda(-1845362859, r15, new C2550ke(onNavigate), composer2, i8), composer2, 390);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f17)), composer2, i9);
                c("Legal", modifier2, ComposableLambdaKt.rememberComposableLambda(-1596084458, r15, new C2566le(onNavigate), composer2, i8), composer2, 390);
                b.m(48, companion3, composer2, i9);
                Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, f6, r15, modifier2), f6, Dp.m6403constructorimpl(32), r15, modifier2);
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default3);
                constructor2 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                eVarG = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl2, currentCompositionLocalMap8);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier8, companion2.getSetModifier());
                float f18 = 14;
                Modifier modifierG3 = b.g(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(60)), f18);
                Color.Companion companion12 = Color.Companion;
                Modifier modifierM668padding3ABfNKs4 = PaddingKt.m668padding3ABfNKs(b.e(f18, BackgroundKt.m207backgroundbw27NRU$default(modifierG3, Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl((float) r15), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(12));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs4);
                constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap9);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier9, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                cVar = onNavigate;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_real_logo, composer2, 0), "NotesCrafter Logo", SizeKt.fillMaxSize$default(companion3, f6, r15, modifier2), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
                b.n(composer2, f5, companion3, composer2, 6);
                TextKt.m2432Text4IGK_g("NotesCrafter for Android", (Modifier) null, j10, 0L, (FontStyle) null, companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getTitleMedium(), composer2, 196998, 0, 65498);
                b.m(6, companion3, composer2, 6);
                TextKt.m2432Text4IGK_g("© 2026 NotesCrafter. All rights reserved.", (Modifier) null, j11, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getBodySmall(), composer2, 3462, 0, 65522);
                composer2.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(100)), composer2, 6);
                composer2.endNode();
                modifier3 = companion3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    modifier3 = companion3;
                }
            } else {
                f5 = f7;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG5);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion6.getSetModifier());
            materialTheme = MaterialTheme.INSTANCE;
            i7 = MaterialTheme.$stable;
            TextStyle displaySmall4 = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
            companion = FontWeight.Companion;
            FontWeight bold4 = companion.getBold();
            long j12 = p107y3.a.f15990o;
            TextKt.m2432Text4IGK_g("Settings & Info", (Modifier) null, j12, 0L, (FontStyle) null, bold4, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, displaySmall4, composerStartRestartGroup, 196998, 0, 65498);
            b.m(f15, companion4, composerStartRestartGroup, 6);
            TextStyle bodyMedium4 = materialTheme.getTypography(composerStartRestartGroup, i7).getBodyMedium();
            long j13 = p107y3.a.q;
            TextKt.m2432Text4IGK_g("Manage your profile, preferences, and view legal guidelines.", (Modifier) null, j13, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium4, composerStartRestartGroup, 390, 0, 65530);
            composerStartRestartGroup.endNode();
            if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1951932492);
                float f19 = 8;
                TextKt.m2432Text4IGK_g("Account", PaddingKt.m672paddingqDBjuR0$default(companion4, Dp.m6403constructorimpl(f19), 0.0f, 0.0f, Dp.m6403constructorimpl(f19), 6, null), Color.m3926copywmQWz5c$default(p107y3.a.f15980c, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i7).getLabelLarge(), composerStartRestartGroup, 12779910, 0, 65368);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(j5, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                float fM6403constructorimpl4 = Dp.m6403constructorimpl(6);
                r15 = 1;
                i8 = 54;
                C2486ge c2486ge4 = new C2486ge(j5, onNavigate, authManager, context, brushM3876horizontalGradient8A3gB4$default, stateCollectAsState5, stateCollectAsState3, stateCollectAsState4, str2, stateCollectAsState2, stateCollectAsState6, stateCollectAsState7);
                composer2 = composerStartRestartGroup;
                p097w3.j.a(modifierFillMaxWidth$default4, 0L, jM3926copywmQWz5c$default4, fM6403constructorimpl4, null, ComposableLambdaKt.rememberComposableLambda(-1808349607, true, c2486ge4, composer2, 54), composer2, 199686, 18);
                composer2.endReplaceGroup();
                companion2 = companion6;
                companion3 = companion4;
                modifier2 = null;
                f6 = 0.0f;
                i9 = 6;
            } else {
                composer2 = composerStartRestartGroup;
                r15 = 1;
                i8 = 54;
                composer2.startReplaceGroup(-1945310582);
                Modifier.Companion companion13 = companion4;
                modifier2 = null;
                f6 = 0.0f;
                i9 = 6;
                companion2 = companion6;
                p097w3.j.a(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), 0L, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m6403constructorimpl(6), null, ComposableLambdaKt.rememberComposableLambda(1740527202, true, new C2518ie(coroutineScope, authManager, context, stateCollectAsState8), composer2, 54), composer2, 200070, 18);
                composer2.endReplaceGroup();
                companion3 = companion13;
            }
            float f110 = 24;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f110)), composer2, i9);
            c("Product", modifier2, ComposableLambdaKt.rememberComposableLambda(232938206, r15, new C2534je(onNavigate), composer2, i8), composer2, 390);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f110)), composer2, i9);
            c("Company", modifier2, ComposableLambdaKt.rememberComposableLambda(-1845362859, r15, new C2550ke(onNavigate), composer2, i8), composer2, 390);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f110)), composer2, i9);
            c("Legal", modifier2, ComposableLambdaKt.rememberComposableLambda(-1596084458, r15, new C2566le(onNavigate), composer2, i8), composer2, 390);
            b.m(48, companion3, composer2, i9);
            Modifier modifierM670paddingVpY3zN4$default4 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, f6, r15, modifier2), f6, Dp.m6403constructorimpl(32), r15, modifier2);
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getCenterHorizontally(), composer2, 48);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default4);
            constructor2 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
            eVarG = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl2, currentCompositionLocalMap10);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier10, companion2.getSetModifier());
            float f111 = 14;
            Modifier modifierG4 = b.g(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(60)), f111);
            Color.Companion companion14 = Color.Companion;
            Modifier modifierM668padding3ABfNKs5 = PaddingKt.m668padding3ABfNKs(b.e(f111, BackgroundKt.m207backgroundbw27NRU$default(modifierG4, Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl((float) r15), Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(12));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs5);
            constructor3 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
            eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl3, currentCompositionLocalMap11);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier11, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            cVar = onNavigate;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_real_logo, composer2, 0), "NotesCrafter Logo", SizeKt.fillMaxSize$default(companion3, f6, r15, modifier2), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composer2, 25008, 104);
            b.n(composer2, f5, companion3, composer2, 6);
            TextKt.m2432Text4IGK_g("NotesCrafter for Android", (Modifier) null, j12, 0L, (FontStyle) null, companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getTitleMedium(), composer2, 196998, 0, 65498);
            b.m(6, companion3, composer2, 6);
            TextKt.m2432Text4IGK_g("© 2026 NotesCrafter. All rights reserved.", (Modifier) null, j13, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i7).getBodySmall(), composer2, 3462, 0, 65522);
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(100)), composer2, 6);
            composer2.endNode();
            modifier3 = companion3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                modifier3 = companion3;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a(cVar, authManager, modifier3, i5));
        }
    }

    public static final void c(String str, Modifier modifier, ComposableLambda content, Composer composer, int i5) {
        int i6;
        Modifier modifier2;
        o.f(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-574967259);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        int i7 = i6 | 48;
        if ((i5 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(content) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i7 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-574967259, i7, -1, "com.notescrafter.ui.screens.SettingsSection (SettingsScreen.kt:550)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String upperCase = str.toUpperCase(Locale.ROOT);
            o.e(upperCase, "toUpperCase(...)");
            float f5 = 8;
            TextKt.m2432Text4IGK_g(upperCase, PaddingKt.m672paddingqDBjuR0$default(companion, Dp.m6403constructorimpl(f5), 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 6, null), Color.m3926copywmQWz5c$default(p107y3.a.f15980c, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelLarge(), composerStartRestartGroup, 12779904, 0, 65368);
            p097w3.j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1212360000, true, new C2582me(content), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a((Object) str, (Object) modifier2, (B3.c) content, i5, 9));
        }
    }
}

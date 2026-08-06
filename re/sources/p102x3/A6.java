package p102x3;

import C3.u;
import O3.a;
import O3.c;
import O3.e;
import P0.b;
import Y3.d;
import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.jvm.internal.o;
import p083t3.C2292j;
import p083t3.C2306q;
import p083t3.C2321y;
import p083t3.I;
import p087u3.g;
import p097w3.j;
import p097w3.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A6 {
    public static final void a(e onMove, c onResize, EnumC2422ce resizeMode, a onResizeModeChange, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onMove, "onMove");
        o.f(onResize, "onResize");
        o.f(resizeMode, "resizeMode");
        o.f(onResizeModeChange, "onResizeModeChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1900890946);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onMove) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onResize) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(resizeMode) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onResizeModeChange) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.Clip : Fields.Shape;
        }
        if ((i6 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1900890946, i6, -1, "com.notescrafter.ui.screens.FineTuneControls (LogoSelectionScreen.kt:479)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a constructor = companion.getConstructor();
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
            e eVarG = p035i0.a.g(companion, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            float f5 = 72;
            j.a(SizeKt.fillMaxWidth$default(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1119348643, true, new C2685t6(onMove), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(12)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            j.a(SizeKt.fillMaxWidth$default(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1484164628, true, new C2717v6(onResize, resizeMode, onResizeModeChange), composerStartRestartGroup, 54), composer2, 196614, 30);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2567m(onMove, onResize, resizeMode, onResizeModeChange, modifier, i5, 3));
        }
    }

    public static final void b(long j5, RectF selection, B6 shape, c onSelectionChange, Modifier modifier, Composer composer, int i5) {
        int i6;
        o.f(selection, "selection");
        o.f(shape, "shape");
        o.f(onSelectionChange, "onSelectionChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-16775647);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(j5) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(selection) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(shape) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.Clip : Fields.Shape;
        }
        if ((i6 & 8339) == 8338 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-16775647, i6, -1, "com.notescrafter.ui.screens.LogoSelectionOverlay (LogoSelectionScreen.kt:422)");
            }
            final float fM3755getWidthimpl = Size.m3755getWidthimpl(j5) * selection.left;
            final float fM3752getHeightimpl = Size.m3752getHeightimpl(j5) * selection.top;
            float fM3755getWidthimpl2 = Size.m3755getWidthimpl(j5) * selection.width();
            float fM3752getHeightimpl2 = Size.m3752getHeightimpl(j5) * selection.height();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            composerStartRestartGroup.startReplaceGroup(1792221968);
            boolean zChanged = composerStartRestartGroup.changed(fM3755getWidthimpl) | composerStartRestartGroup.changed(fM3752getHeightimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new c() { // from class: x3.q6
                    @Override // O3.c
                    public final Object invoke(Object obj) {
                        Density offset = (Density) obj;
                        o.f(offset, "$this$offset");
                        return IntOffset.m6522boximpl(IntOffsetKt.IntOffset(Q3.a.Q(fM3755getWidthimpl), Q3.a.Q(fM3752getHeightimpl)));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM715sizeVpY3zN4 = SizeKt.m715sizeVpY3zN4(OffsetKt.offset(companion3, (c) objRememberedValue), Dp.m6401boximpl(density.mo345toDpu2uoSUM(fM3755getWidthimpl2)).m6417unboximpl(), density.mo345toDpu2uoSUM(fM3752getHeightimpl2));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM715sizeVpY3zN4);
            a constructor2 = companion2.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(700221051);
            boolean z3 = (i6 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new b(shape, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierFillMaxSize$default2, (c) objRememberedValue2, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2653r6(j5, selection, shape, onSelectionChange, modifier, i5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x034b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0359  */
    /* JADX WARN: Code duplicated, block: B:107:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:110:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:114:0x0407  */
    /* JADX WARN: Code duplicated, block: B:116:0x0415  */
    /* JADX WARN: Code duplicated, block: B:119:0x0423  */
    /* JADX WARN: Code duplicated, block: B:120:0x0428  */
    /* JADX WARN: Code duplicated, block: B:122:0x042b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0456  */
    /* JADX WARN: Code duplicated, block: B:127:0x048b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0522  */
    /* JADX WARN: Code duplicated, block: B:136:0x052a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0598  */
    /* JADX WARN: Code duplicated, block: B:142:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:143:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:146:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:148:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:151:0x0628  */
    /* JADX WARN: Code duplicated, block: B:154:0x0642  */
    /* JADX WARN: Code duplicated, block: B:155:0x064f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0670  */
    /* JADX WARN: Code duplicated, block: B:161:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:164:0x06de  */
    /* JADX WARN: Code duplicated, block: B:165:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:168:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:171:0x0704  */
    /* JADX WARN: Code duplicated, block: B:175:0x0782  */
    /* JADX WARN: Code duplicated, block: B:176:0x0784  */
    /* JADX WARN: Code duplicated, block: B:179:0x078c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0796  */
    /* JADX WARN: Code duplicated, block: B:186:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0210  */
    /* JADX WARN: Code duplicated, block: B:84:0x021c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0220  */
    /* JADX WARN: Code duplicated, block: B:88:0x0231  */
    /* JADX WARN: Code duplicated, block: B:91:0x0242  */
    /* JADX WARN: Code duplicated, block: B:95:0x0328  */
    /* JADX WARN: Code duplicated, block: B:98:0x0334  */
    /* JADX WARN: Code duplicated, block: B:99:0x0338  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(List pages, RectF rectF, e onConfirm, a onCancel, Modifier modifier, Composer composer, int i5) {
        int i6;
        MutableState mutableState;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        Arrangement arrangement;
        MutableState mutableState2;
        Composer composer2;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        Bitmap thumbnail;
        MutableState mutableState3;
        int i7;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG3;
        Object objRememberedValue;
        Object objK;
        MutableState mutableState4;
        Object objRememberedValue2;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        MutableState mutableState5;
        MutableState mutableState6;
        Modifier modifier2;
        boolean z3;
        Object objRememberedValue3;
        Object objRememberedValue4;
        o.f(pages, "pages");
        o.f(onConfirm, "onConfirm");
        o.f(onCancel, "onCancel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-316513665);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(pages) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(rectF) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onConfirm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onCancel) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i8 = i6 | 24576;
        if ((i8 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-316513665, i8, -1, "com.notescrafter.ui.screens.LogoSelectionScreen (LogoSelectionScreen.kt:80)");
            }
            composerStartRestartGroup.startReplaceGroup(-1615556589);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rectF == null ? new RectF(0.89f, 0.0f, 1.0f, 0.16f) : rectF, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue5;
            Object objK2 = p076s.b.k(composerStartRestartGroup, -1615552175);
            if (objK2 == companion2.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(B6.f13795o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState8 = (MutableState) objK2;
            Object objK3 = p076s.b.k(composerStartRestartGroup, -1615549907);
            if (objK3 == companion2.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EnumC2422ce.f14895o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            MutableState mutableState9 = (MutableState) objK3;
            Object objK4 = p076s.b.k(composerStartRestartGroup, -1615547582);
            if (objK4 == companion2.getEmpty()) {
                objK4 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            MutableIntState mutableIntState = (MutableIntState) objK4;
            composerStartRestartGroup.endReplaceGroup();
            g gVar = (g) u.s0(mutableIntState.getIntValue(), pages);
            if (gVar == null) {
                gVar = (g) u.r0(pages);
            }
            g gVar2 = gVar;
            composerStartRestartGroup.startReplaceGroup(-1615539734);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m6565boximpl(IntSize.Companion.m6578getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState10 = (MutableState) objRememberedValue6;
            Object objK5 = p076s.b.k(composerStartRestartGroup, -1615536061);
            if (objK5 == companion2.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            MutableState mutableState11 = (MutableState) objK5;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement2.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor6 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap);
            if (composerM3407constructorimpl6.getInserting()) {
                mutableState = mutableState8;
            } else {
                mutableState = mutableState8;
                if (!o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier, companion4.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f5 = 16;
                Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
                constructor = companion4.getConstructor();
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
                e eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap2);
                if (composerM3407constructorimpl.getInserting()) {
                    arrangement = arrangement2;
                } else {
                    arrangement = arrangement2;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i9 = MaterialTheme.$stable;
                    TextStyle titleLarge = materialTheme.getTypography(composerStartRestartGroup, i9).getTitleLarge();
                    long j5 = p107y3.a.f15990o;
                    TextKt.m2432Text4IGK_g("Select Logo Region", (Modifier) null, j5, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge, composerStartRestartGroup, 196998, 0, 65498);
                    int i10 = (i8 >> 9) & 14;
                    mutableState2 = mutableState;
                    IconButtonKt.IconButton(onCancel, null, false, null, null, AbstractC2647r0.f15463a, composerStartRestartGroup, i10 | 196608, 30);
                    composerStartRestartGroup.endNode();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ScrollKt.verticalScroll$default(modifierFillMaxWidth$default, ScrollKt.rememberScrollState(0, composer2, 0, 1), !((Boolean) mutableState11.getValue()).booleanValue(), null, false, 12, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default);
                    constructor2 = companion4.getConstructor();
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
                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion4.getSetModifier());
                    j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1100219150, true, new C2765y6(mutableState2, pages, mutableIntState), composer2, 54), composer2, 196614, 30);
                    p076s.b.m(f5, companion, composer2, 6);
                    float f6 = 8;
                    Modifier modifierG = p076s.b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f6);
                    Color.Companion companion5 = Color.Companion;
                    Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierG, companion5.m3953getBlack0d7_KjU(), null, 2, null);
                    float f7 = 1;
                    float fM6403constructorimpl = Dp.m6403constructorimpl(f7);
                    long j6 = p107y3.a.f15991r;
                    Modifier modifierClipToBounds = ClipKt.clipToBounds(BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default, fM6403constructorimpl, j6, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6))));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierClipToBounds);
                    constructor3 = companion4.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier4, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (gVar2 != null) {
                        thumbnail = gVar2.getThumbnail();
                    } else {
                        thumbnail = null;
                    }
                    if (thumbnail != null) {
                        composer2.startReplaceGroup(794496506);
                        ImageBitmap imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(gVar2.getThumbnail());
                        ContentScale fillWidth = ContentScale.Companion.getFillWidth();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        composer2.startReplaceGroup(579836880);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            objRememberedValue4 = new C2321y(5, mutableState10);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        ImageKt.m266Image5hnEew(imageBitmapAsImageBitmap, "PDF Page Preview", OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default2, (c) objRememberedValue4), null, fillWidth, 0.0f, null, 0, composer2, 25008, 232);
                        if (IntSize.m6573getWidthimpl(((IntSize) mutableState10.getValue()).m6577unboximpl()) > 0 || IntSize.m6572getHeightimpl(((IntSize) mutableState10.getValue()).m6577unboximpl()) <= 0) {
                            mutableState3 = mutableState7;
                        } else {
                            long jM6585toSizeozmzZPI = IntSizeKt.m6585toSizeozmzZPI(((IntSize) mutableState10.getValue()).m6577unboximpl());
                            RectF rectF2 = (RectF) mutableState7.getValue();
                            B6 b6 = (B6) mutableState2.getValue();
                            composer2.startReplaceGroup(579869182);
                            Object objRememberedValue7 = composer2.rememberedValue();
                            if (objRememberedValue7 == companion2.getEmpty()) {
                                mutableState3 = mutableState7;
                                objRememberedValue7 = new C2321y(6, mutableState3);
                                composer2.updateRememberedValue(objRememberedValue7);
                            } else {
                                mutableState3 = mutableState7;
                            }
                            composer2.endReplaceGroup();
                            b(jM6585toSizeozmzZPI, rectF2, b6, (c) objRememberedValue7, SizeKt.m715sizeVpY3zN4(companion, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo346toDpu2uoSUM(IntSize.m6573getWidthimpl(((IntSize) mutableState10.getValue()).m6577unboximpl())), ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo346toDpu2uoSUM(IntSize.m6572getHeightimpl(((IntSize) mutableState10.getValue()).m6577unboximpl()))), composer2, 3072);
                        }
                        composer2.endReplaceGroup();
                        i7 = 32;
                    } else {
                        mutableState3 = mutableState7;
                        composer2.startReplaceGroup(796453350);
                        i7 = 32;
                        ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(32)), p107y3.a.f15978a, 0.0f, 0L, 0, composer2, 54, 28);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(i7)), composer2, 6);
                    composer2.endNode();
                    Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs2);
                    constructor4 = companion4.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier5, companion4.getSetModifier());
                    TextKt.m2432Text4IGK_g("Logo will be removed from all pages", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i9).getBodySmall(), composer2, 390, 0, 65530);
                    float f8 = 12;
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f8)), composer2, 6);
                    composer2.startReplaceGroup(398337671);
                    objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = new C2622p6(mutableState3, 0);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    e eVar = (e) objRememberedValue;
                    objK = p076s.b.k(composer2, 398350357);
                    if (objK == companion2.getEmpty()) {
                        mutableState4 = mutableState9;
                        objK = new d(8, mutableState3, mutableState4);
                        composer2.updateRememberedValue(objK);
                    } else {
                        mutableState4 = mutableState9;
                    }
                    c cVar = (c) objK;
                    composer2.endReplaceGroup();
                    EnumC2422ce enumC2422ce = (EnumC2422ce) mutableState4.getValue();
                    composer2.startReplaceGroup(398401562);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new I(27, mutableState4);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    a(eVar, cVar, enumC2422ce, (a) objRememberedValue2, PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), composer2, 27702);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion3.getTop(), composer2, 6);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                    constructor5 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                    e eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl5.getInserting()) {
                        mutableState5 = mutableState2;
                    } else {
                        if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        }
                        mutableState5 = mutableState2;
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier6, companion4.getSetModifier());
                        mutableState6 = mutableState5;
                        modifier2 = companion;
                        ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(companion5.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f7), j6), null, null, AbstractC2647r0.f15464b, composer2, i10 | 806879232, 420);
                        composer2.startReplaceGroup(580010934);
                        if ((i8 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objRememberedValue3 = composer2.rememberedValue();
                        if (z3 || objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        q.a("Apply Selection", (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance, modifier2, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                        if (S2.b(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    mutableState5 = mutableState2;
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG6);
                    mutableState5 = mutableState2;
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier6, companion4.getSetModifier());
                    mutableState6 = mutableState5;
                    modifier2 = companion;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(companion5.m3962getTransparent0d7_KjU(), j5, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f7), j6), null, null, AbstractC2647r0.f15464b, composer2, i10 | 806879232, 420);
                    composer2.startReplaceGroup(580010934);
                    if ((i8 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objRememberedValue3 = composer2.rememberedValue();
                    if (z3) {
                        objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    q.a("Apply Selection", (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance, modifier2, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG5);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i11 = MaterialTheme.$stable;
                TextStyle titleLarge2 = materialTheme2.getTypography(composerStartRestartGroup, i11).getTitleLarge();
                long j7 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g("Select Logo Region", (Modifier) null, j7, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge2, composerStartRestartGroup, 196998, 0, 65498);
                int i12 = (i8 >> 9) & 14;
                mutableState2 = mutableState;
                IconButtonKt.IconButton(onCancel, null, false, null, null, AbstractC2647r0.f15463a, composerStartRestartGroup, i12 | 196608, 30);
                composerStartRestartGroup.endNode();
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                composer2 = composerStartRestartGroup;
                Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(ScrollKt.verticalScroll$default(modifierFillMaxWidth$default4, ScrollKt.rememberScrollState(0, composer2, 0, 1), !((Boolean) mutableState11.getValue()).booleanValue(), null, false, 12, null), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default2);
                constructor2 = companion4.getConstructor();
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
                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap7);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier7, companion4.getSetModifier());
                j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1100219150, true, new C2765y6(mutableState2, pages, mutableIntState), composer2, 54), composer2, 196614, 30);
                p076s.b.m(f5, companion, composer2, 6);
                float f9 = 8;
                Modifier modifierG2 = p076s.b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f9);
                Color.Companion companion6 = Color.Companion;
                Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(modifierG2, companion6.m3953getBlack0d7_KjU(), null, 2, null);
                float f10 = 1;
                float fM6403constructorimpl2 = Dp.m6403constructorimpl(f10);
                long j8 = p107y3.a.f15991r;
                Modifier modifierClipToBounds2 = ClipKt.clipToBounds(BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default2, fM6403constructorimpl2, j8, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierClipToBounds2);
                constructor3 = companion4.getConstructor();
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
                eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap8);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier8, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (gVar2 != null) {
                    thumbnail = gVar2.getThumbnail();
                } else {
                    thumbnail = null;
                }
                if (thumbnail != null) {
                    composer2.startReplaceGroup(794496506);
                    ImageBitmap imageBitmapAsImageBitmap2 = AndroidImageBitmap_androidKt.asImageBitmap(gVar2.getThumbnail());
                    ContentScale fillWidth2 = ContentScale.Companion.getFillWidth();
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composer2.startReplaceGroup(579836880);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        objRememberedValue4 = new C2321y(5, mutableState10);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    ImageKt.m266Image5hnEew(imageBitmapAsImageBitmap2, "PDF Page Preview", OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default5, (c) objRememberedValue4), null, fillWidth2, 0.0f, null, 0, composer2, 25008, 232);
                    if (IntSize.m6573getWidthimpl(((IntSize) mutableState10.getValue()).m6577unboximpl()) > 0) {
                        mutableState3 = mutableState7;
                    } else {
                        mutableState3 = mutableState7;
                    }
                    composer2.endReplaceGroup();
                    i7 = 32;
                } else {
                    mutableState3 = mutableState7;
                    composer2.startReplaceGroup(796453350);
                    i7 = 32;
                    ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(32)), p107y3.a.f15978a, 0.0f, 0L, 0, composer2, 54, 28);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(i7)), composer2, 6);
                composer2.endNode();
                Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs3);
                constructor4 = companion4.getConstructor();
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
                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl4, currentCompositionLocalMap9);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier9, companion4.getSetModifier());
                TextKt.m2432Text4IGK_g("Logo will be removed from all pages", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composer2, i11).getBodySmall(), composer2, 390, 0, 65530);
                float f11 = 12;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f11)), composer2, 6);
                composer2.startReplaceGroup(398337671);
                objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = new C2622p6(mutableState3, 0);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                e eVar2 = (e) objRememberedValue;
                objK = p076s.b.k(composer2, 398350357);
                if (objK == companion2.getEmpty()) {
                    mutableState4 = mutableState9;
                    objK = new d(8, mutableState3, mutableState4);
                    composer2.updateRememberedValue(objK);
                } else {
                    mutableState4 = mutableState9;
                }
                c cVar2 = (c) objK;
                composer2.endReplaceGroup();
                EnumC2422ce enumC2422ce2 = (EnumC2422ce) mutableState4.getValue();
                composer2.startReplaceGroup(398401562);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new I(27, mutableState4);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                a(eVar2, cVar2, enumC2422ce2, (a) objRememberedValue2, PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), composer2, 27702);
                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion3.getTop(), composer2, 6);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default6);
                constructor5 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                e eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap10);
                if (composerM3407constructorimpl5.getInserting()) {
                    if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    }
                    mutableState5 = mutableState2;
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier10, companion4.getSetModifier());
                    mutableState6 = mutableState5;
                    modifier2 = companion;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(companion6.m3962getTransparent0d7_KjU(), j7, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f10), j8), null, null, AbstractC2647r0.f15464b, composer2, i12 | 806879232, 420);
                    composer2.startReplaceGroup(580010934);
                    if ((i8 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objRememberedValue3 = composer2.rememberedValue();
                    if (z3) {
                        objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    q.a("Apply Selection", (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance2, modifier2, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    mutableState5 = mutableState2;
                }
                mutableState5 = mutableState2;
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG7);
                mutableState5 = mutableState2;
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier10, companion4.getSetModifier());
                mutableState6 = mutableState5;
                modifier2 = companion;
                ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(companion6.m3962getTransparent0d7_KjU(), j7, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f10), j8), null, null, AbstractC2647r0.f15464b, composer2, i12 | 806879232, 420);
                composer2.startReplaceGroup(580010934);
                if ((i8 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objRememberedValue3 = composer2.rememberedValue();
                if (z3) {
                    objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                q.a("Apply Selection", (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance2, modifier2, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            float f12 = 16;
            Modifier modifierM668padding3ABfNKs4 = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f12));
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs4);
            constructor = companion4.getConstructor();
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
            e eVarG8 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap11);
            if (composerM3407constructorimpl.getInserting()) {
                arrangement = arrangement2;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier11, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                int i13 = MaterialTheme.$stable;
                TextStyle titleLarge3 = materialTheme3.getTypography(composerStartRestartGroup, i13).getTitleLarge();
                long j9 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g("Select Logo Region", (Modifier) null, j9, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge3, composerStartRestartGroup, 196998, 0, 65498);
                int i14 = (i8 >> 9) & 14;
                mutableState2 = mutableState;
                IconButtonKt.IconButton(onCancel, null, false, null, null, AbstractC2647r0.f15463a, composerStartRestartGroup, i14 | 196608, 30);
                composerStartRestartGroup.endNode();
                Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null);
                composer2 = composerStartRestartGroup;
                Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(ScrollKt.verticalScroll$default(modifierFillMaxWidth$default7, ScrollKt.rememberScrollState(0, composer2, 0, 1), !((Boolean) mutableState11.getValue()).booleanValue(), null, false, 12, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default3);
                constructor2 = companion4.getConstructor();
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
                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl2, currentCompositionLocalMap12);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier12, companion4.getSetModifier());
                j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1100219150, true, new C2765y6(mutableState2, pages, mutableIntState), composer2, 54), composer2, 196614, 30);
                p076s.b.m(f12, companion, composer2, 6);
                float f13 = 8;
                Modifier modifierG3 = p076s.b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f13);
                Color.Companion companion7 = Color.Companion;
                Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(modifierG3, companion7.m3953getBlack0d7_KjU(), null, 2, null);
                float f14 = 1;
                float fM6403constructorimpl3 = Dp.m6403constructorimpl(f14);
                long j10 = p107y3.a.f15991r;
                Modifier modifierClipToBounds3 = ClipKt.clipToBounds(BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default3, fM6403constructorimpl3, j10, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f13))));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer2, modifierClipToBounds3);
                constructor3 = companion4.getConstructor();
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
                eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap13);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier13, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                if (gVar2 != null) {
                    thumbnail = gVar2.getThumbnail();
                } else {
                    thumbnail = null;
                }
                if (thumbnail != null) {
                    composer2.startReplaceGroup(794496506);
                    ImageBitmap imageBitmapAsImageBitmap3 = AndroidImageBitmap_androidKt.asImageBitmap(gVar2.getThumbnail());
                    ContentScale fillWidth3 = ContentScale.Companion.getFillWidth();
                    Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composer2.startReplaceGroup(579836880);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion2.getEmpty()) {
                        objRememberedValue4 = new C2321y(5, mutableState10);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    ImageKt.m266Image5hnEew(imageBitmapAsImageBitmap3, "PDF Page Preview", OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default8, (c) objRememberedValue4), null, fillWidth3, 0.0f, null, 0, composer2, 25008, 232);
                    if (IntSize.m6573getWidthimpl(((IntSize) mutableState10.getValue()).m6577unboximpl()) > 0) {
                        mutableState3 = mutableState7;
                    } else {
                        mutableState3 = mutableState7;
                    }
                    composer2.endReplaceGroup();
                    i7 = 32;
                } else {
                    mutableState3 = mutableState7;
                    composer2.startReplaceGroup(796453350);
                    i7 = 32;
                    ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(32)), p107y3.a.f15978a, 0.0f, 0L, 0, composer2, 54, 28);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(i7)), composer2, 6);
                composer2.endNode();
                Modifier modifierM668padding3ABfNKs5 = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f12));
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs5);
                constructor4 = companion4.getConstructor();
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
                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl4, currentCompositionLocalMap14);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier14, companion4.getSetModifier());
                TextKt.m2432Text4IGK_g("Logo will be removed from all pages", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme3.getTypography(composer2, i13).getBodySmall(), composer2, 390, 0, 65530);
                float f15 = 12;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f15)), composer2, 6);
                composer2.startReplaceGroup(398337671);
                objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = new C2622p6(mutableState3, 0);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                e eVar3 = (e) objRememberedValue;
                objK = p076s.b.k(composer2, 398350357);
                if (objK == companion2.getEmpty()) {
                    mutableState4 = mutableState9;
                    objK = new d(8, mutableState3, mutableState4);
                    composer2.updateRememberedValue(objK);
                } else {
                    mutableState4 = mutableState9;
                }
                c cVar3 = (c) objK;
                composer2.endReplaceGroup();
                EnumC2422ce enumC2422ce3 = (EnumC2422ce) mutableState4.getValue();
                composer2.startReplaceGroup(398401562);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new I(27, mutableState4);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                a(eVar3, cVar3, enumC2422ce3, (a) objRememberedValue2, PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f12), 7, null), composer2, 27702);
                Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), companion3.getTop(), composer2, 6);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default9);
                constructor5 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                e eVarG9 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl5, currentCompositionLocalMap15);
                if (composerM3407constructorimpl5.getInserting()) {
                    if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    }
                    mutableState5 = mutableState2;
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier15, companion4.getSetModifier());
                    mutableState6 = mutableState5;
                    modifier2 = companion;
                    ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f15)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(companion7.m3962getTransparent0d7_KjU(), j9, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f14), j10), null, null, AbstractC2647r0.f15464b, composer2, i14 | 806879232, 420);
                    composer2.startReplaceGroup(580010934);
                    if ((i8 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objRememberedValue3 = composer2.rememberedValue();
                    if (z3) {
                        objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    q.a("Apply Selection", (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance3, modifier2, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    mutableState5 = mutableState2;
                }
                mutableState5 = mutableState2;
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG9);
                mutableState5 = mutableState2;
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier15, companion4.getSetModifier());
                mutableState6 = mutableState5;
                modifier2 = companion;
                ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f15)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(companion7.m3962getTransparent0d7_KjU(), j9, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f14), j10), null, null, AbstractC2647r0.f15464b, composer2, i14 | 806879232, 420);
                composer2.startReplaceGroup(580010934);
                if ((i8 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objRememberedValue3 = composer2.rememberedValue();
                if (z3) {
                    objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                q.a("Apply Selection", (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance3, modifier2, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                arrangement = arrangement2;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG8);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier11, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            TextStyle titleLarge4 = materialTheme4.getTypography(composerStartRestartGroup, i15).getTitleLarge();
            long j11 = p107y3.a.f15990o;
            TextKt.m2432Text4IGK_g("Select Logo Region", (Modifier) null, j11, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge4, composerStartRestartGroup, 196998, 0, 65498);
            int i16 = (i8 >> 9) & 14;
            mutableState2 = mutableState;
            IconButtonKt.IconButton(onCancel, null, false, null, null, AbstractC2647r0.f15463a, composerStartRestartGroup, i16 | 196608, 30);
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            composer2 = composerStartRestartGroup;
            Modifier modifierM670paddingVpY3zN4$default4 = PaddingKt.m670paddingVpY3zN4$default(ScrollKt.verticalScroll$default(modifierFillMaxWidth$default10, ScrollKt.rememberScrollState(0, composer2, 0, 1), !((Boolean) mutableState11.getValue()).booleanValue(), null, false, 12, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default4);
            constructor2 = companion4.getConstructor();
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
            eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl2, currentCompositionLocalMap16);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier16, companion4.getSetModifier());
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1100219150, true, new C2765y6(mutableState2, pages, mutableIntState), composer2, 54), composer2, 196614, 30);
            p076s.b.m(f12, companion, composer2, 6);
            float f16 = 8;
            Modifier modifierG4 = p076s.b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f16);
            Color.Companion companion8 = Color.Companion;
            Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(modifierG4, companion8.m3953getBlack0d7_KjU(), null, 2, null);
            float f17 = 1;
            float fM6403constructorimpl4 = Dp.m6403constructorimpl(f17);
            long j12 = p107y3.a.f15991r;
            Modifier modifierClipToBounds4 = ClipKt.clipToBounds(BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default4, fM6403constructorimpl4, j12, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16))));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap17 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer2, modifierClipToBounds4);
            constructor3 = companion4.getConstructor();
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
            eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl3, currentCompositionLocalMap17);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier17, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            if (gVar2 != null) {
                thumbnail = gVar2.getThumbnail();
            } else {
                thumbnail = null;
            }
            if (thumbnail != null) {
                composer2.startReplaceGroup(794496506);
                ImageBitmap imageBitmapAsImageBitmap4 = AndroidImageBitmap_androidKt.asImageBitmap(gVar2.getThumbnail());
                ContentScale fillWidth4 = ContentScale.Companion.getFillWidth();
                Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer2.startReplaceGroup(579836880);
                objRememberedValue4 = composer2.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = new C2321y(5, mutableState10);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                ImageKt.m266Image5hnEew(imageBitmapAsImageBitmap4, "PDF Page Preview", OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxWidth$default11, (c) objRememberedValue4), null, fillWidth4, 0.0f, null, 0, composer2, 25008, 232);
                if (IntSize.m6573getWidthimpl(((IntSize) mutableState10.getValue()).m6577unboximpl()) > 0) {
                    mutableState3 = mutableState7;
                } else {
                    mutableState3 = mutableState7;
                }
                composer2.endReplaceGroup();
                i7 = 32;
            } else {
                mutableState3 = mutableState7;
                composer2.startReplaceGroup(796453350);
                i7 = 32;
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(32)), p107y3.a.f15978a, 0.0f, 0L, 0, composer2, 54, 28);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(i7)), composer2, 6);
            composer2.endNode();
            Modifier modifierM668padding3ABfNKs6 = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f12));
            MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap18 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs6);
            constructor4 = companion4.getConstructor();
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
            eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl4, currentCompositionLocalMap18);
            if (composerM3407constructorimpl4.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier18, companion4.getSetModifier());
            TextKt.m2432Text4IGK_g("Logo will be removed from all pages", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme4.getTypography(composer2, i15).getBodySmall(), composer2, 390, 0, 65530);
            float f18 = 12;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f18)), composer2, 6);
            composer2.startReplaceGroup(398337671);
            objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new C2622p6(mutableState3, 0);
                composer2.updateRememberedValue(objRememberedValue);
            }
            e eVar4 = (e) objRememberedValue;
            objK = p076s.b.k(composer2, 398350357);
            if (objK == companion2.getEmpty()) {
                mutableState4 = mutableState9;
                objK = new d(8, mutableState3, mutableState4);
                composer2.updateRememberedValue(objK);
            } else {
                mutableState4 = mutableState9;
            }
            c cVar4 = (c) objK;
            composer2.endReplaceGroup();
            EnumC2422ce enumC2422ce4 = (EnumC2422ce) mutableState4.getValue();
            composer2.startReplaceGroup(398401562);
            objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new I(27, mutableState4);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            a(eVar4, cVar4, enumC2422ce4, (a) objRememberedValue2, PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f12), 7, null), composer2, 27702);
            Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), companion3.getTop(), composer2, 6);
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap19 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default12);
            constructor5 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
            e eVarG10 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl5, currentCompositionLocalMap19);
            if (composerM3407constructorimpl5.getInserting()) {
                if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                }
                mutableState5 = mutableState2;
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier19, companion4.getSetModifier());
                mutableState6 = mutableState5;
                modifier2 = companion;
                ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f18)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(companion8.m3962getTransparent0d7_KjU(), j11, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f17), j12), null, null, AbstractC2647r0.f15464b, composer2, i16 | 806879232, 420);
                composer2.startReplaceGroup(580010934);
                if ((i8 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objRememberedValue3 = composer2.rememberedValue();
                if (z3) {
                    objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                    composer2.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                q.a("Apply Selection", (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance4, modifier2, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                mutableState5 = mutableState2;
            }
            mutableState5 = mutableState2;
            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG10);
            mutableState5 = mutableState2;
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier19, companion4.getSetModifier());
            mutableState6 = mutableState5;
            modifier2 = companion;
            ButtonKt.OutlinedButton(onCancel, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f18)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(companion8.m3962getTransparent0d7_KjU(), j11, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f17), j12), null, null, AbstractC2647r0.f15464b, composer2, i16 | 806879232, 420);
            composer2.startReplaceGroup(580010934);
            if ((i8 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            objRememberedValue3 = composer2.rememberedValue();
            if (z3) {
                objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new C2306q(onConfirm, mutableState3, mutableState6, 3);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            q.a("Apply Selection", (a) objRememberedValue3, RowScope.weight$default(rowScopeInstance4, modifier2, 1.0f, false, 2, null), null, false, false, composer2, 6, 56);
            if (S2.b(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2567m(pages, rectF, onConfirm, onCancel, modifier2, i5, 4));
        }
    }

    public static final void d(String str, boolean z3, a onClick, Modifier modifier, Composer composer, int i5) {
        int i6;
        Modifier modifierM699height3ABfNKs;
        Composer composer2;
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1544667457);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i7 = i6;
        if ((i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1544667457, i7, -1, "com.notescrafter.ui.screens.ShapeOption (LogoSelectionScreen.kt:371)");
            }
            long j5 = z3 ? p107y3.a.f15978a : p107y3.a.f15991r;
            long jM3972compositeOverOWjLjI = z3 ? ColorKt.m3972compositeOverOWjLjI(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), p107y3.a.g) : Color.m3926copywmQWz5c$default(p107y3.a.g, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            if (z3) {
                Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(modifier, Dp.m6403constructorimpl(56));
                float fM6403constructorimpl = Dp.m6403constructorimpl(15);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
                long j6 = p107y3.a.f15978a;
                modifierM699height3ABfNKs = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs2, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, j6, j6, 4, null);
            } else {
                modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(modifier, Dp.m6403constructorimpl(56));
            }
            float f5 = 12;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(p076s.b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(p076s.b.g(modifierM699height3ABfNKs, f5), jM3972compositeOverOWjLjI, null, 2, null), Dp.m6403constructorimpl(1), j5), false, null, null, onClick, 7, null), Dp.m6403constructorimpl(16), 0.0f, 2, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(20)), z3 ? p107y3.a.f15978a : Color.Companion.m3962getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(2), z3 ? p107y3.a.f15978a : p107y3.a.q, RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM220borderxT4_qwU);
            a constructor2 = companion2.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-286695980);
            if (z3) {
                BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(8)), Color.Companion.m3964getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion3, Dp.m6403constructorimpl(f5)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, (TextStyle) null, composer2, (i7 & 14) | 200064, 3120, 120786);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2444e4(str, z3, onClick, modifier, i5, 1));
        }
    }

    public static final void e(ImageVector icon, a onClick, Composer composer, int i5) {
        int i6;
        o.f(icon, "icon");
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-121526943);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-121526943, i6, -1, "com.notescrafter.ui.screens.TinyControlIcon (LogoSelectionScreen.kt:541)");
            }
            IconButtonKt.IconButton(onClick, SizeKt.m713size3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(56)), false, null, null, ComposableLambdaKt.rememberComposableLambda(-1261035100, true, new C2781z6(icon), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 3) & 14) | 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2292j(i5, 6, icon, onClick));
        }
    }
}

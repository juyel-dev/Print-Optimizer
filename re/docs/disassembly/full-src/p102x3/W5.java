package p102x3;

import C3.v;
import N0.B;
import O3.a;
import O3.c;
import O3.e;
import O3.g;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class W5 implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14570o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    public W5(ArrayList arrayList, MutableState mutableState, MutableState mutableState2) {
        this.f14570o = arrayList;
        this.p = mutableState;
        this.q = mutableState2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x047e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0480  */
    /* JADX WARN: Code duplicated, block: B:105:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:111:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:114:0x0507  */
    /* JADX WARN: Code duplicated, block: B:118:0x0516  */
    /* JADX WARN: Code duplicated, block: B:121:0x0558  */
    /* JADX WARN: Code duplicated, block: B:123:0x0560  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01df  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0205  */
    /* JADX WARN: Code duplicated, block: B:65:0x024b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0257  */
    /* JADX WARN: Code duplicated, block: B:69:0x025b  */
    /* JADX WARN: Code duplicated, block: B:72:0x026c  */
    /* JADX WARN: Code duplicated, block: B:74:0x027a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0303  */
    /* JADX WARN: Code duplicated, block: B:80:0x030f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0313  */
    /* JADX WARN: Code duplicated, block: B:84:0x0326  */
    /* JADX WARN: Code duplicated, block: B:86:0x0334  */
    /* JADX WARN: Code duplicated, block: B:89:0x043f  */
    /* JADX WARN: Code duplicated, block: B:92:0x044b  */
    /* JADX WARN: Code duplicated, block: B:93:0x044f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0460  */
    /* JADX WARN: Code duplicated, block: B:98:0x046e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Iterator it;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        int i5;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        Composer composer;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG3;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue;
        MutableState mutableState;
        MutableState mutableState2;
        boolean z4;
        boolean zChanged2;
        Object objRememberedValue2;
        MutableState mutableState3;
        MutableState mutableState4;
        boolean z5;
        MutableState mutableState5;
        MutableState mutableState6;
        boolean zChanged3;
        Object objRememberedValue3;
        W5 w5 = this;
        ?? r4 = 1;
        LazyItemScope items = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer2 = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        o.f(items, "$this$items");
        int i6 = 16;
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-122910907, iIntValue2, -1, "com.notescrafter.ui.screens.JpgToPdfScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JpgToPdfScreen.kt:720)");
            }
            List list = (List) w5.f14570o.get(iIntValue);
            float f5 = 4;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(f5), 1, null);
            float f6 = 8;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), Alignment.Companion.getTop(), composer2, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a constructor5 = companion.getConstructor();
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
            e eVarG4 = p035i0.a.g(companion, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-1742120847);
            Iterator it2 = list.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    v.X();
                    throw null;
                }
                C2438de c2438de = (C2438de) next;
                int i9 = (iIntValue * 2) + i7;
                Modifier.Companion companion2 = Modifier.Companion;
                float f7 = i6;
                RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.e(f7, b.g(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), f7), Dp.m6403constructorimpl((float) r4), Color.m3926copywmQWz5c$default(p107y3.a.t, 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), p107y3.a.u, null, 2, null);
                Alignment.Companion companion3 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM207backgroundbw27NRU$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                a constructor6 = companion4.getConstructor();
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
                e eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap2);
                if (composerM3407constructorimpl6.getInserting()) {
                    it = it2;
                } else {
                    it = it2;
                    if (!o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier2, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f6));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
                    constructor = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                    e eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl.getInserting()) {
                        i5 = iIntValue;
                    } else {
                        i5 = iIntValue;
                        if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion4.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierG = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(110)), 10);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierG);
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
                        eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap4);
                        if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier4, companion4.getSetModifier());
                        float f8 = f6;
                        float f9 = f5;
                        B.a(c2438de.f14944a, c2438de.f14945b, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ContentScale.Companion.getCrop(), composer2, 1573248);
                        float f10 = 6;
                        Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f10)), companion3.getTopStart());
                        Color.Companion companion5 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.f(f9, modifierAlign, Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f10), Dp.m6403constructorimpl(2));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
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
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap5);
                        if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier5, companion4.getSetModifier());
                        composer = composer2;
                        TextKt.m2432Text4IGK_g(String.valueOf(i9 + 1), (Modifier) null, companion5.m3964getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
                        b.r(composer, f8, companion2, composer, 6);
                        TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                        TextKt.m2432Text4IGK_g(c2438de.f14945b, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer, 384, 3120, 55290);
                        b.m(f9, companion2, composer, 6);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion3.getTop(), composer, 6);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                        constructor4 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor4);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                        eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap6);
                        if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier6, companion4.getSetModifier());
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        if (i9 > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        float f11 = 28;
                        Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f11));
                        composer.startReplaceGroup(-126577695);
                        zChanged = composer.changed(i9);
                        objRememberedValue = composer.rememberedValue();
                        mutableState = w5.p;
                        mutableState2 = w5.q;
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new T5(i9, mutableState, mutableState2, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue, modifierM713size3ABfNKs, z3, null, null, ComposableLambdaKt.rememberComposableLambda(-540936086, true, new U5(i9), composer, 54), composer, 196656, 24);
                        if (i9 < ((List) mutableState.getValue()).size() - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Modifier modifierM713size3ABfNKs2 = SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f11));
                        composer.startReplaceGroup(-126550045);
                        zChanged2 = composer.changed(i9);
                        objRememberedValue2 = composer.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            mutableState3 = mutableState;
                            mutableState4 = mutableState2;
                            z5 = true;
                            objRememberedValue2 = new T5(i9, mutableState3, mutableState4, 1);
                            composer.updateRememberedValue(objRememberedValue2);
                        } else {
                            mutableState3 = mutableState;
                            mutableState4 = mutableState2;
                            z5 = true;
                        }
                        composer.endReplaceGroup();
                        boolean z6 = z5;
                        mutableState5 = mutableState4;
                        mutableState6 = mutableState3;
                        IconButtonKt.IconButton((a) objRememberedValue2, modifierM713size3ABfNKs2, z4, null, null, ComposableLambdaKt.rememberComposableLambda(187843361, z5, new V5(i9, mutableState3), composer, 54), composer, 196656, 24);
                        composer.startReplaceGroup(-126520799);
                        zChanged3 = composer.changed(i9);
                        objRememberedValue3 = composer.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new T5(i9, mutableState6, mutableState5, 2);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue3, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f11)), false, null, null, AbstractC2552l0.f15276i, composer, 196656, 28);
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        w5 = this;
                        composer2 = composer;
                        f5 = f9;
                        r4 = z6;
                        i6 = 16;
                        i7 = i8;
                        rowScopeInstance = rowScopeInstance2;
                        it2 = it;
                        iIntValue = i5;
                        f6 = f8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG6);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierG2 = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(110)), 10);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierG2);
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
                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl2.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier7, companion4.getSetModifier());
                    float f12 = f6;
                    float f13 = f5;
                    B.a(c2438de.f14944a, c2438de.f14945b, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ContentScale.Companion.getCrop(), composer2, 1573248);
                    float f14 = 6;
                    Modifier modifierAlign2 = boxScopeInstance.align(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f14)), companion3.getTopStart());
                    Color.Companion companion6 = Color.Companion;
                    Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.f(f13, modifierAlign2, Color.m3926copywmQWz5c$default(companion6.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f14), Dp.m6403constructorimpl(2));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN5);
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap8);
                    if (composerM3407constructorimpl3.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier8, companion4.getSetModifier());
                    composer = composer2;
                    TextKt.m2432Text4IGK_g(String.valueOf(i9 + 1), (Modifier) null, companion6.m3964getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
                    b.r(composer, f12, companion2, composer, 6);
                    TextStyle bodySmall2 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                    TextKt.m2432Text4IGK_g(c2438de.f14945b, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer, 384, 3120, 55290);
                    b.m(f13, companion2, composer, 6);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getSpaceEvenly(), companion3.getTop(), composer, 6);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                    constructor4 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap9);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier9, companion4.getSetModifier());
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    if (i9 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    float f15 = 28;
                    Modifier modifierM713size3ABfNKs3 = SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f15));
                    composer.startReplaceGroup(-126577695);
                    zChanged = composer.changed(i9);
                    objRememberedValue = composer.rememberedValue();
                    mutableState = w5.p;
                    mutableState2 = w5.q;
                    if (zChanged) {
                        objRememberedValue = new T5(i9, mutableState, mutableState2, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new T5(i9, mutableState, mutableState2, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    IconButtonKt.IconButton((a) objRememberedValue, modifierM713size3ABfNKs3, z3, null, null, ComposableLambdaKt.rememberComposableLambda(-540936086, true, new U5(i9), composer, 54), composer, 196656, 24);
                    if (i9 < ((List) mutableState.getValue()).size() - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifierM713size3ABfNKs4 = SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f15));
                    composer.startReplaceGroup(-126550045);
                    zChanged2 = composer.changed(i9);
                    objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2) {
                        mutableState3 = mutableState;
                        mutableState4 = mutableState2;
                        z5 = true;
                        objRememberedValue2 = new T5(i9, mutableState3, mutableState4, 1);
                        composer.updateRememberedValue(objRememberedValue2);
                    } else {
                        mutableState3 = mutableState;
                        mutableState4 = mutableState2;
                        z5 = true;
                        objRememberedValue2 = new T5(i9, mutableState3, mutableState4, 1);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    boolean z7 = z5;
                    mutableState5 = mutableState4;
                    mutableState6 = mutableState3;
                    IconButtonKt.IconButton((a) objRememberedValue2, modifierM713size3ABfNKs4, z4, null, null, ComposableLambdaKt.rememberComposableLambda(187843361, z5, new V5(i9, mutableState3), composer, 54), composer, 196656, 24);
                    composer.startReplaceGroup(-126520799);
                    zChanged3 = composer.changed(i9);
                    objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new T5(i9, mutableState6, mutableState5, 2);
                        composer.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new T5(i9, mutableState6, mutableState5, 2);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    IconButtonKt.IconButton((a) objRememberedValue3, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f15)), false, null, null, AbstractC2552l0.f15276i, composer, 196656, 28);
                    composer.endNode();
                    composer.endNode();
                    composer.endNode();
                    w5 = this;
                    composer2 = composer;
                    f5 = f13;
                    r4 = z7;
                    i6 = 16;
                    i7 = i8;
                    rowScopeInstance = rowScopeInstance2;
                    it2 = it;
                    iIntValue = i5;
                    f6 = f12;
                }
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier2, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f6));
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composer2, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs2);
                constructor = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                e eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap10);
                if (composerM3407constructorimpl.getInserting()) {
                    i5 = iIntValue;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier10, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierG3 = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(110)), 10);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierG3);
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
                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl2, currentCompositionLocalMap11);
                    if (composerM3407constructorimpl2.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier11, companion4.getSetModifier());
                    float f16 = f6;
                    float f17 = f5;
                    B.a(c2438de.f14944a, c2438de.f14945b, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ContentScale.Companion.getCrop(), composer2, 1573248);
                    float f18 = 6;
                    Modifier modifierAlign3 = boxScopeInstance2.align(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f18)), companion3.getTopStart());
                    Color.Companion companion7 = Color.Companion;
                    Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(b.f(f17, modifierAlign3, Color.m3926copywmQWz5c$default(companion7.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f18), Dp.m6403constructorimpl(2));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN6);
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
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl3, currentCompositionLocalMap12);
                    if (composerM3407constructorimpl3.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier12, companion4.getSetModifier());
                    composer = composer2;
                    TextKt.m2432Text4IGK_g(String.valueOf(i9 + 1), (Modifier) null, companion7.m3964getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
                    b.r(composer, f16, companion2, composer, 6);
                    TextStyle bodySmall3 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                    TextKt.m2432Text4IGK_g(c2438de.f14945b, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer, 384, 3120, 55290);
                    b.m(f17, companion2, composer, 6);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getSpaceEvenly(), companion3.getTop(), composer, 6);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
                    constructor4 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap13);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier13, companion4.getSetModifier());
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    if (i9 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    float f19 = 28;
                    Modifier modifierM713size3ABfNKs5 = SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f19));
                    composer.startReplaceGroup(-126577695);
                    zChanged = composer.changed(i9);
                    objRememberedValue = composer.rememberedValue();
                    mutableState = w5.p;
                    mutableState2 = w5.q;
                    if (zChanged) {
                        objRememberedValue = new T5(i9, mutableState, mutableState2, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new T5(i9, mutableState, mutableState2, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    IconButtonKt.IconButton((a) objRememberedValue, modifierM713size3ABfNKs5, z3, null, null, ComposableLambdaKt.rememberComposableLambda(-540936086, true, new U5(i9), composer, 54), composer, 196656, 24);
                    if (i9 < ((List) mutableState.getValue()).size() - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifierM713size3ABfNKs6 = SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f19));
                    composer.startReplaceGroup(-126550045);
                    zChanged2 = composer.changed(i9);
                    objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2) {
                        mutableState3 = mutableState;
                        mutableState4 = mutableState2;
                        z5 = true;
                        objRememberedValue2 = new T5(i9, mutableState3, mutableState4, 1);
                        composer.updateRememberedValue(objRememberedValue2);
                    } else {
                        mutableState3 = mutableState;
                        mutableState4 = mutableState2;
                        z5 = true;
                        objRememberedValue2 = new T5(i9, mutableState3, mutableState4, 1);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    boolean z8 = z5;
                    mutableState5 = mutableState4;
                    mutableState6 = mutableState3;
                    IconButtonKt.IconButton((a) objRememberedValue2, modifierM713size3ABfNKs6, z4, null, null, ComposableLambdaKt.rememberComposableLambda(187843361, z5, new V5(i9, mutableState3), composer, 54), composer, 196656, 24);
                    composer.startReplaceGroup(-126520799);
                    zChanged3 = composer.changed(i9);
                    objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue3 = new T5(i9, mutableState6, mutableState5, 2);
                        composer.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new T5(i9, mutableState6, mutableState5, 2);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    IconButtonKt.IconButton((a) objRememberedValue3, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f19)), false, null, null, AbstractC2552l0.f15276i, composer, 196656, 28);
                    composer.endNode();
                    composer.endNode();
                    composer.endNode();
                    w5 = this;
                    composer2 = composer;
                    f5 = f17;
                    r4 = z8;
                    i6 = 16;
                    i7 = i8;
                    rowScopeInstance = rowScopeInstance2;
                    it2 = it;
                    iIntValue = i5;
                    f6 = f16;
                } else {
                    i5 = iIntValue;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG7);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier10, companion4.getSetModifier());
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                Modifier modifierG4 = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(110)), 10);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer2, modifierG4);
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
                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl2, currentCompositionLocalMap14);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier14, companion4.getSetModifier());
                float f110 = f6;
                float f111 = f5;
                B.a(c2438de.f14944a, c2438de.f14945b, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ContentScale.Companion.getCrop(), composer2, 1573248);
                float f112 = 6;
                Modifier modifierAlign4 = boxScopeInstance2.align(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f112)), companion3.getTopStart());
                Color.Companion companion8 = Color.Companion;
                Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(b.f(f111, modifierAlign4, Color.m3926copywmQWz5c$default(companion8.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f112), Dp.m6403constructorimpl(2));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN7);
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
                eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl3, currentCompositionLocalMap15);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier15, companion4.getSetModifier());
                composer = composer2;
                TextKt.m2432Text4IGK_g(String.valueOf(i9 + 1), (Modifier) null, companion8.m3964getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
                b.r(composer, f110, companion2, composer, 6);
                TextStyle bodySmall4 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                TextKt.m2432Text4IGK_g(c2438de.f14945b, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composer, 384, 3120, 55290);
                b.m(f111, companion2, composer, 6);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getSpaceEvenly(), companion3.getTop(), composer, 6);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap16 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default4);
                constructor4 = companion4.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl4, currentCompositionLocalMap16);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier16, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                if (i9 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                float f113 = 28;
                Modifier modifierM713size3ABfNKs7 = SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f113));
                composer.startReplaceGroup(-126577695);
                zChanged = composer.changed(i9);
                objRememberedValue = composer.rememberedValue();
                mutableState = w5.p;
                mutableState2 = w5.q;
                if (zChanged) {
                    objRememberedValue = new T5(i9, mutableState, mutableState2, 0);
                    composer.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new T5(i9, mutableState, mutableState2, 0);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IconButtonKt.IconButton((a) objRememberedValue, modifierM713size3ABfNKs7, z3, null, null, ComposableLambdaKt.rememberComposableLambda(-540936086, true, new U5(i9), composer, 54), composer, 196656, 24);
                if (i9 < ((List) mutableState.getValue()).size() - 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifierM713size3ABfNKs8 = SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f113));
                composer.startReplaceGroup(-126550045);
                zChanged2 = composer.changed(i9);
                objRememberedValue2 = composer.rememberedValue();
                if (zChanged2) {
                    mutableState3 = mutableState;
                    mutableState4 = mutableState2;
                    z5 = true;
                    objRememberedValue2 = new T5(i9, mutableState3, mutableState4, 1);
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    mutableState3 = mutableState;
                    mutableState4 = mutableState2;
                    z5 = true;
                    objRememberedValue2 = new T5(i9, mutableState3, mutableState4, 1);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                boolean z9 = z5;
                mutableState5 = mutableState4;
                mutableState6 = mutableState3;
                IconButtonKt.IconButton((a) objRememberedValue2, modifierM713size3ABfNKs8, z4, null, null, ComposableLambdaKt.rememberComposableLambda(187843361, z5, new V5(i9, mutableState3), composer, 54), composer, 196656, 24);
                composer.startReplaceGroup(-126520799);
                zChanged3 = composer.changed(i9);
                objRememberedValue3 = composer.rememberedValue();
                if (zChanged3) {
                    objRememberedValue3 = new T5(i9, mutableState6, mutableState5, 2);
                    composer.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new T5(i9, mutableState6, mutableState5, 2);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                IconButtonKt.IconButton((a) objRememberedValue3, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f113)), false, null, null, AbstractC2552l0.f15276i, composer, 196656, 28);
                composer.endNode();
                composer.endNode();
                composer.endNode();
                w5 = this;
                composer2 = composer;
                f5 = f111;
                r4 = z9;
                i6 = 16;
                i7 = i8;
                rowScopeInstance = rowScopeInstance2;
                it2 = it;
                iIntValue = i5;
                f6 = f110;
            }
            RowScopeInstance rowScopeInstance7 = rowScopeInstance;
            Composer composer3 = composer2;
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(-1741927105);
            if (list.size() < 2) {
                BoxKt.Box(RowScope.weight$default(rowScopeInstance7, Modifier.Companion, 1.0f, false, 2, null), composer3, 0);
            }
            if (p035i0.a.z(composer3)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

package p102x3;

import B3.o;
import C3.v;
import N0.B;
import O3.a;
import O3.c;
import O3.e;
import O3.g;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ShareKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;
import n4.l;
import p076s.b;
import p087u3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class T9 extends p implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14454o;
    public final /* synthetic */ List p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14455r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T9(List list, Object obj, Object obj2, int i5) {
        super(4);
        this.f14454o = i5;
        this.p = list;
        this.q = obj;
        this.f14455r = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:186:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:187:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:190:0x0703  */
    /* JADX WARN: Code duplicated, block: B:193:0x0714  */
    /* JADX WARN: Code duplicated, block: B:197:0x0780  */
    /* JADX WARN: Code duplicated, block: B:200:0x078c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0790  */
    /* JADX WARN: Code duplicated, block: B:204:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:206:0x07af  */
    /* JADX WARN: Code duplicated, block: B:209:0x0884  */
    /* JADX WARN: Code duplicated, block: B:211:0x088c  */
    /* JADX WARN: Code duplicated, block: B:214:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:217:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:218:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:221:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:223:0x08f8  */
    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i5;
        o oVar;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        float f5;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        int i6;
        long jM3964getWhite0d7_KjU;
        int i7;
        Object obj5;
        float f6;
        long jM3964getWhite0d7_KjU2;
        int i8;
        Object obj6;
        float f7;
        o oVar2 = o.f154a;
        Object obj7 = this.f14455r;
        Object obj8 = this.q;
        List list = this.p;
        switch (this.f14454o) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i5 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                } else {
                    i5 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i5 |= composer.changed(iIntValue) ? 32 : 16;
                }
                if ((i5 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return oVar2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                List list2 = (List) ((ArrayList) list).get(iIntValue);
                composer.startReplaceGroup(-1939853739);
                Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(4), 1, null);
                float f8 = 8;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), Alignment.Companion.getTop(), composer, 6);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                a constructor4 = companion.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap);
                if (composerM3407constructorimpl4.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier, companion.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceGroup(-421337540);
                Iterator it = list2.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        v.X();
                        throw null;
                    }
                    G3 g5 = (G3) next;
                    int iIndexOf = (((ArrayList) obj8).indexOf(list2) * 2) + i9;
                    Modifier.Companion companion2 = Modifier.Companion;
                    float f9 = 16;
                    Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.e(f9, b.g(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), f9), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(p107y3.a.t, 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), p107y3.a.u, null, 2, null);
                    Alignment.Companion companion3 = Alignment.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default);
                    Iterator it2 = it;
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    Object obj9 = obj8;
                    a constructor5 = companion4.getConstructor();
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
                    e eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap2);
                    if (composerM3407constructorimpl5.getInserting()) {
                        oVar = oVar2;
                    } else {
                        oVar = oVar2;
                        if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier2, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                        Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f8));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
                        constructor = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
                        e eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap3);
                        if (composerM3407constructorimpl.getInserting()) {
                            f5 = f8;
                        } else {
                            f5 = f8;
                            if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion4.getSetModifier());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            float f10 = 10;
                            B.a(g5.f13975a, g5.f13976b, b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(130)), f10), ContentScale.Companion.getCrop(), composer, 1572864);
                            b.m(f10, companion2, composer, 6);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                            constructor2 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                            eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap4);
                            if (composerM3407constructorimpl2.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier4, companion4.getSetModifier());
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            String strH = AbstractC1421mz.h(iIndexOf + 1, "Page ");
                            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                            TextKt.m2432Text4IGK_g(strH, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                            Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(28)), RoundedCornerShapeKt.getCircleShape());
                            long j5 = p107y3.a.f15978a;
                            Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            composer.startReplaceGroup(-911116448);
                            context = (Context) obj7;
                            zChangedInstance = composer.changedInstance(context) | composer.changedInstance(g5);
                            objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = new l(2, context, g5);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default2, false, null, null, (a) objRememberedValue, 7, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
                            constructor3 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                            eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap5);
                            if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier5, companion4.getSetModifier());
                            IconKt.m1877Iconww6aTOc(ShareKt.getShare(Icons.Outlined.INSTANCE), "Share", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(14)), j5, composer, 3504, 0);
                            composer.endNode();
                            composer.endNode();
                            composer.endNode();
                            composer.endNode();
                            i9 = i10;
                            it = it2;
                            obj8 = obj9;
                            oVar2 = oVar;
                            f8 = f5;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG5);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion4.getSetModifier());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        float f11 = 10;
                        B.a(g5.f13975a, g5.f13976b, b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(130)), f11), ContentScale.Companion.getCrop(), composer, 1572864);
                        b.m(f11, companion2, composer, 6);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                        constructor2 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                        eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap6);
                        if (composerM3407constructorimpl2.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier6, companion4.getSetModifier());
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        String strH2 = AbstractC1421mz.h(iIndexOf + 1, "Page ");
                        TextStyle bodySmall2 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                        TextKt.m2432Text4IGK_g(strH2, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                        Modifier modifierClip2 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(28)), RoundedCornerShapeKt.getCircleShape());
                        long j6 = p107y3.a.f15978a;
                        Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip2, Color.m3926copywmQWz5c$default(j6, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer.startReplaceGroup(-911116448);
                        context = (Context) obj7;
                        zChangedInstance = composer.changedInstance(context) | composer.changedInstance(g5);
                        objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue = new l(2, context, g5);
                            composer.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new l(2, context, g5);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierM242clickableXHw0xAI$default2 = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default3, false, null, null, (a) objRememberedValue, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default2);
                        constructor3 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap7);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier7, companion4.getSetModifier());
                        IconKt.m1877Iconww6aTOc(ShareKt.getShare(Icons.Outlined.INSTANCE), "Share", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(14)), j6, composer, 3504, 0);
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        i9 = i10;
                        it = it2;
                        obj8 = obj9;
                        oVar2 = oVar;
                        f8 = f5;
                    }
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier2, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                    Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f8));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composer, 48);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs2);
                    constructor = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
                    e eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap8);
                    if (composerM3407constructorimpl.getInserting()) {
                        f5 = f8;
                        if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion4.getSetModifier());
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        float f12 = 10;
                        B.a(g5.f13975a, g5.f13976b, b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(130)), f12), ContentScale.Companion.getCrop(), composer, 1572864);
                        b.m(f12, companion2, composer, 6);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
                        constructor2 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                        eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap9);
                        if (composerM3407constructorimpl2.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier9, companion4.getSetModifier());
                        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                        String strH3 = AbstractC1421mz.h(iIndexOf + 1, "Page ");
                        TextStyle bodySmall3 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                        TextKt.m2432Text4IGK_g(strH3, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                        Modifier modifierClip3 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(28)), RoundedCornerShapeKt.getCircleShape());
                        long j7 = p107y3.a.f15978a;
                        Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip3, Color.m3926copywmQWz5c$default(j7, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer.startReplaceGroup(-911116448);
                        context = (Context) obj7;
                        zChangedInstance = composer.changedInstance(context) | composer.changedInstance(g5);
                        objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue = new l(2, context, g5);
                            composer.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new l(2, context, g5);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierM242clickableXHw0xAI$default3 = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default4, false, null, null, (a) objRememberedValue, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default3);
                        constructor3 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl3, currentCompositionLocalMap10);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier10, companion4.getSetModifier());
                        IconKt.m1877Iconww6aTOc(ShareKt.getShare(Icons.Outlined.INSTANCE), "Share", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(14)), j7, composer, 3504, 0);
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        i9 = i10;
                        it = it2;
                        obj8 = obj9;
                        oVar2 = oVar;
                        f8 = f5;
                    } else {
                        f5 = f8;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG6);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    float f13 = 10;
                    B.a(g5.f13975a, g5.f13976b, b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(130)), f13), ContentScale.Companion.getCrop(), composer, 1572864);
                    b.m(f13, companion2, composer, 6);
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default4);
                    constructor2 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap11);
                    if (composerM3407constructorimpl2.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier11, companion4.getSetModifier());
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    String strH4 = AbstractC1421mz.h(iIndexOf + 1, "Page ");
                    TextStyle bodySmall4 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                    TextKt.m2432Text4IGK_g(strH4, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                    Modifier modifierClip4 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(28)), RoundedCornerShapeKt.getCircleShape());
                    long j8 = p107y3.a.f15978a;
                    Modifier modifierM207backgroundbw27NRU$default5 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip4, Color.m3926copywmQWz5c$default(j8, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer.startReplaceGroup(-911116448);
                    context = (Context) obj7;
                    zChangedInstance = composer.changedInstance(context) | composer.changedInstance(g5);
                    objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue = new l(2, context, g5);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new l(2, context, g5);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default4 = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default5, false, null, null, (a) objRememberedValue, 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default4);
                    constructor3 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap12);
                    if (composerM3407constructorimpl3.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier12, companion4.getSetModifier());
                    IconKt.m1877Iconww6aTOc(ShareKt.getShare(Icons.Outlined.INSTANCE), "Share", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(14)), j8, composer, 3504, 0);
                    composer.endNode();
                    composer.endNode();
                    composer.endNode();
                    composer.endNode();
                    i9 = i10;
                    it = it2;
                    obj8 = obj9;
                    oVar2 = oVar;
                    f8 = f5;
                }
                o oVar3 = oVar2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-421200075);
                if (list2.size() < 2) {
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composer, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endReplaceGroup();
                if (!ComposerKt.isTraceInProgress()) {
                    return oVar3;
                }
                ComposerKt.traceEventEnd();
                return oVar3;
            default:
                LazyItemScope lazyItemScope2 = (LazyItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i6 = iIntValue4 | (composer2.changed(lazyItemScope2) ? 4 : 2);
                } else {
                    i6 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i6 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if ((i6 & 147) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    p087u3.v vVar = (p087u3.v) list.get(iIntValue3);
                    composer2.startReplaceGroup(1847783524);
                    String id = vVar.getId();
                    q qVar = (q) obj8;
                    Integer shippingAddressId = qVar.getShippingAddressId();
                    boolean z3 = kotlin.jvm.internal.o.b(id, shippingAddressId != null ? shippingAddressId.toString() : null) || (kotlin.jvm.internal.o.b(vVar.getPincode(), qVar.getPostalCode()) && kotlin.jvm.internal.o.b(vVar.getFlatHouse(), qVar.getFlatHouse()));
                    Modifier.Companion companion5 = Modifier.Companion;
                    float f14 = 16;
                    Modifier modifierG = b.g(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), f14);
                    if (z3) {
                        jM3964getWhite0d7_KjU = p107y3.a.f15979b;
                        i7 = 14;
                        obj5 = null;
                        f6 = 0.1f;
                    } else {
                        jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                        i7 = 14;
                        obj5 = null;
                        f6 = 0.05f;
                    }
                    Modifier modifierM207backgroundbw27NRU$default6 = BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f6, 0.0f, 0.0f, 0.0f, i7, obj5), null, 2, null);
                    float fM6403constructorimpl = Dp.m6403constructorimpl(1);
                    if (z3) {
                        jM3964getWhite0d7_KjU2 = p107y3.a.f15979b;
                        i8 = 14;
                        obj6 = null;
                        f7 = 0.3f;
                    } else {
                        jM3964getWhite0d7_KjU2 = Color.Companion.m3964getWhite0d7_KjU();
                        i8 = 14;
                        obj6 = null;
                        f7 = 0.08f;
                    }
                    Modifier modifierE = b.e(f14, modifierM207backgroundbw27NRU$default6, fM6403constructorimpl, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU2, f7, 0.0f, 0.0f, 0.0f, i8, obj6));
                    composer2.startReplaceGroup(-1048751488);
                    c cVar = (c) obj7;
                    boolean zChanged = composer2.changed(cVar) | composer2.changed(vVar);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new l(4, cVar, vVar);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(f14));
                    Alignment.Companion companion6 = Alignment.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs3);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    a constructor6 = companion7.getConstructor();
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
                    e eVarG7 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl6, currentCompositionLocalMap13);
                    if (composerM3407constructorimpl6.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG7);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier13, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion6.getStart(), composer2, 0);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer2, companion5);
                    a constructor7 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer2);
                    e eVarG8 = p035i0.a.g(companion7, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap14);
                    if (composerM3407constructorimpl7.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG8);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier14, companion7.getSetModifier());
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement3.getSpaceBetween(), companion6.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default5);
                    a constructor8 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor8);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer2);
                    e eVarG9 = p035i0.a.g(companion7, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl8, currentCompositionLocalMap15);
                    if (composerM3407constructorimpl8.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG9);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier15, companion7.getSetModifier());
                    RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(8, arrangement3, companion6.getCenterVertically(), composer2, 54);
                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer2, companion5);
                    a constructor9 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor9);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer2);
                    e eVarG10 = p035i0.a.g(companion7, composerM3407constructorimpl9, measurePolicyI, composerM3407constructorimpl9, currentCompositionLocalMap16);
                    if (composerM3407constructorimpl9.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG10);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier16, companion7.getSetModifier());
                    String fullName = vVar.getFullName();
                    if (fullName == null) {
                        fullName = "";
                    }
                    String str = fullName;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i11 = MaterialTheme.$stable;
                    TextStyle titleMedium = materialTheme.getTypography(composer2, i11).getTitleMedium();
                    Color.Companion companion8 = Color.Companion;
                    long jM3964getWhite0d7_KjU3 = companion8.m3964getWhite0d7_KjU();
                    FontWeight.Companion companion9 = FontWeight.Companion;
                    TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : jM3964getWhite0d7_KjU3, (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65534);
                    float f15 = 4;
                    Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(b.d(f15, companion5), Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(6), Dp.m6403constructorimpl(2));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap17 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
                    a constructor10 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor10);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer2);
                    e eVarG11 = p035i0.a.g(companion7, composerM3407constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl10, currentCompositionLocalMap17);
                    if (composerM3407constructorimpl10.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG11);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier17, companion7.getSetModifier());
                    String addressType = vVar.getAddressType();
                    if (addressType == null) {
                        addressType = "Home";
                    }
                    TextStyle labelSmall = materialTheme.getTypography(composer2, i11).getLabelSmall();
                    TextKt.m2432Text4IGK_g(addressType, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.f15980c, (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(8), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion9.getBlack(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65534);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endNode();
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion5, Dp.m6403constructorimpl(f15)), composer2, 6);
                    String strM = androidx.compose.foundation.text.modifiers.a.m(vVar.getFlatHouse(), ", ", vVar.getCity());
                    TextStyle bodySmall5 = materialTheme.getTypography(composer2, i11).getBodySmall();
                    TextKt.m2432Text4IGK_g(strM, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall5.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall5.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall5.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall5.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65534);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return oVar2;
        }
    }
}

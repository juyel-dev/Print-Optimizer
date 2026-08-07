package p102x3;

import A2.t;
import C3.v;
import O3.c;
import O3.e;
import O3.f;
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
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
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
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class S6 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MutableState f14402o;

    public S6(MutableState mutableState) {
        this.f14402o = mutableState;
    }

    public static final void a(F6 f6, boolean z3, Composer composer) {
        Alignment topStart;
        composer.startReplaceGroup(-744902439);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-744902439, 0, -1, "com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.MiniPagePositionIndicator (PdfAddPageNumbersScreen.kt:888)");
        }
        Modifier.Companion companion = Modifier.Companion;
        float f5 = 2;
        Modifier modifierE = b.e(f5, SizeKt.m715sizeVpY3zN4(companion, Dp.m6403constructorimpl(20), Dp.m6403constructorimpl(26)), Dp.m6403constructorimpl(1), z3 ? Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m3926copywmQWz5c$default(a.q, 0.3f, 0.0f, 0.0f, 0.0f, 14, null));
        Color.Companion companion2 = Color.Companion;
        Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierE, Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        O3.a constructor = companion4.getConstructor();
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
        e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
        if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
        }
        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        int iOrdinal = f6.ordinal();
        if (iOrdinal == 0) {
            topStart = companion3.getTopStart();
        } else if (iOrdinal == 1) {
            topStart = companion3.getTopCenter();
        } else if (iOrdinal == 2) {
            topStart = companion3.getTopEnd();
        } else if (iOrdinal == 3) {
            topStart = companion3.getBottomStart();
        } else if (iOrdinal == 4) {
            topStart = companion3.getBottomCenter();
        } else {
            if (iOrdinal != 5) {
                throw new t();
            }
            topStart = companion3.getBottomEnd();
        }
        BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(boxScopeInstance.align(companion, topStart), Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(4)), RoundedCornerShapeKt.getCircleShape()), z3 ? companion2.m3964getWhite0d7_KjU() : a.f15980c, null, 2, null), composer, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX WARN: Code duplicated, block: B:116:0x049d  */
    /* JADX WARN: Code duplicated, block: B:117:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x0500  */
    /* JADX WARN: Code duplicated, block: B:126:0x051e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0568  */
    /* JADX WARN: Code duplicated, block: B:132:0x0574  */
    /* JADX WARN: Code duplicated, block: B:133:0x0578  */
    /* JADX WARN: Code duplicated, block: B:138:0x0597  */
    /* JADX WARN: Code duplicated, block: B:141:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:144:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:145:0x05da  */
    /* JADX WARN: Code duplicated, block: B:150:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:153:0x0661  */
    /* JADX WARN: Code duplicated, block: B:155:0x066a  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0202  */
    /* JADX WARN: Code duplicated, block: B:48:0x020a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0229  */
    /* JADX WARN: Code duplicated, block: B:56:0x0272  */
    /* JADX WARN: Code duplicated, block: B:59:0x027e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0282  */
    /* JADX WARN: Code duplicated, block: B:65:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x0303  */
    /* JADX WARN: Code duplicated, block: B:80:0x036b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0374  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        final MutableState mutableState;
        String str;
        String str2;
        Modifier.Companion companion;
        Modifier modifierM207backgroundbw27NRU$default;
        long jM3962getTransparent0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        O3.a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        int currentCompositeKeyHash2;
        O3.a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        long jM3964getWhite0d7_KjU;
        String str3;
        Modifier.Companion companion2;
        Modifier modifierM207backgroundbw27NRU$default2;
        long jM3962getTransparent0d7_KjU2;
        boolean zChanged2;
        Object objRememberedValue2;
        int currentCompositeKeyHash3;
        O3.a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        int currentCompositeKeyHash4;
        O3.a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG4;
        long jM3964getWhite0d7_KjU2;
        int i5 = 1;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1859673103, iIntValue, -1, "com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:877)");
            }
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium();
            TextStyle textStyleM5917copyp1EtxEg = titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null);
            long j5 = a.f15990o;
            Modifier.Companion companion3 = Modifier.Companion;
            float f5 = 12;
            float f6 = f5;
            Object obj4 = null;
            TextKt.m2432Text4IGK_g("Position Alignment", PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), j5, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer, 438, 0, 65528);
            float f7 = 0.0f;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            float f8 = 8;
            int i6 = 6;
            Composer composer2 = composer;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), Alignment.Companion.getTop(), composer2, 6);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            O3.a constructor5 = companion4.getConstructor();
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
            e eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(1799069611);
            Iterator it = v.S(F6.f13949o, F6.p, F6.q).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                String str4 = "";
                mutableState = this.f14402o;
                if (!zHasNext) {
                    break;
                }
                final F6 f9 = (F6) it.next();
                boolean z3 = ((F6) mutableState.getValue()) == f9 ? i5 : 0;
                int iOrdinal = f9.ordinal();
                if (iOrdinal == 0) {
                    str3 = "Top Left";
                } else if (iOrdinal != i5) {
                    if (iOrdinal == 2) {
                        str3 = "Top Right";
                    }
                    companion2 = Modifier.Companion;
                    float f10 = f6;
                    Modifier modifierG = b.g(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), f10);
                    if (z3 != 0) {
                        modifierM207backgroundbw27NRU$default2 = BackgroundKt.background$default(companion2, Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                    } else {
                        modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(companion2, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    }
                    Modifier modifierThen = modifierG.then(modifierM207backgroundbw27NRU$default2);
                    float fM6403constructorimpl = Dp.m6403constructorimpl(i5);
                    if (z3 != 0) {
                        jM3962getTransparent0d7_KjU2 = Color.Companion.m3962getTransparent0d7_KjU();
                    } else {
                        jM3962getTransparent0d7_KjU2 = a.f15991r;
                    }
                    Modifier modifierE = b.e(f10, modifierThen, fM6403constructorimpl, jM3962getTransparent0d7_KjU2);
                    composer2.startReplaceGroup(-1431850050);
                    zChanged2 = composer2.changed(f9);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        final int i7 = 0;
                        objRememberedValue2 = new O3.a() { // from class: x3.R6
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        mutableState.setValue(f9);
                                        break;
                                    default:
                                        mutableState.setValue(f9);
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (O3.a) objRememberedValue2, 7, null), f7, Dp.m6403constructorimpl(f10), i5, obj4);
                    Alignment.Companion companion5 = Alignment.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                    constructor3 = companion6.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion6, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap2);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier2, companion6.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion5.getCenterHorizontally(), composer2, 54);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                    eVarG4 = p035i0.a.g(companion6, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier3, companion6.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    a(f9, z3, composer2);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f8)), composer2, 6);
                    TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall();
                    TextStyle textStyleM5917copyp1EtxEg2 = bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null);
                    if (z3 != 0) {
                        jM3964getWhite0d7_KjU2 = Color.Companion.m3964getWhite0d7_KjU();
                    } else {
                        jM3964getWhite0d7_KjU2 = a.p;
                    }
                    Composer composer3 = composer2;
                    TextKt.m2432Text4IGK_g(str4, (Modifier) null, jM3964getWhite0d7_KjU2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg2, composer3, 0, 0, 65530);
                    composer3.endNode();
                    composer3.endNode();
                    composer2 = composer3;
                    i6 = 6;
                    f6 = f10;
                    f8 = f8;
                    obj4 = null;
                    i5 = 1;
                    f7 = 0.0f;
                } else {
                    str3 = "Top Center";
                }
                str4 = str3;
                companion2 = Modifier.Companion;
                float f11 = f6;
                Modifier modifierG2 = b.g(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), f11);
                if (z3 != 0) {
                    modifierM207backgroundbw27NRU$default2 = BackgroundKt.background$default(companion2, Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                } else {
                    modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(companion2, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                }
                Modifier modifierThen2 = modifierG2.then(modifierM207backgroundbw27NRU$default2);
                float fM6403constructorimpl2 = Dp.m6403constructorimpl(i5);
                if (z3 != 0) {
                    jM3962getTransparent0d7_KjU2 = Color.Companion.m3962getTransparent0d7_KjU();
                } else {
                    jM3962getTransparent0d7_KjU2 = a.f15991r;
                }
                Modifier modifierE2 = b.e(f11, modifierThen2, fM6403constructorimpl2, jM3962getTransparent0d7_KjU2);
                composer2.startReplaceGroup(-1431850050);
                zChanged2 = composer2.changed(f9);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2) {
                    final int i8 = 0;
                    objRememberedValue2 = new O3.a() { // from class: x3.R6
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i8) {
                                case 0:
                                    mutableState.setValue(f9);
                                    break;
                                default:
                                    mutableState.setValue(f9);
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    final int i9 = 0;
                    objRememberedValue2 = new O3.a() { // from class: x3.R6
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    mutableState.setValue(f9);
                                    break;
                                default:
                                    mutableState.setValue(f9);
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierE2, false, null, null, (O3.a) objRememberedValue2, 7, null), f7, Dp.m6403constructorimpl(f11), i5, obj4);
                Alignment.Companion companion7 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                constructor3 = companion8.getConstructor();
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
                eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap4);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier4, companion8.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion7.getCenterHorizontally(), composer2, 54);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion2);
                constructor4 = companion8.getConstructor();
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
                eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap5);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier5, companion8.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                a(f9, z3, composer2);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f8)), composer2, 6);
                TextStyle bodySmall2 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall();
                TextStyle textStyleM5917copyp1EtxEg3 = bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null);
                if (z3 != 0) {
                    jM3964getWhite0d7_KjU2 = Color.Companion.m3964getWhite0d7_KjU();
                } else {
                    jM3964getWhite0d7_KjU2 = a.p;
                }
                Composer composer4 = composer2;
                TextKt.m2432Text4IGK_g(str4, (Modifier) null, jM3964getWhite0d7_KjU2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg3, composer4, 0, 0, 65530);
                composer4.endNode();
                composer4.endNode();
                composer2 = composer4;
                i6 = 6;
                f6 = f11;
                f8 = f8;
                obj4 = null;
                i5 = 1;
                f7 = 0.0f;
            }
            Composer composer5 = composer2;
            int i10 = i6;
            float f12 = f6;
            composer5.endReplaceGroup();
            composer5.endNode();
            Modifier.Companion companion9 = Modifier.Companion;
            float f13 = f8;
            b.m(f13, companion9, composer5, i10);
            float f14 = 0.0f;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f13)), Alignment.Companion.getTop(), composer5, i10);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
            O3.a constructor6 = companion10.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor6);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer5);
            e eVarG6 = p035i0.a.g(companion10, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap6);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion10.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer5.startReplaceGroup(1799174676);
            for (final F6 f15 : v.S(F6.f13950r, F6.f13951s, F6.t)) {
                boolean z4 = ((F6) mutableState.getValue()) == f15;
                int iOrdinal2 = f15.ordinal();
                if (iOrdinal2 == 3) {
                    str = "Bottom Left";
                } else if (iOrdinal2 != 4) {
                    if (iOrdinal2 != 5) {
                        str2 = "";
                    } else {
                        str = "Bottom Right";
                    }
                    companion = Modifier.Companion;
                    float f16 = f12;
                    Modifier modifierG3 = b.g(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), f16);
                    if (z4) {
                        modifierM207backgroundbw27NRU$default = BackgroundKt.background$default(companion, Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                    } else {
                        modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(companion, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    }
                    Modifier modifierThen3 = modifierG3.then(modifierM207backgroundbw27NRU$default);
                    float fM6403constructorimpl3 = Dp.m6403constructorimpl(1);
                    if (z4) {
                        jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                    } else {
                        jM3962getTransparent0d7_KjU = a.f15991r;
                    }
                    Modifier modifierE3 = b.e(f16, modifierThen3, fM6403constructorimpl3, jM3962getTransparent0d7_KjU);
                    composer5.startReplaceGroup(-1431744706);
                    zChanged = composer5.changed(f15);
                    objRememberedValue = composer5.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        final int i11 = 1;
                        objRememberedValue = new O3.a() { // from class: x3.R6
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        mutableState.setValue(f15);
                                        break;
                                    default:
                                        mutableState.setValue(f15);
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer5.updateRememberedValue(objRememberedValue);
                    }
                    composer5.endReplaceGroup();
                    Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierE3, false, null, null, (O3.a) objRememberedValue, 7, null), f14, Dp.m6403constructorimpl(f16), 1, null);
                    Alignment.Companion companion11 = Alignment.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion11.getCenter(), false);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer5, modifierM670paddingVpY3zN4$default3);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.Companion;
                    constructor = companion12.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor);
                    } else {
                        composer5.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer5);
                    eVarG = p035i0.a.g(companion12, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion12.getSetModifier());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion11.getCenterHorizontally(), composer5, 54);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer5, companion);
                    constructor2 = companion12.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor2);
                    } else {
                        composer5.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer5);
                    eVarG2 = p035i0.a.g(companion12, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap8);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier8, companion12.getSetModifier());
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    a(f15, z4, composer5);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f13)), composer5, 6);
                    TextStyle bodySmall3 = MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodySmall();
                    TextStyle textStyleM5917copyp1EtxEg4 = bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null);
                    if (z4) {
                        jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                    } else {
                        jM3964getWhite0d7_KjU = a.p;
                    }
                    TextKt.m2432Text4IGK_g(str2, (Modifier) null, jM3964getWhite0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg4, composer5, 0, 0, 65530);
                    composer5.endNode();
                    composer5.endNode();
                    f14 = 0.0f;
                    f12 = f16;
                    mutableState = mutableState;
                    f13 = f13;
                } else {
                    str = "Bottom Center";
                }
                str2 = str;
                companion = Modifier.Companion;
                float f17 = f12;
                Modifier modifierG4 = b.g(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), f17);
                if (z4) {
                    modifierM207backgroundbw27NRU$default = BackgroundKt.background$default(companion, Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                } else {
                    modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(companion, Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                }
                Modifier modifierThen4 = modifierG4.then(modifierM207backgroundbw27NRU$default);
                float fM6403constructorimpl4 = Dp.m6403constructorimpl(1);
                if (z4) {
                    jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                } else {
                    jM3962getTransparent0d7_KjU = a.f15991r;
                }
                Modifier modifierE4 = b.e(f17, modifierThen4, fM6403constructorimpl4, jM3962getTransparent0d7_KjU);
                composer5.startReplaceGroup(-1431744706);
                zChanged = composer5.changed(f15);
                objRememberedValue = composer5.rememberedValue();
                if (zChanged) {
                    final int i12 = 1;
                    objRememberedValue = new O3.a() { // from class: x3.R6
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    mutableState.setValue(f15);
                                    break;
                                default:
                                    mutableState.setValue(f15);
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue);
                } else {
                    final int i13 = 1;
                    objRememberedValue = new O3.a() { // from class: x3.R6
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    mutableState.setValue(f15);
                                    break;
                                default:
                                    mutableState.setValue(f15);
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer5.updateRememberedValue(objRememberedValue);
                }
                composer5.endReplaceGroup();
                Modifier modifierM670paddingVpY3zN4$default4 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierE4, false, null, null, (O3.a) objRememberedValue, 7, null), f14, Dp.m6403constructorimpl(f17), 1, null);
                Alignment.Companion companion13 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion13.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer5, modifierM670paddingVpY3zN4$default4);
                ComposeUiNode.Companion companion14 = ComposeUiNode.Companion;
                constructor = companion14.getConstructor();
                if (composer5.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor);
                } else {
                    composer5.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer5);
                eVarG = p035i0.a.g(companion14, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap9);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier9, companion14.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion13.getCenterHorizontally(), composer5, 54);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer5, companion);
                constructor2 = companion14.getConstructor();
                if (composer5.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor2);
                } else {
                    composer5.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer5);
                eVarG2 = p035i0.a.g(companion14, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap10);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier10, companion14.getSetModifier());
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                a(f15, z4, composer5);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f13)), composer5, 6);
                TextStyle bodySmall4 = MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodySmall();
                TextStyle textStyleM5917copyp1EtxEg5 = bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null);
                if (z4) {
                    jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                } else {
                    jM3964getWhite0d7_KjU = a.p;
                }
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, jM3964getWhite0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg5, composer5, 0, 0, 65530);
                composer5.endNode();
                composer5.endNode();
                f14 = 0.0f;
                f12 = f17;
                mutableState = mutableState;
                f13 = f13;
            }
            composer5.endReplaceGroup();
            composer5.endNode();
            if (b.q(24, Modifier.Companion, composer5, 6)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

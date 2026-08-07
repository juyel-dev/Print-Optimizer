package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.MoreHorizKt;
import androidx.compose.material.icons.filled.VerifiedUserKt;
import androidx.compose.material.icons.outlined.LocationOnKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2485gd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f15113o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f15115s;
    public final /* synthetic */ MutableState t;

    public C2485gd(String str, MutableState mutableState, MutableState mutableState2, boolean z3, State state, MutableState mutableState3) {
        this.f15113o = str;
        this.p = mutableState;
        this.q = mutableState2;
        this.f15114r = z3;
        this.f15115s = state;
        this.t = mutableState3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:101:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:106:0x0608  */
    /* JADX WARN: Code duplicated, block: B:109:0x063b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0647  */
    /* JADX WARN: Code duplicated, block: B:113:0x064b  */
    /* JADX WARN: Code duplicated, block: B:120:0x066e  */
    /* JADX WARN: Code duplicated, block: B:123:0x069c  */
    /* JADX WARN: Code duplicated, block: B:126:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:138:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:139:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:144:0x071e  */
    /* JADX WARN: Code duplicated, block: B:147:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x07da  */
    /* JADX WARN: Code duplicated, block: B:152:0x07df  */
    /* JADX WARN: Code duplicated, block: B:155:0x083d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0849  */
    /* JADX WARN: Code duplicated, block: B:159:0x084d  */
    /* JADX WARN: Code duplicated, block: B:164:0x086e  */
    /* JADX WARN: Code duplicated, block: B:167:0x093b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0947  */
    /* JADX WARN: Code duplicated, block: B:171:0x094b  */
    /* JADX WARN: Code duplicated, block: B:176:0x096c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:182:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:188:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:193:0x0cfb  */
    /* JADX WARN: Code duplicated, block: B:196:0x0d45  */
    /* JADX WARN: Code duplicated, block: B:199:0x0d51  */
    /* JADX WARN: Code duplicated, block: B:200:0x0d55  */
    /* JADX WARN: Code duplicated, block: B:207:0x0d7a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0da2  */
    /* JADX WARN: Code duplicated, block: B:213:0x0dae  */
    /* JADX WARN: Code duplicated, block: B:214:0x0db2  */
    /* JADX WARN: Code duplicated, block: B:219:0x0dd1  */
    /* JADX WARN: Code duplicated, block: B:221:0x0e84  */
    /* JADX WARN: Code duplicated, block: B:223:0x0ede  */
    /* JADX WARN: Code duplicated, block: B:226:0x0eea  */
    /* JADX WARN: Code duplicated, block: B:227:0x0eee  */
    /* JADX WARN: Code duplicated, block: B:232:0x0f0d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0f5e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0f6a  */
    /* JADX WARN: Code duplicated, block: B:239:0x0f6e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0f8d  */
    /* JADX WARN: Code duplicated, block: B:249:0x1098  */
    /* JADX WARN: Code duplicated, block: B:253:0x10ce  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0465  */
    /* JADX WARN: Code duplicated, block: B:92:0x046c  */
    /* JADX WARN: Code duplicated, block: B:95:0x055f  */
    /* JADX WARN: Code duplicated, block: B:97:0x05d7  */
    public final void a(BoxScope GlassCard, Composer composer, int i5) {
        MutableState mutableState;
        String str;
        MutableState mutableState2;
        Icons icons;
        String str2;
        int length;
        State state;
        MutableState mutableState3;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG4;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG5;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG6;
        int i6;
        long jD;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        e eVarG7;
        int currentCompositeKeyHash8;
        a constructor8;
        Composer composerM3407constructorimpl8;
        e eVarG8;
        int currentCompositeKeyHash9;
        a constructor9;
        Composer composerM3407constructorimpl9;
        e eVarG9;
        boolean zChanged2;
        Object objRememberedValue2;
        int currentCompositeKeyHash10;
        a constructor10;
        Composer composerM3407constructorimpl10;
        e eVarG10;
        int currentCompositeKeyHash11;
        a constructor11;
        Composer composerM3407constructorimpl11;
        e eVarG11;
        o.f(GlassCard, "$this$GlassCard");
        if ((i5 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(717609066, i5, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2809)");
        }
        Modifier.Companion companion = Modifier.Companion;
        float f5 = 20;
        Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5));
        Arrangement arrangement = Arrangement.INSTANCE;
        float f6 = 16;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6));
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion2.getStart(), composer, 6);
        int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        a constructor12 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor12);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl12 = Updater.m3407constructorimpl(composer);
        e eVarG12 = p035i0.a.g(companion3, composerM3407constructorimpl12, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl12, currentCompositionLocalMap);
        if (composerM3407constructorimpl12.getInserting() || !o.b(composerM3407constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
            p035i0.a.t(currentCompositeKeyHash12, composerM3407constructorimpl12, currentCompositeKeyHash12, eVarG12);
        }
        Updater.m3414setimpl(composerM3407constructorimpl12, modifierMaterializeModifier, companion3.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
        int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
        a constructor13 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor13);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl13 = Updater.m3407constructorimpl(composer);
        e eVarG13 = p035i0.a.g(companion3, composerM3407constructorimpl13, measurePolicyRowMeasurePolicy, composerM3407constructorimpl13, currentCompositionLocalMap2);
        if (composerM3407constructorimpl13.getInserting() || !o.b(composerM3407constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
            p035i0.a.t(currentCompositeKeyHash13, composerM3407constructorimpl13, currentCompositeKeyHash13, eVarG13);
        }
        Updater.m3414setimpl(composerM3407constructorimpl13, modifierMaterializeModifier2, companion3.getSetModifier());
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer, 48);
        int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
        a constructor14 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor14);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl14 = Updater.m3407constructorimpl(composer);
        e eVarG14 = p035i0.a.g(companion3, composerM3407constructorimpl14, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl14, currentCompositionLocalMap3);
        if (composerM3407constructorimpl14.getInserting() || !o.b(composerM3407constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
            p035i0.a.t(currentCompositeKeyHash14, composerM3407constructorimpl14, currentCompositeKeyHash14, eVarG14);
        }
        Updater.m3414setimpl(composerM3407constructorimpl14, modifierMaterializeModifier3, companion3.getSetModifier());
        float f7 = 2;
        BoxKt.Box(b.f(f7, SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(3)), Dp.m6403constructorimpl(f5)), p107y3.a.c()), composer, 0);
        float f8 = 10;
        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f8)), composer, 6);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
        int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
        a constructor15 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor15);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl15 = Updater.m3407constructorimpl(composer);
        e eVarG15 = p035i0.a.g(companion3, composerM3407constructorimpl15, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl15, currentCompositionLocalMap4);
        if (composerM3407constructorimpl15.getInserting() || !o.b(composerM3407constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
            p035i0.a.t(currentCompositeKeyHash15, composerM3407constructorimpl15, currentCompositeKeyHash15, eVarG15);
        }
        Updater.m3414setimpl(composerM3407constructorimpl15, modifierMaterializeModifier4, companion3.getSetModifier());
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i7 = MaterialTheme.$stable;
        TextStyle titleMedium = materialTheme.getTypography(composer, i7).getTitleMedium();
        FontWeight.Companion companion4 = FontWeight.Companion;
        FontWeight bold = companion4.getBold();
        Color.Companion companion5 = Color.Companion;
        TextStyle textStyleM5917copyp1EtxEg = titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : bold, (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null);
        TextOverflow.Companion companion6 = TextOverflow.Companion;
        TextKt.m2432Text4IGK_g("Delivery Destination", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion6.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, textStyleM5917copyp1EtxEg, composer, 6, 3120, 55294);
        TextStyle labelSmall = materialTheme.getTypography(composer, i7).getLabelSmall();
        TextKt.m2432Text4IGK_g("WHERE TO SHIP YOUR NOTES", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion6.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer, 6, 3120, 55294);
        composer.endNode();
        composer.endNode();
        float f9 = 12;
        androidx.compose.foundation.text.modifiers.a.q(f9, companion, composer, 6);
        float f10 = 8;
        float f11 = 1;
        Modifier modifierE = b.e(f10, BackgroundKt.m207backgroundbw27NRU$default(b.d(f10, companion), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
        composer.startReplaceGroup(-816081087);
        Object objRememberedValue3 = composer.rememberedValue();
        Composer.Companion companion7 = Composer.Companion;
        Object empty = companion7.getEmpty();
        MutableState mutableState4 = this.p;
        MutableState mutableState5 = this.q;
        if (objRememberedValue3 == empty) {
            objRememberedValue3 = new C2412c4(11, mutableState4, mutableState5);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        float f12 = 6;
        Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (a) objRememberedValue3, 7, null), Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f12));
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
        int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
        a constructor16 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor16);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl16 = Updater.m3407constructorimpl(composer);
        e eVarG16 = p035i0.a.g(companion3, composerM3407constructorimpl16, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl16, currentCompositionLocalMap5);
        if (composerM3407constructorimpl16.getInserting() || !o.b(composerM3407constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
            p035i0.a.t(currentCompositeKeyHash16, composerM3407constructorimpl16, currentCompositeKeyHash16, eVarG16);
        }
        Updater.m3414setimpl(composerM3407constructorimpl16, modifierMaterializeModifier5, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        float f13 = 4;
        MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f13, arrangement, companion2.getCenterVertically(), composer, 54);
        int currentCompositeKeyHash17 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, companion);
        a constructor17 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor17);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl17 = Updater.m3407constructorimpl(composer);
        e eVarG17 = p035i0.a.g(companion3, composerM3407constructorimpl17, measurePolicyI, composerM3407constructorimpl17, currentCompositionLocalMap6);
        if (!composerM3407constructorimpl17.getInserting()) {
            mutableState = mutableState5;
            if (!o.b(composerM3407constructorimpl17.rememberedValue(), Integer.valueOf(currentCompositeKeyHash17))) {
            }
            Updater.m3414setimpl(composerM3407constructorimpl17, modifierMaterializeModifier6, companion3.getSetModifier());
            if (this.f15114r) {
                str = "Select/Add";
            } else {
                str = "Select or Add Another";
            }
            TextStyle labelSmall2 = materialTheme.getTypography(composer, i7).getLabelSmall();
            mutableState2 = mutableState;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion6.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer, 0, 3120, 55294);
            icons = Icons.INSTANCE;
            IconKt.m1877Iconww6aTOc(MoreHorizKt.getMoreHoriz(icons.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f9)), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            str2 = this.f15113o;
            length = str2.length();
            state = this.f15115s;
            mutableState3 = this.t;
            if (length > 0) {
                composer.startReplaceGroup(1740532184);
                Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f5), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f5));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs2);
                constructor3 = companion3.getConstructor();
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
                eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap7);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier7, companion3.getSetModifier());
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion2.getStart(), composer, 6);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, companion);
                constructor4 = companion3.getConstructor();
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
                eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap8);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Alignment.Vertical verticalC = b.c(companion3, composerM3407constructorimpl4, modifierMaterializeModifier8, companion2);
                Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, verticalC, composer, 54);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                constructor5 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap9);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                MeasurePolicy measurePolicyI2 = androidx.compose.foundation.text.modifiers.a.i(f10, arrangement, b.c(companion3, composerM3407constructorimpl5, modifierMaterializeModifier9, companion2), composer, 54);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, companion);
                constructor6 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor6);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
                eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyI2, composerM3407constructorimpl6, currentCompositionLocalMap10);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier10, companion3.getSetModifier());
                TextStyle titleMedium2 = materialTheme.getTypography(composer, i7).getTitleMedium();
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium2.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(18), (16645977 & 4) != 0 ? titleMedium2.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? titleMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium2.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
                i6 = AbstractC2469fd.f15033a[Gd.u(state).getAddressType().ordinal()];
                if (i6 != 1) {
                    jD = p107y3.a.d();
                } else if (i6 != 2) {
                    jD = p107y3.a.f15985j;
                } else {
                    jD = p107y3.a.c();
                }
                long j5 = jD;
                Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.e(f12, BackgroundKt.m207backgroundbw27NRU$default(b.d(f12, companion), Color.m3926copywmQWz5c$default(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f7));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN5);
                constructor7 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor7);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer);
                eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap11);
                if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11, companion3.getSetModifier());
                String strName = Gd.u(state).getAddressType().name();
                TextStyle labelSmall3 = materialTheme.getTypography(composer, i7).getLabelSmall();
                TextKt.m2432Text4IGK_g(strName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : j5, (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(8), (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
                composer.endNode();
                composer.endNode();
                composer.endNode();
                MeasurePolicy measurePolicyI3 = androidx.compose.foundation.text.modifiers.a.i(f13, arrangement, companion2.getCenterVertically(), composer, 54);
                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, companion);
                constructor8 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor8);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer);
                eVarG8 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyI3, composerM3407constructorimpl8, currentCompositionLocalMap12);
                if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
                }
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier12, companion3.getSetModifier());
                float f14 = 14;
                IconKt.m1877Iconww6aTOc(VerifiedUserKt.getVerifiedUser(icons.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f14)), Color.m3926copywmQWz5c$default(p107y3.a.a(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
                String phone = Gd.u(state).getPhone();
                TextStyle bodySmall = materialTheme.getTypography(composer, i7).getBodySmall();
                TextKt.m2432Text4IGK_g(phone, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
                composer.endNode();
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getStart(), composer, 6);
                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer, companion);
                constructor9 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor9);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer);
                eVarG9 = p035i0.a.g(companion3, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl9, currentCompositionLocalMap13);
                if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
                }
                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier13, companion3.getSetModifier());
                String flatHouse = Gd.u(state).getFlatHouse();
                TextStyle bodyMedium = materialTheme.getTypography(composer, i7).getBodyMedium();
                TextKt.m2432Text4IGK_g(flatHouse, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : companion4.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
                String areaStreet = Gd.u(state).getAreaStreet();
                TextStyle bodyMedium2 = materialTheme.getTypography(composer, i7).getBodyMedium();
                TextKt.m2432Text4IGK_g(areaStreet, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodyMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium2.spanStyle.getFontWeight() : companion4.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium2.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
                String strY = androidx.compose.foundation.text.modifiers.a.y("Landmark: ", Gd.u(state).getLandmark());
                TextStyle bodySmall2 = materialTheme.getTypography(composer, i7).getBodySmall();
                TextKt.m2432Text4IGK_g(strY, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
                String upperCase = (Gd.u(state).getCity() + ", " + Gd.u(state).getState() + " " + Gd.u(state).getPostalCode()).toUpperCase(Locale.ROOT);
                o.e(upperCase, "toUpperCase(...)");
                TextStyle labelSmall4 = materialTheme.getTypography(composer, i7).getLabelSmall();
                TextKt.m2432Text4IGK_g(upperCase, PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, Dp.m6403constructorimpl(f13), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall4.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall4.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall4.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall4.paragraphStyle.getTextMotion() : null), composer, 48, 0, 65532);
                composer.endNode();
                Modifier modifierE2 = b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f9), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                composer.startReplaceGroup(436455231);
                zChanged2 = composer.changed(state);
                objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == companion7.getEmpty()) {
                    objRememberedValue2 = new C2453ed(mutableState4, mutableState2, state, mutableState3);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE2, false, null, null, (a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(f9));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs3);
                constructor10 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor10);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer);
                eVarG10 = p035i0.a.g(companion3, composerM3407constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl10, currentCompositionLocalMap14);
                if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                    p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
                }
                MeasurePolicy measurePolicyI4 = androidx.compose.foundation.text.modifiers.a.i(f12, arrangement, b.c(companion3, composerM3407constructorimpl10, modifierMaterializeModifier14, companion2), composer, 54);
                currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer, companion);
                constructor11 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor11);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer);
                eVarG11 = p035i0.a.g(companion3, composerM3407constructorimpl11, measurePolicyI4, composerM3407constructorimpl11, currentCompositionLocalMap15);
                if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                    p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
                }
                Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier15, companion3.getSetModifier());
                IconKt.m1877Iconww6aTOc(EditKt.getEdit(icons.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f14)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
                TextStyle labelSmall5 = materialTheme.getTypography(composer, i7).getLabelSmall();
                TextKt.m2432Text4IGK_g("Edit Details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall5.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? labelSmall5.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall5.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall5.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall5.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                composer.endNode();
                composer.endNode();
                composer.endNode();
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1747750472);
                Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(30), 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion2.getCenterHorizontally(), composer, 54);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap16 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
                constructor = companion3.getConstructor();
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
                eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap16);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier16, companion3.getSetModifier());
                Modifier modifierM206backgroundbw27NRU = BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(72)), Color.m3926copywmQWz5c$default(p107y3.a.c(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap17 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer, modifierM206backgroundbw27NRU);
                constructor2 = companion3.getConstructor();
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
                eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap17);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier17, companion3.getSetModifier());
                IconKt.m1877Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(36)), Color.m3926copywmQWz5c$default(p107y3.a.c(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
                composer.endNode();
                TextStyle labelSmall6 = materialTheme.getTypography(composer, i7).getLabelSmall();
                TextKt.m2432Text4IGK_g("NO SHIPPING DESTINATION SELECTED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall6.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall6.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall6.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall6.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                ButtonColors buttonColorsM1520buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(p107y3.a.c(), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9));
                composer.startReplaceGroup(-815740573);
                zChanged = composer.changed(state);
                objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == companion7.getEmpty()) {
                    objRememberedValue = new C2453ed(mutableState4, state, mutableState3, mutableState2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ButtonKt.Button((a) objRememberedValue, null, false, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1520buttonColorsro_MJ88, null, null, null, null, X2.d(), composer, 805306368, 486);
                composer.endNode();
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        mutableState = mutableState5;
        p035i0.a.t(currentCompositeKeyHash17, composerM3407constructorimpl17, currentCompositeKeyHash17, eVarG17);
        Updater.m3414setimpl(composerM3407constructorimpl17, modifierMaterializeModifier6, companion3.getSetModifier());
        if (this.f15114r) {
            str = "Select/Add";
        } else {
            str = "Select or Add Another";
        }
        TextStyle labelSmall7 = materialTheme.getTypography(composer, i7).getLabelSmall();
        mutableState2 = mutableState;
        TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion6.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, labelSmall7.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall7.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall7.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall7.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall7.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall7.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall7.paragraphStyle.getTextMotion() : null), composer, 0, 3120, 55294);
        icons = Icons.INSTANCE;
        IconKt.m1877Iconww6aTOc(MoreHorizKt.getMoreHoriz(icons.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f9)), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
        composer.endNode();
        composer.endNode();
        composer.endNode();
        str2 = this.f15113o;
        length = str2.length();
        state = this.f15115s;
        mutableState3 = this.t;
        if (length > 0) {
            composer.startReplaceGroup(1740532184);
            Modifier modifierM668padding3ABfNKs4 = PaddingKt.m668padding3ABfNKs(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f5), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f5));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap18 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs4);
            constructor3 = companion3.getConstructor();
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
            eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl3, currentCompositionLocalMap18);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier18, companion3.getSetModifier());
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion2.getStart(), composer, 6);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap19 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer, companion);
            constructor4 = companion3.getConstructor();
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
            eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap19);
            if (composerM3407constructorimpl4.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            } else {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Alignment.Vertical verticalC2 = b.c(companion3, composerM3407constructorimpl4, modifierMaterializeModifier19, companion2);
            Arrangement.HorizontalOrVertical spaceBetween3 = arrangement.getSpaceBetween();
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween3, verticalC2, composer, 54);
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap20 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier20 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
            constructor5 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
            eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl5, currentCompositionLocalMap20);
            if (composerM3407constructorimpl5.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            } else {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            MeasurePolicy measurePolicyI5 = androidx.compose.foundation.text.modifiers.a.i(f10, arrangement, b.c(companion3, composerM3407constructorimpl5, modifierMaterializeModifier20, companion2), composer, 54);
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap110 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer, companion);
            constructor6 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
            eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyI5, composerM3407constructorimpl6, currentCompositionLocalMap110);
            if (composerM3407constructorimpl6.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            } else {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier110, companion3.getSetModifier());
            TextStyle titleMedium3 = materialTheme.getTypography(composer, i7).getTitleMedium();
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium3.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium3.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(18), (16645977 & 4) != 0 ? titleMedium3.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? titleMedium3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium3.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium3.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
            i6 = AbstractC2469fd.f15033a[Gd.u(state).getAddressType().ordinal()];
            if (i6 != 1) {
                jD = p107y3.a.d();
            } else if (i6 != 2) {
                jD = p107y3.a.f15985j;
            } else {
                jD = p107y3.a.c();
            }
            long j6 = jD;
            Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(b.e(f12, BackgroundKt.m207backgroundbw27NRU$default(b.d(f12, companion), Color.m3926copywmQWz5c$default(j6, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(j6, 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f7));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap111 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN6);
            constructor7 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer);
            eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl7, currentCompositionLocalMap111);
            if (composerM3407constructorimpl7.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
            } else {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
            }
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111, companion3.getSetModifier());
            String strName2 = Gd.u(state).getAddressType().name();
            TextStyle labelSmall8 = materialTheme.getTypography(composer, i7).getLabelSmall();
            TextKt.m2432Text4IGK_g(strName2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall8.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall8.spanStyle.m5841getColor0d7_KjU() : j6, (16645977 & 2) != 0 ? labelSmall8.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(8), (16645977 & 4) != 0 ? labelSmall8.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall8.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall8.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall8.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            MeasurePolicy measurePolicyI6 = androidx.compose.foundation.text.modifiers.a.i(f13, arrangement, companion2.getCenterVertically(), composer, 54);
            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap112 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composer, companion);
            constructor8 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor8);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer);
            eVarG8 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyI6, composerM3407constructorimpl8, currentCompositionLocalMap112);
            if (composerM3407constructorimpl8.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
            } else {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier112, companion3.getSetModifier());
            float f15 = 14;
            IconKt.m1877Iconww6aTOc(VerifiedUserKt.getVerifiedUser(icons.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f15)), Color.m3926copywmQWz5c$default(p107y3.a.a(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
            String phone2 = Gd.u(state).getPhone();
            TextStyle bodySmall3 = materialTheme.getTypography(composer, i7).getBodySmall();
            TextKt.m2432Text4IGK_g(phone2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
            composer.endNode();
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), companion2.getStart(), composer, 6);
            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap113 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composer, companion);
            constructor9 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor9);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer);
            eVarG9 = p035i0.a.g(companion3, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl9, currentCompositionLocalMap113);
            if (composerM3407constructorimpl9.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
            } else {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
            }
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier113, companion3.getSetModifier());
            String flatHouse2 = Gd.u(state).getFlatHouse();
            TextStyle bodyMedium3 = materialTheme.getTypography(composer, i7).getBodyMedium();
            TextKt.m2432Text4IGK_g(flatHouse2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium3.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodyMedium3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium3.spanStyle.getFontWeight() : companion4.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium3.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium3.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
            String areaStreet2 = Gd.u(state).getAreaStreet();
            TextStyle bodyMedium4 = materialTheme.getTypography(composer, i7).getBodyMedium();
            TextKt.m2432Text4IGK_g(areaStreet2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium4.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodyMedium4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium4.spanStyle.getFontWeight() : companion4.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium4.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium4.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
            String strY2 = androidx.compose.foundation.text.modifiers.a.y("Landmark: ", Gd.u(state).getLandmark());
            TextStyle bodySmall4 = materialTheme.getTypography(composer, i7).getBodySmall();
            TextKt.m2432Text4IGK_g(strY2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
            String upperCase2 = (Gd.u(state).getCity() + ", " + Gd.u(state).getState() + " " + Gd.u(state).getPostalCode()).toUpperCase(Locale.ROOT);
            o.e(upperCase2, "toUpperCase(...)");
            TextStyle labelSmall9 = materialTheme.getTypography(composer, i7).getLabelSmall();
            TextKt.m2432Text4IGK_g(upperCase2, PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, Dp.m6403constructorimpl(f13), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall9.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall9.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall9.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall9.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall9.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall9.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall9.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall9.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall9.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall9.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall9.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall9.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall9.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall9.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall9.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall9.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall9.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall9.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall9.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall9.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall9.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall9.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall9.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall9.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall9.paragraphStyle.getTextMotion() : null), composer, 48, 0, 65532);
            composer.endNode();
            Modifier modifierE3 = b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f9), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
            composer.startReplaceGroup(436455231);
            zChanged2 = composer.changed(state);
            objRememberedValue2 = composer.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new C2453ed(mutableState4, mutableState2, state, mutableState3);
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new C2453ed(mutableState4, mutableState2, state, mutableState3);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM668padding3ABfNKs5 = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE3, false, null, null, (a) objRememberedValue2, 7, null), Dp.m6403constructorimpl(f9));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap114 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs5);
            constructor10 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor10);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer);
            eVarG10 = p035i0.a.g(companion3, composerM3407constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl10, currentCompositionLocalMap114);
            if (composerM3407constructorimpl10.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
            } else {
                p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
            }
            MeasurePolicy measurePolicyI7 = androidx.compose.foundation.text.modifiers.a.i(f12, arrangement, b.c(companion3, composerM3407constructorimpl10, modifierMaterializeModifier114, companion2), composer, 54);
            currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap115 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composer, companion);
            constructor11 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor11);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer);
            eVarG11 = p035i0.a.g(companion3, composerM3407constructorimpl11, measurePolicyI7, composerM3407constructorimpl11, currentCompositionLocalMap115);
            if (composerM3407constructorimpl11.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
            } else {
                p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
            }
            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier115, companion3.getSetModifier());
            IconKt.m1877Iconww6aTOc(EditKt.getEdit(icons.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f15)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
            TextStyle labelSmall10 = materialTheme.getTypography(composer, i7).getLabelSmall();
            TextKt.m2432Text4IGK_g("Edit Details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall10.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall10.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? labelSmall10.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall10.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall10.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall10.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall10.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall10.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall10.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall10.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall10.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall10.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall10.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall10.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall10.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall10.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall10.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall10.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall10.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall10.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall10.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall10.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall10.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall10.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall10.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1747750472);
            Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(30), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion2.getCenterHorizontally(), composer, 54);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap116 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default2);
            constructor = companion3.getConstructor();
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
            eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl, currentCompositionLocalMap116);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier116, companion3.getSetModifier());
            Modifier modifierM206backgroundbw27NRU2 = BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(72)), Color.m3926copywmQWz5c$default(p107y3.a.c(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap117 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composer, modifierM206backgroundbw27NRU2);
            constructor2 = companion3.getConstructor();
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
            eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl2, currentCompositionLocalMap117);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier117, companion3.getSetModifier());
            IconKt.m1877Iconww6aTOc(LocationOnKt.getLocationOn(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(36)), Color.m3926copywmQWz5c$default(p107y3.a.c(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), composer, 3504, 0);
            composer.endNode();
            TextStyle labelSmall11 = materialTheme.getTypography(composer, i7).getLabelSmall();
            TextKt.m2432Text4IGK_g("NO SHIPPING DESTINATION SELECTED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall11.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall11.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall11.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall11.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall11.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall11.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall11.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall11.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall11.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall11.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall11.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall11.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall11.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall11.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall11.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall11.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall11.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall11.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall11.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall11.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall11.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall11.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall11.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall11.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall11.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            ButtonColors buttonColorsM1520buttonColorsro_MJ89 = ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(p107y3.a.c(), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9));
            composer.startReplaceGroup(-815740573);
            zChanged = composer.changed(state);
            objRememberedValue = composer.rememberedValue();
            if (zChanged) {
                objRememberedValue = new C2453ed(mutableState4, state, mutableState3, mutableState2);
                composer.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new C2453ed(mutableState4, state, mutableState3, mutableState2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue, null, false, roundedCornerShapeM955RoundedCornerShape0680j_5, buttonColorsM1520buttonColorsro_MJ89, null, null, null, null, X2.d(), composer, 805306368, 486);
            composer.endNode();
            composer.endReplaceGroup();
        }
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // O3.f
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return B3.o.f154a;
    }
}

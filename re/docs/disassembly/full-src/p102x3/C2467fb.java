package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import W3.j;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ShieldKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;
import p083t3.C2321y;
import p087u3.v;

/* JADX INFO: renamed from: x3.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2467fb implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f15017A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f15018B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ boolean f15019C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ a f15020D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f15021E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f15022o;
    public final /* synthetic */ a p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15024s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15025v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f15029z;

    public C2467fb(v vVar, a aVar, MutableState mutableState, MutableState mutableState2, String str, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, boolean z3, a aVar2, MutableState mutableState12) {
        this.f15022o = vVar;
        this.p = aVar;
        this.q = mutableState;
        this.f15023r = mutableState2;
        this.f15024s = str;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f15025v = mutableState5;
        this.f15026w = mutableState6;
        this.f15027x = mutableState7;
        this.f15028y = mutableState8;
        this.f15029z = mutableState9;
        this.f15017A = mutableState10;
        this.f15018B = mutableState11;
        this.f15019C = z3;
        this.f15020D = aVar2;
        this.f15021E = mutableState12;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:105:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:106:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:111:0x0603  */
    /* JADX WARN: Code duplicated, block: B:114:0x068e  */
    /* JADX WARN: Code duplicated, block: B:117:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:120:0x070a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0748  */
    /* JADX WARN: Code duplicated, block: B:126:0x0799  */
    /* JADX WARN: Code duplicated, block: B:127:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:129:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:130:0x0841  */
    /* JADX WARN: Code duplicated, block: B:133:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:137:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:142:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:145:0x090b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0959  */
    /* JADX WARN: Code duplicated, block: B:151:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:154:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:160:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:163:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:166:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:167:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:172:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:176:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:178:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:179:0x0b7a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:185:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:187:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:194:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:197:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:200:0x0c31  */
    /* JADX WARN: Code duplicated, block: B:201:0x0c35  */
    /* JADX WARN: Code duplicated, block: B:204:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:207:0x0c57  */
    /* JADX WARN: Code duplicated, block: B:211:0x0c67  */
    /* JADX WARN: Code duplicated, block: B:213:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:217:0x0d16  */
    /* JADX WARN: Code duplicated, block: B:220:0x0d22  */
    /* JADX WARN: Code duplicated, block: B:221:0x0d26  */
    /* JADX WARN: Code duplicated, block: B:226:0x0d45  */
    /* JADX WARN: Code duplicated, block: B:234:0x0e37  */
    /* JADX WARN: Code duplicated, block: B:85:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:88:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:89:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:99:0x0559  */
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
        float f5;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        float f6;
        float f7;
        String strG0;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        MutableState mutableState;
        Object objRememberedValue;
        MutableState mutableState2;
        Object objRememberedValue2;
        MutableState mutableState3;
        Object objRememberedValue3;
        MutableState mutableState4;
        Object objRememberedValue4;
        Composer composer;
        MutableState mutableState5;
        Composer composer2;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        MutableState mutableState6;
        Object objRememberedValue5;
        MutableState mutableState7;
        Object objRememberedValue6;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG4;
        boolean z3;
        float f8;
        Composer composer3;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG5;
        boolean z4;
        Composer composer4;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG6;
        boolean z5;
        boolean z6;
        MutableState mutableState8;
        boolean zB;
        long jM3962getTransparent0d7_KjU;
        float fM6403constructorimpl;
        long jM3962getTransparent0d7_KjU2;
        boolean zChanged;
        Object objRememberedValue7;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        RowScopeInstance rowScopeInstance;
        long jM3926copywmQWz5c$default;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer5 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer5.getSkipping()) {
            composer5.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-68278510, iIntValue, -1, "com.notescrafter.ui.screens.AddressFormDialog.<anonymous>.<anonymous>.<anonymous> (PrintAddressesScreen.kt:924)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(20)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(16));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion2.getStart(), composer5, 6);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor8 = companion3.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor8);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer5);
            e eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl8, currentCompositionLocalMap);
            if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer5, 54);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default);
            a constructor9 = companion3.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor9);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer5);
            e eVarG8 = p035i0.a.g(companion3, composerM3407constructorimpl9, measurePolicyRowMeasurePolicy, composerM3407constructorimpl9, currentCompositionLocalMap2);
            if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            v vVar = this.f15022o;
            String str = vVar != null ? "Edit Address" : "New Destination";
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleLarge = materialTheme.getTypography(composer5, i5).getTitleLarge();
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight black = companion4.getBlack();
            Color.Companion companion5 = Color.Companion;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleLarge.spanStyle.getFontWeight() : black, (16645977 & 8) != 0 ? titleLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge.paragraphStyle.getTextMotion() : null), composer5, 0, 0, 65534);
            ComposableLambda composableLambda = AbstractC2649r2.f15478i;
            a aVar = this.p;
            IconButtonKt.IconButton(aVar, null, false, null, null, composableLambda, composer5, 196608, 30);
            composer5.endNode();
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), composer5, 384, 3);
            float f9 = 12;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion2.getTop(), composer5, 6);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, companion);
            a constructor10 = companion3.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor10);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer5);
            e eVarG9 = p035i0.a.g(companion3, composerM3407constructorimpl10, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl10, currentCompositionLocalMap3);
            if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG9);
            }
            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier3, companion3.getSetModifier());
            MutableState mutableState9 = this.q;
            String str2 = (String) mutableState9.getValue();
            composer5.startReplaceGroup(-969856159);
            Object objRememberedValue8 = composer5.rememberedValue();
            Composer.Companion companion6 = Composer.Companion;
            if (objRememberedValue8 == companion6.getEmpty()) {
                objRememberedValue8 = new C2321y(23, mutableState9);
                composer5.updateRememberedValue(objRememberedValue8);
            }
            composer5.endReplaceGroup();
            AbstractC2595nb.b("First Name", str2, (c) objRememberedValue8, "Jane", false, null, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer5, 3462, 48);
            MutableState mutableState10 = this.f15023r;
            String str3 = (String) mutableState10.getValue();
            composer5.startReplaceGroup(-969845536);
            Object objRememberedValue9 = composer5.rememberedValue();
            if (objRememberedValue9 == companion6.getEmpty()) {
                objRememberedValue9 = new C2321y(24, mutableState10);
                composer5.updateRememberedValue(objRememberedValue9);
            }
            composer5.endReplaceGroup();
            AbstractC2595nb.b("Last Name", str3, (c) objRememberedValue9, "Doe", false, null, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer5, 3462, 48);
            composer5.endNode();
            float f10 = 4;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), companion2.getStart(), composer5, 6);
            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, companion);
            a constructor11 = companion3.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor11);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer5);
            e eVarG10 = p035i0.a.g(companion3, composerM3407constructorimpl11, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl11, currentCompositionLocalMap4);
            if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG10);
            }
            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier4, companion3.getSetModifier());
            TextStyle labelSmall = materialTheme.getTypography(composer5, i5).getLabelSmall();
            TextKt.m2432Text4IGK_g("PRIMARY CONTACT NUMBER", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer5, 6, 0, 65534);
            float f11 = 1;
            float f12 = 10;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f9, b.f(f9, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f11), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(14), Dp.m6403constructorimpl(f12));
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer5, 54);
            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierM669paddingVpY3zN4);
            a constructor12 = companion3.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor12);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl12 = Updater.m3407constructorimpl(composer5);
            e eVarG11 = p035i0.a.g(companion3, composerM3407constructorimpl12, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl12, currentCompositionLocalMap5);
            if (composerM3407constructorimpl12.getInserting()) {
                f5 = f11;
            } else {
                f5 = f11;
                if (!o.b(composerM3407constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl12, modifierMaterializeModifier5, companion3.getSetModifier());
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), companion2.getTop(), composer5, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer5, companion);
                constructor = companion3.getConstructor();
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
                eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap6);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier6, companion3.getSetModifier());
                f6 = f5;
                f7 = f12;
                TextKt.m2432Text4IGK_g("+91 ", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 196998, 0, 131034);
                if (vVar != null || (strG0 = vVar.getPhone()) == null) {
                    Pattern patternCompile = Pattern.compile("\\D");
                    o.e(patternCompile, "compile(...)");
                    String input = this.f15024s;
                    o.f(input, "input");
                    String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                    o.e(strReplaceAll, "replaceAll(...)");
                    strG0 = j.G0(strReplaceAll);
                }
                TextKt.m2432Text4IGK_g(strG0, (Modifier) null, companion5.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 196992, 0, 131034);
                composer5.endNode();
                MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f10, arrangement, companion2.getCenterVertically(), composer5, 54);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer5, companion);
                constructor2 = companion3.getConstructor();
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
                eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyI, composerM3407constructorimpl2, currentCompositionLocalMap7);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier7, companion3.getSetModifier());
                IconKt.m1877Iconww6aTOc(ShieldKt.getShield(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f9)), ColorKt.Color(4281652121L), composer5, 3504, 0);
                TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, ColorKt.Color(4281652121L), TextUnitKt.getSp(9), (FontStyle) null, companion4.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 200070, 0, 131026);
                composer5.endNode();
                composer5.endNode();
                composer5.endNode();
                mutableState = this.t;
                String str4 = (String) mutableState.getValue();
                composer5.startReplaceGroup(40245634);
                objRememberedValue = composer5.rememberedValue();
                if (objRememberedValue == companion6.getEmpty()) {
                    objRememberedValue = new C2321y(25, mutableState);
                    composer5.updateRememberedValue(objRememberedValue);
                }
                composer5.endReplaceGroup();
                AbstractC2595nb.b("Flat / House / Building", str4, (c) objRememberedValue, "House 12, Block B", false, null, null, composer5, 3462, 112);
                mutableState2 = this.u;
                String str5 = (String) mutableState2.getValue();
                composer5.startReplaceGroup(40254851);
                objRememberedValue2 = composer5.rememberedValue();
                if (objRememberedValue2 == companion6.getEmpty()) {
                    objRememberedValue2 = new C2321y(26, mutableState2);
                    composer5.updateRememberedValue(objRememberedValue2);
                }
                composer5.endReplaceGroup();
                AbstractC2595nb.b("Area / Sector / Locality / Street", str5, (c) objRememberedValue2, "MG Road, Sector 4", false, null, null, composer5, 3462, 112);
                mutableState3 = this.f15025v;
                String str6 = (String) mutableState3.getValue();
                composer5.startReplaceGroup(40263233);
                objRememberedValue3 = composer5.rememberedValue();
                if (objRememberedValue3 == companion6.getEmpty()) {
                    objRememberedValue3 = new C2321y(27, mutableState3);
                    composer5.updateRememberedValue(objRememberedValue3);
                }
                composer5.endReplaceGroup();
                AbstractC2595nb.b("Landmark", str6, (c) objRememberedValue3, "Near City Mall", false, null, null, composer5, 3462, 112);
                mutableState4 = this.f15026w;
                String str7 = (String) mutableState4.getValue();
                composer5.startReplaceGroup(40271429);
                objRememberedValue4 = composer5.rememberedValue();
                if (objRememberedValue4 == companion6.getEmpty()) {
                    objRememberedValue4 = new C2321y(28, mutableState4);
                    composer5.updateRememberedValue(objRememberedValue4);
                }
                composer5.endReplaceGroup();
                AbstractC2595nb.b("Pincode", str7, (c) objRememberedValue4, "6 digits", false, new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null), null, composer5, 200070, 80);
                if (((Boolean) this.f15027x.getValue()).booleanValue()) {
                    composer5.startReplaceGroup(1248720643);
                    composer = composer5;
                    TextKt.m2432Text4IGK_g("Looking up pincode details...", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
                    composer.endReplaceGroup();
                } else {
                    composer = composer5;
                    mutableState5 = this.f15028y;
                    if (((String) mutableState5.getValue()) != null) {
                        composer.startReplaceGroup(1248893313);
                        String str8 = (String) mutableState5.getValue();
                        o.c(str8);
                        composer = composer;
                        TextKt.m2432Text4IGK_g(str8, (Modifier) null, ColorKt.Color(4294472049L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3456, 0, 131058);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1249012725);
                        TextKt.m2432Text4IGK_g("City and state will auto-fill from pincode.", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
                        composer.endReplaceGroup();
                    }
                }
                composer2 = composer;
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion2.getTop(), composer2, 6);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, companion);
                constructor3 = companion3.getConstructor();
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
                eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap8);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier8, companion3.getSetModifier());
                mutableState6 = this.f15029z;
                String str9 = (String) mutableState6.getValue();
                composer2.startReplaceGroup(-969706020);
                objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion6.getEmpty()) {
                    objRememberedValue5 = new C2321y(29, mutableState6);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                AbstractC2595nb.b("City", str9, (c) objRememberedValue5, "Auto-filled", false, null, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 28038, 32);
                mutableState7 = this.f15017A;
                String str10 = (String) mutableState7.getValue();
                composer2.startReplaceGroup(-969694115);
                objRememberedValue6 = composer2.rememberedValue();
                if (objRememberedValue6 == companion6.getEmpty()) {
                    objRememberedValue6 = new C2435db(0, mutableState7);
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                composer2.endReplaceGroup();
                AbstractC2595nb.b("State", str10, (c) objRememberedValue6, "Auto-filled", false, null, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 28038, 32);
                composer2.endNode();
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), companion2.getStart(), composer2, 6);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, companion);
                constructor4 = companion3.getConstructor();
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
                eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap9);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier9, companion3.getSetModifier());
                TextStyle labelSmall2 = materialTheme.getTypography(composer2, i5).getLabelSmall();
                TextKt.m2432Text4IGK_g("ADDRESS TYPE", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
                z3 = true;
                f8 = f9;
                Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(b.e(f8, b.f(f8, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(2));
                composer3 = composer2;
                MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs);
                constructor5 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor5);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl5, currentCompositionLocalMap10);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                p035i0.a.w(companion3, composerM3407constructorimpl5, modifierMaterializeModifier10, composer3, -1164526743);
                for (String str11 : C3.v.S("Home", "Work", "Temporary")) {
                    mutableState8 = this.f15018B;
                    zB = o.b((String) mutableState8.getValue(), str11);
                    float f13 = f7;
                    Modifier modifierG = b.g(RowScope.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null), f13);
                    if (zB) {
                        jM3962getTransparent0d7_KjU = Color.m3926copywmQWz5c$default(ColorKt.Color(4290807036L), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                    }
                    Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierG, jM3962getTransparent0d7_KjU, null, 2, null);
                    if (zB) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(f6);
                    } else {
                        fM6403constructorimpl = Dp.m6403constructorimpl(0);
                    }
                    if (zB) {
                        jM3962getTransparent0d7_KjU2 = Color.m3926copywmQWz5c$default(ColorKt.Color(4290807036L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3962getTransparent0d7_KjU2 = Color.Companion.m3962getTransparent0d7_KjU();
                    }
                    Modifier modifierE = b.e(f13, modifierM207backgroundbw27NRU$default, fM6403constructorimpl, jM3962getTransparent0d7_KjU2);
                    composer3.startReplaceGroup(1524977187);
                    zChanged = composer3.changed(str11);
                    objRememberedValue7 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new C2290i(17, (Object) mutableState8, str11);
                        composer3.updateRememberedValue(objRememberedValue7);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (a) objRememberedValue7, 7, null), 0.0f, Dp.m6403constructorimpl(f13), 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    constructor7 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                    e eVarG12 = p035i0.a.g(companion7, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl7, currentCompositionLocalMap11);
                    if (composerM3407constructorimpl7.getInserting()) {
                        rowScopeInstance = rowScopeInstance2;
                    } else {
                        rowScopeInstance = rowScopeInstance2;
                        if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11, companion7.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (zB) {
                            jM3926copywmQWz5c$default = ColorKt.Color(4290807036L);
                        } else {
                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        Composer composer6 = composer3;
                        TextKt.m2432Text4IGK_g(str11, (Modifier) null, jM3926copywmQWz5c$default, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 199680, 0, 131026);
                        composer6.endNode();
                        composer3 = composer6;
                        z3 = true;
                        f7 = f13;
                        f8 = f8;
                        rowScopeInstance2 = rowScopeInstance;
                    }
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG12);
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (zB) {
                        jM3926copywmQWz5c$default = ColorKt.Color(4290807036L);
                    } else {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    Composer composer7 = composer3;
                    TextKt.m2432Text4IGK_g(str11, (Modifier) null, jM3926copywmQWz5c$default, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer7, 199680, 0, 131026);
                    composer7.endNode();
                    composer3 = composer7;
                    z3 = true;
                    f7 = f13;
                    f8 = f8;
                    rowScopeInstance2 = rowScopeInstance;
                }
                z4 = z3;
                composer4 = composer3;
                float f14 = f8;
                composer4.endReplaceGroup();
                composer4.endNode();
                composer4.endNode();
                Modifier.Companion companion8 = Modifier.Companion;
                b.m(8, companion8, composer4, 6);
                MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14)), Alignment.Companion.getTop(), composer4, 6);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer4, companion8);
                ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                constructor6 = companion9.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor6);
                } else {
                    composer4.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer4);
                eVarG6 = p035i0.a.g(companion9, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl6, currentCompositionLocalMap12);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier12, companion9.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                Color.Companion companion10 = Color.Companion;
                long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(companion10.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null);
                int i6 = (ButtonDefaults.$stable << 12) | 6;
                z5 = false;
                ButtonKt.Button(aVar, b.e(f14, RowScope.weight$default(rowScopeInstance3, companion8, 1.0f, false, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion10.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults.m1520buttonColorsro_MJ88(jM3926copywmQWz5c$default2, 0L, 0L, 0L, composer4, i6, 14), null, null, null, null, AbstractC2649r2.f15479j, composer4, 805306368, 484);
                z6 = this.f15019C;
                MutableState mutableState11 = this.f15021E;
                if (z6 && !((Boolean) mutableState11.getValue()).booleanValue()) {
                    z5 = z4;
                }
                ButtonKt.Button(this.f15020D, RowScope.weight$default(rowScopeInstance3, companion8, 1.5f, false, 2, null), z5, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults.m1520buttonColorsro_MJ88(p107y3.a.f15978a, 0L, 0L, 0L, composer4, i6, 14), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(324627916, true, new C2451eb(vVar, mutableState11), composer4, 54), composer4, 805306368, 480);
                if (androidx.compose.foundation.text.modifiers.a.w(composer4)) {
                    ComposerKt.traceEventEnd();
                }
            }
            p035i0.a.t(currentCompositeKeyHash12, composerM3407constructorimpl12, currentCompositeKeyHash12, eVarG11);
            Updater.m3414setimpl(composerM3407constructorimpl12, modifierMaterializeModifier5, companion3.getSetModifier());
            MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), companion2.getTop(), composer5, 6);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap13 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer5, companion);
            constructor = companion3.getConstructor();
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
            eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl, currentCompositionLocalMap13);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier13, companion3.getSetModifier());
            f6 = f5;
            f7 = f12;
            TextKt.m2432Text4IGK_g("+91 ", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 196998, 0, 131034);
            if (vVar != null) {
                Pattern patternCompile2 = Pattern.compile("\\D");
                o.e(patternCompile2, "compile(...)");
                String input2 = this.f15024s;
                o.f(input2, "input");
                String strReplaceAll2 = patternCompile2.matcher(input2).replaceAll("");
                o.e(strReplaceAll2, "replaceAll(...)");
                strG0 = j.G0(strReplaceAll2);
            } else {
                Pattern patternCompile3 = Pattern.compile("\\D");
                o.e(patternCompile3, "compile(...)");
                String input3 = this.f15024s;
                o.f(input3, "input");
                String strReplaceAll3 = patternCompile3.matcher(input3).replaceAll("");
                o.e(strReplaceAll3, "replaceAll(...)");
                strG0 = j.G0(strReplaceAll3);
            }
            TextKt.m2432Text4IGK_g(strG0, (Modifier) null, companion5.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 196992, 0, 131034);
            composer5.endNode();
            MeasurePolicy measurePolicyI2 = androidx.compose.foundation.text.modifiers.a.i(f10, arrangement, companion2.getCenterVertically(), composer5, 54);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap14 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer5, companion);
            constructor2 = companion3.getConstructor();
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
            eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyI2, composerM3407constructorimpl2, currentCompositionLocalMap14);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier14, companion3.getSetModifier());
            IconKt.m1877Iconww6aTOc(ShieldKt.getShield(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f9)), ColorKt.Color(4281652121L), composer5, 3504, 0);
            TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, ColorKt.Color(4281652121L), TextUnitKt.getSp(9), (FontStyle) null, companion4.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 200070, 0, 131026);
            composer5.endNode();
            composer5.endNode();
            composer5.endNode();
            mutableState = this.t;
            String str12 = (String) mutableState.getValue();
            composer5.startReplaceGroup(40245634);
            objRememberedValue = composer5.rememberedValue();
            if (objRememberedValue == companion6.getEmpty()) {
                objRememberedValue = new C2321y(25, mutableState);
                composer5.updateRememberedValue(objRememberedValue);
            }
            composer5.endReplaceGroup();
            AbstractC2595nb.b("Flat / House / Building", str12, (c) objRememberedValue, "House 12, Block B", false, null, null, composer5, 3462, 112);
            mutableState2 = this.u;
            String str13 = (String) mutableState2.getValue();
            composer5.startReplaceGroup(40254851);
            objRememberedValue2 = composer5.rememberedValue();
            if (objRememberedValue2 == companion6.getEmpty()) {
                objRememberedValue2 = new C2321y(26, mutableState2);
                composer5.updateRememberedValue(objRememberedValue2);
            }
            composer5.endReplaceGroup();
            AbstractC2595nb.b("Area / Sector / Locality / Street", str13, (c) objRememberedValue2, "MG Road, Sector 4", false, null, null, composer5, 3462, 112);
            mutableState3 = this.f15025v;
            String str14 = (String) mutableState3.getValue();
            composer5.startReplaceGroup(40263233);
            objRememberedValue3 = composer5.rememberedValue();
            if (objRememberedValue3 == companion6.getEmpty()) {
                objRememberedValue3 = new C2321y(27, mutableState3);
                composer5.updateRememberedValue(objRememberedValue3);
            }
            composer5.endReplaceGroup();
            AbstractC2595nb.b("Landmark", str14, (c) objRememberedValue3, "Near City Mall", false, null, null, composer5, 3462, 112);
            mutableState4 = this.f15026w;
            String str15 = (String) mutableState4.getValue();
            composer5.startReplaceGroup(40271429);
            objRememberedValue4 = composer5.rememberedValue();
            if (objRememberedValue4 == companion6.getEmpty()) {
                objRememberedValue4 = new C2321y(28, mutableState4);
                composer5.updateRememberedValue(objRememberedValue4);
            }
            composer5.endReplaceGroup();
            AbstractC2595nb.b("Pincode", str15, (c) objRememberedValue4, "6 digits", false, new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null), null, composer5, 200070, 80);
            if (((Boolean) this.f15027x.getValue()).booleanValue()) {
                composer5.startReplaceGroup(1248720643);
                composer = composer5;
                TextKt.m2432Text4IGK_g("Looking up pincode details...", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
                composer.endReplaceGroup();
            } else {
                composer = composer5;
                mutableState5 = this.f15028y;
                if (((String) mutableState5.getValue()) != null) {
                    composer.startReplaceGroup(1248893313);
                    String str16 = (String) mutableState5.getValue();
                    o.c(str16);
                    composer = composer;
                    TextKt.m2432Text4IGK_g(str16, (Modifier) null, ColorKt.Color(4294472049L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3456, 0, 131058);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1249012725);
                    TextKt.m2432Text4IGK_g("City and state will auto-fill from pincode.", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3462, 0, 131058);
                    composer.endReplaceGroup();
                }
            }
            composer2 = composer;
            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9)), companion2.getTop(), composer2, 6);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer2, companion);
            constructor3 = companion3.getConstructor();
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
            eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl3, currentCompositionLocalMap15);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier15, companion3.getSetModifier());
            mutableState6 = this.f15029z;
            String str17 = (String) mutableState6.getValue();
            composer2.startReplaceGroup(-969706020);
            objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == companion6.getEmpty()) {
                objRememberedValue5 = new C2321y(29, mutableState6);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceGroup();
            AbstractC2595nb.b("City", str17, (c) objRememberedValue5, "Auto-filled", false, null, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 28038, 32);
            mutableState7 = this.f15017A;
            String str18 = (String) mutableState7.getValue();
            composer2.startReplaceGroup(-969694115);
            objRememberedValue6 = composer2.rememberedValue();
            if (objRememberedValue6 == companion6.getEmpty()) {
                objRememberedValue6 = new C2435db(0, mutableState7);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceGroup();
            AbstractC2595nb.b("State", str18, (c) objRememberedValue6, "Auto-filled", false, null, RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 28038, 32);
            composer2.endNode();
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), companion2.getStart(), composer2, 6);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer2, companion);
            constructor4 = companion3.getConstructor();
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
            eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap16);
            if (composerM3407constructorimpl4.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            } else {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier16, companion3.getSetModifier());
            TextStyle labelSmall3 = materialTheme.getTypography(composer2, i5).getLabelSmall();
            TextKt.m2432Text4IGK_g("ADDRESS TYPE", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composer2, 6, 0, 65534);
            z3 = true;
            f8 = f9;
            Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f8, b.f(f8, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(2));
            composer3 = composer2;
            MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap17 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs2);
            constructor5 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor5);
            } else {
                composer3.useNode();
            }
            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
            eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy10, composerM3407constructorimpl5, currentCompositionLocalMap17);
            if (composerM3407constructorimpl5.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            } else {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            p035i0.a.w(companion3, composerM3407constructorimpl5, modifierMaterializeModifier17, composer3, -1164526743);
            while (r4.hasNext()) {
                mutableState8 = this.f15018B;
                zB = o.b((String) mutableState8.getValue(), str11);
                float f15 = f7;
                Modifier modifierG2 = b.g(RowScope.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null), f15);
                if (zB) {
                    jM3962getTransparent0d7_KjU = Color.m3926copywmQWz5c$default(ColorKt.Color(4290807036L), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                }
                Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(modifierG2, jM3962getTransparent0d7_KjU, null, 2, null);
                if (zB) {
                    fM6403constructorimpl = Dp.m6403constructorimpl(f6);
                } else {
                    fM6403constructorimpl = Dp.m6403constructorimpl(0);
                }
                if (zB) {
                    jM3962getTransparent0d7_KjU2 = Color.m3926copywmQWz5c$default(ColorKt.Color(4290807036L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3962getTransparent0d7_KjU2 = Color.Companion.m3962getTransparent0d7_KjU();
                }
                Modifier modifierE2 = b.e(f15, modifierM207backgroundbw27NRU$default2, fM6403constructorimpl, jM3962getTransparent0d7_KjU2);
                composer3.startReplaceGroup(1524977187);
                zChanged = composer3.changed(str11);
                objRememberedValue7 = composer3.rememberedValue();
                if (zChanged) {
                    objRememberedValue7 = new C2290i(17, (Object) mutableState8, str11);
                    composer3.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new C2290i(17, (Object) mutableState8, str11);
                    composer3.updateRememberedValue(objRememberedValue7);
                }
                composer3.endReplaceGroup();
                Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierE2, false, null, null, (a) objRememberedValue7, 7, null), 0.0f, Dp.m6403constructorimpl(f15), 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap18 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion11 = ComposeUiNode.Companion;
                constructor7 = companion11.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor7);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                e eVarG13 = p035i0.a.g(companion11, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap18);
                if (composerM3407constructorimpl7.getInserting()) {
                    rowScopeInstance = rowScopeInstance2;
                    if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier18, companion11.getSetModifier());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    if (zB) {
                        jM3926copywmQWz5c$default = ColorKt.Color(4290807036L);
                    } else {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    Composer composer8 = composer3;
                    TextKt.m2432Text4IGK_g(str11, (Modifier) null, jM3926copywmQWz5c$default, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer8, 199680, 0, 131026);
                    composer8.endNode();
                    composer3 = composer8;
                    z3 = true;
                    f7 = f15;
                    f8 = f8;
                    rowScopeInstance2 = rowScopeInstance;
                } else {
                    rowScopeInstance = rowScopeInstance2;
                }
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG13);
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier18, companion11.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                if (zB) {
                    jM3926copywmQWz5c$default = ColorKt.Color(4290807036L);
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Composer composer9 = composer3;
                TextKt.m2432Text4IGK_g(str11, (Modifier) null, jM3926copywmQWz5c$default, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer9, 199680, 0, 131026);
                composer9.endNode();
                composer3 = composer9;
                z3 = true;
                f7 = f15;
                f8 = f8;
                rowScopeInstance2 = rowScopeInstance;
            }
            z4 = z3;
            composer4 = composer3;
            float f16 = f8;
            composer4.endReplaceGroup();
            composer4.endNode();
            composer4.endNode();
            Modifier.Companion companion12 = Modifier.Companion;
            b.m(8, companion12, composer4, 6);
            MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f16)), Alignment.Companion.getTop(), composer4, 6);
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap19 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer4, companion12);
            ComposeUiNode.Companion companion13 = ComposeUiNode.Companion;
            constructor6 = companion13.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor6);
            } else {
                composer4.useNode();
            }
            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer4);
            eVarG6 = p035i0.a.g(companion13, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy11, composerM3407constructorimpl6, currentCompositionLocalMap19);
            if (composerM3407constructorimpl6.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            } else {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier19, companion13.getSetModifier());
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
            Color.Companion companion14 = Color.Companion;
            long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null);
            int i7 = (ButtonDefaults.$stable << 12) | 6;
            z5 = false;
            ButtonKt.Button(aVar, b.e(f16, RowScope.weight$default(rowScopeInstance4, companion12, 1.0f, false, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16)), buttonDefaults2.m1520buttonColorsro_MJ88(jM3926copywmQWz5c$default3, 0L, 0L, 0L, composer4, i7, 14), null, null, null, null, AbstractC2649r2.f15479j, composer4, 805306368, 484);
            z6 = this.f15019C;
            MutableState mutableState12 = this.f15021E;
            if (z6) {
                z5 = z4;
            }
            ButtonKt.Button(this.f15020D, RowScope.weight$default(rowScopeInstance4, companion12, 1.5f, false, 2, null), z5, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16)), buttonDefaults2.m1520buttonColorsro_MJ88(p107y3.a.f15978a, 0L, 0L, 0L, composer4, i7, 14), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(324627916, true, new C2451eb(vVar, mutableState12), composer4, 54), composer4, 805306368, 480);
            if (androidx.compose.foundation.text.modifiers.a.w(composer4)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

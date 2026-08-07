package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VerifiedKt;
import androidx.compose.material.icons.outlined.PhoneAndroidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.PrintOrderViewModel;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2277b0;
import p083t3.O;
import p087u3.q;

/* JADX INFO: renamed from: x3.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2421cd implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f14892o;
    public final /* synthetic */ a p;
    public final /* synthetic */ PrintOrderViewModel q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f14894s;
    public final /* synthetic */ State t;
    public final /* synthetic */ State u;

    public C2421cd(State state, a aVar, PrintOrderViewModel printOrderViewModel, State state2, State state3, State state4, State state5) {
        this.f14892o = state;
        this.p = aVar;
        this.q = printOrderViewModel;
        this.f14893r = state2;
        this.f14894s = state3;
        this.t = state4;
        this.u = state5;
    }

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
        Composer composer;
        Composer composer2;
        boolean z3;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer3 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2050408267, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:2588)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 20;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            float f6 = 16;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion2.getStart(), composer3, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer3);
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer3, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion);
            a constructor2 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f7 = 2;
            BoxKt.Box(b.f(f7, SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(3)), Dp.m6403constructorimpl(f5)), p107y3.a.f15978a), composer3, 0);
            float f8 = 10;
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f8)), composer3, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion);
            a constructor3 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme.getTypography(composer3, i5).getTitleMedium();
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight bold = companion4.getBold();
            Color.Companion companion5 = Color.Companion;
            TextKt.m2432Text4IGK_g("Contact Information", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleMedium.spanStyle.getFontWeight() : bold, (16645977 & 8) != 0 ? titleMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
            final State state = this.f14892o;
            String str = Gd.u(state).isPhoneVerified() ? "VERIFIED SECURELY" : "VERIFICATION REQUIRED";
            TextStyle labelSmall = materialTheme.getTypography(composer3, i5).getLabelSmall();
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Gd.u(state).isPhoneVerified() ? p107y3.a.a() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65534);
            composer3.endNode();
            composer3.endNode();
            if (Gd.u(state).isPhoneVerified()) {
                composer3.startReplaceGroup(1723146237);
                float f9 = 1;
                Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f6), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f9), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6));
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer3, 48);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs2);
                a constructor4 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                float f10 = 12;
                Modifier modifierE = b.e(f10, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(52)), f10), Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f9), Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierE);
                a constructor5 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor5);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                e eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap5);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                IconKt.m1877Iconww6aTOc(PhoneAndroidKt.getPhoneAndroid(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(26)), p107y3.a.d(), composer3, 3504, 0);
                composer3.endNode();
                androidx.compose.foundation.text.modifiers.a.q(14, companion, composer3, 6);
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                a constructor6 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor6);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl6, currentCompositionLocalMap6);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer3, 54);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                a constructor7 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor7);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                e eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap7);
                if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
                String strY = androidx.compose.foundation.text.modifiers.a.y("+91 ", Gd.u(state).getPhone());
                TextStyle titleMedium2 = materialTheme.getTypography(composer3, i5).getTitleMedium();
                TextKt.m2432Text4IGK_g(strY, rowScopeInstance.weight(companion, 1.0f, false), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, titleMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleMedium2.spanStyle.m5841getColor0d7_KjU() : companion5.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleMedium2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(18), (16645977 & 4) != 0 ? titleMedium2.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? titleMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? titleMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? titleMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleMedium2.paragraphStyle.getTextMotion() : null), composer3, 0, 3120, 55292);
                androidx.compose.foundation.text.modifiers.a.q(6, companion, composer3, 6);
                IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), "Verified", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(18)), p107y3.a.a(), composer3, 3504, 0);
                b.n(composer3, f7, companion, composer3, 6);
                TextStyle bodySmall = materialTheme.getTypography(composer3, i5).getBodySmall();
                TextStyle textStyleM5917copyp1EtxEg = bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : TextDecoration.Companion.getUnderline(), (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null);
                composer3.startReplaceGroup(435834745);
                a aVar = this.p;
                boolean zChanged = composer3.changed(aVar);
                Object objRememberedValue = composer3.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new O(15, aVar);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                TextKt.m2432Text4IGK_g("To change contact number, please contact support", ClickableKt.m242clickableXHw0xAI$default(companion, false, null, null, (a) objRememberedValue, 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer3, 6, 0, 65532);
                composer3.endNode();
                composer3.endNode();
                composer3.endReplaceGroup();
                composer2 = composer3;
            } else {
                composer3.startReplaceGroup(1727352813);
                float f11 = 12;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f11)), companion2.getStart(), composer3, 6);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, companion);
                a constructor8 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor8);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                e eVarG8 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl8, currentCompositionLocalMap8);
                if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
                }
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion3.getSetModifier());
                State state2 = this.f14893r;
                String str2 = ((Boolean) state2.getValue()).booleanValue() ? "ENTER WHATSAPP OTP" : "VERIFY MOBILE NUMBER";
                TextStyle labelSmall2 = materialTheme.getTypography(composer3, i5).getLabelSmall();
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65534);
                boolean zBooleanValue = ((Boolean) state2.getValue()).booleanValue();
                final PrintOrderViewModel printOrderViewModel = this.q;
                State state3 = this.f14894s;
                if (zBooleanValue) {
                    composer3.startReplaceGroup(464061129);
                    String strZ = androidx.compose.foundation.text.modifiers.a.z("Please check your WhatsApp on +91 ", Gd.u(state).getPhone(), " for the 6-digit verification code.");
                    TextStyle bodySmall2 = materialTheme.getTypography(composer3, i5).getBodySmall();
                    TextKt.m2432Text4IGK_g(strZ, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : p107y3.a.f15985j, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer3, 0, 0, 65534);
                    State state4 = this.t;
                    String str3 = (String) state4.getValue();
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6125getNumberPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                    TextFieldColors textFieldColorsM2076colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion5.m3964getWhite0d7_KjU(), companion5.m3964getWhite0d7_KjU(), 0L, 0L, Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, null, p107y3.a.e(), Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer3, 221238, 432, 0, 0, 3072, 2147477452, 4095);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11));
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composer3.startReplaceGroup(-816295292);
                    boolean zChangedInstance = composer3.changedInstance(printOrderViewModel);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new C2277b0(printOrderViewModel, 11);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    OutlinedTextFieldKt.OutlinedTextField(str3, (c) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (e) null, (e) X2.c(), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2076colors0hiis_0, composer3, 12583296, 12779520, 0, 1933176);
                    composer3.startReplaceGroup(-816256257);
                    State state5 = this.u;
                    if (((String) state5.getValue()) != null) {
                        String str4 = (String) state5.getValue();
                        o.c(str4);
                        composer = composer3;
                        TextKt.m2432Text4IGK_g(str4, (Modifier) null, p107y3.a.b(), TextUnitKt.getSp(11), (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
                    } else {
                        composer = composer3;
                    }
                    composer.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Composer composer4 = composer;
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion2.getTop(), composer4, 6);
                    boolean z4 = false;
                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default3);
                    a constructor9 = companion3.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor9);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer4);
                    e eVarG9 = p035i0.a.g(companion3, composerM3407constructorimpl9, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl9, currentCompositionLocalMap9);
                    if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion3.getSetModifier());
                    if (((String) state4.getValue()).length() >= 6 && !((Boolean) state3.getValue()).booleanValue()) {
                        z4 = true;
                    }
                    composer2 = composer4;
                    ButtonColors buttonColorsM1520buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(p107y3.a.e(), 0L, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 6, 14);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11));
                    float f12 = 46;
                    Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m6403constructorimpl(f12));
                    composer2.startReplaceGroup(436054487);
                    boolean zChangedInstance2 = composer2.changedInstance(printOrderViewModel);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        z3 = true;
                        objRememberedValue3 = new Oc(printOrderViewModel, 1);
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        z3 = true;
                    }
                    composer2.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue3, modifierM699height3ABfNKs, z4, roundedCornerShapeM955RoundedCornerShape0680j_5, buttonColorsM1520buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(839112387, z3, new C2405bd(state3), composer2, 54), composer2, 805306368, 480);
                    BorderStroke borderStrokeM236BorderStrokecXLIe8U = BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11));
                    Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f12));
                    composer2.startReplaceGroup(436087651);
                    boolean zChangedInstance3 = composer2.changedInstance(printOrderViewModel) | composer2.changed(state);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        final int i6 = 1;
                        objRememberedValue4 = new a() { // from class: x3.Zc
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i6) {
                                    case 0:
                                        printOrderViewModel.o(((q) state.getValue()).getPhone());
                                        break;
                                    default:
                                        printOrderViewModel.o(((q) state.getValue()).getPhone());
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    ButtonKt.OutlinedButton((a) objRememberedValue4, modifierM699height3ABfNKs2, false, roundedCornerShapeM955RoundedCornerShape0680j_6, null, null, borderStrokeM236BorderStrokecXLIe8U, null, null, X2.f14636n, composer2, 806879280, 436);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(460479358);
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion2.getCenterVertically(), composer3, 54);
                    int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default4);
                    a constructor10 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor10);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                    e eVarG10 = p035i0.a.g(companion3, composerM3407constructorimpl10, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl10, currentCompositionLocalMap10);
                    if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion3.getSetModifier());
                    String phone = Gd.u(state).getPhone();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6128getPhonePjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                    TextFieldColors textFieldColorsM2076colors0hiis_1 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion5.m3964getWhite0d7_KjU(), companion5.m3964getWhite0d7_KjU(), 0L, 0L, Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion5.m3953getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, null, p107y3.a.e(), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer3, 221238, 432, 0, 0, 3072, 2147477452, 4095);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11));
                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composer3.startReplaceGroup(435876997);
                    boolean zChangedInstance4 = composer3.changedInstance(printOrderViewModel);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new C2277b0(printOrderViewModel, 10);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    composer3.endReplaceGroup();
                    OutlinedTextFieldKt.OutlinedTextField(phone, (c) objRememberedValue5, modifierWeight$default2, false, false, (TextStyle) null, (e) X2.b(), (e) null, (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions2, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_7, textFieldColorsM2076colors0hiis_1, composer3, 1572864, 12779520, 0, 1933240);
                    boolean z5 = Gd.u(state).getPhone().length() >= 10 && !((Boolean) state3.getValue()).booleanValue();
                    ButtonColors buttonColorsM1520buttonColorsro_MJ89 = ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(companion5.m3964getWhite0d7_KjU(), 0L, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, composer3, (ButtonDefaults.$stable << 12) | 390, 10);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_8 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11));
                    Modifier modifierM699height3ABfNKs3 = SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(56));
                    composer3.startReplaceGroup(435919811);
                    boolean zChangedInstance5 = composer3.changedInstance(printOrderViewModel) | composer3.changed(state);
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        final int i7 = 0;
                        objRememberedValue6 = new a() { // from class: x3.Zc
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        printOrderViewModel.o(((q) state.getValue()).getPhone());
                                        break;
                                    default:
                                        printOrderViewModel.o(((q) state.getValue()).getPhone());
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    composer3.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue6, modifierM699height3ABfNKs3, z5, roundedCornerShapeM955RoundedCornerShape0680j_8, buttonColorsM1520buttonColorsro_MJ89, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-578306708, true, new C2389ad(state3), composer3, 54), composer3, 805306416, 480);
                    composer3.endNode();
                    TextStyle labelSmall3 = materialTheme.getTypography(composer3, i5).getLabelSmall();
                    TextKt.m2432Text4IGK_g("Verification ensures secure checkouts and delivery updates via WhatsApp.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : FontStyle.m5997boximpl(FontStyle.Companion.m6006getItalic_LCdwA()), (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                }
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

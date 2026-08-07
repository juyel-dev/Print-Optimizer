package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import W3.j;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.F;
import p087u3.q;

/* JADX INFO: renamed from: x3.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2612oc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f15378o;
    public final /* synthetic */ q p;
    public final /* synthetic */ State q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f15379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f15380s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ a u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f15381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f15382w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f15383x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f15384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a f15385z;

    public C2612oc(String str, q qVar, State state, c cVar, a aVar, boolean z3, a aVar2, Context context, List list, q qVar2, c cVar2, a aVar3) {
        this.f15378o = str;
        this.p = qVar;
        this.q = state;
        this.f15379r = cVar;
        this.f15380s = aVar;
        this.t = z3;
        this.u = aVar2;
        this.f15381v = context;
        this.f15382w = list;
        this.f15383x = qVar2;
        this.f15384y = cVar2;
        this.f15385z = aVar3;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope ModalBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1453157059, iIntValue, -1, "com.notescrafter.ui.screens.AddressBottomSheet.<anonymous> (PrintOrderScreens.kt:4464)");
            }
            if (o.b(this.f15378o, "list")) {
                composer.startReplaceGroup(1165179838);
                Modifier.Companion companion = Modifier.Companion;
                Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(24));
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.Companion.getStart(), composer, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                a constructor = companion2.getConstructor();
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
                e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge();
                Color.Companion companion3 = Color.Companion;
                TextKt.m2432Text4IGK_g("Select Destination", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge.spanStyle.m5841getColor0d7_KjU() : companion3.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleLarge.spanStyle.getFontWeight() : FontWeight.Companion.getBlack(), (16645977 & 8) != 0 ? titleLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                float f5 = 16;
                b.m(f5, companion, composer, 6);
                Modifier modifierWeight = columnScopeInstance.weight(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false);
                float f6 = 12;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6));
                composer.startReplaceGroup(261615800);
                List list = this.f15382w;
                boolean zChangedInstance = composer.changedInstance(list);
                q qVar = this.f15383x;
                boolean zChanged = zChangedInstance | composer.changed(qVar);
                c cVar = this.f15384y;
                boolean zChanged2 = zChanged | composer.changed(cVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new F(list, qVar, cVar, 10);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierWeight, null, null, false, horizontalOrVerticalM548spacedBy0680j_4, null, null, false, (c) objRememberedValue, composer, 24576, 238);
                b.m(f5, companion, composer, 6);
                ButtonKt.Button(this.f15385z, SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(52)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6)), ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, X2.f14641w, composer, 805306416, 484);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(32)), composer, 6);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                boolean z3 = false;
                composer.startReplaceGroup(1170038251);
                q qVar2 = this.p;
                String postalCode = qVar2.getPostalCode();
                composer.startReplaceGroup(1838846667);
                boolean zChanged3 = composer.changed(qVar2);
                State state = this.q;
                boolean zChanged4 = zChanged3 | composer.changed(state);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new C2548kc(qVar2, state, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(postalCode, (e) objRememberedValue2, composer, 0);
                if (!j.m0(qVar2.getFirstName()) && !j.m0(qVar2.getLastName()) && !j.m0(qVar2.getPhone()) && !j.m0(qVar2.getFlatHouse()) && !j.m0(qVar2.getAreaStreet()) && !j.m0(qVar2.getCity()) && !j.m0(qVar2.getState()) && qVar2.getPostalCode().length() == 6) {
                    z3 = true;
                }
                Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(24));
                composer.startReplaceGroup(1838885323);
                boolean zChanged5 = composer.changed(qVar2) | composer.changed(this.f15379r) | composer.changed(this.f15380s) | composer.changed(this.t) | composer.changed(z3) | composer.changed(this.u) | composer.changedInstance(this.f15381v);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    final a aVar = this.f15380s;
                    final boolean z4 = this.t;
                    final q qVar3 = this.p;
                    final c cVar2 = this.f15379r;
                    final a aVar2 = this.u;
                    final Context context = this.f15381v;
                    final boolean z5 = z3;
                    objRememberedValue3 = new c() { // from class: x3.jc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            LazyListScope LazyColumn = (LazyListScope) obj4;
                            o.f(LazyColumn, "$this$LazyColumn");
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-34919285, true, new C2596nc(qVar3, cVar2, aVar, z4, z5, aVar2, context)), 3, null);
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierM668padding3ABfNKs2, null, null, false, null, null, null, false, (c) objRememberedValue3, composer, 6, 254);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

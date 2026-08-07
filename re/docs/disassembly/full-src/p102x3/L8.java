package p102x3;

import O3.c;
import O3.f;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.service.PDFProcessor;
import java.util.List;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.q;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class L8 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f14166o;
    public final /* synthetic */ int p;
    public final /* synthetic */ InterfaceC0200y q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f14167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f14168s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14169v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14172y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f14173z;

    public L8(l lVar, int i5, InterfaceC0200y interfaceC0200y, PDFProcessor pDFProcessor, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        this.f14166o = lVar;
        this.p = i5;
        this.q = interfaceC0200y;
        this.f14167r = pDFProcessor;
        this.f14168s = context;
        this.t = mutableState;
        this.u = mutableState2;
        this.f14169v = mutableState3;
        this.f14170w = mutableState4;
        this.f14171x = mutableState5;
        this.f14172y = mutableState6;
        this.f14173z = mutableState7;
    }

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
        Composer composer;
        boolean z3;
        int i5;
        float f5;
        Object obj4;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2039569098, iIntValue, -1, "com.notescrafter.ui.screens.PdfMergeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfMergeScreen.kt:908)");
            }
            Modifier.Companion companion = Modifier.Companion;
            b.m(12, companion, composer2, 6);
            float f6 = 16;
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6));
            BorderStroke borderStrokeM236BorderStrokecXLIe8U = BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), a.f15991r);
            ButtonColors buttonColorsM1530outlinedButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(0L, a.f15990o, 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 48, 13);
            Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(52));
            composer2.startReplaceGroup(1311798476);
            l lVar = this.f14166o;
            boolean zChangedInstance = composer2.changedInstance(lVar);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new P5(lVar, 13);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            ButtonKt.OutlinedButton((O3.a) objRememberedValue, modifierM699height3ABfNKs, false, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1530outlinedButtonColorsro_MJ88, null, borderStrokeM236BorderStrokecXLIe8U, null, null, AbstractC2648r1.f15471i, composer2, 806879280, 420);
            b.m(28, companion, composer2, 6);
            String str = (String) this.t.getValue();
            composer2.startReplaceGroup(1311828649);
            if (str == null) {
                composer = composer2;
            } else {
                long jColor = ColorKt.Color(4293870660L);
                TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                composer = composer2;
                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f6), 7, null), jColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 432, 0, 65016);
            }
            composer.endReplaceGroup();
            String strO = androidx.compose.foundation.text.modifiers.a.o(new StringBuilder("Merge PDFs ("), this.p, " Pages)");
            MutableState mutableState = this.u;
            if (((List) mutableState.getValue()).size() >= 2) {
                i5 = 1;
                f5 = 0.0f;
                obj4 = null;
                z3 = true;
            } else {
                z3 = false;
                i5 = 1;
                f5 = 0.0f;
                obj4 = null;
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, f5, i5, obj4);
            Composer composer3 = composer;
            composer3.startReplaceGroup(1311848554);
            boolean zChangedInstance2 = composer3.changedInstance(this.q) | composer3.changedInstance(this.f14167r) | composer3.changedInstance(this.f14168s);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                C2382a6 c2382a6 = new C2382a6(this.q, mutableState, this.f14167r, this.f14168s, this.f14169v, this.f14170w, this.f14171x, this.t, this.f14172y, this.f14173z);
                composer3.updateRememberedValue(c2382a6);
                objRememberedValue2 = c2382a6;
            }
            composer3.endReplaceGroup();
            q.a(strO, (O3.a) objRememberedValue2, modifierFillMaxWidth$default, null, z3, false, composer3, 384, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

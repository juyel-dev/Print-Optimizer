package p102x3;

import O3.a;
import O3.c;
import O3.f;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
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
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.q;

/* JADX INFO: renamed from: x3.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2702u7 implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f15590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f15591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f15592C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f15593D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f15594E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f15595F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ MutableState f15596G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f15597o;
    public final /* synthetic */ PDFProcessor p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15599s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15603y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f15604z;

    public C2702u7(InterfaceC0200y interfaceC0200y, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, PDFProcessor pDFProcessor) {
        this.f15597o = interfaceC0200y;
        this.p = pDFProcessor;
        this.q = context;
        this.f15598r = mutableState;
        this.f15599s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f15600v = mutableState5;
        this.f15601w = mutableState6;
        this.f15602x = mutableState7;
        this.f15603y = mutableState8;
        this.f15604z = mutableState9;
        this.f15590A = mutableState10;
        this.f15591B = mutableState11;
        this.f15592C = mutableState12;
        this.f15593D = mutableState13;
        this.f15594E = mutableState14;
        this.f15595F = mutableState15;
        this.f15596G = mutableState16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160043553, iIntValue, -1, "com.notescrafter.ui.screens.PdfCompressScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCompressScreen.kt:1014)");
            }
            String str = (String) this.f15598r.getValue();
            composer2.startReplaceGroup(-51684065);
            if (str == null) {
                composer = composer2;
            } else {
                long jColor = ColorKt.Color(4293870660L);
                TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                composer = composer2;
                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(16), 7, null), jColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 432, 0, 65016);
            }
            composer.endReplaceGroup();
            String strL = ((EnumC2778z3) this.f15599s.getValue()) == EnumC2778z3.p ? b.l("Compress to Under ", (String) this.t.getValue(), " ", ((EnumC2614oe) this.u.getValue()).name()) : "Compress PDF";
            Composer composer3 = composer;
            composer3.startReplaceGroup(-51661338);
            boolean zChangedInstance = composer3.changedInstance(this.f15597o) | composer3.changedInstance(this.p) | composer3.changedInstance(this.q);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState mutableState = this.f15603y;
                final MutableState mutableState2 = this.f15595F;
                final MutableState mutableState3 = this.f15596G;
                final InterfaceC0200y interfaceC0200y = this.f15597o;
                final MutableState mutableState4 = this.f15600v;
                final MutableState mutableState5 = this.f15601w;
                final PDFProcessor pDFProcessor = this.p;
                final Context context = this.q;
                final MutableState mutableState6 = this.f15602x;
                final MutableState mutableState7 = this.f15598r;
                final MutableState mutableState8 = this.f15604z;
                final MutableState mutableState9 = this.f15590A;
                final MutableState mutableState10 = this.f15599s;
                final MutableState mutableState11 = this.f15591B;
                final MutableState mutableState12 = this.f15592C;
                final MutableState mutableState13 = this.f15593D;
                final MutableState mutableState14 = this.f15594E;
                final MutableState mutableState15 = this.u;
                final MutableState mutableState16 = this.t;
                objRememberedValue = new a() { // from class: x3.t7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.a
                    public final Object invoke() {
                        Uri uri = (Uri) mutableState4.getValue();
                        if (uri != null) {
                            MutableState mutableState17 = mutableState5;
                            if (((Number) mutableState17.getValue()).intValue() > 0) {
                                A.t(interfaceC0200y, null, null, new C2766y7(pDFProcessor, context, mutableState6, mutableState7, mutableState, mutableState8, mutableState9, mutableState17, uri, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, mutableState2, mutableState3, mutableState15, mutableState16, null), 3);
                            }
                        }
                        return B3.o.f154a;
                    }
                };
                composer3.updateRememberedValue(objRememberedValue);
            }
            composer3.endReplaceGroup();
            q.a(strL, (a) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, false, composer3, 384, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

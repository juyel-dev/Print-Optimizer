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
import p097w3.q;

/* JADX INFO: renamed from: x3.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2752x9 implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f15720A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f15721B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f15722C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f15723D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f15724o;
    public final /* synthetic */ PDFProcessor p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15726s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15730y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f15731z;

    public C2752x9(InterfaceC0200y interfaceC0200y, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, PDFProcessor pDFProcessor) {
        this.f15724o = interfaceC0200y;
        this.p = pDFProcessor;
        this.q = context;
        this.f15725r = mutableState;
        this.f15726s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f15727v = mutableState5;
        this.f15728w = mutableState6;
        this.f15729x = mutableState7;
        this.f15730y = mutableState8;
        this.f15731z = mutableState9;
        this.f15720A = mutableState10;
        this.f15721B = mutableState11;
        this.f15722C = mutableState12;
        this.f15723D = mutableState13;
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
                ComposerKt.traceEventStart(-342173291, iIntValue, -1, "com.notescrafter.ui.screens.PdfSplitScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfSplitScreen.kt:940)");
            }
            String str = (String) this.f15725r.getValue();
            composer2.startReplaceGroup(-664792117);
            if (str == null) {
                composer = composer2;
            } else {
                long jColor = ColorKt.Color(4293870660L);
                TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                composer = composer2;
                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(16), 7, null), jColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 432, 0, 65016);
            }
            composer.endReplaceGroup();
            Composer composer3 = composer;
            composer3.startReplaceGroup(-664772884);
            boolean zChangedInstance = composer3.changedInstance(this.f15724o) | composer3.changedInstance(this.p) | composer3.changedInstance(this.q);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState mutableState = this.f15720A;
                final MutableState mutableState2 = this.f15721B;
                final InterfaceC0200y interfaceC0200y = this.f15724o;
                final MutableState mutableState3 = this.f15726s;
                final MutableState mutableState4 = this.t;
                final PDFProcessor pDFProcessor = this.p;
                final Context context = this.q;
                final MutableState mutableState5 = this.u;
                final MutableState mutableState6 = this.f15725r;
                final MutableState mutableState7 = this.f15727v;
                final MutableState mutableState8 = this.f15728w;
                final MutableState mutableState9 = this.f15729x;
                final MutableState mutableState10 = this.f15730y;
                final MutableState mutableState11 = this.f15731z;
                final MutableState mutableState12 = this.f15722C;
                final MutableState mutableState13 = this.f15723D;
                objRememberedValue = new a() { // from class: x3.w9
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.a
                    public final Object invoke() {
                        Uri uri = (Uri) mutableState3.getValue();
                        if (uri != null) {
                            MutableState mutableState14 = mutableState4;
                            if (((Number) mutableState14.getValue()).intValue() > 0) {
                                A.t(interfaceC0200y, null, null, new A9(pDFProcessor, uri, context, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState14, mutableState11, mutableState, mutableState2, mutableState12, mutableState13, null), 3);
                            }
                        }
                        return B3.o.f154a;
                    }
                };
                composer3.updateRememberedValue(objRememberedValue);
            }
            composer3.endReplaceGroup();
            q.a("Split PDF", (a) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, false, composer3, 390, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

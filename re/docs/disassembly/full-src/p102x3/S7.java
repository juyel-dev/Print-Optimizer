package p102x3;

import O3.a;
import O3.c;
import O3.f;
import W3.p;
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
import kotlin.jvm.internal.o;
import p097w3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class S7 implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f14403A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f14404B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f14405o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14407s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f14412z;

    public S7(InterfaceC0200y interfaceC0200y, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12) {
        this.f14405o = interfaceC0200y;
        this.p = context;
        this.q = mutableState;
        this.f14406r = mutableState2;
        this.f14407s = mutableState3;
        this.t = mutableState4;
        this.u = mutableState5;
        this.f14408v = mutableState6;
        this.f14409w = mutableState7;
        this.f14410x = mutableState8;
        this.f14411y = mutableState9;
        this.f14412z = mutableState10;
        this.f14403A = mutableState11;
        this.f14404B = mutableState12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        Composer composer2;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer3 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-317475548, iIntValue, -1, "com.notescrafter.ui.screens.PdfCropScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfCropScreen.kt:1019)");
            }
            String str = (String) this.q.getValue();
            composer3.startReplaceGroup(-535880915);
            if (str == null) {
                composer = composer3;
            } else {
                long jColor = ColorKt.Color(4293870660L);
                TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium();
                composer = composer3;
                TextKt.m2432Text4IGK_g(str, PaddingKt.m672paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(16), 7, null), jColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getSemiBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 432, 0, 65016);
            }
            composer.endReplaceGroup();
            Composer composer4 = composer;
            composer4.startReplaceGroup(-535861715);
            boolean zChangedInstance = composer4.changedInstance(this.f14405o) | composer4.changedInstance(this.p);
            Object objRememberedValue = composer4.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState mutableState = this.q;
                final MutableState mutableState2 = this.f14412z;
                final InterfaceC0200y interfaceC0200y = this.f14405o;
                final MutableState mutableState3 = this.f14406r;
                final MutableState mutableState4 = this.f14407s;
                final MutableState mutableState5 = this.t;
                final MutableState mutableState6 = this.u;
                final MutableState mutableState7 = this.f14408v;
                final MutableState mutableState8 = this.f14409w;
                final Context context = this.p;
                final MutableState mutableState9 = this.f14410x;
                final MutableState mutableState10 = this.f14411y;
                final MutableState mutableState11 = this.f14403A;
                final MutableState mutableState12 = this.f14404B;
                objRememberedValue = new a() { // from class: x3.R7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.a
                    public final Object invoke() {
                        Uri uri = (Uri) mutableState3.getValue();
                        if (uri != null) {
                            MutableState mutableState13 = mutableState4;
                            if (AbstractC2416c8.b(mutableState13) > 0) {
                                Float fQ = p.Q((String) mutableState5.getValue());
                                float fN = fQ != null ? Q3.a.n(fQ.floatValue(), 0.0f) : 0.0f;
                                Float fQ2 = p.Q((String) mutableState6.getValue());
                                float fN2 = fQ2 != null ? Q3.a.n(fQ2.floatValue(), 0.0f) : 0.0f;
                                Float fQ3 = p.Q((String) mutableState7.getValue());
                                float fN3 = fQ3 != null ? Q3.a.n(fQ3.floatValue(), 0.0f) : 0.0f;
                                Float fQ4 = p.Q((String) mutableState8.getValue());
                                A.t(interfaceC0200y, null, null, new C2384a8(context, mutableState9, mutableState10, mutableState, mutableState2, mutableState11, mutableState12, uri, fN, fN2, fN3, fQ4 != null ? Q3.a.n(fQ4.floatValue(), 0.0f) : 0.0f, mutableState13, null), 3);
                            }
                        }
                        return B3.o.f154a;
                    }
                };
                composer2 = composer4;
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                composer2 = composer4;
            }
            composer2.endReplaceGroup();
            q.a("Crop PDF", (a) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, false, composer2, 390, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

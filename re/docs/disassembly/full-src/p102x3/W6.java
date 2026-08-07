package p102x3;

import O3.a;
import O3.c;
import O3.f;
import W3.q;
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

/* JADX INFO: loaded from: classes2.dex */
public final class W6 implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f14571A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f14572B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f14573C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f14574o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14576s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14577v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14580y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f14581z;

    public W6(InterfaceC0200y interfaceC0200y, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13) {
        this.f14574o = interfaceC0200y;
        this.p = context;
        this.q = mutableState;
        this.f14575r = mutableState2;
        this.f14576s = mutableState3;
        this.t = mutableState4;
        this.u = mutableState5;
        this.f14577v = mutableState6;
        this.f14578w = mutableState7;
        this.f14579x = mutableState8;
        this.f14580y = mutableState9;
        this.f14581z = mutableState10;
        this.f14571A = mutableState11;
        this.f14572B = mutableState12;
        this.f14573C = mutableState13;
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
                ComposerKt.traceEventStart(2082383886, iIntValue, -1, "com.notescrafter.ui.screens.PdfAddPageNumbersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfAddPageNumbersScreen.kt:1163)");
            }
            String str = (String) this.q.getValue();
            composer3.startReplaceGroup(1735103511);
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
            composer4.startReplaceGroup(1735122972);
            boolean zChangedInstance = composer4.changedInstance(this.f14574o) | composer4.changedInstance(this.p);
            Object objRememberedValue = composer4.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState mutableState = this.f14581z;
                final MutableState mutableState2 = this.f14571A;
                final InterfaceC0200y interfaceC0200y = this.f14574o;
                final MutableState mutableState3 = this.f14575r;
                final MutableState mutableState4 = this.f14576s;
                final MutableState mutableState5 = this.t;
                final MutableState mutableState6 = this.u;
                final MutableState mutableState7 = this.f14577v;
                final Context context = this.p;
                final MutableState mutableState8 = this.f14578w;
                final MutableState mutableState9 = this.q;
                final MutableState mutableState10 = this.f14579x;
                final MutableState mutableState11 = this.f14580y;
                final MutableState mutableState12 = this.f14572B;
                final MutableState mutableState13 = this.f14573C;
                objRememberedValue = new a() { // from class: x3.V6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.a
                    public final Object invoke() {
                        int i5;
                        Uri uri = (Uri) mutableState3.getValue();
                        if (uri != null) {
                            MutableState mutableState14 = mutableState4;
                            if (AbstractC2447e7.b(mutableState14) > 0) {
                                Integer numZ = q.Z((String) mutableState5.getValue());
                                int iR = numZ != null ? Q3.a.r(numZ.intValue(), 6, 48) : 12;
                                Integer numZ2 = q.Z((String) mutableState6.getValue());
                                if (numZ2 != null) {
                                    int iIntValue2 = numZ2.intValue();
                                    if (iIntValue2 < 1) {
                                        iIntValue2 = 1;
                                    }
                                    i5 = iIntValue2;
                                } else {
                                    i5 = 1;
                                }
                                Integer numZ3 = q.Z((String) mutableState7.getValue());
                                A.t(interfaceC0200y, null, null, new C2415c7(context, mutableState8, mutableState9, mutableState10, mutableState11, mutableState, uri, numZ3 != null ? Q3.a.r(numZ3.intValue(), 0, ((Number) mutableState14.getValue()).intValue() - 1) : 0, i5, iR, mutableState14, mutableState2, mutableState12, mutableState13, null), 3);
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
            p097w3.q.a("Add Page Numbers", (a) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, false, composer2, 390, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

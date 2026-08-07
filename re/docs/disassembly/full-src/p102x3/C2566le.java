package p102x3;

import O3.a;
import O3.c;
import O3.f;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.GavelKt;
import androidx.compose.material.icons.outlined.LocalShippingKt;
import androidx.compose.material.icons.outlined.ReceiptLongKt;
import androidx.compose.material.icons.outlined.SecurityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2566le implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f15298o;

    public C2566le(c cVar) {
        this.f15298o = cVar;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope SettingsSection = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(SettingsSection, "$this$SettingsSection");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1596084458, iIntValue, -1, "com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:450)");
            }
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            ImageVector security = SecurityKt.getSecurity(outlined);
            long jColor = ColorKt.Color(4287931320L);
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(ColorKt.Color(4287931320L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674410380);
            c cVar = this.f15298o;
            boolean zChanged = composer.changed(cVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new B5(cVar, 12);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(security, "Privacy Policy", (a) objRememberedValue, null, jColor, jM3926copywmQWz5c$default, "Review how we handle and protect your data", true, composer, 14377008);
            ImageVector gavel = GavelKt.getGavel(outlined);
            long jColor2 = ColorKt.Color(4287931320L);
            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(ColorKt.Color(4287931320L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674428368);
            boolean zChanged2 = composer.changed(cVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new B5(cVar, 13);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(gavel, "Terms of Service", (a) objRememberedValue2, null, jColor2, jM3926copywmQWz5c$default2, "Read our standard terms and user guidelines", true, composer, 14377008);
            ImageVector receiptLong = ReceiptLongKt.getReceiptLong(outlined);
            long jColor3 = ColorKt.Color(4287931320L);
            long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(ColorKt.Color(4287931320L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674446698);
            boolean zChanged3 = composer.changed(cVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new B5(cVar, 14);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(receiptLong, "Refund Policy", (a) objRememberedValue3, null, jColor3, jM3926copywmQWz5c$default3, "Learn about our donation and print refund terms", true, composer, 14377008);
            ImageVector localShipping = LocalShippingKt.getLocalShipping(outlined);
            long jColor4 = ColorKt.Color(4287931320L);
            long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(ColorKt.Color(4287931320L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674465006);
            boolean zChanged4 = composer.changed(cVar);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new B5(cVar, 15);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(localShipping, "Shipping Policy", (a) objRememberedValue4, null, jColor4, jM3926copywmQWz5c$default4, "Timelines and logistics rules for print delivery", false, composer, 14377008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

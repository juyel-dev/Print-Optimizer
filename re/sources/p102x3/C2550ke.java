package p102x3;

import O3.a;
import O3.c;
import O3.f;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EmailKt;
import androidx.compose.material.icons.outlined.GroupsKt;
import androidx.compose.material.icons.outlined.HelpOutlineKt;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2550ke implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f15268o;

    public C2550ke(c cVar) {
        this.f15268o = cVar;
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
                ComposerKt.traceEventStart(-1845362859, iIntValue, -1, "com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:396)");
            }
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            ImageVector info = InfoKt.getInfo(outlined);
            long jColor = ColorKt.Color(4294286859L);
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(ColorKt.Color(4294286859L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674336160);
            c cVar = this.f15268o;
            boolean zChanged = composer.changed(cVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new B5(cVar, 8);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(info, "About Us", (a) objRememberedValue, null, jColor, jM3926copywmQWz5c$default, "Read about our mission and development team", true, composer, 14377008);
            ImageVector groups = GroupsKt.getGroups(outlined);
            long jColor2 = ColorKt.Color(4293675161L);
            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(ColorKt.Color(4293675161L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674353570);
            boolean zChanged2 = composer.changed(cVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new B5(cVar, 9);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(groups, "Community", (a) objRememberedValue2, null, jColor2, jM3926copywmQWz5c$default2, "Engage with other learners and contributors", true, composer, 14377008);
            ImageVector helpOutline = HelpOutlineKt.getHelpOutline(outlined);
            long jColor3 = ColorKt.Color(4279286145L);
            long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674371103);
            boolean zChanged3 = composer.changed(cVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new B5(cVar, 10);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(helpOutline, "Help Center", (a) objRememberedValue3, null, jColor3, jM3926copywmQWz5c$default3, "Find FAQs and answers to common issues", true, composer, 14377008);
            ImageVector email = EmailKt.getEmail(outlined);
            long jColor4 = ColorKt.Color(4282090230L);
            long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674388452);
            boolean zChanged4 = composer.changed(cVar);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new B5(cVar, 11);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(email, "Contact Us", (a) objRememberedValue4, null, jColor4, jM3926copywmQWz5c$default4, "Reach out for support, queries or feedback", false, composer, 14377008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

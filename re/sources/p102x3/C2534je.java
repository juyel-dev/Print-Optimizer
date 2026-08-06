package p102x3;

import O3.a;
import O3.c;
import O3.f;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DownloadKt;
import androidx.compose.material.icons.outlined.PrintKt;
import androidx.compose.material.icons.outlined.StarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2534je implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f15235o;

    public C2534je(c cVar) {
        this.f15235o = cVar;
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
                ComposerKt.traceEventStart(232938206, iIntValue, -1, "com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:354)");
            }
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            ImageVector star = StarKt.getStar(outlined);
            long jColor = ColorKt.Color(4289222135L);
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(ColorKt.Color(4289222135L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674278688);
            c cVar = this.f15235o;
            boolean zChanged = composer.changed(cVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new B5(cVar, 5);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(star, "Features", (a) objRememberedValue, null, jColor, jM3926copywmQWz5c$default, "Discover all the powerful capabilities of the app", true, composer, 14377008);
            ImageVector download = DownloadKt.getDownload(outlined);
            long jColor2 = ColorKt.Color(4284704497L);
            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(ColorKt.Color(4284704497L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674296389);
            boolean zChanged2 = composer.changed(cVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new B5(cVar, 6);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(download, "My Downloads", (a) objRememberedValue2, null, jColor2, jM3926copywmQWz5c$default2, "Access all your locally processed PDF documents", true, composer, 14377008);
            ImageVector print = PrintKt.getPrint(outlined);
            long jColor3 = ColorKt.Color(4278630100L);
            long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1674314280);
            boolean zChanged3 = composer.changed(cVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new B5(cVar, 7);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            AbstractC2598ne.a(print, "How to Print Notes", (a) objRememberedValue3, null, jColor3, jM3926copywmQWz5c$default3, "Learn to optimize your documents for printing", false, composer, 14377008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

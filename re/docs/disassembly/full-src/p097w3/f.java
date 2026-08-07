package p097w3;

import C3.v;
import O3.c;
import Q3.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.AssignmentKt;
import androidx.compose.material.icons.outlined.ChatKt;
import androidx.compose.material.icons.outlined.ChecklistKt;
import androidx.compose.material.icons.outlined.HomeKt;
import androidx.compose.material.icons.outlined.SettingsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f13615a;

    static {
        Icons.Outlined outlined = Icons.Outlined.INSTANCE;
        f13615a = v.S(new r(ChatKt.getChat(outlined), "Contact", "contact-us"), new r(ChecklistKt.getChecklist(outlined), "To-Do", "dashboard"), new r(HomeKt.getHome(outlined), "Home", "home"), new r(AssignmentKt.getAssignment(Icons.AutoMirrored.Outlined.INSTANCE), "My Orders", "my-orders"), new r(SettingsKt.getSettings(outlined), "Setting", "settings"));
    }

    public static final void a(Modifier modifier, String currentRoute, c onNavigate, Composer composer, int i5) {
        int i6;
        o.f(currentRoute, "currentRoute");
        o.f(onNavigate, "onNavigate");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1955550090);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(currentRoute) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onNavigate) ? 32 : 16;
        }
        int i7 = i6 | 384;
        if ((i7 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            modifier = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1955550090, i7, -1, "com.notescrafter.ui.components.BottomNavBar (BottomNavBar.kt:65)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(24828262);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = DensityKt.Density(density.getDensity(), a.o(density.getFontScale(), 1.2f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides((Density) objRememberedValue), ComposableLambdaKt.rememberComposableLambda(-466005706, true, new e(modifier, currentRoute, onNavigate), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(currentRoute, onNavigate, modifier2, i5, 0));
        }
    }
}

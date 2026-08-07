package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2746x3 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2746x3 f15708o = new C2746x3();

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope Button = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-792971269, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$UploadScreenKt.lambda-2.<anonymous> (UploadScreen.kt:270)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(companion, Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(4));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), 0L, composer, 432, 8);
            androidx.compose.foundation.text.modifiers.a.q(8, companion, composer, 6);
            TextKt.m2432Text4IGK_g("Subscribe Now", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 196614, 0, 131038);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

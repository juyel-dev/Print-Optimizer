package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.utils.ToDoItem;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class Ne implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ State f14234o;
    public final /* synthetic */ a p;
    public final /* synthetic */ State q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ToDoItem f14236s;
    public final /* synthetic */ State t;
    public final /* synthetic */ State u;

    public Ne(State state, a aVar, State state2, State state3, ToDoItem toDoItem, State state4, State state5) {
        this.f14234o = state;
        this.p = aVar;
        this.q = state2;
        this.f14235r = state3;
        this.f14236s = toDoItem;
        this.t = state4;
        this.u = state5;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1723227029, iIntValue, -1, "com.notescrafter.ui.screens.TaskItemMinimal.<anonymous> (ToDoScreen.kt:659)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(12));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(BorderKt.m220borderxT4_qwU(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(24)), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl((float) 1.5d), ((Color) this.q.getValue()).m3937unboximpl(), RoundedCornerShapeKt.getCircleShape()), ((Color) this.f14235r.getValue()).m3937unboximpl(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default);
            a constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1878729569);
            ToDoItem toDoItem = this.f14236s;
            if (toDoItem.isDone()) {
                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, RotateKt.rotate(ScaleKt.scale(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), ((Number) this.t.getValue()).floatValue()), ((Number) this.u.getValue()).floatValue()), Color.Companion.m3964getWhite0d7_KjU(), composer, 3120, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            composer.startReplaceGroup(1923795803);
            State state = this.f14234o;
            boolean zChanged = composer.changed(state);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2510i6(state, 3);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifierWeight$default, (c) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierDrawWithContent);
            a constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            TextKt.m2432Text4IGK_g(toDoItem.getText(), (Modifier) null, toDoItem.isDone() ? Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null) : Color.Companion.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), composer, 0, 0, 65530);
            composer.endNode();
            IconButtonKt.IconButton(this.p, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, AbstractC2730w3.f15667i, composer, 196608, 28);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

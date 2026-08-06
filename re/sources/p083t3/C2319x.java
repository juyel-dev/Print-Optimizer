package p083t3;

import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: t3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2319x implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13223o;
    public final /* synthetic */ Y p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f13224r;

    public C2319x(int i5, Y y4, MutableState mutableState, State state) {
        this.f13223o = i5;
        this.p = y4;
        this.q = mutableState;
        this.f13224r = state;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0159  */
    /* JADX WARN: Code duplicated, block: B:58:0x0189  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:62:0x0199  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x022a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        boolean zChangedInstance;
        Object objRememberedValue;
        Object objK;
        Composer.Companion companion;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602780083, iIntValue, -1, "com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:453)");
            }
            MutableState mutableState = this.q;
            if (o.b((String) mutableState.getValue(), "pomodoro-timer") || o.b((String) mutableState.getValue(), "pomodoro-setup") || o.b((String) mutableState.getValue(), "pdf-merge") || o.b((String) mutableState.getValue(), "pdf-split") || o.b((String) mutableState.getValue(), "pdf-compress") || o.b((String) mutableState.getValue(), "pdf-to-jpg") || o.b((String) mutableState.getValue(), "jpg-to-pdf") || o.b((String) mutableState.getValue(), "pdf-add-page-numbers") || o.b((String) mutableState.getValue(), "pdf-organize") || o.b((String) mutableState.getValue(), "pdf-crop") || o.b((String) mutableState.getValue(), "pdf-invert")) {
                composer.startReplaceGroup(258257594);
                composer.endReplaceGroup();
            } else {
                boolean zB = o.b((String) mutableState.getValue(), "print-order-upload");
                Y y4 = this.p;
                if (zB || o.b((String) mutableState.getValue(), "print-order-shipping") || o.b((String) mutableState.getValue(), "print-order-checkout") || o.b((String) mutableState.getValue(), "my-orders") || o.b((String) mutableState.getValue(), "my-addresses") || o.b((String) mutableState.getValue(), "community-pass")) {
                    composer.startReplaceGroup(258721664);
                    composer.startReplaceGroup(2086564382);
                    boolean zChangedInstance3 = composer.changedInstance(y4);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new C2313u(y4, mutableState, 0);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    a aVar = (a) objRememberedValue3;
                    Object objK2 = b.k(composer, 2086569969);
                    if (objK2 == Composer.Companion.getEmpty()) {
                        objK2 = new C2315v(0, mutableState);
                        composer.updateRememberedValue(objK2);
                    }
                    composer.endReplaceGroup();
                    S.a(true, this.f13223o, aVar, (a) objK2, composer, 3078, 0);
                    composer.endReplaceGroup();
                } else if (o.b((String) mutableState.getValue(), "home") || o.b((String) mutableState.getValue(), "flow")) {
                    State state = this.f13224r;
                    if (((Number) state.getValue()).intValue() == 5 || ((Number) state.getValue()).intValue() == -1) {
                        composer.startReplaceGroup(259393620);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(259514644);
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        constructor = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
                        eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                        if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer.startReplaceGroup(-622369047);
                        zChangedInstance = composer.changedInstance(y4);
                        objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new C2313u(y4, mutableState, 1);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        a aVar2 = (a) objRememberedValue;
                        objK = b.k(composer, -622362952);
                        companion = Composer.Companion;
                        if (objK == companion.getEmpty()) {
                            objK = new C2315v(1, mutableState);
                            composer.updateRememberedValue(objK);
                        }
                        composer.endReplaceGroup();
                        S.a(false, this.f13223o, aVar2, (a) objK, composer, 3072, 1);
                        String str = (String) mutableState.getValue();
                        composer.startReplaceGroup(-622354367);
                        zChangedInstance2 = composer.changedInstance(y4);
                        objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new C2317w(y4, mutableState, 0);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        S.e(str, (c) objRememberedValue2, composer, 0);
                        composer.endNode();
                        composer.endReplaceGroup();
                    }
                } else {
                    composer.startReplaceGroup(259514644);
                    Modifier.Companion companion4 = Modifier.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    constructor = companion5.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
                    eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap2);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion5.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    composer.startReplaceGroup(-622369047);
                    zChangedInstance = composer.changedInstance(y4);
                    objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance) {
                        objRememberedValue = new C2313u(y4, mutableState, 1);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new C2313u(y4, mutableState, 1);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    a aVar3 = (a) objRememberedValue;
                    objK = b.k(composer, -622362952);
                    companion = Composer.Companion;
                    if (objK == companion.getEmpty()) {
                        objK = new C2315v(1, mutableState);
                        composer.updateRememberedValue(objK);
                    }
                    composer.endReplaceGroup();
                    S.a(false, this.f13223o, aVar3, (a) objK, composer, 3072, 1);
                    String str2 = (String) mutableState.getValue();
                    composer.startReplaceGroup(-622354367);
                    zChangedInstance2 = composer.changedInstance(y4);
                    objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2) {
                        objRememberedValue2 = new C2317w(y4, mutableState, 0);
                        composer.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new C2317w(y4, mutableState, 0);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    S.e(str2, (c) objRememberedValue2, composer, 0);
                    composer.endNode();
                    composer.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

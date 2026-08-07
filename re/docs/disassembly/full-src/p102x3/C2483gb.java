package p102x3;

import M0.f;
import O3.a;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p083t3.O;
import p087u3.v;
import p097w3.j;

/* JADX INFO: renamed from: x3.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2483gb implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f15090A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f15091B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f15092C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ boolean f15093D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ a f15094E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f15095F;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f15096o;
    public final /* synthetic */ float p;
    public final /* synthetic */ v q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15098s;
    public final /* synthetic */ String t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15102y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f15103z;

    public C2483gb(a aVar, float f5, v vVar, MutableState mutableState, MutableState mutableState2, String str, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, boolean z3, a aVar2, MutableState mutableState12) {
        this.f15096o = aVar;
        this.p = f5;
        this.q = vVar;
        this.f15097r = mutableState;
        this.f15098s = mutableState2;
        this.t = str;
        this.u = mutableState3;
        this.f15099v = mutableState4;
        this.f15100w = mutableState5;
        this.f15101x = mutableState6;
        this.f15102y = mutableState7;
        this.f15103z = mutableState8;
        this.f15090A = mutableState9;
        this.f15091B = mutableState10;
        this.f15092C = mutableState11;
        this.f15093D = z3;
        this.f15094E = aVar2;
        this.f15095F = mutableState12;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1801859623, iIntValue, -1, "com.notescrafter.ui.screens.AddressFormDialog.<anonymous> (PrintAddressesScreen.kt:911)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(Color.Companion.m3953getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer.startReplaceGroup(1103671138);
            a aVar = this.f15096o;
            boolean zChanged = composer.changed(aVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new O(6, aVar);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM701heightInVpY3zN4$default = SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 0.9f), 0.0f, Dp.m6403constructorimpl(this.p * 0.85f), 1, null);
            composer.startReplaceGroup(571858965);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new f(3);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            j.a(ClickableKt.m242clickableXHw0xAI$default(modifierM701heightInVpY3zN4$default, false, null, null, (a) objRememberedValue2, 6, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-68278510, true, new C2467fb(this.q, this.f15096o, this.f15097r, this.f15098s, this.t, this.u, this.f15099v, this.f15100w, this.f15101x, this.f15102y, this.f15103z, this.f15090A, this.f15091B, this.f15092C, this.f15093D, this.f15094E, this.f15095F), composer, 54), composer, 196608, 30);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

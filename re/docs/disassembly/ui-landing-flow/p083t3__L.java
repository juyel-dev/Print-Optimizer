package p083t3;

import C3.v;
import M0.b;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import X3.A;
import Y3.d;
import a4.T;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.core.content.FileProvider;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.utils.AnalyticsManager;
import com.razorpay.AppSignatureHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import p087u3.g;
import p087u3.u;
import p092v3.h;
import p102x3.AbstractC2397b5;
import p102x3.AbstractC2406be;
import p102x3.AbstractC2416c8;
import p102x3.AbstractC2447e7;
import p102x3.AbstractC2452ec;
import p102x3.AbstractC2471g;
import p102x3.AbstractC2493h5;
import p102x3.AbstractC2494h6;
import p102x3.AbstractC2545k9;
import p102x3.AbstractC2574m6;
import p102x3.AbstractC2583n;
import p102x3.AbstractC2588n4;
import p102x3.AbstractC2595nb;
import p102x3.AbstractC2598ne;
import p102x3.AbstractC2642qa;
import p102x3.AbstractC2684t5;
import p102x3.AbstractC2782z7;
import p102x3.AbstractC2783z8;
import p102x3.C9;
import p102x3.D5;
import p102x3.Ee;
import p102x3.F3;
import p102x3.F5;
import p102x3.Gd;
import p102x3.Ja;
import p102x3.Kd;
import p102x3.Q8;
import p102x3.Qd;
import p102x3.Rb;
import p102x3.Ua;
import p102x3.Ud;
import p102x3.X3;
import p102x3.Ye;
import p102x3.Z4;
import p102x3.Z9;
import p102x3.ef;
import p102x3.r;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f13038A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f13039B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f13040C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f13041D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f13042E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ State f13043F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ State f13044G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ MutableState f13045H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ State f13046I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ State f13047J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ State f13048K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ State f13049L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ State f13050M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final /* synthetic */ State f13051N;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f13052o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y f13053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f13054s;
    public final /* synthetic */ Context t;
    public final /* synthetic */ State u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ State f13055v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f13056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f13057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ State f13058y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ State f13059z;

    public L(b bVar, PrintOrderViewModel printOrderViewModel, h hVar, Y y4, String str, Context context, State state, State state2, b bVar2, MutableState mutableState, State state3, State state4, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, State state5, State state6, MutableState mutableState7, State state7, State state8, State state9, State state10, State state11, State state12) {
        this.f13052o = bVar;
        this.p = printOrderViewModel;
        this.q = hVar;
        this.f13053r = y4;
        this.f13054s = str;
        this.t = context;
        this.u = state;
        this.f13055v = state2;
        this.f13056w = bVar2;
        this.f13057x = mutableState;
        this.f13058y = state3;
        this.f13059z = state4;
        this.f13038A = mutableState2;
        this.f13039B = mutableState3;
        this.f13040C = mutableState4;
        this.f13041D = mutableState5;
        this.f13042E = mutableState6;
        this.f13043F = state5;
        this.f13044G = state6;
        this.f13045H = mutableState7;
        this.f13046I = state7;
        this.f13047J = state8;
        this.f13048K = state9;
        this.f13049L = state10;
        this.f13050M = state11;
        this.f13051N = state12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:329:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:333:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:336:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:341:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:346:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:553:0x11a1  */
    /* JADX WARN: Code duplicated, block: B:555:0x11cf  */
    /* JADX WARN: Code duplicated, block: B:558:0x11db  */
    /* JADX WARN: Code duplicated, block: B:559:0x11df  */
    /* JADX WARN: Code duplicated, block: B:562:0x11f2  */
    /* JADX WARN: Code duplicated, block: B:564:0x1200  */
    /* JADX WARN: Code duplicated, block: B:569:0x1264  */
    /* JADX WARN: Code duplicated, block: B:584:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(PaddingValues paddingValues, Composer composer, int i5) {
        int i6;
        boolean zChangedInstance;
        Object objRememberedValue;
        Object objK;
        Composer.Companion companion;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        int i7;
        String name;
        int i8;
        final int i9;
        Composer composer2 = composer;
        o.f(paddingValues, "paddingValues");
        if ((i5 & 6) == 0) {
            i6 = i5 | (composer2.changed(paddingValues) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(250111230, i6, -1, "com.notescrafter.NotesCrafterContent.<anonymous>.<anonymous> (MainActivity.kt:542)");
        }
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        a constructor = companion4.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
        e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
        if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
        }
        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        final MutableState mutableState = this.f13057x;
        String str = (String) mutableState.getValue();
        final Y y4 = this.f13053r;
        State state = this.f13058y;
        State state2 = this.f13043F;
        b bVar = this.f13052o;
        final PrintOrderViewModel printOrderViewModel = this.p;
        h hVar = this.q;
        String str2 = this.f13054s;
        final Context context = this.t;
        MutableState mutableState2 = this.f13038A;
        MutableState mutableState3 = this.f13039B;
        MutableState mutableState4 = this.f13040C;
        MutableState mutableState5 = this.f13041D;
        MutableState mutableState6 = this.f13042E;
        switch (str) {
            case "refund-policy":
                composer2.startReplaceGroup(-622139813);
                F5.a("Refund Policy", "Refund Policy\n\nEffective Date: May 15, 2026\nApplies to all NotesCrafter platforms\n\n1. Our General Policy\nNotesCrafter operates two paid services: Community Pass (digital membership) and Print Orders (physical product). Due to the nature of both services, all purchases are final and non-refundable, except in the limited circumstances described in Section 5.\n\n2. Community Pass — No Refunds\nAll Community Pass purchases — Silver, Gold, Platinum, and Diamond — are strictly non-refundable.\nBy completing a Community Pass purchase, you acknowledge and agree that:\n- You are purchasing immediate access to digital premium features\n- The service is made available to you instantly upon payment confirmation\n- No refund will be issued regardless of usage, remaining access duration, or personal circumstances\n- Passes are non-transferable and cannot be exchanged for cash or credit\n\n3. Community Pass Upgrades — No Refunds\nUpgrade payments — the net amount charged when moving from a lower-tier to a higher-tier pass — are also strictly non-refundable. The prorated remaining value of your existing pass is applied as a discount at the time of upgrade and cannot be reclaimed as a refund after the upgrade is processed.\nOnce an upgrade is completed, the original pass is superseded and no value from either the original or the upgraded pass can be refunded.\n\n4. Print Orders — No Refunds\nAll print orders placed on print.notescrafter.com or via the Android app are custom-manufactured specifically for you and are therefore strictly non-refundable, including:\n- Orders confirmed and accepted\n- Orders currently in production\n- Orders in transit or out for delivery\n- Delivered orders\nBecause each notebook is printed and bound to your file's specifications, we are unable to resell or reuse returned items. Please carefully review your PDF — page count, orientation, content, and image quality — before placing an order.\n\n5. Exceptions — When We May Assist\nExceptions are considered only in the following specific situations:\n- Your order was never shipped and no tracking information was generated within 5 business days of order confirmation.\n- You received a product with a clear manufacturing defect attributable to our production (e.g., blank pages, severe misprint, missing sections) and not caused by the quality or formatting of your uploaded PDF.\nTo raise an exception:\n1. Contact support@notescrafter.com within 48 hours of delivery (or within 48 hours of the expected delivery date if undelivered)\n2. Include your Order ID, a clear description of the issue, and supporting photographs\nWe will review your request and, at our sole discretion, may offer a reprint or partial store credit. Cash refunds are not provided even in exception cases.\n\n6. Payment Disputes & Chargebacks\nIf you have a concern regarding a charge, please contact support@notescrafter.com before initiating any dispute or chargeback with your bank or card issuer.\nInitiating a chargeback without first contacting us may result in immediate suspension of your NotesCrafter account and permanent revocation of any active Community Pass, without any obligation on our part to restore access or issue a refund.\n\n7. Razorpay Transactions\nAll payments are processed by Razorpay. In the event of a payment failure or duplicate charge at the gateway level, please contact us at support@notescrafter.com and we will coordinate with Razorpay to resolve the issue promptly.\n\n8. Contact Us\nNotesCrafter\nSole Proprietorship · Aurangabad, Bihar, India\nNitish Kumar (Sole Proprietor)\nEmail: support@notescrafter.com", null, composer2, 6);
                composer.endReplaceGroup();
            case "print-price-calculator":
                Object objJ = p076s.b.j(-622100127, composer2, -622095774);
                Composer.Companion companion5 = Composer.Companion;
                if (objJ == companion5.getEmpty()) {
                    objJ = new I(3, mutableState);
                    composer2.updateRememberedValue(objJ);
                }
                a aVar = (a) objJ;
                composer.endReplaceGroup();
                composer2.startReplaceGroup(-622091908);
                boolean zChangedInstance4 = composer2.changedInstance(printOrderViewModel);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == companion5.getEmpty()) {
                    final int i10 = 2;
                    objRememberedValue4 = new a() { // from class: t3.B
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    printOrderViewModel.m();
                                    mutableState.setValue("print-order-upload");
                                    break;
                                case 1:
                                    printOrderViewModel.m();
                                    mutableState.setValue("print-order-upload");
                                    break;
                                default:
                                    printOrderViewModel.m();
                                    mutableState.setValue("print-order-upload");
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                a aVar2 = (a) objRememberedValue4;
                composer.endReplaceGroup();
                composer2.startReplaceGroup(-622086102);
                boolean zChangedInstance5 = composer2.changedInstance(context);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == companion5.getEmpty()) {
                    objRememberedValue5 = new J(context, 0);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                Kd.a(str2, hVar, aVar, aVar2, (a) objRememberedValue5, null, composer, 384);
                composer.endReplaceGroup();
            case "how-to-print":
                composer2.startReplaceGroup(-622124419);
                composer2.startReplaceGroup(-622120004);
                boolean zChangedInstance6 = composer2.changedInstance(printOrderViewModel);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    final int i11 = 1;
                    objRememberedValue6 = new a() { // from class: t3.B
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    printOrderViewModel.m();
                                    mutableState.setValue("print-order-upload");
                                    break;
                                case 1:
                                    printOrderViewModel.m();
                                    mutableState.setValue("print-order-upload");
                                    break;
                                default:
                                    printOrderViewModel.m();
                                    mutableState.setValue("print-order-upload");
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                a aVar3 = (a) objRememberedValue6;
                Object objK2 = p076s.b.k(composer2, -622114228);
                Composer.Companion companion6 = Composer.Companion;
                if (objK2 == companion6.getEmpty()) {
                    objK2 = new C2315v(20, mutableState);
                    composer2.updateRememberedValue(objK2);
                }
                a aVar4 = (a) objK2;
                Object objK3 = p076s.b.k(composer2, -622110081);
                if (objK3 == companion6.getEmpty()) {
                    objK3 = new C2315v(22, mutableState);
                    composer2.updateRememberedValue(objK3);
                }
                a aVar5 = (a) objK3;
                Object objK4 = p076s.b.k(composer2, -622106240);
                if (objK4 == companion6.getEmpty()) {
                    objK4 = new C2315v(23, mutableState);
                    composer2.updateRememberedValue(objK4);
                }
                composer.endReplaceGroup();
                Rb.i(hVar, printOrderViewModel, aVar3, aVar4, aVar5, (a) objK4, null, composer, 224256);
                composer.endReplaceGroup();
            case "community":
                Object objJ2 = p076s.b.j(-622276760, composer2, -622275104);
                if (objJ2 == Composer.Companion.getEmpty()) {
                    objJ2 = new C2315v(11, mutableState);
                    composer2.updateRememberedValue(objJ2);
                }
                composer.endReplaceGroup();
                r.a((a) objJ2, null, composer2, 6);
                composer.endReplaceGroup();
            case "dashboard":
                composer2.startReplaceGroup(-622270067);
                composer2.startReplaceGroup(-622268380);
                boolean zChangedInstance7 = composer2.changedInstance(bVar);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance7 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = new C2290i(1, bVar, mutableState);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                Ye.f((a) objRememberedValue7, composer2, 0);
                composer.endReplaceGroup();
            case "pdf-compress":
                Object objJ3 = p076s.b.j(-621990304, composer2, -621988881);
                if (objJ3 == Composer.Companion.getEmpty()) {
                    objJ3 = new C2315v(9, mutableState);
                    composer2.updateRememberedValue(objJ3);
                }
                composer.endReplaceGroup();
                AbstractC2782z7.b(6, (a) objJ3, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "my-addresses":
                composer2.startReplaceGroup(-2108038329);
                if (((Boolean) state.getValue()).booleanValue()) {
                    Object objJ4 = p076s.b.j(-2108013994, composer2, -622184434);
                    if (objJ4 == Composer.Companion.getEmpty()) {
                        objJ4 = new I(7, mutableState);
                        composer2.updateRememberedValue(objJ4);
                    }
                    composer.endReplaceGroup();
                    AbstractC2595nb.d(printOrderViewModel, (a) objJ4, null, composer2, 48);
                    composer.endReplaceGroup();
                } else {
                    Object objJ5 = p076s.b.j(-2107697732, composer2, -622170574);
                    if (objJ5 == Composer.Companion.getEmpty()) {
                        objJ5 = new I(8, mutableState);
                        composer2.updateRememberedValue(objJ5);
                    }
                    composer.endReplaceGroup();
                    S.d("My Addresses", "Sign in with Google to manage your delivery addresses.", hVar, (a) objJ5, composer, 3126);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            case "pdf-crop":
                Object objJ6 = p076s.b.j(-621957988, composer2, -621956689);
                if (objJ6 == Composer.Companion.getEmpty()) {
                    objJ6 = new C2315v(15, mutableState);
                    composer2.updateRememberedValue(objJ6);
                }
                composer.endReplaceGroup();
                AbstractC2416c8.a(6, (a) objJ6, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "print-order-shipping":
                composer2.startReplaceGroup(-2086089275);
                if (((Boolean) state.getValue()).booleanValue()) {
                    Object objJ7 = p076s.b.j(-2086065250, composer2, -621474312);
                    Composer.Companion companion7 = Composer.Companion;
                    if (objJ7 == companion7.getEmpty()) {
                        objJ7 = new C2315v(28, mutableState);
                        composer2.updateRememberedValue(objJ7);
                    }
                    a aVar6 = (a) objJ7;
                    Object objK5 = p076s.b.k(composer2, -621469766);
                    if (objK5 == companion7.getEmpty()) {
                        objK5 = new C2315v(29, mutableState);
                        composer2.updateRememberedValue(objK5);
                    }
                    a aVar7 = (a) objK5;
                    Object objK6 = p076s.b.k(composer2, -621464816);
                    if (objK6 == companion7.getEmpty()) {
                        objK6 = new I(0, mutableState);
                        composer2.updateRememberedValue(objK6);
                    }
                    composer.endReplaceGroup();
                    Gd.k(printOrderViewModel, str2, aVar6, aVar7, (a) objK6, null, composer, 28032);
                    composer.endReplaceGroup();
                } else {
                    Object objJ8 = p076s.b.j(-2085387342, composer2, -621450698);
                    if (objJ8 == Composer.Companion.getEmpty()) {
                        objJ8 = new I(1, mutableState);
                        composer2.updateRememberedValue(objJ8);
                    }
                    composer.endReplaceGroup();
                    S.d("Shipping Address", "Sign in with Google to add or choose a shipping address.", hVar, (a) objJ8, composer, 3126);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            case "pdf-merge":
                Object objJ9 = p076s.b.j(-622002947, composer2, -622001617);
                if (objJ9 == Composer.Companion.getEmpty()) {
                    objJ9 = new C2315v(7, mutableState);
                    composer2.updateRememberedValue(objJ9);
                }
                composer.endReplaceGroup();
                Q8.b(6, (a) objJ9, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "pdf-split":
                Object objJ10 = p076s.b.j(-621996675, composer2, -621995345);
                if (objJ10 == Composer.Companion.getEmpty()) {
                    objJ10 = new C2315v(8, mutableState);
                    composer2.updateRememberedValue(objJ10);
                }
                composer.endReplaceGroup();
                C9.a(6, (a) objJ10, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "privacy-policy":
                composer2.startReplaceGroup(-622154851);
                F5.a("Privacy Policy", "Privacy Policy\n\nEffective Date: May 15, 2026\nApplies to all NotesCrafter platforms\n\n1. Introduction\nNotesCrafter (\"we\", \"our\", \"us\") is a sole proprietorship operating the platforms flow.notescrafter.com, tools.notescrafter.com, print.notescrafter.com, and the NotesCrafter Android application.\nThis Privacy Policy describes how we collect, use, store, and protect your personal information. By using any NotesCrafter service, you agree to this Privacy Policy.\n\n2. Eligibility & Age\nOur services are intended for users aged 13 and above. By using NotesCrafter, you confirm that you are at least 13 years old. If you are under 18 years of age, you must have the consent of a parent or legal guardian to use our services.\nWe do not knowingly collect personal information from children under 13. If you believe a child under 13 has provided us with personal information, please contact us immediately at support@notescrafter.com.\n\n3. Information We Collect\n3.1 Google Login (All Platforms)\nWhen you sign in using Google, we receive your name, email address, and Google profile photo. This information is used solely for account identification and communication purposes.\n\n3.2 Print Orders — Website & Android App\nFor the purpose of processing and delivering your print order, we collect:\n- Full delivery address\n- Phone number\nThis data is stored securely and is used only to fulfil your order and communicate delivery updates via our shipping partner, Shiprocket.\n\n3.3 Uploaded Files — Print Service Only\nPDF files you upload through the print service (via website or Android app) are stored on our servers solely to process and fulfil your print order. These files are permanently and irreversibly deleted 30 days from the date of delivery. We do not use your uploaded content for any other purpose.\n\n3.4 What We Do NOT Collect\nFlow and Tools — whether accessed via web or the Android app — perform all document processing entirely within your browser or on your device. No files, documents, or processing data are ever transmitted to or stored on our servers. This is a zero server-touch architecture.\nWe do not collect or store any files or document content from Flow or Tools on any platform.\n\n4. How We Use Your Information\nWe use the information we collect to:\n- Authenticate your identity via Google Login\n- Process and deliver print orders\n- Communicate order status updates and support responses\n- Manage your Community Pass membership and access\n- Calculate prorated upgrade discounts for Community Pass tier changes\n- Improve and maintain our services\n\n5. Third-Party Services\nWe share your data with the following trusted service providers only to the extent necessary for service delivery:\n- Google — Authentication (Google OAuth)\n- Razorpay — Payment processing for Community Pass and print orders\n- Shiprocket — Order shipping, tracking, and logistics for print orders\n- Google AdMob — In-app advertising for free users on Android\nEach of these services operates under their own privacy policies. We do not sell, rent, or trade your personal data to any third party for marketing purposes.\n\n6. Data Retention\n- Google login data: Retained while your account is active. Deleted upon your account deletion request.\n- Delivery address and phone number: Retained until you request deletion by contacting support@notescrafter.com.\n- Print order PDF files: Permanently deleted 30 days after the date of delivery.\n- Flow / Tools processing data: Not collected or stored. Zero server touch.\n- Payment and transaction records: Retained as required by applicable Indian tax and financial regulations.\n\n7. Your Rights under DPDPA 2023\nUnder the Digital Personal Data Protection Act, 2023 (India), you have the right to:\n- Access the personal data we hold about you\n- Correct inaccurate or incomplete data\n- Request deletion (erasure) of your data\n- Withdraw consent at any time\n- Nominate a person to exercise rights\nTo exercise any of these rights, please write to us at support@notescrafter.com. We will respond within a reasonable timeframe.\n\n8. Cookies & Advertising\nWe use minimal cookies for session management and to maintain your login state. We do not use third-party advertising or tracking cookies on our web platform.\nThe NotesCrafter Android app serves advertisements to free users via Google AdMob. AdMob may collect device identifiers and usage data in accordance with Google's Privacy Policy. Community Pass holders on Android are completely ad-free across all features.\n\n9. Security\nWe implement industry-standard security measures to protect your personal data. However, no method of data transmission or storage over the internet is completely secure. We cannot guarantee absolute security, but we are committed to protecting your information to the best of our ability.\n\n10. Changes to This Policy\nWe may update this Privacy Policy from time to time. We will notify you of material changes via WhatsApp, email, or a prominent notice on our platform. The \"Effective Date\" at the top of this page indicates when the latest version was published. Continued use of our services after changes constitutes your acceptance of the updated policy.\n\n11. Contact Us\nNotesCrafter\nSole Proprietorship · Aurangabad, Bihar, India\nNitish Kumar (Sole Proprietor)\nEmail: support@notescrafter.com", null, composer2, 6);
                composer.endReplaceGroup();
            case "jpg-to-pdf":
                Object objJ11 = p076s.b.j(-621977603, composer2, -621976273);
                if (objJ11 == Composer.Companion.getEmpty()) {
                    objJ11 = new C2315v(12, mutableState);
                    composer2.updateRememberedValue(objJ11);
                }
                composer.endReplaceGroup();
                AbstractC2494h6.a(6, (a) objJ11, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "features":
                composer2.startReplaceGroup(-622165659);
                AbstractC2493h5.b(null, composer2, 0);
                composer.endReplaceGroup();
            case "blog":
                composer2.startReplaceGroup(-622071059);
                F5.a("Blog", "Coming Soon: Read our latest articles and updates.", null, composer2, 54);
                composer.endReplaceGroup();
            case "flow":
                composer2.startReplaceGroup(-2099471541);
                int iS = S.s(this.f13044G);
                State state3 = this.u;
                State state4 = this.f13055v;
                b bVar2 = this.f13056w;
                State state5 = this.f13046I;
                switch (iS) {
                    case -1:
                        composer2.startReplaceGroup(-621922574);
                        composer2.startReplaceGroup(-621922892);
                        boolean zChangedInstance8 = composer2.changedInstance(y4);
                        Object objRememberedValue8 = composer.rememberedValue();
                        if (zChangedInstance8 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                            final int i12 = 0;
                            objRememberedValue8 = new a() { // from class: t3.C
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            y4.g(0);
                                            break;
                                        case 1:
                                            AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                            Y y5 = y4;
                                            y5.h();
                                            y5.g(1);
                                            break;
                                        case 2:
                                            Y y6 = y4;
                                            C3.C c5 = C3.C.f167o;
                                            T t = y6.g;
                                            t.getClass();
                                            t.j(null, c5);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, 0L);
                                            break;
                                        case 3:
                                            y4.h();
                                            break;
                                        case 4:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                            y7.g(3);
                                            break;
                                        case 5:
                                            y4.g(2);
                                            break;
                                        case 6:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                            y4.g(4);
                                            break;
                                        case 7:
                                            y4.g(3);
                                            break;
                                        case 8:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                            Y y8 = y4;
                                            A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                            break;
                                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                            y4.g(4);
                                            break;
                                        default:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                            y4.h();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        a aVar8 = (a) objRememberedValue8;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621919769);
                        boolean zChangedInstance9 = composer2.changedInstance(context);
                        Object objRememberedValue9 = composer.rememberedValue();
                        if (zChangedInstance9 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                            objRememberedValue9 = new D(context, 0);
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        c cVar = (c) objRememberedValue9;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621894137);
                        boolean zChangedInstance10 = composer2.changedInstance(context);
                        Object objRememberedValue10 = composer.rememberedValue();
                        if (zChangedInstance10 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                            objRememberedValue10 = new D(context, 1);
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        c cVar2 = (c) objRememberedValue10;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621866118);
                        boolean zChangedInstance11 = composer2.changedInstance(context);
                        Object objRememberedValue11 = composer.rememberedValue();
                        if (zChangedInstance11 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                            objRememberedValue11 = new D(context, 2);
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        composer.endReplaceGroup();
                        X3.b(aVar8, cVar, cVar2, (c) objRememberedValue11, null, composer, 0);
                        composer.endReplaceGroup();
                        break;
                    case 0:
                        composer2.startReplaceGroup(-621856842);
                        composer2.startReplaceGroup(-621854915);
                        boolean zChangedInstance12 = composer2.changedInstance(y4);
                        Object objRememberedValue12 = composer.rememberedValue();
                        if (zChangedInstance12 || objRememberedValue12 == Composer.Companion.getEmpty()) {
                            final int i13 = 1;
                            objRememberedValue12 = new a() { // from class: t3.C
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            y4.g(0);
                                            break;
                                        case 1:
                                            AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                            Y y5 = y4;
                                            y5.h();
                                            y5.g(1);
                                            break;
                                        case 2:
                                            Y y6 = y4;
                                            C3.C c5 = C3.C.f167o;
                                            T t = y6.g;
                                            t.getClass();
                                            t.j(null, c5);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, 0L);
                                            break;
                                        case 3:
                                            y4.h();
                                            break;
                                        case 4:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                            y7.g(3);
                                            break;
                                        case 5:
                                            y4.g(2);
                                            break;
                                        case 6:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                            y4.g(4);
                                            break;
                                        case 7:
                                            y4.g(3);
                                            break;
                                        case 8:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                            Y y8 = y4;
                                            A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                            break;
                                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                            y4.g(4);
                                            break;
                                        default:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                            y4.h();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        composer.endReplaceGroup();
                        AbstractC2574m6.e((a) objRememberedValue12, null, composer2, 0);
                        composer.endReplaceGroup();
                        break;
                    case 1:
                        composer2.startReplaceGroup(-621843072);
                        List list = (List) state3.getValue();
                        composer2.startReplaceGroup(-621840028);
                        boolean zChangedInstance13 = composer2.changedInstance(y4);
                        Object objRememberedValue13 = composer.rememberedValue();
                        if (zChangedInstance13 || objRememberedValue13 == Composer.Companion.getEmpty()) {
                            final int i14 = 0;
                            objRememberedValue13 = new c() { // from class: t3.E
                                @Override // O3.c
                                public final Object invoke(Object obj) {
                                    switch (i14) {
                                        case 0:
                                            List uris = (List) obj;
                                            o.f(uris, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                            Y y5 = y4;
                                            A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                            if (!uris.isEmpty()) {
                                                y5.g(2);
                                            }
                                            break;
                                        case 1:
                                            p087u3.f pdf = (p087u3.f) obj;
                                            o.f(pdf, "pdf");
                                            Y y6 = y4;
                                            T t = y6.g;
                                            Iterable iterable = (Iterable) t.getValue();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj2 : iterable) {
                                                if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            t.j(null, arrayList);
                                            Iterator it = ((Iterable) t.getValue()).iterator();
                                            long size = 0;
                                            while (it.hasNext()) {
                                                size += ((p087u3.f) it.next()).getSize();
                                            }
                                            Long lValueOf = Long.valueOf(size);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, lValueOf);
                                            break;
                                        case 2:
                                            List it2 = (List) obj;
                                            o.f(it2, "it");
                                            T t6 = y4.g;
                                            t6.getClass();
                                            t6.j(null, it2);
                                            break;
                                        case 3:
                                            List uris2 = (List) obj;
                                            o.f(uris2, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                            break;
                                        case 4:
                                            List it3 = (List) obj;
                                            o.f(it3, "it");
                                            T t7 = y4.f13128i;
                                            t7.getClass();
                                            t7.j(null, it3);
                                            break;
                                        case 5:
                                            p087u3.b it4 = (p087u3.b) obj;
                                            o.f(it4, "it");
                                            Y y8 = y4;
                                            T t8 = y8.f13130k;
                                            t8.getClass();
                                            t8.j(null, it4);
                                            SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                            editorEdit.putBoolean("invert_colors", it4.getInvertColors());
                                            editorEdit.putBoolean("clear_background", it4.getClearBackground());
                                            editorEdit.putBoolean("grayscale", it4.getGrayscale());
                                            editorEdit.putBoolean("black_and_white", it4.getBlackAndWhite());
                                            editorEdit.putInt("background_threshold", it4.getBackgroundThreshold());
                                            editorEdit.apply();
                                            break;
                                        default:
                                            p087u3.e it5 = (p087u3.e) obj;
                                            o.f(it5, "it");
                                            Y y9 = y4;
                                            T t9 = y9.f13132m;
                                            t9.getClass();
                                            t9.j(null, it5);
                                            SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                            editorEdit2.putString("quality", it5.getQuality().name());
                                            editorEdit2.putString("document_size", it5.getDocumentSize().name());
                                            editorEdit2.putString("orientation", it5.getOrientation().name());
                                            editorEdit2.putInt("nup_rows", it5.getNupRows());
                                            editorEdit2.putInt("nup_cols", it5.getNupColumns());
                                            editorEdit2.putBoolean("add_separation_lines", it5.getAddSeparationLines());
                                            editorEdit2.putBoolean("add_page_numbers", it5.getAddPageNumbers());
                                            editorEdit2.apply();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        c cVar3 = (c) objRememberedValue13;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621827144);
                        boolean zChangedInstance14 = composer2.changedInstance(y4);
                        Object objRememberedValue14 = composer.rememberedValue();
                        if (zChangedInstance14 || objRememberedValue14 == Composer.Companion.getEmpty()) {
                            final int i15 = 1;
                            objRememberedValue14 = new c() { // from class: t3.E
                                @Override // O3.c
                                public final Object invoke(Object obj) {
                                    switch (i15) {
                                        case 0:
                                            List uris = (List) obj;
                                            o.f(uris, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                            Y y5 = y4;
                                            A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                            if (!uris.isEmpty()) {
                                                y5.g(2);
                                            }
                                            break;
                                        case 1:
                                            p087u3.f pdf = (p087u3.f) obj;
                                            o.f(pdf, "pdf");
                                            Y y6 = y4;
                                            T t = y6.g;
                                            Iterable iterable = (Iterable) t.getValue();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj2 : iterable) {
                                                if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            t.j(null, arrayList);
                                            Iterator it = ((Iterable) t.getValue()).iterator();
                                            long size = 0;
                                            while (it.hasNext()) {
                                                size += ((p087u3.f) it.next()).getSize();
                                            }
                                            Long lValueOf = Long.valueOf(size);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, lValueOf);
                                            break;
                                        case 2:
                                            List it2 = (List) obj;
                                            o.f(it2, "it");
                                            T t6 = y4.g;
                                            t6.getClass();
                                            t6.j(null, it2);
                                            break;
                                        case 3:
                                            List uris2 = (List) obj;
                                            o.f(uris2, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                            break;
                                        case 4:
                                            List it3 = (List) obj;
                                            o.f(it3, "it");
                                            T t7 = y4.f13128i;
                                            t7.getClass();
                                            t7.j(null, it3);
                                            break;
                                        case 5:
                                            p087u3.b it4 = (p087u3.b) obj;
                                            o.f(it4, "it");
                                            Y y8 = y4;
                                            T t8 = y8.f13130k;
                                            t8.getClass();
                                            t8.j(null, it4);
                                            SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                            editorEdit.putBoolean("invert_colors", it4.getInvertColors());
                                            editorEdit.putBoolean("clear_background", it4.getClearBackground());
                                            editorEdit.putBoolean("grayscale", it4.getGrayscale());
                                            editorEdit.putBoolean("black_and_white", it4.getBlackAndWhite());
                                            editorEdit.putInt("background_threshold", it4.getBackgroundThreshold());
                                            editorEdit.apply();
                                            break;
                                        default:
                                            p087u3.e it5 = (p087u3.e) obj;
                                            o.f(it5, "it");
                                            Y y9 = y4;
                                            T t9 = y9.f13132m;
                                            t9.getClass();
                                            t9.j(null, it5);
                                            SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                            editorEdit2.putString("quality", it5.getQuality().name());
                                            editorEdit2.putString("document_size", it5.getDocumentSize().name());
                                            editorEdit2.putString("orientation", it5.getOrientation().name());
                                            editorEdit2.putInt("nup_rows", it5.getNupRows());
                                            editorEdit2.putInt("nup_cols", it5.getNupColumns());
                                            editorEdit2.putBoolean("add_separation_lines", it5.getAddSeparationLines());
                                            editorEdit2.putBoolean("add_page_numbers", it5.getAddPageNumbers());
                                            editorEdit2.apply();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        c cVar4 = (c) objRememberedValue14;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621824655);
                        boolean zChangedInstance15 = composer2.changedInstance(y4);
                        Object objRememberedValue15 = composer.rememberedValue();
                        if (zChangedInstance15 || objRememberedValue15 == Composer.Companion.getEmpty()) {
                            final int i16 = 2;
                            objRememberedValue15 = new a() { // from class: t3.C
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            y4.g(0);
                                            break;
                                        case 1:
                                            AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                            Y y5 = y4;
                                            y5.h();
                                            y5.g(1);
                                            break;
                                        case 2:
                                            Y y6 = y4;
                                            C3.C c5 = C3.C.f167o;
                                            T t = y6.g;
                                            t.getClass();
                                            t.j(null, c5);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, 0L);
                                            break;
                                        case 3:
                                            y4.h();
                                            break;
                                        case 4:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                            y7.g(3);
                                            break;
                                        case 5:
                                            y4.g(2);
                                            break;
                                        case 6:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                            y4.g(4);
                                            break;
                                        case 7:
                                            y4.g(3);
                                            break;
                                        case 8:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                            Y y8 = y4;
                                            A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                            break;
                                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                            y4.g(4);
                                            break;
                                        default:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                            y4.h();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue15);
                        }
                        a aVar9 = (a) objRememberedValue15;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621822104);
                        boolean zChanged = composer2.changed(state3) | composer2.changedInstance(y4);
                        Object objRememberedValue16 = composer.rememberedValue();
                        if (zChanged || objRememberedValue16 == Composer.Companion.getEmpty()) {
                            objRememberedValue16 = new C2290i(2, y4, state3);
                            composer2.updateRememberedValue(objRememberedValue16);
                        }
                        composer.endReplaceGroup();
                        ef.c(list, cVar3, cVar4, aVar9, (a) objRememberedValue16, S.f(state2), null, composer, 0);
                        composer.endReplaceGroup();
                        break;
                    case 2:
                        composer2.startReplaceGroup(-621807384);
                        List list2 = (List) state3.getValue();
                        composer2.startReplaceGroup(-621804718);
                        boolean zChangedInstance16 = composer2.changedInstance(y4);
                        Object objRememberedValue17 = composer.rememberedValue();
                        if (zChangedInstance16 || objRememberedValue17 == Composer.Companion.getEmpty()) {
                            final int i17 = 2;
                            objRememberedValue17 = new c() { // from class: t3.E
                                @Override // O3.c
                                public final Object invoke(Object obj) {
                                    switch (i17) {
                                        case 0:
                                            List uris = (List) obj;
                                            o.f(uris, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                            Y y5 = y4;
                                            A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                            if (!uris.isEmpty()) {
                                                y5.g(2);
                                            }
                                            break;
                                        case 1:
                                            p087u3.f pdf = (p087u3.f) obj;
                                            o.f(pdf, "pdf");
                                            Y y6 = y4;
                                            T t = y6.g;
                                            Iterable iterable = (Iterable) t.getValue();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj2 : iterable) {
                                                if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            t.j(null, arrayList);
                                            Iterator it = ((Iterable) t.getValue()).iterator();
                                            long size = 0;
                                            while (it.hasNext()) {
                                                size += ((p087u3.f) it.next()).getSize();
                                            }
                                            Long lValueOf = Long.valueOf(size);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, lValueOf);
                                            break;
                                        case 2:
                                            List it2 = (List) obj;
                                            o.f(it2, "it");
                                            T t6 = y4.g;
                                            t6.getClass();
                                            t6.j(null, it2);
                                            break;
                                        case 3:
                                            List uris2 = (List) obj;
                                            o.f(uris2, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                            break;
                                        case 4:
                                            List it3 = (List) obj;
                                            o.f(it3, "it");
                                            T t7 = y4.f13128i;
                                            t7.getClass();
                                            t7.j(null, it3);
                                            break;
                                        case 5:
                                            p087u3.b it4 = (p087u3.b) obj;
                                            o.f(it4, "it");
                                            Y y8 = y4;
                                            T t8 = y8.f13130k;
                                            t8.getClass();
                                            t8.j(null, it4);
                                            SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                            editorEdit.putBoolean("invert_colors", it4.getInvertColors());
                                            editorEdit.putBoolean("clear_background", it4.getClearBackground());
                                            editorEdit.putBoolean("grayscale", it4.getGrayscale());
                                            editorEdit.putBoolean("black_and_white", it4.getBlackAndWhite());
                                            editorEdit.putInt("background_threshold", it4.getBackgroundThreshold());
                                            editorEdit.apply();
                                            break;
                                        default:
                                            p087u3.e it5 = (p087u3.e) obj;
                                            o.f(it5, "it");
                                            Y y9 = y4;
                                            T t9 = y9.f13132m;
                                            t9.getClass();
                                            t9.j(null, it5);
                                            SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                            editorEdit2.putString("quality", it5.getQuality().name());
                                            editorEdit2.putString("document_size", it5.getDocumentSize().name());
                                            editorEdit2.putString("orientation", it5.getOrientation().name());
                                            editorEdit2.putInt("nup_rows", it5.getNupRows());
                                            editorEdit2.putInt("nup_cols", it5.getNupColumns());
                                            editorEdit2.putBoolean("add_separation_lines", it5.getAddSeparationLines());
                                            editorEdit2.putBoolean("add_page_numbers", it5.getAddPageNumbers());
                                            editorEdit2.apply();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue17);
                        }
                        c cVar5 = (c) objRememberedValue17;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621802098);
                        boolean zChangedInstance17 = composer2.changedInstance(y4);
                        Object objRememberedValue18 = composer.rememberedValue();
                        if (zChangedInstance17 || objRememberedValue18 == Composer.Companion.getEmpty()) {
                            final int i18 = 3;
                            objRememberedValue18 = new c() { // from class: t3.E
                                @Override // O3.c
                                public final Object invoke(Object obj) {
                                    switch (i18) {
                                        case 0:
                                            List uris = (List) obj;
                                            o.f(uris, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                            Y y5 = y4;
                                            A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                            if (!uris.isEmpty()) {
                                                y5.g(2);
                                            }
                                            break;
                                        case 1:
                                            p087u3.f pdf = (p087u3.f) obj;
                                            o.f(pdf, "pdf");
                                            Y y6 = y4;
                                            T t = y6.g;
                                            Iterable iterable = (Iterable) t.getValue();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj2 : iterable) {
                                                if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            t.j(null, arrayList);
                                            Iterator it = ((Iterable) t.getValue()).iterator();
                                            long size = 0;
                                            while (it.hasNext()) {
                                                size += ((p087u3.f) it.next()).getSize();
                                            }
                                            Long lValueOf = Long.valueOf(size);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, lValueOf);
                                            break;
                                        case 2:
                                            List it2 = (List) obj;
                                            o.f(it2, "it");
                                            T t6 = y4.g;
                                            t6.getClass();
                                            t6.j(null, it2);
                                            break;
                                        case 3:
                                            List uris2 = (List) obj;
                                            o.f(uris2, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                            break;
                                        case 4:
                                            List it3 = (List) obj;
                                            o.f(it3, "it");
                                            T t7 = y4.f13128i;
                                            t7.getClass();
                                            t7.j(null, it3);
                                            break;
                                        case 5:
                                            p087u3.b it4 = (p087u3.b) obj;
                                            o.f(it4, "it");
                                            Y y8 = y4;
                                            T t8 = y8.f13130k;
                                            t8.getClass();
                                            t8.j(null, it4);
                                            SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                            editorEdit.putBoolean("invert_colors", it4.getInvertColors());
                                            editorEdit.putBoolean("clear_background", it4.getClearBackground());
                                            editorEdit.putBoolean("grayscale", it4.getGrayscale());
                                            editorEdit.putBoolean("black_and_white", it4.getBlackAndWhite());
                                            editorEdit.putInt("background_threshold", it4.getBackgroundThreshold());
                                            editorEdit.apply();
                                            break;
                                        default:
                                            p087u3.e it5 = (p087u3.e) obj;
                                            o.f(it5, "it");
                                            Y y9 = y4;
                                            T t9 = y9.f13132m;
                                            t9.getClass();
                                            t9.j(null, it5);
                                            SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                            editorEdit2.putString("quality", it5.getQuality().name());
                                            editorEdit2.putString("document_size", it5.getDocumentSize().name());
                                            editorEdit2.putString("orientation", it5.getOrientation().name());
                                            editorEdit2.putInt("nup_rows", it5.getNupRows());
                                            editorEdit2.putInt("nup_cols", it5.getNupColumns());
                                            editorEdit2.putBoolean("add_separation_lines", it5.getAddSeparationLines());
                                            editorEdit2.putBoolean("add_page_numbers", it5.getAddPageNumbers());
                                            editorEdit2.apply();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue18);
                        }
                        c cVar6 = (c) objRememberedValue18;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621794041);
                        boolean zChangedInstance18 = composer2.changedInstance(y4);
                        Object objRememberedValue19 = composer.rememberedValue();
                        if (zChangedInstance18 || objRememberedValue19 == Composer.Companion.getEmpty()) {
                            final int i19 = 3;
                            objRememberedValue19 = new a() { // from class: t3.C
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            y4.g(0);
                                            break;
                                        case 1:
                                            AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                            Y y5 = y4;
                                            y5.h();
                                            y5.g(1);
                                            break;
                                        case 2:
                                            Y y6 = y4;
                                            C3.C c5 = C3.C.f167o;
                                            T t = y6.g;
                                            t.getClass();
                                            t.j(null, c5);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, 0L);
                                            break;
                                        case 3:
                                            y4.h();
                                            break;
                                        case 4:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                            y7.g(3);
                                            break;
                                        case 5:
                                            y4.g(2);
                                            break;
                                        case 6:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                            y4.g(4);
                                            break;
                                        case 7:
                                            y4.g(3);
                                            break;
                                        case 8:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                            Y y8 = y4;
                                            A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                            break;
                                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                            y4.g(4);
                                            break;
                                        default:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                            y4.h();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue19);
                        }
                        a aVar10 = (a) objRememberedValue19;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621789864);
                        boolean zChangedInstance19 = composer2.changedInstance(y4);
                        Object objRememberedValue20 = composer.rememberedValue();
                        if (zChangedInstance19 || objRememberedValue20 == Composer.Companion.getEmpty()) {
                            final int i20 = 4;
                            objRememberedValue20 = new a() { // from class: t3.C
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i20) {
                                        case 0:
                                            y4.g(0);
                                            break;
                                        case 1:
                                            AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                            Y y5 = y4;
                                            y5.h();
                                            y5.g(1);
                                            break;
                                        case 2:
                                            Y y6 = y4;
                                            C3.C c5 = C3.C.f167o;
                                            T t = y6.g;
                                            t.getClass();
                                            t.j(null, c5);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, 0L);
                                            break;
                                        case 3:
                                            y4.h();
                                            break;
                                        case 4:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                            y7.g(3);
                                            break;
                                        case 5:
                                            y4.g(2);
                                            break;
                                        case 6:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                            y4.g(4);
                                            break;
                                        case 7:
                                            y4.g(3);
                                            break;
                                        case 8:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                            Y y8 = y4;
                                            A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                            break;
                                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                            y4.g(4);
                                            break;
                                        default:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                            y4.h();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue20);
                        }
                        composer.endReplaceGroup();
                        AbstractC2406be.a(list2, cVar5, cVar6, aVar10, (a) objRememberedValue20, null, composer, 0);
                        composer.endReplaceGroup();
                        break;
                    case 3:
                        composer2.startReplaceGroup(-2095241808);
                        MutableState mutableState7 = this.f13045H;
                        if (((Integer) mutableState7.getValue()) != null) {
                            Integer num = (Integer) mutableState7.getValue();
                            o.c(num);
                            if (num.intValue() < S.l(state4).size()) {
                                composer2.startReplaceGroup(-2095172988);
                                List listL = S.l(state4);
                                Integer num2 = (Integer) mutableState7.getValue();
                                o.c(num2);
                                g gVar = (g) listL.get(num2.intValue());
                                composer2.startReplaceGroup(-621769711);
                                boolean zChanged2 = composer2.changed(state4) | composer2.changedInstance(y4);
                                Object objRememberedValue21 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue21 == Composer.Companion.getEmpty()) {
                                    objRememberedValue21 = new F(y4, state4, mutableState7, 0);
                                    composer2.updateRememberedValue(objRememberedValue21);
                                }
                                c cVar7 = (c) objRememberedValue21;
                                Object objK7 = p076s.b.k(composer2, -621758320);
                                if (objK7 == Composer.Companion.getEmpty()) {
                                    objK7 = new C2315v(21, mutableState7);
                                    composer2.updateRememberedValue(objK7);
                                }
                                composer.endReplaceGroup();
                                AbstractC2588n4.a(gVar, cVar7, (a) objK7, null, composer, 384);
                                composer.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-2094521864);
                                List listL2 = S.l(state4);
                                composer2.startReplaceGroup(-621750350);
                                zChangedInstance = composer2.changedInstance(y4);
                                objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                                    final int i21 = 4;
                                    objRememberedValue = new c() { // from class: t3.E
                                        @Override // O3.c
                                        public final Object invoke(Object obj) {
                                            switch (i21) {
                                                case 0:
                                                    List uris = (List) obj;
                                                    o.f(uris, "uris");
                                                    AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                                    Y y5 = y4;
                                                    A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                                    if (!uris.isEmpty()) {
                                                        y5.g(2);
                                                    }
                                                    break;
                                                case 1:
                                                    p087u3.f pdf = (p087u3.f) obj;
                                                    o.f(pdf, "pdf");
                                                    Y y6 = y4;
                                                    T t = y6.g;
                                                    Iterable iterable = (Iterable) t.getValue();
                                                    ArrayList arrayList = new ArrayList();
                                                    for (Object obj2 : iterable) {
                                                        if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                            arrayList.add(obj2);
                                                        }
                                                    }
                                                    t.j(null, arrayList);
                                                    Iterator it = ((Iterable) t.getValue()).iterator();
                                                    long size = 0;
                                                    while (it.hasNext()) {
                                                        size += ((p087u3.f) it.next()).getSize();
                                                    }
                                                    Long lValueOf = Long.valueOf(size);
                                                    T t5 = y6.f13136s;
                                                    t5.getClass();
                                                    t5.j(null, lValueOf);
                                                    break;
                                                case 2:
                                                    List it2 = (List) obj;
                                                    o.f(it2, "it");
                                                    T t6 = y4.g;
                                                    t6.getClass();
                                                    t6.j(null, it2);
                                                    break;
                                                case 3:
                                                    List uris2 = (List) obj;
                                                    o.f(uris2, "uris");
                                                    AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                                    Y y7 = y4;
                                                    A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                                    break;
                                                case 4:
                                                    List it3 = (List) obj;
                                                    o.f(it3, "it");
                                                    T t7 = y4.f13128i;
                                                    t7.getClass();
                                                    t7.j(null, it3);
                                                    break;
                                                case 5:
                                                    p087u3.b it4 = (p087u3.b) obj;
                                                    o.f(it4, "it");
                                                    Y y8 = y4;
                                                    T t8 = y8.f13130k;
                                                    t8.getClass();
                                                    t8.j(null, it4);
                                                    SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                                    editorEdit.putBoolean("invert_colors", it4.getInvertColors());
                                                    editorEdit.putBoolean("clear_background", it4.getClearBackground());
                                                    editorEdit.putBoolean("grayscale", it4.getGrayscale());
                                                    editorEdit.putBoolean("black_and_white", it4.getBlackAndWhite());
                                                    editorEdit.putInt("background_threshold", it4.getBackgroundThreshold());
                                                    editorEdit.apply();
                                                    break;
                                                default:
                                                    p087u3.e it5 = (p087u3.e) obj;
                                                    o.f(it5, "it");
                                                    Y y9 = y4;
                                                    T t9 = y9.f13132m;
                                                    t9.getClass();
                                                    t9.j(null, it5);
                                                    SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                                    editorEdit2.putString("quality", it5.getQuality().name());
                                                    editorEdit2.putString("document_size", it5.getDocumentSize().name());
                                                    editorEdit2.putString("orientation", it5.getOrientation().name());
                                                    editorEdit2.putInt("nup_rows", it5.getNupRows());
                                                    editorEdit2.putInt("nup_cols", it5.getNupColumns());
                                                    editorEdit2.putBoolean("add_separation_lines", it5.getAddSeparationLines());
                                                    editorEdit2.putBoolean("add_page_numbers", it5.getAddPageNumbers());
                                                    editorEdit2.apply();
                                                    break;
                                            }
                                            return B3.o.f154a;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                c cVar8 = (c) objRememberedValue;
                                objK = p076s.b.k(composer2, -621747782);
                                companion = Composer.Companion;
                                if (objK == companion.getEmpty()) {
                                    objK = new C2321y(1, mutableState7);
                                    composer2.updateRememberedValue(objK);
                                }
                                c cVar9 = (c) objK;
                                composer.endReplaceGroup();
                                composer2.startReplaceGroup(-621745100);
                                zChangedInstance2 = composer2.changedInstance(y4);
                                objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == companion.getEmpty()) {
                                    final int i22 = 5;
                                    objRememberedValue2 = new a() { // from class: t3.C
                                        @Override // O3.a
                                        public final Object invoke() {
                                            switch (i22) {
                                                case 0:
                                                    y4.g(0);
                                                    break;
                                                case 1:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                                    Y y5 = y4;
                                                    y5.h();
                                                    y5.g(1);
                                                    break;
                                                case 2:
                                                    Y y6 = y4;
                                                    C3.C c5 = C3.C.f167o;
                                                    T t = y6.g;
                                                    t.getClass();
                                                    t.j(null, c5);
                                                    T t5 = y6.f13136s;
                                                    t5.getClass();
                                                    t5.j(null, 0L);
                                                    break;
                                                case 3:
                                                    y4.h();
                                                    break;
                                                case 4:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                                    Y y7 = y4;
                                                    A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                                    y7.g(3);
                                                    break;
                                                case 5:
                                                    y4.g(2);
                                                    break;
                                                case 6:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                                    y4.g(4);
                                                    break;
                                                case 7:
                                                    y4.g(3);
                                                    break;
                                                case 8:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                                    Y y8 = y4;
                                                    A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                                    break;
                                                case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                                    y4.g(4);
                                                    break;
                                                default:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                                    y4.h();
                                                    break;
                                            }
                                            return B3.o.f154a;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                a aVar11 = (a) objRememberedValue2;
                                composer.endReplaceGroup();
                                composer2.startReplaceGroup(-621742276);
                                zChangedInstance3 = composer2.changedInstance(y4);
                                objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == companion.getEmpty()) {
                                    final int i23 = 6;
                                    objRememberedValue3 = new a() { // from class: t3.C
                                        @Override // O3.a
                                        public final Object invoke() {
                                            switch (i23) {
                                                case 0:
                                                    y4.g(0);
                                                    break;
                                                case 1:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                                    Y y5 = y4;
                                                    y5.h();
                                                    y5.g(1);
                                                    break;
                                                case 2:
                                                    Y y6 = y4;
                                                    C3.C c5 = C3.C.f167o;
                                                    T t = y6.g;
                                                    t.getClass();
                                                    t.j(null, c5);
                                                    T t5 = y6.f13136s;
                                                    t5.getClass();
                                                    t5.j(null, 0L);
                                                    break;
                                                case 3:
                                                    y4.h();
                                                    break;
                                                case 4:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                                    Y y7 = y4;
                                                    A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                                    y7.g(3);
                                                    break;
                                                case 5:
                                                    y4.g(2);
                                                    break;
                                                case 6:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                                    y4.g(4);
                                                    break;
                                                case 7:
                                                    y4.g(3);
                                                    break;
                                                case 8:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                                    Y y8 = y4;
                                                    A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                                    break;
                                                case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                                    y4.g(4);
                                                    break;
                                                default:
                                                    AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                                    y4.h();
                                                    break;
                                            }
                                            return B3.o.f154a;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                Ua.b(listL2, cVar8, cVar9, aVar11, (a) objRememberedValue3, null, composer, 384);
                                composer.endReplaceGroup();
                            }
                        } else {
                            composer2.startReplaceGroup(-2094521864);
                            List listL3 = S.l(state4);
                            composer2.startReplaceGroup(-621750350);
                            zChangedInstance = composer2.changedInstance(y4);
                            objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance) {
                                final int i24 = 4;
                                objRememberedValue = new c() { // from class: t3.E
                                    @Override // O3.c
                                    public final Object invoke(Object obj) {
                                        switch (i24) {
                                            case 0:
                                                List uris = (List) obj;
                                                o.f(uris, "uris");
                                                AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                                Y y5 = y4;
                                                A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                                if (!uris.isEmpty()) {
                                                    y5.g(2);
                                                }
                                                break;
                                            case 1:
                                                p087u3.f pdf = (p087u3.f) obj;
                                                o.f(pdf, "pdf");
                                                Y y6 = y4;
                                                T t = y6.g;
                                                Iterable iterable = (Iterable) t.getValue();
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj2 : iterable) {
                                                    if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                                t.j(null, arrayList);
                                                Iterator it = ((Iterable) t.getValue()).iterator();
                                                long size = 0;
                                                while (it.hasNext()) {
                                                    size += ((p087u3.f) it.next()).getSize();
                                                }
                                                Long lValueOf = Long.valueOf(size);
                                                T t5 = y6.f13136s;
                                                t5.getClass();
                                                t5.j(null, lValueOf);
                                                break;
                                            case 2:
                                                List it2 = (List) obj;
                                                o.f(it2, "it");
                                                T t6 = y4.g;
                                                t6.getClass();
                                                t6.j(null, it2);
                                                break;
                                            case 3:
                                                List uris2 = (List) obj;
                                                o.f(uris2, "uris");
                                                AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                                Y y7 = y4;
                                                A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                                break;
                                            case 4:
                                                List it3 = (List) obj;
                                                o.f(it3, "it");
                                                T t7 = y4.f13128i;
                                                t7.getClass();
                                                t7.j(null, it3);
                                                break;
                                            case 5:
                                                p087u3.b it4 = (p087u3.b) obj;
                                                o.f(it4, "it");
                                                Y y8 = y4;
                                                T t8 = y8.f13130k;
                                                t8.getClass();
                                                t8.j(null, it4);
                                                SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                                editorEdit.putBoolean("invert_colors", it4.getInvertColors());
                                                editorEdit.putBoolean("clear_background", it4.getClearBackground());
                                                editorEdit.putBoolean("grayscale", it4.getGrayscale());
                                                editorEdit.putBoolean("black_and_white", it4.getBlackAndWhite());
                                                editorEdit.putInt("background_threshold", it4.getBackgroundThreshold());
                                                editorEdit.apply();
                                                break;
                                            default:
                                                p087u3.e it5 = (p087u3.e) obj;
                                                o.f(it5, "it");
                                                Y y9 = y4;
                                                T t9 = y9.f13132m;
                                                t9.getClass();
                                                t9.j(null, it5);
                                                SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                                editorEdit2.putString("quality", it5.getQuality().name());
                                                editorEdit2.putString("document_size", it5.getDocumentSize().name());
                                                editorEdit2.putString("orientation", it5.getOrientation().name());
                                                editorEdit2.putInt("nup_rows", it5.getNupRows());
                                                editorEdit2.putInt("nup_cols", it5.getNupColumns());
                                                editorEdit2.putBoolean("add_separation_lines", it5.getAddSeparationLines());
                                                editorEdit2.putBoolean("add_page_numbers", it5.getAddPageNumbers());
                                                editorEdit2.apply();
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            } else {
                                final int i25 = 4;
                                objRememberedValue = new c() { // from class: t3.E
                                    @Override // O3.c
                                    public final Object invoke(Object obj) {
                                        switch (i25) {
                                            case 0:
                                                List uris = (List) obj;
                                                o.f(uris, "uris");
                                                AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                                Y y5 = y4;
                                                A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                                if (!uris.isEmpty()) {
                                                    y5.g(2);
                                                }
                                                break;
                                            case 1:
                                                p087u3.f pdf = (p087u3.f) obj;
                                                o.f(pdf, "pdf");
                                                Y y6 = y4;
                                                T t = y6.g;
                                                Iterable iterable = (Iterable) t.getValue();
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj2 : iterable) {
                                                    if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                                t.j(null, arrayList);
                                                Iterator it = ((Iterable) t.getValue()).iterator();
                                                long size = 0;
                                                while (it.hasNext()) {
                                                    size += ((p087u3.f) it.next()).getSize();
                                                }
                                                Long lValueOf = Long.valueOf(size);
                                                T t5 = y6.f13136s;
                                                t5.getClass();
                                                t5.j(null, lValueOf);
                                                break;
                                            case 2:
                                                List it2 = (List) obj;
                                                o.f(it2, "it");
                                                T t6 = y4.g;
                                                t6.getClass();
                                                t6.j(null, it2);
                                                break;
                                            case 3:
                                                List uris2 = (List) obj;
                                                o.f(uris2, "uris");
                                                AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                                Y y7 = y4;
                                                A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                                break;
                                            case 4:
                                                List it3 = (List) obj;
                                                o.f(it3, "it");
                                                T t7 = y4.f13128i;
                                                t7.getClass();
                                                t7.j(null, it3);
                                                break;
                                            case 5:
                                                p087u3.b it4 = (p087u3.b) obj;
                                                o.f(it4, "it");
                                                Y y8 = y4;
                                                T t8 = y8.f13130k;
                                                t8.getClass();
                                                t8.j(null, it4);
                                                SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                                editorEdit.putBoolean("invert_colors", it4.getInvertColors());
                                                editorEdit.putBoolean("clear_background", it4.getClearBackground());
                                                editorEdit.putBoolean("grayscale", it4.getGrayscale());
                                                editorEdit.putBoolean("black_and_white", it4.getBlackAndWhite());
                                                editorEdit.putInt("background_threshold", it4.getBackgroundThreshold());
                                                editorEdit.apply();
                                                break;
                                            default:
                                                p087u3.e it5 = (p087u3.e) obj;
                                                o.f(it5, "it");
                                                Y y9 = y4;
                                                T t9 = y9.f13132m;
                                                t9.getClass();
                                                t9.j(null, it5);
                                                SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                                editorEdit2.putString("quality", it5.getQuality().name());
                                                editorEdit2.putString("document_size", it5.getDocumentSize().name());
                                                editorEdit2.putString("orientation", it5.getOrientation().name());
                                                editorEdit2.putInt("nup_rows", it5.getNupRows());
                                                editorEdit2.putInt("nup_cols", it5.getNupColumns());
                                                editorEdit2.putBoolean("add_separation_lines", it5.getAddSeparationLines());
                                                editorEdit2.putBoolean("add_page_numbers", it5.getAddPageNumbers());
                                                editorEdit2.apply();
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            c cVar10 = (c) objRememberedValue;
                            objK = p076s.b.k(composer2, -621747782);
                            companion = Composer.Companion;
                            if (objK == companion.getEmpty()) {
                                objK = new C2321y(1, mutableState7);
                                composer2.updateRememberedValue(objK);
                            }
                            c cVar11 = (c) objK;
                            composer.endReplaceGroup();
                            composer2.startReplaceGroup(-621745100);
                            zChangedInstance2 = composer2.changedInstance(y4);
                            objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2) {
                                final int i26 = 5;
                                objRememberedValue2 = new a() { // from class: t3.C
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                y4.g(0);
                                                break;
                                            case 1:
                                                AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                                Y y5 = y4;
                                                y5.h();
                                                y5.g(1);
                                                break;
                                            case 2:
                                                Y y6 = y4;
                                                C3.C c5 = C3.C.f167o;
                                                T t = y6.g;
                                                t.getClass();
                                                t.j(null, c5);
                                                T t5 = y6.f13136s;
                                                t5.getClass();
                                                t5.j(null, 0L);
                                                break;
                                            case 3:
                                                y4.h();
                                                break;
                                            case 4:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                                Y y7 = y4;
                                                A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                                y7.g(3);
                                                break;
                                            case 5:
                                                y4.g(2);
                                                break;
                                            case 6:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                                y4.g(4);
                                                break;
                                            case 7:
                                                y4.g(3);
                                                break;
                                            case 8:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                                Y y8 = y4;
                                                A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                                break;
                                            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                                y4.g(4);
                                                break;
                                            default:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                                y4.h();
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            } else {
                                final int i27 = 5;
                                objRememberedValue2 = new a() { // from class: t3.C
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i27) {
                                            case 0:
                                                y4.g(0);
                                                break;
                                            case 1:
                                                AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                                Y y5 = y4;
                                                y5.h();
                                                y5.g(1);
                                                break;
                                            case 2:
                                                Y y6 = y4;
                                                C3.C c5 = C3.C.f167o;
                                                T t = y6.g;
                                                t.getClass();
                                                t.j(null, c5);
                                                T t5 = y6.f13136s;
                                                t5.getClass();
                                                t5.j(null, 0L);
                                                break;
                                            case 3:
                                                y4.h();
                                                break;
                                            case 4:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                                Y y7 = y4;
                                                A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                                y7.g(3);
                                                break;
                                            case 5:
                                                y4.g(2);
                                                break;
                                            case 6:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                                y4.g(4);
                                                break;
                                            case 7:
                                                y4.g(3);
                                                break;
                                            case 8:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                                Y y8 = y4;
                                                A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                                break;
                                            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                                y4.g(4);
                                                break;
                                            default:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                                y4.h();
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            a aVar12 = (a) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer2.startReplaceGroup(-621742276);
                            zChangedInstance3 = composer2.changedInstance(y4);
                            objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3) {
                                final int i28 = 6;
                                objRememberedValue3 = new a() { // from class: t3.C
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i28) {
                                            case 0:
                                                y4.g(0);
                                                break;
                                            case 1:
                                                AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                                Y y5 = y4;
                                                y5.h();
                                                y5.g(1);
                                                break;
                                            case 2:
                                                Y y6 = y4;
                                                C3.C c5 = C3.C.f167o;
                                                T t = y6.g;
                                                t.getClass();
                                                t.j(null, c5);
                                                T t5 = y6.f13136s;
                                                t5.getClass();
                                                t5.j(null, 0L);
                                                break;
                                            case 3:
                                                y4.h();
                                                break;
                                            case 4:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                                Y y7 = y4;
                                                A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                                y7.g(3);
                                                break;
                                            case 5:
                                                y4.g(2);
                                                break;
                                            case 6:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                                y4.g(4);
                                                break;
                                            case 7:
                                                y4.g(3);
                                                break;
                                            case 8:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                                Y y8 = y4;
                                                A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                                break;
                                            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                                y4.g(4);
                                                break;
                                            default:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                                y4.h();
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            } else {
                                final int i29 = 6;
                                objRememberedValue3 = new a() { // from class: t3.C
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i29) {
                                            case 0:
                                                y4.g(0);
                                                break;
                                            case 1:
                                                AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                                Y y5 = y4;
                                                y5.h();
                                                y5.g(1);
                                                break;
                                            case 2:
                                                Y y6 = y4;
                                                C3.C c5 = C3.C.f167o;
                                                T t = y6.g;
                                                t.getClass();
                                                t.j(null, c5);
                                                T t5 = y6.f13136s;
                                                t5.getClass();
                                                t5.j(null, 0L);
                                                break;
                                            case 3:
                                                y4.h();
                                                break;
                                            case 4:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                                Y y7 = y4;
                                                A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                                y7.g(3);
                                                break;
                                            case 5:
                                                y4.g(2);
                                                break;
                                            case 6:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                                y4.g(4);
                                                break;
                                            case 7:
                                                y4.g(3);
                                                break;
                                            case 8:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                                Y y8 = y4;
                                                A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                                break;
                                            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                                y4.g(4);
                                                break;
                                            default:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                                y4.h();
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            Ua.b(listL3, cVar10, cVar11, aVar12, (a) objRememberedValue3, null, composer, 384);
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                        break;
                    case 4:
                        composer2.startReplaceGroup(-621729645);
                        List listL4 = S.l(state4);
                        long jLongValue = ((Number) state5.getValue()).longValue();
                        List listL5 = S.l(state4);
                        if ((listL5 instanceof Collection) && listL5.isEmpty()) {
                            i7 = 0;
                        } else {
                            Iterator it = listL5.iterator();
                            int i30 = 0;
                            while (it.hasNext()) {
                                if (((g) it.next()).isSelected() && (i30 = i30 + 1) < 0) {
                                    v.W();
                                    throw null;
                                }
                            }
                            i7 = i30;
                        }
                        p087u3.b bVarM = S.m(this.f13047J);
                        p087u3.e eVarN = S.n(this.f13048K);
                        composer2.startReplaceGroup(-621719109);
                        boolean zChangedInstance20 = composer2.changedInstance(y4);
                        Object objRememberedValue22 = composer.rememberedValue();
                        if (zChangedInstance20 || objRememberedValue22 == Composer.Companion.getEmpty()) {
                            final int i31 = 5;
                            objRememberedValue22 = new c() { // from class: t3.E
                                @Override // O3.c
                                public final Object invoke(Object obj) {
                                    switch (i31) {
                                        case 0:
                                            List uris = (List) obj;
                                            o.f(uris, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                            Y y5 = y4;
                                            A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                            if (!uris.isEmpty()) {
                                                y5.g(2);
                                            }
                                            break;
                                        case 1:
                                            p087u3.f pdf = (p087u3.f) obj;
                                            o.f(pdf, "pdf");
                                            Y y6 = y4;
                                            T t = y6.g;
                                            Iterable iterable = (Iterable) t.getValue();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj2 : iterable) {
                                                if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            t.j(null, arrayList);
                                            Iterator it2 = ((Iterable) t.getValue()).iterator();
                                            long size = 0;
                                            while (it2.hasNext()) {
                                                size += ((p087u3.f) it2.next()).getSize();
                                            }
                                            Long lValueOf = Long.valueOf(size);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, lValueOf);
                                            break;
                                        case 2:
                                            List it3 = (List) obj;
                                            o.f(it3, "it");
                                            T t6 = y4.g;
                                            t6.getClass();
                                            t6.j(null, it3);
                                            break;
                                        case 3:
                                            List uris2 = (List) obj;
                                            o.f(uris2, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                            break;
                                        case 4:
                                            List it4 = (List) obj;
                                            o.f(it4, "it");
                                            T t7 = y4.f13128i;
                                            t7.getClass();
                                            t7.j(null, it4);
                                            break;
                                        case 5:
                                            p087u3.b it5 = (p087u3.b) obj;
                                            o.f(it5, "it");
                                            Y y8 = y4;
                                            T t8 = y8.f13130k;
                                            t8.getClass();
                                            t8.j(null, it5);
                                            SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                            editorEdit.putBoolean("invert_colors", it5.getInvertColors());
                                            editorEdit.putBoolean("clear_background", it5.getClearBackground());
                                            editorEdit.putBoolean("grayscale", it5.getGrayscale());
                                            editorEdit.putBoolean("black_and_white", it5.getBlackAndWhite());
                                            editorEdit.putInt("background_threshold", it5.getBackgroundThreshold());
                                            editorEdit.apply();
                                            break;
                                        default:
                                            p087u3.e it6 = (p087u3.e) obj;
                                            o.f(it6, "it");
                                            Y y9 = y4;
                                            T t9 = y9.f13132m;
                                            t9.getClass();
                                            t9.j(null, it6);
                                            SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                            editorEdit2.putString("quality", it6.getQuality().name());
                                            editorEdit2.putString("document_size", it6.getDocumentSize().name());
                                            editorEdit2.putString("orientation", it6.getOrientation().name());
                                            editorEdit2.putInt("nup_rows", it6.getNupRows());
                                            editorEdit2.putInt("nup_cols", it6.getNupColumns());
                                            editorEdit2.putBoolean("add_separation_lines", it6.getAddSeparationLines());
                                            editorEdit2.putBoolean("add_page_numbers", it6.getAddPageNumbers());
                                            editorEdit2.apply();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue22);
                        }
                        c cVar12 = (c) objRememberedValue22;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621716389);
                        boolean zChangedInstance21 = composer2.changedInstance(y4);
                        Object objRememberedValue23 = composer.rememberedValue();
                        if (zChangedInstance21 || objRememberedValue23 == Composer.Companion.getEmpty()) {
                            final int i32 = 6;
                            objRememberedValue23 = new c() { // from class: t3.E
                                @Override // O3.c
                                public final Object invoke(Object obj) {
                                    switch (i32) {
                                        case 0:
                                            List uris = (List) obj;
                                            o.f(uris, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Select_Files", "Upload_Screen");
                                            Y y5 = y4;
                                            A.t(Q.h(y5), null, null, new T(y5, uris, null), 3);
                                            if (!uris.isEmpty()) {
                                                y5.g(2);
                                            }
                                            break;
                                        case 1:
                                            p087u3.f pdf = (p087u3.f) obj;
                                            o.f(pdf, "pdf");
                                            Y y6 = y4;
                                            T t = y6.g;
                                            Iterable iterable = (Iterable) t.getValue();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj2 : iterable) {
                                                if (!o.b(((p087u3.f) obj2).getUri(), pdf.getUri())) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            t.j(null, arrayList);
                                            Iterator it2 = ((Iterable) t.getValue()).iterator();
                                            long size = 0;
                                            while (it2.hasNext()) {
                                                size += ((p087u3.f) it2.next()).getSize();
                                            }
                                            Long lValueOf = Long.valueOf(size);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, lValueOf);
                                            break;
                                        case 2:
                                            List it3 = (List) obj;
                                            o.f(it3, "it");
                                            T t6 = y4.g;
                                            t6.getClass();
                                            t6.j(null, it3);
                                            break;
                                        case 3:
                                            List uris2 = (List) obj;
                                            o.f(uris2, "uris");
                                            AnalyticsManager.INSTANCE.logCtaClick("Add_More_Files", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new T(y7, uris2, null), 3);
                                            break;
                                        case 4:
                                            List it4 = (List) obj;
                                            o.f(it4, "it");
                                            T t7 = y4.f13128i;
                                            t7.getClass();
                                            t7.j(null, it4);
                                            break;
                                        case 5:
                                            p087u3.b it5 = (p087u3.b) obj;
                                            o.f(it5, "it");
                                            Y y8 = y4;
                                            T t8 = y8.f13130k;
                                            t8.getClass();
                                            t8.j(null, it5);
                                            SharedPreferences.Editor editorEdit = y8.f13125d.edit();
                                            editorEdit.putBoolean("invert_colors", it5.getInvertColors());
                                            editorEdit.putBoolean("clear_background", it5.getClearBackground());
                                            editorEdit.putBoolean("grayscale", it5.getGrayscale());
                                            editorEdit.putBoolean("black_and_white", it5.getBlackAndWhite());
                                            editorEdit.putInt("background_threshold", it5.getBackgroundThreshold());
                                            editorEdit.apply();
                                            break;
                                        default:
                                            p087u3.e it6 = (p087u3.e) obj;
                                            o.f(it6, "it");
                                            Y y9 = y4;
                                            T t9 = y9.f13132m;
                                            t9.getClass();
                                            t9.j(null, it6);
                                            SharedPreferences.Editor editorEdit2 = y9.f13125d.edit();
                                            editorEdit2.putString("quality", it6.getQuality().name());
                                            editorEdit2.putString("document_size", it6.getDocumentSize().name());
                                            editorEdit2.putString("orientation", it6.getOrientation().name());
                                            editorEdit2.putInt("nup_rows", it6.getNupRows());
                                            editorEdit2.putInt("nup_cols", it6.getNupColumns());
                                            editorEdit2.putBoolean("add_separation_lines", it6.getAddSeparationLines());
                                            editorEdit2.putBoolean("add_page_numbers", it6.getAddPageNumbers());
                                            editorEdit2.apply();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue23);
                        }
                        c cVar13 = (c) objRememberedValue23;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621713932);
                        boolean zChangedInstance22 = composer2.changedInstance(y4);
                        Object objRememberedValue24 = composer.rememberedValue();
                        if (zChangedInstance22 || objRememberedValue24 == Composer.Companion.getEmpty()) {
                            final int i33 = 7;
                            objRememberedValue24 = new a() { // from class: t3.C
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i33) {
                                        case 0:
                                            y4.g(0);
                                            break;
                                        case 1:
                                            AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                            Y y5 = y4;
                                            y5.h();
                                            y5.g(1);
                                            break;
                                        case 2:
                                            Y y6 = y4;
                                            C3.C c5 = C3.C.f167o;
                                            T t = y6.g;
                                            t.getClass();
                                            t.j(null, c5);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, 0L);
                                            break;
                                        case 3:
                                            y4.h();
                                            break;
                                        case 4:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                            y7.g(3);
                                            break;
                                        case 5:
                                            y4.g(2);
                                            break;
                                        case 6:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                            y4.g(4);
                                            break;
                                        case 7:
                                            y4.g(3);
                                            break;
                                        case 8:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                            Y y8 = y4;
                                            A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                            break;
                                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                            y4.g(4);
                                            break;
                                        default:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                            y4.h();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue24);
                        }
                        a aVar13 = (a) objRememberedValue24;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-621711412);
                        boolean zChangedInstance23 = composer2.changedInstance(y4);
                        Object objRememberedValue25 = composer.rememberedValue();
                        if (zChangedInstance23 || objRememberedValue25 == Composer.Companion.getEmpty()) {
                            final int i34 = 8;
                            objRememberedValue25 = new a() { // from class: t3.C
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i34) {
                                        case 0:
                                            y4.g(0);
                                            break;
                                        case 1:
                                            AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                            Y y5 = y4;
                                            y5.h();
                                            y5.g(1);
                                            break;
                                        case 2:
                                            Y y6 = y4;
                                            C3.C c5 = C3.C.f167o;
                                            T t = y6.g;
                                            t.getClass();
                                            t.j(null, c5);
                                            T t5 = y6.f13136s;
                                            t5.getClass();
                                            t5.j(null, 0L);
                                            break;
                                        case 3:
                                            y4.h();
                                            break;
                                        case 4:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                            Y y7 = y4;
                                            A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                            y7.g(3);
                                            break;
                                        case 5:
                                            y4.g(2);
                                            break;
                                        case 6:
                                            AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                            y4.g(4);
                                            break;
                                        case 7:
                                            y4.g(3);
                                            break;
                                        case 8:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                            Y y8 = y4;
                                            A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                            break;
                                        case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                            y4.g(4);
                                            break;
                                        default:
                                            AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                            y4.h();
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue25);
                        }
                        composer.endReplaceGroup();
                        Z4.b(listL4, jLongValue, i7, bVarM, eVarN, cVar12, cVar13, aVar13, (a) objRememberedValue25, null, composer, 0);
                        composer.endReplaceGroup();
                        break;
                    case 5:
                        composer2 = composer;
                        composer2.startReplaceGroup(-621701994);
                        Qd.c(S.o(this.f13049L), bVar2, null, composer2, 0);
                        composer.endReplaceGroup();
                        break;
                    case 6:
                        composer2.startReplaceGroup(-2092513219);
                        u uVarP = S.p(this.f13050M);
                        if (uVarP instanceof u.b) {
                            composer2.startReplaceGroup(-2092460085);
                            String message = ((u.b) uVarP).getMessage();
                            composer2.startReplaceGroup(-621681944);
                            boolean zChangedInstance24 = composer2.changedInstance(y4);
                            Object objRememberedValue26 = composer.rememberedValue();
                            if (zChangedInstance24 || objRememberedValue26 == Composer.Companion.getEmpty()) {
                                final int i35 = 9;
                                objRememberedValue26 = new a() { // from class: t3.C
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i35) {
                                            case 0:
                                                y4.g(0);
                                                break;
                                            case 1:
                                                AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                                Y y5 = y4;
                                                y5.h();
                                                y5.g(1);
                                                break;
                                            case 2:
                                                Y y6 = y4;
                                                C3.C c5 = C3.C.f167o;
                                                T t = y6.g;
                                                t.getClass();
                                                t.j(null, c5);
                                                T t5 = y6.f13136s;
                                                t5.getClass();
                                                t5.j(null, 0L);
                                                break;
                                            case 3:
                                                y4.h();
                                                break;
                                            case 4:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                                Y y7 = y4;
                                                A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                                y7.g(3);
                                                break;
                                            case 5:
                                                y4.g(2);
                                                break;
                                            case 6:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                                y4.g(4);
                                                break;
                                            case 7:
                                                y4.g(3);
                                                break;
                                            case 8:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                                Y y8 = y4;
                                                A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                                break;
                                            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                                y4.g(4);
                                                break;
                                            default:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                                y4.h();
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue26);
                            }
                            composer.endReplaceGroup();
                            AbstractC2397b5.a(message, (a) objRememberedValue26, null, composer2, 0);
                            composer.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-2091899915);
                            final boolean z3 = uVarP instanceof u.d;
                            boolean z4 = uVarP instanceof u.a;
                            float progress = z3 ? ((u.d) uVarP).getProgress() : 0.0f;
                            long jLongValue2 = ((Number) state5.getValue()).longValue();
                            long jQ = S.q(this.f13051N);
                            File fileE = y4.e();
                            if (fileE == null || (name = fileE.getName()) == null) {
                                name = "Processed Document.pdf";
                            }
                            List listL6 = S.l(state4);
                            if ((listL6 instanceof Collection) && listL6.isEmpty()) {
                                i8 = 0;
                            } else {
                                Iterator it2 = listL6.iterator();
                                i8 = 0;
                                while (it2.hasNext()) {
                                    if (((g) it2.next()).isSelected() && (i8 = i8 + 1) < 0) {
                                        v.W();
                                        throw null;
                                    }
                                }
                            }
                            composer2.startReplaceGroup(-621637187);
                            boolean zChanged3 = composer2.changed(z3) | composer2.changedInstance(y4);
                            Object objRememberedValue27 = composer.rememberedValue();
                            if (zChanged3 || objRememberedValue27 == Composer.Companion.getEmpty()) {
                                objRememberedValue27 = new a() { // from class: t3.G
                                    @Override // O3.a
                                    public final Object invoke() {
                                        AnalyticsManager.INSTANCE.logCtaClick("Download", "Success_Screen");
                                        if (!z3) {
                                            Y y5 = y4;
                                            A.t(Q.h(y5), null, null, new X(y5, null), 3);
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue27);
                            }
                            a aVar14 = (a) objRememberedValue27;
                            composer.endReplaceGroup();
                            composer2.startReplaceGroup(-621623117);
                            boolean zChangedInstance25 = composer2.changedInstance(y4) | composer2.changedInstance(context);
                            Object objRememberedValue28 = composer.rememberedValue();
                            if (zChangedInstance25 || objRememberedValue28 == Composer.Companion.getEmpty()) {
                                final int i36 = 0;
                                objRememberedValue28 = new a() { // from class: t3.H
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i36) {
                                            case 0:
                                                Context context2 = context;
                                                AnalyticsManager.INSTANCE.logCtaClick("View_File", "Success_Screen");
                                                File fileL = y4.f13124c.l();
                                                if (fileL != null) {
                                                    try {
                                                        Uri uriD = FileProvider.d(context2, context2.getPackageName() + ".provider", fileL);
                                                        Intent intent = new Intent("android.intent.action.VIEW");
                                                        intent.setDataAndType(uriD, "application/pdf");
                                                        intent.addFlags(1);
                                                        context2.startActivity(intent);
                                                    } catch (Exception unused) {
                                                        Toast.makeText(context2, "Error previewing PDF", 0).show();
                                                    }
                                                }
                                                break;
                                            default:
                                                Context context3 = context;
                                                AnalyticsManager.INSTANCE.logCtaClick("Share_File", "Success_Screen");
                                                File fileL2 = y4.f13124c.l();
                                                if (fileL2 != null) {
                                                    try {
                                                        Uri uriD2 = FileProvider.d(context3, context3.getPackageName() + ".provider", fileL2);
                                                        Intent intent2 = new Intent("android.intent.action.SEND");
                                                        intent2.setType("application/pdf");
                                                        intent2.putExtra("android.intent.extra.STREAM", uriD2);
                                                        intent2.addFlags(1);
                                                        context3.startActivity(Intent.createChooser(intent2, "Share PDF"));
                                                    } catch (Exception unused2) {
                                                        Toast.makeText(context3, "Error sharing PDF", 0).show();
                                                    }
                                                }
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue28);
                            }
                            a aVar15 = (a) objRememberedValue28;
                            composer.endReplaceGroup();
                            composer2.startReplaceGroup(-621583519);
                            boolean zChangedInstance26 = composer2.changedInstance(y4) | composer2.changedInstance(context);
                            Object objRememberedValue29 = composer.rememberedValue();
                            if (zChangedInstance26 || objRememberedValue29 == Composer.Companion.getEmpty()) {
                                final int i37 = 1;
                                objRememberedValue29 = new a() { // from class: t3.H
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i37) {
                                            case 0:
                                                Context context2 = context;
                                                AnalyticsManager.INSTANCE.logCtaClick("View_File", "Success_Screen");
                                                File fileL = y4.f13124c.l();
                                                if (fileL != null) {
                                                    try {
                                                        Uri uriD = FileProvider.d(context2, context2.getPackageName() + ".provider", fileL);
                                                        Intent intent = new Intent("android.intent.action.VIEW");
                                                        intent.setDataAndType(uriD, "application/pdf");
                                                        intent.addFlags(1);
                                                        context2.startActivity(intent);
                                                    } catch (Exception unused) {
                                                        Toast.makeText(context2, "Error previewing PDF", 0).show();
                                                    }
                                                }
                                                break;
                                            default:
                                                Context context3 = context;
                                                AnalyticsManager.INSTANCE.logCtaClick("Share_File", "Success_Screen");
                                                File fileL2 = y4.f13124c.l();
                                                if (fileL2 != null) {
                                                    try {
                                                        Uri uriD2 = FileProvider.d(context3, context3.getPackageName() + ".provider", fileL2);
                                                        Intent intent2 = new Intent("android.intent.action.SEND");
                                                        intent2.setType("application/pdf");
                                                        intent2.putExtra("android.intent.extra.STREAM", uriD2);
                                                        intent2.addFlags(1);
                                                        context3.startActivity(Intent.createChooser(intent2, "Share PDF"));
                                                    } catch (Exception unused2) {
                                                        Toast.makeText(context3, "Error sharing PDF", 0).show();
                                                    }
                                                }
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue29);
                            }
                            a aVar16 = (a) objRememberedValue29;
                            composer.endReplaceGroup();
                            composer2.startReplaceGroup(-621541277);
                            boolean zChangedInstance27 = composer2.changedInstance(y4);
                            Object objRememberedValue30 = composer.rememberedValue();
                            if (zChangedInstance27 || objRememberedValue30 == Composer.Companion.getEmpty()) {
                                final int i38 = 10;
                                objRememberedValue30 = new a() { // from class: t3.C
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i38) {
                                            case 0:
                                                y4.g(0);
                                                break;
                                            case 1:
                                                AnalyticsManager.INSTANCE.logCtaClick("Start Processing", "Landing_Screen");
                                                Y y5 = y4;
                                                y5.h();
                                                y5.g(1);
                                                break;
                                            case 2:
                                                Y y6 = y4;
                                                C3.C c5 = C3.C.f167o;
                                                T t = y6.g;
                                                t.getClass();
                                                t.j(null, c5);
                                                T t5 = y6.f13136s;
                                                t5.getClass();
                                                t5.j(null, 0L);
                                                break;
                                            case 3:
                                                y4.h();
                                                break;
                                            case 4:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Reorder_Screen");
                                                Y y7 = y4;
                                                A.t(Q.h(y7), null, null, new U(y7, null), 3);
                                                y7.g(3);
                                                break;
                                            case 5:
                                                y4.g(2);
                                                break;
                                            case 6:
                                                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Preview_Screen");
                                                y4.g(4);
                                                break;
                                            case 7:
                                                y4.g(3);
                                                break;
                                            case 8:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_File", "Enhance_Screen");
                                                Y y8 = y4;
                                                A.t(Q.h(y8), null, null, new V(y8, null), 3);
                                                break;
                                            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                                                y4.g(4);
                                                break;
                                            default:
                                                AnalyticsManager.INSTANCE.logCtaClick("Process_Another", "Success_Screen");
                                                y4.h();
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue30);
                            }
                            a aVar17 = (a) objRememberedValue30;
                            Object objK8 = p076s.b.k(composer2, -621531798);
                            if (objK8 == Composer.Companion.getEmpty()) {
                                objK8 = new C2315v(24, mutableState);
                                composer2.updateRememberedValue(objK8);
                            }
                            composer.endReplaceGroup();
                            Ee.b(jLongValue2, jQ, name, i8, z3, z4, progress, aVar14, aVar15, aVar16, aVar17, (a) objK8, bVar2, S.f(state2), null, composer, 0, 48);
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                        composer2 = composer;
                        break;
                    default:
                        composer2.startReplaceGroup(-2087217427);
                        composer.endReplaceGroup();
                        break;
                }
                composer.endReplaceGroup();
            case "help":
                Object objJ12 = p076s.b.j(-622222425, composer2, -622220862);
                if (objJ12 == Composer.Companion.getEmpty()) {
                    objJ12 = new C2321y(2, mutableState);
                    composer2.updateRememberedValue(objJ12);
                }
                composer.endReplaceGroup();
                D5.b(null, (c) objJ12, composer2, 6);
                composer.endReplaceGroup();
            case "home":
                composer2.startReplaceGroup(-2100457341);
                composer2.startReplaceGroup(-621942872);
                boolean zChangedInstance28 = composer2.changedInstance(y4);
                Object objRememberedValue31 = composer.rememberedValue();
                if (zChangedInstance28 || objRememberedValue31 == Composer.Companion.getEmpty()) {
                    objRememberedValue31 = new C2313u(y4, mutableState, 2);
                    composer2.updateRememberedValue(objRememberedValue31);
                }
                a aVar18 = (a) objRememberedValue31;
                Object objK9 = p076s.b.k(composer2, -621935734);
                Composer.Companion companion8 = Composer.Companion;
                if (objK9 == companion8.getEmpty()) {
                    objK9 = new C2315v(17, mutableState);
                    composer2.updateRememberedValue(objK9);
                }
                a aVar19 = (a) objK9;
                Object objK10 = p076s.b.k(composer2, -621931549);
                if (objK10 == companion8.getEmpty()) {
                    objK10 = new C2315v(18, mutableState);
                    composer2.updateRememberedValue(objK10);
                }
                composer.endReplaceGroup();
                AbstractC2684t5.b(aVar18, aVar19, (a) objK10, null, composer, 432);
                composer.endReplaceGroup();
            case "info":
                composer2.startReplaceGroup(-622160912);
                F5.a("Information", "Select a topic", null, composer2, 54);
                composer.endReplaceGroup();
            case "tools":
                composer2.startReplaceGroup(-622233507);
                composer2.startReplaceGroup(-622231944);
                boolean zChangedInstance29 = composer2.changedInstance(bVar);
                Object objRememberedValue32 = composer.rememberedValue();
                if (zChangedInstance29 || objRememberedValue32 == Composer.Companion.getEmpty()) {
                    objRememberedValue32 = new d(2, bVar, mutableState);
                    composer2.updateRememberedValue(objRememberedValue32);
                }
                composer.endReplaceGroup();
                Ud.a((c) objRememberedValue32, composer2, 0);
                composer.endReplaceGroup();
            case "contact-us":
                Object objJ13 = p076s.b.j(-622064020, composer2, -622062593);
                Composer.Companion companion9 = Composer.Companion;
                if (objJ13 == companion9.getEmpty()) {
                    objJ13 = new I(9, mutableState);
                    composer2.updateRememberedValue(objJ13);
                }
                a aVar20 = (a) objJ13;
                Object objK11 = p076s.b.k(composer2, -622058918);
                if (objK11 == companion9.getEmpty()) {
                    objK11 = new C2315v(2, mutableState);
                    composer2.updateRememberedValue(objK11);
                }
                a aVar21 = (a) objK11;
                Object objK12 = p076s.b.k(composer2, -622055265);
                if (objK12 == companion9.getEmpty()) {
                    objK12 = new C2315v(3, mutableState);
                    composer2.updateRememberedValue(objK12);
                }
                composer.endReplaceGroup();
                F3.b(aVar20, aVar21, (a) objK12, composer2, 438);
                composer.endReplaceGroup();
            case "terms-of-service":
                composer2.startReplaceGroup(-622147328);
                F5.a("Terms of Service", "Terms of Service\n\nEffective Date: May 15, 2026\nApplies to all NotesCrafter platforms\n\n1. Acceptance of Terms\nBy accessing or using any NotesCrafter service — including flow.notescrafter.com, tools.notescrafter.com, print.notescrafter.com, or the NotesCrafter Android application — you agree to be bound by these Terms of Service and our Privacy Policy. If you do not agree, please discontinue use immediately.\n\n2. About NotesCrafter\nNotesCrafter is a sole proprietorship based in Aurangabad, Bihar, India. We provide browser-based and app-based document tools to help students convert online lectures, slides, and study material into clean, printable notes — along with a physical print-and-deliver service.\nFor the purposes of legal identification, NotesCrafter is operated by Nitish Kumar (Sole Proprietor).\n\n3. Eligibility\nYou must be at least 13 years old to use NotesCrafter. By using our services, you represent that you meet this age requirement. Users under 18 must have the consent of a parent or legal guardian.\n\n4. Services\n4.1 Flow — flow.notescrafter.com & Android App\nFlow is a multi-step browser-based workflow that converts online lectures, PDFs, and slides into well-formatted, print-ready notes. All processing happens locally in your browser or on your device — no files are ever uploaded to our servers.\n- Web Platform: Free users have a 5MB upload limit per session. Community Pass members have unlimited file size.\n- Android App: Full Flow access with no limits (Free). Ads are served to free users. Community Pass is fully ad-free.\n\n4.2 Tools — tools.notescrafter.com & Android App\nTools is a collection of browser-based document utilities freely available to all users. All processing occurs locally in your browser or on your device with zero server interaction. No account is required to use Tools on the web. The Android app provides the same Tools suite with the same zero server-touch processing.\n\n4.3 Print — print.notescrafter.com & Android App\nPrint is a physical print-and-deliver service. You upload a PDF, we print and wiro-bind it as an A4 notebook, and deliver it to your address anywhere in India via Shiprocket.\n- Available via both the website and the Android app\n- Payments are processed by Razorpay\n- Delivery is handled by Shiprocket\n- All print orders are custom-produced and non-refundable\n- Delivery is currently available across India only\n\n5. Community Pass\nCommunity Pass grants premium access on the web platform and a fully ad-free experience across all features in the Android app. Four membership tiers are available:\n- Silver Pass (1-month access)\n- Gold Pass (6-month access)\n- Platinum Pass (1-year access)\n- Diamond Pass (Lifetime access)\nAll Community Pass purchases are made on the NotesCrafter website via Razorpay. Passes are personal and non-transferable. We reserve the right to revoke a pass if the account is found to be in violation of these Terms.\n\n6. Community Pass Upgrades\nYou may upgrade your active Community Pass to a higher tier at any time. When you initiate an upgrade, we calculate the remaining monetary value of your current pass based on unused days and apply it as a discount towards the price of the higher-tier pass.\nUpgrade Calculation Formula:\n- Remaining Value = (Original Pass Price ÷ Total Pass Days) × Days Remaining\n- Amount Due = Higher Tier Price − Remaining Value\nConditions:\n- Upgrades are available only from a lower tier to a higher tier\n- Downgrades between tiers are not permitted\n- The Diamond (Lifetime) Pass cannot be upgraded further\n- Upgrade pricing is calculated at the time of initiating the upgrade using current pass prices\n- Upgrade payments are non-refundable once processed\n\n7. Google Account & Login\nNotesCrafter uses Google OAuth for authentication. You are responsible for maintaining the security of your Google account. All activity associated with your NotesCrafter session is your responsibility. We are not liable for any loss or damage resulting from unauthorised access to your account.\n\n8. Acceptable Use\nYou agree not to:\n- Use NotesCrafter for any unlawful or unauthorised purpose\n- Upload content that infringes third-party intellectual property or copyright\n- Attempt to reverse-engineer, decompile, or scrape any part of our platform\n- Circumvent access controls, file size limits, or paywalls through any means\n- Upload malicious files, scripts, or content intended to harm our systems or other users\n- Share, resell, or transfer your Community Pass or account access to others\n- Use automated bots or scripts to interact with our services\n\n9. Intellectual Property\nAll NotesCrafter branding, design, source code, copy, and product features are the intellectual property of NotesCrafter. Unauthorised reproduction or commercial use is prohibited.\nFiles and content you upload remain your property. We claim no ownership over your uploaded documents. Our limited right to store your files applies only to the print service and solely for the purpose of fulfilling your print order.\n\n10. Third-Party Services\nNotesCrafter integrates with third-party services including Google (authentication), Razorpay (payments), Shiprocket (logistics), and Google AdMob (in-app advertising). Your use of these services is governed by their respective terms and privacy policies. We are not responsible for the actions, availability, or policies of these third parties.\n\n11. Disclaimer of Warranties\nNotesCrafter services are provided on an \"as is\" and \"as available\" basis without warranties of any kind, express or implied. We do not warrant that our services will be uninterrupted, error-free, or free of viruses. Output quality from Flow and Tools depends on the quality and format of your source files.\n\n12. Limitation of Liability\nTo the fullest extent permitted by applicable Indian law, NotesCrafter shall not be liable for any indirect, incidental, special, consequential, or punitive damages — including but not limited to loss of data, revenue, or business opportunities — arising from your use of or inability to use our services.\n\n13. Governing Law & Jurisdiction\nThese Terms of Service are governed by and construed in accordance with the laws of India, including the Information Technology Act, 2000 and the Digital Personal Data Protection Act, 2023. Any disputes arising out of or in connection with these Terms shall be subject to the exclusive jurisdiction of the competent courts in Aurangabad, Bihar, India.\n\n14. Modifications to Terms\nWe reserve the right to modify these Terms at any time. Significant changes will be communicated via WhatsApp, email, or a notice on our platform. Continued use of our services following the posting of changes constitutes your acceptance of the revised Terms.\n\n15. Contact Us\nNotesCrafter\nSole Proprietorship · Aurangabad, Bihar, India\nNitish Kumar (Sole Proprietor)\nEmail: support@notescrafter.com\n\nSeverability\nIf any provision of these Terms of Service is held to be invalid or unenforceable, the remaining provisions will remain in full force and effect. The invalid or unenforceable provision will be replaced with a valid provision that most closely matches the intent of the original provision.", null, composer2, 6);
                composer.endReplaceGroup();
            case "community-pass":
                composer2.startReplaceGroup(-622200456);
                Integer numValueOf = Integer.valueOf(S.r(this.f13059z));
                composer2.startReplaceGroup(-622193902);
                Object objRememberedValue33 = composer.rememberedValue();
                if (objRememberedValue33 == Composer.Companion.getEmpty()) {
                    objRememberedValue33 = new I(6, mutableState);
                    composer2.updateRememberedValue(objRememberedValue33);
                }
                composer.endReplaceGroup();
                AbstractC2583n.a(str2, numValueOf, hVar, (a) objRememberedValue33, null, composer, 3072);
                composer.endReplaceGroup();
            case "pdf-invert":
                Object objJ14 = p076s.b.j(-621951714, composer2, -621950353);
                if (objJ14 == Composer.Companion.getEmpty()) {
                    objJ14 = new C2315v(16, mutableState);
                    composer2.updateRememberedValue(objJ14);
                }
                composer.endReplaceGroup();
                AbstractC2783z8.a(6, (a) objJ14, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "live-chat":
                Object objJ15 = p076s.b.j(-622050329, composer2, -622048704);
                if (objJ15 == Composer.Companion.getEmpty()) {
                    objJ15 = new C2315v(4, mutableState);
                    composer2.updateRememberedValue(objJ15);
                }
                composer.endReplaceGroup();
                p003a2.a.b((a) objJ15, composer2, 6);
                composer.endReplaceGroup();
            case "shipping-policy":
                composer2.startReplaceGroup(-622132385);
                F5.a("Shipping Policy", "Shipping Policy\n\nEffective Date: May 15, 2026\nApplies to all NotesCrafter platforms\n\n1. Overview\nThis Shipping Policy applies to all print orders placed on print.notescrafter.com or through the NotesCrafter Android app. We partner with Shiprocket to manage order dispatch, shipping, and last-mile delivery across India.\nBy placing a print order, you agree to this Shipping Policy along with our Terms of Service and Refund Policy.\n\n2. Delivery Coverage\nWe currently deliver to addresses across India only. International shipping is not available at this time.\nWe ship to most pin codes serviced by Shiprocket's courier network. In rare cases where your pin code is not serviceable, we will notify you via WhatsApp or at your registered email address before your order enters production.\n\n3. Order Processing Time\nOnce your payment is confirmed, your order enters our production queue. Orders are typically processed and dispatched within 2 to 4 business days, covering:\n- PDF verification and pre-press review\n- Printing and wiro-binding of your A4 notebook\n- Quality check before courier handoff\nProcessing times may be longer during high-volume periods such as examination seasons. You will receive a WhatsApp or email notification with tracking details once your order is dispatched.\n\n4. Estimated Delivery Time\nAfter dispatch, estimated delivery timelines depend on your location and the courier assigned by Shiprocket:\n- Metro cities: 2–4 business days (Delhi, Mumbai, Bengaluru, Hyderabad, Chennai, Kolkata, Pune)\n- Tier-2 and Tier-3 cities: 3–6 business days\n- Remote or rural areas: 5–10 business days\nThese are estimates only and are not guaranteed. Delays may occur due to courier capacity, public holidays, weather, or circumstances beyond our control. NotesCrafter is not liable for delays caused by courier or third-party logistics partners.\n\n5. Order Tracking\nOnce your order is dispatched, a shipment tracking link will be sent to you via WhatsApp or email. You can also track your order directly through the NotesCrafter website or Android app using your Order ID.\nTracking information is fetched in real-time from Shiprocket and may take up to 24 hours to update after dispatch.\n\n6. Shipping Charges\nShipping charges, if applicable, are calculated based on the weight and dimensions of your order and your delivery pin code. The exact cost will be displayed at checkout before payment is confirmed.\nWe may offer free shipping promotions from time to time, which will be clearly indicated on the platform during the applicable period.\n\n7. Delivery Address Accuracy\nYou are solely responsible for providing a complete and accurate delivery address — including house/flat number, street, landmark, city, state, and pin code — along with a reachable phone number.\nNotesCrafter and Shiprocket are not responsible for non-delivery or delays resulting from:\n- An incorrect, incomplete, or outdated address\n- An unreachable or unresponsive phone number at the time of delivery\n- Refusal to accept the package\nIf a delivery fails due to address errors provided by you, re-delivery charges will be borne by the customer.\n\n8. Failed Delivery Attempts\nOur courier partners typically make up to 3 delivery attempts. If all attempts are unsuccessful and the package is returned to us, we will contact you via WhatsApp or email. Re-dispatch in such cases may incur additional shipping charges payable by the customer.\nOrders that are undeliverable and returned to origin will not be automatically refunded, as the product has already been custom-printed. Please refer to our Refund Policy for applicable exception criteria.\n\n9. Damaged or Tampered Shipments\nIf you receive a shipment that is visibly damaged or tampered with:\n- Do not discard the packaging\n- Photograph the package and the product immediately upon receipt\n- Contact us at support@notescrafter.com within 48 hours of delivery\n- Include your Order ID and photographic evidence\nIf damage is confirmed to have occurred during transit and is not attributable to your source file, we may offer a reprint at our discretion.\n\n10. Order Cancellation Before Dispatch\nOrders may be cancelled only before they enter production. To request a cancellation, contact support@notescrafter.com immediately after placing your order with your Order ID.\nOnce an order has entered the print and binding stage, cancellation is no longer possible. We cannot guarantee that a cancellation request will be processed in time, as production may begin within hours of order confirmation. The no-refund policy applies to all orders in production or beyond.\n\n11. Contact Us\nNotesCrafter\nSole Proprietorship · Aurangabad, Bihar, India\nNitish Kumar (Sole Proprietor)\nEmail: support@notescrafter.com", null, composer2, 6);
                composer.endReplaceGroup();
            case "pdf-organize":
                Object objJ16 = p076s.b.j(-621964320, composer2, -621962897);
                if (objJ16 == Composer.Companion.getEmpty()) {
                    objJ16 = new C2315v(14, mutableState);
                    composer2.updateRememberedValue(objJ16);
                }
                composer.endReplaceGroup();
                AbstractC2545k9.a(6, (a) objJ16, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "print-order-upload":
                composer2.startReplaceGroup(-2087127899);
                if (((Boolean) state.getValue()).booleanValue()) {
                    Object objJ17 = p076s.b.j(-2087104649, composer2, -621507758);
                    Composer.Companion companion10 = Composer.Companion;
                    if (objJ17 == companion10.getEmpty()) {
                        objJ17 = new C2315v(25, mutableState);
                        composer2.updateRememberedValue(objJ17);
                    }
                    a aVar22 = (a) objJ17;
                    Object objK13 = p076s.b.k(composer2, -621503398);
                    if (objK13 == companion10.getEmpty()) {
                        objK13 = new C2315v(26, mutableState);
                        composer2.updateRememberedValue(objK13);
                    }
                    composer.endReplaceGroup();
                    Gd.l(printOrderViewModel, str2, aVar22, (a) objK13, null, composer, 3456);
                    composer.endReplaceGroup();
                } else {
                    Object objJ18 = p076s.b.j(-2086572999, composer2, -621488170);
                    if (objJ18 == Composer.Companion.getEmpty()) {
                        objJ18 = new C2315v(27, mutableState);
                        composer2.updateRememberedValue(objJ18);
                    }
                    composer.endReplaceGroup();
                    S.d("Sync Your Cart", "Sign in with Google to sync your cart, manage shipping addresses, and order prints.", hVar, (a) objJ18, composer, 3126);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            case "pdf-add-page-numbers":
                Object objJ19 = p076s.b.j(-621970970, composer2, -621969361);
                if (objJ19 == Composer.Companion.getEmpty()) {
                    objJ19 = new C2315v(13, mutableState);
                    composer2.updateRememberedValue(objJ19);
                }
                composer.endReplaceGroup();
                AbstractC2447e7.a(6, (a) objJ19, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "pdf-to-jpg":
                Object objJ20 = p076s.b.j(-621983907, composer2, -621982577);
                if (objJ20 == Composer.Companion.getEmpty()) {
                    objJ20 = new C2315v(10, mutableState);
                    composer2.updateRememberedValue(objJ20);
                }
                composer.endReplaceGroup();
                Z9.a(6, (a) objJ20, composer2, S.f(state2));
                composer.endReplaceGroup();
            case "my-orders":
                composer2.startReplaceGroup(-2110237655);
                if (((Boolean) state.getValue()).booleanValue()) {
                    composer2.startReplaceGroup(-2110213816);
                    composer2.startReplaceGroup(-622255148);
                    boolean zChangedInstance30 = composer2.changedInstance(printOrderViewModel);
                    Object objRememberedValue34 = composer.rememberedValue();
                    if (zChangedInstance30 || objRememberedValue34 == Composer.Companion.getEmpty()) {
                        i9 = 0;
                        objRememberedValue34 = new a() { // from class: t3.B
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        printOrderViewModel.m();
                                        mutableState.setValue("print-order-upload");
                                        break;
                                    case 1:
                                        printOrderViewModel.m();
                                        mutableState.setValue("print-order-upload");
                                        break;
                                    default:
                                        printOrderViewModel.m();
                                        mutableState.setValue("print-order-upload");
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue34);
                    } else {
                        i9 = 0;
                    }
                    composer.endReplaceGroup();
                    AbstractC2452ec.b(printOrderViewModel, (a) objRememberedValue34, null, composer2, i9);
                    composer.endReplaceGroup();
                } else {
                    Object objJ21 = p076s.b.j(-2109822100, composer2, -622238730);
                    if (objJ21 == Composer.Companion.getEmpty()) {
                        objJ21 = new C2315v(19, mutableState);
                        composer2.updateRememberedValue(objJ21);
                    }
                    composer.endReplaceGroup();
                    S.d("Order History", "Sign in with Google to view and track your previous print orders.", hVar, (a) objJ21, composer, 3126);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            case "pomodoro-setup":
                Object objJ22 = p076s.b.j(-622043008, composer2, -622041837);
                Composer.Companion companion11 = Composer.Companion;
                if (objJ22 == companion11.getEmpty()) {
                    objJ22 = new C2315v(5, mutableState);
                    composer2.updateRememberedValue(objJ22);
                }
                a aVar23 = (a) objJ22;
                Object objK14 = p076s.b.k(composer2, -622039256);
                if (objK14 == companion11.getEmpty()) {
                    objK14 = new K(mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState);
                    composer2.updateRememberedValue(objK14);
                }
                composer.endReplaceGroup();
                AbstractC2642qa.a(aVar23, (O3.h) objK14, bVar, S.f(state2), composer, 54);
                composer.endReplaceGroup();
            case "pomodoro-timer":
                composer2.startReplaceGroup(-622018333);
                int iG = S.g(mutableState2);
                int iH = S.h(mutableState3);
                int i39 = S.i(mutableState4);
                int iJ = S.j(mutableState5);
                long jK = S.k(mutableState6);
                composer2.startReplaceGroup(-622008028);
                Object objRememberedValue35 = composer.rememberedValue();
                if (objRememberedValue35 == Composer.Companion.getEmpty()) {
                    objRememberedValue35 = new C2315v(6, mutableState);
                    composer2.updateRememberedValue(objRememberedValue35);
                }
                composer.endReplaceGroup();
                Ja.b(iG, iH, i39, iJ, jK, (a) objRememberedValue35, composer, 196608);
                composer.endReplaceGroup();
            case "print-order-checkout":
                composer2.startReplaceGroup(-2084932386);
                if (((Boolean) state.getValue()).booleanValue()) {
                    Object objJ23 = p076s.b.j(-2084908144, composer2, -621436838);
                    Composer.Companion companion12 = Composer.Companion;
                    if (objJ23 == companion12.getEmpty()) {
                        objJ23 = new I(2, mutableState);
                        composer2.updateRememberedValue(objJ23);
                    }
                    a aVar24 = (a) objJ23;
                    Object objK15 = p076s.b.k(composer2, -621432078);
                    if (objK15 == companion12.getEmpty()) {
                        objK15 = new I(4, mutableState);
                        composer2.updateRememberedValue(objK15);
                    }
                    composer.endReplaceGroup();
                    Gd.j(printOrderViewModel, str2, aVar24, (a) objK15, null, composer, 3456);
                    composer.endReplaceGroup();
                } else {
                    Object objJ24 = p076s.b.j(-2084370759, composer2, -621418122);
                    if (objJ24 == Composer.Companion.getEmpty()) {
                        objJ24 = new I(5, mutableState);
                        composer2.updateRememberedValue(objJ24);
                    }
                    composer.endReplaceGroup();
                    S.d("Checkout", "Sign in with Google to proceed with checkout and payment.", hVar, (a) objJ24, composer, 3126);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            case "settings":
                composer2.startReplaceGroup(-622215598);
                composer2.startReplaceGroup(-622214144);
                boolean zChangedInstance31 = composer2.changedInstance(y4);
                Object objRememberedValue36 = composer.rememberedValue();
                if (zChangedInstance31 || objRememberedValue36 == Composer.Companion.getEmpty()) {
                    objRememberedValue36 = new C2317w(y4, mutableState, 1);
                    composer2.updateRememberedValue(objRememberedValue36);
                }
                composer.endReplaceGroup();
                AbstractC2598ne.b((c) objRememberedValue36, hVar, null, composer2, 0);
                composer.endReplaceGroup();
            case "about-us":
                composer2.startReplaceGroup(-622163260);
                AbstractC2471g.a(null, composer2, 0);
                composer.endReplaceGroup();
            default:
                composer2.startReplaceGroup(-2083961249);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                a constructor2 = companion4.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.y("Coming Soon: ", (String) mutableState.getValue()), (Modifier) null, p107y3.a.f(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 384, 0, 131066);
                composer.endNode();
                composer.endReplaceGroup();
        }
    }

    @Override // O3.f
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return B3.o.f154a;
    }
}

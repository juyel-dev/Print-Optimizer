package p102x3;

import C3.v;
import N0.B;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import W3.j;
import W3.q;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.LogoutKt;
import androidx.compose.material.icons.outlined.CardMembershipKt;
import androidx.compose.material.icons.outlined.PlaceKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;
import p092v3.h;

/* JADX INFO: renamed from: x3.ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2486ge implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f15116o;
    public final /* synthetic */ c p;
    public final /* synthetic */ h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f15117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Brush f15118s;
    public final /* synthetic */ State t;
    public final /* synthetic */ State u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ State f15119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f15120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ State f15121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ State f15122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ State f15123z;

    public C2486ge(long j5, c cVar, h hVar, Context context, Brush brush, State state, State state2, State state3, String str, State state4, State state5, State state6) {
        this.f15116o = j5;
        this.p = cVar;
        this.q = hVar;
        this.f15117r = context;
        this.f15118s = brush;
        this.t = state;
        this.u = state2;
        this.f15119v = state3;
        this.f15120w = str;
        this.f15121x = state4;
        this.f15122y = state5;
        this.f15123z = state6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Composer composer;
        String str2;
        String strW;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1808349607, iIntValue, -1, "com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:126)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Brush.Companion companion2 = Brush.Companion;
            Color colorM3917boximpl = Color.m3917boximpl(Color.m3926copywmQWz5c$default(this.f15116o, 0.05f, 0.0f, 0.0f, 0.0f, 14, null));
            Color.Companion companion3 = Color.Companion;
            float f5 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m3884verticalGradient8A3gB4$default(companion2, v.S(colorM3917boximpl, Color.m3917boximpl(companion3.m3962getTransparent0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composer2, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
            e eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composer2, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            a constructor2 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
            e eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            State state = this.t;
            String str3 = (String) state.getValue();
            long j5 = this.f15116o;
            Brush brush = this.f15118s;
            State state2 = this.u;
            if (str3 == null || j.m0(str3)) {
                composer2.startReplaceGroup(1260816362);
                Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.background$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(56)), RoundedCornerShapeKt.getCircleShape()), brush, null, 0.0f, 6, null), Dp.m6403constructorimpl(2), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
                a constructor3 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                e eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String str4 = (String) state2.getValue();
                if (str4 == null) {
                    str4 = "U";
                }
                String upperCase = j.F0(1, str4).toUpperCase(Locale.ROOT);
                o.e(upperCase, "toUpperCase(...)");
                str = null;
                composer = composer2;
                TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, companion3.m3964getWhite0d7_KjU(), TextUnitKt.getSp(22), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200064, 0, 131026);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1260262764);
                B.a((String) state.getValue(), "Profile Picture", BorderKt.m220borderxT4_qwU(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(56)), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(2), j5, RoundedCornerShapeKt.getCircleShape()), ContentScale.Companion.getCrop(), composer2, 1572912);
                composer2.endReplaceGroup();
                composer = composer2;
                str = null;
            }
            Composer composer3 = composer;
            androidx.compose.foundation.text.modifiers.a.q(f5, companion, composer3, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
            a constructor4 = companion5.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor4);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
            e eVarG4 = p035i0.a.g(companion5, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
            String str5 = (String) state2.getValue();
            if (str5 == null) {
                str5 = "User";
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme.getTypography(composer3, i5).getTitleMedium();
            long j6 = p107y3.a.f15990o;
            FontWeight.Companion companion6 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(str5, (Modifier) null, j6, 0L, (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleMedium, composer3, 196992, 0, 65498);
            String str6 = (String) this.f15119v.getValue();
            if (str6 == null) {
                str6 = "";
            }
            TextKt.m2432Text4IGK_g(str6, (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer3, i5).getBodyMedium(), composer3, 384, 0, 65530);
            composer3.endNode();
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.background$default(ClipKt.clip(companion, RoundedCornerShapeKt.RoundedCornerShape(50)), brush, null, 0.0f, 6, null), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(5));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN4);
            a constructor5 = companion5.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor5);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
            e eVarG5 = p035i0.a.g(companion5, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            TextKt.m2432Text4IGK_g(this.f15120w, (Modifier) null, companion3.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer3, i5).getLabelSmall(), composer3, 196992, 0, 65498);
            b.r(composer3, f5, companion, composer3, 6);
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 384, 3);
            b.m(8, companion, composer3, 6);
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            ImageVector cardMembership = CardMembershipKt.getCardMembership(outlined);
            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(j5, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            if (((Boolean) this.f15121x.getValue()).booleanValue()) {
                String str7 = (String) this.f15122y.getValue();
                if (str7 != null) {
                    strW = q.W(str7, "_", " ");
                    if (strW.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String strValueOf = String.valueOf(strW.charAt(0));
                        o.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
                        String upperCase2 = strValueOf.toUpperCase(Locale.ROOT);
                        o.e(upperCase2, "toUpperCase(...)");
                        sb.append((Object) upperCase2);
                        String strSubstring = strW.substring(1);
                        o.e(strSubstring, "substring(...)");
                        sb.append(strSubstring);
                        strW = sb.toString();
                    }
                } else {
                    strW = str;
                }
                str2 = strW + " • " + ((Number) this.f15123z.getValue()).intValue() + " days left";
            } else {
                str2 = "No active pass (Tap to view plans)";
            }
            String str8 = str2;
            composer3.startReplaceGroup(-221890399);
            c cVar = this.p;
            boolean zChanged = composer3.changed(cVar);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new B5(cVar, 3);
                composer3.updateRememberedValue(objRememberedValue);
            }
            composer3.endReplaceGroup();
            AbstractC2598ne.a(cardMembership, "Community Pass", (a) objRememberedValue, null, j5, jM3926copywmQWz5c$default, str8, true, composer3, 12582960);
            ImageVector place = PlaceKt.getPlace(outlined);
            long j7 = p107y3.a.f15979b;
            long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(j7, 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer3.startReplaceGroup(-221869027);
            boolean zChanged2 = composer3.changed(cVar);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new B5(cVar, 4);
                composer3.updateRememberedValue(objRememberedValue2);
            }
            composer3.endReplaceGroup();
            AbstractC2598ne.a(place, "My Addresses", (a) objRememberedValue2, null, j7, jM3926copywmQWz5c$default2, "Manage your printing delivery destinations", true, composer3, 14377008);
            ImageVector logout = LogoutKt.getLogout(Icons.AutoMirrored.Outlined.INSTANCE);
            long jColor = ColorKt.Color(4293870660L);
            long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(ColorKt.Color(4293870660L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            composer3.startReplaceGroup(-221847678);
            h hVar = this.q;
            boolean zChangedInstance = composer3.changedInstance(hVar);
            Context context = this.f15117r;
            boolean zChangedInstance2 = zChangedInstance | composer3.changedInstance(context);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new C2290i(23, hVar, context);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            composer3.endReplaceGroup();
            AbstractC2598ne.a(logout, "Sign Out", (a) objRememberedValue3, null, jColor, jM3926copywmQWz5c$default3, "Log out from your account safely", false, composer3, 14377008);
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

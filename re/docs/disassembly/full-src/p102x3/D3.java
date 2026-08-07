package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ChatKt;
import androidx.compose.material.icons.outlined.EmailKt;
import androidx.compose.material.icons.outlined.LocationOnKt;
import androidx.compose.material.icons.outlined.PhoneKt;
import androidx.compose.material.icons.outlined.PublicKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import p076s.b;
import p083t3.J;

/* JADX INFO: loaded from: classes2.dex */
public final class D3 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f13857o;

    public D3(Context context) {
        this.f13857o = context;
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
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1299751602, iIntValue, -1, "com.notescrafter.ui.screens.ContactUsScreen.<anonymous>.<anonymous>.<anonymous> (ContactUsScreen.kt:190)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 24;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleLarge = materialTheme.getTypography(composer, i5).getTitleLarge();
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight bold = companion4.getBold();
            long j5 = p107y3.a.f15990o;
            TextKt.m2432Text4IGK_g("Get in touch", PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), j5, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge, composer, 197046, 0, 65496);
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            ImageVector email = EmailKt.getEmail(outlined);
            composer.startReplaceGroup(-297512416);
            Context context = this.f13857o;
            boolean zChangedInstance = composer.changedInstance(context);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new J(context, 2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            F3.a(email, "Email Support", "Questions or feedback", "support@notescrafter.com", "Usually responds within 48 hours", ClickableKt.m242clickableXHw0xAI$default(companion, false, null, null, (a) objRememberedValue, 7, null), composer, 28080, 0);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, 6);
            ImageVector chat = ChatKt.getChat(outlined);
            composer.startReplaceGroup(-297480112);
            boolean zChangedInstance2 = composer.changedInstance(context);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new J(context, 3);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            F3.a(chat, "WhatsApp Support", "Chat with us instantly", "+91 6203770581", "Active now • Replies instantly", ClickableKt.m242clickableXHw0xAI$default(companion, false, null, null, (a) objRememberedValue2, 7, null), composer, 28080, 0);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, 6);
            ImageVector phone = PhoneKt.getPhone(outlined);
            composer.startReplaceGroup(-297460948);
            boolean zChangedInstance3 = composer.changedInstance(context);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new J(context, 4);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            F3.a(phone, "Phone Support", "Voice call support", "+91 6203770581", "Active support hours: 10 AM - 6 PM", ClickableKt.m242clickableXHw0xAI$default(companion, false, null, null, (a) objRememberedValue3, 7, null), composer, 28080, 0);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, 6);
            F3.a(PublicKt.getPublic(outlined), "Social Media", "Follow us for updates", "@notescrafterapp", "Instagram, YouTube", null, composer, 28080, 32);
            b.m(f5, companion, composer, 6);
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, p107y3.a.f15991r, composer, 384, 3);
            b.m(f5, companion, composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(48)), 8), p107y3.a.g, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(LocationOnKt.getLocationOn(outlined), (String) null, (Modifier) null, p107y3.a.f15978a, composer, 3120, 4);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(16)), composer, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
            a constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            TextKt.m2432Text4IGK_g("Address", (Modifier) null, j5, 0L, (FontStyle) null, companion4.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 196998, 0, 131034);
            TextKt.m2432Text4IGK_g("NotesCrafter\nwww.notescrafter.com", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodyMedium(), composer, 390, 0, 65530);
            if (S2.b(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

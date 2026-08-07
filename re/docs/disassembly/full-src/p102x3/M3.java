package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.I;

/* JADX INFO: loaded from: classes2.dex */
public final class M3 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f14188o;
    public final /* synthetic */ H3 p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f14189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f14190s;

    public M3(a aVar, H3 h5, MutableState mutableState, a aVar2, a aVar3) {
        this.f14188o = aVar;
        this.p = h5;
        this.q = mutableState;
        this.f14189r = aVar2;
        this.f14190s = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497266950, iIntValue, -1, "com.notescrafter.ui.screens.DownloadedFileItem.<anonymous> (DownloadsScreen.kt:316)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(16));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierG = b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(48)), 8);
            long j5 = p107y3.a.f15978a;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
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
            IconKt.m1877Iconww6aTOc(DescriptionKt.getDescription(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(28)), j5, composer, 3504, 0);
            composer.endNode();
            androidx.compose.foundation.text.modifiers.a.q(12, companion, composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            H3 h5 = this.p;
            String str2 = h5.f14015b;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
            FontWeight medium = FontWeight.Companion.getMedium();
            long j6 = p107y3.a.f15990o;
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, j6, 0L, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodyMedium, composer, 196992, 3120, 55258);
            b.m(4, companion, composer, 6);
            long j7 = h5.f14016c;
            if (j7 < 1024) {
                str = j7 + " B";
            } else if (j7 < 1048576) {
                str = (j7 / ((long) Fields.RotationZ)) + " KB";
            } else {
                str = String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(j7 / 1048576.0d)}, 1));
            }
            String str3 = new SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault()).format(new Date(h5.f14017d));
            o.e(str3, "format(...)");
            TextKt.m2432Text4IGK_g(str + " • " + str3, (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 384, 3504, 51194);
            composer.endNode();
            float f5 = (float) 36;
            IconButtonKt.IconButton(this.f14188o, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), false, null, null, O.f14241f, composer, 196656, 28);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            composer.startReplaceGroup(2090229746);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            Object empty = companion5.getEmpty();
            MutableState mutableState = this.q;
            if (objRememberedValue == empty) {
                objRememberedValue = new I(12, mutableState);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            IconButtonKt.IconButton((a) objRememberedValue, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), false, null, null, O.g, composer, 196662, 28);
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            composer.startReplaceGroup(2090246067);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = new I(13, mutableState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Color.Companion companion6 = Color.Companion;
            float f6 = 0;
            AndroidMenu_androidKt.m1474DropdownMenuIlH_yew(zBooleanValue, (a) objRememberedValue2, BackgroundKt.m207backgroundbw27NRU$default(companion, companion6.m3962getTransparent0d7_KjU(), null, 2, null), 0L, null, null, null, companion6.m3962getTransparent0d7_KjU(), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(f6), null, ComposableLambdaKt.rememberComposableLambda(1950545600, true, new L3(this.f14189r, this.f14190s, mutableState), composer, 54), composer, 918553008, 48, 1144);
            if (androidx.compose.foundation.text.modifiers.a.w(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

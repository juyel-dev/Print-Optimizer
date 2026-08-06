package p083t3;

import C3.v;
import F3.j;
import M0.b;
import O1.i;
import O3.a;
import O3.c;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.InterfaceC0671j;
import androidx.lifecycle.Q;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.app.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.C2167f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.o;
import p011c0.d;
import p087u3.t;
import p087u3.u;
import p092v3.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S {
    public static final void a(boolean z3, final int i5, final a aVar, final a aVar2, Composer composer, final int i6, final int i7) {
        boolean z4;
        int i8;
        boolean z5;
        Composer composerStartRestartGroup = composer.startRestartGroup(935260470);
        int i9 = i7 & 1;
        if (i9 != 0) {
            i8 = i6 | 6;
            z4 = z3;
        } else if ((i6 & 6) == 0) {
            z4 = z3;
            i8 = (composerStartRestartGroup.changed(z4) ? 4 : 2) | i6;
        } else {
            z4 = z3;
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(aVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(aVar2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i10 = i8;
        if ((i10 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z5 = z4;
        } else {
            z5 = i9 != 0 ? true : z4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(935260470, i10, -1, "com.notescrafter.AppHeader (MainActivity.kt:1068)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.Companion;
            float f5 = 16;
            float f6 = 12;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxWidth$default, companion2.m3962getTransparent0d7_KjU(), null, 2, null)), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f6));
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_app_logo_foreground, composerStartRestartGroup, 0), "NotesCrafter Logo", ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            androidx.compose.foundation.text.modifiers.a.q(f6, companion, composerStartRestartGroup, 6);
            TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleLarge();
            FontWeight.Companion companion5 = FontWeight.Companion;
            FontWeight bold = companion5.getBold();
            Brush.Companion companion6 = Brush.Companion;
            TextKt.m2432Text4IGK_g("NotesCrafter", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge.m5915copyNs73l9s(Brush.Companion.m3878linearGradientmHitzGk$default(companion6, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), (33554430 & 2) != 0 ? titleLarge.spanStyle.getAlpha() : 0.0f, (33554430 & 4) != 0 ? titleLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (33554430 & 8) != 0 ? titleLarge.spanStyle.getFontWeight() : bold, (33554430 & 16) != 0 ? titleLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (33554430 & 32) != 0 ? titleLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (33554430 & 64) != 0 ? titleLarge.spanStyle.getFontFamily() : null, (33554430 & Fields.SpotShadowColor) != 0 ? titleLarge.spanStyle.getFontFeatureSettings() : null, (33554430 & Fields.RotationX) != 0 ? titleLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (33554430 & Fields.RotationY) != 0 ? titleLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (33554430 & Fields.RotationZ) != 0 ? titleLarge.spanStyle.getTextGeometricTransform() : null, (33554430 & Fields.CameraDistance) != 0 ? titleLarge.spanStyle.getLocaleList() : null, (33554430 & Fields.TransformOrigin) != 0 ? titleLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (33554430 & Fields.Shape) != 0 ? titleLarge.spanStyle.getTextDecoration() : null, (33554430 & Fields.Clip) != 0 ? titleLarge.spanStyle.getShadow() : null, (33554430 & Fields.CompositingStrategy) != 0 ? titleLarge.spanStyle.getDrawStyle() : null, (33554430 & 65536) != 0 ? titleLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (33554430 & Fields.RenderEffect) != 0 ? titleLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (33554430 & 262144) != 0 ? titleLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (524288 & 33554430) != 0 ? titleLarge.paragraphStyle.getTextIndent() : null, (33554430 & 1048576) != 0 ? titleLarge.platformStyle : null, (33554430 & 2097152) != 0 ? titleLarge.paragraphStyle.getLineHeightStyle() : null, (33554430 & 4194304) != 0 ? titleLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (33554430 & 8388608) != 0 ? titleLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (33554430 & 16777216) != 0 ? titleLarge.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            a constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconButtonKt.IconButton(aVar2, null, false, null, null, AbstractC2278c.f13153a, composerStartRestartGroup, ((i10 >> 9) & 14) | 196608, 30);
            composerStartRestartGroup.startReplaceGroup(-1199461780);
            if (i5 > 0) {
                Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m713size3ABfNKs(OffsetKt.m628offsetVpY3zN4(boxScopeInstance.align(companion, companion3.getTopEnd()), Dp.m6403constructorimpl(-4), Dp.m6403constructorimpl(4)), Dp.m6403constructorimpl(f5)), Brush.Companion.m3876horizontalGradient8A3gB4$default(companion6, v.S(Color.m3917boximpl(ColorKt.Color(4293870660L)), Color.m3917boximpl(ColorKt.Color(4292617766L))), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
                a constructor3 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                TextKt.m2432Text4IGK_g(String.valueOf(i5), (Modifier) null, companion2.m3964getWhite0d7_KjU(), TextUnitKt.getSp(9), (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(10), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646143, (AbstractC2168g) null), composerStartRestartGroup, 200064, 1572864, 65490);
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(8)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-1676854458);
            if (z5) {
                IconButtonKt.IconButton(aVar, null, false, null, null, AbstractC2278c.f13154b, composerStartRestartGroup, ((i10 >> 6) & 14) | 196608, 30);
            }
            if (p035i0.a.z(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z6 = z5;
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: t3.l
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                    a aVar3 = aVar2;
                    S.a(z6, i5, aVar, aVar3, (Composer) obj, iUpdateChangedFlags, i7);
                    return B3.o.f154a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(SnackbarHostState snackbarHostState, p036i2.e updateManager, b pdfAdMobManager, b quickToolAdMobManager, h authManager, PrintOrderViewModel printOrderViewModel, Composer composer, int i5) {
        int i6;
        i iVar;
        i iVar2;
        int i7;
        MutableState mutableState;
        Composer composer2;
        MutableState mutableState2;
        Object obj;
        Composer composer3;
        o.f(updateManager, "updateManager");
        o.f(pdfAdMobManager, "pdfAdMobManager");
        o.f(quickToolAdMobManager, "quickToolAdMobManager");
        o.f(authManager, "authManager");
        o.f(printOrderViewModel, "printOrderViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1783748082);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(snackbarHostState) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(updateManager) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(pdfAdMobManager) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(quickToolAdMobManager) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(authManager) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i5) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(printOrderViewModel) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i6) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783748082, i6, -1, "com.notescrafter.NotesCrafterContent (MainActivity.kt:329)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            d dVar = Y.f13122w;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ProvidableCompositionLocal providableCompositionLocal = p016d0.b.f10961a;
            composerStartRestartGroup.startReplaceableGroup(-584162872);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-584162872, 6, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
            }
            c0 c0VarF = (c0) composerStartRestartGroup.consume(p016d0.b.f10961a);
            if (c0VarF == null) {
                composerStartRestartGroup.startReplaceableGroup(1382572291);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1382572291, 0, -1, "androidx.lifecycle.viewmodel.compose.findViewTreeViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
                }
                c0VarF = Q.f((View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView()));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (c0VarF == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            boolean z3 = c0VarF instanceof InterfaceC0671j;
            p011c0.c extras = z3 ? ((InterfaceC0671j) c0VarF).c() : p011c0.a.f2531b;
            C2167f c2167fA = F.a(Y.class);
            composerStartRestartGroup.startReplaceableGroup(1673618944);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1673618944, 0, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
            }
            o.f(extras, "extras");
            if (dVar != null) {
                b0 store = c0VarF.e();
                o.f(store, "store");
                iVar2 = new i(store, dVar, extras);
            } else {
                if (z3) {
                    b0 store2 = c0VarF.e();
                    Z factory = ((InterfaceC0671j) c0VarF).b();
                    o.f(store2, "store");
                    o.f(factory, "factory");
                    iVar = new i(store2, factory, extras);
                } else {
                    Z factory2 = z3 ? ((InterfaceC0671j) c0VarF).b() : p019e0.b.f11040a;
                    p011c0.c extras2 = z3 ? ((InterfaceC0671j) c0VarF).c() : p011c0.a.f2531b;
                    o.f(factory2, "factory");
                    o.f(extras2, "extras");
                    iVar = new i(c0VarF.e(), factory2, extras2);
                }
                iVar2 = iVar;
            }
            String strL = p111z2.b.l(c2167fA);
            if (strL == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            X xQ = ((p036i2.e) iVar2.p).q(c2167fA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strL));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Y y4 = (Y) xQ;
            State stateCollectAsState = SnapshotStateKt.collectAsState(authManager.g, null, composerStartRestartGroup, 0, 1);
            String str = ((Boolean) SnapshotStateKt.collectAsState(authManager.t, null, composerStartRestartGroup, 0, 1).getValue()).booleanValue() ? "lifetime" : (String) SnapshotStateKt.collectAsState(authManager.f13533o, null, composerStartRestartGroup, 0, 1).getValue();
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(authManager.q, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(authManager.e, null, composerStartRestartGroup, 0, 1);
            int size = ((List) SnapshotStateKt.collectAsState(printOrderViewModel.f10897h, null, composerStartRestartGroup, 0, 1).getValue()).size();
            Boolean bool = (Boolean) stateCollectAsState3.getValue();
            bool.getClass();
            composerStartRestartGroup.startReplaceGroup(-1148344973);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState3) | composerStartRestartGroup.changedInstance(printOrderViewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2298m(printOrderViewModel, stateCollectAsState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool, (e) objRememberedValue, composerStartRestartGroup, 0);
            Boolean bool2 = (Boolean) stateCollectAsState.getValue();
            bool2.getClass();
            composerStartRestartGroup.startReplaceGroup(-1148340759);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(pdfAdMobManager) | composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(quickToolAdMobManager);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new C2300n(pdfAdMobManager, quickToolAdMobManager, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool2, (e) objRememberedValue2, composerStartRestartGroup, 0);
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(y4.f13126f, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-1148332645);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue3 == companion.getEmpty()) {
                i7 = 2;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("home", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                i7 = 2;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue3;
            Object objK = p076s.b.k(composerStartRestartGroup, -1148327145);
            if (objK == companion.getEmpty()) {
                objK = p076s.b.b(25, null, i7, null, composerStartRestartGroup);
            }
            MutableState mutableState4 = (MutableState) objK;
            Object objK2 = p076s.b.k(composerStartRestartGroup, -1148325226);
            if (objK2 == companion.getEmpty()) {
                objK2 = p076s.b.b(5, null, i7, null, composerStartRestartGroup);
            }
            MutableState mutableState5 = (MutableState) objK2;
            Object objK3 = p076s.b.k(composerStartRestartGroup, -1148323209);
            if (objK3 == companion.getEmpty()) {
                objK3 = p076s.b.b(15, null, i7, null, composerStartRestartGroup);
            }
            MutableState mutableState6 = (MutableState) objK3;
            Object objK4 = p076s.b.k(composerStartRestartGroup, -1148321290);
            if (objK4 == companion.getEmpty()) {
                objK4 = p076s.b.b(4, null, i7, null, composerStartRestartGroup);
            }
            MutableState mutableState7 = (MutableState) objK4;
            Object objK5 = p076s.b.k(composerStartRestartGroup, -1148319418);
            if (objK5 == companion.getEmpty()) {
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m3917boximpl(ColorKt.Color(4280171146L)), null, i7, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            MutableState mutableState8 = (MutableState) objK5;
            composerStartRestartGroup.endReplaceGroup();
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(y4.f13127h, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState6 = SnapshotStateKt.collectAsState(y4.f13129j, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState7 = SnapshotStateKt.collectAsState(y4.f13131l, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState8 = SnapshotStateKt.collectAsState(y4.f13133n, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState9 = SnapshotStateKt.collectAsState(y4.p, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState10 = SnapshotStateKt.collectAsState(y4.f13135r, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState11 = SnapshotStateKt.collectAsState(y4.t, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState12 = SnapshotStateKt.collectAsState(y4.f13137v, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-1148296577);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState9 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue5).getCoroutineScope();
            B3.o oVar = B3.o.f154a;
            composerStartRestartGroup.startReplaceGroup(-1148290267);
            int i8 = i6 & 14;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope) | (i8 == 4) | composerStartRestartGroup.changedInstance(y4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                mutableState = mutableState3;
                composer2 = composerStartRestartGroup;
                objRememberedValue6 = new C2304p(context, coroutineScope, snackbarHostState, y4, mutableState, null);
                composer2.updateRememberedValue(objRememberedValue6);
            } else {
                mutableState = mutableState3;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue6, composer2, 6);
            composer2.startReplaceGroup(-1148268341);
            boolean zChangedInstance3 = composer2.changedInstance(updateManager) | composer2.changedInstance(coroutineScope) | (i8 == 4);
            Object objRememberedValue7 = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new C2309s(updateManager, coroutineScope, snackbarHostState, null);
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue7, composer2, 6);
            String str2 = (String) mutableState.getValue();
            Integer numValueOf = Integer.valueOf(c(stateCollectAsState4));
            composer2.startReplaceGroup(-1148248108);
            boolean zChanged2 = composer2.changed(stateCollectAsState4);
            Object objRememberedValue8 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                mutableState2 = mutableState;
                obj = null;
                objRememberedValue8 = new C2311t(mutableState2, stateCollectAsState4, null);
                composer2.updateRememberedValue(objRememberedValue8);
            } else {
                mutableState2 = mutableState;
                obj = null;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(str2, numValueOf, (e) objRememberedValue8, composer2, 0);
            Log.d("DEBUG", "NotesCrafterApp composed, currentStep=" + ((Number) stateCollectAsState4.getValue()).intValue() + ", currentRoute=" + ((String) mutableState2.getValue()));
            composer3 = composer2;
            p097w3.h.a(null, ComposableLambdaKt.rememberComposableLambda(1221691119, true, new M(size, y4, mutableState2, stateCollectAsState4, snackbarHostState, quickToolAdMobManager, printOrderViewModel, authManager, str, context, stateCollectAsState5, stateCollectAsState6, pdfAdMobManager, stateCollectAsState3, stateCollectAsState2, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, stateCollectAsState, mutableState9, stateCollectAsState11, stateCollectAsState7, stateCollectAsState8, stateCollectAsState9, stateCollectAsState10, stateCollectAsState12), composer3, 54), composer3, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2288h(snackbarHostState, updateManager, pdfAdMobManager, quickToolAdMobManager, authManager, printOrderViewModel, i5, 0));
        }
    }

    public static final int c(State state) {
        return ((Number) state.getValue()).intValue();
    }

    public static final void d(String str, String str2, h hVar, a aVar, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1687408883);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(hVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1687408883, i6, -1, "com.notescrafter.SignInRequiredScreen (MainActivity.kt:1235)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            State stateCollectAsState = SnapshotStateKt.collectAsState(hVar.f13536v, null, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(24));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            p097w3.j.a(SizeKt.fillMaxWidth(companion, 0.9f), 0L, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m6403constructorimpl(8), null, ComposableLambdaKt.rememberComposableLambda(770060792, true, new Q(str, str2, coroutineScope, hVar, context, aVar, stateCollectAsState), composerStartRestartGroup, 54), composer2, 200070, 18);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2294k(str, str2, hVar, aVar, i5, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:111:0x0375  */
    /* JADX WARN: Code duplicated, block: B:112:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0284  */
    /* JADX WARN: Code duplicated, block: B:92:0x0290  */
    /* JADX WARN: Code duplicated, block: B:93:0x0294  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b3  */
    public static final void e(String str, c cVar, Composer composer, int i5) {
        int i6;
        Composer composer2;
        boolean zB;
        boolean z3;
        String str2;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        FontWeight.Companion companion;
        FontWeight medium;
        Color.Companion companion2;
        long jM3926copywmQWz5c$default;
        Composer composer3;
        Composer composer4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-107408662);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(cVar) ? 32 : 16;
        }
        int i7 = i6;
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-107408662, i7, -1, "com.notescrafter.SubHeader (MainActivity.kt:1158)");
            }
            String str3 = "flow";
            String str4 = "how-to-print";
            String str5 = "tools";
            List listS = v.S(new B3.h("FLOW", "flow"), new B3.h("PRINTS", "how-to-print"), new B3.h("TOOLS", "tools"));
            float f5 = 16;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(4));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getBottom(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1010194237);
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                B3.h hVar = (B3.h) it.next();
                String str6 = (String) hVar.f148o;
                String str7 = (String) hVar.p;
                int iHashCode = str7.hashCode();
                if (iHashCode != -1568303688) {
                    if (iHashCode != 3146030) {
                        if (iHashCode == 110545371 && str7.equals(str5)) {
                            zB = o.b(str, str5);
                            z3 = zB;
                        } else {
                            z3 = false;
                        }
                    } else if (str7.equals(str3)) {
                        zB = o.b(str, str3);
                        z3 = zB;
                    } else {
                        z3 = false;
                    }
                } else if (str7.equals(str4)) {
                    zB = o.b(str, str4);
                    z3 = zB;
                } else {
                    z3 = false;
                }
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null);
                Color.Companion companion5 = Color.Companion;
                Modifier modifierClip = ClipKt.clip(BackgroundKt.m206backgroundbw27NRU(modifierWeight$default, z3 ? Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null) : companion5.m3962getTransparent0d7_KjU(), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f5), 0.0f, 0.0f, 12, null)), RoundedCornerShapeKt.m957RoundedCornerShapea9UjIt4$default(Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f5), 0.0f, 0.0f, 12, null));
                composerStartRestartGroup.startReplaceGroup(1133703899);
                boolean zChanged = ((i7 & 112) == 32) | composerStartRestartGroup.changed(str7);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new C2290i(0, (Object) cVar, (Object) str7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                float f6 = 12;
                Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierClip, false, null, null, (a) objRememberedValue, 7, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(f6));
                Alignment.Companion companion6 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN5);
                RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                Iterator it2 = it;
                a constructor3 = companion7.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap2);
                if (composerM3407constructorimpl3.getInserting()) {
                    str2 = str4;
                } else {
                    str2 = str4;
                    if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier2, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion6.getCenterHorizontally(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                    constructor = companion7.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion7.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelLarge();
                    companion = FontWeight.Companion;
                    if (z3) {
                        medium = companion.getBold();
                    } else {
                        medium = companion.getMedium();
                    }
                    FontWeight fontWeight = medium;
                    long sp = TextUnitKt.getSp(1.5d);
                    companion2 = Color.Companion;
                    if (z3) {
                        jM3926copywmQWz5c$default = companion2.m3964getWhite0d7_KjU();
                    } else {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    TextStyle textStyleM5917copyp1EtxEg = labelLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelLarge.spanStyle.m5841getColor0d7_KjU() : jM3926copywmQWz5c$default, (16645977 & 2) != 0 ? labelLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelLarge.spanStyle.getFontWeight() : fontWeight, (16645977 & 8) != 0 ? labelLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : sp, (16645977 & Fields.RotationX) != 0 ? labelLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelLarge.platformStyle : null, (16645977 & 1048576) != 0 ? labelLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelLarge.paragraphStyle.getTextMotion() : null);
                    String str8 = str2;
                    String str9 = str3;
                    int i8 = i7;
                    String str10 = str5;
                    float f7 = f5;
                    composer3 = composerStartRestartGroup;
                    TextKt.m2432Text4IGK_g(str6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer3, 0, 0, 65534);
                    if (z3) {
                        composer4 = composer3;
                        composer4.startReplaceGroup(-1982110261);
                        p076s.b.m(6, companion4, composer4, 6);
                        BoxKt.Box(BackgroundKt.background$default(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion4, Dp.m6403constructorimpl(18)), Dp.m6403constructorimpl(3)), Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), composer4, 0);
                        composer4.endReplaceGroup();
                    } else {
                        composer4 = composer3;
                        composer4.startReplaceGroup(-1981514410);
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(9)), composer4, 6);
                        composer4.endReplaceGroup();
                    }
                    composer4.endNode();
                    composer4.endNode();
                    str3 = str9;
                    composerStartRestartGroup = composer4;
                    rowScopeInstance = rowScopeInstance2;
                    it = it2;
                    str4 = str8;
                    i7 = i8;
                    str5 = str10;
                    f5 = f7;
                }
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier2, companion7.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion6.getCenterHorizontally(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
                constructor = companion7.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap4);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion7.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                TextStyle labelLarge2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelLarge();
                companion = FontWeight.Companion;
                if (z3) {
                    medium = companion.getBold();
                } else {
                    medium = companion.getMedium();
                }
                FontWeight fontWeight2 = medium;
                long sp2 = TextUnitKt.getSp(1.5d);
                companion2 = Color.Companion;
                if (z3) {
                    jM3926copywmQWz5c$default = companion2.m3964getWhite0d7_KjU();
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                TextStyle textStyleM5917copyp1EtxEg2 = labelLarge2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelLarge2.spanStyle.m5841getColor0d7_KjU() : jM3926copywmQWz5c$default, (16645977 & 2) != 0 ? labelLarge2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelLarge2.spanStyle.getFontWeight() : fontWeight2, (16645977 & 8) != 0 ? labelLarge2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelLarge2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelLarge2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelLarge2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelLarge2.spanStyle.m5845getLetterSpacingXSAIIZE() : sp2, (16645977 & Fields.RotationX) != 0 ? labelLarge2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelLarge2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelLarge2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelLarge2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelLarge2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelLarge2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelLarge2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelLarge2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelLarge2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelLarge2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelLarge2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelLarge2.platformStyle : null, (16645977 & 1048576) != 0 ? labelLarge2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelLarge2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelLarge2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelLarge2.paragraphStyle.getTextMotion() : null);
                String str11 = str2;
                String str12 = str3;
                int i9 = i7;
                String str13 = str5;
                float f8 = f5;
                composer3 = composerStartRestartGroup;
                TextKt.m2432Text4IGK_g(str6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg2, composer3, 0, 0, 65534);
                if (z3) {
                    composer4 = composer3;
                    composer4.startReplaceGroup(-1982110261);
                    p076s.b.m(6, companion4, composer4, 6);
                    BoxKt.Box(BackgroundKt.background$default(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion4, Dp.m6403constructorimpl(18)), Dp.m6403constructorimpl(3)), Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), composer4, 0);
                    composer4.endReplaceGroup();
                } else {
                    composer4 = composer3;
                    composer4.startReplaceGroup(-1981514410);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(9)), composer4, 6);
                    composer4.endReplaceGroup();
                }
                composer4.endNode();
                composer4.endNode();
                str3 = str12;
                composerStartRestartGroup = composer4;
                rowScopeInstance = rowScopeInstance2;
                it = it2;
                str4 = str11;
                i7 = i9;
                str5 = str13;
                f5 = f8;
            }
            composer2 = composerStartRestartGroup;
            if (p035i0.a.z(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2292j(i5, 0, str, cVar));
        }
    }

    public static final boolean f(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int g(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int h(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int i(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int j(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long k(MutableState mutableState) {
        return ((Color) mutableState.getValue()).m3937unboximpl();
    }

    public static final List l(State state) {
        return (List) state.getValue();
    }

    public static final p087u3.b m(State state) {
        return (p087u3.b) state.getValue();
    }

    public static final p087u3.e n(State state) {
        return (p087u3.e) state.getValue();
    }

    public static final t o(State state) {
        return (t) state.getValue();
    }

    public static final u p(State state) {
        return (u) state.getValue();
    }

    public static final long q(State state) {
        return ((Number) state.getValue()).longValue();
    }

    public static final int r(State state) {
        return ((Number) state.getValue()).intValue();
    }

    public static final int s(State state) {
        return ((Number) state.getValue()).intValue();
    }
}

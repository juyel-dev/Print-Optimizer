package p102x3;

import C3.C;
import C3.u;
import C3.v;
import O3.c;
import O3.e;
import W.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.ErrorOutlineKt;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.app.R;
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p083t3.C2277b0;
import p083t3.C2283e0;
import p083t3.C2288h;
import p083t3.C2290i;
import p083t3.C2294k;
import p083t3.O;
import p083t3.Z;
import p087u3.m;
import p087u3.q;
import p092v3.h;
import p097w3.j;
import p097w3.n;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Gd {
    public static final void a(String str, List list, boolean z3, Composer composer, int i5) {
        int i6;
        long jM3964getWhite0d7_KjU;
        float f5;
        float f6;
        float f7;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(236845088);
        if ((i5 & 48) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(list) ? 32 : 16) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 145) == 144 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(236845088, i6, -1, "com.notescrafter.ui.screens.A4CoverPage (PrintOrderScreens.kt:2164)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            float fM6403constructorimpl = Dp.m6403constructorimpl(1);
            if (z3) {
                jM3964getWhite0d7_KjU = a.f15986k;
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.4f;
            } else {
                jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.2f;
            }
            float f8 = 12;
            Modifier modifierE = b.e(f8, modifierFillMaxSize$default, fM6403constructorimpl, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f7, 0.0f, f5, f6, 14, null));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.notescrafter_cover_new_template, composerStartRestartGroup, 0), (String) null, b.g(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), f8), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            int i7 = 1;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(new BiasAlignment(0.1188f, 0.0734f), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, 0.7f);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth);
            O3.a constructor3 = companion3.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-68452662);
                TextKt.m2432Text4IGK_g("NO COVER TITLE", (Modifier) null, ColorKt.Color(572596523), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130898);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(-68127317);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String upperCase = ((String) it.next()).toUpperCase();
                    o.e(upperCase, "toUpperCase(...)");
                    TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium();
                    TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, labelMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelMedium.spanStyle.m5841getColor0d7_KjU() : z3 ? a.f15986k : ColorKt.Color(4280361259L), (16645977 & 2) != 0 ? labelMedium.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? labelMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBlack(), (16645977 & 8) != 0 ? labelMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelMedium.spanStyle.getFontFamily() : FontFamily.Companion.getSansSerif(), (16645977 & 64) != 0 ? labelMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(i7), (16645977 & Fields.RotationX) != 0 ? labelMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelMedium.platformStyle : null, (16645977 & 1048576) != 0 ? labelMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelMedium.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65022);
                    b.m(2, Modifier.Companion, composer2, 6);
                    i7 = i7;
                }
                composer2.endReplaceGroup();
            }
            if (S2.b(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2732w5(str, list, z3, i5));
        }
    }

    public static final void b(final String mode, final List savedAddresses, final q currentShipping, final q tempShipping, final boolean z3, final O3.a onDismiss, final c onSelectAddress, final O3.a onAddAnother, final c onTempShippingChange, final O3.a onSaveNewAddress, final c cVar, Composer composer, final int i5, final int i6) {
        int i7;
        int i8;
        Composer composer2;
        o.f(mode, "mode");
        o.f(savedAddresses, "savedAddresses");
        o.f(currentShipping, "currentShipping");
        o.f(tempShipping, "tempShipping");
        o.f(onDismiss, "onDismiss");
        o.f(onSelectAddress, "onSelectAddress");
        o.f(onAddAnother, "onAddAnother");
        o.f(onTempShippingChange, "onTempShippingChange");
        o.f(onSaveNewAddress, "onSaveNewAddress");
        Composer composerStartRestartGroup = composer.startRestartGroup(2125715558);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(mode) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(savedAddresses) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(currentShipping) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(tempShipping) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? Fields.Clip : Fields.Shape;
        }
        if ((i5 & 196608) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onDismiss) ? Fields.RenderEffect : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onSelectAddress) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onAddAnother) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onTempShippingChange) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onSaveNewAddress) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (composerStartRestartGroup.changedInstance(cVar) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i7 & 306783379) == 306783378 && (i8 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2125715558, i7, i8, "com.notescrafter.ui.screens.AddressBottomSheet (PrintOrderScreens.kt:4445)");
            }
            composer2 = composerStartRestartGroup;
            ModalBottomSheetKt.m1969ModalBottomSheetdYc4hso(onDismiss, null, null, 0.0f, null, a.f15993v, 0L, 0.0f, Color.m3926copywmQWz5c$default(Color.Companion.m3953getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), X2.f14640v, null, null, ComposableLambdaKt.rememberComposableLambda(1453157059, true, new C2612oc(mode, tempShipping, SnapshotStateKt.rememberUpdatedState(cVar, composerStartRestartGroup, i8 & 14), onTempShippingChange, onDismiss, z3, onSaveNewAddress, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), savedAddresses, currentShipping, onSelectAddress, onAddAnother), composer2, 54), composer2, ((i7 >> 15) & 14) | 906166272, 384, 3294);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.gc
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i6);
                    O3.a aVar = onSaveNewAddress;
                    c cVar2 = cVar;
                    Gd.b(mode, savedAddresses, currentShipping, tempShipping, z3, onDismiss, onSelectAddress, onAddAnother, onTempShippingChange, aVar, cVar2, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final void c(O3.a aVar, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1779613415);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1779613415, i6, -1, "com.notescrafter.ui.screens.EmptyUploadDropZone (PrintOrderScreens.kt:963)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(16)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            O3.a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            long j5 = a.f15978a;
            j.a(modifierFillMaxWidth$default2, Color.m3926copywmQWz5c$default(j5, 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, X2.e, composerStartRestartGroup, 197046, 24);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1739842485);
            boolean z3 = (i6 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new O(10, aVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            j.a(ClickableKt.m242clickableXHw0xAI$default(modifierFillMaxWidth$default3, false, null, null, (O3.a) objRememberedValue, 7, null), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(a.f15980c, 0.25f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, X2.f14629f, composerStartRestartGroup, 197040, 24);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2590n6(i5, 2, aVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0288  */
    /* JADX WARN: Code duplicated, block: B:77:0x0293  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void d(final long j5, final String str, final String str2, long j6, Composer composer, final int i5, final int i6) {
        int i7;
        long j7;
        long j8;
        int currentCompositeKeyHash;
        O3.a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        int currentCompositeKeyHash2;
        O3.a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1622005912);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(j5) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i8 = i6 & 8;
        if (i8 == 0) {
            if ((i5 & 3072) == 0) {
                j7 = j6;
                i7 |= composerStartRestartGroup.changed(j7) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i7 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i8 != 0) {
                    j8 = a.p;
                } else {
                    j8 = j7;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1622005912, i7, -1, "com.notescrafter.ui.screens.IncludedSpecItem (PrintOrderScreens.kt:1235)");
                }
                Alignment.Companion companion = Alignment.Companion;
                Alignment.Vertical top = companion.getTop();
                Modifier.Companion companion2 = Modifier.Companion;
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), top, composerStartRestartGroup, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                constructor = companion3.getConstructor();
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
                eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(OffsetKt.m629offsetVpY3zN4$default(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(6)), 0.0f, Dp.m6403constructorimpl(5), 1, null), RoundedCornerShapeKt.getCircleShape()), j5, null, 2, null), composerStartRestartGroup, 0);
                androidx.compose.foundation.text.modifiers.a.q(10, companion2, composerStartRestartGroup, 6);
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i9 = MaterialTheme.$stable;
                TextStyle bodySmall = materialTheme.getTypography(composerStartRestartGroup, i9).getBodySmall();
                TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(13), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, (i7 >> 3) & 14, 0, 65534);
                TextStyle bodySmall2 = materialTheme.getTypography(composerStartRestartGroup, i9).getBodySmall();
                TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : j8, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, (i7 >> 6) & 14, 0, 65534);
                if (androidx.compose.foundation.text.modifiers.a.w(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                j7 = j8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final long j9 = j7;
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.fc
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        String str3 = str;
                        String str4 = str2;
                        long j10 = j9;
                        Gd.d(j5, str3, str4, j10, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 3072;
        j7 = j6;
        if ((i7 & 1171) == 1170) {
            if (i8 != 0) {
                j8 = a.p;
            } else {
                j8 = j7;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1622005912, i7, -1, "com.notescrafter.ui.screens.IncludedSpecItem (PrintOrderScreens.kt:1235)");
            }
            Alignment.Companion companion4 = Alignment.Companion;
            Alignment.Vertical top2 = companion4.getTop();
            Modifier.Companion companion5 = Modifier.Companion;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), top2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion5);
            ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
            constructor = companion6.getConstructor();
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
            eVarG = p035i0.a.g(companion6, composerM3407constructorimpl, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap3);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion6.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(OffsetKt.m629offsetVpY3zN4$default(SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(6)), 0.0f, Dp.m6403constructorimpl(5), 1, null), RoundedCornerShapeKt.getCircleShape()), j5, null, 2, null), composerStartRestartGroup, 0);
            androidx.compose.foundation.text.modifiers.a.q(10, companion5, composerStartRestartGroup, 6);
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance2, companion5, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
            constructor2 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG2 = p035i0.a.g(companion6, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap4);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier4, companion6.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            TextStyle bodySmall3 = materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall();
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(13), (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, (i7 >> 3) & 14, 0, 65534);
            TextStyle bodySmall4 = materialTheme2.getTypography(composerStartRestartGroup, i10).getBodySmall();
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : j8, (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, (i7 >> 6) & 14, 0, 65534);
            if (androidx.compose.foundation.text.modifiers.a.w(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            j7 = j8;
        } else {
            if (i8 != 0) {
                j8 = a.p;
            } else {
                j8 = j7;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1622005912, i7, -1, "com.notescrafter.ui.screens.IncludedSpecItem (PrintOrderScreens.kt:1235)");
            }
            Alignment.Companion companion7 = Alignment.Companion;
            Alignment.Vertical top3 = companion7.getTop();
            Modifier.Companion companion8 = Modifier.Companion;
            Arrangement arrangement3 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.getStart(), top3, composerStartRestartGroup, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion8);
            ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
            constructor = companion9.getConstructor();
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
            eVarG = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap5);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion9.getSetModifier());
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(OffsetKt.m629offsetVpY3zN4$default(SizeKt.m713size3ABfNKs(companion8, Dp.m6403constructorimpl(6)), 0.0f, Dp.m6403constructorimpl(5), 1, null), RoundedCornerShapeKt.getCircleShape()), j5, null, 2, null), composerStartRestartGroup, 0);
            androidx.compose.foundation.text.modifiers.a.q(10, companion8, composerStartRestartGroup, 6);
            Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance3, companion8, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default3);
            constructor2 = companion9.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap6);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier6, companion9.getSetModifier());
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            TextStyle bodySmall5 = materialTheme3.getTypography(composerStartRestartGroup, i11).getBodySmall();
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall5.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall5.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(13), (16645977 & 4) != 0 ? bodySmall5.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall5.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall5.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, (i7 >> 3) & 14, 0, 65534);
            TextStyle bodySmall6 = materialTheme3.getTypography(composerStartRestartGroup, i11).getBodySmall();
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall6.spanStyle.m5841getColor0d7_KjU() : j8, (16645977 & 2) != 0 ? bodySmall6.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall6.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall6.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall6.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, (i7 >> 6) & 14, 0, 65534);
            if (androidx.compose.foundation.text.modifiers.a.w(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            j7 = j8;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j10 = j7;
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.fc
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    String str3 = str;
                    String str4 = str2;
                    long j11 = j10;
                    Gd.d(j5, str3, str4, j11, (Composer) obj, iUpdateChangedFlags, i6);
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final void e(List list, boolean z3, String str, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        long jM3964getWhite0d7_KjU;
        float f5;
        float f6;
        float f7;
        Composer composerStartRestartGroup = composer.startRestartGroup(976594681);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(976594681, i6, -1, "com.notescrafter.ui.screens.LiveNotebookCoverShowcase (PrintOrderScreens.kt:1982)");
            }
            composer2 = composerStartRestartGroup;
            Modifier modifierM629offsetVpY3zN4$default = OffsetKt.m629offsetVpY3zN4$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("levitate", composerStartRestartGroup, 6, 0), -8.0f, 8.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2500, 0, EasingFunctionsKt.getEaseInOutSine(), 2, null), RepeatMode.Reverse, 0L, 4, null), "offset", composerStartRestartGroup, InfiniteTransition.$stable | 24960 | (InfiniteRepeatableSpec.$stable << 9), 0).getValue().floatValue()), 1, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM629offsetVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            O3.a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            float f8 = 12;
            Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(OffsetKt.m629offsetVpY3zN4$default(boxScopeInstance.align(companion3, companion.getBottomCenter()), 0.0f, Dp.m6403constructorimpl(f8), 1, null), Dp.m6403constructorimpl(180)), Dp.m6403constructorimpl(f8));
            float fM6403constructorimpl = Dp.m6403constructorimpl(20);
            RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
            Color.Companion companion4 = Color.Companion;
            BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs, fM6403constructorimpl, circleShape, false, Color.m3926copywmQWz5c$default(companion4.m3953getBlack0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion4.m3953getBlack0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), 4, null), Color.m3926copywmQWz5c$default(companion4.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
            Modifier modifierAlign = boxScopeInstance.align(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight(companion3, 0.85f), 0.70711356f, false, 2, null), companion.getCenter());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierAlign);
            O3.a constructor2 = companion2.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            float f9 = 1;
            BoxKt.Box(b.e(f8, BackgroundKt.m207backgroundbw27NRU$default(b.g(OffsetKt.m629offsetVpY3zN4$default(RotateKt.rotate(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 3.0f), Dp.m6403constructorimpl(6), 0.0f, 2, null), f8), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f9), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), composer2, 0);
            BoxKt.Box(b.e(f8, BackgroundKt.m207backgroundbw27NRU$default(b.g(OffsetKt.m629offsetVpY3zN4$default(RotateKt.rotate(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 1.0f), Dp.m6403constructorimpl(3), 0.0f, 2, null), f8), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f9), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), composer2, 0);
            Modifier modifierG = b.g(RotateKt.rotate(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), -1.0f), f8);
            float fM6403constructorimpl2 = Dp.m6403constructorimpl(f9);
            if (z3) {
                jM3964getWhite0d7_KjU = a.f15986k;
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.4f;
            } else {
                jM3964getWhite0d7_KjU = companion4.m3964getWhite0d7_KjU();
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.2f;
            }
            Modifier modifierE = b.e(f8, modifierG, fM6403constructorimpl2, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f7, 0.0f, f5, f6, 14, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierE);
            O3.a constructor3 = companion2.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion2, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.notescrafter_cover_new_template, composer2, 0), (String) null, b.g(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), f8), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
            int i7 = 1;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(new BiasAlignment(0.1188f, 0.0734f), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
            O3.a constructor4 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
            e eVarG4 = p035i0.a.g(companion2, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap4);
            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion3, 0.7f);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth);
            O3.a constructor5 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
            e eVarG5 = p035i0.a.g(companion2, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap5);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (list.isEmpty()) {
                composer2.startReplaceGroup(-1954301054);
                TextKt.m2432Text4IGK_g("NO COVER TITLE", (Modifier) null, ColorKt.Color(572596523), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782982, 0, 130898);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1953910485);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String upperCase = ((String) it.next()).toUpperCase();
                    o.e(upperCase, "toUpperCase(...)");
                    TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium();
                    TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, labelMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelMedium.spanStyle.m5841getColor0d7_KjU() : z3 ? a.f15986k : ColorKt.Color(4280361259L), (16645977 & 2) != 0 ? labelMedium.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? labelMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBlack(), (16645977 & 8) != 0 ? labelMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelMedium.spanStyle.getFontFamily() : FontFamily.Companion.getSansSerif(), (16645977 & 64) != 0 ? labelMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(i7), (16645977 & Fields.RotationX) != 0 ? labelMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelMedium.platformStyle : null, (16645977 & 1048576) != 0 ? labelMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelMedium.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65022);
                    b.m(2, Modifier.Companion, composer2, 6);
                    i7 = i7;
                }
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer2.endNode();
            composer2.startReplaceGroup(999572877);
            if (str != null) {
                Modifier.Companion companion5 = Modifier.Companion;
                Alignment.Companion companion6 = Alignment.Companion;
                Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(boxScopeInstance.align(companion5, companion6.getBottomEnd()), Dp.m6403constructorimpl(f8));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
                ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                O3.a constructor6 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                e eVarG6 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl6, currentCompositionLocalMap6);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion7.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                IconKt.m1877Iconww6aTOc(ErrorOutlineKt.getErrorOutline(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(16)), a.f15986k, composer2, 3504, 0);
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2519j(list, z3, str, modifier, i5, 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x06b1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(m item, PrintOrderViewModel viewModel, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(item, "item");
        o.f(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-276968778);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(item) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(viewModel) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-276968778, i6, -1, "com.notescrafter.ui.screens.NativePDFPageSlider (PrintOrderScreens.kt:2222)");
            }
            String localPath = item.getLocalPath();
            Z zI = PrintOrderViewModel.i(item.getName());
            boolean z3 = W3.j.I0(item.getName()).toString().length() == 0 || zI.f13140b != null || zI.f13141c;
            composerStartRestartGroup.startReplaceGroup(756878144);
            boolean zChanged = composerStartRestartGroup.changed(localPath);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C.f167o, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(756880907);
            boolean zChanged2 = composerStartRestartGroup.changed(localPath);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(756885121);
            boolean zChanged3 = composerStartRestartGroup.changed(localPath) | composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new C2675sc(localPath, mutableState2, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(localPath, (e) objRememberedValue3, composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            O3.a constructor = companion2.getConstructor();
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
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-162279283);
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                O3.a constructor2 = companion2.getConstructor();
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
                e eVarG2 = p035i0.a.g(companion2, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(36)), a.f15980c, Dp.m6403constructorimpl(3), 0L, 0, composerStartRestartGroup, 438, 24);
                b.m(12, companion3, composerStartRestartGroup, 6);
                TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall();
                TextKt.m2432Text4IGK_g("Loading dynamic preview...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (((List) mutableState.getValue()).isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(-161560765);
                    Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    Modifier.Companion companion4 = Modifier.Companion;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally2, composerStartRestartGroup, 54);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                    O3.a constructor3 = companion2.getConstructor();
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
                    e eVarG3 = p035i0.a.g(companion2, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ImageVector info = InfoKt.getInfo(Icons.Outlined.INSTANCE);
                    long j5 = a.p;
                    IconKt.m1877Iconww6aTOc(info, (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(32)), Color.m3926copywmQWz5c$default(j5, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 3504, 0);
                    b.m(8, companion4, composerStartRestartGroup, 6);
                    TextStyle bodySmall2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall();
                    TextKt.m2432Text4IGK_g("Preview is syncing...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(j5, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-160686968);
                    composerStartRestartGroup.startReplaceGroup(687551056);
                    boolean zChanged4 = composerStartRestartGroup.changed(mutableState);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new Bb(4, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (O3.a) objRememberedValue4, composerStartRestartGroup, 0, 3);
                    Modifier.Companion companion5 = Modifier.Companion;
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default3);
                    O3.a constructor4 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG4 = p035i0.a.g(companion2, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                    Modifier modifierWeight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    O3.a constructor5 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG5 = p035i0.a.g(companion2, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                    composer2 = composerStartRestartGroup;
                    PagerKt.m907HorizontalPageroI3XNZo(pagerStateRememberPagerState, SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), PaddingKt.m663PaddingValuesYgX7TsA$default(Dp.m6403constructorimpl(48), 0.0f, 2, null), null, 0, Dp.m6403constructorimpl(16), null, null, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1780165506, true, new C2707uc(pagerStateRememberPagerState, item, zI, z3, mutableState), composerStartRestartGroup, 54), composer2, 197040, 3072, 8152);
                    composer2.endNode();
                    float f5 = 12;
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion5, Dp.m6403constructorimpl(f5)), composer2, 6);
                    Modifier modifierClip = ClipKt.clip(companion5, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f5)));
                    Color.Companion companion6 = Color.Companion;
                    Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(14), Dp.m6403constructorimpl(6));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
                    O3.a constructor6 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                    e eVarG6 = p035i0.a.g(companion2, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl6, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion2.getSetModifier());
                    String strM = pagerStateRememberPagerState.getCurrentPage() == 0 ? "COVER PAGE" : p035i0.a.m("PAGE ", " OF ", pagerStateRememberPagerState.getCurrentPage(), ((List) mutableState.getValue()).size());
                    TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall();
                    TextKt.m2432Text4IGK_g(strM, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : FontWeight.Companion.getBlack(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer2, 0, 0, 65534);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a(item, viewModel, modifier, i5, 5));
        }
    }

    public static final void g(m mVar, PrintOrderViewModel printOrderViewModel, String str, O3.a aVar, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1519997345);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(mVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(printOrderViewModel) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1519997345, i6, -1, "com.notescrafter.ui.screens.NotebookConfiguratorCard (PrintOrderScreens.kt:1298)");
            }
            String name = mVar.getName();
            printOrderViewModel.getClass();
            Z zI = PrintOrderViewModel.i(name);
            boolean z3 = W3.j.I0(mVar.getName()).toString().length() == 0 || zI.f13140b != null || zI.f13141c;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1202993125);
            boolean zChanged = composerStartRestartGroup.changed(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = h.f13519y.p(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            B3.h hVar = (B3.h) ((Map) SnapshotStateKt.collectAsState(((h) objRememberedValue).f13538x, null, composerStartRestartGroup, 0, 1).getValue()).get(str == null ? "guest" : str);
            if (hVar == null) {
                hVar = new B3.h(Double.valueOf(1.25d), Double.valueOf(3.35d));
            }
            composer2 = composerStartRestartGroup;
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1369657892, true, new Bc(printOrderViewModel, mVar, aVar, z3, zI, str, ((Number) hVar.f148o).doubleValue(), ((Number) hVar.p).doubleValue()), composerStartRestartGroup, 54), composer2, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2294k(mVar, printOrderViewModel, str, aVar, i5));
        }
    }

    public static final void h(O3.a aVar, c cVar, O3.a aVar2, Composer composer, int i5) {
        File[] fileArrListFiles;
        Composer composerStartRestartGroup = composer.startRestartGroup(-424405900);
        int i6 = (i5 & 6) == 0 ? (composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(cVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-424405900, i6, -1, "com.notescrafter.ui.screens.PdfSourcePickerDialog (PrintOrderScreens.kt:759)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(983579170);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                File file = new File(context.getExternalFilesDir(null), "NotesCrafterFiles");
                boolean zExists = file.exists();
                C c5 = C.f167o;
                if (!zExists || (fileArrListFiles = file.listFiles()) == null) {
                    objRememberedValue = c5;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles) {
                        if (file2.isFile()) {
                            String lowerCase = M3.a.y(file2).toLowerCase(Locale.ROOT);
                            o.e(lowerCase, "toLowerCase(...)");
                            if (lowerCase.equals("pdf")) {
                                arrayList.add(file2);
                            }
                        }
                    }
                    objRememberedValue = u.D0(arrayList, new N3(3));
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            n.a(aVar, null, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1731506785, true, new Cc((List) objRememberedValue, aVar2, aVar, cVar), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 14) | 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p097w3.a((Object) aVar, (Object) cVar, (Object) aVar2, i5, 6));
        }
    }

    public static final void i(String str, String str2, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2043216209);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i7 = i6;
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2043216209, i7, -1, "com.notescrafter.ui.screens.PriceRow (PrintOrderScreens.kt:1266)");
            }
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(3), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            O3.a constructor = companion.getConstructor();
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
            e eVarG = p035i0.a.g(companion, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i8 = MaterialTheme.$stable;
            TextStyle bodySmall = materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall();
            Color.Companion companion2 = Color.Companion;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(12), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, i7 & 14, 0, 65534);
            TextStyle bodySmall2 = materialTheme.getTypography(composerStartRestartGroup, i8).getBodySmall();
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(12), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : FontWeight.Companion.getMedium(), (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer2, (i7 >> 3) & 14, 0, 65534);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2683t4(str, str2, i5, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(PrintOrderViewModel viewModel, String str, O3.a onNavigateBack, O3.a onOrderComplete, Modifier modifier, Composer composer, int i5) {
        int i6;
        double d4;
        Modifier.Companion companion;
        Composer composer2;
        Modifier modifier2;
        o.f(viewModel, "viewModel");
        o.f(onNavigateBack, "onNavigateBack");
        o.f(onOrderComplete, "onOrderComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(731142664);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onNavigateBack) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onOrderComplete) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i7 = i6 | 24576;
        if ((i7 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(731142664, i7, -1, "com.notescrafter.ui.screens.PrintOrderCheckoutScreen (PrintOrderScreens.kt:3319)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(viewModel.f10897h, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(viewModel.f10899j, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(viewModel.f10885X, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(viewModel.f10887Z, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(viewModel.f10890b0, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-1972625090);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objK = b.k(composerStartRestartGroup, -1972623039);
            if (objK == companion3.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -1972621155);
            if (objK2 == companion3.getEmpty()) {
                objK2 = b.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -1972618367);
            if (objK3 == companion3.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            MutableState mutableState4 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -1972616450);
            if (objK4 == companion3.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            MutableState mutableState5 = (MutableState) objK4;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(F3.j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            double dJ = viewModel.j(str);
            State stateCollectAsState6 = SnapshotStateKt.collectAsState(viewModel.f10903n, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState7 = SnapshotStateKt.collectAsState(viewModel.p, null, composerStartRestartGroup, 0, 1);
            double dH = viewModel.h(str);
            if (((C2283e0) stateCollectAsState3.getValue()) != null) {
                C2283e0 c2283e0 = (C2283e0) stateCollectAsState3.getValue();
                o.c(c2283e0);
                d4 = c2283e0.f13163b / 100.0d;
            } else {
                d4 = 0.0d;
            }
            double d5 = dH - d4;
            if (d5 < 0.0d) {
                d5 = 0.0d;
            }
            String fullName = ((q) stateCollectAsState2.getValue()).getFullName();
            if (W3.j.m0(fullName)) {
                fullName = W3.j.I0(((q) stateCollectAsState2.getValue()).getFirstName() + " " + ((q) stateCollectAsState2.getValue()).getLastName()).toString();
            }
            String str2 = fullName;
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("processing", composerStartRestartGroup, 6, 0);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1200, 0, EasingKt.getLinearEasing(), 2, null);
            RepeatMode repeatMode = RepeatMode.Restart;
            InfiniteRepeatableSpec infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default = AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(tweenSpecTween$default, repeatMode, 0L, 4, null);
            int i8 = InfiniteTransition.$stable;
            int i9 = InfiniteRepeatableSpec.$stable << 9;
            double d6 = d5;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 360.0f, infiniteRepeatableSpecM107infiniteRepeatable9IiC70o$default, "rotation", composerStartRestartGroup, i8 | 25008 | i9, 0);
            State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, -1.0f, 2.0f, AnimationSpecKt.m107infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2500, 0, EasingKt.getLinearEasing(), 2, null), repeatMode, 0L, 4, null), "shimmer", composerStartRestartGroup, i8 | 24960 | i9, 0);
            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1020079308);
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), a.e, null, 2, null);
                Alignment.Companion companion4 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                O3.a constructor = companion5.getConstructor();
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
                e eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f5 = 32;
                Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion4.getCenterHorizontally(), composerStartRestartGroup, 54);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
                O3.a constructor2 = companion5.getConstructor();
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
                e eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(80)), RoundedCornerShapeKt.getCircleShape());
                Brush.Companion companion6 = Brush.Companion;
                Modifier modifierBackground$default = BackgroundKt.background$default(modifierClip, Brush.Companion.m3880radialGradientP_VxKs$default(companion6, v.S(Color.m3917boximpl(a.f15984i), Color.m3917boximpl(ColorKt.Color(4279548070L))), 0L, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
                O3.a constructor3 = companion5.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                ImageVector check = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                Color.Companion companion7 = Color.Companion;
                float f6 = 40;
                IconKt.m1877Iconww6aTOc(check, "Success", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion7.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                b.n(composerStartRestartGroup, f5, companion2, composerStartRestartGroup, 6);
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i10 = MaterialTheme.$stable;
                TextStyle headlineMedium = materialTheme.getTypography(composerStartRestartGroup, i10).getHeadlineMedium();
                long jM3964getWhite0d7_KjU = companion7.m3964getWhite0d7_KjU();
                FontWeight.Companion companion8 = FontWeight.Companion;
                TextKt.m2432Text4IGK_g("Order Placed! 🎉", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineMedium.spanStyle.m5841getColor0d7_KjU() : jM3964getWhite0d7_KjU, (16645977 & 2) != 0 ? headlineMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineMedium.spanStyle.getFontWeight() : companion8.getExtraBold(), (16645977 & 8) != 0 ? headlineMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineMedium.platformStyle : null, (16645977 & 1048576) != 0 ? headlineMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 6, 0, 65534);
                b.m(12, companion2, composerStartRestartGroup, 6);
                TextStyle bodyMedium = materialTheme.getTypography(composerStartRestartGroup, i10).getBodyMedium();
                TextKt.m2432Text4IGK_g("Your notebooks are queued for printing. You'll receive a confirmation and tracking link shortly.", PaddingKt.m670paddingVpY3zN4$default(companion2, Dp.m6403constructorimpl(8), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : TextAlign.Companion.m6292getCentere0LSkKk(), (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : TextUnitKt.getSp(22), (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 54, 0, 65532);
                b.m(f5, companion2, composerStartRestartGroup, 6);
                j.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(38793924, true, new Dc(mutableState5, d6), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                b.m(f6, companion2, composerStartRestartGroup, 6);
                Modifier modifierBackground$default2 = BackgroundKt.background$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(52)), 16), Brush.Companion.m3876horizontalGradient8A3gB4$default(companion6, v.S(Color.m3917boximpl(a.f15978a), Color.m3917boximpl(a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                composerStartRestartGroup.startReplaceGroup(1906623732);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel) | ((i7 & 7168) == 2048);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion3.getEmpty()) {
                    objRememberedValue3 = new C2290i(20, viewModel, onOrderComplete);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierBackground$default2, false, null, null, (O3.a) objRememberedValue3, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM242clickableXHw0xAI$default);
                O3.a constructor4 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG4 = p035i0.a.g(companion5, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                TextKt.m2432Text4IGK_g("Back to Home", (Modifier) null, companion7.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, companion8.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 196998, 0, 131034);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                companion = companion2;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1013901256);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(-1972426664);
                boolean zChanged = composerStartRestartGroup.changed(density);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue4 == companion3.getEmpty()) {
                    objRememberedValue4 = DensityKt.Density(density.getDensity(), Q3.a.o(density.getFontScale(), 1.15f));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                ProvidedValue<Density> providedValueProvides = CompositionLocalsKt.getLocalDensity().provides((Density) objRememberedValue4);
                companion = companion2;
                Tc tc = new Tc(companion2, coroutineScope, viewModel, stateCollectAsState, mutableState2, mutableState3, mutableState5, mutableState4, stateAnimateFloat2, d6, onNavigateBack, str, str2, stateCollectAsState2, dJ, stateCollectAsState7, stateCollectAsState6, stateCollectAsState3, d4, stateCollectAsState5, dH, stateCollectAsState4, mutableState, stateAnimateFloat);
                composer2 = composerStartRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-231646100, true, tc, composer2, 54), composer2, ProvidedValue.$stable | 48);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2516ic(viewModel, str, onNavigateBack, onOrderComplete, modifier2, i5, 0));
        }
    }

    public static final void k(PrintOrderViewModel viewModel, String str, O3.a onNavigateBack, O3.a onContinue, O3.a aVar, Modifier modifier, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Modifier modifier2;
        o.f(viewModel, "viewModel");
        o.f(onNavigateBack, "onNavigateBack");
        o.f(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1761389076);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onNavigateBack) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onContinue) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar) ? Fields.Clip : Fields.Shape;
        }
        int i7 = i6 | 196608;
        if ((74899 & i7) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1761389076, i7, -1, "com.notescrafter.ui.screens.PrintOrderShippingScreen (PrintOrderScreens.kt:2411)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(viewModel.f10899j, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(viewModel.f10897h, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState3 = SnapshotStateKt.collectAsState(viewModel.f10905r, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState4 = SnapshotStateKt.collectAsState(viewModel.t, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState5 = SnapshotStateKt.collectAsState(viewModel.f10907v, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState6 = SnapshotStateKt.collectAsState(viewModel.f10871J, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState7 = SnapshotStateKt.collectAsState(viewModel.f10903n, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState8 = SnapshotStateKt.collectAsState(viewModel.p, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState9 = SnapshotStateKt.collectAsState(viewModel.f10901l, null, composerStartRestartGroup, 0, 1);
            String fullName = ((q) stateCollectAsState.getValue()).getFullName();
            if (W3.j.m0(fullName)) {
                fullName = W3.j.I0(((q) stateCollectAsState.getValue()).getFirstName() + " " + ((q) stateCollectAsState.getValue()).getLastName()).toString();
            }
            String str2 = fullName;
            double dJ = viewModel.j(str);
            double dH = viewModel.h(str);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1154503287);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objK = b.k(composerStartRestartGroup, -1154501494);
            if (objK == companion2.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("list", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -1154497545);
            if (objK2 == companion2.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new q(null, null, null, null, null, null, null, null, null, null, null, null, false, null, 16383, null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -1154495127);
            if (objK3 == companion2.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            MutableState mutableState4 = (MutableState) objK3;
            composerStartRestartGroup.endReplaceGroup();
            boolean z3 = W3.j.I0(str2).toString().length() > 0 && W3.j.I0(((q) stateCollectAsState.getValue()).getFlatHouse()).toString().length() > 0 && W3.j.I0(((q) stateCollectAsState.getValue()).getAreaStreet()).toString().length() > 0 && W3.j.I0(((q) stateCollectAsState.getValue()).getLandmark()).toString().length() > 0 && W3.j.I0(((q) stateCollectAsState.getValue()).getCity()).toString().length() > 0 && W3.j.I0(((q) stateCollectAsState.getValue()).getState()).toString().length() > 0 && ((q) stateCollectAsState.getValue()).getPostalCode().length() == 6 && ((q) stateCollectAsState.getValue()).getPhone().length() >= 10 && ((q) stateCollectAsState.getValue()).isPhoneVerified();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(-1154477312);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = DensityKt.Density(density.getDensity(), Q3.a.o(density.getFontScale(), 1.15f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ProvidedValue<Density> providedValueProvides = CompositionLocalsKt.getLocalDensity().provides((Density) objRememberedValue2);
            composer2 = composerStartRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-1884755284, true, new C2581md(companion, viewModel, stateCollectAsState, context, z3, onContinue, str2, onNavigateBack, aVar, stateCollectAsState3, stateCollectAsState4, stateCollectAsState5, stateCollectAsState6, stateCollectAsState2, str, dJ, stateCollectAsState8, stateCollectAsState7, dH, mutableState2, mutableState, mutableState3, stateCollectAsState9, mutableState4), composer2, 54), composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2288h(viewModel, str, onNavigateBack, onContinue, aVar, modifier2, i5));
        }
    }

    public static final void l(PrintOrderViewModel viewModel, String str, O3.a onNavigateBack, O3.a onContinue, Modifier modifier, Composer composer, int i5) {
        PDFProcessor pDFProcessor;
        boolean z3;
        Composer composer2;
        Modifier modifier2;
        o.f(viewModel, "viewModel");
        o.f(onNavigateBack, "onNavigateBack");
        o.f(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(640000877);
        int i6 = (i5 & 6) == 0 ? (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onNavigateBack) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onContinue) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i7 = i6 | 24576;
        if ((i7 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(640000877, i7, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen (PrintOrderScreens.kt:116)");
            }
            B3.o oVar = B3.o.f154a;
            composerStartRestartGroup.startReplaceGroup(1915147171);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2597nd(viewModel, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue, composerStartRestartGroup, 6);
            State stateCollectAsState = SnapshotStateKt.collectAsState(viewModel.f10897h, null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(viewModel.f10909x, null, composerStartRestartGroup, 0, 1);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = AbstractC1421mz.e(EffectsKt.createCompositionCoroutineScope(F3.j.f418o, composerStartRestartGroup), composerStartRestartGroup);
            }
            InterfaceC0200y coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            composerStartRestartGroup.startReplaceGroup(1915155989);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new PDFProcessor(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            PDFProcessor pDFProcessor2 = (PDFProcessor) objRememberedValue3;
            Object objK = b.k(composerStartRestartGroup, 1915159012);
            if (objK == companion2.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, 1915161340);
            if (objK2 == companion2.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState2 = (MutableState) objK2;
            composerStartRestartGroup.endReplaceGroup();
            A a5 = new A(1);
            composerStartRestartGroup.startReplaceGroup(1915165056);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changedInstance(pDFProcessor2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion2.getEmpty()) {
                pDFProcessor = pDFProcessor2;
                C2476g4 c2476g4 = new C2476g4(context, coroutineScope, viewModel, pDFProcessor, mutableState);
                composerStartRestartGroup.updateRememberedValue(c2476g4);
                objRememberedValue4 = c2476g4;
            } else {
                pDFProcessor = pDFProcessor2;
            }
            composerStartRestartGroup.endReplaceGroup();
            l lVarV = p000a.a.v(a5, (c) objRememberedValue4, composerStartRestartGroup);
            int iK = viewModel.k();
            int copies = 0;
            for (m mVar : (Iterable) viewModel.g.getValue()) {
                copies += mVar.getCopies() * mVar.getPages();
            }
            double dJ = viewModel.j(str);
            boolean z4 = iK > 10;
            boolean z5 = copies < 100;
            composerStartRestartGroup.startReplaceGroup(1915178843);
            if (((List) stateCollectAsState.getValue()).isEmpty()) {
                z3 = true;
                break;
            }
            List list = (List) stateCollectAsState.getValue();
            composerStartRestartGroup.startReplaceGroup(1915180021);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewModel);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new C2277b0(viewModel, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            c cVar = (c) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Boolean) cVar.invoke(it.next())).booleanValue()) {
                        z3 = true;
                        break;
                    }
                } else {
                    z3 = false;
                    break;
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(1915188051);
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = DensityKt.Density(density.getDensity(), Q3.a.o(density.getFontScale(), 1.15f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides((Density) objRememberedValue6), ComposableLambdaKt.rememberComposableLambda(-520857555, true, new C2788zd(companion, context, coroutineScope, viewModel, pDFProcessor, lVarV, stateCollectAsState, copies, z5, dJ, str, iK, z3, z4, onContinue, onNavigateBack, stateCollectAsState2, mutableState, mutableState2), composer2, 54), composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2516ic(viewModel, str, onNavigateBack, onContinue, modifier2, i5, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:78:0x0117  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x0306  */
    /* JADX WARN: Code duplicated, block: B:87:0x0312  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void m(final String str, final String str2, final c cVar, boolean z3, int i5, final ImageVector imageVector, Composer composer, final int i6, final int i7) {
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        boolean z5;
        int iM6129getTextPjHm6EE;
        int currentCompositeKeyHash;
        O3.a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-673160783);
        if ((i6 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(cVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i13 = i7 & 8;
        if (i13 == 0) {
            if ((i6 & 3072) == 0) {
                z4 = z3;
                i8 |= composerStartRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
            }
            i9 = i7 & 16;
            if (i9 != 0) {
                if ((i6 & 24576) == 0) {
                    i10 = i5;
                    if (composerStartRestartGroup.changed(i10)) {
                        i11 = Fields.Clip;
                    } else {
                        i11 = Fields.Shape;
                    }
                    i8 |= i11;
                }
                if ((196608 & i6) == 0) {
                    if (composerStartRestartGroup.changed(imageVector)) {
                        i12 = Fields.RenderEffect;
                    } else {
                        i12 = 65536;
                    }
                    i8 |= i12;
                }
                if ((74899 & i8) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (i13 != 0) {
                        z5 = false;
                    } else {
                        z5 = z4;
                    }
                    if (i9 != 0) {
                        iM6129getTextPjHm6EE = KeyboardType.Companion.m6129getTextPjHm6EE();
                    } else {
                        iM6129getTextPjHm6EE = i10;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-673160783, i8, -1, "com.notescrafter.ui.screens.ShippingTextField (PrintOrderScreens.kt:3270)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    constructor = companion2.getConstructor();
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
                    eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                    if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    o.e(upperCase, "toUpperCase(...)");
                    TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                    int i14 = i8;
                    TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, iM6129getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                    Color.Companion companion3 = Color.Companion;
                    int i15 = i14 >> 3;
                    OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), !z5, false, (TextStyle) null, (e) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-547759489, true, new Ad(imageVector), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), outlinedTextFieldDefaults.m2076colors0hiis_0(companion3.m3964getWhite0d7_KjU(), companion3.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion3.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion3.m3953getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, a.f15978a, Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095), composerStartRestartGroup, (i15 & 14) | 100663680 | (i15 & 112), 12582912, 0, 1933040);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i10 = iM6129getTextPjHm6EE;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z6 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i16 = i10;
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.hc
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                            String str3 = str;
                            ImageVector imageVector2 = imageVector;
                            Gd.m(str3, str2, cVar, z6, i16, imageVector2, (Composer) obj, iUpdateChangedFlags, i7);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i8 |= 24576;
            i10 = i5;
            if ((196608 & i6) == 0) {
                if (composerStartRestartGroup.changed(imageVector)) {
                    i12 = Fields.RenderEffect;
                } else {
                    i12 = 65536;
                }
                i8 |= i12;
            }
            if ((74899 & i8) == 74898) {
                if (i13 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                if (i9 != 0) {
                    iM6129getTextPjHm6EE = KeyboardType.Companion.m6129getTextPjHm6EE();
                } else {
                    iM6129getTextPjHm6EE = i10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-673160783, i8, -1, "com.notescrafter.ui.screens.ShippingTextField (PrintOrderScreens.kt:3270)");
                }
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                constructor = companion5.getConstructor();
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
                eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap2);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion5.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                String upperCase2 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase2, "toUpperCase(...)");
                TextStyle labelSmall2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                int i17 = i8;
                TextKt.m2432Text4IGK_g(upperCase2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, iM6129getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
                Color.Companion companion6 = Color.Companion;
                int i18 = i17 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), !z5, false, (TextStyle) null, (e) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-547759489, true, new Ad(imageVector), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions2, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), outlinedTextFieldDefaults2.m2076colors0hiis_0(companion6.m3964getWhite0d7_KjU(), companion6.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion6.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion6.m3953getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, a.f15978a, Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095), composerStartRestartGroup, (i18 & 14) | 100663680 | (i18 & 112), 12582912, 0, 1933040);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i10 = iM6129getTextPjHm6EE;
                z6 = z5;
            } else {
                if (i13 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                if (i9 != 0) {
                    iM6129getTextPjHm6EE = KeyboardType.Companion.m6129getTextPjHm6EE();
                } else {
                    iM6129getTextPjHm6EE = i10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-673160783, i8, -1, "com.notescrafter.ui.screens.ShippingTextField (PrintOrderScreens.kt:3270)");
                }
                Modifier.Companion companion7 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                constructor = companion8.getConstructor();
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
                eVarG = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap3);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion8.getSetModifier());
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                String upperCase3 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase3, "toUpperCase(...)");
                TextStyle labelSmall3 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                int i19 = i8;
                TextKt.m2432Text4IGK_g(upperCase3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                KeyboardOptions keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, iM6129getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                OutlinedTextFieldDefaults outlinedTextFieldDefaults3 = OutlinedTextFieldDefaults.INSTANCE;
                Color.Companion companion9 = Color.Companion;
                int i110 = i19 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), !z5, false, (TextStyle) null, (e) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-547759489, true, new Ad(imageVector), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), outlinedTextFieldDefaults3.m2076colors0hiis_0(companion9.m3964getWhite0d7_KjU(), companion9.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion9.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion9.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion9.m3953getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion9.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, a.f15978a, Color.m3926copywmQWz5c$default(companion9.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion9.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095), composerStartRestartGroup, (i110 & 14) | 100663680 | (i110 & 112), 12582912, 0, 1933040);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i10 = iM6129getTextPjHm6EE;
                z6 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i111 = i10;
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.hc
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                        String str3 = str;
                        ImageVector imageVector2 = imageVector;
                        Gd.m(str3, str2, cVar, z6, i111, imageVector2, (Composer) obj, iUpdateChangedFlags, i7);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i8 |= 3072;
        z4 = z3;
        i9 = i7 & 16;
        if (i9 != 0) {
            if ((i6 & 24576) == 0) {
                i10 = i5;
                if (composerStartRestartGroup.changed(i10)) {
                    i11 = Fields.Clip;
                } else {
                    i11 = Fields.Shape;
                }
                i8 |= i11;
            }
            if ((196608 & i6) == 0) {
                if (composerStartRestartGroup.changed(imageVector)) {
                    i12 = Fields.RenderEffect;
                } else {
                    i12 = 65536;
                }
                i8 |= i12;
            }
            if ((74899 & i8) == 74898) {
                if (i13 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                if (i9 != 0) {
                    iM6129getTextPjHm6EE = KeyboardType.Companion.m6129getTextPjHm6EE();
                } else {
                    iM6129getTextPjHm6EE = i10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-673160783, i8, -1, "com.notescrafter.ui.screens.ShippingTextField (PrintOrderScreens.kt:3270)");
                }
                Modifier.Companion companion10 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default4);
                ComposeUiNode.Companion companion11 = ComposeUiNode.Companion;
                constructor = companion11.getConstructor();
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
                eVarG = p035i0.a.g(companion11, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap4);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion11.getSetModifier());
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                String upperCase4 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase4, "toUpperCase(...)");
                TextStyle labelSmall4 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                int i112 = i8;
                TextKt.m2432Text4IGK_g(upperCase4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall4.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? labelSmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall4.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall4.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall4.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                KeyboardOptions keyboardOptions4 = new KeyboardOptions(0, (Boolean) null, iM6129getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                OutlinedTextFieldDefaults outlinedTextFieldDefaults4 = OutlinedTextFieldDefaults.INSTANCE;
                Color.Companion companion12 = Color.Companion;
                int i113 = i112 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), !z5, false, (TextStyle) null, (e) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-547759489, true, new Ad(imageVector), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions4, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), outlinedTextFieldDefaults4.m2076colors0hiis_0(companion12.m3964getWhite0d7_KjU(), companion12.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion12.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion12.m3953getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, a.f15978a, Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095), composerStartRestartGroup, (i113 & 14) | 100663680 | (i113 & 112), 12582912, 0, 1933040);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i10 = iM6129getTextPjHm6EE;
                z6 = z5;
            } else {
                if (i13 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                if (i9 != 0) {
                    iM6129getTextPjHm6EE = KeyboardType.Companion.m6129getTextPjHm6EE();
                } else {
                    iM6129getTextPjHm6EE = i10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-673160783, i8, -1, "com.notescrafter.ui.screens.ShippingTextField (PrintOrderScreens.kt:3270)");
                }
                Modifier.Companion companion13 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default5);
                ComposeUiNode.Companion companion14 = ComposeUiNode.Companion;
                constructor = companion14.getConstructor();
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
                eVarG = p035i0.a.g(companion14, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap5);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion14.getSetModifier());
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                String upperCase5 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase5, "toUpperCase(...)");
                TextStyle labelSmall5 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                int i114 = i8;
                TextKt.m2432Text4IGK_g(upperCase5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall5.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? labelSmall5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall5.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall5.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall5.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                KeyboardOptions keyboardOptions5 = new KeyboardOptions(0, (Boolean) null, iM6129getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
                OutlinedTextFieldDefaults outlinedTextFieldDefaults5 = OutlinedTextFieldDefaults.INSTANCE;
                Color.Companion companion15 = Color.Companion;
                int i115 = i114 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), !z5, false, (TextStyle) null, (e) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-547759489, true, new Ad(imageVector), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions5, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), outlinedTextFieldDefaults5.m2076colors0hiis_0(companion15.m3964getWhite0d7_KjU(), companion15.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion15.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion15.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion15.m3953getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion15.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, a.f15978a, Color.m3926copywmQWz5c$default(companion15.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion15.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095), composerStartRestartGroup, (i115 & 14) | 100663680 | (i115 & 112), 12582912, 0, 1933040);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i10 = iM6129getTextPjHm6EE;
                z6 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i116 = i10;
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.hc
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                        String str3 = str;
                        ImageVector imageVector2 = imageVector;
                        Gd.m(str3, str2, cVar, z6, i116, imageVector2, (Composer) obj, iUpdateChangedFlags, i7);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i8 |= 24576;
        i10 = i5;
        if ((196608 & i6) == 0) {
            if (composerStartRestartGroup.changed(imageVector)) {
                i12 = Fields.RenderEffect;
            } else {
                i12 = 65536;
            }
            i8 |= i12;
        }
        if ((74899 & i8) == 74898) {
            if (i13 != 0) {
                z5 = false;
            } else {
                z5 = z4;
            }
            if (i9 != 0) {
                iM6129getTextPjHm6EE = KeyboardType.Companion.m6129getTextPjHm6EE();
            } else {
                iM6129getTextPjHm6EE = i10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-673160783, i8, -1, "com.notescrafter.ui.screens.ShippingTextField (PrintOrderScreens.kt:3270)");
            }
            Modifier.Companion companion16 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion16, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default6);
            ComposeUiNode.Companion companion17 = ComposeUiNode.Companion;
            constructor = companion17.getConstructor();
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
            eVarG = p035i0.a.g(companion17, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl, currentCompositionLocalMap6);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier6, companion17.getSetModifier());
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            String upperCase6 = str.toUpperCase(Locale.ROOT);
            o.e(upperCase6, "toUpperCase(...)");
            TextStyle labelSmall6 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
            int i117 = i8;
            TextKt.m2432Text4IGK_g(upperCase6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall6.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? labelSmall6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall6.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall6.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall6.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
            KeyboardOptions keyboardOptions6 = new KeyboardOptions(0, (Boolean) null, iM6129getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
            OutlinedTextFieldDefaults outlinedTextFieldDefaults6 = OutlinedTextFieldDefaults.INSTANCE;
            Color.Companion companion18 = Color.Companion;
            int i118 = i117 >> 3;
            OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(companion16, 0.0f, 1, null), !z5, false, (TextStyle) null, (e) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-547759489, true, new Ad(imageVector), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions6, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), outlinedTextFieldDefaults6.m2076colors0hiis_0(companion18.m3964getWhite0d7_KjU(), companion18.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion18.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion18.m3953getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, a.f15978a, Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095), composerStartRestartGroup, (i118 & 14) | 100663680 | (i118 & 112), 12582912, 0, 1933040);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i10 = iM6129getTextPjHm6EE;
            z6 = z5;
        } else {
            if (i13 != 0) {
                z5 = false;
            } else {
                z5 = z4;
            }
            if (i9 != 0) {
                iM6129getTextPjHm6EE = KeyboardType.Companion.m6129getTextPjHm6EE();
            } else {
                iM6129getTextPjHm6EE = i10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-673160783, i8, -1, "com.notescrafter.ui.screens.ShippingTextField (PrintOrderScreens.kt:3270)");
            }
            Modifier.Companion companion19 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion19, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default7);
            ComposeUiNode.Companion companion110 = ComposeUiNode.Companion;
            constructor = companion110.getConstructor();
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
            eVarG = p035i0.a.g(companion110, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl, currentCompositionLocalMap7);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion110.getSetModifier());
            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
            String upperCase7 = str.toUpperCase(Locale.ROOT);
            o.e(upperCase7, "toUpperCase(...)");
            TextStyle labelSmall7 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
            int i119 = i8;
            TextKt.m2432Text4IGK_g(upperCase7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall7.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall7.spanStyle.m5841getColor0d7_KjU() : a.p, (16645977 & 2) != 0 ? labelSmall7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall7.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall7.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall7.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall7.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
            KeyboardOptions keyboardOptions7 = new KeyboardOptions(0, (Boolean) null, iM6129getTextPjHm6EE, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (AbstractC2168g) null);
            OutlinedTextFieldDefaults outlinedTextFieldDefaults7 = OutlinedTextFieldDefaults.INSTANCE;
            Color.Companion companion111 = Color.Companion;
            int i1110 = i119 >> 3;
            OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(companion19, 0.0f, 1, null), !z5, false, (TextStyle) null, (e) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-547759489, true, new Ad(imageVector), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions7, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), outlinedTextFieldDefaults7.m2076colors0hiis_0(companion111.m3964getWhite0d7_KjU(), companion111.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion111.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion111.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion111.m3953getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion111.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, a.f15978a, Color.m3926copywmQWz5c$default(companion111.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion111.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095), composerStartRestartGroup, (i1110 & 14) | 100663680 | (i1110 & 112), 12582912, 0, 1933040);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i10 = iM6129getTextPjHm6EE;
            z6 = z5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i1111 = i10;
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.hc
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                    String str3 = str;
                    ImageVector imageVector2 = imageVector;
                    Gd.m(str3, str2, cVar, z6, i1111, imageVector2, (Composer) obj, iUpdateChangedFlags, i7);
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final void n(Modifier modifier, ImageVector imageVector, long j5, String str, String str2, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1462858340);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(j5) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? Fields.Clip : Fields.Shape;
        }
        if ((i6 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1462858340, i6, -1, "com.notescrafter.ui.screens.SpecBadge (PrintOrderScreens.kt:1128)");
            }
            float f5 = 12;
            Modifier modifierG = b.g(modifier, f5);
            Color.Companion companion = Color.Companion;
            float f6 = 1;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(b.e(f5, BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            O3.a constructor = companion3.getConstructor();
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
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6));
            Modifier.Companion companion4 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, centerHorizontally, composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
            O3.a constructor2 = companion3.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f7 = 10;
            Modifier modifierE = b.e(f7, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(36)), f7), Color.m3926copywmQWz5c$default(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
            O3.a constructor3 = companion3.getConstructor();
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
            e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            IconKt.m1877Iconww6aTOc(imageVector, (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(18)), j5, composerStartRestartGroup, ((i6 >> 3) & 14) | 432 | ((i6 << 3) & 7168), 0);
            composerStartRestartGroup.endNode();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i7 = MaterialTheme.$stable;
            TextStyle labelSmall = materialTheme.getTypography(composerStartRestartGroup, i7).getLabelSmall();
            TextStyle textStyleM5917copyp1EtxEg = labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null);
            TextAlign.Companion companion5 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion5.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composerStartRestartGroup, (i6 >> 9) & 14, 0, 65022);
            TextStyle labelSmall2 = materialTheme.getTypography(composerStartRestartGroup, i7).getLabelSmall();
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion5.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(a.p, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, (i6 >> 12) & 14, 0, 65022);
            if (androidx.compose.foundation.text.modifiers.a.w(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2653r6(modifier, imageVector, j5, str, str2, i5));
        }
    }

    public static final void o(String str, String str2, ImageVector imageVector, long j5, Composer composer, int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-750165077);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(imageVector) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(j5) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-750165077, i6, -1, "com.notescrafter.ui.screens.WarningBanner (PrintOrderScreens.kt:1182)");
            }
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(j5, 0.25f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-897630554, true, new Bd(j5, imageVector, str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2525j5(str, str2, imageVector, j5, i5));
        }
    }

    public static final C2283e0 q(State state) {
        return (C2283e0) state.getValue();
    }

    public static final void r(MutableState mutableState, boolean z3) {
        mutableState.setValue(Boolean.valueOf(z3));
    }

    public static final double s(State state) {
        return ((Number) state.getValue()).doubleValue();
    }

    public static final double t(State state) {
        return ((Number) state.getValue()).doubleValue();
    }

    public static final q u(State state) {
        return (q) state.getValue();
    }

    public static final void v(MutableState mutableState, boolean z3) {
        mutableState.setValue(Boolean.valueOf(z3));
    }

    public static final void w(MutableState mutableState, boolean z3) {
        mutableState.setValue(Boolean.valueOf(z3));
    }

    public static final String y(double d4) {
        return "₹".concat(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    public static final String z(Context context, Uri uri) {
        String path;
        int columnIndex;
        String strSubstring = null;
        if (o.b(uri.getScheme(), "content")) {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) {
                        path = null;
                    } else {
                        path = cursorQuery.getString(columnIndex);
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } else {
                path = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } else {
            path = null;
        }
        if (path == null) {
            path = uri.getPath();
            int iN0 = path != null ? W3.j.n0(path, '/', 0, 6) : -1;
            if (iN0 != -1) {
                if (path != null) {
                    strSubstring = path.substring(iN0 + 1);
                    o.e(strSubstring, "substring(...)");
                }
                path = strSubstring;
            }
        }
        return path == null ? "document.pdf" : path;
    }
}

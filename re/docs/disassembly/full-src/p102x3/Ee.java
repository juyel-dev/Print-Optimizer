package p102x3;

import C3.v;
import M0.f;
import O3.a;
import O3.c;
import O3.e;
import a4.F;
import android.content.Context;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.PreviewKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
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
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.app.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.O;
import p097w3.j;
import p097w3.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f13941a = v.S(Integer.valueOf(R.drawable.ncp_gallery_1), Integer.valueOf(R.drawable.ncp_gallery_2), Integer.valueOf(R.drawable.ncp_gallery_3), Integer.valueOf(R.drawable.ncp_gallery_4), Integer.valueOf(R.drawable.ncp_gallery_5), Integer.valueOf(R.drawable.ncp_gallery_6));

    public static final void a(String str, String str2, boolean z3, Modifier modifier, Composer composer, int i5, int i6) {
        int i7;
        Composer composer2;
        Modifier modifier2;
        boolean z4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1328824733);
        if ((i5 & 6) == 0) {
            i7 = i5 | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i8 = i7 | 3072;
        if ((i8 & 1043) == 1042 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z3;
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            boolean z5 = (i6 & 4) != 0 ? false : z3;
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1328824733, i8, -1, "com.notescrafter.ui.screens.SizeInfo (SuccessScreen.kt:663)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i9).getBodySmall(), composerStartRestartGroup, (i8 & 14) | 384, 0, 65530);
            b.m(4, companion, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i9).getHeadlineSmall(), composer2, ((i8 >> 3) & 14) | 196992, 0, 65498);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
            z4 = z5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2731w4(str, str2, z4, modifier2, i5, i6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:159:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:166:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:167:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:169:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:172:0x052a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0553  */
    /* JADX WARN: Code duplicated, block: B:179:0x055c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0599  */
    /* JADX WARN: Code duplicated, block: B:185:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:186:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:189:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:191:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:194:0x0656  */
    /* JADX WARN: Code duplicated, block: B:197:0x0662  */
    /* JADX WARN: Code duplicated, block: B:198:0x0666  */
    /* JADX WARN: Code duplicated, block: B:201:0x0677  */
    /* JADX WARN: Code duplicated, block: B:204:0x0688  */
    /* JADX WARN: Code duplicated, block: B:208:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:210:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:211:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:214:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:215:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:218:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:220:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:224:0x078c  */
    /* JADX WARN: Code duplicated, block: B:227:0x0798  */
    /* JADX WARN: Code duplicated, block: B:228:0x079c  */
    /* JADX WARN: Code duplicated, block: B:231:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:234:0x07be  */
    /* JADX WARN: Code duplicated, block: B:238:0x0801  */
    /* JADX WARN: Code duplicated, block: B:241:0x080d  */
    /* JADX WARN: Code duplicated, block: B:242:0x0811  */
    /* JADX WARN: Code duplicated, block: B:245:0x0822  */
    /* JADX WARN: Code duplicated, block: B:248:0x0833  */
    /* JADX WARN: Code duplicated, block: B:252:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:255:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:256:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:259:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:261:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:264:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:267:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:268:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:271:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:273:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:276:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:277:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:280:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:284:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:287:0x0b98  */
    /* JADX WARN: Code duplicated, block: B:290:0x0ba4  */
    /* JADX WARN: Code duplicated, block: B:291:0x0ba8  */
    /* JADX WARN: Code duplicated, block: B:294:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:296:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:300:0x0cbf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(final long j5, final long j6, final String str, final int i5, final boolean z3, final boolean z4, final float f5, final a onDownload, final a onPreview, final a onShare, final a onProcessAnother, final a onNavigateToPrint, final M0.b adMobManager, final boolean z5, Modifier modifier, Composer composer, final int i6, final int i7) {
        float f6;
        float f7;
        float f8;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        Arrangement arrangement;
        float f9;
        Object objJ;
        PagerState pagerStateRememberPagerState;
        Object objRememberedValue;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        Object obj;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        float f10;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        Modifier.Companion companion;
        int size;
        int i8;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        float f11;
        RowScopeInstance rowScopeInstance;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        RowScopeInstance rowScopeInstance2;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG2;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        e eVarG3;
        boolean z6;
        Object objRememberedValue3;
        int i9;
        int currentCompositeKeyHash8;
        a constructor8;
        Composer composerM3407constructorimpl8;
        e eVarG4;
        int i10;
        Composer composer2;
        boolean z7;
        float fM6403constructorimpl;
        long jM3926copywmQWz5c$default;
        final Modifier modifier2;
        o.f(onDownload, "onDownload");
        o.f(onPreview, "onPreview");
        o.f(onShare, "onShare");
        o.f(onProcessAnother, "onProcessAnother");
        o.f(onNavigateToPrint, "onNavigateToPrint");
        o.f(adMobManager, "adMobManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(1259481791);
        int i11 = (i6 & 6) == 0 ? i6 | (composerStartRestartGroup.changed(j5) ? 4 : 2) : i6;
        if ((i6 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(j6) ? 32 : 16;
        }
        int i12 = i6 & 384;
        int i13 = Fields.SpotShadowColor;
        if (i12 == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(i5) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(z3) ? Fields.Clip : Fields.Shape;
        }
        if ((196608 & i6) == 0) {
            i11 |= composerStartRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i6) == 0) {
            i11 |= composerStartRestartGroup.changed(f5) ? 1048576 : 524288;
        }
        if ((12582912 & i6) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onDownload) ? 8388608 : 4194304;
        }
        if ((100663296 & i6) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onPreview) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onShare) ? 536870912 : 268435456;
        }
        int i14 = i11;
        int i15 = (i7 & 6) == 0 ? (composerStartRestartGroup.changedInstance(onProcessAnother) ? 4 : 2) | i7 : i7;
        if ((i7 & 48) == 0) {
            i15 |= composerStartRestartGroup.changedInstance(onNavigateToPrint) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            if (composerStartRestartGroup.changedInstance(adMobManager)) {
                i13 = 256;
            }
            i15 |= i13;
        }
        int i16 = i15 | 24576;
        if ((306783379 & i14) == 306783378 && (i16 & 8339) == 8338 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1259481791, i14, i16, "com.notescrafter.ui.screens.SuccessScreen (SuccessScreen.kt:99)");
            }
            composerStartRestartGroup.startReplaceGroup(1411120997);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue4;
            Object objK = b.k(composerStartRestartGroup, 1411125124);
            if (objK == companion3.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState3 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, 1411127909);
            if (objK2 == companion3.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState4 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, 1411129922);
            if (objK3 == companion3.getEmpty()) {
                objK3 = b.b(15, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState5 = (MutableState) objK3;
            composerStartRestartGroup.endReplaceGroup();
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            SnapshotStateKt.collectAsState((F) adMobManager.q, null, composerStartRestartGroup, 0, 1);
            SnapshotStateKt.collectAsState((F) adMobManager.f657s, null, composerStartRestartGroup, 0, 1);
            B3.o oVar = B3.o.f154a;
            composerStartRestartGroup.startReplaceGroup(1411139923);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(adMobManager) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion3.getEmpty()) {
                objRememberedValue5 = new C2725ve(adMobManager, context, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue5, composerStartRestartGroup, 6);
            Boolean bool = (Boolean) mutableState4.getValue();
            bool.getClass();
            composerStartRestartGroup.startReplaceGroup(1411153703);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion3.getEmpty()) {
                objRememberedValue6 = new C2741we(mutableState4, mutableState5, mutableState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool, (e) objRememberedValue6, composerStartRestartGroup, 0);
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, "success_scale", null, composerStartRestartGroup, 3072, 20);
            float f12 = 24;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
            Alignment.Companion companion4 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor9 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor9);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG5 = p035i0.a.g(companion5, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl9, currentCompositionLocalMap);
            if (composerM3407constructorimpl9.getInserting()) {
                f6 = f12;
            } else {
                f6 = f12;
                if (!o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier, companion5.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                f7 = 32;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f7)), composerStartRestartGroup, 6);
                Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()), Dp.m6403constructorimpl(72));
                f8 = 16;
                float fM6403constructorimpl2 = Dp.m6403constructorimpl(f8);
                RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                long j7 = p107y3.a.f15994w;
                Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(ShadowKt.m3585shadows4CzXII$default(modifierM713size3ABfNKs, fM6403constructorimpl2, circleShape, false, 0L, Color.m3926copywmQWz5c$default(j7, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 12, null), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(j7), Color.m3917boximpl(p107y3.a.f15995x)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default);
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
                e eVarG6 = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap2);
                if (composerM3407constructorimpl.getInserting()) {
                    arrangement = arrangement2;
                } else {
                    arrangement = arrangement2;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f7)), Color.Companion.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                    b.n(composerStartRestartGroup, f8, companion2, composerStartRestartGroup, 6);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i17 = MaterialTheme.$stable;
                    TextStyle headlineMedium = materialTheme.getTypography(composerStartRestartGroup, i17).getHeadlineMedium();
                    FontWeight bold = FontWeight.Companion.getBold();
                    long j8 = p107y3.a.f15990o;
                    TextAlign.Companion companion6 = TextAlign.Companion;
                    TextKt.m2432Text4IGK_g("Custom Printed Notebook", (Modifier) null, j8, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineMedium, composerStartRestartGroup, 196998, 0, 64986);
                    f9 = 8;
                    b.m(f9, companion2, composerStartRestartGroup, 6);
                    TextKt.m2432Text4IGK_g("Get your custom printed notebook at your doorstep within 3-7 days.", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i17).getBodyMedium(), composerStartRestartGroup, 390, 3072, 56826);
                    b.m(f7, companion2, composerStartRestartGroup, 6);
                    if (z4) {
                        objJ = b.j(1293030074, composerStartRestartGroup, 595893182);
                        if (objJ == companion3.getEmpty()) {
                            objJ = new f(5);
                            composerStartRestartGroup.updateRememberedValue(objJ);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (a) objJ, composerStartRestartGroup, 384, 3);
                        composerStartRestartGroup.startReplaceGroup(595895268);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion3.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableState = (MutableState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean bool2 = (Boolean) mutableState.getValue();
                        bool2.getClass();
                        composerStartRestartGroup.startReplaceGroup(595898523);
                        zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion3.getEmpty()) {
                            obj = null;
                            objRememberedValue2 = new Ae(pagerStateRememberPagerState, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(pagerStateRememberPagerState, bool2, (e) objRememberedValue2, composerStartRestartGroup, 0);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        constructor2 = companion5.getConstructor();
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
                        eVarG = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap3);
                        if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion5.getSetModifier());
                        float f13 = 64;
                        PagerKt.m907HorizontalPageroI3XNZo(pagerStateRememberPagerState, SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(260)), PaddingKt.m663PaddingValuesYgX7TsA$default(Dp.m6403constructorimpl(f13), 0.0f, 2, null), null, 0, Dp.m6403constructorimpl(f8), null, null, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(2004631153, true, new Ce(pagerStateRememberPagerState, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 197040, 3072, 8152);
                        float f14 = 12;
                        b.m(f14, companion2, composerStartRestartGroup, 6);
                        f10 = 6;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                        constructor3 = companion5.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG7 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap4);
                        if (composerM3407constructorimpl3.getInserting()) {
                            companion = companion2;
                        } else {
                            companion = companion2;
                            if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier4, companion5.getSetModifier());
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(2099120915);
                            size = f13941a.size();
                            for (i8 = 0; i8 < size; i8++) {
                                if (pagerStateRememberPagerState.getCurrentPage() == i8) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                Modifier.Companion companion7 = Modifier.Companion;
                                if (z7) {
                                    fM6403constructorimpl = Dp.m6403constructorimpl(f9);
                                } else {
                                    fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                                }
                                Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion7, fM6403constructorimpl), RoundedCornerShapeKt.getCircleShape());
                                if (z7) {
                                    jM3926copywmQWz5c$default = p107y3.a.f15980c;
                                } else {
                                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierClip, jM3926copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier.Companion companion8 = Modifier.Companion;
                            float f15 = 20;
                            b.m(f15, companion8, composerStartRestartGroup, 6);
                            Modifier modifierG = b.g(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), f14);
                            long j9 = p107y3.a.f15978a;
                            float f16 = 1;
                            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(b.e(f14, BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(j9, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(j9, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8));
                            Alignment.Companion companion9 = Alignment.Companion;
                            Alignment.Vertical centerVertically = companion9.getCenterVertically();
                            Arrangement arrangement3 = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement3.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
                            ComposeUiNode.Companion companion10 = ComposeUiNode.Companion;
                            constructor4 = companion10.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG8 = p035i0.a.g(companion10, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap5);
                            if (composerM3407constructorimpl4.getInserting()) {
                                f11 = f8;
                            } else {
                                f11 = f8;
                                if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier5, companion10.getSetModifier());
                                rowScopeInstance = RowScopeInstance.INSTANCE;
                                Alignment.Vertical centerVertically2 = companion9.getCenterVertically();
                                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion8, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically2, composerStartRestartGroup, 48);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                                constructor5 = companion10.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor5);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                e eVarG9 = p035i0.a.g(companion10, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap6);
                                if (composerM3407constructorimpl5.getInserting()) {
                                    rowScopeInstance2 = rowScopeInstance;
                                } else {
                                    rowScopeInstance2 = rowScopeInstance;
                                    if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier6, companion10.getSetModifier());
                                    TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion9.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion8);
                                    constructor6 = companion10.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor6);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                    eVarG2 = p035i0.a.g(companion10, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl6, currentCompositionLocalMap7);
                                    if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier7, companion10.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    FontWeight.Companion companion11 = FontWeight.Companion;
                                    TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                                    TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    Modifier modifierBackground$default2 = BackgroundKt.background$default(ClipKt.clip(companion8, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j9), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                                    float fM6403constructorimpl3 = Dp.m6403constructorimpl(f16);
                                    Color.Companion companion12 = Color.Companion;
                                    Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default2, fM6403constructorimpl3, Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getTopStart(), false);
                                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
                                    constructor7 = companion10.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor7);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                    eVarG3 = p035i0.a.g(companion10, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap8);
                                    if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier8, companion10.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion12.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                                    float f17 = f11;
                                    b.r(composerStartRestartGroup, f17, companion8, composerStartRestartGroup, 6);
                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                    long jM3962getTransparent0d7_KjU = companion12.m3962getTransparent0d7_KjU();
                                    long jM3962getTransparent0d7_KjU2 = companion12.m3962getTransparent0d7_KjU();
                                    int i18 = ButtonDefaults.$stable << 12;
                                    ButtonColors buttonColorsM1520buttonColorsro_MJ88 = buttonDefaults.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU, 0L, jM3962getTransparent0d7_KjU2, 0L, composerStartRestartGroup, i18 | 390, 10);
                                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f17));
                                    PaddingValues paddingValuesM661PaddingValues0680j_4 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                                    Modifier modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m6403constructorimpl(f13), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f17)), false, 0L, Color.m3926copywmQWz5c$default(j9, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                                    composerStartRestartGroup.startReplaceGroup(596080364);
                                    if ((i16 & 112) == 32) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!z6 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                        i9 = 0;
                                        objRememberedValue3 = new O(18, onNavigateToPrint);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    } else {
                                        i9 = 0;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default, false, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1520buttonColorsro_MJ88, null, null, paddingValuesM661PaddingValues0680j_4, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                                    b.m(f7, companion8, composerStartRestartGroup, 6);
                                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                                    b.m(f6, companion8, composerStartRestartGroup, 6);
                                    j.a(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                                    b.m(f15, companion8, composerStartRestartGroup, 6);
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion9.getTop(), composerStartRestartGroup, i9);
                                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                                    constructor8 = companion10.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor8);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                    eVarG4 = p035i0.a.g(companion10, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl8, currentCompositionLocalMap9);
                                    if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier9, companion10.getSetModifier());
                                    Icons.Filled filled = Icons.Filled.INSTANCE;
                                    i10 = 6;
                                    composer2 = composerStartRestartGroup;
                                    q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), PreviewKt.getPreview(filled), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f14)), composer2, 6);
                                    q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), ShareKt.getShare(filled), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                                    b.n(composer2, f14, companion8, composer2, 6);
                                    ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i18 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                                    composer2.endReplaceGroup();
                                }
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG9);
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier6, companion10.getSetModifier());
                                TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion9.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion8);
                                constructor6 = companion10.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor6);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG2 = p035i0.a.g(companion10, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap10);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier10, companion10.getSetModifier());
                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                FontWeight.Companion companion13 = FontWeight.Companion;
                                TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion13.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                                TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                Modifier modifierBackground$default3 = BackgroundKt.background$default(ClipKt.clip(companion8, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j9), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                                float fM6403constructorimpl4 = Dp.m6403constructorimpl(f16);
                                Color.Companion companion14 = Color.Companion;
                                Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default3, fM6403constructorimpl4, Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getTopStart(), false);
                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN5);
                                constructor7 = companion10.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor7);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG3 = p035i0.a.g(companion10, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap11);
                                if (composerM3407constructorimpl7.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11, companion10.getSetModifier());
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion14.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion13.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                                float f18 = f11;
                                b.r(composerStartRestartGroup, f18, companion8, composerStartRestartGroup, 6);
                                ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                                long jM3962getTransparent0d7_KjU3 = companion14.m3962getTransparent0d7_KjU();
                                long jM3962getTransparent0d7_KjU4 = companion14.m3962getTransparent0d7_KjU();
                                int i19 = ButtonDefaults.$stable << 12;
                                ButtonColors buttonColorsM1520buttonColorsro_MJ89 = buttonDefaults2.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU3, 0L, jM3962getTransparent0d7_KjU4, 0L, composerStartRestartGroup, i19 | 390, 10);
                                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f18));
                                PaddingValues paddingValuesM661PaddingValues0680j_5 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                                Modifier modifierM3585shadows4CzXII$default2 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m6403constructorimpl(f13), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f18)), false, 0L, Color.m3926copywmQWz5c$default(j9, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                                composerStartRestartGroup.startReplaceGroup(596080364);
                                if ((i16 & 112) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z6) {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default2, false, roundedCornerShapeM955RoundedCornerShape0680j_5, buttonColorsM1520buttonColorsro_MJ89, null, null, paddingValuesM661PaddingValues0680j_5, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                                b.m(f7, companion8, composerStartRestartGroup, 6);
                                DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                                b.m(f6, companion8, composerStartRestartGroup, 6);
                                j.a(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                                b.m(f15, companion8, composerStartRestartGroup, 6);
                                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion9.getTop(), composerStartRestartGroup, i9);
                                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                                constructor8 = companion10.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor8);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion10, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl8, currentCompositionLocalMap12);
                                if (composerM3407constructorimpl8.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier12, companion10.getSetModifier());
                                Icons.Filled filled2 = Icons.Filled.INSTANCE;
                                i10 = 6;
                                composer2 = composerStartRestartGroup;
                                q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), PreviewKt.getPreview(filled2), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f14)), composer2, 6);
                                q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), ShareKt.getShare(filled2), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                                b.n(composer2, f14, companion8, composer2, 6);
                                ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults2.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i19 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                                composer2.endReplaceGroup();
                            }
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG8);
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier5, companion10.getSetModifier());
                            rowScopeInstance = RowScopeInstance.INSTANCE;
                            Alignment.Vertical centerVertically3 = companion9.getCenterVertically();
                            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion8, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically3, composerStartRestartGroup, 48);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                            constructor5 = companion10.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG10 = p035i0.a.g(companion10, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl5, currentCompositionLocalMap13);
                            if (composerM3407constructorimpl5.getInserting()) {
                                rowScopeInstance2 = rowScopeInstance;
                                if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier13, companion10.getSetModifier());
                                TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion9.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion8);
                                constructor6 = companion10.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor6);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG2 = p035i0.a.g(companion10, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl6, currentCompositionLocalMap14);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier14, companion10.getSetModifier());
                                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                FontWeight.Companion companion15 = FontWeight.Companion;
                                TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion15.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                                TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                Modifier modifierBackground$default4 = BackgroundKt.background$default(ClipKt.clip(companion8, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j9), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                                float fM6403constructorimpl5 = Dp.m6403constructorimpl(f16);
                                Color.Companion companion16 = Color.Companion;
                                Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default4, fM6403constructorimpl5, Color.m3926copywmQWz5c$default(companion16.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getTopStart(), false);
                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN6);
                                constructor7 = companion10.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor7);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG3 = p035i0.a.g(companion10, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl7, currentCompositionLocalMap15);
                                if (composerM3407constructorimpl7.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier15, companion10.getSetModifier());
                                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion16.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion15.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                                float f19 = f11;
                                b.r(composerStartRestartGroup, f19, companion8, composerStartRestartGroup, 6);
                                ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                                long jM3962getTransparent0d7_KjU5 = companion16.m3962getTransparent0d7_KjU();
                                long jM3962getTransparent0d7_KjU6 = companion16.m3962getTransparent0d7_KjU();
                                int i110 = ButtonDefaults.$stable << 12;
                                ButtonColors buttonColorsM1520buttonColorsro_MJ810 = buttonDefaults3.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU5, 0L, jM3962getTransparent0d7_KjU6, 0L, composerStartRestartGroup, i110 | 390, 10);
                                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f19));
                                PaddingValues paddingValuesM661PaddingValues0680j_6 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                                Modifier modifierM3585shadows4CzXII$default3 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m6403constructorimpl(f13), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f19)), false, 0L, Color.m3926copywmQWz5c$default(j9, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                                composerStartRestartGroup.startReplaceGroup(596080364);
                                if ((i16 & 112) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z6) {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default3, false, roundedCornerShapeM955RoundedCornerShape0680j_6, buttonColorsM1520buttonColorsro_MJ810, null, null, paddingValuesM661PaddingValues0680j_6, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                                b.m(f7, companion8, composerStartRestartGroup, 6);
                                DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                                b.m(f6, companion8, composerStartRestartGroup, 6);
                                j.a(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                                b.m(f15, companion8, composerStartRestartGroup, 6);
                                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion9.getTop(), composerStartRestartGroup, i9);
                                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                                CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default4);
                                constructor8 = companion10.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor8);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion10, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl8, currentCompositionLocalMap16);
                                if (composerM3407constructorimpl8.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier16, companion10.getSetModifier());
                                Icons.Filled filled3 = Icons.Filled.INSTANCE;
                                i10 = 6;
                                composer2 = composerStartRestartGroup;
                                q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), PreviewKt.getPreview(filled3), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f14)), composer2, 6);
                                q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), ShareKt.getShare(filled3), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                                b.n(composer2, f14, companion8, composer2, 6);
                                ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults3.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i110 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                                composer2.endReplaceGroup();
                            } else {
                                rowScopeInstance2 = rowScopeInstance;
                            }
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG10);
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier13, companion10.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion9.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion8);
                            constructor6 = companion10.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion10, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl6, currentCompositionLocalMap17);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier17, companion10.getSetModifier());
                            ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion17 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion17.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default5 = BackgroundKt.background$default(ClipKt.clip(companion8, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j9), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl6 = Dp.m6403constructorimpl(f16);
                            Color.Companion companion18 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default5, fM6403constructorimpl6, Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion9.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN7);
                            constructor7 = companion10.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion10, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl7, currentCompositionLocalMap18);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier18, companion10.getSetModifier());
                            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion18.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion17.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f110 = f11;
                            b.r(composerStartRestartGroup, f110, companion8, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults4 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU7 = companion18.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU8 = companion18.m3962getTransparent0d7_KjU();
                            int i111 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ811 = buttonDefaults4.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU7, 0L, jM3962getTransparent0d7_KjU8, 0L, composerStartRestartGroup, i111 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f110));
                            PaddingValues paddingValuesM661PaddingValues0680j_7 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default4 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m6403constructorimpl(f13), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f110)), false, 0L, Color.m3926copywmQWz5c$default(j9, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default4, false, roundedCornerShapeM955RoundedCornerShape0680j_7, buttonColorsM1520buttonColorsro_MJ811, null, null, paddingValuesM661PaddingValues0680j_7, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion8, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion8, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f15, companion8, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion9.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default5);
                            constructor8 = companion10.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion10, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl8, currentCompositionLocalMap19);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier19, companion10.getSetModifier());
                            Icons.Filled filled4 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), PreviewKt.getPreview(filled4), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion8, Dp.m6403constructorimpl(f14)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion8, 1.0f, false, 2, null), ShareKt.getShare(filled4), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f14, companion8, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults4.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i111 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        }
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG7);
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier4, companion5.getSetModifier());
                        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(2099120915);
                        size = f13941a.size();
                        while (i8 < size) {
                            if (pagerStateRememberPagerState.getCurrentPage() == i8) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            Modifier.Companion companion19 = Modifier.Companion;
                            if (z7) {
                                fM6403constructorimpl = Dp.m6403constructorimpl(f9);
                            } else {
                                fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                            }
                            Modifier modifierClip2 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion19, fM6403constructorimpl), RoundedCornerShapeKt.getCircleShape());
                            if (z7) {
                                jM3926copywmQWz5c$default = p107y3.a.f15980c;
                            } else {
                                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierClip2, jM3926copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier.Companion companion20 = Modifier.Companion;
                        float f111 = 20;
                        b.m(f111, companion20, composerStartRestartGroup, 6);
                        Modifier modifierG2 = b.g(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), f14);
                        long j10 = p107y3.a.f15978a;
                        float f112 = 1;
                        Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f14, BackgroundKt.m207backgroundbw27NRU$default(modifierG2, Color.m3926copywmQWz5c$default(j10, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f112), Color.m3926copywmQWz5c$default(j10, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8));
                        Alignment.Companion companion21 = Alignment.Companion;
                        Alignment.Vertical centerVertically4 = companion21.getCenterVertically();
                        Arrangement arrangement4 = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement4.getSpaceBetween(), centerVertically4, composerStartRestartGroup, 54);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap20 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier20 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs2);
                        ComposeUiNode.Companion companion110 = ComposeUiNode.Companion;
                        constructor4 = companion110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG11 = p035i0.a.g(companion110, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl4, currentCompositionLocalMap20);
                        if (composerM3407constructorimpl4.getInserting()) {
                            f11 = f8;
                            if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier20, companion110.getSetModifier());
                            rowScopeInstance = RowScopeInstance.INSTANCE;
                            Alignment.Vertical centerVertically5 = companion21.getCenterVertically();
                            Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance, companion20, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement4.getStart(), centerVertically5, composerStartRestartGroup, 48);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default3);
                            constructor5 = companion110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG12 = p035i0.a.g(companion110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy10, composerM3407constructorimpl5, currentCompositionLocalMap110);
                            if (composerM3407constructorimpl5.getInserting()) {
                                rowScopeInstance2 = rowScopeInstance;
                                if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier110, companion110.getSetModifier());
                                TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion20, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion21.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion20);
                                constructor6 = companion110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor6);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG2 = p035i0.a.g(companion110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl6, currentCompositionLocalMap111);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111, companion110.getSetModifier());
                                ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                                FontWeight.Companion companion111 = FontWeight.Companion;
                                TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                                TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                Modifier modifierBackground$default6 = BackgroundKt.background$default(ClipKt.clip(companion20, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j10), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                                float fM6403constructorimpl7 = Dp.m6403constructorimpl(f112);
                                Color.Companion companion112 = Color.Companion;
                                Modifier modifierM669paddingVpY3zN8 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default6, fM6403constructorimpl7, Color.m3926copywmQWz5c$default(companion112.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion21.getTopStart(), false);
                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN8);
                                constructor7 = companion110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor7);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG3 = p035i0.a.g(companion110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl7, currentCompositionLocalMap112);
                                if (composerM3407constructorimpl7.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier112, companion110.getSetModifier());
                                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                                TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion112.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                                float f113 = f11;
                                b.r(composerStartRestartGroup, f113, companion20, composerStartRestartGroup, 6);
                                ButtonDefaults buttonDefaults5 = ButtonDefaults.INSTANCE;
                                long jM3962getTransparent0d7_KjU9 = companion112.m3962getTransparent0d7_KjU();
                                long jM3962getTransparent0d7_KjU10 = companion112.m3962getTransparent0d7_KjU();
                                int i112 = ButtonDefaults.$stable << 12;
                                ButtonColors buttonColorsM1520buttonColorsro_MJ812 = buttonDefaults5.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU9, 0L, jM3962getTransparent0d7_KjU10, 0L, composerStartRestartGroup, i112 | 390, 10);
                                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_8 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f113));
                                PaddingValues paddingValuesM661PaddingValues0680j_8 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                                Modifier modifierM3585shadows4CzXII$default5 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), Dp.m6403constructorimpl(f13), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f113)), false, 0L, Color.m3926copywmQWz5c$default(j10, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                                composerStartRestartGroup.startReplaceGroup(596080364);
                                if ((i16 & 112) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z6) {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default5, false, roundedCornerShapeM955RoundedCornerShape0680j_8, buttonColorsM1520buttonColorsro_MJ812, null, null, paddingValuesM661PaddingValues0680j_8, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                                b.m(f7, companion20, composerStartRestartGroup, 6);
                                DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                                b.m(f6, companion20, composerStartRestartGroup, 6);
                                j.a(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                                b.m(f111, companion20, composerStartRestartGroup, 6);
                                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement4.getStart(), companion21.getTop(), composerStartRestartGroup, i9);
                                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default6);
                                constructor8 = companion110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor8);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy11, composerM3407constructorimpl8, currentCompositionLocalMap113);
                                if (composerM3407constructorimpl8.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier113, companion110.getSetModifier());
                                Icons.Filled filled5 = Icons.Filled.INSTANCE;
                                i10 = 6;
                                composer2 = composerStartRestartGroup;
                                q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion20, 1.0f, false, 2, null), PreviewKt.getPreview(filled5), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion20, Dp.m6403constructorimpl(f14)), composer2, 6);
                                q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion20, 1.0f, false, 2, null), ShareKt.getShare(filled5), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                                b.n(composer2, f14, companion20, composer2, 6);
                                ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults5.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i112 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                                composer2.endReplaceGroup();
                            } else {
                                rowScopeInstance2 = rowScopeInstance;
                            }
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG12);
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier110, companion110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion20, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion21.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion20);
                            constructor6 = companion110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl6, currentCompositionLocalMap114);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier114, companion110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion113 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion113.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default7 = BackgroundKt.background$default(ClipKt.clip(companion20, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j10), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl8 = Dp.m6403constructorimpl(f112);
                            Color.Companion companion114 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN9 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default7, fM6403constructorimpl8, Color.m3926copywmQWz5c$default(companion114.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion21.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN9);
                            constructor7 = companion110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl7, currentCompositionLocalMap115);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier115, companion110.getSetModifier());
                            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion114.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion113.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f114 = f11;
                            b.r(composerStartRestartGroup, f114, companion20, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults6 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU11 = companion114.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU12 = companion114.m3962getTransparent0d7_KjU();
                            int i113 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ813 = buttonDefaults6.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU11, 0L, jM3962getTransparent0d7_KjU12, 0L, composerStartRestartGroup, i113 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_9 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f114));
                            PaddingValues paddingValuesM661PaddingValues0680j_9 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default6 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), Dp.m6403constructorimpl(f13), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f114)), false, 0L, Color.m3926copywmQWz5c$default(j10, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default6, false, roundedCornerShapeM955RoundedCornerShape0680j_9, buttonColorsM1520buttonColorsro_MJ813, null, null, paddingValuesM661PaddingValues0680j_9, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion20, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion20, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f111, companion20, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(arrangement4.getStart(), companion21.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default7);
                            constructor8 = companion110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy12, composerM3407constructorimpl8, currentCompositionLocalMap116);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier116, companion110.getSetModifier());
                            Icons.Filled filled6 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion20, 1.0f, false, 2, null), PreviewKt.getPreview(filled6), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion20, Dp.m6403constructorimpl(f14)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion20, 1.0f, false, 2, null), ShareKt.getShare(filled6), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f14, companion20, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults6.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i113 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            f11 = f8;
                        }
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG11);
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier20, companion110.getSetModifier());
                        rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically6 = companion21.getCenterVertically();
                        Modifier modifierWeight$default4 = RowScope.weight$default(rowScopeInstance, companion20, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(arrangement4.getStart(), centerVertically6, composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default4);
                        constructor5 = companion110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG13 = p035i0.a.g(companion110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy13, composerM3407constructorimpl5, currentCompositionLocalMap117);
                        if (composerM3407constructorimpl5.getInserting()) {
                            rowScopeInstance2 = rowScopeInstance;
                            if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier117, companion110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion20, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion21.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion20);
                            constructor6 = companion110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl6, currentCompositionLocalMap118);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier118, companion110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion115 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion115.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default8 = BackgroundKt.background$default(ClipKt.clip(companion20, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j10), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl9 = Dp.m6403constructorimpl(f112);
                            Color.Companion companion116 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN10 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default8, fM6403constructorimpl9, Color.m3926copywmQWz5c$default(companion116.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion21.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN10);
                            constructor7 = companion110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl7, currentCompositionLocalMap119);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier119, companion110.getSetModifier());
                            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion116.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion115.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f115 = f11;
                            b.r(composerStartRestartGroup, f115, companion20, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults7 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU13 = companion116.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU14 = companion116.m3962getTransparent0d7_KjU();
                            int i114 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ814 = buttonDefaults7.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU13, 0L, jM3962getTransparent0d7_KjU14, 0L, composerStartRestartGroup, i114 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_10 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f115));
                            PaddingValues paddingValuesM661PaddingValues0680j_10 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default7 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), Dp.m6403constructorimpl(f13), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f115)), false, 0L, Color.m3926copywmQWz5c$default(j10, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default7, false, roundedCornerShapeM955RoundedCornerShape0680j_10, buttonColorsM1520buttonColorsro_MJ814, null, null, paddingValuesM661PaddingValues0680j_10, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion20, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion20, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f111, companion20, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(arrangement4.getStart(), companion21.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default8);
                            constructor8 = companion110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy14, composerM3407constructorimpl8, currentCompositionLocalMap1110);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1110, companion110.getSetModifier());
                            Icons.Filled filled7 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion20, 1.0f, false, 2, null), PreviewKt.getPreview(filled7), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion20, Dp.m6403constructorimpl(f14)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion20, 1.0f, false, 2, null), ShareKt.getShare(filled7), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f14, companion20, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults7.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i114 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            rowScopeInstance2 = rowScopeInstance;
                        }
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG13);
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier117, companion110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion20, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion21.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion20);
                        constructor6 = companion110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy10, composerM3407constructorimpl6, currentCompositionLocalMap1111);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111, companion110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion117 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion117.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default9 = BackgroundKt.background$default(ClipKt.clip(companion20, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j10), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl10 = Dp.m6403constructorimpl(f112);
                        Color.Companion companion118 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN11 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default9, fM6403constructorimpl10, Color.m3926copywmQWz5c$default(companion118.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion21.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN11);
                        constructor7 = companion110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl7, currentCompositionLocalMap1112);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1112, companion110.getSetModifier());
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion118.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion117.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f116 = f11;
                        b.r(composerStartRestartGroup, f116, companion20, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults8 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU15 = companion118.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU16 = companion118.m3962getTransparent0d7_KjU();
                        int i115 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ815 = buttonDefaults8.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU15, 0L, jM3962getTransparent0d7_KjU16, 0L, composerStartRestartGroup, i115 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_11 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f116));
                        PaddingValues paddingValuesM661PaddingValues0680j_11 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default8 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), Dp.m6403constructorimpl(f13), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f116)), false, 0L, Color.m3926copywmQWz5c$default(j10, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default8, false, roundedCornerShapeM955RoundedCornerShape0680j_11, buttonColorsM1520buttonColorsro_MJ815, null, null, paddingValuesM661PaddingValues0680j_11, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion20, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion20, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f111, companion20, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(arrangement4.getStart(), companion21.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default9);
                        constructor8 = companion110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy15, composerM3407constructorimpl8, currentCompositionLocalMap1113);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1113, companion110.getSetModifier());
                        Icons.Filled filled8 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion20, 1.0f, false, 2, null), PreviewKt.getPreview(filled8), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion20, Dp.m6403constructorimpl(f14)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion20, 1.0f, false, 2, null), ShareKt.getShare(filled8), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f14, companion20, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults8.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i115 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1287422980);
                        j.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-947718731, true, new C2789ze(z3, onDownload, f5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        composerStartRestartGroup.endReplaceGroup();
                        companion = companion2;
                        composer2 = composerStartRestartGroup;
                        i10 = 6;
                    }
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(100)), composer2, i10);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG6);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f7)), Color.Companion.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                b.n(composerStartRestartGroup, f8, companion2, composerStartRestartGroup, 6);
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i116 = MaterialTheme.$stable;
                TextStyle headlineMedium2 = materialTheme2.getTypography(composerStartRestartGroup, i116).getHeadlineMedium();
                FontWeight bold2 = FontWeight.Companion.getBold();
                long j11 = p107y3.a.f15990o;
                TextAlign.Companion companion22 = TextAlign.Companion;
                TextKt.m2432Text4IGK_g("Custom Printed Notebook", (Modifier) null, j11, 0L, (FontStyle) null, bold2, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion22.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineMedium2, composerStartRestartGroup, 196998, 0, 64986);
                f9 = 8;
                b.m(f9, companion2, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("Get your custom printed notebook at your doorstep within 3-7 days.", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion22.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, materialTheme2.getTypography(composerStartRestartGroup, i116).getBodyMedium(), composerStartRestartGroup, 390, 3072, 56826);
                b.m(f7, companion2, composerStartRestartGroup, 6);
                if (z4) {
                    composerStartRestartGroup.startReplaceGroup(1287422980);
                    j.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-947718731, true, new C2789ze(z3, onDownload, f5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion2;
                    composer2 = composerStartRestartGroup;
                    i10 = 6;
                } else {
                    objJ = b.j(1293030074, composerStartRestartGroup, 595893182);
                    if (objJ == companion3.getEmpty()) {
                        objJ = new f(5);
                        composerStartRestartGroup.updateRememberedValue(objJ);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (a) objJ, composerStartRestartGroup, 384, 3);
                    composerStartRestartGroup.startReplaceGroup(595895268);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion3.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean bool3 = (Boolean) mutableState.getValue();
                    bool3.getClass();
                    composerStartRestartGroup.startReplaceGroup(595898523);
                    zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = null;
                        objRememberedValue2 = new Ae(pagerStateRememberPagerState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        obj = null;
                        objRememberedValue2 = new Ae(pagerStateRememberPagerState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(pagerStateRememberPagerState, bool3, (e) objRememberedValue2, composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj);
                    MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap21 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier21 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default10);
                    constructor2 = companion5.getConstructor();
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
                    eVarG = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy11, composerM3407constructorimpl2, currentCompositionLocalMap21);
                    if (composerM3407constructorimpl2.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier21, companion5.getSetModifier());
                    float f117 = 64;
                    PagerKt.m907HorizontalPageroI3XNZo(pagerStateRememberPagerState, SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(260)), PaddingKt.m663PaddingValuesYgX7TsA$default(Dp.m6403constructorimpl(f117), 0.0f, 2, null), null, 0, Dp.m6403constructorimpl(f8), null, null, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(2004631153, true, new Ce(pagerStateRememberPagerState, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 197040, 3072, 8152);
                    float f118 = 12;
                    b.m(f118, companion2, composerStartRestartGroup, 6);
                    f10 = 6;
                    MeasurePolicy measurePolicyRowMeasurePolicy16 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                    constructor3 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG14 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy16, composerM3407constructorimpl3, currentCompositionLocalMap22);
                    if (composerM3407constructorimpl3.getInserting()) {
                        companion = companion2;
                        if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier22, companion5.getSetModifier());
                        RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(2099120915);
                        size = f13941a.size();
                        while (i8 < size) {
                            if (pagerStateRememberPagerState.getCurrentPage() == i8) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            Modifier.Companion companion119 = Modifier.Companion;
                            if (z7) {
                                fM6403constructorimpl = Dp.m6403constructorimpl(f9);
                            } else {
                                fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                            }
                            Modifier modifierClip3 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion119, fM6403constructorimpl), RoundedCornerShapeKt.getCircleShape());
                            if (z7) {
                                jM3926copywmQWz5c$default = p107y3.a.f15980c;
                            } else {
                                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierClip3, jM3926copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier.Companion companion23 = Modifier.Companion;
                        float f119 = 20;
                        b.m(f119, companion23, composerStartRestartGroup, 6);
                        Modifier modifierG3 = b.g(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), f118);
                        long j12 = p107y3.a.f15978a;
                        float f1110 = 1;
                        Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(b.e(f118, BackgroundKt.m207backgroundbw27NRU$default(modifierG3, Color.m3926copywmQWz5c$default(j12, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f1110), Color.m3926copywmQWz5c$default(j12, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8));
                        Alignment.Companion companion24 = Alignment.Companion;
                        Alignment.Vertical centerVertically7 = companion24.getCenterVertically();
                        Arrangement arrangement5 = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy17 = RowKt.rowMeasurePolicy(arrangement5.getSpaceBetween(), centerVertically7, composerStartRestartGroup, 54);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap23 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier23 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs3);
                        ComposeUiNode.Companion companion1110 = ComposeUiNode.Companion;
                        constructor4 = companion1110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG15 = p035i0.a.g(companion1110, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy17, composerM3407constructorimpl4, currentCompositionLocalMap23);
                        if (composerM3407constructorimpl4.getInserting()) {
                            f11 = f8;
                            if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier23, companion1110.getSetModifier());
                            rowScopeInstance = RowScopeInstance.INSTANCE;
                            Alignment.Vertical centerVertically8 = companion24.getCenterVertically();
                            Modifier modifierWeight$default5 = RowScope.weight$default(rowScopeInstance, companion23, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy18 = RowKt.rowMeasurePolicy(arrangement5.getStart(), centerVertically8, composerStartRestartGroup, 48);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default5);
                            constructor5 = companion1110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG16 = p035i0.a.g(companion1110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy18, composerM3407constructorimpl5, currentCompositionLocalMap1114);
                            if (composerM3407constructorimpl5.getInserting()) {
                                rowScopeInstance2 = rowScopeInstance;
                                if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1114, companion1110.getSetModifier());
                                TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion23, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                                MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion24.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion23);
                                constructor6 = companion1110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor6);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG2 = p035i0.a.g(companion1110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy12, composerM3407constructorimpl6, currentCompositionLocalMap1115);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1115, companion1110.getSetModifier());
                                ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                                FontWeight.Companion companion1111 = FontWeight.Companion;
                                TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion1111.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                                TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                Modifier modifierBackground$default10 = BackgroundKt.background$default(ClipKt.clip(companion23, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j12), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                                float fM6403constructorimpl11 = Dp.m6403constructorimpl(f1110);
                                Color.Companion companion1112 = Color.Companion;
                                Modifier modifierM669paddingVpY3zN12 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default10, fM6403constructorimpl11, Color.m3926copywmQWz5c$default(companion1112.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion24.getTopStart(), false);
                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN12);
                                constructor7 = companion1110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor7);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG3 = p035i0.a.g(companion1110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl7, currentCompositionLocalMap1116);
                                if (composerM3407constructorimpl7.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1116, companion1110.getSetModifier());
                                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                                TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion1112.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion1111.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                                float f1111 = f11;
                                b.r(composerStartRestartGroup, f1111, companion23, composerStartRestartGroup, 6);
                                ButtonDefaults buttonDefaults9 = ButtonDefaults.INSTANCE;
                                long jM3962getTransparent0d7_KjU17 = companion1112.m3962getTransparent0d7_KjU();
                                long jM3962getTransparent0d7_KjU18 = companion1112.m3962getTransparent0d7_KjU();
                                int i117 = ButtonDefaults.$stable << 12;
                                ButtonColors buttonColorsM1520buttonColorsro_MJ816 = buttonDefaults9.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU17, 0L, jM3962getTransparent0d7_KjU18, 0L, composerStartRestartGroup, i117 | 390, 10);
                                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_12 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111));
                                PaddingValues paddingValuesM661PaddingValues0680j_12 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                                Modifier modifierM3585shadows4CzXII$default9 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111)), false, 0L, Color.m3926copywmQWz5c$default(j12, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                                composerStartRestartGroup.startReplaceGroup(596080364);
                                if ((i16 & 112) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z6) {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default9, false, roundedCornerShapeM955RoundedCornerShape0680j_12, buttonColorsM1520buttonColorsro_MJ816, null, null, paddingValuesM661PaddingValues0680j_12, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                                b.m(f7, companion23, composerStartRestartGroup, 6);
                                DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                                b.m(f6, companion23, composerStartRestartGroup, 6);
                                j.a(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                                b.m(f119, companion23, composerStartRestartGroup, 6);
                                Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy19 = RowKt.rowMeasurePolicy(arrangement5.getStart(), companion24.getTop(), composerStartRestartGroup, i9);
                                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                                CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11);
                                constructor8 = companion1110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor8);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion1110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy19, composerM3407constructorimpl8, currentCompositionLocalMap1117);
                                if (composerM3407constructorimpl8.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1117, companion1110.getSetModifier());
                                Icons.Filled filled9 = Icons.Filled.INSTANCE;
                                i10 = 6;
                                composer2 = composerStartRestartGroup;
                                q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion23, 1.0f, false, 2, null), PreviewKt.getPreview(filled9), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion23, Dp.m6403constructorimpl(f118)), composer2, 6);
                                q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion23, 1.0f, false, 2, null), ShareKt.getShare(filled9), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                                b.n(composer2, f118, companion23, composer2, 6);
                                ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), buttonDefaults9.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i117 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                                composer2.endReplaceGroup();
                            } else {
                                rowScopeInstance2 = rowScopeInstance;
                            }
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG16);
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1114, companion1110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion23, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion24.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion23);
                            constructor6 = companion1110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion1110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy13, composerM3407constructorimpl6, currentCompositionLocalMap1118);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1118, companion1110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion1113 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion1113.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default11 = BackgroundKt.background$default(ClipKt.clip(companion23, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j12), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl12 = Dp.m6403constructorimpl(f1110);
                            Color.Companion companion1114 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN13 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default11, fM6403constructorimpl12, Color.m3926copywmQWz5c$default(companion1114.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion24.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN13);
                            constructor7 = companion1110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion1110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl7, currentCompositionLocalMap1119);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1119, companion1110.getSetModifier());
                            BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion1114.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion1113.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f1112 = f11;
                            b.r(composerStartRestartGroup, f1112, companion23, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults10 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU19 = companion1114.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU110 = companion1114.m3962getTransparent0d7_KjU();
                            int i118 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ817 = buttonDefaults10.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU19, 0L, jM3962getTransparent0d7_KjU110, 0L, composerStartRestartGroup, i118 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_13 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1112));
                            PaddingValues paddingValuesM661PaddingValues0680j_13 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default10 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1112)), false, 0L, Color.m3926copywmQWz5c$default(j12, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default10, false, roundedCornerShapeM955RoundedCornerShape0680j_13, buttonColorsM1520buttonColorsro_MJ817, null, null, paddingValuesM661PaddingValues0680j_13, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion23, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion23, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f119, companion23, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy110 = RowKt.rowMeasurePolicy(arrangement5.getStart(), companion24.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default12);
                            constructor8 = companion1110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion1110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy110, composerM3407constructorimpl8, currentCompositionLocalMap11110);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11110, companion1110.getSetModifier());
                            Icons.Filled filled10 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion23, 1.0f, false, 2, null), PreviewKt.getPreview(filled10), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion23, Dp.m6403constructorimpl(f118)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion23, 1.0f, false, 2, null), ShareKt.getShare(filled10), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f118, companion23, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), buttonDefaults10.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i118 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            f11 = f8;
                        }
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG15);
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier23, companion1110.getSetModifier());
                        rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically9 = companion24.getCenterVertically();
                        Modifier modifierWeight$default6 = RowScope.weight$default(rowScopeInstance, companion23, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy111 = RowKt.rowMeasurePolicy(arrangement5.getStart(), centerVertically9, composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default6);
                        constructor5 = companion1110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG17 = p035i0.a.g(companion1110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy111, composerM3407constructorimpl5, currentCompositionLocalMap11111);
                        if (composerM3407constructorimpl5.getInserting()) {
                            rowScopeInstance2 = rowScopeInstance;
                            if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111, companion1110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion23, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion24.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion23);
                            constructor6 = companion1110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion1110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy14, composerM3407constructorimpl6, currentCompositionLocalMap11112);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11112, companion1110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion1115 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion1115.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default12 = BackgroundKt.background$default(ClipKt.clip(companion23, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j12), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl13 = Dp.m6403constructorimpl(f1110);
                            Color.Companion companion1116 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN14 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default12, fM6403constructorimpl13, Color.m3926copywmQWz5c$default(companion1116.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion24.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN14);
                            constructor7 = companion1110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion1110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl7, currentCompositionLocalMap11113);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11113, companion1110.getSetModifier());
                            BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion1116.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion1115.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f1113 = f11;
                            b.r(composerStartRestartGroup, f1113, companion23, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults11 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU111 = companion1116.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU112 = companion1116.m3962getTransparent0d7_KjU();
                            int i119 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ818 = buttonDefaults11.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU111, 0L, jM3962getTransparent0d7_KjU112, 0L, composerStartRestartGroup, i119 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_14 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1113));
                            PaddingValues paddingValuesM661PaddingValues0680j_14 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default11 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1113)), false, 0L, Color.m3926copywmQWz5c$default(j12, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default11, false, roundedCornerShapeM955RoundedCornerShape0680j_14, buttonColorsM1520buttonColorsro_MJ818, null, null, paddingValuesM661PaddingValues0680j_14, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion23, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion23, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f119, companion23, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy112 = RowKt.rowMeasurePolicy(arrangement5.getStart(), companion24.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap11114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default13);
                            constructor8 = companion1110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion1110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy112, composerM3407constructorimpl8, currentCompositionLocalMap11114);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11114, companion1110.getSetModifier());
                            Icons.Filled filled11 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion23, 1.0f, false, 2, null), PreviewKt.getPreview(filled11), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion23, Dp.m6403constructorimpl(f118)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion23, 1.0f, false, 2, null), ShareKt.getShare(filled11), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f118, companion23, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), buttonDefaults11.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i119 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            rowScopeInstance2 = rowScopeInstance;
                        }
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG17);
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111, companion1110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion23, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion24.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion23);
                        constructor6 = companion1110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion1110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy15, composerM3407constructorimpl6, currentCompositionLocalMap11115);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11115, companion1110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion1117 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion1117.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default13 = BackgroundKt.background$default(ClipKt.clip(companion23, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j12), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl14 = Dp.m6403constructorimpl(f1110);
                        Color.Companion companion1118 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN15 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default13, fM6403constructorimpl14, Color.m3926copywmQWz5c$default(companion1118.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy13 = BoxKt.maybeCachedBoxMeasurePolicy(companion24.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN15);
                        constructor7 = companion1110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion1110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy13, composerM3407constructorimpl7, currentCompositionLocalMap11116);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11116, companion1110.getSetModifier());
                        BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion1118.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion1117.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f1114 = f11;
                        b.r(composerStartRestartGroup, f1114, companion23, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults12 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU113 = companion1118.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU114 = companion1118.m3962getTransparent0d7_KjU();
                        int i1110 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ819 = buttonDefaults12.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU113, 0L, jM3962getTransparent0d7_KjU114, 0L, composerStartRestartGroup, i1110 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_15 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1114));
                        PaddingValues paddingValuesM661PaddingValues0680j_15 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default12 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1114)), false, 0L, Color.m3926copywmQWz5c$default(j12, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default12, false, roundedCornerShapeM955RoundedCornerShape0680j_15, buttonColorsM1520buttonColorsro_MJ819, null, null, paddingValuesM661PaddingValues0680j_15, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion23, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion23, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f119, companion23, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy113 = RowKt.rowMeasurePolicy(arrangement5.getStart(), companion24.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap11117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default14);
                        constructor8 = companion1110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion1110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy113, composerM3407constructorimpl8, currentCompositionLocalMap11117);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11117, companion1110.getSetModifier());
                        Icons.Filled filled12 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion23, 1.0f, false, 2, null), PreviewKt.getPreview(filled12), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion23, Dp.m6403constructorimpl(f118)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion23, 1.0f, false, 2, null), ShareKt.getShare(filled12), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f118, companion23, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion23, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), buttonDefaults12.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1110 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        companion = companion2;
                    }
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG14);
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier22, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(2099120915);
                    size = f13941a.size();
                    while (i8 < size) {
                        if (pagerStateRememberPagerState.getCurrentPage() == i8) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        Modifier.Companion companion1119 = Modifier.Companion;
                        if (z7) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(f9);
                        } else {
                            fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                        }
                        Modifier modifierClip4 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion1119, fM6403constructorimpl), RoundedCornerShapeKt.getCircleShape());
                        if (z7) {
                            jM3926copywmQWz5c$default = p107y3.a.f15980c;
                        } else {
                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierClip4, jM3926copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Modifier.Companion companion25 = Modifier.Companion;
                    float f1115 = 20;
                    b.m(f1115, companion25, composerStartRestartGroup, 6);
                    Modifier modifierG4 = b.g(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), f118);
                    long j13 = p107y3.a.f15978a;
                    float f1116 = 1;
                    Modifier modifierM668padding3ABfNKs4 = PaddingKt.m668padding3ABfNKs(b.e(f118, BackgroundKt.m207backgroundbw27NRU$default(modifierG4, Color.m3926copywmQWz5c$default(j13, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f1116), Color.m3926copywmQWz5c$default(j13, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8));
                    Alignment.Companion companion26 = Alignment.Companion;
                    Alignment.Vertical centerVertically10 = companion26.getCenterVertically();
                    Arrangement arrangement6 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy114 = RowKt.rowMeasurePolicy(arrangement6.getSpaceBetween(), centerVertically10, composerStartRestartGroup, 54);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap24 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier24 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs4);
                    ComposeUiNode.Companion companion11110 = ComposeUiNode.Companion;
                    constructor4 = companion11110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG18 = p035i0.a.g(companion11110, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy114, composerM3407constructorimpl4, currentCompositionLocalMap24);
                    if (composerM3407constructorimpl4.getInserting()) {
                        f11 = f8;
                        if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier24, companion11110.getSetModifier());
                        rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically11 = companion26.getCenterVertically();
                        Modifier modifierWeight$default7 = RowScope.weight$default(rowScopeInstance, companion25, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy115 = RowKt.rowMeasurePolicy(arrangement6.getStart(), centerVertically11, composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default7);
                        constructor5 = companion11110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG19 = p035i0.a.g(companion11110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy115, composerM3407constructorimpl5, currentCompositionLocalMap11118);
                        if (composerM3407constructorimpl5.getInserting()) {
                            rowScopeInstance2 = rowScopeInstance;
                            if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11118, companion11110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion25, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy16 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion26.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion25);
                            constructor6 = companion11110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion11110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy16, composerM3407constructorimpl6, currentCompositionLocalMap11119);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11119, companion11110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion11111 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11111.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default14 = BackgroundKt.background$default(ClipKt.clip(companion25, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j13), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl15 = Dp.m6403constructorimpl(f1116);
                            Color.Companion companion11112 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN16 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default14, fM6403constructorimpl15, Color.m3926copywmQWz5c$default(companion11112.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy14 = BoxKt.maybeCachedBoxMeasurePolicy(companion26.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN16);
                            constructor7 = companion11110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion11110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy14, composerM3407constructorimpl7, currentCompositionLocalMap111110);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111110, companion11110.getSetModifier());
                            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion11112.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11111.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f1117 = f11;
                            b.r(composerStartRestartGroup, f1117, companion25, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults13 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU115 = companion11112.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU116 = companion11112.m3962getTransparent0d7_KjU();
                            int i1111 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ8110 = buttonDefaults13.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU115, 0L, jM3962getTransparent0d7_KjU116, 0L, composerStartRestartGroup, i1111 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_16 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1117));
                            PaddingValues paddingValuesM661PaddingValues0680j_16 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default13 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1117)), false, 0L, Color.m3926copywmQWz5c$default(j13, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default13, false, roundedCornerShapeM955RoundedCornerShape0680j_16, buttonColorsM1520buttonColorsro_MJ8110, null, null, paddingValuesM661PaddingValues0680j_16, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion25, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion25, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f1115, companion25, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy116 = RowKt.rowMeasurePolicy(arrangement6.getStart(), companion26.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default15);
                            constructor8 = companion11110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion11110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy116, composerM3407constructorimpl8, currentCompositionLocalMap111111);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111, companion11110.getSetModifier());
                            Icons.Filled filled13 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion25, 1.0f, false, 2, null), PreviewKt.getPreview(filled13), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion25, Dp.m6403constructorimpl(f118)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion25, 1.0f, false, 2, null), ShareKt.getShare(filled13), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f118, companion25, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), buttonDefaults13.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1111 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            rowScopeInstance2 = rowScopeInstance;
                        }
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG19);
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11118, companion11110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion25, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy17 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion26.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion25);
                        constructor6 = companion11110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion11110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy17, composerM3407constructorimpl6, currentCompositionLocalMap111112);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111112, companion11110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion11113 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11113.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default15 = BackgroundKt.background$default(ClipKt.clip(companion25, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j13), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl16 = Dp.m6403constructorimpl(f1116);
                        Color.Companion companion11114 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN17 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default15, fM6403constructorimpl16, Color.m3926copywmQWz5c$default(companion11114.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy15 = BoxKt.maybeCachedBoxMeasurePolicy(companion26.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN17);
                        constructor7 = companion11110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion11110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy15, composerM3407constructorimpl7, currentCompositionLocalMap111113);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111113, companion11110.getSetModifier());
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion11114.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11113.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f1118 = f11;
                        b.r(composerStartRestartGroup, f1118, companion25, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults14 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU117 = companion11114.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU118 = companion11114.m3962getTransparent0d7_KjU();
                        int i1112 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ8111 = buttonDefaults14.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU117, 0L, jM3962getTransparent0d7_KjU118, 0L, composerStartRestartGroup, i1112 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_17 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1118));
                        PaddingValues paddingValuesM661PaddingValues0680j_17 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default14 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1118)), false, 0L, Color.m3926copywmQWz5c$default(j13, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default14, false, roundedCornerShapeM955RoundedCornerShape0680j_17, buttonColorsM1520buttonColorsro_MJ8111, null, null, paddingValuesM661PaddingValues0680j_17, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion25, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion25, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f1115, companion25, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default16 = SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy117 = RowKt.rowMeasurePolicy(arrangement6.getStart(), companion26.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default16);
                        constructor8 = companion11110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion11110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy117, composerM3407constructorimpl8, currentCompositionLocalMap111114);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111114, companion11110.getSetModifier());
                        Icons.Filled filled14 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion25, 1.0f, false, 2, null), PreviewKt.getPreview(filled14), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion25, Dp.m6403constructorimpl(f118)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion25, 1.0f, false, 2, null), ShareKt.getShare(filled14), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f118, companion25, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), buttonDefaults14.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1112 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        f11 = f8;
                    }
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG18);
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier24, companion11110.getSetModifier());
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically12 = companion26.getCenterVertically();
                    Modifier modifierWeight$default8 = RowScope.weight$default(rowScopeInstance, companion25, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy118 = RowKt.rowMeasurePolicy(arrangement6.getStart(), centerVertically12, composerStartRestartGroup, 48);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default8);
                    constructor5 = companion11110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG110 = p035i0.a.g(companion11110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy118, composerM3407constructorimpl5, currentCompositionLocalMap111115);
                    if (composerM3407constructorimpl5.getInserting()) {
                        rowScopeInstance2 = rowScopeInstance;
                        if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111115, companion11110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion25, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy18 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion26.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion25);
                        constructor6 = companion11110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion11110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy18, composerM3407constructorimpl6, currentCompositionLocalMap111116);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111116, companion11110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance16 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion11115 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11115.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default16 = BackgroundKt.background$default(ClipKt.clip(companion25, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j13), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl17 = Dp.m6403constructorimpl(f1116);
                        Color.Companion companion11116 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN18 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default16, fM6403constructorimpl17, Color.m3926copywmQWz5c$default(companion11116.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy16 = BoxKt.maybeCachedBoxMeasurePolicy(companion26.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN18);
                        constructor7 = companion11110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion11110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy16, composerM3407constructorimpl7, currentCompositionLocalMap111117);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111117, companion11110.getSetModifier());
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion11116.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11115.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f1119 = f11;
                        b.r(composerStartRestartGroup, f1119, companion25, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults15 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU119 = companion11116.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU1110 = companion11116.m3962getTransparent0d7_KjU();
                        int i1113 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ8112 = buttonDefaults15.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU119, 0L, jM3962getTransparent0d7_KjU1110, 0L, composerStartRestartGroup, i1113 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_18 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1119));
                        PaddingValues paddingValuesM661PaddingValues0680j_18 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default15 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1119)), false, 0L, Color.m3926copywmQWz5c$default(j13, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default15, false, roundedCornerShapeM955RoundedCornerShape0680j_18, buttonColorsM1520buttonColorsro_MJ8112, null, null, paddingValuesM661PaddingValues0680j_18, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion25, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion25, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f1115, companion25, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default17 = SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy119 = RowKt.rowMeasurePolicy(arrangement6.getStart(), companion26.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default17);
                        constructor8 = companion11110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion11110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy119, composerM3407constructorimpl8, currentCompositionLocalMap111118);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111118, companion11110.getSetModifier());
                        Icons.Filled filled15 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion25, 1.0f, false, 2, null), PreviewKt.getPreview(filled15), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion25, Dp.m6403constructorimpl(f118)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion25, 1.0f, false, 2, null), ShareKt.getShare(filled15), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f118, companion25, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), buttonDefaults15.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1113 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        rowScopeInstance2 = rowScopeInstance;
                    }
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG110);
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111115, companion11110.getSetModifier());
                    TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion25, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy19 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion26.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion25);
                    constructor6 = companion11110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG2 = p035i0.a.g(companion11110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy19, composerM3407constructorimpl6, currentCompositionLocalMap111119);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111119, companion11110.getSetModifier());
                    ColumnScopeInstance columnScopeInstance17 = ColumnScopeInstance.INSTANCE;
                    FontWeight.Companion companion11117 = FontWeight.Companion;
                    TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11117.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                    TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Modifier modifierBackground$default17 = BackgroundKt.background$default(ClipKt.clip(companion25, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j13), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    float fM6403constructorimpl18 = Dp.m6403constructorimpl(f1116);
                    Color.Companion companion11118 = Color.Companion;
                    Modifier modifierM669paddingVpY3zN19 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default17, fM6403constructorimpl18, Color.m3926copywmQWz5c$default(companion11118.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy17 = BoxKt.maybeCachedBoxMeasurePolicy(companion26.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN19);
                    constructor7 = companion11110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG3 = p035i0.a.g(companion11110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy17, composerM3407constructorimpl7, currentCompositionLocalMap1111110);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1111110, companion11110.getSetModifier());
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion11118.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11117.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                    float f11110 = f11;
                    b.r(composerStartRestartGroup, f11110, companion25, composerStartRestartGroup, 6);
                    ButtonDefaults buttonDefaults16 = ButtonDefaults.INSTANCE;
                    long jM3962getTransparent0d7_KjU1111 = companion11118.m3962getTransparent0d7_KjU();
                    long jM3962getTransparent0d7_KjU1112 = companion11118.m3962getTransparent0d7_KjU();
                    int i1114 = ButtonDefaults.$stable << 12;
                    ButtonColors buttonColorsM1520buttonColorsro_MJ8113 = buttonDefaults16.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU1111, 0L, jM3962getTransparent0d7_KjU1112, 0L, composerStartRestartGroup, i1114 | 390, 10);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_19 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11110));
                    PaddingValues paddingValuesM661PaddingValues0680j_19 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                    Modifier modifierM3585shadows4CzXII$default16 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11110)), false, 0L, Color.m3926copywmQWz5c$default(j13, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                    composerStartRestartGroup.startReplaceGroup(596080364);
                    if ((i16 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z6) {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default16, false, roundedCornerShapeM955RoundedCornerShape0680j_19, buttonColorsM1520buttonColorsro_MJ8113, null, null, paddingValuesM661PaddingValues0680j_19, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                    b.m(f7, companion25, composerStartRestartGroup, 6);
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                    b.m(f6, companion25, composerStartRestartGroup, 6);
                    j.a(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                    b.m(f1115, companion25, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default18 = SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy1110 = RowKt.rowMeasurePolicy(arrangement6.getStart(), companion26.getTop(), composerStartRestartGroup, i9);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                    CompositionLocalMap currentCompositionLocalMap1111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default18);
                    constructor8 = companion11110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion11110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy1110, composerM3407constructorimpl8, currentCompositionLocalMap1111111);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111111, companion11110.getSetModifier());
                    Icons.Filled filled16 = Icons.Filled.INSTANCE;
                    i10 = 6;
                    composer2 = composerStartRestartGroup;
                    q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion25, 1.0f, false, 2, null), PreviewKt.getPreview(filled16), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion25, Dp.m6403constructorimpl(f118)), composer2, 6);
                    q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion25, 1.0f, false, 2, null), ShareKt.getShare(filled16), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                    b.n(composer2, f118, companion25, composer2, 6);
                    ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion25, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f118)), buttonDefaults16.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1114 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                    composer2.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(100)), composer2, i10);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            }
            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG5);
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance18 = ColumnScopeInstance.INSTANCE;
            f7 = 32;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f7)), composerStartRestartGroup, 6);
            Modifier modifierM713size3ABfNKs2 = SizeKt.m713size3ABfNKs(ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()), Dp.m6403constructorimpl(72));
            f8 = 16;
            float fM6403constructorimpl19 = Dp.m6403constructorimpl(f8);
            RoundedCornerShape circleShape2 = RoundedCornerShapeKt.getCircleShape();
            long j14 = p107y3.a.f15994w;
            Modifier modifierBackground$default18 = BackgroundKt.background$default(ClipKt.clip(ShadowKt.m3585shadows4CzXII$default(modifierM713size3ABfNKs2, fM6403constructorimpl19, circleShape2, false, 0L, Color.m3926copywmQWz5c$default(j14, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 12, null), RoundedCornerShapeKt.getCircleShape()), Brush.Companion.m3878linearGradientmHitzGk$default(Brush.Companion, v.S(Color.m3917boximpl(j14), Color.m3917boximpl(p107y3.a.f15995x)), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy18 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap25 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier25 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBackground$default18);
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
            e eVarG20 = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy18, composerM3407constructorimpl, currentCompositionLocalMap25);
            if (composerM3407constructorimpl.getInserting()) {
                arrangement = arrangement2;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier25, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f7)), Color.Companion.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
                b.n(composerStartRestartGroup, f8, companion2, composerStartRestartGroup, 6);
                MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                int i1115 = MaterialTheme.$stable;
                TextStyle headlineMedium3 = materialTheme3.getTypography(composerStartRestartGroup, i1115).getHeadlineMedium();
                FontWeight bold3 = FontWeight.Companion.getBold();
                long j15 = p107y3.a.f15990o;
                TextAlign.Companion companion27 = TextAlign.Companion;
                TextKt.m2432Text4IGK_g("Custom Printed Notebook", (Modifier) null, j15, 0L, (FontStyle) null, bold3, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion27.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineMedium3, composerStartRestartGroup, 196998, 0, 64986);
                f9 = 8;
                b.m(f9, companion2, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("Get your custom printed notebook at your doorstep within 3-7 days.", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion27.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, materialTheme3.getTypography(composerStartRestartGroup, i1115).getBodyMedium(), composerStartRestartGroup, 390, 3072, 56826);
                b.m(f7, companion2, composerStartRestartGroup, 6);
                if (z4) {
                    composerStartRestartGroup.startReplaceGroup(1287422980);
                    j.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-947718731, true, new C2789ze(z3, onDownload, f5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion2;
                    composer2 = composerStartRestartGroup;
                    i10 = 6;
                } else {
                    objJ = b.j(1293030074, composerStartRestartGroup, 595893182);
                    if (objJ == companion3.getEmpty()) {
                        objJ = new f(5);
                        composerStartRestartGroup.updateRememberedValue(objJ);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (a) objJ, composerStartRestartGroup, 384, 3);
                    composerStartRestartGroup.startReplaceGroup(595895268);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion3.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean bool4 = (Boolean) mutableState.getValue();
                    bool4.getClass();
                    composerStartRestartGroup.startReplaceGroup(595898523);
                    zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = null;
                        objRememberedValue2 = new Ae(pagerStateRememberPagerState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        obj = null;
                        objRememberedValue2 = new Ae(pagerStateRememberPagerState, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(pagerStateRememberPagerState, bool4, (e) objRememberedValue2, composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default19 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj);
                    MeasurePolicy measurePolicyColumnMeasurePolicy110 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap26 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier26 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default19);
                    constructor2 = companion5.getConstructor();
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
                    eVarG = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy110, composerM3407constructorimpl2, currentCompositionLocalMap26);
                    if (composerM3407constructorimpl2.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier26, companion5.getSetModifier());
                    float f1120 = 64;
                    PagerKt.m907HorizontalPageroI3XNZo(pagerStateRememberPagerState, SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(260)), PaddingKt.m663PaddingValuesYgX7TsA$default(Dp.m6403constructorimpl(f1120), 0.0f, 2, null), null, 0, Dp.m6403constructorimpl(f8), null, null, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(2004631153, true, new Ce(pagerStateRememberPagerState, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 197040, 3072, 8152);
                    float f1121 = 12;
                    b.m(f1121, companion2, composerStartRestartGroup, 6);
                    f10 = 6;
                    MeasurePolicy measurePolicyRowMeasurePolicy120 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap27 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier27 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                    constructor3 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG111 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy120, composerM3407constructorimpl3, currentCompositionLocalMap27);
                    if (composerM3407constructorimpl3.getInserting()) {
                        companion = companion2;
                        if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier27, companion5.getSetModifier());
                        RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(2099120915);
                        size = f13941a.size();
                        while (i8 < size) {
                            if (pagerStateRememberPagerState.getCurrentPage() == i8) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            Modifier.Companion companion11119 = Modifier.Companion;
                            if (z7) {
                                fM6403constructorimpl = Dp.m6403constructorimpl(f9);
                            } else {
                                fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                            }
                            Modifier modifierClip5 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion11119, fM6403constructorimpl), RoundedCornerShapeKt.getCircleShape());
                            if (z7) {
                                jM3926copywmQWz5c$default = p107y3.a.f15980c;
                            } else {
                                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierClip5, jM3926copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier.Companion companion28 = Modifier.Companion;
                        float f11111 = 20;
                        b.m(f11111, companion28, composerStartRestartGroup, 6);
                        Modifier modifierG5 = b.g(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), f1121);
                        long j16 = p107y3.a.f15978a;
                        float f11112 = 1;
                        Modifier modifierM668padding3ABfNKs5 = PaddingKt.m668padding3ABfNKs(b.e(f1121, BackgroundKt.m207backgroundbw27NRU$default(modifierG5, Color.m3926copywmQWz5c$default(j16, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11112), Color.m3926copywmQWz5c$default(j16, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8));
                        Alignment.Companion companion29 = Alignment.Companion;
                        Alignment.Vertical centerVertically13 = companion29.getCenterVertically();
                        Arrangement arrangement7 = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy1111 = RowKt.rowMeasurePolicy(arrangement7.getSpaceBetween(), centerVertically13, composerStartRestartGroup, 54);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap28 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier28 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs5);
                        ComposeUiNode.Companion companion111110 = ComposeUiNode.Companion;
                        constructor4 = companion111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG112 = p035i0.a.g(companion111110, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy1111, composerM3407constructorimpl4, currentCompositionLocalMap28);
                        if (composerM3407constructorimpl4.getInserting()) {
                            f11 = f8;
                            if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier28, companion111110.getSetModifier());
                            rowScopeInstance = RowScopeInstance.INSTANCE;
                            Alignment.Vertical centerVertically14 = companion29.getCenterVertically();
                            Modifier modifierWeight$default9 = RowScope.weight$default(rowScopeInstance, companion28, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy1112 = RowKt.rowMeasurePolicy(arrangement7.getStart(), centerVertically14, composerStartRestartGroup, 48);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default9);
                            constructor5 = companion111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor5);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            e eVarG113 = p035i0.a.g(companion111110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy1112, composerM3407constructorimpl5, currentCompositionLocalMap1111112);
                            if (composerM3407constructorimpl5.getInserting()) {
                                rowScopeInstance2 = rowScopeInstance;
                                if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111112, companion111110.getSetModifier());
                                TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion28, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                                MeasurePolicy measurePolicyColumnMeasurePolicy111 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), companion29.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap1111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion28);
                                constructor6 = companion111110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor6);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG2 = p035i0.a.g(companion111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy111, composerM3407constructorimpl6, currentCompositionLocalMap1111113);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111113, companion111110.getSetModifier());
                                ColumnScopeInstance columnScopeInstance19 = ColumnScopeInstance.INSTANCE;
                                FontWeight.Companion companion111111 = FontWeight.Companion;
                                TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111111.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                                TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                Modifier modifierBackground$default19 = BackgroundKt.background$default(ClipKt.clip(companion28, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j16), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                                float fM6403constructorimpl110 = Dp.m6403constructorimpl(f11112);
                                Color.Companion companion111112 = Color.Companion;
                                Modifier modifierM669paddingVpY3zN110 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default19, fM6403constructorimpl110, Color.m3926copywmQWz5c$default(companion111112.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy19 = BoxKt.maybeCachedBoxMeasurePolicy(companion29.getTopStart(), false);
                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap1111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN110);
                                constructor7 = companion111110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor7);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG3 = p035i0.a.g(companion111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy19, composerM3407constructorimpl7, currentCompositionLocalMap1111114);
                                if (composerM3407constructorimpl7.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1111114, companion111110.getSetModifier());
                                BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                                TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion111112.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111111.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                                float f11113 = f11;
                                b.r(composerStartRestartGroup, f11113, companion28, composerStartRestartGroup, 6);
                                ButtonDefaults buttonDefaults17 = ButtonDefaults.INSTANCE;
                                long jM3962getTransparent0d7_KjU1113 = companion111112.m3962getTransparent0d7_KjU();
                                long jM3962getTransparent0d7_KjU1114 = companion111112.m3962getTransparent0d7_KjU();
                                int i1116 = ButtonDefaults.$stable << 12;
                                ButtonColors buttonColorsM1520buttonColorsro_MJ8114 = buttonDefaults17.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU1113, 0L, jM3962getTransparent0d7_KjU1114, 0L, composerStartRestartGroup, i1116 | 390, 10);
                                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_110 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11113));
                                PaddingValues paddingValuesM661PaddingValues0680j_110 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                                Modifier modifierM3585shadows4CzXII$default17 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), Dp.m6403constructorimpl(f1120), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11113)), false, 0L, Color.m3926copywmQWz5c$default(j16, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                                composerStartRestartGroup.startReplaceGroup(596080364);
                                if ((i16 & 112) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z6) {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    i9 = 0;
                                    objRememberedValue3 = new O(18, onNavigateToPrint);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default17, false, roundedCornerShapeM955RoundedCornerShape0680j_110, buttonColorsM1520buttonColorsro_MJ8114, null, null, paddingValuesM661PaddingValues0680j_110, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                                b.m(f7, companion28, composerStartRestartGroup, 6);
                                DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                                b.m(f6, companion28, composerStartRestartGroup, 6);
                                j.a(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                                b.m(f11111, companion28, composerStartRestartGroup, 6);
                                Modifier modifierFillMaxWidth$default110 = SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy1113 = RowKt.rowMeasurePolicy(arrangement7.getStart(), companion29.getTop(), composerStartRestartGroup, i9);
                                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                                CompositionLocalMap currentCompositionLocalMap1111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default110);
                                constructor8 = companion111110.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor8);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                                eVarG4 = p035i0.a.g(companion111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy1113, composerM3407constructorimpl8, currentCompositionLocalMap1111115);
                                if (composerM3407constructorimpl8.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111115, companion111110.getSetModifier());
                                Icons.Filled filled17 = Icons.Filled.INSTANCE;
                                i10 = 6;
                                composer2 = composerStartRestartGroup;
                                q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion28, 1.0f, false, 2, null), PreviewKt.getPreview(filled17), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion28, Dp.m6403constructorimpl(f1121)), composer2, 6);
                                q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion28, 1.0f, false, 2, null), ShareKt.getShare(filled17), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                                b.n(composer2, f1121, companion28, composer2, 6);
                                ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), buttonDefaults17.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1116 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                                composer2.endReplaceGroup();
                            } else {
                                rowScopeInstance2 = rowScopeInstance;
                            }
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG113);
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111112, companion111110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion28, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy112 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), companion29.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion28);
                            constructor6 = companion111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy112, composerM3407constructorimpl6, currentCompositionLocalMap1111116);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111116, companion111110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance110 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion111113 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111113.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default110 = BackgroundKt.background$default(ClipKt.clip(companion28, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j16), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl111 = Dp.m6403constructorimpl(f11112);
                            Color.Companion companion111114 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN111 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default110, fM6403constructorimpl111, Color.m3926copywmQWz5c$default(companion111114.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy110 = BoxKt.maybeCachedBoxMeasurePolicy(companion29.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN111);
                            constructor7 = companion111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy110, composerM3407constructorimpl7, currentCompositionLocalMap1111117);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1111117, companion111110.getSetModifier());
                            BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion111114.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111113.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f11114 = f11;
                            b.r(composerStartRestartGroup, f11114, companion28, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults18 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU1115 = companion111114.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU1116 = companion111114.m3962getTransparent0d7_KjU();
                            int i1117 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ8115 = buttonDefaults18.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU1115, 0L, jM3962getTransparent0d7_KjU1116, 0L, composerStartRestartGroup, i1117 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_111 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11114));
                            PaddingValues paddingValuesM661PaddingValues0680j_111 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default18 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), Dp.m6403constructorimpl(f1120), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11114)), false, 0L, Color.m3926copywmQWz5c$default(j16, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default18, false, roundedCornerShapeM955RoundedCornerShape0680j_111, buttonColorsM1520buttonColorsro_MJ8115, null, null, paddingValuesM661PaddingValues0680j_111, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion28, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion28, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f11111, companion28, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default111 = SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy1114 = RowKt.rowMeasurePolicy(arrangement7.getStart(), companion29.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap1111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default111);
                            constructor8 = companion111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy1114, composerM3407constructorimpl8, currentCompositionLocalMap1111118);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111118, companion111110.getSetModifier());
                            Icons.Filled filled18 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion28, 1.0f, false, 2, null), PreviewKt.getPreview(filled18), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion28, Dp.m6403constructorimpl(f1121)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion28, 1.0f, false, 2, null), ShareKt.getShare(filled18), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f1121, companion28, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), buttonDefaults18.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1117 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            f11 = f8;
                        }
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG112);
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier28, companion111110.getSetModifier());
                        rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically15 = companion29.getCenterVertically();
                        Modifier modifierWeight$default10 = RowScope.weight$default(rowScopeInstance, companion28, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy1115 = RowKt.rowMeasurePolicy(arrangement7.getStart(), centerVertically15, composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default10);
                        constructor5 = companion111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG114 = p035i0.a.g(companion111110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy1115, composerM3407constructorimpl5, currentCompositionLocalMap1111119);
                        if (composerM3407constructorimpl5.getInserting()) {
                            rowScopeInstance2 = rowScopeInstance;
                            if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111119, companion111110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion28, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy113 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), companion29.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion28);
                            constructor6 = companion111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy113, composerM3407constructorimpl6, currentCompositionLocalMap11111110);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111110, companion111110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance111 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion111115 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111115.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default111 = BackgroundKt.background$default(ClipKt.clip(companion28, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j16), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl112 = Dp.m6403constructorimpl(f11112);
                            Color.Companion companion111116 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN112 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default111, fM6403constructorimpl112, Color.m3926copywmQWz5c$default(companion111116.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111 = BoxKt.maybeCachedBoxMeasurePolicy(companion29.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN112);
                            constructor7 = companion111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy111, composerM3407constructorimpl7, currentCompositionLocalMap11111111);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11111111, companion111110.getSetModifier());
                            BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion111116.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111115.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f11115 = f11;
                            b.r(composerStartRestartGroup, f11115, companion28, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults19 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU1117 = companion111116.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU1118 = companion111116.m3962getTransparent0d7_KjU();
                            int i1118 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ8116 = buttonDefaults19.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU1117, 0L, jM3962getTransparent0d7_KjU1118, 0L, composerStartRestartGroup, i1118 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_112 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11115));
                            PaddingValues paddingValuesM661PaddingValues0680j_112 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default19 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), Dp.m6403constructorimpl(f1120), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11115)), false, 0L, Color.m3926copywmQWz5c$default(j16, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default19, false, roundedCornerShapeM955RoundedCornerShape0680j_112, buttonColorsM1520buttonColorsro_MJ8116, null, null, paddingValuesM661PaddingValues0680j_112, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion28, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion28, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f11111, companion28, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default112 = SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy1116 = RowKt.rowMeasurePolicy(arrangement7.getStart(), companion29.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap11111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default112);
                            constructor8 = companion111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy1116, composerM3407constructorimpl8, currentCompositionLocalMap11111112);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111112, companion111110.getSetModifier());
                            Icons.Filled filled19 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion28, 1.0f, false, 2, null), PreviewKt.getPreview(filled19), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion28, Dp.m6403constructorimpl(f1121)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion28, 1.0f, false, 2, null), ShareKt.getShare(filled19), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f1121, companion28, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), buttonDefaults19.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1118 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            rowScopeInstance2 = rowScopeInstance;
                        }
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG114);
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111119, companion111110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion28, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy114 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), companion29.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion28);
                        constructor6 = companion111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy114, composerM3407constructorimpl6, currentCompositionLocalMap11111113);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111113, companion111110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance112 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion111117 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111117.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default112 = BackgroundKt.background$default(ClipKt.clip(companion28, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j16), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl113 = Dp.m6403constructorimpl(f11112);
                        Color.Companion companion111118 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN113 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default112, fM6403constructorimpl113, Color.m3926copywmQWz5c$default(companion111118.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy112 = BoxKt.maybeCachedBoxMeasurePolicy(companion29.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN113);
                        constructor7 = companion111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy112, composerM3407constructorimpl7, currentCompositionLocalMap11111114);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11111114, companion111110.getSetModifier());
                        BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion111118.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111117.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f11116 = f11;
                        b.r(composerStartRestartGroup, f11116, companion28, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults110 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU1119 = companion111118.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU11110 = companion111118.m3962getTransparent0d7_KjU();
                        int i1119 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ8117 = buttonDefaults110.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU1119, 0L, jM3962getTransparent0d7_KjU11110, 0L, composerStartRestartGroup, i1119 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_113 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11116));
                        PaddingValues paddingValuesM661PaddingValues0680j_113 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default110 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), Dp.m6403constructorimpl(f1120), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11116)), false, 0L, Color.m3926copywmQWz5c$default(j16, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default110, false, roundedCornerShapeM955RoundedCornerShape0680j_113, buttonColorsM1520buttonColorsro_MJ8117, null, null, paddingValuesM661PaddingValues0680j_113, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion28, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion28, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f11111, companion28, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default113 = SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy1117 = RowKt.rowMeasurePolicy(arrangement7.getStart(), companion29.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap11111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default113);
                        constructor8 = companion111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy1117, composerM3407constructorimpl8, currentCompositionLocalMap11111115);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111115, companion111110.getSetModifier());
                        Icons.Filled filled110 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion28, 1.0f, false, 2, null), PreviewKt.getPreview(filled110), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion28, Dp.m6403constructorimpl(f1121)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion28, 1.0f, false, 2, null), ShareKt.getShare(filled110), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f1121, companion28, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion28, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), buttonDefaults110.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i1119 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        companion = companion2;
                    }
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG111);
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier27, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(2099120915);
                    size = f13941a.size();
                    while (i8 < size) {
                        if (pagerStateRememberPagerState.getCurrentPage() == i8) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        Modifier.Companion companion111119 = Modifier.Companion;
                        if (z7) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(f9);
                        } else {
                            fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                        }
                        Modifier modifierClip6 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion111119, fM6403constructorimpl), RoundedCornerShapeKt.getCircleShape());
                        if (z7) {
                            jM3926copywmQWz5c$default = p107y3.a.f15980c;
                        } else {
                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierClip6, jM3926copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Modifier.Companion companion210 = Modifier.Companion;
                    float f11117 = 20;
                    b.m(f11117, companion210, composerStartRestartGroup, 6);
                    Modifier modifierG6 = b.g(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), f1121);
                    long j17 = p107y3.a.f15978a;
                    float f11118 = 1;
                    Modifier modifierM668padding3ABfNKs6 = PaddingKt.m668padding3ABfNKs(b.e(f1121, BackgroundKt.m207backgroundbw27NRU$default(modifierG6, Color.m3926copywmQWz5c$default(j17, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f11118), Color.m3926copywmQWz5c$default(j17, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8));
                    Alignment.Companion companion211 = Alignment.Companion;
                    Alignment.Vertical centerVertically16 = companion211.getCenterVertically();
                    Arrangement arrangement8 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy1118 = RowKt.rowMeasurePolicy(arrangement8.getSpaceBetween(), centerVertically16, composerStartRestartGroup, 54);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap29 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier29 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs6);
                    ComposeUiNode.Companion companion1111110 = ComposeUiNode.Companion;
                    constructor4 = companion1111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG115 = p035i0.a.g(companion1111110, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy1118, composerM3407constructorimpl4, currentCompositionLocalMap29);
                    if (composerM3407constructorimpl4.getInserting()) {
                        f11 = f8;
                        if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier29, companion1111110.getSetModifier());
                        rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically17 = companion211.getCenterVertically();
                        Modifier modifierWeight$default11 = RowScope.weight$default(rowScopeInstance, companion210, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy1119 = RowKt.rowMeasurePolicy(arrangement8.getStart(), centerVertically17, composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default11);
                        constructor5 = companion1111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG116 = p035i0.a.g(companion1111110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy1119, composerM3407constructorimpl5, currentCompositionLocalMap11111116);
                        if (composerM3407constructorimpl5.getInserting()) {
                            rowScopeInstance2 = rowScopeInstance;
                            if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111116, companion1111110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion210, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy115 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion211.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion210);
                            constructor6 = companion1111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion1111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy115, composerM3407constructorimpl6, currentCompositionLocalMap11111117);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111117, companion1111110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance113 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion1111111 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion1111111.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default113 = BackgroundKt.background$default(ClipKt.clip(companion210, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j17), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl114 = Dp.m6403constructorimpl(f11118);
                            Color.Companion companion1111112 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN114 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default113, fM6403constructorimpl114, Color.m3926copywmQWz5c$default(companion1111112.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy113 = BoxKt.maybeCachedBoxMeasurePolicy(companion211.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap11111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN114);
                            constructor7 = companion1111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion1111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy113, composerM3407constructorimpl7, currentCompositionLocalMap11111118);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11111118, companion1111110.getSetModifier());
                            BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion1111112.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion1111111.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f11119 = f11;
                            b.r(composerStartRestartGroup, f11119, companion210, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults111 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU11111 = companion1111112.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU11112 = companion1111112.m3962getTransparent0d7_KjU();
                            int i11110 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ8118 = buttonDefaults111.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU11111, 0L, jM3962getTransparent0d7_KjU11112, 0L, composerStartRestartGroup, i11110 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_114 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11119));
                            PaddingValues paddingValuesM661PaddingValues0680j_114 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default111 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), Dp.m6403constructorimpl(f1120), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11119)), false, 0L, Color.m3926copywmQWz5c$default(j17, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default111, false, roundedCornerShapeM955RoundedCornerShape0680j_114, buttonColorsM1520buttonColorsro_MJ8118, null, null, paddingValuesM661PaddingValues0680j_114, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion210, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion210, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f11117, companion210, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default114 = SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy11110 = RowKt.rowMeasurePolicy(arrangement8.getStart(), companion211.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap11111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default114);
                            constructor8 = companion1111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion1111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy11110, composerM3407constructorimpl8, currentCompositionLocalMap11111119);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111119, companion1111110.getSetModifier());
                            Icons.Filled filled111 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion210, 1.0f, false, 2, null), PreviewKt.getPreview(filled111), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion210, Dp.m6403constructorimpl(f1121)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion210, 1.0f, false, 2, null), ShareKt.getShare(filled111), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f1121, companion210, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), buttonDefaults111.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11110 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            rowScopeInstance2 = rowScopeInstance;
                        }
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG116);
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111116, companion1111110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion210, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy116 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion211.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion210);
                        constructor6 = companion1111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion1111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy116, composerM3407constructorimpl6, currentCompositionLocalMap111111110);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111111110, companion1111110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance114 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion1111113 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion1111113.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default114 = BackgroundKt.background$default(ClipKt.clip(companion210, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j17), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl115 = Dp.m6403constructorimpl(f11118);
                        Color.Companion companion1111114 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN115 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default114, fM6403constructorimpl115, Color.m3926copywmQWz5c$default(companion1111114.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy114 = BoxKt.maybeCachedBoxMeasurePolicy(companion211.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN115);
                        constructor7 = companion1111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion1111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy114, composerM3407constructorimpl7, currentCompositionLocalMap111111111);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111111111, companion1111110.getSetModifier());
                        BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion1111114.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion1111113.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f111110 = f11;
                        b.r(composerStartRestartGroup, f111110, companion210, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults112 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU11113 = companion1111114.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU11114 = companion1111114.m3962getTransparent0d7_KjU();
                        int i11111 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ8119 = buttonDefaults112.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU11113, 0L, jM3962getTransparent0d7_KjU11114, 0L, composerStartRestartGroup, i11111 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_115 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111110));
                        PaddingValues paddingValuesM661PaddingValues0680j_115 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default112 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), Dp.m6403constructorimpl(f1120), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111110)), false, 0L, Color.m3926copywmQWz5c$default(j17, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default112, false, roundedCornerShapeM955RoundedCornerShape0680j_115, buttonColorsM1520buttonColorsro_MJ8119, null, null, paddingValuesM661PaddingValues0680j_115, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion210, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion210, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f11117, companion210, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default115 = SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy11111 = RowKt.rowMeasurePolicy(arrangement8.getStart(), companion211.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap111111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default115);
                        constructor8 = companion1111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion1111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy11111, composerM3407constructorimpl8, currentCompositionLocalMap111111112);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111112, companion1111110.getSetModifier());
                        Icons.Filled filled112 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion210, 1.0f, false, 2, null), PreviewKt.getPreview(filled112), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion210, Dp.m6403constructorimpl(f1121)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion210, 1.0f, false, 2, null), ShareKt.getShare(filled112), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f1121, companion210, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), buttonDefaults112.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11111 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        f11 = f8;
                    }
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG115);
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier29, companion1111110.getSetModifier());
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically18 = companion211.getCenterVertically();
                    Modifier modifierWeight$default12 = RowScope.weight$default(rowScopeInstance, companion210, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy11112 = RowKt.rowMeasurePolicy(arrangement8.getStart(), centerVertically18, composerStartRestartGroup, 48);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default12);
                    constructor5 = companion1111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG117 = p035i0.a.g(companion1111110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy11112, composerM3407constructorimpl5, currentCompositionLocalMap111111113);
                    if (composerM3407constructorimpl5.getInserting()) {
                        rowScopeInstance2 = rowScopeInstance;
                        if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111111113, companion1111110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion210, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy117 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion211.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion210);
                        constructor6 = companion1111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion1111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy117, composerM3407constructorimpl6, currentCompositionLocalMap111111114);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111111114, companion1111110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance115 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion1111115 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion1111115.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default115 = BackgroundKt.background$default(ClipKt.clip(companion210, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j17), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl116 = Dp.m6403constructorimpl(f11118);
                        Color.Companion companion1111116 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN116 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default115, fM6403constructorimpl116, Color.m3926copywmQWz5c$default(companion1111116.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy115 = BoxKt.maybeCachedBoxMeasurePolicy(companion211.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap111111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN116);
                        constructor7 = companion1111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion1111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy115, composerM3407constructorimpl7, currentCompositionLocalMap111111115);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111111115, companion1111110.getSetModifier());
                        BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion1111116.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion1111115.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f111111 = f11;
                        b.r(composerStartRestartGroup, f111111, companion210, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults113 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU11115 = companion1111116.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU11116 = companion1111116.m3962getTransparent0d7_KjU();
                        int i11112 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ81110 = buttonDefaults113.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU11115, 0L, jM3962getTransparent0d7_KjU11116, 0L, composerStartRestartGroup, i11112 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_116 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111111));
                        PaddingValues paddingValuesM661PaddingValues0680j_116 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default113 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), Dp.m6403constructorimpl(f1120), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111111)), false, 0L, Color.m3926copywmQWz5c$default(j17, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default113, false, roundedCornerShapeM955RoundedCornerShape0680j_116, buttonColorsM1520buttonColorsro_MJ81110, null, null, paddingValuesM661PaddingValues0680j_116, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion210, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion210, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f11117, companion210, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default116 = SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy11113 = RowKt.rowMeasurePolicy(arrangement8.getStart(), companion211.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap111111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default116);
                        constructor8 = companion1111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion1111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy11113, composerM3407constructorimpl8, currentCompositionLocalMap111111116);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111116, companion1111110.getSetModifier());
                        Icons.Filled filled113 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion210, 1.0f, false, 2, null), PreviewKt.getPreview(filled113), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion210, Dp.m6403constructorimpl(f1121)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion210, 1.0f, false, 2, null), ShareKt.getShare(filled113), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f1121, companion210, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), buttonDefaults113.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11112 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        rowScopeInstance2 = rowScopeInstance;
                    }
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG117);
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111111113, companion1111110.getSetModifier());
                    TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion210, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy118 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion211.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion210);
                    constructor6 = companion1111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG2 = p035i0.a.g(companion1111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy118, composerM3407constructorimpl6, currentCompositionLocalMap111111117);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111111117, companion1111110.getSetModifier());
                    ColumnScopeInstance columnScopeInstance116 = ColumnScopeInstance.INSTANCE;
                    FontWeight.Companion companion1111117 = FontWeight.Companion;
                    TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion1111117.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                    TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Modifier modifierBackground$default116 = BackgroundKt.background$default(ClipKt.clip(companion210, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j17), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    float fM6403constructorimpl117 = Dp.m6403constructorimpl(f11118);
                    Color.Companion companion1111118 = Color.Companion;
                    Modifier modifierM669paddingVpY3zN117 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default116, fM6403constructorimpl117, Color.m3926copywmQWz5c$default(companion1111118.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy116 = BoxKt.maybeCachedBoxMeasurePolicy(companion211.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN117);
                    constructor7 = companion1111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG3 = p035i0.a.g(companion1111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy116, composerM3407constructorimpl7, currentCompositionLocalMap111111118);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111111118, companion1111110.getSetModifier());
                    BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                    TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion1111118.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion1111117.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                    float f111112 = f11;
                    b.r(composerStartRestartGroup, f111112, companion210, composerStartRestartGroup, 6);
                    ButtonDefaults buttonDefaults114 = ButtonDefaults.INSTANCE;
                    long jM3962getTransparent0d7_KjU11117 = companion1111118.m3962getTransparent0d7_KjU();
                    long jM3962getTransparent0d7_KjU11118 = companion1111118.m3962getTransparent0d7_KjU();
                    int i11113 = ButtonDefaults.$stable << 12;
                    ButtonColors buttonColorsM1520buttonColorsro_MJ81111 = buttonDefaults114.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU11117, 0L, jM3962getTransparent0d7_KjU11118, 0L, composerStartRestartGroup, i11113 | 390, 10);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_117 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111112));
                    PaddingValues paddingValuesM661PaddingValues0680j_117 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                    Modifier modifierM3585shadows4CzXII$default114 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), Dp.m6403constructorimpl(f1120), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111112)), false, 0L, Color.m3926copywmQWz5c$default(j17, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                    composerStartRestartGroup.startReplaceGroup(596080364);
                    if ((i16 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z6) {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default114, false, roundedCornerShapeM955RoundedCornerShape0680j_117, buttonColorsM1520buttonColorsro_MJ81111, null, null, paddingValuesM661PaddingValues0680j_117, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                    b.m(f7, companion210, composerStartRestartGroup, 6);
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                    b.m(f6, companion210, composerStartRestartGroup, 6);
                    j.a(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                    b.m(f11117, companion210, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default117 = SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy11114 = RowKt.rowMeasurePolicy(arrangement8.getStart(), companion211.getTop(), composerStartRestartGroup, i9);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                    CompositionLocalMap currentCompositionLocalMap111111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default117);
                    constructor8 = companion1111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion1111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy11114, composerM3407constructorimpl8, currentCompositionLocalMap111111119);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111119, companion1111110.getSetModifier());
                    Icons.Filled filled114 = Icons.Filled.INSTANCE;
                    i10 = 6;
                    composer2 = composerStartRestartGroup;
                    q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion210, 1.0f, false, 2, null), PreviewKt.getPreview(filled114), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion210, Dp.m6403constructorimpl(f1121)), composer2, 6);
                    q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion210, 1.0f, false, 2, null), ShareKt.getShare(filled114), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                    b.n(composer2, f1121, companion210, composer2, 6);
                    ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion210, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1121)), buttonDefaults114.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11113 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                    composer2.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(100)), composer2, i10);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                arrangement = arrangement2;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG20);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier25, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), "Success", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f7)), Color.Companion.m3964getWhite0d7_KjU(), composerStartRestartGroup, 3504, 0);
            b.n(composerStartRestartGroup, f8, companion2, composerStartRestartGroup, 6);
            MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
            int i11114 = MaterialTheme.$stable;
            TextStyle headlineMedium4 = materialTheme4.getTypography(composerStartRestartGroup, i11114).getHeadlineMedium();
            FontWeight bold4 = FontWeight.Companion.getBold();
            long j18 = p107y3.a.f15990o;
            TextAlign.Companion companion212 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g("Custom Printed Notebook", (Modifier) null, j18, 0L, (FontStyle) null, bold4, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion212.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, headlineMedium4, composerStartRestartGroup, 196998, 0, 64986);
            f9 = 8;
            b.m(f9, companion2, composerStartRestartGroup, 6);
            TextKt.m2432Text4IGK_g("Get your custom printed notebook at your doorstep within 3-7 days.", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion212.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, materialTheme4.getTypography(composerStartRestartGroup, i11114).getBodyMedium(), composerStartRestartGroup, 390, 3072, 56826);
            b.m(f7, companion2, composerStartRestartGroup, 6);
            if (z4) {
                composerStartRestartGroup.startReplaceGroup(1287422980);
                j.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-947718731, true, new C2789ze(z3, onDownload, f5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
                composer2 = composerStartRestartGroup;
                i10 = 6;
            } else {
                objJ = b.j(1293030074, composerStartRestartGroup, 595893182);
                if (objJ == companion3.getEmpty()) {
                    objJ = new f(5);
                    composerStartRestartGroup.updateRememberedValue(objJ);
                }
                composerStartRestartGroup.endReplaceGroup();
                pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (a) objJ, composerStartRestartGroup, 384, 3);
                composerStartRestartGroup.startReplaceGroup(595895268);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion3.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Boolean bool5 = (Boolean) mutableState.getValue();
                bool5.getClass();
                composerStartRestartGroup.startReplaceGroup(595898523);
                zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = null;
                    objRememberedValue2 = new Ae(pagerStateRememberPagerState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    obj = null;
                    objRememberedValue2 = new Ae(pagerStateRememberPagerState, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(pagerStateRememberPagerState, bool5, (e) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default118 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj);
                MeasurePolicy measurePolicyColumnMeasurePolicy119 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap210 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier210 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default118);
                constructor2 = companion5.getConstructor();
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
                eVarG = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy119, composerM3407constructorimpl2, currentCompositionLocalMap210);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier210, companion5.getSetModifier());
                float f1122 = 64;
                PagerKt.m907HorizontalPageroI3XNZo(pagerStateRememberPagerState, SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(260)), PaddingKt.m663PaddingValuesYgX7TsA$default(Dp.m6403constructorimpl(f1122), 0.0f, 2, null), null, 0, Dp.m6403constructorimpl(f8), null, null, false, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(2004631153, true, new Ce(pagerStateRememberPagerState, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 197040, 3072, 8152);
                float f1123 = 12;
                b.m(f1123, companion2, composerStartRestartGroup, 6);
                f10 = 6;
                MeasurePolicy measurePolicyRowMeasurePolicy121 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap211 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier211 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                constructor3 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG118 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy121, composerM3407constructorimpl3, currentCompositionLocalMap211);
                if (composerM3407constructorimpl3.getInserting()) {
                    companion = companion2;
                    if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier211, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(2099120915);
                    size = f13941a.size();
                    while (i8 < size) {
                        if (pagerStateRememberPagerState.getCurrentPage() == i8) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        Modifier.Companion companion1111119 = Modifier.Companion;
                        if (z7) {
                            fM6403constructorimpl = Dp.m6403constructorimpl(f9);
                        } else {
                            fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                        }
                        Modifier modifierClip7 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion1111119, fM6403constructorimpl), RoundedCornerShapeKt.getCircleShape());
                        if (z7) {
                            jM3926copywmQWz5c$default = p107y3.a.f15980c;
                        } else {
                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierClip7, jM3926copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Modifier.Companion companion213 = Modifier.Companion;
                    float f111113 = 20;
                    b.m(f111113, companion213, composerStartRestartGroup, 6);
                    Modifier modifierG7 = b.g(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), f1123);
                    long j19 = p107y3.a.f15978a;
                    float f111114 = 1;
                    Modifier modifierM668padding3ABfNKs7 = PaddingKt.m668padding3ABfNKs(b.e(f1123, BackgroundKt.m207backgroundbw27NRU$default(modifierG7, Color.m3926copywmQWz5c$default(j19, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f111114), Color.m3926copywmQWz5c$default(j19, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8));
                    Alignment.Companion companion214 = Alignment.Companion;
                    Alignment.Vertical centerVertically19 = companion214.getCenterVertically();
                    Arrangement arrangement9 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy11115 = RowKt.rowMeasurePolicy(arrangement9.getSpaceBetween(), centerVertically19, composerStartRestartGroup, 54);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap212 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier212 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs7);
                    ComposeUiNode.Companion companion11111110 = ComposeUiNode.Companion;
                    constructor4 = companion11111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG119 = p035i0.a.g(companion11111110, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy11115, composerM3407constructorimpl4, currentCompositionLocalMap212);
                    if (composerM3407constructorimpl4.getInserting()) {
                        f11 = f8;
                        if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier212, companion11111110.getSetModifier());
                        rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically110 = companion214.getCenterVertically();
                        Modifier modifierWeight$default13 = RowScope.weight$default(rowScopeInstance, companion213, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy11116 = RowKt.rowMeasurePolicy(arrangement9.getStart(), centerVertically110, composerStartRestartGroup, 48);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default13);
                        constructor5 = companion11111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        e eVarG1110 = p035i0.a.g(companion11111110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy11116, composerM3407constructorimpl5, currentCompositionLocalMap1111111110);
                        if (composerM3407constructorimpl5.getInserting()) {
                            rowScopeInstance2 = rowScopeInstance;
                            if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111111110, companion11111110.getSetModifier());
                            TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion213, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                            MeasurePolicy measurePolicyColumnMeasurePolicy1110 = ColumnKt.columnMeasurePolicy(arrangement9.getTop(), companion214.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1111111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion213);
                            constructor6 = companion11111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor6);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG2 = p035i0.a.g(companion11111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1110, composerM3407constructorimpl6, currentCompositionLocalMap1111111111);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111111111, companion11111110.getSetModifier());
                            ColumnScopeInstance columnScopeInstance117 = ColumnScopeInstance.INSTANCE;
                            FontWeight.Companion companion11111111 = FontWeight.Companion;
                            TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11111111.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            Modifier modifierBackground$default117 = BackgroundKt.background$default(ClipKt.clip(companion213, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j19), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            float fM6403constructorimpl118 = Dp.m6403constructorimpl(f111114);
                            Color.Companion companion11111112 = Color.Companion;
                            Modifier modifierM669paddingVpY3zN118 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default117, fM6403constructorimpl118, Color.m3926copywmQWz5c$default(companion11111112.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy117 = BoxKt.maybeCachedBoxMeasurePolicy(companion214.getTopStart(), false);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap1111111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN118);
                            constructor7 = companion11111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG3 = p035i0.a.g(companion11111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy117, composerM3407constructorimpl7, currentCompositionLocalMap1111111112);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1111111112, companion11111110.getSetModifier());
                            BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                            TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion11111112.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11111111.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                            float f111115 = f11;
                            b.r(composerStartRestartGroup, f111115, companion213, composerStartRestartGroup, 6);
                            ButtonDefaults buttonDefaults115 = ButtonDefaults.INSTANCE;
                            long jM3962getTransparent0d7_KjU11119 = companion11111112.m3962getTransparent0d7_KjU();
                            long jM3962getTransparent0d7_KjU111110 = companion11111112.m3962getTransparent0d7_KjU();
                            int i11115 = ButtonDefaults.$stable << 12;
                            ButtonColors buttonColorsM1520buttonColorsro_MJ81112 = buttonDefaults115.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU11119, 0L, jM3962getTransparent0d7_KjU111110, 0L, composerStartRestartGroup, i11115 | 390, 10);
                            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_118 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111115));
                            PaddingValues paddingValuesM661PaddingValues0680j_118 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                            Modifier modifierM3585shadows4CzXII$default115 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), Dp.m6403constructorimpl(f1122), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111115)), false, 0L, Color.m3926copywmQWz5c$default(j19, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                            composerStartRestartGroup.startReplaceGroup(596080364);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z6) {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i9 = 0;
                                objRememberedValue3 = new O(18, onNavigateToPrint);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default115, false, roundedCornerShapeM955RoundedCornerShape0680j_118, buttonColorsM1520buttonColorsro_MJ81112, null, null, paddingValuesM661PaddingValues0680j_118, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                            b.m(f7, companion213, composerStartRestartGroup, 6);
                            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                            b.m(f6, companion213, composerStartRestartGroup, 6);
                            j.a(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                            b.m(f111113, companion213, composerStartRestartGroup, 6);
                            Modifier modifierFillMaxWidth$default119 = SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy11117 = RowKt.rowMeasurePolicy(arrangement9.getStart(), companion214.getTop(), composerStartRestartGroup, i9);
                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                            CompositionLocalMap currentCompositionLocalMap1111111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier1111111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default119);
                            constructor8 = companion11111110.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor8);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                            eVarG4 = p035i0.a.g(companion11111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy11117, composerM3407constructorimpl8, currentCompositionLocalMap1111111113);
                            if (composerM3407constructorimpl8.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111111113, companion11111110.getSetModifier());
                            Icons.Filled filled115 = Icons.Filled.INSTANCE;
                            i10 = 6;
                            composer2 = composerStartRestartGroup;
                            q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion213, 1.0f, false, 2, null), PreviewKt.getPreview(filled115), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion213, Dp.m6403constructorimpl(f1123)), composer2, 6);
                            q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion213, 1.0f, false, 2, null), ShareKt.getShare(filled115), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                            b.n(composer2, f1123, companion213, composer2, 6);
                            ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), buttonDefaults115.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11115 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                            composer2.endReplaceGroup();
                        } else {
                            rowScopeInstance2 = rowScopeInstance;
                        }
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG1110);
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111111110, companion11111110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion213, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy1111 = ColumnKt.columnMeasurePolicy(arrangement9.getTop(), companion214.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion213);
                        constructor6 = companion11111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion11111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1111, composerM3407constructorimpl6, currentCompositionLocalMap1111111114);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111111114, companion11111110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance118 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion11111113 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11111113.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default118 = BackgroundKt.background$default(ClipKt.clip(companion213, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j19), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl119 = Dp.m6403constructorimpl(f111114);
                        Color.Companion companion11111114 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN119 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default118, fM6403constructorimpl119, Color.m3926copywmQWz5c$default(companion11111114.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy118 = BoxKt.maybeCachedBoxMeasurePolicy(companion214.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN119);
                        constructor7 = companion11111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion11111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy118, composerM3407constructorimpl7, currentCompositionLocalMap1111111115);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1111111115, companion11111110.getSetModifier());
                        BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion11111114.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11111113.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f111116 = f11;
                        b.r(composerStartRestartGroup, f111116, companion213, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults116 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU111111 = companion11111114.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU111112 = companion11111114.m3962getTransparent0d7_KjU();
                        int i11116 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ81113 = buttonDefaults116.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU111111, 0L, jM3962getTransparent0d7_KjU111112, 0L, composerStartRestartGroup, i11116 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_119 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111116));
                        PaddingValues paddingValuesM661PaddingValues0680j_119 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default116 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), Dp.m6403constructorimpl(f1122), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111116)), false, 0L, Color.m3926copywmQWz5c$default(j19, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default116, false, roundedCornerShapeM955RoundedCornerShape0680j_119, buttonColorsM1520buttonColorsro_MJ81113, null, null, paddingValuesM661PaddingValues0680j_119, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion213, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion213, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f111113, companion213, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default1110 = SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy11118 = RowKt.rowMeasurePolicy(arrangement9.getStart(), companion214.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap1111111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1110);
                        constructor8 = companion11111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion11111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy11118, composerM3407constructorimpl8, currentCompositionLocalMap1111111116);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1111111116, companion11111110.getSetModifier());
                        Icons.Filled filled116 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion213, 1.0f, false, 2, null), PreviewKt.getPreview(filled116), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion213, Dp.m6403constructorimpl(f1123)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion213, 1.0f, false, 2, null), ShareKt.getShare(filled116), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f1123, companion213, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), buttonDefaults116.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11116 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        f11 = f8;
                    }
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG119);
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier212, companion11111110.getSetModifier());
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically111 = companion214.getCenterVertically();
                    Modifier modifierWeight$default14 = RowScope.weight$default(rowScopeInstance, companion213, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy11119 = RowKt.rowMeasurePolicy(arrangement9.getStart(), centerVertically111, composerStartRestartGroup, 48);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1111111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default14);
                    constructor5 = companion11111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG1111 = p035i0.a.g(companion11111110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy11119, composerM3407constructorimpl5, currentCompositionLocalMap1111111117);
                    if (composerM3407constructorimpl5.getInserting()) {
                        rowScopeInstance2 = rowScopeInstance;
                        if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111111117, companion11111110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion213, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy1112 = ColumnKt.columnMeasurePolicy(arrangement9.getTop(), companion214.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion213);
                        constructor6 = companion11111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion11111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1112, composerM3407constructorimpl6, currentCompositionLocalMap1111111118);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111111118, companion11111110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance119 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion11111115 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11111115.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default119 = BackgroundKt.background$default(ClipKt.clip(companion213, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j19), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl1110 = Dp.m6403constructorimpl(f111114);
                        Color.Companion companion11111116 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN1110 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default119, fM6403constructorimpl1110, Color.m3926copywmQWz5c$default(companion11111116.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy119 = BoxKt.maybeCachedBoxMeasurePolicy(companion214.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap1111111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier1111111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN1110);
                        constructor7 = companion11111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion11111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy119, composerM3407constructorimpl7, currentCompositionLocalMap1111111119);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1111111119, companion11111110.getSetModifier());
                        BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion11111116.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11111115.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f111117 = f11;
                        b.r(composerStartRestartGroup, f111117, companion213, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults117 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU111113 = companion11111116.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU111114 = companion11111116.m3962getTransparent0d7_KjU();
                        int i11117 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ81114 = buttonDefaults117.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU111113, 0L, jM3962getTransparent0d7_KjU111114, 0L, composerStartRestartGroup, i11117 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1110 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111117));
                        PaddingValues paddingValuesM661PaddingValues0680j_1110 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default117 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), Dp.m6403constructorimpl(f1122), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111117)), false, 0L, Color.m3926copywmQWz5c$default(j19, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default117, false, roundedCornerShapeM955RoundedCornerShape0680j_1110, buttonColorsM1520buttonColorsro_MJ81114, null, null, paddingValuesM661PaddingValues0680j_1110, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion213, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion213, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f111113, companion213, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default1111 = SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy111110 = RowKt.rowMeasurePolicy(arrangement9.getStart(), companion214.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap11111111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1111);
                        constructor8 = companion11111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion11111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy111110, composerM3407constructorimpl8, currentCompositionLocalMap11111111110);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111111110, companion11111110.getSetModifier());
                        Icons.Filled filled117 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion213, 1.0f, false, 2, null), PreviewKt.getPreview(filled117), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion213, Dp.m6403constructorimpl(f1123)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion213, 1.0f, false, 2, null), ShareKt.getShare(filled117), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f1123, companion213, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), buttonDefaults117.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11117 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        rowScopeInstance2 = rowScopeInstance;
                    }
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG1111);
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111111117, companion11111110.getSetModifier());
                    TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion213, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy1113 = ColumnKt.columnMeasurePolicy(arrangement9.getTop(), companion214.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion213);
                    constructor6 = companion11111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG2 = p035i0.a.g(companion11111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1113, composerM3407constructorimpl6, currentCompositionLocalMap11111111111);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111111111, companion11111110.getSetModifier());
                    ColumnScopeInstance columnScopeInstance1110 = ColumnScopeInstance.INSTANCE;
                    FontWeight.Companion companion11111117 = FontWeight.Companion;
                    TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion11111117.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                    TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Modifier modifierBackground$default1110 = BackgroundKt.background$default(ClipKt.clip(companion213, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j19), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    float fM6403constructorimpl1111 = Dp.m6403constructorimpl(f111114);
                    Color.Companion companion11111118 = Color.Companion;
                    Modifier modifierM669paddingVpY3zN1111 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default1110, fM6403constructorimpl1111, Color.m3926copywmQWz5c$default(companion11111118.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1110 = BoxKt.maybeCachedBoxMeasurePolicy(companion214.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN1111);
                    constructor7 = companion11111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG3 = p035i0.a.g(companion11111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy1110, composerM3407constructorimpl7, currentCompositionLocalMap11111111112);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11111111112, companion11111110.getSetModifier());
                    BoxScopeInstance boxScopeInstance1112 = BoxScopeInstance.INSTANCE;
                    TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion11111118.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion11111117.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                    float f111118 = f11;
                    b.r(composerStartRestartGroup, f111118, companion213, composerStartRestartGroup, 6);
                    ButtonDefaults buttonDefaults118 = ButtonDefaults.INSTANCE;
                    long jM3962getTransparent0d7_KjU111115 = companion11111118.m3962getTransparent0d7_KjU();
                    long jM3962getTransparent0d7_KjU111116 = companion11111118.m3962getTransparent0d7_KjU();
                    int i11118 = ButtonDefaults.$stable << 12;
                    ButtonColors buttonColorsM1520buttonColorsro_MJ81115 = buttonDefaults118.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU111115, 0L, jM3962getTransparent0d7_KjU111116, 0L, composerStartRestartGroup, i11118 | 390, 10);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1111 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111118));
                    PaddingValues paddingValuesM661PaddingValues0680j_1111 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                    Modifier modifierM3585shadows4CzXII$default118 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), Dp.m6403constructorimpl(f1122), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f111118)), false, 0L, Color.m3926copywmQWz5c$default(j19, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                    composerStartRestartGroup.startReplaceGroup(596080364);
                    if ((i16 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z6) {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default118, false, roundedCornerShapeM955RoundedCornerShape0680j_1111, buttonColorsM1520buttonColorsro_MJ81115, null, null, paddingValuesM661PaddingValues0680j_1111, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                    b.m(f7, companion213, composerStartRestartGroup, 6);
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                    b.m(f6, companion213, composerStartRestartGroup, 6);
                    j.a(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                    b.m(f111113, companion213, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default1112 = SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy111111 = RowKt.rowMeasurePolicy(arrangement9.getStart(), companion214.getTop(), composerStartRestartGroup, i9);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                    CompositionLocalMap currentCompositionLocalMap11111111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1112);
                    constructor8 = companion11111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion11111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy111111, composerM3407constructorimpl8, currentCompositionLocalMap11111111113);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111111113, companion11111110.getSetModifier());
                    Icons.Filled filled118 = Icons.Filled.INSTANCE;
                    i10 = 6;
                    composer2 = composerStartRestartGroup;
                    q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion213, 1.0f, false, 2, null), PreviewKt.getPreview(filled118), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion213, Dp.m6403constructorimpl(f1123)), composer2, 6);
                    q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion213, 1.0f, false, 2, null), ShareKt.getShare(filled118), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                    b.n(composer2, f1123, companion213, composer2, 6);
                    ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion213, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), buttonDefaults118.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11118 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                    composer2.endReplaceGroup();
                } else {
                    companion = companion2;
                }
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG118);
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier211, companion5.getSetModifier());
                RowScopeInstance rowScopeInstance10 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(2099120915);
                size = f13941a.size();
                while (i8 < size) {
                    if (pagerStateRememberPagerState.getCurrentPage() == i8) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    Modifier.Companion companion11111119 = Modifier.Companion;
                    if (z7) {
                        fM6403constructorimpl = Dp.m6403constructorimpl(f9);
                    } else {
                        fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                    }
                    Modifier modifierClip8 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion11111119, fM6403constructorimpl), RoundedCornerShapeKt.getCircleShape());
                    if (z7) {
                        jM3926copywmQWz5c$default = p107y3.a.f15980c;
                    } else {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierClip8, jM3926copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Modifier.Companion companion215 = Modifier.Companion;
                float f111119 = 20;
                b.m(f111119, companion215, composerStartRestartGroup, 6);
                Modifier modifierG8 = b.g(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), f1123);
                long j110 = p107y3.a.f15978a;
                float f1111110 = 1;
                Modifier modifierM668padding3ABfNKs8 = PaddingKt.m668padding3ABfNKs(b.e(f1123, BackgroundKt.m207backgroundbw27NRU$default(modifierG8, Color.m3926copywmQWz5c$default(j110, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f1111110), Color.m3926copywmQWz5c$default(j110, 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f8));
                Alignment.Companion companion216 = Alignment.Companion;
                Alignment.Vertical centerVertically112 = companion216.getCenterVertically();
                Arrangement arrangement10 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy111112 = RowKt.rowMeasurePolicy(arrangement10.getSpaceBetween(), centerVertically112, composerStartRestartGroup, 54);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap213 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier213 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs8);
                ComposeUiNode.Companion companion111111110 = ComposeUiNode.Companion;
                constructor4 = companion111111110.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG1112 = p035i0.a.g(companion111111110, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy111112, composerM3407constructorimpl4, currentCompositionLocalMap213);
                if (composerM3407constructorimpl4.getInserting()) {
                    f11 = f8;
                    if (!o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier213, companion111111110.getSetModifier());
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically113 = companion216.getCenterVertically();
                    Modifier modifierWeight$default15 = RowScope.weight$default(rowScopeInstance, companion215, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy111113 = RowKt.rowMeasurePolicy(arrangement10.getStart(), centerVertically113, composerStartRestartGroup, 48);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default15);
                    constructor5 = companion111111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    e eVarG1113 = p035i0.a.g(companion111111110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy111113, composerM3407constructorimpl5, currentCompositionLocalMap11111111114);
                    if (composerM3407constructorimpl5.getInserting()) {
                        rowScopeInstance2 = rowScopeInstance;
                        if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111111114, companion111111110.getSetModifier());
                        TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion215, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                        MeasurePolicy measurePolicyColumnMeasurePolicy1114 = ColumnKt.columnMeasurePolicy(arrangement10.getTop(), companion216.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion215);
                        constructor6 = companion111111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG2 = p035i0.a.g(companion111111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1114, composerM3407constructorimpl6, currentCompositionLocalMap11111111115);
                        if (composerM3407constructorimpl6.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111111115, companion111111110.getSetModifier());
                        ColumnScopeInstance columnScopeInstance1111 = ColumnScopeInstance.INSTANCE;
                        FontWeight.Companion companion111111111 = FontWeight.Companion;
                        TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111111111.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        Modifier modifierBackground$default1111 = BackgroundKt.background$default(ClipKt.clip(companion215, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j110), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                        float fM6403constructorimpl1112 = Dp.m6403constructorimpl(f1111110);
                        Color.Companion companion111111112 = Color.Companion;
                        Modifier modifierM669paddingVpY3zN1112 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default1111, fM6403constructorimpl1112, Color.m3926copywmQWz5c$default(companion111111112.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1111 = BoxKt.maybeCachedBoxMeasurePolicy(companion216.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11111111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN1112);
                        constructor7 = companion111111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor7);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG3 = p035i0.a.g(companion111111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy1111, composerM3407constructorimpl7, currentCompositionLocalMap11111111116);
                        if (composerM3407constructorimpl7.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11111111116, companion111111110.getSetModifier());
                        BoxScopeInstance boxScopeInstance1113 = BoxScopeInstance.INSTANCE;
                        TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion111111112.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111111111.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                        float f1111111 = f11;
                        b.r(composerStartRestartGroup, f1111111, companion215, composerStartRestartGroup, 6);
                        ButtonDefaults buttonDefaults119 = ButtonDefaults.INSTANCE;
                        long jM3962getTransparent0d7_KjU111117 = companion111111112.m3962getTransparent0d7_KjU();
                        long jM3962getTransparent0d7_KjU111118 = companion111111112.m3962getTransparent0d7_KjU();
                        int i11119 = ButtonDefaults.$stable << 12;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ81116 = buttonDefaults119.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU111117, 0L, jM3962getTransparent0d7_KjU111118, 0L, composerStartRestartGroup, i11119 | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1112 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111111));
                        PaddingValues paddingValuesM661PaddingValues0680j_1112 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        Modifier modifierM3585shadows4CzXII$default119 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), Dp.m6403constructorimpl(f1122), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111111)), false, 0L, Color.m3926copywmQWz5c$default(j110, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                        composerStartRestartGroup.startReplaceGroup(596080364);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z6) {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 0;
                            objRememberedValue3 = new O(18, onNavigateToPrint);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default119, false, roundedCornerShapeM955RoundedCornerShape0680j_1112, buttonColorsM1520buttonColorsro_MJ81116, null, null, paddingValuesM661PaddingValues0680j_1112, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                        b.m(f7, companion215, composerStartRestartGroup, 6);
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                        b.m(f6, companion215, composerStartRestartGroup, 6);
                        j.a(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                        b.m(f111119, companion215, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default1113 = SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy111114 = RowKt.rowMeasurePolicy(arrangement10.getStart(), companion216.getTop(), composerStartRestartGroup, i9);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                        CompositionLocalMap currentCompositionLocalMap11111111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1113);
                        constructor8 = companion111111110.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                        eVarG4 = p035i0.a.g(companion111111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy111114, composerM3407constructorimpl8, currentCompositionLocalMap11111111117);
                        if (composerM3407constructorimpl8.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier11111111117, companion111111110.getSetModifier());
                        Icons.Filled filled119 = Icons.Filled.INSTANCE;
                        i10 = 6;
                        composer2 = composerStartRestartGroup;
                        q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion215, 1.0f, false, 2, null), PreviewKt.getPreview(filled119), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion215, Dp.m6403constructorimpl(f1123)), composer2, 6);
                        q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion215, 1.0f, false, 2, null), ShareKt.getShare(filled119), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                        b.n(composer2, f1123, companion215, composer2, 6);
                        ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), buttonDefaults119.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i11119 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                        composer2.endReplaceGroup();
                    } else {
                        rowScopeInstance2 = rowScopeInstance;
                    }
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG1113);
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111111114, companion111111110.getSetModifier());
                    TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion215, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy1115 = ColumnKt.columnMeasurePolicy(arrangement10.getTop(), companion216.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111111118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111111118 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion215);
                    constructor6 = companion111111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG2 = p035i0.a.g(companion111111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1115, composerM3407constructorimpl6, currentCompositionLocalMap11111111118);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111111118, companion111111110.getSetModifier());
                    ColumnScopeInstance columnScopeInstance1112 = ColumnScopeInstance.INSTANCE;
                    FontWeight.Companion companion111111113 = FontWeight.Companion;
                    TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111111113.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                    TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Modifier modifierBackground$default1112 = BackgroundKt.background$default(ClipKt.clip(companion215, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j110), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    float fM6403constructorimpl1113 = Dp.m6403constructorimpl(f1111110);
                    Color.Companion companion111111114 = Color.Companion;
                    Modifier modifierM669paddingVpY3zN1113 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default1112, fM6403constructorimpl1113, Color.m3926copywmQWz5c$default(companion111111114.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1112 = BoxKt.maybeCachedBoxMeasurePolicy(companion216.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11111111119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111111119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN1113);
                    constructor7 = companion111111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG3 = p035i0.a.g(companion111111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy1112, composerM3407constructorimpl7, currentCompositionLocalMap11111111119);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11111111119, companion111111110.getSetModifier());
                    BoxScopeInstance boxScopeInstance1114 = BoxScopeInstance.INSTANCE;
                    TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion111111114.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111111113.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                    float f1111112 = f11;
                    b.r(composerStartRestartGroup, f1111112, companion215, composerStartRestartGroup, 6);
                    ButtonDefaults buttonDefaults1110 = ButtonDefaults.INSTANCE;
                    long jM3962getTransparent0d7_KjU111119 = companion111111114.m3962getTransparent0d7_KjU();
                    long jM3962getTransparent0d7_KjU1111110 = companion111111114.m3962getTransparent0d7_KjU();
                    int i111110 = ButtonDefaults.$stable << 12;
                    ButtonColors buttonColorsM1520buttonColorsro_MJ81117 = buttonDefaults1110.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU111119, 0L, jM3962getTransparent0d7_KjU1111110, 0L, composerStartRestartGroup, i111110 | 390, 10);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1113 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111112));
                    PaddingValues paddingValuesM661PaddingValues0680j_1113 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                    Modifier modifierM3585shadows4CzXII$default1110 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), Dp.m6403constructorimpl(f1122), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111112)), false, 0L, Color.m3926copywmQWz5c$default(j110, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                    composerStartRestartGroup.startReplaceGroup(596080364);
                    if ((i16 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z6) {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default1110, false, roundedCornerShapeM955RoundedCornerShape0680j_1113, buttonColorsM1520buttonColorsro_MJ81117, null, null, paddingValuesM661PaddingValues0680j_1113, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                    b.m(f7, companion215, composerStartRestartGroup, 6);
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                    b.m(f6, companion215, composerStartRestartGroup, 6);
                    j.a(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                    b.m(f111119, companion215, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default1114 = SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy111115 = RowKt.rowMeasurePolicy(arrangement10.getStart(), companion216.getTop(), composerStartRestartGroup, i9);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                    CompositionLocalMap currentCompositionLocalMap111111111110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111111110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1114);
                    constructor8 = companion111111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion111111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy111115, composerM3407constructorimpl8, currentCompositionLocalMap111111111110);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111111110, companion111111110.getSetModifier());
                    Icons.Filled filled1110 = Icons.Filled.INSTANCE;
                    i10 = 6;
                    composer2 = composerStartRestartGroup;
                    q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion215, 1.0f, false, 2, null), PreviewKt.getPreview(filled1110), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion215, Dp.m6403constructorimpl(f1123)), composer2, 6);
                    q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion215, 1.0f, false, 2, null), ShareKt.getShare(filled1110), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                    b.n(composer2, f1123, companion215, composer2, 6);
                    ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), buttonDefaults1110.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i111110 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                    composer2.endReplaceGroup();
                } else {
                    f11 = f8;
                }
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG1112);
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier213, companion111111110.getSetModifier());
                rowScopeInstance = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically114 = companion216.getCenterVertically();
                Modifier modifierWeight$default16 = RowScope.weight$default(rowScopeInstance, companion215, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy111116 = RowKt.rowMeasurePolicy(arrangement10.getStart(), centerVertically114, composerStartRestartGroup, 48);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111111111111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111111111111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default16);
                constructor5 = companion111111110.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
                e eVarG1114 = p035i0.a.g(companion111111110, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy111116, composerM3407constructorimpl5, currentCompositionLocalMap111111111111);
                if (composerM3407constructorimpl5.getInserting()) {
                    rowScopeInstance2 = rowScopeInstance;
                    if (!o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111111111111, companion111111110.getSetModifier());
                    TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion215, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy1116 = ColumnKt.columnMeasurePolicy(arrangement10.getTop(), companion216.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111111112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111111112 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion215);
                    constructor6 = companion111111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG2 = p035i0.a.g(companion111111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1116, composerM3407constructorimpl6, currentCompositionLocalMap111111111112);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111111111112, companion111111110.getSetModifier());
                    ColumnScopeInstance columnScopeInstance1113 = ColumnScopeInstance.INSTANCE;
                    FontWeight.Companion companion111111115 = FontWeight.Companion;
                    TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111111115.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                    TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Modifier modifierBackground$default1113 = BackgroundKt.background$default(ClipKt.clip(companion215, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j110), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    float fM6403constructorimpl1114 = Dp.m6403constructorimpl(f1111110);
                    Color.Companion companion111111116 = Color.Companion;
                    Modifier modifierM669paddingVpY3zN1114 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default1113, fM6403constructorimpl1114, Color.m3926copywmQWz5c$default(companion111111116.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1113 = BoxKt.maybeCachedBoxMeasurePolicy(companion216.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111111111113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111111113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN1114);
                    constructor7 = companion111111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG3 = p035i0.a.g(companion111111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy1113, composerM3407constructorimpl7, currentCompositionLocalMap111111111113);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111111111113, companion111111110.getSetModifier());
                    BoxScopeInstance boxScopeInstance1115 = BoxScopeInstance.INSTANCE;
                    TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion111111116.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111111115.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                    float f1111113 = f11;
                    b.r(composerStartRestartGroup, f1111113, companion215, composerStartRestartGroup, 6);
                    ButtonDefaults buttonDefaults1111 = ButtonDefaults.INSTANCE;
                    long jM3962getTransparent0d7_KjU1111111 = companion111111116.m3962getTransparent0d7_KjU();
                    long jM3962getTransparent0d7_KjU1111112 = companion111111116.m3962getTransparent0d7_KjU();
                    int i111111 = ButtonDefaults.$stable << 12;
                    ButtonColors buttonColorsM1520buttonColorsro_MJ81118 = buttonDefaults1111.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU1111111, 0L, jM3962getTransparent0d7_KjU1111112, 0L, composerStartRestartGroup, i111111 | 390, 10);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1114 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111113));
                    PaddingValues paddingValuesM661PaddingValues0680j_1114 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                    Modifier modifierM3585shadows4CzXII$default1111 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), Dp.m6403constructorimpl(f1122), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111113)), false, 0L, Color.m3926copywmQWz5c$default(j110, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                    composerStartRestartGroup.startReplaceGroup(596080364);
                    if ((i16 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z6) {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i9 = 0;
                        objRememberedValue3 = new O(18, onNavigateToPrint);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default1111, false, roundedCornerShapeM955RoundedCornerShape0680j_1114, buttonColorsM1520buttonColorsro_MJ81118, null, null, paddingValuesM661PaddingValues0680j_1114, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                    b.m(f7, companion215, composerStartRestartGroup, 6);
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                    b.m(f6, companion215, composerStartRestartGroup, 6);
                    j.a(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                    b.m(f111119, companion215, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxWidth$default1115 = SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy111117 = RowKt.rowMeasurePolicy(arrangement10.getStart(), companion216.getTop(), composerStartRestartGroup, i9);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                    CompositionLocalMap currentCompositionLocalMap111111111114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111111114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1115);
                    constructor8 = companion111111110.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor8);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion111111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy111117, composerM3407constructorimpl8, currentCompositionLocalMap111111111114);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111111114, companion111111110.getSetModifier());
                    Icons.Filled filled1111 = Icons.Filled.INSTANCE;
                    i10 = 6;
                    composer2 = composerStartRestartGroup;
                    q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion215, 1.0f, false, 2, null), PreviewKt.getPreview(filled1111), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion215, Dp.m6403constructorimpl(f1123)), composer2, 6);
                    q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion215, 1.0f, false, 2, null), ShareKt.getShare(filled1111), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                    b.n(composer2, f1123, companion215, composer2, 6);
                    ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), buttonDefaults1111.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i111111 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                    composer2.endReplaceGroup();
                } else {
                    rowScopeInstance2 = rowScopeInstance;
                }
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG1114);
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111111111111, companion111111110.getSetModifier());
                TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131062);
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion215, Dp.m6403constructorimpl(f9)), composerStartRestartGroup, 6);
                MeasurePolicy measurePolicyColumnMeasurePolicy1117 = ColumnKt.columnMeasurePolicy(arrangement10.getTop(), companion216.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111111111115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111111111115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion215);
                constructor6 = companion111111110.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG2 = p035i0.a.g(companion111111110, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy1117, composerM3407constructorimpl6, currentCompositionLocalMap111111111115);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111111111115, companion111111110.getSetModifier());
                ColumnScopeInstance columnScopeInstance1114 = ColumnScopeInstance.INSTANCE;
                FontWeight.Companion companion111111117 = FontWeight.Companion;
                TextKt.m2432Text4IGK_g("Flat 10% OFF", (Modifier) null, p107y3.a.f15990o, TextUnitKt.getSp(13), (FontStyle) null, companion111111117.getExtraBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200070, 0, 131026);
                TextKt.m2432Text4IGK_g("on your first print order", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131058);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Modifier modifierBackground$default1114 = BackgroundKt.background$default(ClipKt.clip(companion215, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9))), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(j110), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                float fM6403constructorimpl1115 = Dp.m6403constructorimpl(f1111110);
                Color.Companion companion111111118 = Color.Companion;
                Modifier modifierM669paddingVpY3zN1115 = PaddingKt.m669paddingVpY3zN4(b.e(f9, modifierBackground$default1114, fM6403constructorimpl1115, Color.m3926copywmQWz5c$default(companion111111118.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10), Dp.m6403constructorimpl(f10));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy1114 = BoxKt.maybeCachedBoxMeasurePolicy(companion216.getTopStart(), false);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111111111116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111111111116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN1115);
                constructor7 = companion111111110.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG3 = p035i0.a.g(companion111111110, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy1114, composerM3407constructorimpl7, currentCompositionLocalMap111111111116);
                if (composerM3407constructorimpl7.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111111111116, companion111111110.getSetModifier());
                BoxScopeInstance boxScopeInstance1116 = BoxScopeInstance.INSTANCE;
                TextKt.m2432Text4IGK_g("FIRST10", (Modifier) null, companion111111118.m3964getWhite0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, companion111111117.getExtraBold(), (FontFamily) FontFamily.Companion.getMonospace(), TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130834);
                float f1111114 = f11;
                b.r(composerStartRestartGroup, f1111114, companion215, composerStartRestartGroup, 6);
                ButtonDefaults buttonDefaults1112 = ButtonDefaults.INSTANCE;
                long jM3962getTransparent0d7_KjU1111113 = companion111111118.m3962getTransparent0d7_KjU();
                long jM3962getTransparent0d7_KjU1111114 = companion111111118.m3962getTransparent0d7_KjU();
                int i111112 = ButtonDefaults.$stable << 12;
                ButtonColors buttonColorsM1520buttonColorsro_MJ81119 = buttonDefaults1112.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU1111113, 0L, jM3962getTransparent0d7_KjU1111114, 0L, composerStartRestartGroup, i111112 | 390, 10);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1115 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111114));
                PaddingValues paddingValuesM661PaddingValues0680j_1115 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                Modifier modifierM3585shadows4CzXII$default1112 = ShadowKt.m3585shadows4CzXII$default(SizeKt.m701heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), Dp.m6403constructorimpl(f1122), 0.0f, 2, null), Dp.m6403constructorimpl(f9), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1111114)), false, 0L, Color.m3926copywmQWz5c$default(j110, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 12, null);
                composerStartRestartGroup.startReplaceGroup(596080364);
                if ((i16 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z6) {
                    i9 = 0;
                    objRememberedValue3 = new O(18, onNavigateToPrint);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i9 = 0;
                    objRememberedValue3 = new O(18, onNavigateToPrint);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                ButtonKt.Button((a) objRememberedValue3, modifierM3585shadows4CzXII$default1112, false, roundedCornerShapeM955RoundedCornerShape0680j_1115, buttonColorsM1520buttonColorsro_MJ81119, null, null, paddingValuesM661PaddingValues0680j_1115, null, AbstractC2587n3.f15349a, composerStartRestartGroup, 817889280, 356);
                b.m(f7, companion215, composerStartRestartGroup, 6);
                DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(p107y3.a.f15991r, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 384, 3);
                b.m(f6, companion215, composerStartRestartGroup, 6);
                j.a(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-592096130, true, new De(str, j5, j6, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
                b.m(f111119, companion215, composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default1116 = SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy111118 = RowKt.rowMeasurePolicy(arrangement10.getStart(), companion216.getTop(), composerStartRestartGroup, i9);
                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i9);
                CompositionLocalMap currentCompositionLocalMap111111111117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111111111117 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default1116);
                constructor8 = companion111111110.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG4 = p035i0.a.g(companion111111110, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy111118, composerM3407constructorimpl8, currentCompositionLocalMap111111111117);
                if (composerM3407constructorimpl8.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier111111111117, companion111111110.getSetModifier());
                Icons.Filled filled1112 = Icons.Filled.INSTANCE;
                i10 = 6;
                composer2 = composerStartRestartGroup;
                q.a("View", onPreview, RowScope.weight$default(rowScopeInstance2, companion215, 1.0f, false, 2, null), PreviewKt.getPreview(filled1112), false, false, composer2, ((i14 >> 21) & 112) | 6, 48);
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion215, Dp.m6403constructorimpl(f1123)), composer2, 6);
                q.a("Share", onShare, RowScope.weight$default(rowScopeInstance2, companion215, 1.0f, false, 2, null), ShareKt.getShare(filled1112), false, false, composer2, ((i14 >> 24) & 112) | 6, 48);
                b.n(composer2, f1123, companion215, composer2, 6);
                ButtonKt.Button(onProcessAnother, ShadowKt.m3585shadows4CzXII$default(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion215, 0.0f, 1, null), Dp.m6403constructorimpl(50)), Dp.m6403constructorimpl(4), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), false, 0L, 0L, 28, null), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f1123)), buttonDefaults1112.m1520buttonColorsro_MJ88(ColorKt.Color(4283127139L), ColorKt.Color(4293257195L), 0L, 0L, composer2, i111112 | 54, 12), null, null, null, null, AbstractC2587n3.f15350b, composer2, (i16 & 14) | 805306368, 484);
                composer2.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(100)), composer2, i10);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.ue
                @Override // O3.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i6 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i7);
                    String str2 = str;
                    boolean z8 = z5;
                    Modifier modifier3 = modifier2;
                    Ee.b(j5, j6, str2, i5, z3, z4, f5, onDownload, onPreview, onShare, onProcessAnother, onNavigateToPrint, adMobManager, z8, modifier3, (Composer) obj2, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final String c(long j5) {
        if (j5 >= 1000000000) {
            return String.format("%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1.0E9d)}, 1));
        }
        if (j5 >= AnimationKt.MillisToNanos) {
            return String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1000000.0d)}, 1));
        }
        if (j5 >= 1000) {
            return String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1000.0d)}, 1));
        }
        return j5 + " B";
    }
}

package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.material.icons.outlined.AddKt;
import androidx.compose.material.icons.outlined.RemoveKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
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
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p097w3.j;

/* JADX INFO: renamed from: x3.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2642qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f15447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f15449c;

    static {
        long jColor = ColorKt.Color(4280171146L);
        f15447a = jColor;
        long jColor2 = ColorKt.Color(4285238819L);
        long jColor3 = ColorKt.Color(4289170426L);
        f15448b = jColor3;
        f15449c = v.S(Color.m3917boximpl(jColor), Color.m3917boximpl(jColor2), Color.m3917boximpl(jColor3), Color.m3917boximpl(ColorKt.Color(4293357393L)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 ??, still in use, count: 1, list:
          (r7v8 ?? I:java.lang.Object) from 0x05c9: INVOKE (r13v3 ?? I:androidx.compose.runtime.Composer), (r7v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1482)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 ??, still in use, count: 1, list:
          (r7v8 ?? I:java.lang.Object) from 0x05c9: INVOKE (r13v3 ?? I:androidx.compose.runtime.Composer), (r7v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1482)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r53v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public static final void b(String str, ImageVector imageVector, String str2, String str3, Composer composer, int i5) {
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2040136541);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(str3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2040136541, i6, -1, "com.notescrafter.ui.screens.PomodoroStepItem (PomodoroSetupScreen.kt:670)");
            }
            composer2 = composerStartRestartGroup;
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1846308702, true, new C2626pa(imageVector, str, str3, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new K5(str, imageVector, str2, str3, i5, 9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:106:0x0205  */
    /* JADX WARN: Code duplicated, block: B:108:0x0213  */
    /* JADX WARN: Code duplicated, block: B:111:0x027b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0287  */
    /* JADX WARN: Code duplicated, block: B:115:0x028b  */
    /* JADX WARN: Code duplicated, block: B:118:0x029c  */
    /* JADX WARN: Code duplicated, block: B:120:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x0306  */
    /* JADX WARN: Code duplicated, block: B:126:0x034f  */
    /* JADX WARN: Code duplicated, block: B:129:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:133:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:136:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:141:0x040d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0427  */
    /* JADX WARN: Code duplicated, block: B:146:0x0459  */
    /* JADX WARN: Code duplicated, block: B:148:0x0467  */
    /* JADX WARN: Code duplicated, block: B:151:0x0475  */
    /* JADX WARN: Code duplicated, block: B:152:0x0478  */
    /* JADX WARN: Code duplicated, block: B:155:0x0488  */
    /* JADX WARN: Code duplicated, block: B:156:0x048a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0491  */
    /* JADX WARN: Code duplicated, block: B:160:0x0493  */
    /* JADX WARN: Code duplicated, block: B:163:0x049c  */
    /* JADX WARN: Code duplicated, block: B:164:0x049e  */
    /* JADX WARN: Code duplicated, block: B:167:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:168:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:171:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:178:0x051c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0528  */
    /* JADX WARN: Code duplicated, block: B:182:0x052c  */
    /* JADX WARN: Code duplicated, block: B:185:0x053d  */
    /* JADX WARN: Code duplicated, block: B:187:0x054b  */
    /* JADX WARN: Code duplicated, block: B:190:0x055d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0560  */
    /* JADX WARN: Code duplicated, block: B:194:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:196:0x0612  */
    /* JADX WARN: Code duplicated, block: B:199:0x0640  */
    /* JADX WARN: Code duplicated, block: B:201:0x064d  */
    /* JADX WARN: Code duplicated, block: B:204:0x065b  */
    /* JADX WARN: Code duplicated, block: B:205:0x065e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0669  */
    /* JADX WARN: Code duplicated, block: B:210:0x066e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0672  */
    /* JADX WARN: Code duplicated, block: B:213:0x0675  */
    /* JADX WARN: Code duplicated, block: B:216:0x067b  */
    /* JADX WARN: Code duplicated, block: B:217:0x067e  */
    /* JADX WARN: Code duplicated, block: B:220:0x0688  */
    /* JADX WARN: Code duplicated, block: B:221:0x068b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0693  */
    /* JADX WARN: Code duplicated, block: B:228:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:231:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:234:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:235:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:238:0x0708  */
    /* JADX WARN: Code duplicated, block: B:240:0x0716  */
    /* JADX WARN: Code duplicated, block: B:243:0x0726  */
    /* JADX WARN: Code duplicated, block: B:244:0x0729  */
    /* JADX WARN: Code duplicated, block: B:247:0x0757  */
    /* JADX WARN: Code duplicated, block: B:251:0x0762  */
    /* JADX WARN: Code duplicated, block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:88:0x0143  */
    /* JADX WARN: Code duplicated, block: B:89:0x0147  */
    /* JADX WARN: Code duplicated, block: B:92:0x0158  */
    /* JADX WARN: Code duplicated, block: B:95:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e4  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x034f, please report this as an issue */
    public static final void c(final ImageVector imageVector, final String str, String str2, final int i5, final String str3, final int i6, final int i7, final int i8, final c cVar, Composer composer, final int i9, final int i10) {
        int i11;
        String str4;
        String str5;
        float f5;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        float f6;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        MaterialTheme materialTheme;
        int i12;
        long j5;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG3;
        long jM3926copywmQWz5c$default;
        float f7;
        boolean z3;
        int i13;
        boolean z4;
        int i14;
        boolean z5;
        int i15;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objRememberedValue;
        boolean z9;
        Composer composer2;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG4;
        long jM3926copywmQWz5c$default2;
        long jM3926copywmQWz5c$default3;
        float f8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objRememberedValue2;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG5;
        long jM3926copywmQWz5c$default4;
        final String str6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer composerStartRestartGroup = composer.startRestartGroup(-613778218);
        if ((i9 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(imageVector) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i22 = i10 & 4;
        if (i22 == 0) {
            if ((i9 & 384) == 0) {
                str4 = str2;
                i11 |= composerStartRestartGroup.changed(str4) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i9 & 3072) == 0) {
                if (composerStartRestartGroup.changed(i5)) {
                    i21 = Fields.CameraDistance;
                } else {
                    i21 = Fields.RotationZ;
                }
                i11 |= i21;
            }
            if ((i9 & 24576) == 0) {
                if (composerStartRestartGroup.changed(str3)) {
                    i20 = Fields.Clip;
                } else {
                    i20 = Fields.Shape;
                }
                i11 |= i20;
            }
            if ((196608 & i9) == 0) {
                if (composerStartRestartGroup.changed(i6)) {
                    i19 = Fields.RenderEffect;
                } else {
                    i19 = 65536;
                }
                i11 |= i19;
            }
            if ((1572864 & i9) == 0) {
                if (composerStartRestartGroup.changed(i7)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i11 |= i18;
            }
            if ((12582912 & i9) != 0) {
                if (composerStartRestartGroup.changed(i8)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i11 |= i17;
            }
            if ((i9 & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(cVar)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i11 |= i16;
            }
            if ((i11 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                if (i22 != 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-613778218, i11, -1, "com.notescrafter.ui.screens.SettingRow (PomodoroSetupScreen.kt:542)");
                }
                Modifier.Companion companion = Modifier.Companion;
                f5 = 16;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(20), Dp.m6403constructorimpl(f5));
                Alignment.Companion companion2 = Alignment.Companion;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
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
                e eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                if (composerM3407constructorimpl.getInserting()) {
                    f6 = f5;
                } else {
                    f6 = f5;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f9 = 12;
                    Modifier modifierG = b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(44)), f9);
                    long j6 = p107y3.a.f15978a;
                    float f10 = 1;
                    Modifier modifierE = b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(j6, 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f10), Color.m3926copywmQWz5c$default(j6, 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
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
                    eVarG = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    long j7 = p107y3.a.f15980c;
                    IconKt.m1877Iconww6aTOc(imageVector, str, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(22)), j7, composerStartRestartGroup, (i11 & 14) | 3456 | (i11 & 112), 0);
                    b.u(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    constructor3 = companion3.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    materialTheme = MaterialTheme.INSTANCE;
                    i12 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme.getTypography(composerStartRestartGroup, i12).getBodyLarge();
                    FontWeight.Companion companion4 = FontWeight.Companion;
                    FontWeight semiBold = companion4.getSemiBold();
                    j5 = p107y3.a.f15990o;
                    TextKt.m2432Text4IGK_g(str, (Modifier) null, j5, 0L, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyLarge, composerStartRestartGroup, ((i11 >> 3) & 14) | 196992, 0, 65498);
                    composerStartRestartGroup.startReplaceGroup(-1457690857);
                    if (str5.length() > 0) {
                        TextKt.m2432Text4IGK_g(str5, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, ((i11 >> 6) & 14) | 384, 3072, 57338);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1457682185);
                    if (str3.length() > 0) {
                        TextKt.m2432Text4IGK_g(i5 + " " + str3, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 384, 0, 65530);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                    constructor4 = companion3.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                    float f11 = 36;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f11)), RoundedCornerShapeKt.getCircleShape());
                    if (i5 > i6) {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierClip, jM3926copywmQWz5c$default, null, 2, null);
                    float fM6403constructorimpl = Dp.m6403constructorimpl(f10);
                    long jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                    if (i5 > i6) {
                        f7 = 0.08f;
                    } else {
                        f7 = 0.02f;
                    }
                    Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default, fM6403constructorimpl, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f7, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    if (i5 > i6) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1457651116);
                    i13 = i11 & 234881024;
                    if (i13 == 67108864) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i14 = i11 & 7168;
                    if (i14 == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z16 = z5 | z4;
                    i15 = 29360128 & i11;
                    if (i15 == 8388608) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z17 = z16 | z6;
                    if ((458752 & i11) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z17 | z7;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z8 || objRememberedValue == Composer.Companion.getEmpty()) {
                        final int i23 = 0;
                        z9 = true;
                        composer2 = composerStartRestartGroup;
                        a aVar = new a() { // from class: x3.ba
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i23) {
                                    case 0:
                                        int i24 = i5 - i8;
                                        int i25 = i6;
                                        if (i24 < i25) {
                                            i24 = i25;
                                        }
                                        cVar.invoke(Integer.valueOf(i24));
                                        break;
                                    default:
                                        int i26 = i5 + i8;
                                        int i27 = i6;
                                        if (i26 > i27) {
                                            i26 = i27;
                                        }
                                        cVar.invoke(Integer.valueOf(i26));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(aVar);
                        objRememberedValue = aVar;
                    } else {
                        composer2 = composerStartRestartGroup;
                        z9 = true;
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU, z3, null, null, (a) objRememberedValue, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default);
                    constructor5 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                    eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                    Icons.Outlined outlined = Icons.Outlined.INSTANCE;
                    ImageVector remove = RemoveKt.getRemove(outlined);
                    if (i5 > i6) {
                        jM3926copywmQWz5c$default2 = j5;
                    } else {
                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    float f12 = 18;
                    IconKt.m1877Iconww6aTOc(remove, "Decrease", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), jM3926copywmQWz5c$default2, composer2, 432, 0);
                    composer2.endNode();
                    TextKt.m2432Text4IGK_g(String.valueOf(i5), SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(48)), j7, 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i12).getTitleMedium(), composer2, 197040, 0, 64984);
                    Modifier modifierClip2 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f11)), RoundedCornerShapeKt.getCircleShape());
                    if (i5 < i7) {
                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip2, jM3926copywmQWz5c$default3, null, 2, null);
                    float fM6403constructorimpl2 = Dp.m6403constructorimpl(f10);
                    long jM3964getWhite0d7_KjU2 = Color.Companion.m3964getWhite0d7_KjU();
                    if (i5 < i7) {
                        f8 = 0.08f;
                    } else {
                        f8 = 0.02f;
                    }
                    Modifier modifierM220borderxT4_qwU2 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default2, fM6403constructorimpl2, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU2, f8, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    if (i5 < i7) {
                        z10 = z9;
                    } else {
                        z10 = false;
                    }
                    composer2.startReplaceGroup(-1457605101);
                    if (i13 == 67108864) {
                        z11 = z9;
                    } else {
                        z11 = false;
                    }
                    if (i14 == 2048) {
                        z12 = z9;
                    } else {
                        z12 = false;
                    }
                    boolean z18 = z11 | z12;
                    if (i15 == 8388608) {
                        z13 = z9;
                    } else {
                        z13 = false;
                    }
                    boolean z19 = z13 | z18;
                    if ((i11 & 3670016) == 1048576) {
                        z14 = z9;
                    } else {
                        z14 = false;
                    }
                    z15 = z19 | z14;
                    objRememberedValue2 = composer2.rememberedValue();
                    if (z15 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        final int i24 = 1;
                        a aVar2 = new a() { // from class: x3.ba
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        int i25 = i5 - i8;
                                        int i26 = i7;
                                        if (i25 < i26) {
                                            i25 = i26;
                                        }
                                        cVar.invoke(Integer.valueOf(i25));
                                        break;
                                    default:
                                        int i27 = i5 + i8;
                                        int i28 = i7;
                                        if (i27 > i28) {
                                            i27 = i28;
                                        }
                                        cVar.invoke(Integer.valueOf(i27));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(aVar2);
                        objRememberedValue2 = aVar2;
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default2 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU2, z10, null, null, (a) objRememberedValue2, 6, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default2);
                    constructor6 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                    eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl6, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                    ImageVector add = AddKt.getAdd(outlined);
                    if (i5 < i7) {
                        jM3926copywmQWz5c$default4 = j5;
                    } else {
                        jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    IconKt.m1877Iconww6aTOc(add, "Increase", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), jM3926copywmQWz5c$default4, composer2, 432, 0);
                    if (S2.b(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    str6 = str5;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG6);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                float f13 = 12;
                Modifier modifierG2 = b.g(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(44)), f13);
                long j8 = p107y3.a.f15978a;
                float f14 = 1;
                Modifier modifierE2 = b.e(f13, BackgroundKt.m207backgroundbw27NRU$default(modifierG2, Color.m3926copywmQWz5c$default(j8, 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f14), Color.m3926copywmQWz5c$default(j8, 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE2);
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
                eVarG = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap7);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier7, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                long j9 = p107y3.a.f15980c;
                IconKt.m1877Iconww6aTOc(imageVector, str, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(22)), j9, composerStartRestartGroup, (i11 & 14) | 3456 | (i11 & 112), 0);
                b.u(composerStartRestartGroup, f6, companion, composerStartRestartGroup, 6);
                Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                constructor3 = companion3.getConstructor();
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
                eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap8);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier8, companion3.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                materialTheme = MaterialTheme.INSTANCE;
                i12 = MaterialTheme.$stable;
                TextStyle bodyLarge2 = materialTheme.getTypography(composerStartRestartGroup, i12).getBodyLarge();
                FontWeight.Companion companion5 = FontWeight.Companion;
                FontWeight semiBold2 = companion5.getSemiBold();
                j5 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g(str, (Modifier) null, j5, 0L, (FontStyle) null, semiBold2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyLarge2, composerStartRestartGroup, ((i11 >> 3) & 14) | 196992, 0, 65498);
                composerStartRestartGroup.startReplaceGroup(-1457690857);
                if (str5.length() > 0) {
                    TextKt.m2432Text4IGK_g(str5, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, ((i11 >> 6) & 14) | 384, 3072, 57338);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1457682185);
                if (str3.length() > 0) {
                    TextKt.m2432Text4IGK_g(i5 + " " + str3, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 384, 0, 65530);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                constructor4 = companion3.getConstructor();
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
                eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap9);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier9, companion3.getSetModifier());
                float f15 = 36;
                Modifier modifierClip3 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f15)), RoundedCornerShapeKt.getCircleShape());
                if (i5 > i6) {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip3, jM3926copywmQWz5c$default, null, 2, null);
                float fM6403constructorimpl3 = Dp.m6403constructorimpl(f14);
                long jM3964getWhite0d7_KjU3 = Color.Companion.m3964getWhite0d7_KjU();
                if (i5 > i6) {
                    f7 = 0.08f;
                } else {
                    f7 = 0.02f;
                }
                Modifier modifierM220borderxT4_qwU3 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default3, fM6403constructorimpl3, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU3, f7, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                if (i5 > i6) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1457651116);
                i13 = i11 & 234881024;
                if (i13 == 67108864) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i14 = i11 & 7168;
                if (i14 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z110 = z5 | z4;
                i15 = 29360128 & i11;
                if (i15 == 8388608) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z111 = z110 | z6;
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z111 | z7;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    final int i25 = 0;
                    z9 = true;
                    composer2 = composerStartRestartGroup;
                    a aVar3 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    int i26 = i5 - i8;
                                    int i27 = i6;
                                    if (i26 < i27) {
                                        i26 = i27;
                                    }
                                    cVar.invoke(Integer.valueOf(i26));
                                    break;
                                default:
                                    int i28 = i5 + i8;
                                    int i29 = i6;
                                    if (i28 > i29) {
                                        i28 = i29;
                                    }
                                    cVar.invoke(Integer.valueOf(i28));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar3);
                    objRememberedValue = aVar3;
                } else {
                    final int i26 = 0;
                    z9 = true;
                    composer2 = composerStartRestartGroup;
                    a aVar4 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    int i27 = i5 - i8;
                                    int i28 = i6;
                                    if (i27 < i28) {
                                        i27 = i28;
                                    }
                                    cVar.invoke(Integer.valueOf(i27));
                                    break;
                                default:
                                    int i29 = i5 + i8;
                                    int i210 = i6;
                                    if (i29 > i210) {
                                        i29 = i210;
                                    }
                                    cVar.invoke(Integer.valueOf(i29));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar4);
                    objRememberedValue = aVar4;
                }
                composer2.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default3 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU3, z3, null, null, (a) objRememberedValue, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default3);
                constructor5 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl5, currentCompositionLocalMap10);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier10, companion3.getSetModifier());
                Icons.Outlined outlined2 = Icons.Outlined.INSTANCE;
                ImageVector remove2 = RemoveKt.getRemove(outlined2);
                if (i5 > i6) {
                    jM3926copywmQWz5c$default2 = j5;
                } else {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                float f16 = 18;
                IconKt.m1877Iconww6aTOc(remove2, "Decrease", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f16)), jM3926copywmQWz5c$default2, composer2, 432, 0);
                composer2.endNode();
                TextKt.m2432Text4IGK_g(String.valueOf(i5), SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(48)), j9, 0L, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i12).getTitleMedium(), composer2, 197040, 0, 64984);
                Modifier modifierClip4 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f15)), RoundedCornerShapeKt.getCircleShape());
                if (i5 < i7) {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip4, jM3926copywmQWz5c$default3, null, 2, null);
                float fM6403constructorimpl4 = Dp.m6403constructorimpl(f14);
                long jM3964getWhite0d7_KjU4 = Color.Companion.m3964getWhite0d7_KjU();
                if (i5 < i7) {
                    f8 = 0.08f;
                } else {
                    f8 = 0.02f;
                }
                Modifier modifierM220borderxT4_qwU4 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default4, fM6403constructorimpl4, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU4, f8, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                if (i5 < i7) {
                    z10 = z9;
                } else {
                    z10 = false;
                }
                composer2.startReplaceGroup(-1457605101);
                if (i13 == 67108864) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (i14 == 2048) {
                    z12 = z9;
                } else {
                    z12 = false;
                }
                boolean z112 = z11 | z12;
                if (i15 == 8388608) {
                    z13 = z9;
                } else {
                    z13 = false;
                }
                boolean z113 = z13 | z112;
                if ((i11 & 3670016) == 1048576) {
                    z14 = z9;
                } else {
                    z14 = false;
                }
                z15 = z113 | z14;
                objRememberedValue2 = composer2.rememberedValue();
                if (z15) {
                    final int i27 = 1;
                    a aVar5 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    int i28 = i5 - i8;
                                    int i29 = i7;
                                    if (i28 < i29) {
                                        i28 = i29;
                                    }
                                    cVar.invoke(Integer.valueOf(i28));
                                    break;
                                default:
                                    int i210 = i5 + i8;
                                    int i211 = i7;
                                    if (i210 > i211) {
                                        i210 = i211;
                                    }
                                    cVar.invoke(Integer.valueOf(i210));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar5);
                    objRememberedValue2 = aVar5;
                } else {
                    final int i28 = 1;
                    a aVar6 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i28) {
                                case 0:
                                    int i29 = i5 - i8;
                                    int i210 = i7;
                                    if (i29 < i210) {
                                        i29 = i210;
                                    }
                                    cVar.invoke(Integer.valueOf(i29));
                                    break;
                                default:
                                    int i211 = i5 + i8;
                                    int i212 = i7;
                                    if (i211 > i212) {
                                        i211 = i212;
                                    }
                                    cVar.invoke(Integer.valueOf(i211));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar6);
                    objRememberedValue2 = aVar6;
                }
                composer2.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default4 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU4, z10, null, null, (a) objRememberedValue2, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default4);
                constructor6 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl6, currentCompositionLocalMap11);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11, companion3.getSetModifier());
                ImageVector add2 = AddKt.getAdd(outlined2);
                if (i5 < i7) {
                    jM3926copywmQWz5c$default4 = j5;
                } else {
                    jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                IconKt.m1877Iconww6aTOc(add2, "Increase", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f16)), jM3926copywmQWz5c$default4, composer2, 432, 0);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                str6 = str4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.ca
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i9 | 1);
                        String str7 = str;
                        String str8 = str3;
                        c cVar2 = cVar;
                        AbstractC2642qa.c(imageVector, str7, str6, i5, str8, i6, i7, i8, cVar2, (Composer) obj, iUpdateChangedFlags, i10);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i11 |= 384;
        str4 = str2;
        if ((i9 & 3072) == 0) {
            if (composerStartRestartGroup.changed(i5)) {
                i21 = Fields.CameraDistance;
            } else {
                i21 = Fields.RotationZ;
            }
            i11 |= i21;
        }
        if ((i9 & 24576) == 0) {
            if (composerStartRestartGroup.changed(str3)) {
                i20 = Fields.Clip;
            } else {
                i20 = Fields.Shape;
            }
            i11 |= i20;
        }
        if ((196608 & i9) == 0) {
            if (composerStartRestartGroup.changed(i6)) {
                i19 = Fields.RenderEffect;
            } else {
                i19 = 65536;
            }
            i11 |= i19;
        }
        if ((1572864 & i9) == 0) {
            if (composerStartRestartGroup.changed(i7)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i11 |= i18;
        }
        if ((12582912 & i9) != 0) {
            if (composerStartRestartGroup.changed(i8)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i11 |= i17;
        }
        if ((i9 & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(cVar)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i11 |= i16;
        }
        if ((i11 & 38347923) == 38347922) {
            if (i22 != 0) {
                str5 = "";
            } else {
                str5 = str4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-613778218, i11, -1, "com.notescrafter.ui.screens.SettingRow (PomodoroSetupScreen.kt:542)");
            }
            Modifier.Companion companion6 = Modifier.Companion;
            f5 = 16;
            Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(20), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion7 = Alignment.Companion;
            Alignment.Vertical centerVertically2 = companion7.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN5);
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
            e eVarG7 = p035i0.a.g(companion8, composerM3407constructorimpl, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap12);
            if (composerM3407constructorimpl.getInserting()) {
                f6 = f5;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier12, companion8.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                float f17 = 12;
                Modifier modifierG3 = b.g(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(44)), f17);
                long j10 = p107y3.a.f15978a;
                float f18 = 1;
                Modifier modifierE3 = b.e(f17, BackgroundKt.m207backgroundbw27NRU$default(modifierG3, Color.m3926copywmQWz5c$default(j10, 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f18), Color.m3926copywmQWz5c$default(j10, 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE3);
                constructor2 = companion8.getConstructor();
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
                eVarG = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl2, currentCompositionLocalMap13);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier13, companion8.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                long j11 = p107y3.a.f15980c;
                IconKt.m1877Iconww6aTOc(imageVector, str, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(22)), j11, composerStartRestartGroup, (i11 & 14) | 3456 | (i11 & 112), 0);
                b.u(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
                Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance3, companion6, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default3);
                constructor3 = companion8.getConstructor();
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
                eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap14);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier14, companion8.getSetModifier());
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                materialTheme = MaterialTheme.INSTANCE;
                i12 = MaterialTheme.$stable;
                TextStyle bodyLarge3 = materialTheme.getTypography(composerStartRestartGroup, i12).getBodyLarge();
                FontWeight.Companion companion9 = FontWeight.Companion;
                FontWeight semiBold3 = companion9.getSemiBold();
                j5 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g(str, (Modifier) null, j5, 0L, (FontStyle) null, semiBold3, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyLarge3, composerStartRestartGroup, ((i11 >> 3) & 14) | 196992, 0, 65498);
                composerStartRestartGroup.startReplaceGroup(-1457690857);
                if (str5.length() > 0) {
                    TextKt.m2432Text4IGK_g(str5, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, ((i11 >> 6) & 14) | 384, 3072, 57338);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1457682185);
                if (str3.length() > 0) {
                    TextKt.m2432Text4IGK_g(i5 + " " + str3, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 384, 0, 65530);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion7.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
                constructor4 = companion8.getConstructor();
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
                eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl4, currentCompositionLocalMap15);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier15, companion8.getSetModifier());
                float f19 = 36;
                Modifier modifierClip5 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f19)), RoundedCornerShapeKt.getCircleShape());
                if (i5 > i6) {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM207backgroundbw27NRU$default5 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip5, jM3926copywmQWz5c$default, null, 2, null);
                float fM6403constructorimpl5 = Dp.m6403constructorimpl(f18);
                long jM3964getWhite0d7_KjU5 = Color.Companion.m3964getWhite0d7_KjU();
                if (i5 > i6) {
                    f7 = 0.08f;
                } else {
                    f7 = 0.02f;
                }
                Modifier modifierM220borderxT4_qwU5 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default5, fM6403constructorimpl5, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU5, f7, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                if (i5 > i6) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1457651116);
                i13 = i11 & 234881024;
                if (i13 == 67108864) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i14 = i11 & 7168;
                if (i14 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z114 = z5 | z4;
                i15 = 29360128 & i11;
                if (i15 == 8388608) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z115 = z114 | z6;
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z115 | z7;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    final int i29 = 0;
                    z9 = true;
                    composer2 = composerStartRestartGroup;
                    a aVar7 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i29) {
                                case 0:
                                    int i210 = i5 - i8;
                                    int i211 = i6;
                                    if (i210 < i211) {
                                        i210 = i211;
                                    }
                                    cVar.invoke(Integer.valueOf(i210));
                                    break;
                                default:
                                    int i212 = i5 + i8;
                                    int i213 = i6;
                                    if (i212 > i213) {
                                        i212 = i213;
                                    }
                                    cVar.invoke(Integer.valueOf(i212));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar7);
                    objRememberedValue = aVar7;
                } else {
                    final int i210 = 0;
                    z9 = true;
                    composer2 = composerStartRestartGroup;
                    a aVar8 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i210) {
                                case 0:
                                    int i211 = i5 - i8;
                                    int i212 = i6;
                                    if (i211 < i212) {
                                        i211 = i212;
                                    }
                                    cVar.invoke(Integer.valueOf(i211));
                                    break;
                                default:
                                    int i213 = i5 + i8;
                                    int i214 = i6;
                                    if (i213 > i214) {
                                        i213 = i214;
                                    }
                                    cVar.invoke(Integer.valueOf(i213));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar8);
                    objRememberedValue = aVar8;
                }
                composer2.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default5 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU5, z3, null, null, (a) objRememberedValue, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default5);
                constructor5 = companion8.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl5, currentCompositionLocalMap16);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier16, companion8.getSetModifier());
                Icons.Outlined outlined3 = Icons.Outlined.INSTANCE;
                ImageVector remove3 = RemoveKt.getRemove(outlined3);
                if (i5 > i6) {
                    jM3926copywmQWz5c$default2 = j5;
                } else {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                float f110 = 18;
                IconKt.m1877Iconww6aTOc(remove3, "Decrease", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f110)), jM3926copywmQWz5c$default2, composer2, 432, 0);
                composer2.endNode();
                TextKt.m2432Text4IGK_g(String.valueOf(i5), SizeKt.m718width3ABfNKs(companion6, Dp.m6403constructorimpl(48)), j11, 0L, (FontStyle) null, companion9.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i12).getTitleMedium(), composer2, 197040, 0, 64984);
                Modifier modifierClip6 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f19)), RoundedCornerShapeKt.getCircleShape());
                if (i5 < i7) {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM207backgroundbw27NRU$default6 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip6, jM3926copywmQWz5c$default3, null, 2, null);
                float fM6403constructorimpl6 = Dp.m6403constructorimpl(f18);
                long jM3964getWhite0d7_KjU6 = Color.Companion.m3964getWhite0d7_KjU();
                if (i5 < i7) {
                    f8 = 0.08f;
                } else {
                    f8 = 0.02f;
                }
                Modifier modifierM220borderxT4_qwU6 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default6, fM6403constructorimpl6, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU6, f8, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                if (i5 < i7) {
                    z10 = z9;
                } else {
                    z10 = false;
                }
                composer2.startReplaceGroup(-1457605101);
                if (i13 == 67108864) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (i14 == 2048) {
                    z12 = z9;
                } else {
                    z12 = false;
                }
                boolean z116 = z11 | z12;
                if (i15 == 8388608) {
                    z13 = z9;
                } else {
                    z13 = false;
                }
                boolean z117 = z13 | z116;
                if ((i11 & 3670016) == 1048576) {
                    z14 = z9;
                } else {
                    z14 = false;
                }
                z15 = z117 | z14;
                objRememberedValue2 = composer2.rememberedValue();
                if (z15) {
                    final int i211 = 1;
                    a aVar9 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i211) {
                                case 0:
                                    int i212 = i5 - i8;
                                    int i213 = i7;
                                    if (i212 < i213) {
                                        i212 = i213;
                                    }
                                    cVar.invoke(Integer.valueOf(i212));
                                    break;
                                default:
                                    int i214 = i5 + i8;
                                    int i215 = i7;
                                    if (i214 > i215) {
                                        i214 = i215;
                                    }
                                    cVar.invoke(Integer.valueOf(i214));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar9);
                    objRememberedValue2 = aVar9;
                } else {
                    final int i212 = 1;
                    a aVar10 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i212) {
                                case 0:
                                    int i213 = i5 - i8;
                                    int i214 = i7;
                                    if (i213 < i214) {
                                        i213 = i214;
                                    }
                                    cVar.invoke(Integer.valueOf(i213));
                                    break;
                                default:
                                    int i215 = i5 + i8;
                                    int i216 = i7;
                                    if (i215 > i216) {
                                        i215 = i216;
                                    }
                                    cVar.invoke(Integer.valueOf(i215));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar10);
                    objRememberedValue2 = aVar10;
                }
                composer2.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default6 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU6, z10, null, null, (a) objRememberedValue2, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap17 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default6);
                constructor6 = companion8.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                eVarG5 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl6, currentCompositionLocalMap17);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier17, companion8.getSetModifier());
                ImageVector add3 = AddKt.getAdd(outlined3);
                if (i5 < i7) {
                    jM3926copywmQWz5c$default4 = j5;
                } else {
                    jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                IconKt.m1877Iconww6aTOc(add3, "Increase", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f110)), jM3926copywmQWz5c$default4, composer2, 432, 0);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str5;
            } else {
                f6 = f5;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG7);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier12, companion8.getSetModifier());
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            float f111 = 12;
            Modifier modifierG4 = b.g(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(44)), f111);
            long j12 = p107y3.a.f15978a;
            float f112 = 1;
            Modifier modifierE4 = b.e(f111, BackgroundKt.m207backgroundbw27NRU$default(modifierG4, Color.m3926copywmQWz5c$default(j12, 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f112), Color.m3926copywmQWz5c$default(j12, 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE4);
            constructor2 = companion8.getConstructor();
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
            eVarG = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl2, currentCompositionLocalMap18);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier18, companion8.getSetModifier());
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            long j13 = p107y3.a.f15980c;
            IconKt.m1877Iconww6aTOc(imageVector, str, SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(22)), j13, composerStartRestartGroup, (i11 & 14) | 3456 | (i11 & 112), 0);
            b.u(composerStartRestartGroup, f6, companion6, composerStartRestartGroup, 6);
            Modifier modifierWeight$default4 = RowScope.weight$default(rowScopeInstance4, companion6, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default4);
            constructor3 = companion8.getConstructor();
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
            eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl3, currentCompositionLocalMap19);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier19, companion8.getSetModifier());
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            materialTheme = MaterialTheme.INSTANCE;
            i12 = MaterialTheme.$stable;
            TextStyle bodyLarge4 = materialTheme.getTypography(composerStartRestartGroup, i12).getBodyLarge();
            FontWeight.Companion companion10 = FontWeight.Companion;
            FontWeight semiBold4 = companion10.getSemiBold();
            j5 = p107y3.a.f15990o;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, j5, 0L, (FontStyle) null, semiBold4, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyLarge4, composerStartRestartGroup, ((i11 >> 3) & 14) | 196992, 0, 65498);
            composerStartRestartGroup.startReplaceGroup(-1457690857);
            if (str5.length() > 0) {
                TextKt.m2432Text4IGK_g(str5, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, ((i11 >> 6) & 14) | 384, 3072, 57338);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1457682185);
            if (str3.length() > 0) {
                TextKt.m2432Text4IGK_g(i5 + " " + str3, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 384, 0, 65530);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion7.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion6);
            constructor4 = companion8.getConstructor();
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
            eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap110);
            if (composerM3407constructorimpl4.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier110, companion8.getSetModifier());
            float f113 = 36;
            Modifier modifierClip7 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f113)), RoundedCornerShapeKt.getCircleShape());
            if (i5 > i6) {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            Modifier modifierM207backgroundbw27NRU$default7 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip7, jM3926copywmQWz5c$default, null, 2, null);
            float fM6403constructorimpl7 = Dp.m6403constructorimpl(f112);
            long jM3964getWhite0d7_KjU7 = Color.Companion.m3964getWhite0d7_KjU();
            if (i5 > i6) {
                f7 = 0.08f;
            } else {
                f7 = 0.02f;
            }
            Modifier modifierM220borderxT4_qwU7 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default7, fM6403constructorimpl7, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU7, f7, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            if (i5 > i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            composerStartRestartGroup.startReplaceGroup(-1457651116);
            i13 = i11 & 234881024;
            if (i13 == 67108864) {
                z4 = true;
            } else {
                z4 = false;
            }
            i14 = i11 & 7168;
            if (i14 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z118 = z5 | z4;
            i15 = 29360128 & i11;
            if (i15 == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z119 = z118 | z6;
            if ((458752 & i11) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z119 | z7;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8) {
                final int i213 = 0;
                z9 = true;
                composer2 = composerStartRestartGroup;
                a aVar11 = new a() { // from class: x3.ba
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i213) {
                            case 0:
                                int i214 = i5 - i8;
                                int i215 = i6;
                                if (i214 < i215) {
                                    i214 = i215;
                                }
                                cVar.invoke(Integer.valueOf(i214));
                                break;
                            default:
                                int i216 = i5 + i8;
                                int i217 = i6;
                                if (i216 > i217) {
                                    i216 = i217;
                                }
                                cVar.invoke(Integer.valueOf(i216));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(aVar11);
                objRememberedValue = aVar11;
            } else {
                final int i214 = 0;
                z9 = true;
                composer2 = composerStartRestartGroup;
                a aVar12 = new a() { // from class: x3.ba
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i214) {
                            case 0:
                                int i215 = i5 - i8;
                                int i216 = i6;
                                if (i215 < i216) {
                                    i215 = i216;
                                }
                                cVar.invoke(Integer.valueOf(i215));
                                break;
                            default:
                                int i217 = i5 + i8;
                                int i218 = i6;
                                if (i217 > i218) {
                                    i217 = i218;
                                }
                                cVar.invoke(Integer.valueOf(i217));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(aVar12);
                objRememberedValue = aVar12;
            }
            composer2.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default7 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU7, z3, null, null, (a) objRememberedValue, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap111 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default7);
            constructor5 = companion8.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
            eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl5, currentCompositionLocalMap111);
            if (composerM3407constructorimpl5.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
            } else {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111, companion8.getSetModifier());
            Icons.Outlined outlined4 = Icons.Outlined.INSTANCE;
            ImageVector remove4 = RemoveKt.getRemove(outlined4);
            if (i5 > i6) {
                jM3926copywmQWz5c$default2 = j5;
            } else {
                jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            float f114 = 18;
            IconKt.m1877Iconww6aTOc(remove4, "Decrease", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f114)), jM3926copywmQWz5c$default2, composer2, 432, 0);
            composer2.endNode();
            TextKt.m2432Text4IGK_g(String.valueOf(i5), SizeKt.m718width3ABfNKs(companion6, Dp.m6403constructorimpl(48)), j13, 0L, (FontStyle) null, companion10.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i12).getTitleMedium(), composer2, 197040, 0, 64984);
            Modifier modifierClip8 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f113)), RoundedCornerShapeKt.getCircleShape());
            if (i5 < i7) {
                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            Modifier modifierM207backgroundbw27NRU$default8 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip8, jM3926copywmQWz5c$default3, null, 2, null);
            float fM6403constructorimpl8 = Dp.m6403constructorimpl(f112);
            long jM3964getWhite0d7_KjU8 = Color.Companion.m3964getWhite0d7_KjU();
            if (i5 < i7) {
                f8 = 0.08f;
            } else {
                f8 = 0.02f;
            }
            Modifier modifierM220borderxT4_qwU8 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default8, fM6403constructorimpl8, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU8, f8, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            if (i5 < i7) {
                z10 = z9;
            } else {
                z10 = false;
            }
            composer2.startReplaceGroup(-1457605101);
            if (i13 == 67108864) {
                z11 = z9;
            } else {
                z11 = false;
            }
            if (i14 == 2048) {
                z12 = z9;
            } else {
                z12 = false;
            }
            boolean z1110 = z11 | z12;
            if (i15 == 8388608) {
                z13 = z9;
            } else {
                z13 = false;
            }
            boolean z1111 = z13 | z1110;
            if ((i11 & 3670016) == 1048576) {
                z14 = z9;
            } else {
                z14 = false;
            }
            z15 = z1111 | z14;
            objRememberedValue2 = composer2.rememberedValue();
            if (z15) {
                final int i215 = 1;
                a aVar13 = new a() { // from class: x3.ba
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i215) {
                            case 0:
                                int i216 = i5 - i8;
                                int i217 = i7;
                                if (i216 < i217) {
                                    i216 = i217;
                                }
                                cVar.invoke(Integer.valueOf(i216));
                                break;
                            default:
                                int i218 = i5 + i8;
                                int i219 = i7;
                                if (i218 > i219) {
                                    i218 = i219;
                                }
                                cVar.invoke(Integer.valueOf(i218));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(aVar13);
                objRememberedValue2 = aVar13;
            } else {
                final int i216 = 1;
                a aVar14 = new a() { // from class: x3.ba
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i216) {
                            case 0:
                                int i217 = i5 - i8;
                                int i218 = i7;
                                if (i217 < i218) {
                                    i217 = i218;
                                }
                                cVar.invoke(Integer.valueOf(i217));
                                break;
                            default:
                                int i219 = i5 + i8;
                                int i2110 = i7;
                                if (i219 > i2110) {
                                    i219 = i2110;
                                }
                                cVar.invoke(Integer.valueOf(i219));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(aVar14);
                objRememberedValue2 = aVar14;
            }
            composer2.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default8 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU8, z10, null, null, (a) objRememberedValue2, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap112 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default8);
            constructor6 = companion8.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
            eVarG5 = p035i0.a.g(companion8, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl6, currentCompositionLocalMap112);
            if (composerM3407constructorimpl6.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
            } else {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier112, companion8.getSetModifier());
            ImageVector add4 = AddKt.getAdd(outlined4);
            if (i5 < i7) {
                jM3926copywmQWz5c$default4 = j5;
            } else {
                jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            IconKt.m1877Iconww6aTOc(add4, "Increase", SizeKt.m713size3ABfNKs(companion6, Dp.m6403constructorimpl(f114)), jM3926copywmQWz5c$default4, composer2, 432, 0);
            if (S2.b(composer2)) {
                ComposerKt.traceEventEnd();
            }
            str6 = str5;
        } else {
            if (i22 != 0) {
                str5 = "";
            } else {
                str5 = str4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-613778218, i11, -1, "com.notescrafter.ui.screens.SettingRow (PomodoroSetupScreen.kt:542)");
            }
            Modifier.Companion companion11 = Modifier.Companion;
            f5 = 16;
            Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), Dp.m6403constructorimpl(20), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion12 = Alignment.Companion;
            Alignment.Vertical centerVertically3 = companion12.getCenterVertically();
            Arrangement arrangement3 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically3, composerStartRestartGroup, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN6);
            ComposeUiNode.Companion companion13 = ComposeUiNode.Companion;
            constructor = companion13.getConstructor();
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
            e eVarG8 = p035i0.a.g(companion13, composerM3407constructorimpl, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl, currentCompositionLocalMap113);
            if (composerM3407constructorimpl.getInserting()) {
                f6 = f5;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier113, companion13.getSetModifier());
                RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                float f115 = 12;
                Modifier modifierG5 = b.g(SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(44)), f115);
                long j14 = p107y3.a.f15978a;
                float f116 = 1;
                Modifier modifierE5 = b.e(f115, BackgroundKt.m207backgroundbw27NRU$default(modifierG5, Color.m3926copywmQWz5c$default(j14, 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f116), Color.m3926copywmQWz5c$default(j14, 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy13 = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getCenter(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE5);
                constructor2 = companion13.getConstructor();
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
                eVarG = p035i0.a.g(companion13, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy13, composerM3407constructorimpl2, currentCompositionLocalMap114);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier114, companion13.getSetModifier());
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                long j15 = p107y3.a.f15980c;
                IconKt.m1877Iconww6aTOc(imageVector, str, SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(22)), j15, composerStartRestartGroup, (i11 & 14) | 3456 | (i11 & 112), 0);
                b.u(composerStartRestartGroup, f6, companion11, composerStartRestartGroup, 6);
                Modifier modifierWeight$default5 = RowScope.weight$default(rowScopeInstance5, companion11, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion12.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default5);
                constructor3 = companion13.getConstructor();
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
                eVarG2 = p035i0.a.g(companion13, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap115);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier115, companion13.getSetModifier());
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                materialTheme = MaterialTheme.INSTANCE;
                i12 = MaterialTheme.$stable;
                TextStyle bodyLarge5 = materialTheme.getTypography(composerStartRestartGroup, i12).getBodyLarge();
                FontWeight.Companion companion14 = FontWeight.Companion;
                FontWeight semiBold5 = companion14.getSemiBold();
                j5 = p107y3.a.f15990o;
                TextKt.m2432Text4IGK_g(str, (Modifier) null, j5, 0L, (FontStyle) null, semiBold5, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyLarge5, composerStartRestartGroup, ((i11 >> 3) & 14) | 196992, 0, 65498);
                composerStartRestartGroup.startReplaceGroup(-1457690857);
                if (str5.length() > 0) {
                    TextKt.m2432Text4IGK_g(str5, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, ((i11 >> 6) & 14) | 384, 3072, 57338);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1457682185);
                if (str3.length() > 0) {
                    TextKt.m2432Text4IGK_g(i5 + " " + str3, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 384, 0, 65530);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion12.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion11);
                constructor4 = companion13.getConstructor();
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
                eVarG3 = p035i0.a.g(companion13, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl4, currentCompositionLocalMap116);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier116, companion13.getSetModifier());
                float f117 = 36;
                Modifier modifierClip9 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(f117)), RoundedCornerShapeKt.getCircleShape());
                if (i5 > i6) {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM207backgroundbw27NRU$default9 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip9, jM3926copywmQWz5c$default, null, 2, null);
                float fM6403constructorimpl9 = Dp.m6403constructorimpl(f116);
                long jM3964getWhite0d7_KjU9 = Color.Companion.m3964getWhite0d7_KjU();
                if (i5 > i6) {
                    f7 = 0.08f;
                } else {
                    f7 = 0.02f;
                }
                Modifier modifierM220borderxT4_qwU9 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default9, fM6403constructorimpl9, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU9, f7, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                if (i5 > i6) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1457651116);
                i13 = i11 & 234881024;
                if (i13 == 67108864) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i14 = i11 & 7168;
                if (i14 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z1112 = z5 | z4;
                i15 = 29360128 & i11;
                if (i15 == 8388608) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z1113 = z1112 | z6;
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z1113 | z7;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    final int i217 = 0;
                    z9 = true;
                    composer2 = composerStartRestartGroup;
                    a aVar15 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i217) {
                                case 0:
                                    int i218 = i5 - i8;
                                    int i219 = i6;
                                    if (i218 < i219) {
                                        i218 = i219;
                                    }
                                    cVar.invoke(Integer.valueOf(i218));
                                    break;
                                default:
                                    int i2110 = i5 + i8;
                                    int i2111 = i6;
                                    if (i2110 > i2111) {
                                        i2110 = i2111;
                                    }
                                    cVar.invoke(Integer.valueOf(i2110));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar15);
                    objRememberedValue = aVar15;
                } else {
                    final int i218 = 0;
                    z9 = true;
                    composer2 = composerStartRestartGroup;
                    a aVar16 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i218) {
                                case 0:
                                    int i219 = i5 - i8;
                                    int i2110 = i6;
                                    if (i219 < i2110) {
                                        i219 = i2110;
                                    }
                                    cVar.invoke(Integer.valueOf(i219));
                                    break;
                                default:
                                    int i2111 = i5 + i8;
                                    int i2112 = i6;
                                    if (i2111 > i2112) {
                                        i2111 = i2112;
                                    }
                                    cVar.invoke(Integer.valueOf(i2111));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar16);
                    objRememberedValue = aVar16;
                }
                composer2.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default9 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU9, z3, null, null, (a) objRememberedValue, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy14 = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getCenter(), false);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default9);
                constructor5 = companion13.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
                eVarG4 = p035i0.a.g(companion13, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy14, composerM3407constructorimpl5, currentCompositionLocalMap117);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier117, companion13.getSetModifier());
                Icons.Outlined outlined5 = Icons.Outlined.INSTANCE;
                ImageVector remove5 = RemoveKt.getRemove(outlined5);
                if (i5 > i6) {
                    jM3926copywmQWz5c$default2 = j5;
                } else {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                float f118 = 18;
                IconKt.m1877Iconww6aTOc(remove5, "Decrease", SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(f118)), jM3926copywmQWz5c$default2, composer2, 432, 0);
                composer2.endNode();
                TextKt.m2432Text4IGK_g(String.valueOf(i5), SizeKt.m718width3ABfNKs(companion11, Dp.m6403constructorimpl(48)), j15, 0L, (FontStyle) null, companion14.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i12).getTitleMedium(), composer2, 197040, 0, 64984);
                Modifier modifierClip10 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(f117)), RoundedCornerShapeKt.getCircleShape());
                if (i5 < i7) {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM207backgroundbw27NRU$default10 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip10, jM3926copywmQWz5c$default3, null, 2, null);
                float fM6403constructorimpl10 = Dp.m6403constructorimpl(f116);
                long jM3964getWhite0d7_KjU10 = Color.Companion.m3964getWhite0d7_KjU();
                if (i5 < i7) {
                    f8 = 0.08f;
                } else {
                    f8 = 0.02f;
                }
                Modifier modifierM220borderxT4_qwU10 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default10, fM6403constructorimpl10, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU10, f8, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                if (i5 < i7) {
                    z10 = z9;
                } else {
                    z10 = false;
                }
                composer2.startReplaceGroup(-1457605101);
                if (i13 == 67108864) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (i14 == 2048) {
                    z12 = z9;
                } else {
                    z12 = false;
                }
                boolean z1114 = z11 | z12;
                if (i15 == 8388608) {
                    z13 = z9;
                } else {
                    z13 = false;
                }
                boolean z1115 = z13 | z1114;
                if ((i11 & 3670016) == 1048576) {
                    z14 = z9;
                } else {
                    z14 = false;
                }
                z15 = z1115 | z14;
                objRememberedValue2 = composer2.rememberedValue();
                if (z15) {
                    final int i219 = 1;
                    a aVar17 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i219) {
                                case 0:
                                    int i2110 = i5 - i8;
                                    int i2111 = i7;
                                    if (i2110 < i2111) {
                                        i2110 = i2111;
                                    }
                                    cVar.invoke(Integer.valueOf(i2110));
                                    break;
                                default:
                                    int i2112 = i5 + i8;
                                    int i2113 = i7;
                                    if (i2112 > i2113) {
                                        i2112 = i2113;
                                    }
                                    cVar.invoke(Integer.valueOf(i2112));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar17);
                    objRememberedValue2 = aVar17;
                } else {
                    final int i2110 = 1;
                    a aVar18 = new a() { // from class: x3.ba
                        @Override // O3.a
                        public final Object invoke() {
                            switch (i2110) {
                                case 0:
                                    int i2111 = i5 - i8;
                                    int i2112 = i7;
                                    if (i2111 < i2112) {
                                        i2111 = i2112;
                                    }
                                    cVar.invoke(Integer.valueOf(i2111));
                                    break;
                                default:
                                    int i2113 = i5 + i8;
                                    int i2114 = i7;
                                    if (i2113 > i2114) {
                                        i2113 = i2114;
                                    }
                                    cVar.invoke(Integer.valueOf(i2113));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer2.updateRememberedValue(aVar18);
                    objRememberedValue2 = aVar18;
                }
                composer2.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default10 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU10, z10, null, null, (a) objRememberedValue2, 6, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy15 = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getCenter(), false);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default10);
                constructor6 = companion13.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                eVarG5 = p035i0.a.g(companion13, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy15, composerM3407constructorimpl6, currentCompositionLocalMap118);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier118, companion13.getSetModifier());
                ImageVector add5 = AddKt.getAdd(outlined5);
                if (i5 < i7) {
                    jM3926copywmQWz5c$default4 = j5;
                } else {
                    jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                IconKt.m1877Iconww6aTOc(add5, "Increase", SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(f118)), jM3926copywmQWz5c$default4, composer2, 432, 0);
                if (S2.b(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str5;
            } else {
                f6 = f5;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG8);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier113, companion13.getSetModifier());
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            float f119 = 12;
            Modifier modifierG6 = b.g(SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(44)), f119);
            long j16 = p107y3.a.f15978a;
            float f1110 = 1;
            Modifier modifierE6 = b.e(f119, BackgroundKt.m207backgroundbw27NRU$default(modifierG6, Color.m3926copywmQWz5c$default(j16, 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f1110), Color.m3926copywmQWz5c$default(j16, 0.15f, 0.0f, 0.0f, 0.0f, 14, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy16 = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getCenter(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE6);
            constructor2 = companion13.getConstructor();
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
            eVarG = p035i0.a.g(companion13, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy16, composerM3407constructorimpl2, currentCompositionLocalMap119);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier119, companion13.getSetModifier());
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            long j17 = p107y3.a.f15980c;
            IconKt.m1877Iconww6aTOc(imageVector, str, SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(22)), j17, composerStartRestartGroup, (i11 & 14) | 3456 | (i11 & 112), 0);
            b.u(composerStartRestartGroup, f6, companion11, composerStartRestartGroup, 6);
            Modifier modifierWeight$default6 = RowScope.weight$default(rowScopeInstance6, companion11, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion12.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default6);
            constructor3 = companion13.getConstructor();
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
            eVarG2 = p035i0.a.g(companion13, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl3, currentCompositionLocalMap1110);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1110, companion13.getSetModifier());
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            materialTheme = MaterialTheme.INSTANCE;
            i12 = MaterialTheme.$stable;
            TextStyle bodyLarge6 = materialTheme.getTypography(composerStartRestartGroup, i12).getBodyLarge();
            FontWeight.Companion companion15 = FontWeight.Companion;
            FontWeight semiBold6 = companion15.getSemiBold();
            j5 = p107y3.a.f15990o;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, j5, 0L, (FontStyle) null, semiBold6, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyLarge6, composerStartRestartGroup, ((i11 >> 3) & 14) | 196992, 0, 65498);
            composerStartRestartGroup.startReplaceGroup(-1457690857);
            if (str5.length() > 0) {
                TextKt.m2432Text4IGK_g(str5, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, ((i11 >> 6) & 14) | 384, 3072, 57338);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1457682185);
            if (str3.length() > 0) {
                TextKt.m2432Text4IGK_g(i5 + " " + str3, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodySmall(), composerStartRestartGroup, 384, 0, 65530);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion12.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion11);
            constructor4 = companion13.getConstructor();
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
            eVarG3 = p035i0.a.g(companion13, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl4, currentCompositionLocalMap1111);
            if (composerM3407constructorimpl4.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1111, companion13.getSetModifier());
            float f1111 = 36;
            Modifier modifierClip11 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(f1111)), RoundedCornerShapeKt.getCircleShape());
            if (i5 > i6) {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            Modifier modifierM207backgroundbw27NRU$default11 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip11, jM3926copywmQWz5c$default, null, 2, null);
            float fM6403constructorimpl11 = Dp.m6403constructorimpl(f1110);
            long jM3964getWhite0d7_KjU11 = Color.Companion.m3964getWhite0d7_KjU();
            if (i5 > i6) {
                f7 = 0.08f;
            } else {
                f7 = 0.02f;
            }
            Modifier modifierM220borderxT4_qwU11 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default11, fM6403constructorimpl11, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU11, f7, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            if (i5 > i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            composerStartRestartGroup.startReplaceGroup(-1457651116);
            i13 = i11 & 234881024;
            if (i13 == 67108864) {
                z4 = true;
            } else {
                z4 = false;
            }
            i14 = i11 & 7168;
            if (i14 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z1116 = z5 | z4;
            i15 = 29360128 & i11;
            if (i15 == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z1117 = z1116 | z6;
            if ((458752 & i11) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z1117 | z7;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z8) {
                final int i2111 = 0;
                z9 = true;
                composer2 = composerStartRestartGroup;
                a aVar19 = new a() { // from class: x3.ba
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i2111) {
                            case 0:
                                int i2112 = i5 - i8;
                                int i2113 = i6;
                                if (i2112 < i2113) {
                                    i2112 = i2113;
                                }
                                cVar.invoke(Integer.valueOf(i2112));
                                break;
                            default:
                                int i2114 = i5 + i8;
                                int i2115 = i6;
                                if (i2114 > i2115) {
                                    i2114 = i2115;
                                }
                                cVar.invoke(Integer.valueOf(i2114));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(aVar19);
                objRememberedValue = aVar19;
            } else {
                final int i2112 = 0;
                z9 = true;
                composer2 = composerStartRestartGroup;
                a aVar110 = new a() { // from class: x3.ba
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i2112) {
                            case 0:
                                int i2113 = i5 - i8;
                                int i2114 = i6;
                                if (i2113 < i2114) {
                                    i2113 = i2114;
                                }
                                cVar.invoke(Integer.valueOf(i2113));
                                break;
                            default:
                                int i2115 = i5 + i8;
                                int i2116 = i6;
                                if (i2115 > i2116) {
                                    i2115 = i2116;
                                }
                                cVar.invoke(Integer.valueOf(i2115));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(aVar110);
                objRememberedValue = aVar110;
            }
            composer2.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default11 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU11, z3, null, null, (a) objRememberedValue, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy17 = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getCenter(), false);
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap1112 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1112 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default11);
            constructor5 = companion13.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
            eVarG4 = p035i0.a.g(companion13, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy17, composerM3407constructorimpl5, currentCompositionLocalMap1112);
            if (composerM3407constructorimpl5.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
            } else {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1112, companion13.getSetModifier());
            Icons.Outlined outlined6 = Icons.Outlined.INSTANCE;
            ImageVector remove6 = RemoveKt.getRemove(outlined6);
            if (i5 > i6) {
                jM3926copywmQWz5c$default2 = j5;
            } else {
                jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            float f1112 = 18;
            IconKt.m1877Iconww6aTOc(remove6, "Decrease", SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(f1112)), jM3926copywmQWz5c$default2, composer2, 432, 0);
            composer2.endNode();
            TextKt.m2432Text4IGK_g(String.valueOf(i5), SizeKt.m718width3ABfNKs(companion11, Dp.m6403constructorimpl(48)), j17, 0L, (FontStyle) null, companion15.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i12).getTitleMedium(), composer2, 197040, 0, 64984);
            Modifier modifierClip12 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(f1111)), RoundedCornerShapeKt.getCircleShape());
            if (i5 < i7) {
                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            Modifier modifierM207backgroundbw27NRU$default12 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip12, jM3926copywmQWz5c$default3, null, 2, null);
            float fM6403constructorimpl12 = Dp.m6403constructorimpl(f1110);
            long jM3964getWhite0d7_KjU12 = Color.Companion.m3964getWhite0d7_KjU();
            if (i5 < i7) {
                f8 = 0.08f;
            } else {
                f8 = 0.02f;
            }
            Modifier modifierM220borderxT4_qwU12 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default12, fM6403constructorimpl12, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU12, f8, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            if (i5 < i7) {
                z10 = z9;
            } else {
                z10 = false;
            }
            composer2.startReplaceGroup(-1457605101);
            if (i13 == 67108864) {
                z11 = z9;
            } else {
                z11 = false;
            }
            if (i14 == 2048) {
                z12 = z9;
            } else {
                z12 = false;
            }
            boolean z1118 = z11 | z12;
            if (i15 == 8388608) {
                z13 = z9;
            } else {
                z13 = false;
            }
            boolean z1119 = z13 | z1118;
            if ((i11 & 3670016) == 1048576) {
                z14 = z9;
            } else {
                z14 = false;
            }
            z15 = z1119 | z14;
            objRememberedValue2 = composer2.rememberedValue();
            if (z15) {
                final int i2113 = 1;
                a aVar111 = new a() { // from class: x3.ba
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i2113) {
                            case 0:
                                int i2114 = i5 - i8;
                                int i2115 = i7;
                                if (i2114 < i2115) {
                                    i2114 = i2115;
                                }
                                cVar.invoke(Integer.valueOf(i2114));
                                break;
                            default:
                                int i2116 = i5 + i8;
                                int i2117 = i7;
                                if (i2116 > i2117) {
                                    i2116 = i2117;
                                }
                                cVar.invoke(Integer.valueOf(i2116));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(aVar111);
                objRememberedValue2 = aVar111;
            } else {
                final int i2114 = 1;
                a aVar112 = new a() { // from class: x3.ba
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i2114) {
                            case 0:
                                int i2115 = i5 - i8;
                                int i2116 = i7;
                                if (i2115 < i2116) {
                                    i2115 = i2116;
                                }
                                cVar.invoke(Integer.valueOf(i2115));
                                break;
                            default:
                                int i2117 = i5 + i8;
                                int i2118 = i7;
                                if (i2117 > i2118) {
                                    i2117 = i2118;
                                }
                                cVar.invoke(Integer.valueOf(i2117));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(aVar112);
                objRememberedValue2 = aVar112;
            }
            composer2.endReplaceGroup();
            Modifier modifierM242clickableXHw0xAI$default12 = ClickableKt.m242clickableXHw0xAI$default(modifierM220borderxT4_qwU12, z10, null, null, (a) objRememberedValue2, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy18 = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getCenter(), false);
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap1113 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1113 = ComposedModifierKt.materializeModifier(composer2, modifierM242clickableXHw0xAI$default12);
            constructor6 = companion13.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
            eVarG5 = p035i0.a.g(companion13, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy18, composerM3407constructorimpl6, currentCompositionLocalMap1113);
            if (composerM3407constructorimpl6.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
            } else {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1113, companion13.getSetModifier());
            ImageVector add6 = AddKt.getAdd(outlined6);
            if (i5 < i7) {
                jM3926copywmQWz5c$default4 = j5;
            } else {
                jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            IconKt.m1877Iconww6aTOc(add6, "Increase", SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(f1112)), jM3926copywmQWz5c$default4, composer2, 432, 0);
            if (S2.b(composer2)) {
                ComposerKt.traceEventEnd();
            }
            str6 = str5;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.ca
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i9 | 1);
                    String str7 = str;
                    String str8 = str3;
                    c cVar2 = cVar;
                    AbstractC2642qa.c(imageVector, str7, str6, i5, str8, i6, i7, i8, cVar2, (Composer) obj, iUpdateChangedFlags, i10);
                    return B3.o.f154a;
                }
            });
        }
    }
}

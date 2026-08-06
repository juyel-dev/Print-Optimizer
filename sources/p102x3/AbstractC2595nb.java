package p102x3;

import O3.a;
import O3.c;
import O3.e;
import W3.j;
import X3.A;
import X3.H;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.outlined.CheckCircleKt;
import androidx.compose.material.icons.outlined.DeleteKt;
import androidx.compose.material.icons.outlined.EditKt;
import androidx.compose.material.icons.outlined.PlaceKt;
import androidx.compose.material.icons.outlined.ShieldKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import e4.d;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;
import p083t3.C2294k;
import p083t3.C2306q;
import p083t3.C2321y;
import p083t3.J0;
import p083t3.O;
import p083t3.b1;
import p087u3.v;

/* JADX INFO: renamed from: x3.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2595nb {
    /* JADX WARN: Code duplicated, block: B:155:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:157:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:159:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:160:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:163:0x0527  */
    /* JADX WARN: Code duplicated, block: B:165:0x056b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0577  */
    /* JADX WARN: Code duplicated, block: B:169:0x057b  */
    /* JADX WARN: Code duplicated, block: B:174:0x059c  */
    /* JADX WARN: Code duplicated, block: B:177:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:180:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:181:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:186:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:188:0x065d  */
    /* JADX WARN: Code duplicated, block: B:191:0x069e  */
    /* JADX WARN: Code duplicated, block: B:194:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:195:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:198:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:201:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:205:0x0720  */
    /* JADX WARN: Code duplicated, block: B:208:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:211:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:212:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:215:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:217:0x07df  */
    /* JADX WARN: Code duplicated, block: B:220:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:221:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:224:0x084f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0899  */
    /* JADX WARN: Code duplicated, block: B:233:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:236:0x0905  */
    /* JADX WARN: Code duplicated, block: B:239:0x090d  */
    /* JADX WARN: Code duplicated, block: B:242:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:245:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:246:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:249:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:251:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:254:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:259:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:260:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:263:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:265:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:268:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:271:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:272:0x0af7  */
    /* JADX WARN: Code duplicated, block: B:275:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:277:0x0b16  */
    /* JADX WARN: Code duplicated, block: B:279:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:281:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:284:0x0bca  */
    /* JADX WARN: Code duplicated, block: B:285:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:288:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:290:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:293:0x0c55  */
    /* JADX WARN: Code duplicated, block: B:294:0x0c58  */
    /* JADX WARN: Code duplicated, block: B:297:0x0c5f  */
    /* JADX WARN: Code duplicated, block: B:299:0x0c67  */
    /* JADX WARN: Code duplicated, block: B:302:0x0ca4  */
    /* JADX WARN: Code duplicated, block: B:305:0x0cb0  */
    /* JADX WARN: Code duplicated, block: B:306:0x0cb4  */
    /* JADX WARN: Code duplicated, block: B:309:0x0cc5  */
    /* JADX WARN: Code duplicated, block: B:311:0x0cd3  */
    /* JADX WARN: Code duplicated, block: B:314:0x0d60  */
    /* JADX WARN: Code duplicated, block: B:315:0x0d63  */
    /* JADX WARN: Code duplicated, block: B:318:0x0d6a  */
    /* JADX WARN: Code duplicated, block: B:320:0x0d72  */
    /* JADX WARN: Code duplicated, block: B:323:0x0daf  */
    /* JADX WARN: Code duplicated, block: B:326:0x0dbb  */
    /* JADX WARN: Code duplicated, block: B:327:0x0dbf  */
    /* JADX WARN: Code duplicated, block: B:330:0x0dd0  */
    /* JADX WARN: Code duplicated, block: B:332:0x0dde  */
    /* JADX WARN: Code duplicated, block: B:336:0x0e25  */
    /* JADX WARN: Code duplicated, block: B:339:0x0e6d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0e75  */
    /* JADX WARN: Code duplicated, block: B:346:0x0e81  */
    /* JADX WARN: Code duplicated, block: B:348:0x0ed4  */
    /* JADX WARN: Code duplicated, block: B:351:0x0ee8  */
    public static final void a(v vVar, a aVar, a aVar2, a aVar3, Composer composer, int i5) {
        int i6;
        long jM3964getWhite0d7_KjU;
        float f5;
        float f6;
        float f7;
        long jM3926copywmQWz5c$default;
        long jM3926copywmQWz5c$default2;
        Composer composer2;
        long jColor;
        Composer composer3;
        ComposeUiNode.Companion companion;
        Arrangement arrangement;
        Modifier.Companion companion2;
        float f8;
        Arrangement arrangement2;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        ComposeUiNode.Companion companion3;
        float f9;
        Icons.Outlined outlined;
        float f10;
        String phone;
        float f11;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        String flatHouse;
        String str;
        String areaStreet;
        String landmark;
        String city;
        String state;
        String pincode;
        float f12;
        Modifier.Companion companion4;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        boolean z3;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG3;
        boolean z4;
        Object objRememberedValue;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG4;
        int i7;
        float f13;
        int i8;
        boolean z5;
        Object objRememberedValue2;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG5;
        boolean z6;
        Object objRememberedValue3;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        e eVarG6;
        int currentCompositeKeyHash8;
        a constructor8;
        Composer composerM3407constructorimpl8;
        e eVarG7;
        int currentCompositeKeyHash9;
        a constructor9;
        Composer composerM3407constructorimpl9;
        e eVarG8;
        int currentCompositeKeyHash10;
        a constructor10;
        Composer composerM3407constructorimpl10;
        e eVarG9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1579666040);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(vVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i6 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1579666040, i6, -1, "com.notescrafter.ui.screens.AddressCard (PrintAddressesScreen.kt:575)");
            }
            Integer numIsDefault = vVar.isDefault();
            boolean z7 = numIsDefault != null && numIsDefault.intValue() == 1;
            Integer numIsVerified = vVar.isVerified();
            boolean z8 = numIsVerified != null && numIsVerified.intValue() == 1;
            Modifier.Companion companion5 = Modifier.Companion;
            float f14 = 24;
            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), f14), z7 ? Color.m3926copywmQWz5c$default(ColorKt.Color(4284704497L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            float f15 = 1;
            float fM6403constructorimpl = Dp.m6403constructorimpl(f15);
            if (z7) {
                jM3964getWhite0d7_KjU = ColorKt.Color(4284704497L);
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.3f;
            } else {
                jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.08f;
            }
            long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f7, 0.0f, f5, f6, 14, null);
            boolean z9 = z7;
            Modifier modifierE = b.e(f14, modifierM207backgroundbw27NRU$default, fM6403constructorimpl, jM3926copywmQWz5c$default3);
            Alignment.Companion companion6 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            a constructor11 = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor11);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl11 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG10 = p035i0.a.g(companion7, composerM3407constructorimpl11, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl11, currentCompositionLocalMap);
            if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG10);
            }
            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier, companion7.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion5, Dp.m6403constructorimpl(20));
            Arrangement arrangement3 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion6.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM668padding3ABfNKs);
            a constructor12 = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor12);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl12 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG11 = p035i0.a.g(companion7, composerM3407constructorimpl12, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl12, currentCompositionLocalMap2);
            if (composerM3407constructorimpl12.getInserting() || !o.b(composerM3407constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                p035i0.a.t(currentCompositeKeyHash12, composerM3407constructorimpl12, currentCompositeKeyHash12, eVarG11);
            }
            Updater.m3414setimpl(composerM3407constructorimpl12, modifierMaterializeModifier2, companion7.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement3.getSpaceBetween(), companion6.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            a constructor13 = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor13);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl13 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG12 = p035i0.a.g(companion7, composerM3407constructorimpl13, measurePolicyRowMeasurePolicy, composerM3407constructorimpl13, currentCompositionLocalMap3);
            if (composerM3407constructorimpl13.getInserting() || !o.b(composerM3407constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                p035i0.a.t(currentCompositeKeyHash13, composerM3407constructorimpl13, currentCompositeKeyHash13, eVarG12);
            }
            Updater.m3414setimpl(composerM3407constructorimpl13, modifierMaterializeModifier3, companion7.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion6.getCenterVertically();
            float f16 = 8;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f16));
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion5, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            a constructor14 = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor14);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl14 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG13 = p035i0.a.g(companion7, composerM3407constructorimpl14, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl14, currentCompositionLocalMap4);
            if (composerM3407constructorimpl14.getInserting() || !o.b(composerM3407constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                p035i0.a.t(currentCompositeKeyHash14, composerM3407constructorimpl14, currentCompositeKeyHash14, eVarG13);
            }
            Updater.m3414setimpl(composerM3407constructorimpl14, modifierMaterializeModifier4, companion7.getSetModifier());
            String fullName = vVar.getFullName();
            if (fullName == null) {
                String firstName = vVar.getFirstName();
                if (firstName == null) {
                    firstName = "";
                }
                String lastName = vVar.getLastName();
                if (lastName == null) {
                    lastName = "";
                }
                fullName = j.I0(firstName + " " + lastName).toString();
            }
            Color.Companion companion8 = Color.Companion;
            long jM3964getWhite0d7_KjU2 = companion8.m3964getWhite0d7_KjU();
            int i9 = i6;
            FontWeight.Companion companion9 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(fullName, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(16), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200064, 3120, 120786);
            String addressType = vVar.getAddressType();
            if (addressType == null) {
                addressType = "Home";
            }
            float f17 = 6;
            Modifier modifierD = b.d(f17, companion5);
            if (o.b(addressType, "Home")) {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(ColorKt.Color(4287837162L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3926copywmQWz5c$default = o.b(addressType, "Work") ? Color.m3926copywmQWz5c$default(ColorKt.Color(4280640491L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m3926copywmQWz5c$default(ColorKt.Color(4292441862L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(modifierD, jM3926copywmQWz5c$default, null, 2, null);
            float fM6403constructorimpl2 = Dp.m6403constructorimpl(f15);
            if (o.b(addressType, "Home")) {
                jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(ColorKt.Color(4290807036L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3926copywmQWz5c$default2 = o.b(addressType, "Work") ? Color.m3926copywmQWz5c$default(ColorKt.Color(4284524026L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m3926copywmQWz5c$default(ColorKt.Color(4294688548L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            float f18 = 2;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f17, modifierM207backgroundbw27NRU$default2, fM6403constructorimpl2, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(f17), Dp.m6403constructorimpl(f18));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
            int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
            a constructor15 = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor15);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl15 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG14 = p035i0.a.g(companion7, composerM3407constructorimpl15, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl15, currentCompositionLocalMap5);
            if (composerM3407constructorimpl15.getInserting()) {
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                if (!o.b(composerM3407constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl15, modifierMaterializeModifier5, companion7.getSetModifier());
                Locale locale = Locale.ROOT;
                String upperCase = addressType.toUpperCase(locale);
                o.e(upperCase, "toUpperCase(...)");
                if (o.b(addressType, "Home")) {
                    jColor = ColorKt.Color(4290807036L);
                } else if (o.b(addressType, "Work")) {
                    jColor = ColorKt.Color(4284524026L);
                } else {
                    jColor = ColorKt.Color(4294688548L);
                }
                composer3 = composer2;
                TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, jColor, TextUnitKt.getSp(8), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 199680, 0, 131026);
                composer3.endNode();
                composer3.endNode();
                composer3.startReplaceGroup(-1569836840);
                if (z9) {
                    Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion5, RoundedCornerShapeKt.RoundedCornerShape(50)), p107y3.a.e(), null, 2, null), Dp.m6403constructorimpl(f16), Dp.m6403constructorimpl(3));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN5);
                    constructor9 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor9);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                    eVarG8 = p035i0.a.g(companion7, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl9, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG8);
                    }
                    MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(4, arrangement3, b.c(companion7, composerM3407constructorimpl9, modifierMaterializeModifier6, companion6), composer3, 54);
                    currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, companion5);
                    constructor10 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor10);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                    eVarG9 = p035i0.a.g(companion7, composerM3407constructorimpl10, measurePolicyI, composerM3407constructorimpl10, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG9);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier7, companion7.getSetModifier());
                    arrangement = arrangement3;
                    companion = companion7;
                    IconKt.m1877Iconww6aTOc(StarKt.getStar(Icons.Filled.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(10)), companion8.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                    companion2 = companion5;
                    TextKt.m2432Text4IGK_g("DEFAULT", (Modifier) null, companion8.m3964getWhite0d7_KjU(), TextUnitKt.getSp(8), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                    composer3.endNode();
                    composer3.endNode();
                } else {
                    companion = companion7;
                    arrangement = arrangement3;
                    companion2 = companion5;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                f8 = 4;
                Modifier.Companion companion10 = companion2;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f8)), composer3, 6);
                arrangement2 = arrangement;
                MeasurePolicy measurePolicyI2 = androidx.compose.foundation.text.modifiers.a.i(f17, arrangement2, companion6.getCenterVertically(), composer3, 54);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, companion10);
                constructor = companion.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer3);
                companion3 = companion;
                e eVarG15 = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyI2, composerM3407constructorimpl, currentCompositionLocalMap8);
                if (composerM3407constructorimpl.getInserting()) {
                    f9 = f17;
                } else {
                    f9 = f17;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion3.getSetModifier());
                    outlined = Icons.Outlined.INSTANCE;
                    f10 = f9;
                    IconKt.m1877Iconww6aTOc(CheckCircleKt.getCheckCircle(outlined), (String) null, SizeKt.m713size3ABfNKs(companion10, Dp.m6403constructorimpl(14)), Color.m3926copywmQWz5c$default(ColorKt.Color(4281652121L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                    phone = vVar.getPhone();
                    if (phone == null) {
                        phone = "";
                    }
                    TextKt.m2432Text4IGK_g(phone, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, companion9.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                    composer3.endNode();
                    f11 = 12;
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f11)), composer3, 6);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f18)), companion6.getStart(), composer3, 6);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer3, companion10);
                    constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                    eVarG = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap9);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier9, companion3.getSetModifier());
                    flatHouse = vVar.getFlatHouse();
                    if (flatHouse == null) {
                        str = "";
                    } else {
                        str = flatHouse;
                    }
                    TextKt.m2432Text4IGK_g(str, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                    areaStreet = vVar.getAreaStreet();
                    if (areaStreet == null) {
                        areaStreet = "";
                    }
                    TextKt.m2432Text4IGK_g(areaStreet, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                    composer3.startReplaceGroup(-1569753830);
                    landmark = vVar.getLandmark();
                    if (landmark != null && !j.m0(landmark)) {
                        TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.y("Landmark: ", vVar.getLandmark()), (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                    }
                    composer3.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f10)), composer3, 6);
                    city = vVar.getCity();
                    if (city == null) {
                        city = "";
                    }
                    state = vVar.getState();
                    if (state == null) {
                        state = "";
                    }
                    pincode = vVar.getPincode();
                    if (pincode == null) {
                        pincode = "";
                    }
                    String upperCase2 = (city + ", " + state + " " + pincode).toUpperCase(locale);
                    o.e(upperCase2, "toUpperCase(...)");
                    TextKt.m2432Text4IGK_g(upperCase2, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, companion9.getBlack(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                    composer3.endNode();
                    f12 = (float) 16;
                    companion4 = companion10;
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), composer3, 6);
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 384, 3);
                    b.m(f11, companion4, composer3, 6);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion6.getCenterVertically(), composer3, 54);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                    constructor3 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                    eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap10);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier10, companion3.getSetModifier());
                    if (z8) {
                        composer3.startReplaceGroup(-1416516806);
                        Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(b.e(f16, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion4, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16))), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f16), Dp.m6403constructorimpl(f8));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN6);
                        constructor7 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor7);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                        eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl7, currentCompositionLocalMap11);
                        if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                        }
                        MeasurePolicy measurePolicyI3 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement2, b.c(companion3, composerM3407constructorimpl7, modifierMaterializeModifier11, companion6), composer3, 54);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap12 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer3, companion4);
                        constructor8 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor8);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                        eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyI3, composerM3407constructorimpl8, currentCompositionLocalMap12);
                        if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier12, companion3.getSetModifier());
                        IconKt.m1877Iconww6aTOc(ShieldKt.getShield(outlined), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f11)), ColorKt.Color(4281652121L), composer3, 3504, 0);
                        z3 = true;
                        TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, ColorKt.Color(4281652121L), TextUnitKt.getSp(9), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                        composer3.endNode();
                        composer3.endNode();
                        composer3.endReplaceGroup();
                        f13 = f16;
                        companion4 = companion4;
                        i8 = i9;
                        z6 = false;
                        i7 = 10;
                    } else {
                        z3 = true;
                        composer3.startReplaceGroup(-1415599919);
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f16)), companion6.getCenterVertically(), composer3, 54);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap13 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer3, companion4);
                        constructor4 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                        eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap13);
                        if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier13, companion3.getSetModifier());
                        float f19 = 36;
                        float f20 = 10;
                        Modifier modifierE2 = b.e(f20, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f19)), f20), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null));
                        composer3.startReplaceGroup(744214624);
                        if ((i9 & 112) == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objRememberedValue = composer3.rememberedValue();
                        if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new O(3, aVar);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierE2, false, null, null, (a) objRememberedValue, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap14 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer3, modifierM242clickableXHw0xAI$default);
                        constructor5 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                        eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl5, currentCompositionLocalMap14);
                        if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier14, companion3.getSetModifier());
                        i7 = 10;
                        f13 = f16;
                        i8 = i9;
                        IconKt.m1877Iconww6aTOc(EditKt.getEdit(outlined), "Edit", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                        composer3.endNode();
                        Modifier modifierE3 = b.e(f20, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f19)), f20), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null));
                        composer3.startReplaceGroup(744243330);
                        if ((i8 & 896) == 256) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objRememberedValue2 = composer3.rememberedValue();
                        if (z5 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new O(4, aVar2);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM242clickableXHw0xAI$default2 = ClickableKt.m242clickableXHw0xAI$default(modifierE3, false, null, null, (a) objRememberedValue2, 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap15 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer3, modifierM242clickableXHw0xAI$default2);
                        constructor6 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor6);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                        eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl6, currentCompositionLocalMap15);
                        if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier15, companion3.getSetModifier());
                        z6 = false;
                        IconKt.m1877Iconww6aTOc(DeleteKt.getDelete(outlined), "Delete", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                        composer3.endNode();
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    }
                    composer3.startReplaceGroup(-1569621594);
                    if (!z9) {
                        long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                        FontWeight bold = companion9.getBold();
                        long sp = TextUnitKt.getSp(i7);
                        float f21 = f13;
                        Modifier modifierE4 = b.e(f21, b.d(f21, companion4), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                        composer3.startReplaceGroup(-1569606425);
                        if ((i8 & 7168) != 2048) {
                            z3 = z6;
                        }
                        objRememberedValue3 = composer3.rememberedValue();
                        if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new O(5, aVar3);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceGroup();
                        TextKt.m2432Text4IGK_g("SET DEFAULT", PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE4, false, null, null, (a) objRememberedValue3, 7, null), Dp.m6403constructorimpl(i7), Dp.m6403constructorimpl(f10)), jM3926copywmQWz5c$default4, sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131024);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG15);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion3.getSetModifier());
                outlined = Icons.Outlined.INSTANCE;
                f10 = f9;
                IconKt.m1877Iconww6aTOc(CheckCircleKt.getCheckCircle(outlined), (String) null, SizeKt.m713size3ABfNKs(companion10, Dp.m6403constructorimpl(14)), Color.m3926copywmQWz5c$default(ColorKt.Color(4281652121L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                phone = vVar.getPhone();
                if (phone == null) {
                    phone = "";
                }
                TextKt.m2432Text4IGK_g(phone, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, companion9.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                composer3.endNode();
                f11 = 12;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f11)), composer3, 6);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f18)), companion6.getStart(), composer3, 6);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap16 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer3, companion10);
                constructor2 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                eVarG = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap16);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier16, companion3.getSetModifier());
                flatHouse = vVar.getFlatHouse();
                if (flatHouse == null) {
                    str = "";
                } else {
                    str = flatHouse;
                }
                TextKt.m2432Text4IGK_g(str, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                areaStreet = vVar.getAreaStreet();
                if (areaStreet == null) {
                    areaStreet = "";
                }
                TextKt.m2432Text4IGK_g(areaStreet, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                composer3.startReplaceGroup(-1569753830);
                landmark = vVar.getLandmark();
                if (landmark != null) {
                    TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.y("Landmark: ", vVar.getLandmark()), (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                }
                composer3.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f10)), composer3, 6);
                city = vVar.getCity();
                if (city == null) {
                    city = "";
                }
                state = vVar.getState();
                if (state == null) {
                    state = "";
                }
                pincode = vVar.getPincode();
                if (pincode == null) {
                    pincode = "";
                }
                String upperCase3 = (city + ", " + state + " " + pincode).toUpperCase(locale);
                o.e(upperCase3, "toUpperCase(...)");
                TextKt.m2432Text4IGK_g(upperCase3, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, companion9.getBlack(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                composer3.endNode();
                f12 = (float) 16;
                companion4 = companion10;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), composer3, 6);
                DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 384, 3);
                b.m(f11, companion4, composer3, 6);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion6.getCenterVertically(), composer3, 54);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap17 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default3);
                constructor3 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap17);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier17, companion3.getSetModifier());
                if (z8) {
                    composer3.startReplaceGroup(-1416516806);
                    Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(b.e(f16, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion4, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16))), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f16), Dp.m6403constructorimpl(f8));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN7);
                    constructor7 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                    eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl7, currentCompositionLocalMap18);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    }
                    MeasurePolicy measurePolicyI4 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement2, b.c(companion3, composerM3407constructorimpl7, modifierMaterializeModifier18, companion6), composer3, 54);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer3, companion4);
                    constructor8 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                    eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyI4, composerM3407constructorimpl8, currentCompositionLocalMap19);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier19, companion3.getSetModifier());
                    IconKt.m1877Iconww6aTOc(ShieldKt.getShield(outlined), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f11)), ColorKt.Color(4281652121L), composer3, 3504, 0);
                    z3 = true;
                    TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, ColorKt.Color(4281652121L), TextUnitKt.getSp(9), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                    composer3.endNode();
                    composer3.endNode();
                    composer3.endReplaceGroup();
                    f13 = f16;
                    companion4 = companion4;
                    i8 = i9;
                    z6 = false;
                    i7 = 10;
                } else {
                    z3 = true;
                    composer3.startReplaceGroup(-1415599919);
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f16)), companion6.getCenterVertically(), composer3, 54);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer3, companion4);
                    constructor4 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                    eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap110);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier110, companion3.getSetModifier());
                    float f110 = 36;
                    float f22 = 10;
                    Modifier modifierE5 = b.e(f22, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f110)), f22), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer3.startReplaceGroup(744214624);
                    if ((i9 & 112) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objRememberedValue = composer3.rememberedValue();
                    if (z4) {
                        objRememberedValue = new O(3, aVar);
                        composer3.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new O(3, aVar);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default3 = ClickableKt.m242clickableXHw0xAI$default(modifierE5, false, null, null, (a) objRememberedValue, 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer3, modifierM242clickableXHw0xAI$default3);
                    constructor5 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                    eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl5, currentCompositionLocalMap111);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111, companion3.getSetModifier());
                    i7 = 10;
                    f13 = f16;
                    i8 = i9;
                    IconKt.m1877Iconww6aTOc(EditKt.getEdit(outlined), "Edit", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                    composer3.endNode();
                    Modifier modifierE6 = b.e(f22, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f110)), f22), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer3.startReplaceGroup(744243330);
                    if ((i8 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objRememberedValue2 = composer3.rememberedValue();
                    if (z5) {
                        objRememberedValue2 = new O(4, aVar2);
                        composer3.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new O(4, aVar2);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default4 = ClickableKt.m242clickableXHw0xAI$default(modifierE6, false, null, null, (a) objRememberedValue2, 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap112 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composer3, modifierM242clickableXHw0xAI$default4);
                    constructor6 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                    eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl6, currentCompositionLocalMap112);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier112, companion3.getSetModifier());
                    z6 = false;
                    IconKt.m1877Iconww6aTOc(DeleteKt.getDelete(outlined), "Delete", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                    composer3.endNode();
                    composer3.endNode();
                    composer3.endReplaceGroup();
                }
                composer3.startReplaceGroup(-1569621594);
                if (!z9) {
                    long jM3926copywmQWz5c$default5 = Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    FontWeight bold2 = companion9.getBold();
                    long sp2 = TextUnitKt.getSp(i7);
                    float f23 = f13;
                    Modifier modifierE7 = b.e(f23, b.d(f23, companion4), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer3.startReplaceGroup(-1569606425);
                    if ((i8 & 7168) != 2048) {
                        z3 = z6;
                    }
                    objRememberedValue3 = composer3.rememberedValue();
                    if (z3) {
                        objRememberedValue3 = new O(5, aVar3);
                        composer3.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new O(5, aVar3);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    TextKt.m2432Text4IGK_g("SET DEFAULT", PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE7, false, null, null, (a) objRememberedValue3, 7, null), Dp.m6403constructorimpl(i7), Dp.m6403constructorimpl(f10)), jM3926copywmQWz5c$default5, sp2, (FontStyle) null, bold2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131024);
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            p035i0.a.t(currentCompositeKeyHash15, composerM3407constructorimpl15, currentCompositeKeyHash15, eVarG14);
            Updater.m3414setimpl(composerM3407constructorimpl15, modifierMaterializeModifier5, companion7.getSetModifier());
            Locale locale2 = Locale.ROOT;
            String upperCase4 = addressType.toUpperCase(locale2);
            o.e(upperCase4, "toUpperCase(...)");
            if (o.b(addressType, "Home")) {
                jColor = ColorKt.Color(4290807036L);
            } else if (o.b(addressType, "Work")) {
                jColor = ColorKt.Color(4284524026L);
            } else {
                jColor = ColorKt.Color(4294688548L);
            }
            composer3 = composer2;
            TextKt.m2432Text4IGK_g(upperCase4, (Modifier) null, jColor, TextUnitKt.getSp(8), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 199680, 0, 131026);
            composer3.endNode();
            composer3.endNode();
            composer3.startReplaceGroup(-1569836840);
            if (z9) {
                Modifier modifierM669paddingVpY3zN8 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion5, RoundedCornerShapeKt.RoundedCornerShape(50)), p107y3.a.e(), null, 2, null), Dp.m6403constructorimpl(f16), Dp.m6403constructorimpl(3));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap20 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier20 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN8);
                constructor9 = companion7.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor9);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                eVarG8 = p035i0.a.g(companion7, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl9, currentCompositionLocalMap20);
                if (composerM3407constructorimpl9.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG8);
                } else {
                    p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG8);
                }
                MeasurePolicy measurePolicyI5 = androidx.compose.foundation.text.modifiers.a.i(4, arrangement3, b.c(companion7, composerM3407constructorimpl9, modifierMaterializeModifier20, companion6), composer3, 54);
                currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap21 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier21 = ComposedModifierKt.materializeModifier(composer3, companion5);
                constructor10 = companion7.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor10);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                eVarG9 = p035i0.a.g(companion7, composerM3407constructorimpl10, measurePolicyI5, composerM3407constructorimpl10, currentCompositionLocalMap21);
                if (composerM3407constructorimpl10.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG9);
                } else {
                    p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG9);
                }
                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier21, companion7.getSetModifier());
                arrangement = arrangement3;
                companion = companion7;
                IconKt.m1877Iconww6aTOc(StarKt.getStar(Icons.Filled.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(10)), companion8.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                companion2 = companion5;
                TextKt.m2432Text4IGK_g("DEFAULT", (Modifier) null, companion8.m3964getWhite0d7_KjU(), TextUnitKt.getSp(8), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                composer3.endNode();
                composer3.endNode();
            } else {
                companion = companion7;
                arrangement = arrangement3;
                companion2 = companion5;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            f8 = 4;
            Modifier.Companion companion11 = companion2;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11, Dp.m6403constructorimpl(f8)), composer3, 6);
            arrangement2 = arrangement;
            MeasurePolicy measurePolicyI6 = androidx.compose.foundation.text.modifiers.a.i(f17, arrangement2, companion6.getCenterVertically(), composer3, 54);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composer3, companion11);
            constructor = companion.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composer3);
            companion3 = companion;
            e eVarG16 = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyI6, composerM3407constructorimpl, currentCompositionLocalMap22);
            if (composerM3407constructorimpl.getInserting()) {
                f9 = f17;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier22, companion3.getSetModifier());
                outlined = Icons.Outlined.INSTANCE;
                f10 = f9;
                IconKt.m1877Iconww6aTOc(CheckCircleKt.getCheckCircle(outlined), (String) null, SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(14)), Color.m3926copywmQWz5c$default(ColorKt.Color(4281652121L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                phone = vVar.getPhone();
                if (phone == null) {
                    phone = "";
                }
                TextKt.m2432Text4IGK_g(phone, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, companion9.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                composer3.endNode();
                f11 = 12;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11, Dp.m6403constructorimpl(f11)), composer3, 6);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f18)), companion6.getStart(), composer3, 6);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composer3, companion11);
                constructor2 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                eVarG = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap113);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier113, companion3.getSetModifier());
                flatHouse = vVar.getFlatHouse();
                if (flatHouse == null) {
                    str = "";
                } else {
                    str = flatHouse;
                }
                TextKt.m2432Text4IGK_g(str, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                areaStreet = vVar.getAreaStreet();
                if (areaStreet == null) {
                    areaStreet = "";
                }
                TextKt.m2432Text4IGK_g(areaStreet, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                composer3.startReplaceGroup(-1569753830);
                landmark = vVar.getLandmark();
                if (landmark != null) {
                    TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.y("Landmark: ", vVar.getLandmark()), (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
                }
                composer3.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11, Dp.m6403constructorimpl(f10)), composer3, 6);
                city = vVar.getCity();
                if (city == null) {
                    city = "";
                }
                state = vVar.getState();
                if (state == null) {
                    state = "";
                }
                pincode = vVar.getPincode();
                if (pincode == null) {
                    pincode = "";
                }
                String upperCase5 = (city + ", " + state + " " + pincode).toUpperCase(locale2);
                o.e(upperCase5, "toUpperCase(...)");
                TextKt.m2432Text4IGK_g(upperCase5, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, companion9.getBlack(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                composer3.endNode();
                f12 = (float) 16;
                companion4 = companion11;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), composer3, 6);
                DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 384, 3);
                b.m(f11, companion4, composer3, 6);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion6.getCenterVertically(), composer3, 54);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap114 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default4);
                constructor3 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl3, currentCompositionLocalMap114);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier114, companion3.getSetModifier());
                if (z8) {
                    composer3.startReplaceGroup(-1416516806);
                    Modifier modifierM669paddingVpY3zN9 = PaddingKt.m669paddingVpY3zN4(b.e(f16, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion4, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16))), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f16), Dp.m6403constructorimpl(f8));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN9);
                    constructor7 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                    eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl7, currentCompositionLocalMap115);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    }
                    MeasurePolicy measurePolicyI7 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement2, b.c(companion3, composerM3407constructorimpl7, modifierMaterializeModifier115, companion6), composer3, 54);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap116 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composer3, companion4);
                    constructor8 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                    eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyI7, composerM3407constructorimpl8, currentCompositionLocalMap116);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier116, companion3.getSetModifier());
                    IconKt.m1877Iconww6aTOc(ShieldKt.getShield(outlined), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f11)), ColorKt.Color(4281652121L), composer3, 3504, 0);
                    z3 = true;
                    TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, ColorKt.Color(4281652121L), TextUnitKt.getSp(9), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                    composer3.endNode();
                    composer3.endNode();
                    composer3.endReplaceGroup();
                    f13 = f16;
                    companion4 = companion4;
                    i8 = i9;
                    z6 = false;
                    i7 = 10;
                } else {
                    z3 = true;
                    composer3.startReplaceGroup(-1415599919);
                    MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f16)), companion6.getCenterVertically(), composer3, 54);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap117 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composer3, companion4);
                    constructor4 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                    eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl4, currentCompositionLocalMap117);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier117, companion3.getSetModifier());
                    float f111 = 36;
                    float f24 = 10;
                    Modifier modifierE8 = b.e(f24, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f111)), f24), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer3.startReplaceGroup(744214624);
                    if ((i9 & 112) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objRememberedValue = composer3.rememberedValue();
                    if (z4) {
                        objRememberedValue = new O(3, aVar);
                        composer3.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new O(3, aVar);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default5 = ClickableKt.m242clickableXHw0xAI$default(modifierE8, false, null, null, (a) objRememberedValue, 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap118 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composer3, modifierM242clickableXHw0xAI$default5);
                    constructor5 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                    eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl5, currentCompositionLocalMap118);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier118, companion3.getSetModifier());
                    i7 = 10;
                    f13 = f16;
                    i8 = i9;
                    IconKt.m1877Iconww6aTOc(EditKt.getEdit(outlined), "Edit", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                    composer3.endNode();
                    Modifier modifierE9 = b.e(f24, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f111)), f24), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer3.startReplaceGroup(744243330);
                    if ((i8 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objRememberedValue2 = composer3.rememberedValue();
                    if (z5) {
                        objRememberedValue2 = new O(4, aVar2);
                        composer3.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new O(4, aVar2);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default6 = ClickableKt.m242clickableXHw0xAI$default(modifierE9, false, null, null, (a) objRememberedValue2, 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy13 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap119 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composer3, modifierM242clickableXHw0xAI$default6);
                    constructor6 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                    eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy13, composerM3407constructorimpl6, currentCompositionLocalMap119);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier119, companion3.getSetModifier());
                    z6 = false;
                    IconKt.m1877Iconww6aTOc(DeleteKt.getDelete(outlined), "Delete", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                    composer3.endNode();
                    composer3.endNode();
                    composer3.endReplaceGroup();
                }
                composer3.startReplaceGroup(-1569621594);
                if (!z9) {
                    long jM3926copywmQWz5c$default6 = Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    FontWeight bold3 = companion9.getBold();
                    long sp3 = TextUnitKt.getSp(i7);
                    float f25 = f13;
                    Modifier modifierE10 = b.e(f25, b.d(f25, companion4), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer3.startReplaceGroup(-1569606425);
                    if ((i8 & 7168) != 2048) {
                        z3 = z6;
                    }
                    objRememberedValue3 = composer3.rememberedValue();
                    if (z3) {
                        objRememberedValue3 = new O(5, aVar3);
                        composer3.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new O(5, aVar3);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    TextKt.m2432Text4IGK_g("SET DEFAULT", PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE10, false, null, null, (a) objRememberedValue3, 7, null), Dp.m6403constructorimpl(i7), Dp.m6403constructorimpl(f10)), jM3926copywmQWz5c$default6, sp3, (FontStyle) null, bold3, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131024);
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                f9 = f17;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG16);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier22, companion3.getSetModifier());
            outlined = Icons.Outlined.INSTANCE;
            f10 = f9;
            IconKt.m1877Iconww6aTOc(CheckCircleKt.getCheckCircle(outlined), (String) null, SizeKt.m713size3ABfNKs(companion11, Dp.m6403constructorimpl(14)), Color.m3926copywmQWz5c$default(ColorKt.Color(4281652121L), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
            phone = vVar.getPhone();
            if (phone == null) {
                phone = "";
            }
            TextKt.m2432Text4IGK_g(phone, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, companion9.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
            composer3.endNode();
            f11 = 12;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11, Dp.m6403constructorimpl(f11)), composer3, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f18)), companion6.getStart(), composer3, 6);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composer3, companion11);
            constructor2 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
            eVarG = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap1110);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier1110, companion3.getSetModifier());
            flatHouse = vVar.getFlatHouse();
            if (flatHouse == null) {
                str = "";
            } else {
                str = flatHouse;
            }
            TextKt.m2432Text4IGK_g(str, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
            areaStreet = vVar.getAreaStreet();
            if (areaStreet == null) {
                areaStreet = "";
            }
            TextKt.m2432Text4IGK_g(areaStreet, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
            composer3.startReplaceGroup(-1569753830);
            landmark = vVar.getLandmark();
            if (landmark != null) {
                TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.y("Landmark: ", vVar.getLandmark()), (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(13), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200064, 0, 131026);
            }
            composer3.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11, Dp.m6403constructorimpl(f10)), composer3, 6);
            city = vVar.getCity();
            if (city == null) {
                city = "";
            }
            state = vVar.getState();
            if (state == null) {
                state = "";
            }
            pincode = vVar.getPincode();
            if (pincode == null) {
                pincode = "";
            }
            String upperCase6 = (city + ", " + state + " " + pincode).toUpperCase(locale2);
            o.e(upperCase6, "toUpperCase(...)");
            TextKt.m2432Text4IGK_g(upperCase6, (Modifier) null, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, companion9.getBlack(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
            composer3.endNode();
            f12 = (float) 16;
            companion4 = companion11;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), composer3, 6);
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 384, 3);
            b.m(f11, companion4, composer3, 6);
            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion6.getCenterVertically(), composer3, 54);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default5);
            constructor3 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
            eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl3, currentCompositionLocalMap1111);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1111, companion3.getSetModifier());
            if (z8) {
                composer3.startReplaceGroup(-1416516806);
                Modifier modifierM669paddingVpY3zN10 = PaddingKt.m669paddingVpY3zN4(b.e(f16, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion4, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16))), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f16), Dp.m6403constructorimpl(f8));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy14 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap1112 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1112 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN10);
                constructor7 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor7);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                eVarG6 = p035i0.a.g(companion3, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy14, composerM3407constructorimpl7, currentCompositionLocalMap1112);
                if (composerM3407constructorimpl7.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                } else {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                }
                MeasurePolicy measurePolicyI8 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement2, b.c(companion3, composerM3407constructorimpl7, modifierMaterializeModifier1112, companion6), composer3, 54);
                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap1113 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1113 = ComposedModifierKt.materializeModifier(composer3, companion4);
                constructor8 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor8);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                eVarG7 = p035i0.a.g(companion3, composerM3407constructorimpl8, measurePolicyI8, composerM3407constructorimpl8, currentCompositionLocalMap1113);
                if (composerM3407constructorimpl8.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                } else {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                }
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier1113, companion3.getSetModifier());
                IconKt.m1877Iconww6aTOc(ShieldKt.getShield(outlined), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f11)), ColorKt.Color(4281652121L), composer3, 3504, 0);
                z3 = true;
                TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, ColorKt.Color(4281652121L), TextUnitKt.getSp(9), (FontStyle) null, companion9.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                composer3.endNode();
                composer3.endNode();
                composer3.endReplaceGroup();
                f13 = f16;
                companion4 = companion4;
                i8 = i9;
                z6 = false;
                i7 = 10;
            } else {
                z3 = true;
                composer3.startReplaceGroup(-1415599919);
                MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f16)), companion6.getCenterVertically(), composer3, 54);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap1114 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1114 = ComposedModifierKt.materializeModifier(composer3, companion4);
                constructor4 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy10, composerM3407constructorimpl4, currentCompositionLocalMap1114);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1114, companion3.getSetModifier());
                float f112 = 36;
                float f26 = 10;
                Modifier modifierE11 = b.e(f26, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f112)), f26), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null));
                composer3.startReplaceGroup(744214624);
                if ((i9 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objRememberedValue = composer3.rememberedValue();
                if (z4) {
                    objRememberedValue = new O(3, aVar);
                    composer3.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new O(3, aVar);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default7 = ClickableKt.m242clickableXHw0xAI$default(modifierE11, false, null, null, (a) objRememberedValue, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy15 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap1115 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1115 = ComposedModifierKt.materializeModifier(composer3, modifierM242clickableXHw0xAI$default7);
                constructor5 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor5);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy15, composerM3407constructorimpl5, currentCompositionLocalMap1115);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1115, companion3.getSetModifier());
                i7 = 10;
                f13 = f16;
                i8 = i9;
                IconKt.m1877Iconww6aTOc(EditKt.getEdit(outlined), "Edit", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                composer3.endNode();
                Modifier modifierE12 = b.e(f26, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f112)), f26), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null));
                composer3.startReplaceGroup(744243330);
                if ((i8 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objRememberedValue2 = composer3.rememberedValue();
                if (z5) {
                    objRememberedValue2 = new O(4, aVar2);
                    composer3.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new O(4, aVar2);
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default8 = ClickableKt.m242clickableXHw0xAI$default(modifierE12, false, null, null, (a) objRememberedValue2, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy16 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap1116 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier1116 = ComposedModifierKt.materializeModifier(composer3, modifierM242clickableXHw0xAI$default8);
                constructor6 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor6);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                eVarG5 = p035i0.a.g(companion3, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy16, composerM3407constructorimpl6, currentCompositionLocalMap1116);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1116, companion3.getSetModifier());
                z6 = false;
                IconKt.m1877Iconww6aTOc(DeleteKt.getDelete(outlined), "Delete", SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f12)), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                composer3.endNode();
                composer3.endNode();
                composer3.endReplaceGroup();
            }
            composer3.startReplaceGroup(-1569621594);
            if (!z9) {
                long jM3926copywmQWz5c$default7 = Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                FontWeight bold4 = companion9.getBold();
                long sp4 = TextUnitKt.getSp(i7);
                float f27 = f13;
                Modifier modifierE13 = b.e(f27, b.d(f27, companion4), Dp.m6403constructorimpl(f15), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                composer3.startReplaceGroup(-1569606425);
                if ((i8 & 7168) != 2048) {
                    z3 = z6;
                }
                objRememberedValue3 = composer3.rememberedValue();
                if (z3) {
                    objRememberedValue3 = new O(5, aVar3);
                    composer3.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new O(5, aVar3);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceGroup();
                TextKt.m2432Text4IGK_g("SET DEFAULT", PaddingKt.m669paddingVpY3zN4(ClickableKt.m242clickableXHw0xAI$default(modifierE13, false, null, null, (a) objRememberedValue3, 7, null), Dp.m6403constructorimpl(i7), Dp.m6403constructorimpl(f10)), jM3926copywmQWz5c$default7, sp4, (FontStyle) null, bold4, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131024);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            composer3.endNode();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2294k(vVar, aVar, aVar2, aVar3, i5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x034c  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:88:0x0122  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:92:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x0145  */
    /* JADX WARN: Code duplicated, block: B:97:0x0340  */
    public static final void b(final String str, final String str2, final c cVar, final String str3, boolean z3, KeyboardOptions keyboardOptions, Modifier modifier, Composer composer, final int i5, final int i6) {
        int i7;
        boolean z4;
        int i8;
        KeyboardOptions keyboardOptions2;
        int i9;
        int i10;
        Modifier modifier2;
        int i11;
        boolean z5;
        KeyboardOptions keyboardOptions3;
        Modifier modifier3;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        final boolean z6;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1904349849);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(cVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(str3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i12 = i6 & 16;
        if (i12 == 0) {
            if ((i5 & 24576) == 0) {
                z4 = z3;
                i7 |= composerStartRestartGroup.changed(z4) ? Fields.Clip : Fields.Shape;
            }
            i8 = i6 & 32;
            if (i8 != 0) {
                if ((196608 & i5) == 0) {
                    keyboardOptions2 = keyboardOptions;
                    if (composerStartRestartGroup.changed(keyboardOptions2)) {
                        i9 = Fields.RenderEffect;
                    } else {
                        i9 = 65536;
                    }
                    i7 |= i9;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    if ((1572864 & i5) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i7 |= i11;
                    }
                    if ((599187 & i7) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i12 != 0) {
                            z5 = true;
                        } else {
                            z5 = z4;
                        }
                        if (i8 != 0) {
                            keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                        } else {
                            keyboardOptions3 = keyboardOptions2;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.Companion;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        constructor = companion.getConstructor();
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
                        eVarG = p035i0.a.g(companion, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                        if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        o.e(upperCase, "toUpperCase(...)");
                        TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                        FontWeight bold = FontWeight.Companion.getBold();
                        long sp = TextUnitKt.getSp(1.5d);
                        Color.Companion companion2 = Color.Companion;
                        Modifier modifier5 = modifier3;
                        TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : bold, (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : sp, (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                        TextFieldColors textFieldColorsM2076colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion2.m3964getWhite0d7_KjU(), companion2.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion2.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion2.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion2.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion2.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                        int i13 = i7 >> 3;
                        OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_0, composerStartRestartGroup, (i13 & 14) | 12583296 | (i13 & 112) | (i13 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z5;
                        keyboardOptions2 = keyboardOptions3;
                        modifier4 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z6 = z4;
                        modifier4 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final KeyboardOptions keyboardOptions4 = keyboardOptions2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ya
                            @Override // O3.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                                String str4 = str;
                                Modifier modifier6 = modifier4;
                                AbstractC2595nb.b(str4, str2, cVar, str3, z6, keyboardOptions4, modifier6, (Composer) obj, iUpdateChangedFlags, i6);
                                return B3.o.f154a;
                            }
                        });
                    }
                }
                i7 |= 1572864;
                modifier2 = modifier;
                if ((599187 & i7) == 599186) {
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (i8 != 0) {
                        keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions2;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
                    eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap2);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    String upperCase2 = str.toUpperCase(Locale.ROOT);
                    o.e(upperCase2, "toUpperCase(...)");
                    TextStyle labelSmall2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                    FontWeight bold2 = FontWeight.Companion.getBold();
                    long sp2 = TextUnitKt.getSp(1.5d);
                    Color.Companion companion4 = Color.Companion;
                    Modifier modifier6 = modifier3;
                    TextKt.m2432Text4IGK_g(upperCase2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : bold2, (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : sp2, (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                    TextFieldColors textFieldColorsM2076colors0hiis_1 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion4.m3964getWhite0d7_KjU(), companion4.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion4.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion4.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion4.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                    int i14 = i7 >> 3;
                    OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_1, composerStartRestartGroup, (i14 & 14) | 12583296 | (i14 & 112) | (i14 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z5;
                    keyboardOptions2 = keyboardOptions3;
                    modifier4 = modifier6;
                } else {
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (i8 != 0) {
                        keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions2;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                    }
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
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
                    eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier3, companion5.getSetModifier());
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    String upperCase3 = str.toUpperCase(Locale.ROOT);
                    o.e(upperCase3, "toUpperCase(...)");
                    TextStyle labelSmall3 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                    FontWeight bold3 = FontWeight.Companion.getBold();
                    long sp3 = TextUnitKt.getSp(1.5d);
                    Color.Companion companion6 = Color.Companion;
                    Modifier modifier7 = modifier3;
                    TextKt.m2432Text4IGK_g(upperCase3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : bold3, (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : sp3, (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                    TextFieldColors textFieldColorsM2076colors0hiis_2 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion6.m3964getWhite0d7_KjU(), companion6.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion6.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion6.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion6.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                    int i15 = i7 >> 3;
                    OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_2, composerStartRestartGroup, (i15 & 14) | 12583296 | (i15 & 112) | (i15 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z5;
                    keyboardOptions2 = keyboardOptions3;
                    modifier4 = modifier7;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ya
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            String str4 = str;
                            Modifier modifier8 = modifier4;
                            AbstractC2595nb.b(str4, str2, cVar, str3, z6, keyboardOptions5, modifier8, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 196608;
            keyboardOptions2 = keyboardOptions;
            i10 = i6 & 64;
            if (i10 != 0) {
                if ((1572864 & i5) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i7 |= i11;
                }
                if ((599187 & i7) == 599186) {
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (i8 != 0) {
                        keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions2;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                    }
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
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
                    eVarG = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion7.getSetModifier());
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    String upperCase4 = str.toUpperCase(Locale.ROOT);
                    o.e(upperCase4, "toUpperCase(...)");
                    TextStyle labelSmall4 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                    FontWeight bold4 = FontWeight.Companion.getBold();
                    long sp4 = TextUnitKt.getSp(1.5d);
                    Color.Companion companion8 = Color.Companion;
                    Modifier modifier8 = modifier3;
                    TextKt.m2432Text4IGK_g(upperCase4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall4.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall4.spanStyle.getFontWeight() : bold4, (16645977 & 8) != 0 ? labelSmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : sp4, (16645977 & Fields.RotationX) != 0 ? labelSmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall4.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall4.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                    TextFieldColors textFieldColorsM2076colors0hiis_3 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion8.m3964getWhite0d7_KjU(), companion8.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion8.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion8.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion8.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                    int i16 = i7 >> 3;
                    OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_3, composerStartRestartGroup, (i16 & 14) | 12583296 | (i16 & 112) | (i16 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z5;
                    keyboardOptions2 = keyboardOptions3;
                    modifier4 = modifier8;
                } else {
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (i8 != 0) {
                        keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions2;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                    }
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default5);
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
                    eVarG = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion9.getSetModifier());
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    String upperCase5 = str.toUpperCase(Locale.ROOT);
                    o.e(upperCase5, "toUpperCase(...)");
                    TextStyle labelSmall5 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                    FontWeight bold5 = FontWeight.Companion.getBold();
                    long sp5 = TextUnitKt.getSp(1.5d);
                    Color.Companion companion10 = Color.Companion;
                    Modifier modifier9 = modifier3;
                    TextKt.m2432Text4IGK_g(upperCase5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall5.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion10.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall5.spanStyle.getFontWeight() : bold5, (16645977 & 8) != 0 ? labelSmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : sp5, (16645977 & Fields.RotationX) != 0 ? labelSmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall5.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall5.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                    TextFieldColors textFieldColorsM2076colors0hiis_4 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion10.m3964getWhite0d7_KjU(), companion10.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion10.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion10.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion10.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion10.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion10.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion10.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                    int i17 = i7 >> 3;
                    OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_4, composerStartRestartGroup, (i17 & 14) | 12583296 | (i17 & 112) | (i17 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z5;
                    keyboardOptions2 = keyboardOptions3;
                    modifier4 = modifier9;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final KeyboardOptions keyboardOptions6 = keyboardOptions2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ya
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            String str4 = str;
                            Modifier modifier10 = modifier4;
                            AbstractC2595nb.b(str4, str2, cVar, str3, z6, keyboardOptions6, modifier10, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i7) == 599186) {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (i8 != 0) {
                    keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                }
                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default6);
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
                eVarG = p035i0.a.g(companion11, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl, currentCompositionLocalMap6);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier6, companion11.getSetModifier());
                ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                String upperCase6 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase6, "toUpperCase(...)");
                TextStyle labelSmall6 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                FontWeight bold6 = FontWeight.Companion.getBold();
                long sp6 = TextUnitKt.getSp(1.5d);
                Color.Companion companion12 = Color.Companion;
                Modifier modifier10 = modifier3;
                TextKt.m2432Text4IGK_g(upperCase6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall6.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall6.spanStyle.getFontWeight() : bold6, (16645977 & 8) != 0 ? labelSmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : sp6, (16645977 & Fields.RotationX) != 0 ? labelSmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall6.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall6.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                TextFieldColors textFieldColorsM2076colors0hiis_5 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion12.m3964getWhite0d7_KjU(), companion12.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion12.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion12.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion12.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                int i18 = i7 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_5, composerStartRestartGroup, (i18 & 14) | 12583296 | (i18 & 112) | (i18 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z5;
                keyboardOptions2 = keyboardOptions3;
                modifier4 = modifier10;
            } else {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (i8 != 0) {
                    keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                }
                Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default7);
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
                eVarG = p035i0.a.g(companion13, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl, currentCompositionLocalMap7);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion13.getSetModifier());
                ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                String upperCase7 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase7, "toUpperCase(...)");
                TextStyle labelSmall7 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                FontWeight bold7 = FontWeight.Companion.getBold();
                long sp7 = TextUnitKt.getSp(1.5d);
                Color.Companion companion14 = Color.Companion;
                Modifier modifier11 = modifier3;
                TextKt.m2432Text4IGK_g(upperCase7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall7.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall7.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall7.spanStyle.getFontWeight() : bold7, (16645977 & 8) != 0 ? labelSmall7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall7.spanStyle.m5845getLetterSpacingXSAIIZE() : sp7, (16645977 & Fields.RotationX) != 0 ? labelSmall7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall7.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall7.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                TextFieldColors textFieldColorsM2076colors0hiis_6 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion14.m3964getWhite0d7_KjU(), companion14.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion14.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion14.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion14.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion14.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                int i19 = i7 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_6, composerStartRestartGroup, (i19 & 14) | 12583296 | (i19 & 112) | (i19 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z5;
                keyboardOptions2 = keyboardOptions3;
                modifier4 = modifier11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final KeyboardOptions keyboardOptions7 = keyboardOptions2;
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ya
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        String str4 = str;
                        Modifier modifier12 = modifier4;
                        AbstractC2595nb.b(str4, str2, cVar, str3, z6, keyboardOptions7, modifier12, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 24576;
        z4 = z3;
        i8 = i6 & 32;
        if (i8 != 0) {
            if ((196608 & i5) == 0) {
                keyboardOptions2 = keyboardOptions;
                if (composerStartRestartGroup.changed(keyboardOptions2)) {
                    i9 = Fields.RenderEffect;
                } else {
                    i9 = 65536;
                }
                i7 |= i9;
            }
            i10 = i6 & 64;
            if (i10 != 0) {
                if ((1572864 & i5) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i7 |= i11;
                }
                if ((599187 & i7) == 599186) {
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (i8 != 0) {
                        keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions2;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                    }
                    Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default8);
                    ComposeUiNode.Companion companion15 = ComposeUiNode.Companion;
                    constructor = companion15.getConstructor();
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
                    eVarG = p035i0.a.g(companion15, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl, currentCompositionLocalMap8);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion15.getSetModifier());
                    ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                    String upperCase8 = str.toUpperCase(Locale.ROOT);
                    o.e(upperCase8, "toUpperCase(...)");
                    TextStyle labelSmall8 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                    FontWeight bold8 = FontWeight.Companion.getBold();
                    long sp8 = TextUnitKt.getSp(1.5d);
                    Color.Companion companion16 = Color.Companion;
                    Modifier modifier12 = modifier3;
                    TextKt.m2432Text4IGK_g(upperCase8, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall8.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall8.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion16.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall8.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall8.spanStyle.getFontWeight() : bold8, (16645977 & 8) != 0 ? labelSmall8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall8.spanStyle.m5845getLetterSpacingXSAIIZE() : sp8, (16645977 & Fields.RotationX) != 0 ? labelSmall8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall8.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall8.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                    TextFieldColors textFieldColorsM2076colors0hiis_7 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion16.m3964getWhite0d7_KjU(), companion16.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion16.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion16.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion16.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion16.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion16.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion16.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                    int i110 = i7 >> 3;
                    OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_7, composerStartRestartGroup, (i110 & 14) | 12583296 | (i110 & 112) | (i110 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z5;
                    keyboardOptions2 = keyboardOptions3;
                    modifier4 = modifier12;
                } else {
                    if (i12 != 0) {
                        z5 = true;
                    } else {
                        z5 = z4;
                    }
                    if (i8 != 0) {
                        keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions2;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                    }
                    Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default9);
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
                    eVarG = p035i0.a.g(companion17, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl, currentCompositionLocalMap9);
                    if (composerM3407constructorimpl.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier9, companion17.getSetModifier());
                    ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                    String upperCase9 = str.toUpperCase(Locale.ROOT);
                    o.e(upperCase9, "toUpperCase(...)");
                    TextStyle labelSmall9 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                    FontWeight bold9 = FontWeight.Companion.getBold();
                    long sp9 = TextUnitKt.getSp(1.5d);
                    Color.Companion companion18 = Color.Companion;
                    Modifier modifier13 = modifier3;
                    TextKt.m2432Text4IGK_g(upperCase9, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall9.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall9.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall9.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall9.spanStyle.getFontWeight() : bold9, (16645977 & 8) != 0 ? labelSmall9.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall9.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall9.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall9.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall9.spanStyle.m5845getLetterSpacingXSAIIZE() : sp9, (16645977 & Fields.RotationX) != 0 ? labelSmall9.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall9.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall9.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall9.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall9.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall9.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall9.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall9.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall9.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall9.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall9.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall9.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall9.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall9.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall9.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall9.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                    TextFieldColors textFieldColorsM2076colors0hiis_8 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion18.m3964getWhite0d7_KjU(), companion18.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion18.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion18.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion18.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                    int i111 = i7 >> 3;
                    OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_8, composerStartRestartGroup, (i111 & 14) | 12583296 | (i111 & 112) | (i111 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z5;
                    keyboardOptions2 = keyboardOptions3;
                    modifier4 = modifier13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final KeyboardOptions keyboardOptions8 = keyboardOptions2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ya
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            String str4 = str;
                            Modifier modifier14 = modifier4;
                            AbstractC2595nb.b(str4, str2, cVar, str3, z6, keyboardOptions8, modifier14, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i7) == 599186) {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (i8 != 0) {
                    keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                }
                Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default10);
                ComposeUiNode.Companion companion19 = ComposeUiNode.Companion;
                constructor = companion19.getConstructor();
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
                eVarG = p035i0.a.g(companion19, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy10, composerM3407constructorimpl, currentCompositionLocalMap10);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier10, companion19.getSetModifier());
                ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                String upperCase10 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase10, "toUpperCase(...)");
                TextStyle labelSmall10 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                FontWeight bold10 = FontWeight.Companion.getBold();
                long sp10 = TextUnitKt.getSp(1.5d);
                Color.Companion companion110 = Color.Companion;
                Modifier modifier14 = modifier3;
                TextKt.m2432Text4IGK_g(upperCase10, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall10.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall10.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion110.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall10.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall10.spanStyle.getFontWeight() : bold10, (16645977 & 8) != 0 ? labelSmall10.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall10.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall10.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall10.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall10.spanStyle.m5845getLetterSpacingXSAIIZE() : sp10, (16645977 & Fields.RotationX) != 0 ? labelSmall10.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall10.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall10.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall10.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall10.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall10.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall10.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall10.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall10.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall10.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall10.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall10.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall10.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall10.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall10.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall10.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                TextFieldColors textFieldColorsM2076colors0hiis_9 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion110.m3964getWhite0d7_KjU(), companion110.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion110.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion110.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion110.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion110.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion110.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion110.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                int i112 = i7 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_9, composerStartRestartGroup, (i112 & 14) | 12583296 | (i112 & 112) | (i112 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z5;
                keyboardOptions2 = keyboardOptions3;
                modifier4 = modifier14;
            } else {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (i8 != 0) {
                    keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                }
                Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default11);
                ComposeUiNode.Companion companion111 = ComposeUiNode.Companion;
                constructor = companion111.getConstructor();
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
                eVarG = p035i0.a.g(companion111, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy11, composerM3407constructorimpl, currentCompositionLocalMap11);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier11, companion111.getSetModifier());
                ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                String upperCase11 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase11, "toUpperCase(...)");
                TextStyle labelSmall11 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                FontWeight bold11 = FontWeight.Companion.getBold();
                long sp11 = TextUnitKt.getSp(1.5d);
                Color.Companion companion112 = Color.Companion;
                Modifier modifier15 = modifier3;
                TextKt.m2432Text4IGK_g(upperCase11, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall11.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall11.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion112.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall11.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall11.spanStyle.getFontWeight() : bold11, (16645977 & 8) != 0 ? labelSmall11.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall11.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall11.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall11.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall11.spanStyle.m5845getLetterSpacingXSAIIZE() : sp11, (16645977 & Fields.RotationX) != 0 ? labelSmall11.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall11.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall11.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall11.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall11.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall11.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall11.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall11.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall11.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall11.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall11.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall11.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall11.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall11.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall11.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall11.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                TextFieldColors textFieldColorsM2076colors0hiis_10 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion112.m3964getWhite0d7_KjU(), companion112.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion112.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion112.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion112.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion112.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion112.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion112.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                int i113 = i7 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_10, composerStartRestartGroup, (i113 & 14) | 12583296 | (i113 & 112) | (i113 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z5;
                keyboardOptions2 = keyboardOptions3;
                modifier4 = modifier15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final KeyboardOptions keyboardOptions9 = keyboardOptions2;
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ya
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        String str4 = str;
                        Modifier modifier16 = modifier4;
                        AbstractC2595nb.b(str4, str2, cVar, str3, z6, keyboardOptions9, modifier16, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 196608;
        keyboardOptions2 = keyboardOptions;
        i10 = i6 & 64;
        if (i10 != 0) {
            if ((1572864 & i5) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i7 |= i11;
            }
            if ((599187 & i7) == 599186) {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (i8 != 0) {
                    keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                }
                Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default12);
                ComposeUiNode.Companion companion113 = ComposeUiNode.Companion;
                constructor = companion113.getConstructor();
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
                eVarG = p035i0.a.g(companion113, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy12, composerM3407constructorimpl, currentCompositionLocalMap12);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier12, companion113.getSetModifier());
                ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                String upperCase12 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase12, "toUpperCase(...)");
                TextStyle labelSmall12 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                FontWeight bold12 = FontWeight.Companion.getBold();
                long sp12 = TextUnitKt.getSp(1.5d);
                Color.Companion companion114 = Color.Companion;
                Modifier modifier16 = modifier3;
                TextKt.m2432Text4IGK_g(upperCase12, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall12.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall12.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion114.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall12.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall12.spanStyle.getFontWeight() : bold12, (16645977 & 8) != 0 ? labelSmall12.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall12.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall12.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall12.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall12.spanStyle.m5845getLetterSpacingXSAIIZE() : sp12, (16645977 & Fields.RotationX) != 0 ? labelSmall12.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall12.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall12.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall12.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall12.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall12.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall12.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall12.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall12.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall12.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall12.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall12.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall12.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall12.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall12.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall12.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                TextFieldColors textFieldColorsM2076colors0hiis_11 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion114.m3964getWhite0d7_KjU(), companion114.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion114.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion114.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion114.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion114.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion114.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion114.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                int i114 = i7 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_11, composerStartRestartGroup, (i114 & 14) | 12583296 | (i114 & 112) | (i114 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z5;
                keyboardOptions2 = keyboardOptions3;
                modifier4 = modifier16;
            } else {
                if (i12 != 0) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (i8 != 0) {
                    keyboardOptions3 = KeyboardOptions.Companion.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
                }
                Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default13);
                ComposeUiNode.Companion companion115 = ComposeUiNode.Companion;
                constructor = companion115.getConstructor();
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
                eVarG = p035i0.a.g(companion115, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy13, composerM3407constructorimpl, currentCompositionLocalMap13);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier13, companion115.getSetModifier());
                ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                String upperCase13 = str.toUpperCase(Locale.ROOT);
                o.e(upperCase13, "toUpperCase(...)");
                TextStyle labelSmall13 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
                FontWeight bold13 = FontWeight.Companion.getBold();
                long sp13 = TextUnitKt.getSp(1.5d);
                Color.Companion companion116 = Color.Companion;
                Modifier modifier17 = modifier3;
                TextKt.m2432Text4IGK_g(upperCase13, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall13.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall13.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion116.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall13.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall13.spanStyle.getFontWeight() : bold13, (16645977 & 8) != 0 ? labelSmall13.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall13.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall13.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall13.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall13.spanStyle.m5845getLetterSpacingXSAIIZE() : sp13, (16645977 & Fields.RotationX) != 0 ? labelSmall13.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall13.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall13.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall13.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall13.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall13.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall13.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall13.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall13.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall13.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall13.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall13.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall13.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall13.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall13.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall13.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
                TextFieldColors textFieldColorsM2076colors0hiis_12 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion116.m3964getWhite0d7_KjU(), companion116.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion116.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion116.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion116.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion116.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion116.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion116.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
                int i115 = i7 >> 3;
                OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_12, composerStartRestartGroup, (i115 & 14) | 12583296 | (i115 & 112) | (i115 & 7168), (458752 & i7) | 12582912, 0, 1933168);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z5;
                keyboardOptions2 = keyboardOptions3;
                modifier4 = modifier17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final KeyboardOptions keyboardOptions10 = keyboardOptions2;
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ya
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        String str4 = str;
                        Modifier modifier18 = modifier4;
                        AbstractC2595nb.b(str4, str2, cVar, str3, z6, keyboardOptions10, modifier18, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i7) == 599186) {
            if (i12 != 0) {
                z5 = true;
            } else {
                z5 = z4;
            }
            if (i8 != 0) {
                keyboardOptions3 = KeyboardOptions.Companion.getDefault();
            } else {
                keyboardOptions3 = keyboardOptions2;
            }
            if (i10 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
            }
            Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default14);
            ComposeUiNode.Companion companion117 = ComposeUiNode.Companion;
            constructor = companion117.getConstructor();
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
            eVarG = p035i0.a.g(companion117, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy14, composerM3407constructorimpl, currentCompositionLocalMap14);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier14, companion117.getSetModifier());
            ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
            String upperCase14 = str.toUpperCase(Locale.ROOT);
            o.e(upperCase14, "toUpperCase(...)");
            TextStyle labelSmall14 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold14 = FontWeight.Companion.getBold();
            long sp14 = TextUnitKt.getSp(1.5d);
            Color.Companion companion118 = Color.Companion;
            Modifier modifier18 = modifier3;
            TextKt.m2432Text4IGK_g(upperCase14, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall14.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall14.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion118.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall14.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall14.spanStyle.getFontWeight() : bold14, (16645977 & 8) != 0 ? labelSmall14.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall14.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall14.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall14.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall14.spanStyle.m5845getLetterSpacingXSAIIZE() : sp14, (16645977 & Fields.RotationX) != 0 ? labelSmall14.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall14.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall14.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall14.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall14.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall14.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall14.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall14.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall14.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall14.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall14.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall14.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall14.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall14.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall14.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall14.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
            TextFieldColors textFieldColorsM2076colors0hiis_13 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion118.m3964getWhite0d7_KjU(), companion118.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion118.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion118.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion118.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion118.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion118.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion118.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
            int i116 = i7 >> 3;
            OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_13, composerStartRestartGroup, (i116 & 14) | 12583296 | (i116 & 112) | (i116 & 7168), (458752 & i7) | 12582912, 0, 1933168);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z5;
            keyboardOptions2 = keyboardOptions3;
            modifier4 = modifier18;
        } else {
            if (i12 != 0) {
                z5 = true;
            } else {
                z5 = z4;
            }
            if (i8 != 0) {
                keyboardOptions3 = KeyboardOptions.Companion.getDefault();
            } else {
                keyboardOptions3 = keyboardOptions2;
            }
            if (i10 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1904349849, i7, -1, "com.notescrafter.ui.screens.AddressField (PrintAddressesScreen.kt:1149)");
            }
            Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(6)), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default15);
            ComposeUiNode.Companion companion119 = ComposeUiNode.Companion;
            constructor = companion119.getConstructor();
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
            eVarG = p035i0.a.g(companion119, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy15, composerM3407constructorimpl, currentCompositionLocalMap15);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier15, companion119.getSetModifier());
            ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
            String upperCase15 = str.toUpperCase(Locale.ROOT);
            o.e(upperCase15, "toUpperCase(...)");
            TextStyle labelSmall15 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall();
            FontWeight bold15 = FontWeight.Companion.getBold();
            long sp15 = TextUnitKt.getSp(1.5d);
            Color.Companion companion1110 = Color.Companion;
            Modifier modifier19 = modifier3;
            TextKt.m2432Text4IGK_g(upperCase15, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall15.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall15.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion1110.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall15.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall15.spanStyle.getFontWeight() : bold15, (16645977 & 8) != 0 ? labelSmall15.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall15.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall15.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall15.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall15.spanStyle.m5845getLetterSpacingXSAIIZE() : sp15, (16645977 & Fields.RotationX) != 0 ? labelSmall15.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall15.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall15.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall15.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall15.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall15.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall15.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall15.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall15.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall15.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall15.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall15.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall15.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall15.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall15.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall15.paragraphStyle.getTextMotion() : null), composerStartRestartGroup, 0, 0, 65534);
            TextFieldColors textFieldColorsM2076colors0hiis_14 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion1110.m3964getWhite0d7_KjU(), companion1110.m3964getWhite0d7_KjU(), Color.m3926copywmQWz5c$default(companion1110.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.m3926copywmQWz5c$default(companion1110.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion1110.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion1110.m3953getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, null, Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion1110.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion1110.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1794486, 3504, 0, 0, 3072, 2147469192, 4095);
            int i117 = i7 >> 3;
            OutlinedTextFieldKt.OutlinedTextField(str2, cVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, false, (TextStyle) null, (e) null, (e) ComposableLambdaKt.rememberComposableLambda(-84362678, true, new C2403bb(str3), composerStartRestartGroup, 54), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, keyboardOptions3, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), textFieldColorsM2076colors0hiis_14, composerStartRestartGroup, (i117 & 14) | 12583296 | (i117 & 112) | (i117 & 7168), (458752 & i7) | 12582912, 0, 1933168);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z5;
            keyboardOptions2 = keyboardOptions3;
            modifier4 = modifier19;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final KeyboardOptions keyboardOptions11 = keyboardOptions2;
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.Ya
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    String str4 = str;
                    Modifier modifier110 = modifier4;
                    AbstractC2595nb.b(str4, str2, cVar, str3, z6, keyboardOptions11, modifier110, (Composer) obj, iUpdateChangedFlags, i6);
                    return B3.o.f154a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02da  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final v vVar, final PrintOrderViewModel printOrderViewModel, final String str, a aVar, final a aVar2, Composer composer, int i5) {
        int i6;
        boolean z3;
        Composer composer2;
        Composer composer3;
        String addressType;
        String state;
        String city;
        String pincode;
        String landmark;
        String areaStreet;
        String flatHouse;
        String lastName;
        String firstName;
        Composer composerStartRestartGroup = composer.startRestartGroup(1864742608);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(vVar) ? 4 : 2) | i5;
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
        if ((i5 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(aVar2) ? 16384 : Fields.Shape;
        }
        int i7 = i6;
        if ((i7 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1864742608, i7, -1, "com.notescrafter.ui.screens.AddressFormDialog (PrintAddressesScreen.kt:828)");
            }
            composerStartRestartGroup.startReplaceGroup(712571241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                if (vVar == null || (firstName = vVar.getFirstName()) == null) {
                    firstName = "";
                }
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(firstName, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objK = b.k(composerStartRestartGroup, 712573608);
            if (objK == companion.getEmpty()) {
                if (vVar == null || (lastName = vVar.getLastName()) == null) {
                    lastName = "";
                }
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lastName, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            final MutableState mutableState2 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, 712575977);
            if (objK2 == companion.getEmpty()) {
                if (vVar == null || (flatHouse = vVar.getFlatHouse()) == null) {
                    flatHouse = "";
                }
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(flatHouse, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState3 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, 712578410);
            if (objK3 == companion.getEmpty()) {
                if (vVar == null || (areaStreet = vVar.getAreaStreet()) == null) {
                    areaStreet = "";
                }
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(areaStreet, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            final MutableState mutableState4 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, 712580808);
            if (objK4 == companion.getEmpty()) {
                if (vVar == null || (landmark = vVar.getLandmark()) == null) {
                    landmark = "";
                }
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(landmark, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            final MutableState mutableState5 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, 712583111);
            if (objK5 == companion.getEmpty()) {
                if (vVar == null || (pincode = vVar.getPincode()) == null) {
                    pincode = "";
                }
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(pincode, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            final MutableState mutableState6 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, 712585284);
            if (objK6 == companion.getEmpty()) {
                if (vVar == null || (city = vVar.getCity()) == null) {
                    city = "";
                }
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(city, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            final MutableState mutableState7 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, 712587397);
            if (objK7 == companion.getEmpty()) {
                if (vVar == null || (state = vVar.getState()) == null) {
                    state = "";
                }
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(state, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            final MutableState mutableState8 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, 712589743);
            if (objK8 == companion.getEmpty()) {
                if (vVar == null || (addressType = vVar.getAddressType()) == null) {
                    addressType = "Home";
                }
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(addressType, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            final MutableState mutableState9 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, 712592310);
            if (objK9 == companion.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            final MutableState mutableState10 = (MutableState) objK9;
            Object objK10 = b.k(composerStartRestartGroup, 712594454);
            if (objK10 == companion.getEmpty()) {
                objK10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK10);
            }
            MutableState mutableState11 = (MutableState) objK10;
            Object objK11 = b.k(composerStartRestartGroup, 712596350);
            if (objK11 == companion.getEmpty()) {
                objK11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK11);
            }
            MutableState mutableState12 = (MutableState) objK11;
            composerStartRestartGroup.endReplaceGroup();
            String str2 = (String) mutableState6.getValue();
            composerStartRestartGroup.startReplaceGroup(712600075);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(printOrderViewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                C2419cb c2419cb = new C2419cb(printOrderViewModel, mutableState6, mutableState11, mutableState12, mutableState7, mutableState8, null);
                composerStartRestartGroup.updateRememberedValue(c2419cb);
                objRememberedValue2 = c2419cb;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(str2, (e) objRememberedValue2, composerStartRestartGroup, 0);
            if (j.m0((String) mutableState.getValue()) || j.m0((String) mutableState2.getValue()) || j.m0((String) mutableState3.getValue()) || j.m0((String) mutableState4.getValue()) || j.m0((String) mutableState5.getValue()) || j.m0((String) mutableState7.getValue()) || j.m0((String) mutableState8.getValue())) {
                z3 = false;
            } else {
                String input = (String) mutableState6.getValue();
                Pattern patternCompile = Pattern.compile("\\D");
                o.e(patternCompile, "compile(...)");
                o.f(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                o.e(strReplaceAll, "replaceAll(...)");
                if (strReplaceAll.length() == 6) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            composerStartRestartGroup.startReplaceGroup(712630995);
            boolean zChanged = ((57344 & i7) == 16384) | composerStartRestartGroup.changed(z3) | ((i7 & 14) == 4) | ((i7 & 896) == 256) | composerStartRestartGroup.changedInstance(printOrderViewModel);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                final boolean z4 = z3;
                a aVar3 = new a() { // from class: x3.Wa
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.a
                    public final Object invoke() {
                        String id;
                        String strG0;
                        Integer numIsDefault;
                        if (z4) {
                            Boolean bool = Boolean.TRUE;
                            MutableState mutableState13 = mutableState10;
                            mutableState13.setValue(bool);
                            v vVar2 = vVar;
                            if (vVar2 == null || (id = vVar2.getId()) == null) {
                                id = "";
                            }
                            MutableState mutableState14 = mutableState;
                            String string = j.I0((String) mutableState14.getValue()).toString();
                            MutableState mutableState15 = mutableState2;
                            String string2 = j.I0((String) mutableState15.getValue()).toString();
                            String strM = androidx.compose.foundation.text.modifiers.a.m(j.I0((String) mutableState14.getValue()).toString(), " ", j.I0((String) mutableState15.getValue()).toString());
                            if (vVar2 == null || (strG0 = vVar2.getPhone()) == null) {
                                Pattern patternCompile2 = Pattern.compile("\\D");
                                o.e(patternCompile2, "compile(...)");
                                String input2 = str;
                                o.f(input2, "input");
                                String strReplaceAll2 = patternCompile2.matcher(input2).replaceAll("");
                                o.e(strReplaceAll2, "replaceAll(...)");
                                strG0 = j.G0(strReplaceAll2);
                            }
                            String string3 = j.I0((String) mutableState3.getValue()).toString();
                            String string4 = j.I0((String) mutableState4.getValue()).toString();
                            String string5 = j.I0((String) mutableState5.getValue()).toString();
                            String str3 = (String) mutableState7.getValue();
                            String str4 = (String) mutableState8.getValue();
                            String input3 = (String) mutableState6.getValue();
                            Pattern patternCompile3 = Pattern.compile("\\D");
                            o.e(patternCompile3, "compile(...)");
                            o.f(input3, "input");
                            String strReplaceAll3 = patternCompile3.matcher(input3).replaceAll("");
                            o.e(strReplaceAll3, "replaceAll(...)");
                            v vVar3 = new v(id, string, string2, strM, strG0, string3, string4, string5, str3, str4, j.F0(6, strReplaceAll3), (String) mutableState9.getValue(), 1, Integer.valueOf((vVar2 == null || (numIsDefault = vVar2.isDefault()) == null) ? 0 : numIsDefault.intValue()));
                            J3 j5 = new J3(aVar2, mutableState13, 2);
                            C2321y c2321y = new C2321y(22, mutableState13);
                            PrintOrderViewModel printOrderViewModel2 = printOrderViewModel;
                            printOrderViewModel2.getClass();
                            p019e0.a aVarH = Q.h(printOrderViewModel2);
                            e4.e eVar = H.f1766a;
                            A.t(aVarH, d.f11107o, null, new J0(printOrderViewModel2, vVar3, j5, c2321y, null), 2);
                        }
                        return B3.o.f154a;
                    }
                };
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(aVar3);
                objRememberedValue3 = aVar3;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            composer3 = composer2;
            AndroidDialog_androidKt.Dialog(aVar, new DialogProperties(false, false, false, 3, (AbstractC2168g) null), ComposableLambdaKt.rememberComposableLambda(1801859623, true, new C2483gb(aVar, Dp.m6403constructorimpl(((Configuration) composer2.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp), vVar, mutableState, mutableState2, str, mutableState3, mutableState4, mutableState5, mutableState6, mutableState11, mutableState12, mutableState7, mutableState8, mutableState9, z3, (a) objRememberedValue3, mutableState10), composer3, 54), composer3, ((i7 >> 9) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2567m(vVar, printOrderViewModel, str, aVar, aVar2, i5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:107:0x03da  */
    /* JADX WARN: Code duplicated, block: B:108:0x03de  */
    /* JADX WARN: Code duplicated, block: B:111:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:114:0x0400  */
    /* JADX WARN: Code duplicated, block: B:118:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:121:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:122:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:125:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:127:0x050a  */
    /* JADX WARN: Code duplicated, block: B:130:0x063a  */
    /* JADX WARN: Code duplicated, block: B:132:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:136:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x070f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0776  */
    /* JADX WARN: Code duplicated, block: B:143:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:146:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:147:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:150:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:152:0x0807  */
    /* JADX WARN: Code duplicated, block: B:155:0x083f  */
    /* JADX WARN: Code duplicated, block: B:158:0x084b  */
    /* JADX WARN: Code duplicated, block: B:159:0x084f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0860  */
    /* JADX WARN: Code duplicated, block: B:164:0x086e  */
    /* JADX WARN: Code duplicated, block: B:166:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:169:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:171:0x0920  */
    /* JADX WARN: Code duplicated, block: B:174:0x092c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0930  */
    /* JADX WARN: Code duplicated, block: B:178:0x0941  */
    /* JADX WARN: Code duplicated, block: B:180:0x094f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0980  */
    /* JADX WARN: Code duplicated, block: B:185:0x098c  */
    /* JADX WARN: Code duplicated, block: B:187:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:190:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:196:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:202:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:203:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:206:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:208:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:210:0x0b7c  */
    /* JADX WARN: Code duplicated, block: B:212:0x0bb3  */
    /* JADX WARN: Code duplicated, block: B:215:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:216:0x0bc3  */
    /* JADX WARN: Code duplicated, block: B:219:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:221:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:225:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:227:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:231:0x0c22  */
    /* JADX WARN: Code duplicated, block: B:234:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:238:0x0c52  */
    /* JADX WARN: Code duplicated, block: B:241:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:243:0x0c8d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0ce3  */
    /* JADX WARN: Code duplicated, block: B:250:0x0d02  */
    /* JADX WARN: Code duplicated, block: B:253:0x0d22  */
    /* JADX WARN: Code duplicated, block: B:255:0x0d28  */
    /* JADX WARN: Code duplicated, block: B:259:0x0d4e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0d95  */
    /* JADX WARN: Code duplicated, block: B:265:0x0de3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v23 */
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
    public static final void d(final PrintOrderViewModel viewModel, a onBack, Modifier modifier, Composer composer, int i5) {
        Context context;
        int i6;
        MutableState mutableState;
        float f5;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        Composer composer2;
        Color.Companion companion;
        float f6;
        int i7;
        Context context2;
        MutableState mutableState2;
        MutableState mutableState3;
        Composer composer3;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        FontWeight.Companion companion2;
        long j5;
        float f7;
        int i8;
        boolean z3;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        MutableState mutableState4;
        ?? r15;
        MutableState mutableState5;
        Context context3;
        MutableState mutableState6;
        boolean zChanged;
        Object objRememberedValue;
        MutableState mutableState7;
        MutableState mutableState8;
        int i9;
        boolean zChanged2;
        Object objRememberedValue2;
        MutableState mutableState9;
        Context context4;
        boolean zChangedInstance;
        Object objRememberedValue3;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG3;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG4;
        Modifier modifier2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Composer.Companion companion3;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG5;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        e eVarG6;
        int currentCompositeKeyHash8;
        a constructor8;
        Composer composerM3407constructorimpl8;
        e eVarG7;
        boolean zChanged3;
        Object objRememberedValue7;
        o.f(viewModel, "viewModel");
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(998502562);
        int i10 = (i5 & 6) == 0 ? i5 | (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) : i5;
        if ((i5 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onBack) ? 32 : 16;
        }
        int i11 = i10 | 384;
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer3 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion4 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(998502562, i11, -1, "com.notescrafter.ui.screens.PrintAddressesScreen (PrintAddressesScreen.kt:49)");
            }
            Context context5 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            SnapshotMutationPolicy snapshotMutationPolicy = null;
            State stateCollectAsState = SnapshotStateKt.collectAsState(viewModel.f10901l, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-2079530934);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (objRememberedValue8 == companion5.getEmpty()) {
                objRememberedValue8 = context5.getSharedPreferences("auth_prefs", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            SharedPreferences sharedPreferences = (SharedPreferences) objRememberedValue8;
            Object objK = b.k(composerStartRestartGroup, -2079527279);
            if (objK == companion5.getEmpty()) {
                String string = sharedPreferences.getString("user_phone", "");
                if (string == null) {
                    string = "";
                }
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(string, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState10 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, -2079524200);
            if (objK2 == companion5.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sharedPreferences.getBoolean("user_phone_verified", false)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            MutableState mutableState11 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, -2079520401);
            if (objK3 == companion5.getEmpty()) {
                objK3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            MutableState mutableState12 = (MutableState) objK3;
            Object objK4 = b.k(composerStartRestartGroup, -2079518435);
            if (objK4 == companion5.getEmpty()) {
                objK4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK4);
            }
            MutableState mutableState13 = (MutableState) objK4;
            Object objK5 = b.k(composerStartRestartGroup, -2079515523);
            if (objK5 == companion5.getEmpty()) {
                String input = (String) mutableState10.getValue();
                Pattern patternCompile = Pattern.compile("\\D");
                o.e(patternCompile, "compile(...)");
                o.f(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                o.e(strReplaceAll, "replaceAll(...)");
                snapshotMutationPolicy = null;
                objK5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(j.G0(strReplaceAll), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK5);
            }
            final MutableState mutableState14 = (MutableState) objK5;
            Object objK6 = b.k(composerStartRestartGroup, -2079512340);
            if (objK6 == companion5.getEmpty()) {
                objK6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objK6);
            }
            final MutableState mutableState15 = (MutableState) objK6;
            Object objK7 = b.k(composerStartRestartGroup, -2079510705);
            if (objK7 == companion5.getEmpty()) {
                objK7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objK7);
            }
            final MutableState mutableState16 = (MutableState) objK7;
            Object objK8 = b.k(composerStartRestartGroup, -2079508849);
            if (objK8 == companion5.getEmpty()) {
                objK8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objK8);
            }
            final MutableState mutableState17 = (MutableState) objK8;
            Object objK9 = b.k(composerStartRestartGroup, -2079506193);
            if (objK9 == companion5.getEmpty()) {
                objK9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objK9);
            }
            MutableState mutableState18 = (MutableState) objK9;
            Object objK10 = b.k(composerStartRestartGroup, -2079503849);
            if (objK10 == companion5.getEmpty()) {
                objK10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objK10);
            }
            MutableState mutableState19 = (MutableState) objK10;
            composerStartRestartGroup.endReplaceGroup();
            B3.o oVar = B3.o.f154a;
            composerStartRestartGroup.startReplaceGroup(-2079501566);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewModel);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue9 == companion5.getEmpty()) {
                objRememberedValue9 = new C2499hb(viewModel, mutableState18, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(oVar, (e) objRememberedValue9, composerStartRestartGroup, 6);
            boolean zBooleanValue = ((Boolean) mutableState11.getValue()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-2079493406);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(sharedPreferences);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue10 == companion5.getEmpty()) {
                objRememberedValue10 = new C2453ed(sharedPreferences, mutableState10, mutableState11, mutableState14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            final a aVar = (a) objRememberedValue10;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-2079485542);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changedInstance(context5);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue11 == companion5.getEmpty()) {
                context = context5;
                Za za = new Za(viewModel, mutableState14, mutableState17, context, mutableState16, 0);
                composerStartRestartGroup.updateRememberedValue(za);
                objRememberedValue11 = za;
            } else {
                context = context5;
            }
            a aVar2 = (a) objRememberedValue11;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-2079466834);
            final Context context6 = context;
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changed(aVar) | composerStartRestartGroup.changedInstance(context6);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue12 == companion5.getEmpty()) {
                i6 = 2;
                a aVar3 = new a() { // from class: x3.ab
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // O3.a
                    public final Object invoke() {
                        MutableState mutableState20 = mutableState15;
                        if (((String) mutableState20.getValue()).length() == 6) {
                            MutableState mutableState21 = mutableState17;
                            AbstractC2595nb.e(mutableState21, true);
                            String phone = (String) mutableState14.getValue();
                            String code = (String) mutableState20.getValue();
                            MutableState mutableState22 = mutableState16;
                            a aVar4 = aVar;
                            Context context7 = context6;
                            Pa pa = new Pa(aVar4, context7, mutableState21, mutableState22, mutableState20, 1);
                            Va va = new Va(context7, mutableState21, 0);
                            PrintOrderViewModel printOrderViewModel = viewModel;
                            printOrderViewModel.getClass();
                            o.f(phone, "phone");
                            o.f(code, "code");
                            p019e0.a aVarH = Q.h(printOrderViewModel);
                            e4.e eVar = H.f1766a;
                            A.t(aVarH, d.f11107o, null, new b1(printOrderViewModel, phone, code, pa, va, null), 2);
                        }
                        return B3.o.f154a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(aVar3);
                objRememberedValue12 = aVar3;
            } else {
                i6 = 2;
            }
            a aVar4 = (a) objRememberedValue12;
            composerStartRestartGroup.endReplaceGroup();
            float f8 = 16;
            float f9 = 24;
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(PaddingKt.m669paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(r22, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f9)), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(Dp.m6403constructorimpl(80) + WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo618calculateBottomPaddingD9Ej5fM()), 7, null);
            Alignment.Companion companion6 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion6.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default);
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            a constructor9 = companion7.getConstructor();
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
            e eVarG8 = p035i0.a.g(companion7, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl9, currentCompositionLocalMap);
            if (composerM3407constructorimpl9.getInserting()) {
                mutableState = mutableState10;
            } else {
                mutableState = mutableState10;
                if (!o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier, companion7.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM672paddingqDBjuR0$default2 = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(r22, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 7, null);
                f5 = 12;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion6.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default2);
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
                e eVarG9 = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap2);
                if (composerM3407constructorimpl.getInserting()) {
                    composer2 = composerStartRestartGroup;
                } else {
                    composer2 = composerStartRestartGroup;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion7.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(r22, Dp.m6403constructorimpl(42)), RoundedCornerShapeKt.getCircleShape());
                    companion = Color.Companion;
                    f6 = 1;
                    Composer composer4 = composer2;
                    i7 = 16;
                    context2 = context6;
                    mutableState2 = mutableState13;
                    mutableState3 = mutableState;
                    IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, AbstractC2649r2.f15472a, composer4, ((i11 >> 3) & 14) | 196608, 28);
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null);
                    composer3 = composer4;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
                    constructor2 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                    eVarG = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap3);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion7.getSetModifier());
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i12 = MaterialTheme.$stable;
                    TextStyle labelSmall = materialTheme.getTypography(composer3, i12).getLabelSmall();
                    companion2 = FontWeight.Companion;
                    FontWeight black = companion2.getBlack();
                    long sp = TextUnitKt.getSp(i6);
                    j5 = p107y3.a.f15980c;
                    TextKt.m2432Text4IGK_g("DELIVERY DESTINATIONS", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : j5, (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : black, (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : sp, (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                    b.m(i6, companion4, composer3, 6);
                    TextStyle headlineSmall = materialTheme.getTypography(composer3, i12).getHeadlineSmall();
                    TextKt.m2432Text4IGK_g("My Addresses", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall.spanStyle.m5841getColor0d7_KjU() : companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall.spanStyle.getFontWeight() : companion2.getExtraBold(), (16645977 & 8) != 0 ? headlineSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                    TextStyle bodySmall = materialTheme.getTypography(composer3, i12).getBodySmall();
                    TextKt.m2432Text4IGK_g("Manage your delivery destinations for faster checkout.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.q, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                    composer3.endNode();
                    composer3.endNode();
                    composer3.startReplaceGroup(-222025527);
                    if (((List) stateCollectAsState.getValue()).size() < 5) {
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        long j6 = p107y3.a.f15978a;
                        ButtonColors buttonColorsM1520buttonColorsro_MJ88 = buttonDefaults.m1520buttonColorsro_MJ88(j6, 0L, Color.m3926copywmQWz5c$default(j6, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, composer3, (ButtonDefaults.$stable << 12) | 390, 10);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8));
                        Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m6403constructorimpl(54));
                        PaddingValues paddingValuesM661PaddingValues0680j_4 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                        composer3.startReplaceGroup(-222024341);
                        zChanged3 = composer3.changed(zBooleanValue) | composer3.changedInstance(context2);
                        objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue7 == companion5.getEmpty()) {
                            objRememberedValue7 = new K4(1, context2, mutableState2, mutableState12, zBooleanValue);
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        composer3.endReplaceGroup();
                        context2 = context2;
                        ButtonKt.Button((a) objRememberedValue7, modifierM699height3ABfNKs, zBooleanValue, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1520buttonColorsro_MJ88, null, null, paddingValuesM661PaddingValues0680j_4, null, ComposableLambdaKt.rememberComposableLambda(1884563555, true, new C2515ib(zBooleanValue), composer3, 54), composer3, 817889328, 352);
                        b.m(20, companion4, composer3, 6);
                    } else {
                        companion = companion;
                    }
                    composer3.endReplaceGroup();
                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(444165629, true, new C2563lb(mutableState11, mutableState3, mutableState16, aVar2, aVar4, mutableState14, mutableState17, mutableState15), composer3, 54), composer3, 196614, 30);
                    f7 = 20;
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f7)), composer3, 6);
                    composer3.startReplaceGroup(-221654985);
                    if (((List) stateCollectAsState.getValue()).size() >= 5) {
                        i8 = 14;
                        Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(b.e(f8, b.f(f8, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(14));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs);
                        constructor7 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor7);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                        eVarG6 = p035i0.a.g(companion7, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl7, currentCompositionLocalMap4);
                        if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier4, companion7.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(10)), companion6.getCenterVertically(), composer3, 54);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, companion4);
                        constructor8 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor8);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                        eVarG7 = p035i0.a.g(companion7, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl8, currentCompositionLocalMap5);
                        if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier5, companion7.getSetModifier());
                        IconKt.m1877Iconww6aTOc(ShieldKt.getShield(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f8)), ColorKt.Color(4284524026L), composer3, 3504, 0);
                        TextKt.m2432Text4IGK_g("You've reached the maximum limit of 5 addresses. Delete an existing one to add a new destination.", (Modifier) null, ColorKt.Color(4287874557L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3462, 6, 130034);
                        b.r(composer3, f7, companion4, composer3, 6);
                    } else {
                        i8 = 14;
                    }
                    composer3.endReplaceGroup();
                    if (((Boolean) mutableState18.getValue()).booleanValue()) {
                        composer3.startReplaceGroup(1719882769);
                        Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(40), 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default);
                        constructor6 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor6);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                        eVarG5 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap6);
                        if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion7.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(null, j5, 0.0f, 0L, 0, composer3, 48, 29);
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        if (((List) stateCollectAsState.getValue()).isEmpty()) {
                            composer3.startReplaceGroup(1720254211);
                            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f9, b.f(f9, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(48));
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion6.getCenterHorizontally(), composer3, 54);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN4);
                            constructor4 = companion7.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor4);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                            eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap7);
                            if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier7, companion7.getSetModifier());
                            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(64)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierM220borderxT4_qwU);
                            constructor5 = companion7.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor5);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                            eVarG4 = p035i0.a.g(companion7, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap8);
                            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier8, companion7.getSetModifier());
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            IconKt.m1877Iconww6aTOc(PlaceKt.getPlace(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(32)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                            composer3.endNode();
                            TextKt.m2432Text4IGK_g("No addresses saved yet", (Modifier) null, companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, companion2.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                            TextKt.m2432Text4IGK_g("Add your first shipping address to start ordering your custom notes.", SizeKt.m718width3ABfNKs(companion4, Dp.m6403constructorimpl(260)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 0, 130544);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1721977625);
                            z3 = true;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion6.getStart(), composer3, 6);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                            constructor3 = companion7.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                            eVarG2 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl3, currentCompositionLocalMap9);
                            if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                            }
                            p035i0.a.w(companion7, composerM3407constructorimpl3, modifierMaterializeModifier9, composer3, -839933835);
                            for (v vVar : (List) stateCollectAsState.getValue()) {
                                composer3.startReplaceGroup(1425585574);
                                zChanged = composer3.changed(vVar);
                                objRememberedValue = composer3.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                    mutableState7 = mutableState12;
                                    mutableState8 = mutableState2;
                                    i9 = 6;
                                    objRememberedValue = new C2306q(vVar, mutableState8, mutableState7, i9);
                                    composer3.updateRememberedValue(objRememberedValue);
                                } else {
                                    mutableState7 = mutableState12;
                                    mutableState8 = mutableState2;
                                    i9 = 6;
                                }
                                a aVar5 = (a) objRememberedValue;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1425590694);
                                zChanged2 = composer3.changed(vVar);
                                objRememberedValue2 = composer3.rememberedValue();
                                if (!zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                    mutableState9 = mutableState19;
                                    objRememberedValue2 = new C2290i(i7, vVar, mutableState9);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                } else {
                                    mutableState9 = mutableState19;
                                }
                                a aVar6 = (a) objRememberedValue2;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1425595405);
                                context4 = context2;
                                zChangedInstance = composer3.changedInstance(viewModel) | composer3.changed(vVar) | composer3.changedInstance(context4);
                                objRememberedValue3 = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                    objRememberedValue3 = new C2306q(viewModel, vVar, context4, 7);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceGroup();
                                a(vVar, aVar5, aVar6, (a) objRememberedValue3, composer3, 0);
                                mutableState12 = mutableState7;
                                mutableState2 = mutableState8;
                                mutableState19 = mutableState9;
                                context2 = context4;
                                z3 = true;
                                i7 = 16;
                            }
                            mutableState4 = mutableState12;
                            r15 = z3;
                            mutableState5 = mutableState19;
                            context3 = context2;
                            mutableState6 = mutableState2;
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        composer3.startReplaceGroup(-2078851235);
                        if (((Boolean) mutableState4.getValue()).booleanValue()) {
                            v vVar2 = (v) mutableState6.getValue();
                            String str = (String) mutableState3.getValue();
                            composer3.startReplaceGroup(-2078845788);
                            objRememberedValue5 = composer3.rememberedValue();
                            companion3 = Composer.Companion;
                            if (objRememberedValue5 == companion3.getEmpty()) {
                                objRememberedValue5 = new O6(23, mutableState4);
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            a aVar7 = (a) objRememberedValue5;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-2078843966);
                            zChangedInstance2 = composer3.changedInstance(context3);
                            objRememberedValue6 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue6 == companion3.getEmpty()) {
                                objRememberedValue6 = new M5(context3, mutableState4, i8);
                                composer3.updateRememberedValue(objRememberedValue6);
                            }
                            composer3.endReplaceGroup();
                            c(vVar2, viewModel, str, aVar7, (a) objRememberedValue6, composer3, ((i11 << 3) & 112) | 3072);
                        }
                        composer3.endReplaceGroup();
                        if (((String) mutableState5.getValue()) != null) {
                            long jColor = ColorKt.Color(4280163870L);
                            Modifier modifierM220borderxT4_qwU2 = BorderKt.m220borderxT4_qwU(Modifier.Companion, Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(28)));
                            composer3.startReplaceGroup(-2078835598);
                            objRememberedValue4 = composer3.rememberedValue();
                            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                                objRememberedValue4 = new O6(22, mutableState5);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceGroup();
                            AndroidAlertDialog_androidKt.m1471AlertDialogOix01E0((a) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1682559956, r15, new C2579mb(viewModel, context3, mutableState5), composer3, 54), modifierM220borderxT4_qwU2, ComposableLambdaKt.rememberComposableLambda(1826409450, r15, new C2780z5(r15, mutableState5), composer3, 54), null, AbstractC2649r2.g, AbstractC2649r2.f15477h, null, jColor, 0L, 0L, 0L, 0.0f, null, composer3, 102435894, 0, 16016);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion4;
                    }
                    r15 = 1;
                    mutableState4 = mutableState12;
                    mutableState5 = mutableState19;
                    context3 = context2;
                    mutableState6 = mutableState2;
                    composer3.endNode();
                    composer3.startReplaceGroup(-2078851235);
                    if (((Boolean) mutableState4.getValue()).booleanValue()) {
                        v vVar3 = (v) mutableState6.getValue();
                        String str2 = (String) mutableState3.getValue();
                        composer3.startReplaceGroup(-2078845788);
                        objRememberedValue5 = composer3.rememberedValue();
                        companion3 = Composer.Companion;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = new O6(23, mutableState4);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        a aVar8 = (a) objRememberedValue5;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-2078843966);
                        zChangedInstance2 = composer3.changedInstance(context3);
                        objRememberedValue6 = composer3.rememberedValue();
                        if (zChangedInstance2) {
                            objRememberedValue6 = new M5(context3, mutableState4, i8);
                            composer3.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new M5(context3, mutableState4, i8);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceGroup();
                        c(vVar3, viewModel, str2, aVar8, (a) objRememberedValue6, composer3, ((i11 << 3) & 112) | 3072);
                    }
                    composer3.endReplaceGroup();
                    if (((String) mutableState5.getValue()) != null) {
                        long jColor2 = ColorKt.Color(4280163870L);
                        Modifier modifierM220borderxT4_qwU3 = BorderKt.m220borderxT4_qwU(Modifier.Companion, Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(28)));
                        composer3.startReplaceGroup(-2078835598);
                        objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new O6(22, mutableState5);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceGroup();
                        AndroidAlertDialog_androidKt.m1471AlertDialogOix01E0((a) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1682559956, r15, new C2579mb(viewModel, context3, mutableState5), composer3, 54), modifierM220borderxT4_qwU3, ComposableLambdaKt.rememberComposableLambda(1826409450, r15, new C2780z5(r15, mutableState5), composer3, 54), null, AbstractC2649r2.g, AbstractC2649r2.f15477h, null, jColor2, 0L, 0L, 0L, 0.0f, null, composer3, 102435894, 0, 16016);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion4;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG9);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion7.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Modifier modifierClip2 = ClipKt.clip(SizeKt.m713size3ABfNKs(r22, Dp.m6403constructorimpl(42)), RoundedCornerShapeKt.getCircleShape());
                companion = Color.Companion;
                f6 = 1;
                Composer composer5 = composer2;
                i7 = 16;
                context2 = context6;
                mutableState2 = mutableState13;
                mutableState3 = mutableState;
                IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip2, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, AbstractC2649r2.f15472a, composer5, ((i11 >> 3) & 14) | 196608, 28);
                Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance2, companion4, 1.0f, false, 2, null);
                composer3 = composer5;
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default2);
                constructor2 = companion7.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                eVarG = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap10);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier10, companion7.getSetModifier());
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i13 = MaterialTheme.$stable;
                TextStyle labelSmall2 = materialTheme2.getTypography(composer3, i13).getLabelSmall();
                companion2 = FontWeight.Companion;
                FontWeight black2 = companion2.getBlack();
                long sp2 = TextUnitKt.getSp(i6);
                j5 = p107y3.a.f15980c;
                TextKt.m2432Text4IGK_g("DELIVERY DESTINATIONS", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : j5, (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : black2, (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : sp2, (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                b.m(i6, companion4, composer3, 6);
                TextStyle headlineSmall2 = materialTheme2.getTypography(composer3, i13).getHeadlineSmall();
                TextKt.m2432Text4IGK_g("My Addresses", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall2.spanStyle.m5841getColor0d7_KjU() : companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall2.spanStyle.getFontWeight() : companion2.getExtraBold(), (16645977 & 8) != 0 ? headlineSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall2.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                TextStyle bodySmall2 = materialTheme2.getTypography(composer3, i13).getBodySmall();
                TextKt.m2432Text4IGK_g("Manage your delivery destinations for faster checkout.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : p107y3.a.q, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                composer3.endNode();
                composer3.endNode();
                composer3.startReplaceGroup(-222025527);
                if (((List) stateCollectAsState.getValue()).size() < 5) {
                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                    long j7 = p107y3.a.f15978a;
                    ButtonColors buttonColorsM1520buttonColorsro_MJ89 = buttonDefaults2.m1520buttonColorsro_MJ88(j7, 0L, Color.m3926copywmQWz5c$default(j7, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, composer3, (ButtonDefaults.$stable << 12) | 390, 10);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8));
                    Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m6403constructorimpl(54));
                    PaddingValues paddingValuesM661PaddingValues0680j_5 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                    composer3.startReplaceGroup(-222024341);
                    zChanged3 = composer3.changed(zBooleanValue) | composer3.changedInstance(context2);
                    objRememberedValue7 = composer3.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue7 = new K4(1, context2, mutableState2, mutableState12, zBooleanValue);
                        composer3.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new K4(1, context2, mutableState2, mutableState12, zBooleanValue);
                        composer3.updateRememberedValue(objRememberedValue7);
                    }
                    composer3.endReplaceGroup();
                    context2 = context2;
                    ButtonKt.Button((a) objRememberedValue7, modifierM699height3ABfNKs2, zBooleanValue, roundedCornerShapeM955RoundedCornerShape0680j_5, buttonColorsM1520buttonColorsro_MJ89, null, null, paddingValuesM661PaddingValues0680j_5, null, ComposableLambdaKt.rememberComposableLambda(1884563555, true, new C2515ib(zBooleanValue), composer3, 54), composer3, 817889328, 352);
                    b.m(20, companion4, composer3, 6);
                } else {
                    companion = companion;
                }
                composer3.endReplaceGroup();
                p097w3.j.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(444165629, true, new C2563lb(mutableState11, mutableState3, mutableState16, aVar2, aVar4, mutableState14, mutableState17, mutableState15), composer3, 54), composer3, 196614, 30);
                f7 = 20;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f7)), composer3, 6);
                composer3.startReplaceGroup(-221654985);
                if (((List) stateCollectAsState.getValue()).size() >= 5) {
                    i8 = 14;
                    Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f8, b.f(f8, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(14));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs2);
                    constructor7 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                    eVarG6 = p035i0.a.g(companion7, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl7, currentCompositionLocalMap11);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(10)), companion6.getCenterVertically(), composer3, 54);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer3, companion4);
                    constructor8 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                    eVarG7 = p035i0.a.g(companion7, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl8, currentCompositionLocalMap12);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier12, companion7.getSetModifier());
                    IconKt.m1877Iconww6aTOc(ShieldKt.getShield(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f8)), ColorKt.Color(4284524026L), composer3, 3504, 0);
                    TextKt.m2432Text4IGK_g("You've reached the maximum limit of 5 addresses. Delete an existing one to add a new destination.", (Modifier) null, ColorKt.Color(4287874557L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3462, 6, 130034);
                    b.r(composer3, f7, companion4, composer3, 6);
                } else {
                    i8 = 14;
                }
                composer3.endReplaceGroup();
                if (((Boolean) mutableState18.getValue()).booleanValue()) {
                    composer3.startReplaceGroup(1719882769);
                    Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(40), 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default2);
                    constructor6 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                    eVarG5 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl6, currentCompositionLocalMap13);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier13, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(null, j5, 0.0f, 0L, 0, composer3, 48, 29);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                } else {
                    if (((List) stateCollectAsState.getValue()).isEmpty()) {
                        composer3.startReplaceGroup(1720254211);
                        Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.e(f9, b.f(f9, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(48));
                        MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion6.getCenterHorizontally(), composer3, 54);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap14 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN5);
                        constructor4 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                        eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap14);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier14, companion7.getSetModifier());
                        Modifier modifierM220borderxT4_qwU4 = BorderKt.m220borderxT4_qwU(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(64)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap15 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer3, modifierM220borderxT4_qwU4);
                        constructor5 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                        eVarG4 = p035i0.a.g(companion7, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl5, currentCompositionLocalMap15);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier15, companion7.getSetModifier());
                        BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                        IconKt.m1877Iconww6aTOc(PlaceKt.getPlace(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(32)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                        composer3.endNode();
                        TextKt.m2432Text4IGK_g("No addresses saved yet", (Modifier) null, companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, companion2.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("Add your first shipping address to start ordering your custom notes.", SizeKt.m718width3ABfNKs(companion4, Dp.m6403constructorimpl(260)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 0, 130544);
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1721977625);
                        z3 = true;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion6.getStart(), composer3, 6);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                        constructor3 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                        eVarG2 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl3, currentCompositionLocalMap16);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        }
                        p035i0.a.w(companion7, composerM3407constructorimpl3, modifierMaterializeModifier16, composer3, -839933835);
                        while (r0.hasNext()) {
                            composer3.startReplaceGroup(1425585574);
                            zChanged = composer3.changed(vVar);
                            objRememberedValue = composer3.rememberedValue();
                            if (zChanged) {
                                mutableState7 = mutableState12;
                                mutableState8 = mutableState2;
                                i9 = 6;
                                objRememberedValue = new C2306q(vVar, mutableState8, mutableState7, i9);
                                composer3.updateRememberedValue(objRememberedValue);
                            } else {
                                mutableState7 = mutableState12;
                                mutableState8 = mutableState2;
                                i9 = 6;
                                objRememberedValue = new C2306q(vVar, mutableState8, mutableState7, i9);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            a aVar9 = (a) objRememberedValue;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1425590694);
                            zChanged2 = composer3.changed(vVar);
                            objRememberedValue2 = composer3.rememberedValue();
                            if (zChanged2) {
                                mutableState9 = mutableState19;
                                objRememberedValue2 = new C2290i(i7, vVar, mutableState9);
                                composer3.updateRememberedValue(objRememberedValue2);
                            } else {
                                mutableState9 = mutableState19;
                                objRememberedValue2 = new C2290i(i7, vVar, mutableState9);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            a aVar10 = (a) objRememberedValue2;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1425595405);
                            context4 = context2;
                            zChangedInstance = composer3.changedInstance(viewModel) | composer3.changed(vVar) | composer3.changedInstance(context4);
                            objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue3 = new C2306q(viewModel, vVar, context4, 7);
                                composer3.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new C2306q(viewModel, vVar, context4, 7);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            a(vVar, aVar9, aVar10, (a) objRememberedValue3, composer3, 0);
                            mutableState12 = mutableState7;
                            mutableState2 = mutableState8;
                            mutableState19 = mutableState9;
                            context2 = context4;
                            z3 = true;
                            i7 = 16;
                        }
                        mutableState4 = mutableState12;
                        r15 = z3;
                        mutableState5 = mutableState19;
                        context3 = context2;
                        mutableState6 = mutableState2;
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    composer3.startReplaceGroup(-2078851235);
                    if (((Boolean) mutableState4.getValue()).booleanValue()) {
                        v vVar4 = (v) mutableState6.getValue();
                        String str3 = (String) mutableState3.getValue();
                        composer3.startReplaceGroup(-2078845788);
                        objRememberedValue5 = composer3.rememberedValue();
                        companion3 = Composer.Companion;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = new O6(23, mutableState4);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        a aVar11 = (a) objRememberedValue5;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-2078843966);
                        zChangedInstance2 = composer3.changedInstance(context3);
                        objRememberedValue6 = composer3.rememberedValue();
                        if (zChangedInstance2) {
                            objRememberedValue6 = new M5(context3, mutableState4, i8);
                            composer3.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new M5(context3, mutableState4, i8);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceGroup();
                        c(vVar4, viewModel, str3, aVar11, (a) objRememberedValue6, composer3, ((i11 << 3) & 112) | 3072);
                    }
                    composer3.endReplaceGroup();
                    if (((String) mutableState5.getValue()) != null) {
                        long jColor3 = ColorKt.Color(4280163870L);
                        Modifier modifierM220borderxT4_qwU5 = BorderKt.m220borderxT4_qwU(Modifier.Companion, Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(28)));
                        composer3.startReplaceGroup(-2078835598);
                        objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new O6(22, mutableState5);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceGroup();
                        AndroidAlertDialog_androidKt.m1471AlertDialogOix01E0((a) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1682559956, r15, new C2579mb(viewModel, context3, mutableState5), composer3, 54), modifierM220borderxT4_qwU5, ComposableLambdaKt.rememberComposableLambda(1826409450, r15, new C2780z5(r15, mutableState5), composer3, 54), null, AbstractC2649r2.g, AbstractC2649r2.f15477h, null, jColor3, 0L, 0L, 0L, 0.0f, null, composer3, 102435894, 0, 16016);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion4;
                }
                r15 = 1;
                mutableState4 = mutableState12;
                mutableState5 = mutableState19;
                context3 = context2;
                mutableState6 = mutableState2;
                composer3.endNode();
                composer3.startReplaceGroup(-2078851235);
                if (((Boolean) mutableState4.getValue()).booleanValue()) {
                    v vVar5 = (v) mutableState6.getValue();
                    String str4 = (String) mutableState3.getValue();
                    composer3.startReplaceGroup(-2078845788);
                    objRememberedValue5 = composer3.rememberedValue();
                    companion3 = Composer.Companion;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = new O6(23, mutableState4);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    a aVar12 = (a) objRememberedValue5;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-2078843966);
                    zChangedInstance2 = composer3.changedInstance(context3);
                    objRememberedValue6 = composer3.rememberedValue();
                    if (zChangedInstance2) {
                        objRememberedValue6 = new M5(context3, mutableState4, i8);
                        composer3.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new M5(context3, mutableState4, i8);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    composer3.endReplaceGroup();
                    c(vVar5, viewModel, str4, aVar12, (a) objRememberedValue6, composer3, ((i11 << 3) & 112) | 3072);
                }
                composer3.endReplaceGroup();
                if (((String) mutableState5.getValue()) != null) {
                    long jColor4 = ColorKt.Color(4280163870L);
                    Modifier modifierM220borderxT4_qwU6 = BorderKt.m220borderxT4_qwU(Modifier.Companion, Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(28)));
                    composer3.startReplaceGroup(-2078835598);
                    objRememberedValue4 = composer3.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new O6(22, mutableState5);
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    AndroidAlertDialog_androidKt.m1471AlertDialogOix01E0((a) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1682559956, r15, new C2579mb(viewModel, context3, mutableState5), composer3, 54), modifierM220borderxT4_qwU6, ComposableLambdaKt.rememberComposableLambda(1826409450, r15, new C2780z5(r15, mutableState5), composer3, 54), null, AbstractC2649r2.g, AbstractC2649r2.f15477h, null, jColor4, 0L, 0L, 0L, 0.0f, null, composer3, 102435894, 0, 16016);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion4;
            }
            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG8);
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier, companion7.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifierM672paddingqDBjuR0$default3 = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(r22, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f9), 7, null);
            f5 = 12;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion6.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default3);
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
            e eVarG10 = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap17);
            if (composerM3407constructorimpl.getInserting()) {
                composer2 = composerStartRestartGroup;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier17, companion7.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                Modifier modifierClip3 = ClipKt.clip(SizeKt.m713size3ABfNKs(r22, Dp.m6403constructorimpl(42)), RoundedCornerShapeKt.getCircleShape());
                companion = Color.Companion;
                f6 = 1;
                Composer composer6 = composer2;
                i7 = 16;
                context2 = context6;
                mutableState2 = mutableState13;
                mutableState3 = mutableState;
                IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip3, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, AbstractC2649r2.f15472a, composer6, ((i11 >> 3) & 14) | 196608, 28);
                Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance3, companion4, 1.0f, false, 2, null);
                composer3 = composer6;
                MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap18 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default3);
                constructor2 = companion7.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                eVarG = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl2, currentCompositionLocalMap18);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier18, companion7.getSetModifier());
                MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                int i14 = MaterialTheme.$stable;
                TextStyle labelSmall3 = materialTheme3.getTypography(composer3, i14).getLabelSmall();
                companion2 = FontWeight.Companion;
                FontWeight black3 = companion2.getBlack();
                long sp3 = TextUnitKt.getSp(i6);
                j5 = p107y3.a.f15980c;
                TextKt.m2432Text4IGK_g("DELIVERY DESTINATIONS", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : j5, (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : black3, (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : sp3, (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                b.m(i6, companion4, composer3, 6);
                TextStyle headlineSmall3 = materialTheme3.getTypography(composer3, i14).getHeadlineSmall();
                TextKt.m2432Text4IGK_g("My Addresses", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall3.spanStyle.m5841getColor0d7_KjU() : companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall3.spanStyle.getFontWeight() : companion2.getExtraBold(), (16645977 & 8) != 0 ? headlineSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall3.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                TextStyle bodySmall3 = materialTheme3.getTypography(composer3, i14).getBodySmall();
                TextKt.m2432Text4IGK_g("Manage your delivery destinations for faster checkout.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : p107y3.a.q, (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
                composer3.endNode();
                composer3.endNode();
                composer3.startReplaceGroup(-222025527);
                if (((List) stateCollectAsState.getValue()).size() < 5) {
                    ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                    long j8 = p107y3.a.f15978a;
                    ButtonColors buttonColorsM1520buttonColorsro_MJ810 = buttonDefaults3.m1520buttonColorsro_MJ88(j8, 0L, Color.m3926copywmQWz5c$default(j8, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, composer3, (ButtonDefaults.$stable << 12) | 390, 10);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8));
                    Modifier modifierM699height3ABfNKs3 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m6403constructorimpl(54));
                    PaddingValues paddingValuesM661PaddingValues0680j_6 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                    composer3.startReplaceGroup(-222024341);
                    zChanged3 = composer3.changed(zBooleanValue) | composer3.changedInstance(context2);
                    objRememberedValue7 = composer3.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue7 = new K4(1, context2, mutableState2, mutableState12, zBooleanValue);
                        composer3.updateRememberedValue(objRememberedValue7);
                    } else {
                        objRememberedValue7 = new K4(1, context2, mutableState2, mutableState12, zBooleanValue);
                        composer3.updateRememberedValue(objRememberedValue7);
                    }
                    composer3.endReplaceGroup();
                    context2 = context2;
                    ButtonKt.Button((a) objRememberedValue7, modifierM699height3ABfNKs3, zBooleanValue, roundedCornerShapeM955RoundedCornerShape0680j_6, buttonColorsM1520buttonColorsro_MJ810, null, null, paddingValuesM661PaddingValues0680j_6, null, ComposableLambdaKt.rememberComposableLambda(1884563555, true, new C2515ib(zBooleanValue), composer3, 54), composer3, 817889328, 352);
                    b.m(20, companion4, composer3, 6);
                } else {
                    companion = companion;
                }
                composer3.endReplaceGroup();
                p097w3.j.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(444165629, true, new C2563lb(mutableState11, mutableState3, mutableState16, aVar2, aVar4, mutableState14, mutableState17, mutableState15), composer3, 54), composer3, 196614, 30);
                f7 = 20;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f7)), composer3, 6);
                composer3.startReplaceGroup(-221654985);
                if (((List) stateCollectAsState.getValue()).size() >= 5) {
                    i8 = 14;
                    Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(b.e(f8, b.f(f8, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(14));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs3);
                    constructor7 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                    eVarG6 = p035i0.a.g(companion7, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl7, currentCompositionLocalMap19);
                    if (composerM3407constructorimpl7.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier19, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(10)), companion6.getCenterVertically(), composer3, 54);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer3, companion4);
                    constructor8 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                    eVarG7 = p035i0.a.g(companion7, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl8, currentCompositionLocalMap110);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier110, companion7.getSetModifier());
                    IconKt.m1877Iconww6aTOc(ShieldKt.getShield(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f8)), ColorKt.Color(4284524026L), composer3, 3504, 0);
                    TextKt.m2432Text4IGK_g("You've reached the maximum limit of 5 addresses. Delete an existing one to add a new destination.", (Modifier) null, ColorKt.Color(4287874557L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3462, 6, 130034);
                    b.r(composer3, f7, companion4, composer3, 6);
                } else {
                    i8 = 14;
                }
                composer3.endReplaceGroup();
                if (((Boolean) mutableState18.getValue()).booleanValue()) {
                    composer3.startReplaceGroup(1719882769);
                    Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(40), 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default3);
                    constructor6 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                    eVarG5 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl6, currentCompositionLocalMap111);
                    if (composerM3407constructorimpl6.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(null, j5, 0.0f, 0L, 0, composer3, 48, 29);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                } else {
                    if (((List) stateCollectAsState.getValue()).isEmpty()) {
                        composer3.startReplaceGroup(1720254211);
                        Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(b.e(f9, b.f(f9, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(48));
                        MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion6.getCenterHorizontally(), composer3, 54);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap112 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN6);
                        constructor4 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                        eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl4, currentCompositionLocalMap112);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier112, companion7.getSetModifier());
                        Modifier modifierM220borderxT4_qwU7 = BorderKt.m220borderxT4_qwU(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(64)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap113 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composer3, modifierM220borderxT4_qwU7);
                        constructor5 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                        eVarG4 = p035i0.a.g(companion7, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl5, currentCompositionLocalMap113);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier113, companion7.getSetModifier());
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        IconKt.m1877Iconww6aTOc(PlaceKt.getPlace(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(32)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                        composer3.endNode();
                        TextKt.m2432Text4IGK_g("No addresses saved yet", (Modifier) null, companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, companion2.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                        TextKt.m2432Text4IGK_g("Add your first shipping address to start ordering your custom notes.", SizeKt.m718width3ABfNKs(companion4, Dp.m6403constructorimpl(260)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 0, 130544);
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1721977625);
                        z3 = true;
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion6.getStart(), composer3, 6);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap114 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default3);
                        constructor3 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                        eVarG2 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy10, composerM3407constructorimpl3, currentCompositionLocalMap114);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                        }
                        p035i0.a.w(companion7, composerM3407constructorimpl3, modifierMaterializeModifier114, composer3, -839933835);
                        while (r0.hasNext()) {
                            composer3.startReplaceGroup(1425585574);
                            zChanged = composer3.changed(vVar);
                            objRememberedValue = composer3.rememberedValue();
                            if (zChanged) {
                                mutableState7 = mutableState12;
                                mutableState8 = mutableState2;
                                i9 = 6;
                                objRememberedValue = new C2306q(vVar, mutableState8, mutableState7, i9);
                                composer3.updateRememberedValue(objRememberedValue);
                            } else {
                                mutableState7 = mutableState12;
                                mutableState8 = mutableState2;
                                i9 = 6;
                                objRememberedValue = new C2306q(vVar, mutableState8, mutableState7, i9);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            a aVar13 = (a) objRememberedValue;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1425590694);
                            zChanged2 = composer3.changed(vVar);
                            objRememberedValue2 = composer3.rememberedValue();
                            if (zChanged2) {
                                mutableState9 = mutableState19;
                                objRememberedValue2 = new C2290i(i7, vVar, mutableState9);
                                composer3.updateRememberedValue(objRememberedValue2);
                            } else {
                                mutableState9 = mutableState19;
                                objRememberedValue2 = new C2290i(i7, vVar, mutableState9);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            a aVar14 = (a) objRememberedValue2;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1425595405);
                            context4 = context2;
                            zChangedInstance = composer3.changedInstance(viewModel) | composer3.changed(vVar) | composer3.changedInstance(context4);
                            objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue3 = new C2306q(viewModel, vVar, context4, 7);
                                composer3.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new C2306q(viewModel, vVar, context4, 7);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            a(vVar, aVar13, aVar14, (a) objRememberedValue3, composer3, 0);
                            mutableState12 = mutableState7;
                            mutableState2 = mutableState8;
                            mutableState19 = mutableState9;
                            context2 = context4;
                            z3 = true;
                            i7 = 16;
                        }
                        mutableState4 = mutableState12;
                        r15 = z3;
                        mutableState5 = mutableState19;
                        context3 = context2;
                        mutableState6 = mutableState2;
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    composer3.startReplaceGroup(-2078851235);
                    if (((Boolean) mutableState4.getValue()).booleanValue()) {
                        v vVar6 = (v) mutableState6.getValue();
                        String str5 = (String) mutableState3.getValue();
                        composer3.startReplaceGroup(-2078845788);
                        objRememberedValue5 = composer3.rememberedValue();
                        companion3 = Composer.Companion;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = new O6(23, mutableState4);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        a aVar15 = (a) objRememberedValue5;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-2078843966);
                        zChangedInstance2 = composer3.changedInstance(context3);
                        objRememberedValue6 = composer3.rememberedValue();
                        if (zChangedInstance2) {
                            objRememberedValue6 = new M5(context3, mutableState4, i8);
                            composer3.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new M5(context3, mutableState4, i8);
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceGroup();
                        c(vVar6, viewModel, str5, aVar15, (a) objRememberedValue6, composer3, ((i11 << 3) & 112) | 3072);
                    }
                    composer3.endReplaceGroup();
                    if (((String) mutableState5.getValue()) != null) {
                        long jColor5 = ColorKt.Color(4280163870L);
                        Modifier modifierM220borderxT4_qwU8 = BorderKt.m220borderxT4_qwU(Modifier.Companion, Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(28)));
                        composer3.startReplaceGroup(-2078835598);
                        objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = new O6(22, mutableState5);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceGroup();
                        AndroidAlertDialog_androidKt.m1471AlertDialogOix01E0((a) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1682559956, r15, new C2579mb(viewModel, context3, mutableState5), composer3, 54), modifierM220borderxT4_qwU8, ComposableLambdaKt.rememberComposableLambda(1826409450, r15, new C2780z5(r15, mutableState5), composer3, 54), null, AbstractC2649r2.g, AbstractC2649r2.f15477h, null, jColor5, 0L, 0L, 0L, 0.0f, null, composer3, 102435894, 0, 16016);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion4;
                }
                r15 = 1;
                mutableState4 = mutableState12;
                mutableState5 = mutableState19;
                context3 = context2;
                mutableState6 = mutableState2;
                composer3.endNode();
                composer3.startReplaceGroup(-2078851235);
                if (((Boolean) mutableState4.getValue()).booleanValue()) {
                    v vVar7 = (v) mutableState6.getValue();
                    String str6 = (String) mutableState3.getValue();
                    composer3.startReplaceGroup(-2078845788);
                    objRememberedValue5 = composer3.rememberedValue();
                    companion3 = Composer.Companion;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = new O6(23, mutableState4);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    a aVar16 = (a) objRememberedValue5;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-2078843966);
                    zChangedInstance2 = composer3.changedInstance(context3);
                    objRememberedValue6 = composer3.rememberedValue();
                    if (zChangedInstance2) {
                        objRememberedValue6 = new M5(context3, mutableState4, i8);
                        composer3.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new M5(context3, mutableState4, i8);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    composer3.endReplaceGroup();
                    c(vVar7, viewModel, str6, aVar16, (a) objRememberedValue6, composer3, ((i11 << 3) & 112) | 3072);
                }
                composer3.endReplaceGroup();
                if (((String) mutableState5.getValue()) != null) {
                    long jColor6 = ColorKt.Color(4280163870L);
                    Modifier modifierM220borderxT4_qwU9 = BorderKt.m220borderxT4_qwU(Modifier.Companion, Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(28)));
                    composer3.startReplaceGroup(-2078835598);
                    objRememberedValue4 = composer3.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new O6(22, mutableState5);
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    AndroidAlertDialog_androidKt.m1471AlertDialogOix01E0((a) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1682559956, r15, new C2579mb(viewModel, context3, mutableState5), composer3, 54), modifierM220borderxT4_qwU9, ComposableLambdaKt.rememberComposableLambda(1826409450, r15, new C2780z5(r15, mutableState5), composer3, 54), null, AbstractC2649r2.g, AbstractC2649r2.f15477h, null, jColor6, 0L, 0L, 0L, 0.0f, null, composer3, 102435894, 0, 16016);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion4;
            } else {
                composer2 = composerStartRestartGroup;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG10);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier17, companion7.getSetModifier());
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            Modifier modifierClip4 = ClipKt.clip(SizeKt.m713size3ABfNKs(r22, Dp.m6403constructorimpl(42)), RoundedCornerShapeKt.getCircleShape());
            companion = Color.Companion;
            f6 = 1;
            Composer composer7 = composer2;
            i7 = 16;
            context2 = context6;
            mutableState2 = mutableState13;
            mutableState3 = mutableState;
            IconButtonKt.IconButton(onBack, BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(modifierClip4, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), false, null, null, AbstractC2649r2.f15472a, composer7, ((i11 >> 3) & 14) | 196608, 28);
            Modifier modifierWeight$default4 = RowScope.weight$default(rowScopeInstance4, companion4, 1.0f, false, 2, null);
            composer3 = composer7;
            MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer3, 0);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap115 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default4);
            constructor2 = companion7.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
            eVarG = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy11, composerM3407constructorimpl2, currentCompositionLocalMap115);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier115, companion7.getSetModifier());
            MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            TextStyle labelSmall4 = materialTheme4.getTypography(composer3, i15).getLabelSmall();
            companion2 = FontWeight.Companion;
            FontWeight black4 = companion2.getBlack();
            long sp4 = TextUnitKt.getSp(i6);
            j5 = p107y3.a.f15980c;
            TextKt.m2432Text4IGK_g("DELIVERY DESTINATIONS", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall4.spanStyle.m5841getColor0d7_KjU() : j5, (16645977 & 2) != 0 ? labelSmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall4.spanStyle.getFontWeight() : black4, (16645977 & 8) != 0 ? labelSmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : sp4, (16645977 & Fields.RotationX) != 0 ? labelSmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall4.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall4.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
            b.m(i6, companion4, composer3, 6);
            TextStyle headlineSmall4 = materialTheme4.getTypography(composer3, i15).getHeadlineSmall();
            TextKt.m2432Text4IGK_g("My Addresses", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineSmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineSmall4.spanStyle.m5841getColor0d7_KjU() : companion.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineSmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineSmall4.spanStyle.getFontWeight() : companion2.getExtraBold(), (16645977 & 8) != 0 ? headlineSmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineSmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineSmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineSmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineSmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineSmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineSmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineSmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineSmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineSmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineSmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineSmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineSmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineSmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineSmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineSmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineSmall4.platformStyle : null, (16645977 & 1048576) != 0 ? headlineSmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineSmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineSmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineSmall4.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
            TextStyle bodySmall4 = materialTheme4.getTypography(composer3, i15).getBodySmall();
            TextKt.m2432Text4IGK_g("Manage your delivery destinations for faster checkout.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : p107y3.a.q, (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composer3, 6, 0, 65534);
            composer3.endNode();
            composer3.endNode();
            composer3.startReplaceGroup(-222025527);
            if (((List) stateCollectAsState.getValue()).size() < 5) {
                ButtonDefaults buttonDefaults4 = ButtonDefaults.INSTANCE;
                long j9 = p107y3.a.f15978a;
                ButtonColors buttonColorsM1520buttonColorsro_MJ811 = buttonDefaults4.m1520buttonColorsro_MJ88(j9, 0L, Color.m3926copywmQWz5c$default(j9, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), 0L, composer3, (ButtonDefaults.$stable << 12) | 390, 10);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8));
                Modifier modifierM699height3ABfNKs4 = SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m6403constructorimpl(54));
                PaddingValues paddingValuesM661PaddingValues0680j_7 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                composer3.startReplaceGroup(-222024341);
                zChanged3 = composer3.changed(zBooleanValue) | composer3.changedInstance(context2);
                objRememberedValue7 = composer3.rememberedValue();
                if (zChanged3) {
                    objRememberedValue7 = new K4(1, context2, mutableState2, mutableState12, zBooleanValue);
                    composer3.updateRememberedValue(objRememberedValue7);
                } else {
                    objRememberedValue7 = new K4(1, context2, mutableState2, mutableState12, zBooleanValue);
                    composer3.updateRememberedValue(objRememberedValue7);
                }
                composer3.endReplaceGroup();
                context2 = context2;
                ButtonKt.Button((a) objRememberedValue7, modifierM699height3ABfNKs4, zBooleanValue, roundedCornerShapeM955RoundedCornerShape0680j_7, buttonColorsM1520buttonColorsro_MJ811, null, null, paddingValuesM661PaddingValues0680j_7, null, ComposableLambdaKt.rememberComposableLambda(1884563555, true, new C2515ib(zBooleanValue), composer3, 54), composer3, 817889328, 352);
                b.m(20, companion4, composer3, 6);
            } else {
                companion = companion;
            }
            composer3.endReplaceGroup();
            p097w3.j.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(444165629, true, new C2563lb(mutableState11, mutableState3, mutableState16, aVar2, aVar4, mutableState14, mutableState17, mutableState15), composer3, 54), composer3, 196614, 30);
            f7 = 20;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f7)), composer3, 6);
            composer3.startReplaceGroup(-221654985);
            if (((List) stateCollectAsState.getValue()).size() >= 5) {
                i8 = 14;
                Modifier modifierM668padding3ABfNKs4 = PaddingKt.m668padding3ABfNKs(b.e(f8, b.f(f8, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(ColorKt.Color(4282090230L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(14));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs4);
                constructor7 = companion7.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor7);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                eVarG6 = p035i0.a.g(companion7, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl7, currentCompositionLocalMap116);
                if (composerM3407constructorimpl7.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                } else {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier116, companion7.getSetModifier());
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(10)), companion6.getCenterVertically(), composer3, 54);
                currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composer3, companion4);
                constructor8 = companion7.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor8);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                eVarG7 = p035i0.a.g(companion7, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl8, currentCompositionLocalMap117);
                if (composerM3407constructorimpl8.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                } else {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                }
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier117, companion7.getSetModifier());
                IconKt.m1877Iconww6aTOc(ShieldKt.getShield(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(f8)), ColorKt.Color(4284524026L), composer3, 3504, 0);
                TextKt.m2432Text4IGK_g("You've reached the maximum limit of 5 addresses. Delete an existing one to add a new destination.", (Modifier) null, ColorKt.Color(4287874557L), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3462, 6, 130034);
                b.r(composer3, f7, companion4, composer3, 6);
            } else {
                i8 = 14;
            }
            composer3.endReplaceGroup();
            if (((Boolean) mutableState18.getValue()).booleanValue()) {
                composer3.startReplaceGroup(1719882769);
                Modifier modifierM670paddingVpY3zN4$default4 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(40), 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default4);
                constructor6 = companion7.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor6);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                eVarG5 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl6, currentCompositionLocalMap118);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier118, companion7.getSetModifier());
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(null, j5, 0.0f, 0L, 0, composer3, 48, 29);
                composer3.endNode();
                composer3.endReplaceGroup();
            } else {
                if (((List) stateCollectAsState.getValue()).isEmpty()) {
                    composer3.startReplaceGroup(1720254211);
                    Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(b.e(f9, b.f(f9, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(48));
                    MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5)), companion6.getCenterHorizontally(), composer3, 54);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap119 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN7);
                    constructor4 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                    eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy12, composerM3407constructorimpl4, currentCompositionLocalMap119);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier119, companion7.getSetModifier());
                    Modifier modifierM220borderxT4_qwU10 = BorderKt.m220borderxT4_qwU(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(64)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap1110 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composer3, modifierM220borderxT4_qwU10);
                    constructor5 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                    eVarG4 = p035i0.a.g(companion7, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl5, currentCompositionLocalMap1110);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1110, companion7.getSetModifier());
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    IconKt.m1877Iconww6aTOc(PlaceKt.getPlace(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion4, Dp.m6403constructorimpl(32)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                    composer3.endNode();
                    TextKt.m2432Text4IGK_g("No addresses saved yet", (Modifier) null, companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, companion2.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                    TextKt.m2432Text4IGK_g("Add your first shipping address to start ordering your custom notes.", SizeKt.m718width3ABfNKs(companion4, Dp.m6403constructorimpl(260)), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 0, 130544);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(1721977625);
                    z3 = true;
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f8)), companion6.getStart(), composer3, 6);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap1111 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default4);
                    constructor3 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                    eVarG2 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy13, composerM3407constructorimpl3, currentCompositionLocalMap1111);
                    if (composerM3407constructorimpl3.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    p035i0.a.w(companion7, composerM3407constructorimpl3, modifierMaterializeModifier1111, composer3, -839933835);
                    while (r0.hasNext()) {
                        composer3.startReplaceGroup(1425585574);
                        zChanged = composer3.changed(vVar);
                        objRememberedValue = composer3.rememberedValue();
                        if (zChanged) {
                            mutableState7 = mutableState12;
                            mutableState8 = mutableState2;
                            i9 = 6;
                            objRememberedValue = new C2306q(vVar, mutableState8, mutableState7, i9);
                            composer3.updateRememberedValue(objRememberedValue);
                        } else {
                            mutableState7 = mutableState12;
                            mutableState8 = mutableState2;
                            i9 = 6;
                            objRememberedValue = new C2306q(vVar, mutableState8, mutableState7, i9);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        a aVar17 = (a) objRememberedValue;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1425590694);
                        zChanged2 = composer3.changed(vVar);
                        objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged2) {
                            mutableState9 = mutableState19;
                            objRememberedValue2 = new C2290i(i7, vVar, mutableState9);
                            composer3.updateRememberedValue(objRememberedValue2);
                        } else {
                            mutableState9 = mutableState19;
                            objRememberedValue2 = new C2290i(i7, vVar, mutableState9);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        a aVar18 = (a) objRememberedValue2;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1425595405);
                        context4 = context2;
                        zChangedInstance = composer3.changedInstance(viewModel) | composer3.changed(vVar) | composer3.changedInstance(context4);
                        objRememberedValue3 = composer3.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue3 = new C2306q(viewModel, vVar, context4, 7);
                            composer3.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new C2306q(viewModel, vVar, context4, 7);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceGroup();
                        a(vVar, aVar17, aVar18, (a) objRememberedValue3, composer3, 0);
                        mutableState12 = mutableState7;
                        mutableState2 = mutableState8;
                        mutableState19 = mutableState9;
                        context2 = context4;
                        z3 = true;
                        i7 = 16;
                    }
                    mutableState4 = mutableState12;
                    r15 = z3;
                    mutableState5 = mutableState19;
                    context3 = context2;
                    mutableState6 = mutableState2;
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.endReplaceGroup();
                }
                composer3.endNode();
                composer3.startReplaceGroup(-2078851235);
                if (((Boolean) mutableState4.getValue()).booleanValue()) {
                    v vVar8 = (v) mutableState6.getValue();
                    String str7 = (String) mutableState3.getValue();
                    composer3.startReplaceGroup(-2078845788);
                    objRememberedValue5 = composer3.rememberedValue();
                    companion3 = Composer.Companion;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = new O6(23, mutableState4);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    a aVar19 = (a) objRememberedValue5;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-2078843966);
                    zChangedInstance2 = composer3.changedInstance(context3);
                    objRememberedValue6 = composer3.rememberedValue();
                    if (zChangedInstance2) {
                        objRememberedValue6 = new M5(context3, mutableState4, i8);
                        composer3.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new M5(context3, mutableState4, i8);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    composer3.endReplaceGroup();
                    c(vVar8, viewModel, str7, aVar19, (a) objRememberedValue6, composer3, ((i11 << 3) & 112) | 3072);
                }
                composer3.endReplaceGroup();
                if (((String) mutableState5.getValue()) != null) {
                    long jColor7 = ColorKt.Color(4280163870L);
                    Modifier modifierM220borderxT4_qwU11 = BorderKt.m220borderxT4_qwU(Modifier.Companion, Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(28)));
                    composer3.startReplaceGroup(-2078835598);
                    objRememberedValue4 = composer3.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new O6(22, mutableState5);
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    AndroidAlertDialog_androidKt.m1471AlertDialogOix01E0((a) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1682559956, r15, new C2579mb(viewModel, context3, mutableState5), composer3, 54), modifierM220borderxT4_qwU11, ComposableLambdaKt.rememberComposableLambda(1826409450, r15, new C2780z5(r15, mutableState5), composer3, 54), null, AbstractC2649r2.g, AbstractC2649r2.f15477h, null, jColor7, 0L, 0L, 0L, 0.0f, null, composer3, 102435894, 0, 16016);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion4;
            }
            r15 = 1;
            mutableState4 = mutableState12;
            mutableState5 = mutableState19;
            context3 = context2;
            mutableState6 = mutableState2;
            composer3.endNode();
            composer3.startReplaceGroup(-2078851235);
            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                v vVar9 = (v) mutableState6.getValue();
                String str8 = (String) mutableState3.getValue();
                composer3.startReplaceGroup(-2078845788);
                objRememberedValue5 = composer3.rememberedValue();
                companion3 = Composer.Companion;
                if (objRememberedValue5 == companion3.getEmpty()) {
                    objRememberedValue5 = new O6(23, mutableState4);
                    composer3.updateRememberedValue(objRememberedValue5);
                }
                a aVar110 = (a) objRememberedValue5;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-2078843966);
                zChangedInstance2 = composer3.changedInstance(context3);
                objRememberedValue6 = composer3.rememberedValue();
                if (zChangedInstance2) {
                    objRememberedValue6 = new M5(context3, mutableState4, i8);
                    composer3.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new M5(context3, mutableState4, i8);
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                composer3.endReplaceGroup();
                c(vVar9, viewModel, str8, aVar110, (a) objRememberedValue6, composer3, ((i11 << 3) & 112) | 3072);
            }
            composer3.endReplaceGroup();
            if (((String) mutableState5.getValue()) != null) {
                long jColor8 = ColorKt.Color(4280163870L);
                Modifier modifierM220borderxT4_qwU12 = BorderKt.m220borderxT4_qwU(Modifier.Companion, Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(28)));
                composer3.startReplaceGroup(-2078835598);
                objRememberedValue4 = composer3.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new O6(22, mutableState5);
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                composer3.endReplaceGroup();
                AndroidAlertDialog_androidKt.m1471AlertDialogOix01E0((a) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1682559956, r15, new C2579mb(viewModel, context3, mutableState5), composer3, 54), modifierM220borderxT4_qwU12, ComposableLambdaKt.rememberComposableLambda(1826409450, r15, new C2780z5(r15, mutableState5), composer3, 54), null, AbstractC2649r2.g, AbstractC2649r2.f15477h, null, jColor8, 0L, 0L, 0L, 0.0f, null, composer3, 102435894, 0, 16016);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Xa(viewModel, onBack, modifier2, i5, 0));
        }
    }

    public static final void e(MutableState mutableState, boolean z3) {
        mutableState.setValue(Boolean.valueOf(z3));
    }
}

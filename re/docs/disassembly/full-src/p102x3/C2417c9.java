package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import O3.g;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CheckKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
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
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.notescrafter.PrintOrderViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import p076s.b;
import p087u3.f;
import p087u3.l;
import p087u3.n;

/* JADX INFO: renamed from: x3.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2417c9 extends p implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14878o;
    public final /* synthetic */ List p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f14879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f14880s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2417c9(c cVar, MutableState mutableState, MutableState mutableState2, List list) {
        super(4);
        this.f14878o = 2;
        this.p = list;
        this.q = mutableState;
        this.f14880s = cVar;
        this.f14879r = mutableState2;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:165:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:171:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:175:0x044a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0456  */
    /* JADX WARN: Code duplicated, block: B:179:0x045a  */
    /* JADX WARN: Code duplicated, block: B:182:0x046b  */
    /* JADX WARN: Code duplicated, block: B:185:0x047c  */
    /* JADX WARN: Code duplicated, block: B:189:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:191:0x055a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0566  */
    /* JADX WARN: Code duplicated, block: B:195:0x056a  */
    /* JADX WARN: Code duplicated, block: B:198:0x057b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0589  */
    /* JADX WARN: Code duplicated, block: B:204:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:207:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:208:0x0601  */
    /* JADX WARN: Code duplicated, block: B:211:0x0612  */
    /* JADX WARN: Code duplicated, block: B:213:0x0620  */
    /* JADX WARN: Code duplicated, block: B:216:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:218:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:224:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:226:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:229:0x0769  */
    /* JADX WARN: Code duplicated, block: B:232:0x0775  */
    /* JADX WARN: Code duplicated, block: B:233:0x0779  */
    /* JADX WARN: Code duplicated, block: B:236:0x078a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0798  */
    /* JADX WARN: Code duplicated, block: B:241:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:242:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:245:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:247:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:253:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:255:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:258:0x0844  */
    /* JADX WARN: Code duplicated, block: B:259:0x0846  */
    /* JADX WARN: Code duplicated, block: B:262:0x0880  */
    /* JADX WARN: Code duplicated, block: B:264:0x0886  */
    /* JADX WARN: Code duplicated, block: B:270:0x0895  */
    /* JADX WARN: Code duplicated, block: B:272:0x089d  */
    /* JADX WARN: Code duplicated, block: B:275:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:277:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:283:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:285:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:288:0x0965  */
    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        BoxScopeInstance boxScopeInstance;
        float f5;
        Arrangement arrangement;
        int i5;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        Arrangement arrangement2;
        Color.Companion companion;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        float f6;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG;
        boolean z3;
        Object objRememberedValue;
        MutableState mutableState;
        MutableState mutableState2;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG2;
        boolean z4;
        boolean z5;
        Object objRememberedValue2;
        boolean z6;
        boolean z7;
        Object objRememberedValue3;
        boolean z8;
        Object objRememberedValue4;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG3;
        o oVar = o.f154a;
        State state = this.f14879r;
        Object obj6 = this.f14880s;
        Object obj7 = this.q;
        List list = this.p;
        switch (this.f14878o) {
            case 0:
                LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i6 = (iIntValue2 & 6) == 0 ? (composer.changed(lazyGridItemScope) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i6 |= composer.changed(iIntValue) ? 32 : 16;
                }
                if ((i6 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1229287273, i6, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)");
                    }
                    D6 d6 = (D6) list.get(iIntValue);
                    composer.startReplaceGroup(1735111989);
                    boolean z9 = d6.f13862d;
                    Modifier.Companion companion2 = Modifier.Companion;
                    float f7 = 12;
                    Modifier modifierE = b.e(f7, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f7), p107y3.a.u, null, 2, null), Dp.m6403constructorimpl(1), z9 ? p107y3.a.f15978a : Color.m3926copywmQWz5c$default(p107y3.a.t, 0.4f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer.startReplaceGroup(-359655837);
                    int i7 = (i6 & 112) ^ 48;
                    boolean z10 = (i7 > 32 && composer.changed(iIntValue)) || (i6 & 48) == 32;
                    Object objRememberedValue5 = composer.rememberedValue();
                    MutableState mutableState3 = (MutableState) obj7;
                    if (z10 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new J8(iIntValue, 3, mutableState3);
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (a) objRememberedValue5, 7, null);
                    Alignment.Companion companion3 = Alignment.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    a constructor6 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor6);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
                    e eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap);
                    if (!composerM3407constructorimpl6.getInserting()) {
                        obj5 = obj6;
                        if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier, companion4.getSetModifier());
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                        f5 = 6;
                        Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5));
                        arrangement = Arrangement.INSTANCE;
                        i5 = i6;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
                        constructor = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
                        e eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap2);
                        if (!composerM3407constructorimpl.getInserting()) {
                            arrangement2 = arrangement;
                            if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            Modifier modifierG = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(100)), 8);
                            companion = Color.Companion;
                            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierG, companion.m3964getWhite0d7_KjU(), null, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default);
                            constructor2 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                            e eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap3);
                            if (!composerM3407constructorimpl2.getInserting()) {
                                f6 = f7;
                                if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion4.getSetModifier());
                                Matrix matrix = new Matrix();
                                matrix.postRotate(d6.f13861c);
                                Bitmap bitmap = d6.e;
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                kotlin.jvm.internal.o.e(bitmapCreateBitmap, "createBitmap(...)");
                                int i8 = iIntValue + 1;
                                ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap), AbstractC1421mz.h(i8, "Page "), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 24960, 232);
                                composer.startReplaceGroup(-1005118439);
                                if (z9) {
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                    long j5 = p107y3.a.f15978a;
                                    BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m3926copywmQWz5c$default(j5, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                                    Modifier modifierAlign = boxScopeInstance.align(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(18)), RoundedCornerShapeKt.getCircleShape()), j5, null, 2, null), companion3.getTopEnd());
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierAlign);
                                    constructor5 = companion4.getConstructor();
                                    if (composer.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor5);
                                    } else {
                                        composer.useNode();
                                    }
                                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                                    eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap4);
                                    if (composerM3407constructorimpl5.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier4, companion4.getSetModifier());
                                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                                    composer.endNode();
                                }
                                composer.endReplaceGroup();
                                composer.endNode();
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composer, 6);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                                constructor3 = companion4.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor3);
                                } else {
                                    composer.useNode();
                                }
                                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap5);
                                if (composerM3407constructorimpl3.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier5, companion4.getSetModifier());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                String strH = AbstractC1421mz.h(i8, "Page ");
                                TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                                TextKt.m2432Text4IGK_g(strH, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                                composer.startReplaceGroup(-1005026210);
                                z3 = (i7 <= 32 && composer.changed(iIntValue)) || (i5 & 48) == 32;
                                objRememberedValue = composer.rememberedValue();
                                mutableState = (MutableState) state;
                                mutableState2 = (MutableState) obj5;
                                if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                                    objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                float f8 = 24;
                                IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f8)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13835i, composer, 196608, 28);
                                composer.endNode();
                                b.m(4, companion2, composer, 6);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getTop(), composer, 6);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                                constructor4 = companion4.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor4);
                                } else {
                                    composer.useNode();
                                }
                                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                                eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap6);
                                if (composerM3407constructorimpl4.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier6, companion4.getSetModifier());
                                if (iIntValue > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f8)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                                composer.startReplaceGroup(-1004977026);
                                z5 = (i7 <= 32 && composer.changed(iIntValue)) || (i5 & 48) == 32;
                                objRememberedValue2 = composer.rememberedValue();
                                if (z5 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                    objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default2, z4, null, null, ComposableLambdaKt.rememberComposableLambda(1554426265, true, new Z8(iIntValue), composer, 54), composer, 196608, 24);
                                if (iIntValue < ((List) mutableState3.getValue()).size() - 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f8)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                                composer.startReplaceGroup(-1004940608);
                                z7 = (i7 <= 32 && composer.changed(iIntValue)) || (i5 & 48) == 32;
                                objRememberedValue3 = composer.rememberedValue();
                                if (z7 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                    objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                IconButtonKt.IconButton((a) objRememberedValue3, modifierM207backgroundbw27NRU$default3, z6, null, null, ComposableLambdaKt.rememberComposableLambda(146798658, true, new C2385a9(iIntValue, mutableState3), composer, 54), composer, 196608, 24);
                                composer.startReplaceGroup(-1004902978);
                                z8 = (i7 <= 32 && composer.changed(iIntValue)) || (i5 & 48) == 32;
                                objRememberedValue4 = composer.rememberedValue();
                                if (z8 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                    objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                composer.endReplaceGroup();
                                IconButtonKt.IconButton((a) objRememberedValue4, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f8)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13836j, composer, 196608, 28);
                                composer.endNode();
                                composer.endNode();
                                composer.endNode();
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                f6 = f7;
                            }
                            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG6);
                            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion4.getSetModifier());
                            Matrix matrix2 = new Matrix();
                            matrix2.postRotate(d6.f13861c);
                            Bitmap bitmap2 = d6.e;
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix2, true);
                            kotlin.jvm.internal.o.e(bitmapCreateBitmap2, "createBitmap(...)");
                            int i9 = iIntValue + 1;
                            ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap2), AbstractC1421mz.h(i9, "Page "), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 24960, 232);
                            composer.startReplaceGroup(-1005118439);
                            if (z9) {
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                long j6 = p107y3.a.f15978a;
                                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default2, Color.m3926copywmQWz5c$default(j6, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                                Modifier modifierAlign2 = boxScopeInstance.align(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(18)), RoundedCornerShapeKt.getCircleShape()), j6, null, 2, null), companion3.getTopEnd());
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierAlign2);
                                constructor5 = companion4.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor5);
                                } else {
                                    composer.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl5, currentCompositionLocalMap7);
                                if (composerM3407constructorimpl5.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier7, companion4.getSetModifier());
                                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                                composer.endNode();
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composer, 6);
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
                            constructor3 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                            eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap8);
                            if (composerM3407constructorimpl3.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier8, companion4.getSetModifier());
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            String strH2 = AbstractC1421mz.h(i9, "Page ");
                            TextStyle bodySmall2 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                            TextKt.m2432Text4IGK_g(strH2, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                            composer.startReplaceGroup(-1005026210);
                            if (i7 <= 32) {
                            }
                            objRememberedValue = composer.rememberedValue();
                            mutableState = (MutableState) state;
                            mutableState2 = (MutableState) obj5;
                            if (z3) {
                                objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                                composer.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            float f9 = 24;
                            IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f9)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13835i, composer, 196608, 28);
                            composer.endNode();
                            b.m(4, companion2, composer, 6);
                            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getTop(), composer, 6);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default4);
                            constructor4 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor4);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                            eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap9);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier9, companion4.getSetModifier());
                            if (iIntValue > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f9)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            composer.startReplaceGroup(-1004977026);
                            if (i7 <= 32) {
                            }
                            objRememberedValue2 = composer.rememberedValue();
                            if (z5) {
                                objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                                composer.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default4, z4, null, null, ComposableLambdaKt.rememberComposableLambda(1554426265, true, new Z8(iIntValue), composer, 54), composer, 196608, 24);
                            if (iIntValue < ((List) mutableState3.getValue()).size() - 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            Modifier modifierM207backgroundbw27NRU$default5 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f9)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            composer.startReplaceGroup(-1004940608);
                            if (i7 <= 32) {
                            }
                            objRememberedValue3 = composer.rememberedValue();
                            if (z7) {
                                objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                                composer.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue3, modifierM207backgroundbw27NRU$default5, z6, null, null, ComposableLambdaKt.rememberComposableLambda(146798658, true, new C2385a9(iIntValue, mutableState3), composer, 54), composer, 196608, 24);
                            composer.startReplaceGroup(-1004902978);
                            if (i7 <= 32) {
                            }
                            objRememberedValue4 = composer.rememberedValue();
                            if (z8) {
                                objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                                composer.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue4, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f9)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13836j, composer, 196608, 28);
                            composer.endNode();
                            composer.endNode();
                            composer.endNode();
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            arrangement2 = arrangement;
                        }
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG5);
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        Modifier modifierG2 = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(100)), 8);
                        companion = Color.Companion;
                        Modifier modifierM207backgroundbw27NRU$default6 = BackgroundKt.m207backgroundbw27NRU$default(modifierG2, companion.m3964getWhite0d7_KjU(), null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default6);
                        constructor2 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                        e eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap10);
                        if (!composerM3407constructorimpl2.getInserting()) {
                            f6 = f7;
                            if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier10, companion4.getSetModifier());
                            Matrix matrix3 = new Matrix();
                            matrix3.postRotate(d6.f13861c);
                            Bitmap bitmap3 = d6.e;
                            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), bitmap3.getHeight(), matrix3, true);
                            kotlin.jvm.internal.o.e(bitmapCreateBitmap3, "createBitmap(...)");
                            int i10 = iIntValue + 1;
                            ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap3), AbstractC1421mz.h(i10, "Page "), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 24960, 232);
                            composer.startReplaceGroup(-1005118439);
                            if (z9) {
                                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                long j7 = p107y3.a.f15978a;
                                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default3, Color.m3926copywmQWz5c$default(j7, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                                Modifier modifierAlign3 = boxScopeInstance.align(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(18)), RoundedCornerShapeKt.getCircleShape()), j7, null, 2, null), companion3.getTopEnd());
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierAlign3);
                                constructor5 = companion4.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor5);
                                } else {
                                    composer.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl5, currentCompositionLocalMap11);
                                if (composerM3407constructorimpl5.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11, companion4.getSetModifier());
                                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                                composer.endNode();
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composer, 6);
                            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default5);
                            constructor3 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                            eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap12);
                            if (composerM3407constructorimpl3.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier12, companion4.getSetModifier());
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            String strH3 = AbstractC1421mz.h(i10, "Page ");
                            TextStyle bodySmall3 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                            TextKt.m2432Text4IGK_g(strH3, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                            composer.startReplaceGroup(-1005026210);
                            if (i7 <= 32) {
                            }
                            objRememberedValue = composer.rememberedValue();
                            mutableState = (MutableState) state;
                            mutableState2 = (MutableState) obj5;
                            if (z3) {
                                objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                                composer.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            float f10 = 24;
                            IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f10)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13835i, composer, 196608, 28);
                            composer.endNode();
                            b.m(4, companion2, composer, 6);
                            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getTop(), composer, 6);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default6);
                            constructor4 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor4);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                            eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap13);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier13, companion4.getSetModifier());
                            if (iIntValue > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            Modifier modifierM207backgroundbw27NRU$default7 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f10)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            composer.startReplaceGroup(-1004977026);
                            if (i7 <= 32) {
                            }
                            objRememberedValue2 = composer.rememberedValue();
                            if (z5) {
                                objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                                composer.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default7, z4, null, null, ComposableLambdaKt.rememberComposableLambda(1554426265, true, new Z8(iIntValue), composer, 54), composer, 196608, 24);
                            if (iIntValue < ((List) mutableState3.getValue()).size() - 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            Modifier modifierM207backgroundbw27NRU$default8 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f10)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            composer.startReplaceGroup(-1004940608);
                            if (i7 <= 32) {
                            }
                            objRememberedValue3 = composer.rememberedValue();
                            if (z7) {
                                objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                                composer.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue3, modifierM207backgroundbw27NRU$default8, z6, null, null, ComposableLambdaKt.rememberComposableLambda(146798658, true, new C2385a9(iIntValue, mutableState3), composer, 54), composer, 196608, 24);
                            composer.startReplaceGroup(-1004902978);
                            if (i7 <= 32) {
                            }
                            objRememberedValue4 = composer.rememberedValue();
                            if (z8) {
                                objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                                composer.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue4, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f10)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13836j, composer, 196608, 28);
                            composer.endNode();
                            composer.endNode();
                            composer.endNode();
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            f6 = f7;
                        }
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG7);
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier10, companion4.getSetModifier());
                        Matrix matrix4 = new Matrix();
                        matrix4.postRotate(d6.f13861c);
                        Bitmap bitmap4 = d6.e;
                        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmap4, 0, 0, bitmap4.getWidth(), bitmap4.getHeight(), matrix4, true);
                        kotlin.jvm.internal.o.e(bitmapCreateBitmap4, "createBitmap(...)");
                        int i11 = iIntValue + 1;
                        ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap4), AbstractC1421mz.h(i11, "Page "), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 24960, 232);
                        composer.startReplaceGroup(-1005118439);
                        if (z9) {
                            Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                            long j8 = p107y3.a.f15978a;
                            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default4, Color.m3926copywmQWz5c$default(j8, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                            Modifier modifierAlign4 = boxScopeInstance.align(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(18)), RoundedCornerShapeKt.getCircleShape()), j8, null, 2, null), companion3.getTopEnd());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap14 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer, modifierAlign4);
                            constructor5 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor5);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                            eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl5, currentCompositionLocalMap14);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier14, companion4.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                            composer.endNode();
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composer, 6);
                        Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap15 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default7);
                        constructor3 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                        eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl3, currentCompositionLocalMap15);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier15, companion4.getSetModifier());
                        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                        String strH4 = AbstractC1421mz.h(i11, "Page ");
                        TextStyle bodySmall4 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                        TextKt.m2432Text4IGK_g(strH4, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                        composer.startReplaceGroup(-1005026210);
                        if (i7 <= 32) {
                        }
                        objRememberedValue = composer.rememberedValue();
                        mutableState = (MutableState) state;
                        mutableState2 = (MutableState) obj5;
                        if (z3) {
                            objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        float f11 = 24;
                        IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f11)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13835i, composer, 196608, 28);
                        composer.endNode();
                        b.m(4, companion2, composer, 6);
                        Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getTop(), composer, 6);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default8);
                        constructor4 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor4);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl4, currentCompositionLocalMap16);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier16, companion4.getSetModifier());
                        if (iIntValue > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Modifier modifierM207backgroundbw27NRU$default9 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f11)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer.startReplaceGroup(-1004977026);
                        if (i7 <= 32) {
                        }
                        objRememberedValue2 = composer.rememberedValue();
                        if (z5) {
                            objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                            composer.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default9, z4, null, null, ComposableLambdaKt.rememberComposableLambda(1554426265, true, new Z8(iIntValue), composer, 54), composer, 196608, 24);
                        if (iIntValue < ((List) mutableState3.getValue()).size() - 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        Modifier modifierM207backgroundbw27NRU$default10 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f11)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer.startReplaceGroup(-1004940608);
                        if (i7 <= 32) {
                        }
                        objRememberedValue3 = composer.rememberedValue();
                        if (z7) {
                            objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                            composer.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue3, modifierM207backgroundbw27NRU$default10, z6, null, null, ComposableLambdaKt.rememberComposableLambda(146798658, true, new C2385a9(iIntValue, mutableState3), composer, 54), composer, 196608, 24);
                        composer.startReplaceGroup(-1004902978);
                        if (i7 <= 32) {
                        }
                        objRememberedValue4 = composer.rememberedValue();
                        if (z8) {
                            objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                            composer.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue4, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f11)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13836j, composer, 196608, 28);
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        obj5 = obj6;
                    }
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier, companion4.getSetModifier());
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                    f5 = 6;
                    Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5));
                    arrangement = Arrangement.INSTANCE;
                    i5 = i6;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer, 48);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap17 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs2);
                    constructor = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
                    e eVarG8 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap17);
                    if (!composerM3407constructorimpl.getInserting()) {
                        arrangement2 = arrangement;
                        if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier17, companion4.getSetModifier());
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        Modifier modifierG3 = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(100)), 8);
                        companion = Color.Companion;
                        Modifier modifierM207backgroundbw27NRU$default11 = BackgroundKt.m207backgroundbw27NRU$default(modifierG3, companion.m3964getWhite0d7_KjU(), null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap18 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default11);
                        constructor2 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                        e eVarG9 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl2, currentCompositionLocalMap18);
                        if (!composerM3407constructorimpl2.getInserting()) {
                            f6 = f7;
                            if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier18, companion4.getSetModifier());
                            Matrix matrix5 = new Matrix();
                            matrix5.postRotate(d6.f13861c);
                            Bitmap bitmap5 = d6.e;
                            Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(bitmap5, 0, 0, bitmap5.getWidth(), bitmap5.getHeight(), matrix5, true);
                            kotlin.jvm.internal.o.e(bitmapCreateBitmap5, "createBitmap(...)");
                            int i12 = iIntValue + 1;
                            ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap5), AbstractC1421mz.h(i12, "Page "), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 24960, 232);
                            composer.startReplaceGroup(-1005118439);
                            if (z9) {
                                Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                long j9 = p107y3.a.f15978a;
                                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default5, Color.m3926copywmQWz5c$default(j9, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                                Modifier modifierAlign5 = boxScopeInstance.align(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(18)), RoundedCornerShapeKt.getCircleShape()), j9, null, 2, null), companion3.getTopEnd());
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap19 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer, modifierAlign5);
                                constructor5 = companion4.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor5);
                                } else {
                                    composer.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                                eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl5, currentCompositionLocalMap19);
                                if (composerM3407constructorimpl5.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier19, companion4.getSetModifier());
                                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                                composer.endNode();
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composer, 6);
                            Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap110 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default9);
                            constructor3 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                            eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl3, currentCompositionLocalMap110);
                            if (composerM3407constructorimpl3.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier110, companion4.getSetModifier());
                            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                            String strH5 = AbstractC1421mz.h(i12, "Page ");
                            TextStyle bodySmall5 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                            TextKt.m2432Text4IGK_g(strH5, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall5.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall5.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall5.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall5.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall5.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                            composer.startReplaceGroup(-1005026210);
                            if (i7 <= 32) {
                            }
                            objRememberedValue = composer.rememberedValue();
                            mutableState = (MutableState) state;
                            mutableState2 = (MutableState) obj5;
                            if (z3) {
                                objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                                composer.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            float f12 = 24;
                            IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f12)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13835i, composer, 196608, 28);
                            composer.endNode();
                            b.m(4, companion2, composer, 6);
                            Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getTop(), composer, 6);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap111 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default10);
                            constructor4 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor4);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                            eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy10, composerM3407constructorimpl4, currentCompositionLocalMap111);
                            if (composerM3407constructorimpl4.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111, companion4.getSetModifier());
                            if (iIntValue > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            Modifier modifierM207backgroundbw27NRU$default12 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f12)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            composer.startReplaceGroup(-1004977026);
                            if (i7 <= 32) {
                            }
                            objRememberedValue2 = composer.rememberedValue();
                            if (z5) {
                                objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                                composer.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default12, z4, null, null, ComposableLambdaKt.rememberComposableLambda(1554426265, true, new Z8(iIntValue), composer, 54), composer, 196608, 24);
                            if (iIntValue < ((List) mutableState3.getValue()).size() - 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            Modifier modifierM207backgroundbw27NRU$default13 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f12)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            composer.startReplaceGroup(-1004940608);
                            if (i7 <= 32) {
                            }
                            objRememberedValue3 = composer.rememberedValue();
                            if (z7) {
                                objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                                composer.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue3, modifierM207backgroundbw27NRU$default13, z6, null, null, ComposableLambdaKt.rememberComposableLambda(146798658, true, new C2385a9(iIntValue, mutableState3), composer, 54), composer, 196608, 24);
                            composer.startReplaceGroup(-1004902978);
                            if (i7 <= 32) {
                            }
                            objRememberedValue4 = composer.rememberedValue();
                            if (z8) {
                                objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                                composer.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            IconButtonKt.IconButton((a) objRememberedValue4, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f12)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13836j, composer, 196608, 28);
                            composer.endNode();
                            composer.endNode();
                            composer.endNode();
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            f6 = f7;
                        }
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG9);
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier18, companion4.getSetModifier());
                        Matrix matrix6 = new Matrix();
                        matrix6.postRotate(d6.f13861c);
                        Bitmap bitmap6 = d6.e;
                        Bitmap bitmapCreateBitmap6 = Bitmap.createBitmap(bitmap6, 0, 0, bitmap6.getWidth(), bitmap6.getHeight(), matrix6, true);
                        kotlin.jvm.internal.o.e(bitmapCreateBitmap6, "createBitmap(...)");
                        int i13 = iIntValue + 1;
                        ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap6), AbstractC1421mz.h(i13, "Page "), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 24960, 232);
                        composer.startReplaceGroup(-1005118439);
                        if (z9) {
                            Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                            long j10 = p107y3.a.f15978a;
                            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default6, Color.m3926copywmQWz5c$default(j10, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                            Modifier modifierAlign6 = boxScopeInstance.align(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(18)), RoundedCornerShapeKt.getCircleShape()), j10, null, 2, null), companion3.getTopEnd());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap112 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composer, modifierAlign6);
                            constructor5 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor5);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                            eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl5, currentCompositionLocalMap112);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier112, companion4.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                            composer.endNode();
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composer, 6);
                        Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap113 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default11);
                        constructor3 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                        eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy11, composerM3407constructorimpl3, currentCompositionLocalMap113);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier113, companion4.getSetModifier());
                        RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                        String strH6 = AbstractC1421mz.h(i13, "Page ");
                        TextStyle bodySmall6 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                        TextKt.m2432Text4IGK_g(strH6, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall6.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall6.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall6.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall6.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall6.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                        composer.startReplaceGroup(-1005026210);
                        if (i7 <= 32) {
                        }
                        objRememberedValue = composer.rememberedValue();
                        mutableState = (MutableState) state;
                        mutableState2 = (MutableState) obj5;
                        if (z3) {
                            objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        float f13 = 24;
                        IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f13)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13835i, composer, 196608, 28);
                        composer.endNode();
                        b.m(4, companion2, composer, 6);
                        Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getTop(), composer, 6);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap114 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default12);
                        constructor4 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor4);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy12, composerM3407constructorimpl4, currentCompositionLocalMap114);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier114, companion4.getSetModifier());
                        if (iIntValue > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Modifier modifierM207backgroundbw27NRU$default14 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f13)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer.startReplaceGroup(-1004977026);
                        if (i7 <= 32) {
                        }
                        objRememberedValue2 = composer.rememberedValue();
                        if (z5) {
                            objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                            composer.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default14, z4, null, null, ComposableLambdaKt.rememberComposableLambda(1554426265, true, new Z8(iIntValue), composer, 54), composer, 196608, 24);
                        if (iIntValue < ((List) mutableState3.getValue()).size() - 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        Modifier modifierM207backgroundbw27NRU$default15 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f13)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer.startReplaceGroup(-1004940608);
                        if (i7 <= 32) {
                        }
                        objRememberedValue3 = composer.rememberedValue();
                        if (z7) {
                            objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                            composer.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue3, modifierM207backgroundbw27NRU$default15, z6, null, null, ComposableLambdaKt.rememberComposableLambda(146798658, true, new C2385a9(iIntValue, mutableState3), composer, 54), composer, 196608, 24);
                        composer.startReplaceGroup(-1004902978);
                        if (i7 <= 32) {
                        }
                        objRememberedValue4 = composer.rememberedValue();
                        if (z8) {
                            objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                            composer.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue4, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f13)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13836j, composer, 196608, 28);
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        arrangement2 = arrangement;
                    }
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG8);
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier17, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierG4 = b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(100)), 8);
                    companion = Color.Companion;
                    Modifier modifierM207backgroundbw27NRU$default16 = BackgroundKt.m207backgroundbw27NRU$default(modifierG4, companion.m3964getWhite0d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composer, modifierM207backgroundbw27NRU$default16);
                    constructor2 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                    e eVarG10 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl2, currentCompositionLocalMap115);
                    if (!composerM3407constructorimpl2.getInserting()) {
                        f6 = f7;
                        if (!kotlin.jvm.internal.o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier115, companion4.getSetModifier());
                        Matrix matrix7 = new Matrix();
                        matrix7.postRotate(d6.f13861c);
                        Bitmap bitmap7 = d6.e;
                        Bitmap bitmapCreateBitmap7 = Bitmap.createBitmap(bitmap7, 0, 0, bitmap7.getWidth(), bitmap7.getHeight(), matrix7, true);
                        kotlin.jvm.internal.o.e(bitmapCreateBitmap7, "createBitmap(...)");
                        int i14 = iIntValue + 1;
                        ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap7), AbstractC1421mz.h(i14, "Page "), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 24960, 232);
                        composer.startReplaceGroup(-1005118439);
                        if (z9) {
                            Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                            long j11 = p107y3.a.f15978a;
                            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default7, Color.m3926copywmQWz5c$default(j11, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                            Modifier modifierAlign7 = boxScopeInstance.align(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(18)), RoundedCornerShapeKt.getCircleShape()), j11, null, 2, null), companion3.getTopEnd());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap116 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composer, modifierAlign7);
                            constructor5 = companion4.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor5);
                            } else {
                                composer.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                            eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl5, currentCompositionLocalMap116);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier116, companion4.getSetModifier());
                            IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                            composer.endNode();
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composer, 6);
                        Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap117 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default13);
                        constructor3 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                        eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy13, composerM3407constructorimpl3, currentCompositionLocalMap117);
                        if (composerM3407constructorimpl3.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier117, companion4.getSetModifier());
                        RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                        String strH7 = AbstractC1421mz.h(i14, "Page ");
                        TextStyle bodySmall7 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                        TextKt.m2432Text4IGK_g(strH7, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall7.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall7.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall7.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall7.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall7.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall7.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                        composer.startReplaceGroup(-1005026210);
                        if (i7 <= 32) {
                        }
                        objRememberedValue = composer.rememberedValue();
                        mutableState = (MutableState) state;
                        mutableState2 = (MutableState) obj5;
                        if (z3) {
                            objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        float f14 = 24;
                        IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f14)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13835i, composer, 196608, 28);
                        composer.endNode();
                        b.m(4, companion2, composer, 6);
                        Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getTop(), composer, 6);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap118 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default14);
                        constructor4 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor4);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                        eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy14, composerM3407constructorimpl4, currentCompositionLocalMap118);
                        if (composerM3407constructorimpl4.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier118, companion4.getSetModifier());
                        if (iIntValue > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Modifier modifierM207backgroundbw27NRU$default17 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f14)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer.startReplaceGroup(-1004977026);
                        if (i7 <= 32) {
                        }
                        objRememberedValue2 = composer.rememberedValue();
                        if (z5) {
                            objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                            composer.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default17, z4, null, null, ComposableLambdaKt.rememberComposableLambda(1554426265, true, new Z8(iIntValue), composer, 54), composer, 196608, 24);
                        if (iIntValue < ((List) mutableState3.getValue()).size() - 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        Modifier modifierM207backgroundbw27NRU$default18 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f14)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        composer.startReplaceGroup(-1004940608);
                        if (i7 <= 32) {
                        }
                        objRememberedValue3 = composer.rememberedValue();
                        if (z7) {
                            objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                            composer.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue3, modifierM207backgroundbw27NRU$default18, z6, null, null, ComposableLambdaKt.rememberComposableLambda(146798658, true, new C2385a9(iIntValue, mutableState3), composer, 54), composer, 196608, 24);
                        composer.startReplaceGroup(-1004902978);
                        if (i7 <= 32) {
                        }
                        objRememberedValue4 = composer.rememberedValue();
                        if (z8) {
                            objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                            composer.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        IconButtonKt.IconButton((a) objRememberedValue4, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f14)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13836j, composer, 196608, 28);
                        composer.endNode();
                        composer.endNode();
                        composer.endNode();
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        f6 = f7;
                    }
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG10);
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier115, companion4.getSetModifier());
                    Matrix matrix8 = new Matrix();
                    matrix8.postRotate(d6.f13861c);
                    Bitmap bitmap8 = d6.e;
                    Bitmap bitmapCreateBitmap8 = Bitmap.createBitmap(bitmap8, 0, 0, bitmap8.getWidth(), bitmap8.getHeight(), matrix8, true);
                    kotlin.jvm.internal.o.e(bitmapCreateBitmap8, "createBitmap(...)");
                    int i15 = iIntValue + 1;
                    ImageKt.m266Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap8), AbstractC1421mz.h(i15, "Page "), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.Companion.getFit(), 0.0f, null, 0, composer, 24960, 232);
                    composer.startReplaceGroup(-1005118439);
                    if (z9) {
                        Modifier modifierFillMaxSize$default8 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        long j12 = p107y3.a.f15978a;
                        BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default8, Color.m3926copywmQWz5c$default(j12, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
                        Modifier modifierAlign8 = boxScopeInstance.align(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m668padding3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), Dp.m6403constructorimpl(18)), RoundedCornerShapeKt.getCircleShape()), j12, null, 2, null), companion3.getTopEnd());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy13 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap119 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composer, modifierAlign8);
                        constructor5 = companion4.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor5);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
                        eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy13, composerM3407constructorimpl5, currentCompositionLocalMap119);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier119, companion4.getSetModifier());
                        IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), companion.m3964getWhite0d7_KjU(), composer, 3504, 0);
                        composer.endNode();
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f5)), composer, 6);
                    Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap1110 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default15);
                    constructor3 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy15, composerM3407constructorimpl3, currentCompositionLocalMap1110);
                    if (composerM3407constructorimpl3.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier1110, companion4.getSetModifier());
                    RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                    String strH8 = AbstractC1421mz.h(i15, "Page ");
                    TextStyle bodySmall8 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall();
                    TextKt.m2432Text4IGK_g(strH8, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall8.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall8.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall8.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? bodySmall8.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodySmall8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall8.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall8.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall8.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
                    composer.startReplaceGroup(-1005026210);
                    if (i7 <= 32) {
                    }
                    objRememberedValue = composer.rememberedValue();
                    mutableState = (MutableState) state;
                    mutableState2 = (MutableState) obj5;
                    if (z3) {
                        objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    float f15 = 24;
                    IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f15)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13835i, composer, 196608, 28);
                    composer.endNode();
                    b.m(4, companion2, composer, 6);
                    Modifier modifierFillMaxWidth$default16 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy16 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion3.getTop(), composer, 6);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap1111 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default16);
                    constructor4 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
                    eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy16, composerM3407constructorimpl4, currentCompositionLocalMap1111);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1111, companion4.getSetModifier());
                    if (iIntValue > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifierM207backgroundbw27NRU$default19 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f15)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer.startReplaceGroup(-1004977026);
                    if (i7 <= 32) {
                    }
                    objRememberedValue2 = composer.rememberedValue();
                    if (z5) {
                        objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                        composer.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 1);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    IconButtonKt.IconButton((a) objRememberedValue2, modifierM207backgroundbw27NRU$default19, z4, null, null, ComposableLambdaKt.rememberComposableLambda(1554426265, true, new Z8(iIntValue), composer, 54), composer, 196608, 24);
                    if (iIntValue < ((List) mutableState3.getValue()).size() - 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    Modifier modifierM207backgroundbw27NRU$default110 = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f15)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    composer.startReplaceGroup(-1004940608);
                    if (i7 <= 32) {
                    }
                    objRememberedValue3 = composer.rememberedValue();
                    if (z7) {
                        objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                        composer.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 2);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    IconButtonKt.IconButton((a) objRememberedValue3, modifierM207backgroundbw27NRU$default110, z6, null, null, ComposableLambdaKt.rememberComposableLambda(146798658, true, new C2385a9(iIntValue, mutableState3), composer, 54), composer, 196608, 24);
                    composer.startReplaceGroup(-1004902978);
                    if (i7 <= 32) {
                    }
                    objRememberedValue4 = composer.rememberedValue();
                    if (z8) {
                        objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                        composer.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Y8(iIntValue, mutableState3, mutableState, mutableState2, 3);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    IconButtonKt.IconButton((a) objRememberedValue4, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f15)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, C1.f13836j, composer, 196608, 28);
                    composer.endNode();
                    composer.endNode();
                    composer.endNode();
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i16 = (6 & iIntValue4) == 0 ? iIntValue4 | (composer2.changed(lazyItemScope) ? 4 : 2) : iIntValue4;
                if ((48 & iIntValue4) == 0) {
                    i16 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if ((i16 & 147) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i16, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    n nVar = (n) list.get(iIntValue3);
                    composer2.startReplaceGroup(507115102);
                    List list2 = AbstractC2452ec.f14975a;
                    l lVar = (l) ((Map) state.getValue()).get(nVar.getId());
                    boolean zB = kotlin.jvm.internal.o.b(((Map) ((State) obj6).getValue()).get(nVar.getId()), Boolean.TRUE);
                    composer2.startReplaceGroup(1540387394);
                    PrintOrderViewModel printOrderViewModel = (PrintOrderViewModel) obj7;
                    boolean zChangedInstance = composer2.changedInstance(printOrderViewModel) | composer2.changedInstance(nVar);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new n4.l(3, printOrderViewModel, nVar);
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    composer2.endReplaceGroup();
                    AbstractC2452ec.a(nVar, lVar, zB, (a) objRememberedValue6, composer2, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                LazyItemScope lazyItemScope2 = (LazyItemScope) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i17 = (iIntValue6 & 6) == 0 ? iIntValue6 | (composer3.changed(lazyItemScope2) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i17 |= composer3.changed(iIntValue5) ? 32 : 16;
                }
                if ((i17 & 147) == 146 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                    }
                    f fVar = (f) list.get(iIntValue5);
                    composer3.startReplaceGroup(-1617199119);
                    int i18 = iIntValue5 + 1;
                    boolean z11 = iIntValue5 == 0;
                    MutableState mutableState4 = (MutableState) obj7;
                    boolean z12 = iIntValue5 == ((List) mutableState4.getValue()).size() - 1;
                    composer3.startReplaceGroup(-467803050);
                    int i19 = (i17 & 112) ^ 48;
                    c cVar = (c) obj6;
                    boolean zChanged = ((i19 > 32 && composer3.changed(iIntValue5)) || (i17 & 48) == 32) | composer3.changed(mutableState4) | composer3.changed(cVar);
                    Object objRememberedValue7 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new Zd(iIntValue5, cVar, mutableState4, 0);
                        composer3.updateRememberedValue(objRememberedValue7);
                    }
                    a aVar = (a) objRememberedValue7;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-467789652);
                    boolean zChanged2 = composer3.changed(mutableState4) | ((i19 > 32 && composer3.changed(iIntValue5)) || (i17 & 48) == 32) | composer3.changed(cVar);
                    Object objRememberedValue8 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new Zd(iIntValue5, cVar, mutableState4, 1);
                        composer3.updateRememberedValue(objRememberedValue8);
                    }
                    a aVar2 = (a) objRememberedValue8;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-467776010);
                    boolean zChangedInstance2 = composer3.changedInstance(fVar);
                    Object objRememberedValue9 = composer3.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                        objRememberedValue9 = new n4.l(6, fVar, (MutableState) state);
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    composer3.endReplaceGroup();
                    AbstractC2406be.b(fVar, i18, z11, z12, aVar, aVar2, (a) objRememberedValue9, Modifier.Companion, composer3, 12582912);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2417c9(List list, Object obj, State state, State state2, int i5) {
        super(4);
        this.f14878o = i5;
        this.p = list;
        this.q = obj;
        this.f14879r = state;
        this.f14880s = state2;
    }
}

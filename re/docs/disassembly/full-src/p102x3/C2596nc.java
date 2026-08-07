package p102x3;

import B3.h;
import C3.v;
import N0.C0135c;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import W3.j;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VerifiedKt;
import androidx.compose.material.icons.outlined.CorporateFareKt;
import androidx.compose.material.icons.outlined.HomeKt;
import androidx.compose.material.icons.outlined.LocalPostOfficeKt;
import androidx.compose.material.icons.outlined.LocationOnKt;
import androidx.compose.material.icons.outlined.MapKt;
import androidx.compose.material.icons.outlined.PersonKt;
import androidx.compose.material.icons.outlined.PlaceKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.o;
import o4.l;
import p076s.b;
import p083t3.C2306q;
import p087u3.i;
import p087u3.q;

/* JADX INFO: renamed from: x3.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2596nc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f15357o;
    public final /* synthetic */ c p;
    public final /* synthetic */ a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f15358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f15359s;
    public final /* synthetic */ a t;
    public final /* synthetic */ Context u;

    public C2596nc(q qVar, c cVar, a aVar, boolean z3, boolean z4, a aVar2, Context context) {
        this.f15357o = qVar;
        this.p = cVar;
        this.q = aVar;
        this.f15358r = z3;
        this.f15359s = z4;
        this.t = aVar2;
        this.u = context;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0619  */
    /* JADX WARN: Code duplicated, block: B:105:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:108:0x0701  */
    /* JADX WARN: Code duplicated, block: B:110:0x0709  */
    /* JADX WARN: Code duplicated, block: B:113:0x074e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0756  */
    /* JADX WARN: Code duplicated, block: B:118:0x079b  */
    /* JADX WARN: Code duplicated, block: B:120:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:123:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:125:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:128:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:130:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:133:0x090a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0912  */
    /* JADX WARN: Code duplicated, block: B:138:0x0950  */
    /* JADX WARN: Code duplicated, block: B:141:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:145:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:154:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:156:0x0ad7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:160:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:161:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:164:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:174:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:175:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:178:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:180:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:183:0x0bc6  */
    /* JADX WARN: Code duplicated, block: B:185:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:188:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:190:0x0bdc  */
    /* JADX WARN: Code duplicated, block: B:194:0x0c52  */
    /* JADX WARN: Code duplicated, block: B:197:0x0c5e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:201:0x0c73  */
    /* JADX WARN: Code duplicated, block: B:203:0x0c81  */
    /* JADX WARN: Code duplicated, block: B:206:0x0d3a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0d46  */
    /* JADX WARN: Code duplicated, block: B:210:0x0d4a  */
    /* JADX WARN: Code duplicated, block: B:213:0x0d5d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0d6b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0e3d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0e45  */
    /* JADX WARN: Code duplicated, block: B:223:0x0e99  */
    /* JADX WARN: Code duplicated, block: B:73:0x043e  */
    /* JADX WARN: Code duplicated, block: B:76:0x044a  */
    /* JADX WARN: Code duplicated, block: B:77:0x044e  */
    /* JADX WARN: Code duplicated, block: B:80:0x045f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0470  */
    /* JADX WARN: Code duplicated, block: B:87:0x0521  */
    /* JADX WARN: Code duplicated, block: B:90:0x05be  */
    /* JADX WARN: Code duplicated, block: B:92:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:96:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0608  */
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
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Arrangement arrangement;
        Arrangement arrangement2;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        float f5;
        float f6;
        String phone;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zChanged3;
        Object objRememberedValue3;
        boolean zChanged4;
        Object objRememberedValue4;
        boolean zChanged5;
        Object objRememberedValue5;
        boolean zChanged6;
        Object objRememberedValue6;
        Object objRememberedValue7;
        float f7;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG3;
        boolean z3;
        a aVar;
        Context context;
        boolean zChangedInstance;
        Object objRememberedValue8;
        i iVar;
        boolean z4;
        long jM3962getTransparent0d7_KjU;
        boolean zChanged7;
        Object objRememberedValue9;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG4;
        long jG;
        FontWeight.Companion companion2;
        FontWeight normal;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-34919285, iIntValue, -1, "com.notescrafter.ui.screens.AddressBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:4567)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleLarge = materialTheme.getTypography(composer, i5).getTitleLarge();
            Color.Companion companion3 = Color.Companion;
            long jM3964getWhite0d7_KjU = companion3.m3964getWhite0d7_KjU();
            FontWeight.Companion companion4 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("Shipping Address", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleLarge.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleLarge.spanStyle.m5841getColor0d7_KjU() : jM3964getWhite0d7_KjU, (16645977 & 2) != 0 ? titleLarge.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleLarge.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? titleLarge.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleLarge.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleLarge.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleLarge.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleLarge.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleLarge.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleLarge.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleLarge.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleLarge.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleLarge.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleLarge.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleLarge.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleLarge.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleLarge.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleLarge.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleLarge.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleLarge.platformStyle : null, (16645977 & 1048576) != 0 ? titleLarge.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleLarge.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleLarge.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleLarge.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            Modifier.Companion companion5 = Modifier.Companion;
            float f8 = 24;
            b.m(f8, companion5, composer, 6);
            Arrangement arrangement3 = Arrangement.INSTANCE;
            float f9 = 12;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f9));
            Alignment.Companion companion6 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion6.getTop(), composer, 6);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion5);
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            a constructor7 = companion7.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer);
            e eVarG5 = p035i0.a.g(companion7, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy, composerM3407constructorimpl7, currentCompositionLocalMap);
            if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier, companion7.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance2, companion5, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion6.getStart(), composer, 0);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            a constructor8 = companion7.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor8);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer);
            e eVarG6 = p035i0.a.g(companion7, composerM3407constructorimpl8, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl8, currentCompositionLocalMap2);
            if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier2, companion7.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            final q qVar = this.f15357o;
            String firstName = qVar.getFirstName();
            composer.startReplaceGroup(839659425);
            final c cVar = this.p;
            boolean zChanged8 = composer.changed(cVar) | composer.changed(qVar);
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChanged8 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                final int i6 = 0;
                objRememberedValue10 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i6) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            c cVar2 = (c) objRememberedValue10;
            composer.endReplaceGroup();
            Icons.Outlined outlined = Icons.Outlined.INSTANCE;
            Gd.m("First Name", firstName, cVar2, false, 0, PersonKt.getPerson(outlined), composer, 6, 24);
            composer.endNode();
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance2, companion5, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion6.getStart(), composer, 0);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default2);
            a constructor9 = companion7.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor9);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer);
            e eVarG7 = p035i0.a.g(companion7, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl9, currentCompositionLocalMap3);
            if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG7);
            }
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier3, companion7.getSetModifier());
            String lastName = qVar.getLastName();
            composer.startReplaceGroup(839673952);
            boolean zChanged9 = composer.changed(cVar) | composer.changed(qVar);
            Object objRememberedValue11 = composer.rememberedValue();
            if (zChanged9 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                final int i7 = 1;
                objRememberedValue11 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i7) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue11);
            }
            composer.endReplaceGroup();
            Gd.m("Last Name", lastName, (c) objRememberedValue11, false, 0, PersonKt.getPerson(outlined), composer, 6, 24);
            composer.endNode();
            composer.endNode();
            float f10 = 16;
            b.m(f10, companion5, composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
            float f11 = 6;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f11)), companion6.getStart(), composer, 6);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            a constructor10 = companion7.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor10);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer);
            e eVarG8 = p035i0.a.g(companion7, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl10, currentCompositionLocalMap4);
            if (composerM3407constructorimpl10.getInserting()) {
                arrangement = arrangement3;
            } else {
                arrangement = arrangement3;
                if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier4, companion7.getSetModifier());
                TextStyle labelSmall = materialTheme.getTypography(composer, i5).getLabelSmall();
                arrangement2 = arrangement;
                TextKt.m2432Text4IGK_g("PRIMARY CONTACT NUMBER", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                float f12 = 52;
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m6403constructorimpl(f12)), f9), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                float f13 = 1;
                Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(b.e(f9, modifierM207backgroundbw27NRU$default, Dp.m6403constructorimpl(f13), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f10), 0.0f, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
                constructor = companion7.getConstructor();
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
                e eVarG9 = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl, currentCompositionLocalMap5);
                if (composerM3407constructorimpl.getInserting()) {
                    f5 = f9;
                } else {
                    f5 = f9;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion7.getSetModifier());
                    TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
                    TextKt.m2432Text4IGK_g("+91", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                    f6 = 8;
                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion5, Dp.m6403constructorimpl(f6)), composer, 6);
                    phone = qVar.getPhone();
                    if (j.m0(phone)) {
                        phone = "No verified number";
                    }
                    TextStyle bodyMedium2 = materialTheme.getTypography(composer, i5).getBodyMedium();
                    TextKt.m2432Text4IGK_g(phone, RowScope.weight$default(rowScopeInstance2, companion5, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium2.spanStyle.m5841getColor0d7_KjU() : companion3.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium2.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodyMedium2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? bodyMedium2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium2.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium2.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65532);
                    composer.startReplaceGroup(839754220);
                    if (j.m0(qVar.getPhone())) {
                        rowScopeInstance = rowScopeInstance2;
                        companion = companion5;
                    } else {
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer, 48);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, companion5);
                        constructor6 = companion7.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor6);
                        } else {
                            composer.useNode();
                        }
                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
                        e eVarG10 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl6, currentCompositionLocalMap6);
                        if (composerM3407constructorimpl6.getInserting()) {
                            rowScopeInstance = rowScopeInstance2;
                        } else {
                            rowScopeInstance = rowScopeInstance2;
                            if (!o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion7.getSetModifier());
                            IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(14)), p107y3.a.a(), composer, 3504, 0);
                            companion = companion5;
                            androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
                            TextStyle labelSmall2 = materialTheme.getTypography(composer, i5).getLabelSmall();
                            TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                            composer.endNode();
                        }
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG10);
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion7.getSetModifier());
                        IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(14)), p107y3.a.a(), composer, 3504, 0);
                        companion = companion5;
                        androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
                        TextStyle labelSmall3 = materialTheme.getTypography(composer, i5).getLabelSmall();
                        TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                        composer.endNode();
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                    String flatHouse = qVar.getFlatHouse();
                    composer.startReplaceGroup(-727118045);
                    zChanged = composer.changed(cVar) | composer.changed(qVar);
                    objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        final int i8 = 2;
                        objRememberedValue = new c() { // from class: x3.lc
                            @Override // O3.c
                            public final Object invoke(Object obj4) {
                                switch (i8) {
                                    case 0:
                                        String it = (String) obj4;
                                        o.f(it, "it");
                                        q qVar2 = qVar;
                                        cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                        break;
                                    case 1:
                                        String it2 = (String) obj4;
                                        o.f(it2, "it");
                                        q qVar3 = qVar;
                                        cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                        break;
                                    case 2:
                                        String it3 = (String) obj4;
                                        o.f(it3, "it");
                                        q qVar4 = qVar;
                                        cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                        break;
                                    case 3:
                                        String it4 = (String) obj4;
                                        o.f(it4, "it");
                                        q qVar5 = qVar;
                                        cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                        break;
                                    case 4:
                                        String it5 = (String) obj4;
                                        o.f(it5, "it");
                                        q qVar6 = qVar;
                                        cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                        break;
                                    case 5:
                                        String it6 = (String) obj4;
                                        o.f(it6, "it");
                                        String strF0 = j.F0(6, it6);
                                        q qVar7 = qVar;
                                        cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                        break;
                                    case 6:
                                        String it7 = (String) obj4;
                                        o.f(it7, "it");
                                        q qVar8 = qVar;
                                        cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                        break;
                                    default:
                                        String it8 = (String) obj4;
                                        o.f(it8, "it");
                                        q qVar9 = qVar;
                                        cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Gd.m("Flat / House / Building", flatHouse, (c) objRememberedValue, false, 0, HomeKt.getHome(outlined), composer, 6, 24);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                    String areaStreet = qVar.getAreaStreet();
                    composer.startReplaceGroup(-727105212);
                    zChanged2 = composer.changed(cVar) | composer.changed(qVar);
                    objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        final int i9 = 3;
                        objRememberedValue2 = new c() { // from class: x3.lc
                            @Override // O3.c
                            public final Object invoke(Object obj4) {
                                switch (i9) {
                                    case 0:
                                        String it = (String) obj4;
                                        o.f(it, "it");
                                        q qVar2 = qVar;
                                        cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                        break;
                                    case 1:
                                        String it2 = (String) obj4;
                                        o.f(it2, "it");
                                        q qVar3 = qVar;
                                        cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                        break;
                                    case 2:
                                        String it3 = (String) obj4;
                                        o.f(it3, "it");
                                        q qVar4 = qVar;
                                        cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                        break;
                                    case 3:
                                        String it4 = (String) obj4;
                                        o.f(it4, "it");
                                        q qVar5 = qVar;
                                        cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                        break;
                                    case 4:
                                        String it5 = (String) obj4;
                                        o.f(it5, "it");
                                        q qVar6 = qVar;
                                        cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                        break;
                                    case 5:
                                        String it6 = (String) obj4;
                                        o.f(it6, "it");
                                        String strF0 = j.F0(6, it6);
                                        q qVar7 = qVar;
                                        cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                        break;
                                    case 6:
                                        String it7 = (String) obj4;
                                        o.f(it7, "it");
                                        q qVar8 = qVar;
                                        cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                        break;
                                    default:
                                        String it8 = (String) obj4;
                                        o.f(it8, "it");
                                        q qVar9 = qVar;
                                        cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    Gd.m("Area / Sector / Locality / Street", areaStreet, (c) objRememberedValue2, false, 0, PlaceKt.getPlace(outlined), composer, 6, 24);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                    String landmark = qVar.getLandmark();
                    composer.startReplaceGroup(-727093182);
                    zChanged3 = composer.changed(cVar) | composer.changed(qVar);
                    objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        final int i10 = 4;
                        objRememberedValue3 = new c() { // from class: x3.lc
                            @Override // O3.c
                            public final Object invoke(Object obj4) {
                                switch (i10) {
                                    case 0:
                                        String it = (String) obj4;
                                        o.f(it, "it");
                                        q qVar2 = qVar;
                                        cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                        break;
                                    case 1:
                                        String it2 = (String) obj4;
                                        o.f(it2, "it");
                                        q qVar3 = qVar;
                                        cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                        break;
                                    case 2:
                                        String it3 = (String) obj4;
                                        o.f(it3, "it");
                                        q qVar4 = qVar;
                                        cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                        break;
                                    case 3:
                                        String it4 = (String) obj4;
                                        o.f(it4, "it");
                                        q qVar5 = qVar;
                                        cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                        break;
                                    case 4:
                                        String it5 = (String) obj4;
                                        o.f(it5, "it");
                                        q qVar6 = qVar;
                                        cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                        break;
                                    case 5:
                                        String it6 = (String) obj4;
                                        o.f(it6, "it");
                                        String strF0 = j.F0(6, it6);
                                        q qVar7 = qVar;
                                        cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                        break;
                                    case 6:
                                        String it7 = (String) obj4;
                                        o.f(it7, "it");
                                        q qVar8 = qVar;
                                        cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                        break;
                                    default:
                                        String it8 = (String) obj4;
                                        o.f(it8, "it");
                                        q qVar9 = qVar;
                                        cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    Gd.m("Landmark", landmark, (c) objRememberedValue3, false, 0, LocationOnKt.getLocationOn(outlined), composer, 6, 24);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                    String postalCode = qVar.getPostalCode();
                    composer.startReplaceGroup(-727080340);
                    zChanged4 = composer.changed(cVar) | composer.changed(qVar);
                    objRememberedValue4 = composer.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        final int i11 = 5;
                        objRememberedValue4 = new c() { // from class: x3.lc
                            @Override // O3.c
                            public final Object invoke(Object obj4) {
                                switch (i11) {
                                    case 0:
                                        String it = (String) obj4;
                                        o.f(it, "it");
                                        q qVar2 = qVar;
                                        cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                        break;
                                    case 1:
                                        String it2 = (String) obj4;
                                        o.f(it2, "it");
                                        q qVar3 = qVar;
                                        cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                        break;
                                    case 2:
                                        String it3 = (String) obj4;
                                        o.f(it3, "it");
                                        q qVar4 = qVar;
                                        cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                        break;
                                    case 3:
                                        String it4 = (String) obj4;
                                        o.f(it4, "it");
                                        q qVar5 = qVar;
                                        cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                        break;
                                    case 4:
                                        String it5 = (String) obj4;
                                        o.f(it5, "it");
                                        q qVar6 = qVar;
                                        cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                        break;
                                    case 5:
                                        String it6 = (String) obj4;
                                        o.f(it6, "it");
                                        String strF0 = j.F0(6, it6);
                                        q qVar7 = qVar;
                                        cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                        break;
                                    case 6:
                                        String it7 = (String) obj4;
                                        o.f(it7, "it");
                                        q qVar8 = qVar;
                                        cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                        break;
                                    default:
                                        String it8 = (String) obj4;
                                        o.f(it8, "it");
                                        q qVar9 = qVar;
                                        cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    Gd.m("Pincode", postalCode, (c) objRememberedValue4, false, KeyboardType.Companion.m6125getNumberPjHm6EE(), LocalPostOfficeKt.getLocalPostOffice(outlined), composer, 24582, 8);
                    b.m(f11, companion, composer, 6);
                    TextStyle labelSmall4 = materialTheme.getTypography(composer, i5).getLabelSmall();
                    TextKt.m2432Text4IGK_g("City and state will auto-fill from pincode.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall4.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? labelSmall4.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall4.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall4.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                    String city = qVar.getCity();
                    composer.startReplaceGroup(-727052610);
                    zChanged5 = composer.changed(cVar) | composer.changed(qVar);
                    objRememberedValue5 = composer.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        final int i12 = 6;
                        objRememberedValue5 = new c() { // from class: x3.lc
                            @Override // O3.c
                            public final Object invoke(Object obj4) {
                                switch (i12) {
                                    case 0:
                                        String it = (String) obj4;
                                        o.f(it, "it");
                                        q qVar2 = qVar;
                                        cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                        break;
                                    case 1:
                                        String it2 = (String) obj4;
                                        o.f(it2, "it");
                                        q qVar3 = qVar;
                                        cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                        break;
                                    case 2:
                                        String it3 = (String) obj4;
                                        o.f(it3, "it");
                                        q qVar4 = qVar;
                                        cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                        break;
                                    case 3:
                                        String it4 = (String) obj4;
                                        o.f(it4, "it");
                                        q qVar5 = qVar;
                                        cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                        break;
                                    case 4:
                                        String it5 = (String) obj4;
                                        o.f(it5, "it");
                                        q qVar6 = qVar;
                                        cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                        break;
                                    case 5:
                                        String it6 = (String) obj4;
                                        o.f(it6, "it");
                                        String strF0 = j.F0(6, it6);
                                        q qVar7 = qVar;
                                        cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                        break;
                                    case 6:
                                        String it7 = (String) obj4;
                                        o.f(it7, "it");
                                        q qVar8 = qVar;
                                        cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                        break;
                                    default:
                                        String it8 = (String) obj4;
                                        o.f(it8, "it");
                                        q qVar9 = qVar;
                                        cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    composer.endReplaceGroup();
                    Gd.m("City", city, (c) objRememberedValue5, false, 0, CorporateFareKt.getCorporateFare(outlined), composer, 6, 24);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                    String state = qVar.getState();
                    composer.startReplaceGroup(-727040705);
                    zChanged6 = composer.changed(cVar) | composer.changed(qVar);
                    objRememberedValue6 = composer.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        final int i13 = 7;
                        objRememberedValue6 = new c() { // from class: x3.lc
                            @Override // O3.c
                            public final Object invoke(Object obj4) {
                                switch (i13) {
                                    case 0:
                                        String it = (String) obj4;
                                        o.f(it, "it");
                                        q qVar2 = qVar;
                                        cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                        break;
                                    case 1:
                                        String it2 = (String) obj4;
                                        o.f(it2, "it");
                                        q qVar3 = qVar;
                                        cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                        break;
                                    case 2:
                                        String it3 = (String) obj4;
                                        o.f(it3, "it");
                                        q qVar4 = qVar;
                                        cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                        break;
                                    case 3:
                                        String it4 = (String) obj4;
                                        o.f(it4, "it");
                                        q qVar5 = qVar;
                                        cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                        break;
                                    case 4:
                                        String it5 = (String) obj4;
                                        o.f(it5, "it");
                                        q qVar6 = qVar;
                                        cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                        break;
                                    case 5:
                                        String it6 = (String) obj4;
                                        o.f(it6, "it");
                                        String strF0 = j.F0(6, it6);
                                        q qVar7 = qVar;
                                        cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                        break;
                                    case 6:
                                        String it7 = (String) obj4;
                                        o.f(it7, "it");
                                        q qVar8 = qVar;
                                        cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                        break;
                                    default:
                                        String it8 = (String) obj4;
                                        o.f(it8, "it");
                                        q qVar9 = qVar;
                                        cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    composer.endReplaceGroup();
                    Gd.m("State", state, (c) objRememberedValue6, false, 0, MapKt.getMap(outlined), composer, 6, 24);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                    composer.startReplaceGroup(-727029430);
                    objRememberedValue7 = composer.rememberedValue();
                    if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new C0135c(14);
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    composer.endReplaceGroup();
                    Gd.m("Country", "India", (c) objRememberedValue7, true, 0, MapKt.getMap(outlined), composer, 3510, 16);
                    b.m(f8, companion, composer, 6);
                    TextStyle labelSmall5 = materialTheme.getTypography(composer, i5).getLabelSmall();
                    TextKt.m2432Text4IGK_g("ADDRESS TYPE", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall5.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall5.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall5.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall5.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall5.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall5.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                    b.m(f6, companion, composer, 6);
                    f7 = 0.0f;
                    float f14 = f5;
                    float f15 = 4;
                    Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(b.e(f14, b.f(f14, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f13), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f15));
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f15)), companion6.getTop(), composer, 6);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
                    constructor2 = companion7.getConstructor();
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
                    eVarG = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    p035i0.a.w(companion7, composerM3407constructorimpl2, modifierMaterializeModifier7, composer, -1048339924);
                    for (h hVar : v.S(l.t(i.HOME, "Home"), l.t(i.WORK, "Work"), l.t(i.TEMPORARY, "Temporary"))) {
                        iVar = (i) hVar.a();
                        String str = (String) hVar.b();
                        if (qVar.getAddressType() == iVar) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Modifier modifierG = b.g(RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), f6);
                        if (z4) {
                            jM3962getTransparent0d7_KjU = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                        }
                        Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(modifierG, jM3962getTransparent0d7_KjU, null, 2, null);
                        composer.startReplaceGroup(839938437);
                        zChanged7 = composer.changed(cVar) | composer.changed(qVar) | composer.changed(iVar);
                        objRememberedValue9 = composer.rememberedValue();
                        if (zChanged7 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                            objRememberedValue9 = new C2306q(cVar, qVar, iVar, 9);
                            composer.updateRememberedValue(objRememberedValue9);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default2, false, null, null, (a) objRememberedValue9, 7, null), f7, Dp.m6403constructorimpl(10), 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default2);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                        constructor5 = companion8.getConstructor();
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
                        eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap8);
                        if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier8, companion8.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z4) {
                            jG = p107y3.a.d();
                        } else {
                            jG = p107y3.a.g();
                        }
                        long j5 = jG;
                        companion2 = FontWeight.Companion;
                        if (z4) {
                            normal = companion2.getBold();
                        } else {
                            normal = companion2.getNormal();
                        }
                        TextKt.m2432Text4IGK_g(str, (Modifier) null, j5, 0L, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 0, 0, 131034);
                        composer.endNode();
                        f7 = 0.0f;
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    Modifier.Companion companion9 = Modifier.Companion;
                    float f16 = 32;
                    b.m(f16, companion9, composer, 6);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f14));
                    Alignment.Companion companion10 = Alignment.Companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_5, companion10.getTop(), composer, 6);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.Companion;
                    constructor3 = companion11.getConstructor();
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
                    eVarG2 = p035i0.a.g(companion11, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap9);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier9, companion11.getSetModifier());
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance3, companion9, 1.0f, false, 2, null), Dp.m6403constructorimpl(r2));
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    Color.Companion companion12 = Color.Companion;
                    long jM3962getTransparent0d7_KjU2 = companion12.m3962getTransparent0d7_KjU();
                    int i14 = ButtonDefaults.$stable << 12;
                    ButtonKt.Button(this.q, modifierM699height3ABfNKs, false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14)), buttonDefaults.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU2, 0L, 0L, 0L, composer, i14 | 6, 14), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f13), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), null, null, X2.g(), composer, 806879232, 420);
                    Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance3, companion9, 1.0f, false, 2, null), Dp.m6403constructorimpl(f12));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion10.getTopStart(), false);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifierM699height3ABfNKs2);
                    constructor4 = companion11.getConstructor();
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
                    eVarG3 = p035i0.a.g(companion11, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap10);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier10, companion11.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Brush.Companion companion13 = Brush.Companion;
                    Brush brushM3876horizontalGradient8A3gB4$default = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion13, v.S(Color.m3917boximpl(p107y3.a.e()), Color.m3917boximpl(p107y3.a.c())), 0.0f, 0.0f, 0, 14, (Object) null);
                    Brush brushM3876horizontalGradient8A3gB4$default2 = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion13, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.c(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                    boolean z5 = this.f15358r;
                    boolean z6 = !z5;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion9, 0.0f, 1, null);
                    ButtonColors buttonColorsM1520buttonColorsro_MJ88 = buttonDefaults.m1520buttonColorsro_MJ88(companion12.m3962getTransparent0d7_KjU(), 0L, companion12.m3962getTransparent0d7_KjU(), 0L, composer, i14 | 390, 10);
                    PaddingValues paddingValuesM661PaddingValues0680j_4 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14));
                    composer.startReplaceGroup(839997749);
                    z3 = this.f15359s;
                    boolean zChanged10 = composer.changed(z3);
                    aVar = this.t;
                    boolean zChanged11 = zChanged10 | composer.changed(aVar) | composer.changed(qVar);
                    context = this.u;
                    zChangedInstance = zChanged11 | composer.changedInstance(context);
                    objRememberedValue8 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new K4(2, aVar, qVar, context, z3);
                        composer.updateRememberedValue(objRememberedValue8);
                    }
                    composer.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue8, modifierFillMaxSize$default, z6, roundedCornerShapeM955RoundedCornerShape0680j_4, buttonColorsM1520buttonColorsro_MJ88, null, null, paddingValuesM661PaddingValues0680j_4, null, ComposableLambdaKt.rememberComposableLambda(-927608327, true, new C2580mc(z3, z5, brushM3876horizontalGradient8A3gB4$default, brushM3876horizontalGradient8A3gB4$default2), composer, 54), composer, 817889328, 352);
                    composer.endNode();
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion9, Dp.m6403constructorimpl(f16)), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG9);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier5, companion7.getSetModifier());
                TextStyle bodyMedium3 = materialTheme.getTypography(composer, i5).getBodyMedium();
                TextKt.m2432Text4IGK_g("+91", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium3.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodyMedium3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium3.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodyMedium3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium3.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium3.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                f6 = 8;
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion5, Dp.m6403constructorimpl(f6)), composer, 6);
                phone = qVar.getPhone();
                if (j.m0(phone)) {
                    phone = "No verified number";
                }
                TextStyle bodyMedium4 = materialTheme.getTypography(composer, i5).getBodyMedium();
                TextKt.m2432Text4IGK_g(phone, RowScope.weight$default(rowScopeInstance2, companion5, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium4.spanStyle.m5841getColor0d7_KjU() : companion3.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium4.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium4.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodyMedium4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium4.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? bodyMedium4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium4.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium4.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65532);
                composer.startReplaceGroup(839754220);
                if (j.m0(qVar.getPhone())) {
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer, 48);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, companion5);
                    constructor6 = companion7.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor6);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
                    e eVarG11 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl6, currentCompositionLocalMap11);
                    if (composerM3407constructorimpl6.getInserting()) {
                        rowScopeInstance = rowScopeInstance2;
                        if (!o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11, companion7.getSetModifier());
                        IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(14)), p107y3.a.a(), composer, 3504, 0);
                        companion = companion5;
                        androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
                        TextStyle labelSmall6 = materialTheme.getTypography(composer, i5).getLabelSmall();
                        TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall6.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall6.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? labelSmall6.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall6.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall6.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall6.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall6.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                        composer.endNode();
                    } else {
                        rowScopeInstance = rowScopeInstance2;
                    }
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG11);
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11, companion7.getSetModifier());
                    IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(14)), p107y3.a.a(), composer, 3504, 0);
                    companion = companion5;
                    androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
                    TextStyle labelSmall7 = materialTheme.getTypography(composer, i5).getLabelSmall();
                    TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall7.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall7.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? labelSmall7.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall7.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall7.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall7.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall7.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                    composer.endNode();
                } else {
                    rowScopeInstance = rowScopeInstance2;
                    companion = companion5;
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String flatHouse2 = qVar.getFlatHouse();
                composer.startReplaceGroup(-727118045);
                zChanged = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue = composer.rememberedValue();
                if (zChanged) {
                    final int i15 = 2;
                    objRememberedValue = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i15) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                } else {
                    final int i16 = 2;
                    objRememberedValue = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i16) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Gd.m("Flat / House / Building", flatHouse2, (c) objRememberedValue, false, 0, HomeKt.getHome(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String areaStreet2 = qVar.getAreaStreet();
                composer.startReplaceGroup(-727105212);
                zChanged2 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue2 = composer.rememberedValue();
                if (zChanged2) {
                    final int i17 = 3;
                    objRememberedValue2 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i17) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    final int i18 = 3;
                    objRememberedValue2 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i18) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Gd.m("Area / Sector / Locality / Street", areaStreet2, (c) objRememberedValue2, false, 0, PlaceKt.getPlace(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String landmark2 = qVar.getLandmark();
                composer.startReplaceGroup(-727093182);
                zChanged3 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue3 = composer.rememberedValue();
                if (zChanged3) {
                    final int i19 = 4;
                    objRememberedValue3 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i19) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                } else {
                    final int i110 = 4;
                    objRememberedValue3 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i110) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                Gd.m("Landmark", landmark2, (c) objRememberedValue3, false, 0, LocationOnKt.getLocationOn(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String postalCode2 = qVar.getPostalCode();
                composer.startReplaceGroup(-727080340);
                zChanged4 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue4 = composer.rememberedValue();
                if (zChanged4) {
                    final int i111 = 5;
                    objRememberedValue4 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i111) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                } else {
                    final int i112 = 5;
                    objRememberedValue4 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i112) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                Gd.m("Pincode", postalCode2, (c) objRememberedValue4, false, KeyboardType.Companion.m6125getNumberPjHm6EE(), LocalPostOfficeKt.getLocalPostOffice(outlined), composer, 24582, 8);
                b.m(f11, companion, composer, 6);
                TextStyle labelSmall8 = materialTheme.getTypography(composer, i5).getLabelSmall();
                TextKt.m2432Text4IGK_g("City and state will auto-fill from pincode.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall8.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall8.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall8.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? labelSmall8.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall8.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall8.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall8.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String city2 = qVar.getCity();
                composer.startReplaceGroup(-727052610);
                zChanged5 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue5 = composer.rememberedValue();
                if (zChanged5) {
                    final int i113 = 6;
                    objRememberedValue5 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i113) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                } else {
                    final int i114 = 6;
                    objRememberedValue5 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i114) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                Gd.m("City", city2, (c) objRememberedValue5, false, 0, CorporateFareKt.getCorporateFare(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String state2 = qVar.getState();
                composer.startReplaceGroup(-727040705);
                zChanged6 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue6 = composer.rememberedValue();
                if (zChanged6) {
                    final int i115 = 7;
                    objRememberedValue6 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i115) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                } else {
                    final int i116 = 7;
                    objRememberedValue6 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i116) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                Gd.m("State", state2, (c) objRememberedValue6, false, 0, MapKt.getMap(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                composer.startReplaceGroup(-727029430);
                objRememberedValue7 = composer.rememberedValue();
                if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = new C0135c(14);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                Gd.m("Country", "India", (c) objRememberedValue7, true, 0, MapKt.getMap(outlined), composer, 3510, 16);
                b.m(f8, companion, composer, 6);
                TextStyle labelSmall9 = materialTheme.getTypography(composer, i5).getLabelSmall();
                TextKt.m2432Text4IGK_g("ADDRESS TYPE", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall9.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall9.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall9.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall9.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall9.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall9.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall9.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall9.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall9.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall9.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall9.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall9.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall9.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall9.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall9.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall9.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall9.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall9.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall9.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall9.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall9.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall9.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall9.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall9.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall9.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                b.m(f6, companion, composer, 6);
                f7 = 0.0f;
                float f17 = f5;
                float f18 = 4;
                Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f17, b.f(f17, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f13), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f18));
                MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f18)), companion6.getTop(), composer, 6);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs2);
                constructor2 = companion7.getConstructor();
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
                eVarG = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl2, currentCompositionLocalMap12);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                p035i0.a.w(companion7, composerM3407constructorimpl2, modifierMaterializeModifier12, composer, -1048339924);
                while (r1.hasNext()) {
                    iVar = (i) hVar.a();
                    String str2 = (String) hVar.b();
                    if (qVar.getAddressType() == iVar) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifierG2 = b.g(RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), f6);
                    if (z4) {
                        jM3962getTransparent0d7_KjU = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                    }
                    Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(modifierG2, jM3962getTransparent0d7_KjU, null, 2, null);
                    composer.startReplaceGroup(839938437);
                    zChanged7 = composer.changed(cVar) | composer.changed(qVar) | composer.changed(iVar);
                    objRememberedValue9 = composer.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue9 = new C2306q(cVar, qVar, iVar, 9);
                        composer.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new C2306q(cVar, qVar, iVar, 9);
                        composer.updateRememberedValue(objRememberedValue9);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default3, false, null, null, (a) objRememberedValue9, 7, null), f7, Dp.m6403constructorimpl(10), 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default3);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.Companion;
                    constructor5 = companion14.getConstructor();
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
                    eVarG4 = p035i0.a.g(companion14, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap13);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier13, companion14.getSetModifier());
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    if (z4) {
                        jG = p107y3.a.d();
                    } else {
                        jG = p107y3.a.g();
                    }
                    long j6 = jG;
                    companion2 = FontWeight.Companion;
                    if (z4) {
                        normal = companion2.getBold();
                    } else {
                        normal = companion2.getNormal();
                    }
                    TextKt.m2432Text4IGK_g(str2, (Modifier) null, j6, 0L, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 0, 0, 131034);
                    composer.endNode();
                    f7 = 0.0f;
                }
                composer.endReplaceGroup();
                composer.endNode();
                Modifier.Companion companion15 = Modifier.Companion;
                float f19 = 32;
                b.m(f19, companion15, composer, 6);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion15, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_6 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f17));
                Alignment.Companion companion16 = Alignment.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_6, companion16.getTop(), composer, 6);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default3);
                ComposeUiNode.Companion companion17 = ComposeUiNode.Companion;
                constructor3 = companion17.getConstructor();
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
                eVarG2 = p035i0.a.g(companion17, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl3, currentCompositionLocalMap14);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier14, companion17.getSetModifier());
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                Modifier modifierM699height3ABfNKs3 = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance4, companion15, 1.0f, false, 2, null), Dp.m6403constructorimpl(r2));
                ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                Color.Companion companion18 = Color.Companion;
                long jM3962getTransparent0d7_KjU3 = companion18.m3962getTransparent0d7_KjU();
                int i117 = ButtonDefaults.$stable << 12;
                ButtonKt.Button(this.q, modifierM699height3ABfNKs3, false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f17)), buttonDefaults2.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU3, 0L, 0L, 0L, composer, i117 | 6, 14), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f13), Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), null, null, X2.g(), composer, 806879232, 420);
                Modifier modifierM699height3ABfNKs4 = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance4, companion15, 1.0f, false, 2, null), Dp.m6403constructorimpl(f12));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion16.getTopStart(), false);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer, modifierM699height3ABfNKs4);
                constructor4 = companion17.getConstructor();
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
                eVarG3 = p035i0.a.g(companion17, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap15);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier15, companion17.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                Brush.Companion companion19 = Brush.Companion;
                Brush brushM3876horizontalGradient8A3gB4$default3 = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion19, v.S(Color.m3917boximpl(p107y3.a.e()), Color.m3917boximpl(p107y3.a.c())), 0.0f, 0.0f, 0, 14, (Object) null);
                Brush brushM3876horizontalGradient8A3gB4$default4 = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion19, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.c(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                boolean z7 = this.f15358r;
                boolean z8 = !z7;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion15, 0.0f, 1, null);
                ButtonColors buttonColorsM1520buttonColorsro_MJ89 = buttonDefaults2.m1520buttonColorsro_MJ88(companion18.m3962getTransparent0d7_KjU(), 0L, companion18.m3962getTransparent0d7_KjU(), 0L, composer, i117 | 390, 10);
                PaddingValues paddingValuesM661PaddingValues0680j_5 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f17));
                composer.startReplaceGroup(839997749);
                z3 = this.f15359s;
                boolean zChanged12 = composer.changed(z3);
                aVar = this.t;
                boolean zChanged13 = zChanged12 | composer.changed(aVar) | composer.changed(qVar);
                context = this.u;
                zChangedInstance = zChanged13 | composer.changedInstance(context);
                objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue8 = new K4(2, aVar, qVar, context, z3);
                    composer.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new K4(2, aVar, qVar, context, z3);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceGroup();
                ButtonKt.Button((a) objRememberedValue8, modifierFillMaxSize$default2, z8, roundedCornerShapeM955RoundedCornerShape0680j_5, buttonColorsM1520buttonColorsro_MJ89, null, null, paddingValuesM661PaddingValues0680j_5, null, ComposableLambdaKt.rememberComposableLambda(-927608327, true, new C2580mc(z3, z7, brushM3876horizontalGradient8A3gB4$default3, brushM3876horizontalGradient8A3gB4$default4), composer, 54), composer, 817889328, 352);
                composer.endNode();
                composer.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion15, Dp.m6403constructorimpl(f19)), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG8);
            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier4, companion7.getSetModifier());
            TextStyle labelSmall10 = materialTheme.getTypography(composer, i5).getLabelSmall();
            arrangement2 = arrangement;
            TextKt.m2432Text4IGK_g("PRIMARY CONTACT NUMBER", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall10.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall10.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall10.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall10.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall10.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall10.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall10.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall10.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall10.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall10.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall10.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall10.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall10.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall10.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall10.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall10.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall10.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall10.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall10.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall10.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall10.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall10.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall10.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall10.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall10.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            float f110 = 52;
            Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m6403constructorimpl(f110)), f9), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            float f111 = 1;
            Modifier modifierM670paddingVpY3zN4$default4 = PaddingKt.m670paddingVpY3zN4$default(b.e(f9, modifierM207backgroundbw27NRU$default4, Dp.m6403constructorimpl(f111), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f10), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap16 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default4);
            constructor = companion7.getConstructor();
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
            e eVarG12 = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl, currentCompositionLocalMap16);
            if (composerM3407constructorimpl.getInserting()) {
                f5 = f9;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier16, companion7.getSetModifier());
                TextStyle bodyMedium5 = materialTheme.getTypography(composer, i5).getBodyMedium();
                TextKt.m2432Text4IGK_g("+91", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium5.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium5.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodyMedium5.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium5.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodyMedium5.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium5.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium5.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium5.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium5.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium5.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium5.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium5.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium5.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium5.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium5.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium5.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium5.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium5.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium5.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium5.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium5.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium5.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium5.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium5.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium5.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                f6 = 8;
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion5, Dp.m6403constructorimpl(f6)), composer, 6);
                phone = qVar.getPhone();
                if (j.m0(phone)) {
                    phone = "No verified number";
                }
                TextStyle bodyMedium6 = materialTheme.getTypography(composer, i5).getBodyMedium();
                TextKt.m2432Text4IGK_g(phone, RowScope.weight$default(rowScopeInstance2, companion5, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium6.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium6.spanStyle.m5841getColor0d7_KjU() : companion3.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium6.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium6.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodyMedium6.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium6.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium6.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium6.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium6.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? bodyMedium6.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium6.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium6.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium6.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium6.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium6.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium6.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium6.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium6.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium6.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium6.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium6.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium6.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium6.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium6.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium6.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65532);
                composer.startReplaceGroup(839754220);
                if (j.m0(qVar.getPhone())) {
                    MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer, 48);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap17 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer, companion5);
                    constructor6 = companion7.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor6);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
                    e eVarG13 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy10, composerM3407constructorimpl6, currentCompositionLocalMap17);
                    if (composerM3407constructorimpl6.getInserting()) {
                        rowScopeInstance = rowScopeInstance2;
                        if (!o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier17, companion7.getSetModifier());
                        IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(14)), p107y3.a.a(), composer, 3504, 0);
                        companion = companion5;
                        androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
                        TextStyle labelSmall11 = materialTheme.getTypography(composer, i5).getLabelSmall();
                        TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall11.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall11.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? labelSmall11.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall11.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall11.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall11.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall11.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall11.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall11.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall11.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall11.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall11.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall11.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall11.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall11.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall11.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall11.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall11.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall11.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall11.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall11.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall11.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall11.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall11.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall11.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                        composer.endNode();
                    } else {
                        rowScopeInstance = rowScopeInstance2;
                    }
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG13);
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier17, companion7.getSetModifier());
                    IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(14)), p107y3.a.a(), composer, 3504, 0);
                    companion = companion5;
                    androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
                    TextStyle labelSmall12 = materialTheme.getTypography(composer, i5).getLabelSmall();
                    TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall12.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall12.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? labelSmall12.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall12.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall12.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall12.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall12.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall12.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall12.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall12.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall12.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall12.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall12.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall12.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall12.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall12.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall12.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall12.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall12.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall12.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall12.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall12.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall12.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall12.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall12.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                    composer.endNode();
                } else {
                    rowScopeInstance = rowScopeInstance2;
                    companion = companion5;
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String flatHouse3 = qVar.getFlatHouse();
                composer.startReplaceGroup(-727118045);
                zChanged = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue = composer.rememberedValue();
                if (zChanged) {
                    final int i118 = 2;
                    objRememberedValue = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i118) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                } else {
                    final int i119 = 2;
                    objRememberedValue = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i119) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Gd.m("Flat / House / Building", flatHouse3, (c) objRememberedValue, false, 0, HomeKt.getHome(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String areaStreet3 = qVar.getAreaStreet();
                composer.startReplaceGroup(-727105212);
                zChanged2 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue2 = composer.rememberedValue();
                if (zChanged2) {
                    final int i120 = 3;
                    objRememberedValue2 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i120) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                } else {
                    final int i121 = 3;
                    objRememberedValue2 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i121) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Gd.m("Area / Sector / Locality / Street", areaStreet3, (c) objRememberedValue2, false, 0, PlaceKt.getPlace(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String landmark3 = qVar.getLandmark();
                composer.startReplaceGroup(-727093182);
                zChanged3 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue3 = composer.rememberedValue();
                if (zChanged3) {
                    final int i1110 = 4;
                    objRememberedValue3 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i1110) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                } else {
                    final int i1111 = 4;
                    objRememberedValue3 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i1111) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                Gd.m("Landmark", landmark3, (c) objRememberedValue3, false, 0, LocationOnKt.getLocationOn(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String postalCode3 = qVar.getPostalCode();
                composer.startReplaceGroup(-727080340);
                zChanged4 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue4 = composer.rememberedValue();
                if (zChanged4) {
                    final int i1112 = 5;
                    objRememberedValue4 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i1112) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                } else {
                    final int i1113 = 5;
                    objRememberedValue4 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i1113) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                Gd.m("Pincode", postalCode3, (c) objRememberedValue4, false, KeyboardType.Companion.m6125getNumberPjHm6EE(), LocalPostOfficeKt.getLocalPostOffice(outlined), composer, 24582, 8);
                b.m(f11, companion, composer, 6);
                TextStyle labelSmall13 = materialTheme.getTypography(composer, i5).getLabelSmall();
                TextKt.m2432Text4IGK_g("City and state will auto-fill from pincode.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall13.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall13.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall13.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? labelSmall13.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall13.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall13.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall13.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall13.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall13.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall13.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall13.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall13.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall13.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall13.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall13.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall13.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall13.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall13.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall13.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall13.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall13.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall13.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall13.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall13.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall13.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String city3 = qVar.getCity();
                composer.startReplaceGroup(-727052610);
                zChanged5 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue5 = composer.rememberedValue();
                if (zChanged5) {
                    final int i1114 = 6;
                    objRememberedValue5 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i1114) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                } else {
                    final int i1115 = 6;
                    objRememberedValue5 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i1115) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                Gd.m("City", city3, (c) objRememberedValue5, false, 0, CorporateFareKt.getCorporateFare(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                String state3 = qVar.getState();
                composer.startReplaceGroup(-727040705);
                zChanged6 = composer.changed(cVar) | composer.changed(qVar);
                objRememberedValue6 = composer.rememberedValue();
                if (zChanged6) {
                    final int i1116 = 7;
                    objRememberedValue6 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i1116) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                } else {
                    final int i1117 = 7;
                    objRememberedValue6 = new c() { // from class: x3.lc
                        @Override // O3.c
                        public final Object invoke(Object obj4) {
                            switch (i1117) {
                                case 0:
                                    String it = (String) obj4;
                                    o.f(it, "it");
                                    q qVar2 = qVar;
                                    cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                    break;
                                case 1:
                                    String it2 = (String) obj4;
                                    o.f(it2, "it");
                                    q qVar3 = qVar;
                                    cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                    break;
                                case 2:
                                    String it3 = (String) obj4;
                                    o.f(it3, "it");
                                    q qVar4 = qVar;
                                    cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                    break;
                                case 3:
                                    String it4 = (String) obj4;
                                    o.f(it4, "it");
                                    q qVar5 = qVar;
                                    cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                    break;
                                case 4:
                                    String it5 = (String) obj4;
                                    o.f(it5, "it");
                                    q qVar6 = qVar;
                                    cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                    break;
                                case 5:
                                    String it6 = (String) obj4;
                                    o.f(it6, "it");
                                    String strF0 = j.F0(6, it6);
                                    q qVar7 = qVar;
                                    cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                    break;
                                case 6:
                                    String it7 = (String) obj4;
                                    o.f(it7, "it");
                                    q qVar8 = qVar;
                                    cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                    break;
                                default:
                                    String it8 = (String) obj4;
                                    o.f(it8, "it");
                                    q qVar9 = qVar;
                                    cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                    break;
                            }
                            return B3.o.f154a;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                Gd.m("State", state3, (c) objRememberedValue6, false, 0, MapKt.getMap(outlined), composer, 6, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
                composer.startReplaceGroup(-727029430);
                objRememberedValue7 = composer.rememberedValue();
                if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = new C0135c(14);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                Gd.m("Country", "India", (c) objRememberedValue7, true, 0, MapKt.getMap(outlined), composer, 3510, 16);
                b.m(f8, companion, composer, 6);
                TextStyle labelSmall14 = materialTheme.getTypography(composer, i5).getLabelSmall();
                TextKt.m2432Text4IGK_g("ADDRESS TYPE", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall14.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall14.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall14.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall14.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall14.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall14.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall14.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall14.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall14.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall14.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall14.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall14.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall14.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall14.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall14.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall14.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall14.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall14.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall14.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall14.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall14.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall14.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall14.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall14.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall14.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                b.m(f6, companion, composer, 6);
                f7 = 0.0f;
                float f112 = f5;
                float f113 = 4;
                Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(b.e(f112, b.f(f112, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f111), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f113));
                MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f113)), companion6.getTop(), composer, 6);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap18 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs3);
                constructor2 = companion7.getConstructor();
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
                eVarG = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy11, composerM3407constructorimpl2, currentCompositionLocalMap18);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                p035i0.a.w(companion7, composerM3407constructorimpl2, modifierMaterializeModifier18, composer, -1048339924);
                while (r1.hasNext()) {
                    iVar = (i) hVar.a();
                    String str3 = (String) hVar.b();
                    if (qVar.getAddressType() == iVar) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Modifier modifierG3 = b.g(RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), f6);
                    if (z4) {
                        jM3962getTransparent0d7_KjU = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                    }
                    Modifier modifierM207backgroundbw27NRU$default5 = BackgroundKt.m207backgroundbw27NRU$default(modifierG3, jM3962getTransparent0d7_KjU, null, 2, null);
                    composer.startReplaceGroup(839938437);
                    zChanged7 = composer.changed(cVar) | composer.changed(qVar) | composer.changed(iVar);
                    objRememberedValue9 = composer.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue9 = new C2306q(cVar, qVar, iVar, 9);
                        composer.updateRememberedValue(objRememberedValue9);
                    } else {
                        objRememberedValue9 = new C2306q(cVar, qVar, iVar, 9);
                        composer.updateRememberedValue(objRememberedValue9);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierM670paddingVpY3zN4$default5 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default5, false, null, null, (a) objRememberedValue9, 7, null), f7, Dp.m6403constructorimpl(10), 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default5);
                    ComposeUiNode.Companion companion110 = ComposeUiNode.Companion;
                    constructor5 = companion110.getConstructor();
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
                    eVarG4 = p035i0.a.g(companion110, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl5, currentCompositionLocalMap19);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier19, companion110.getSetModifier());
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    if (z4) {
                        jG = p107y3.a.d();
                    } else {
                        jG = p107y3.a.g();
                    }
                    long j7 = jG;
                    companion2 = FontWeight.Companion;
                    if (z4) {
                        normal = companion2.getBold();
                    } else {
                        normal = companion2.getNormal();
                    }
                    TextKt.m2432Text4IGK_g(str3, (Modifier) null, j7, 0L, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 0, 0, 131034);
                    composer.endNode();
                    f7 = 0.0f;
                }
                composer.endReplaceGroup();
                composer.endNode();
                Modifier.Companion companion111 = Modifier.Companion;
                float f114 = 32;
                b.m(f114, companion111, composer, 6);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion111, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_7 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f112));
                Alignment.Companion companion112 = Alignment.Companion;
                MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_7, companion112.getTop(), composer, 6);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap110 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default4);
                ComposeUiNode.Companion companion113 = ComposeUiNode.Companion;
                constructor3 = companion113.getConstructor();
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
                eVarG2 = p035i0.a.g(companion113, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy12, composerM3407constructorimpl3, currentCompositionLocalMap110);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier110, companion113.getSetModifier());
                RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                Modifier modifierM699height3ABfNKs5 = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance5, companion111, 1.0f, false, 2, null), Dp.m6403constructorimpl(r2));
                ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                Color.Companion companion114 = Color.Companion;
                long jM3962getTransparent0d7_KjU4 = companion114.m3962getTransparent0d7_KjU();
                int i1118 = ButtonDefaults.$stable << 12;
                ButtonKt.Button(this.q, modifierM699height3ABfNKs5, false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f112)), buttonDefaults3.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU4, 0L, 0L, 0L, composer, i1118 | 6, 14), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f111), Color.m3926copywmQWz5c$default(companion114.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), null, null, X2.g(), composer, 806879232, 420);
                Modifier modifierM699height3ABfNKs6 = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance5, companion111, 1.0f, false, 2, null), Dp.m6403constructorimpl(f110));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion112.getTopStart(), false);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap111 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer, modifierM699height3ABfNKs6);
                constructor4 = companion113.getConstructor();
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
                eVarG3 = p035i0.a.g(companion113, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap111);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111, companion113.getSetModifier());
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                Brush.Companion companion115 = Brush.Companion;
                Brush brushM3876horizontalGradient8A3gB4$default5 = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion115, v.S(Color.m3917boximpl(p107y3.a.e()), Color.m3917boximpl(p107y3.a.c())), 0.0f, 0.0f, 0, 14, (Object) null);
                Brush brushM3876horizontalGradient8A3gB4$default6 = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion115, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.c(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                boolean z9 = this.f15358r;
                boolean z10 = !z9;
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion111, 0.0f, 1, null);
                ButtonColors buttonColorsM1520buttonColorsro_MJ810 = buttonDefaults3.m1520buttonColorsro_MJ88(companion114.m3962getTransparent0d7_KjU(), 0L, companion114.m3962getTransparent0d7_KjU(), 0L, composer, i1118 | 390, 10);
                PaddingValues paddingValuesM661PaddingValues0680j_6 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f112));
                composer.startReplaceGroup(839997749);
                z3 = this.f15359s;
                boolean zChanged14 = composer.changed(z3);
                aVar = this.t;
                boolean zChanged15 = zChanged14 | composer.changed(aVar) | composer.changed(qVar);
                context = this.u;
                zChangedInstance = zChanged15 | composer.changedInstance(context);
                objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue8 = new K4(2, aVar, qVar, context, z3);
                    composer.updateRememberedValue(objRememberedValue8);
                } else {
                    objRememberedValue8 = new K4(2, aVar, qVar, context, z3);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceGroup();
                ButtonKt.Button((a) objRememberedValue8, modifierFillMaxSize$default3, z10, roundedCornerShapeM955RoundedCornerShape0680j_6, buttonColorsM1520buttonColorsro_MJ810, null, null, paddingValuesM661PaddingValues0680j_6, null, ComposableLambdaKt.rememberComposableLambda(-927608327, true, new C2580mc(z3, z9, brushM3876horizontalGradient8A3gB4$default5, brushM3876horizontalGradient8A3gB4$default6), composer, 54), composer, 817889328, 352);
                composer.endNode();
                composer.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111, Dp.m6403constructorimpl(f114)), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                f5 = f9;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG12);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier16, companion7.getSetModifier());
            TextStyle bodyMedium7 = materialTheme.getTypography(composer, i5).getBodyMedium();
            TextKt.m2432Text4IGK_g("+91", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium7.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium7.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? bodyMedium7.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium7.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodyMedium7.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium7.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium7.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium7.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium7.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium7.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium7.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium7.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium7.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium7.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium7.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium7.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium7.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium7.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium7.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium7.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium7.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium7.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium7.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium7.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium7.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            f6 = 8;
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion5, Dp.m6403constructorimpl(f6)), composer, 6);
            phone = qVar.getPhone();
            if (j.m0(phone)) {
                phone = "No verified number";
            }
            TextStyle bodyMedium8 = materialTheme.getTypography(composer, i5).getBodyMedium();
            TextKt.m2432Text4IGK_g(phone, RowScope.weight$default(rowScopeInstance2, companion5, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodyMedium8.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium8.spanStyle.m5841getColor0d7_KjU() : companion3.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? bodyMedium8.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium8.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? bodyMedium8.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium8.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium8.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium8.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium8.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? bodyMedium8.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium8.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium8.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium8.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium8.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium8.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium8.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium8.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium8.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium8.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium8.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium8.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium8.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium8.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium8.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium8.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65532);
            composer.startReplaceGroup(839754220);
            if (j.m0(qVar.getPhone())) {
                MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer, 48);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composer, companion5);
                constructor6 = companion7.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor6);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
                e eVarG14 = p035i0.a.g(companion7, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy13, composerM3407constructorimpl6, currentCompositionLocalMap112);
                if (composerM3407constructorimpl6.getInserting()) {
                    rowScopeInstance = rowScopeInstance2;
                    if (!o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier112, companion7.getSetModifier());
                    IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(14)), p107y3.a.a(), composer, 3504, 0);
                    companion = companion5;
                    androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
                    TextStyle labelSmall15 = materialTheme.getTypography(composer, i5).getLabelSmall();
                    TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall15.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall15.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? labelSmall15.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall15.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall15.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall15.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall15.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall15.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall15.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall15.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall15.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall15.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall15.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall15.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall15.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall15.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall15.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall15.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall15.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall15.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall15.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall15.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall15.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall15.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall15.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                    composer.endNode();
                } else {
                    rowScopeInstance = rowScopeInstance2;
                }
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG14);
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier112, companion7.getSetModifier());
                IconKt.m1877Iconww6aTOc(VerifiedKt.getVerified(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(14)), p107y3.a.a(), composer, 3504, 0);
                companion = companion5;
                androidx.compose.foundation.text.modifiers.a.q(4, companion, composer, 6);
                TextStyle labelSmall16 = materialTheme.getTypography(composer, i5).getLabelSmall();
                TextKt.m2432Text4IGK_g("VERIFIED", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall16.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall16.spanStyle.m5841getColor0d7_KjU() : p107y3.a.a(), (16645977 & 2) != 0 ? labelSmall16.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(9), (16645977 & 4) != 0 ? labelSmall16.spanStyle.getFontWeight() : companion4.getBlack(), (16645977 & 8) != 0 ? labelSmall16.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall16.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall16.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall16.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall16.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall16.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall16.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall16.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall16.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall16.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall16.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall16.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall16.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall16.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall16.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall16.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall16.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall16.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall16.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall16.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall16.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
                composer.endNode();
            } else {
                rowScopeInstance = rowScopeInstance2;
                companion = companion5;
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
            String flatHouse4 = qVar.getFlatHouse();
            composer.startReplaceGroup(-727118045);
            zChanged = composer.changed(cVar) | composer.changed(qVar);
            objRememberedValue = composer.rememberedValue();
            if (zChanged) {
                final int i1119 = 2;
                objRememberedValue = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i1119) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            } else {
                final int i11110 = 2;
                objRememberedValue = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11110) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Gd.m("Flat / House / Building", flatHouse4, (c) objRememberedValue, false, 0, HomeKt.getHome(outlined), composer, 6, 24);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
            String areaStreet4 = qVar.getAreaStreet();
            composer.startReplaceGroup(-727105212);
            zChanged2 = composer.changed(cVar) | composer.changed(qVar);
            objRememberedValue2 = composer.rememberedValue();
            if (zChanged2) {
                final int i122 = 3;
                objRememberedValue2 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i122) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                final int i123 = 3;
                objRememberedValue2 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i123) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Gd.m("Area / Sector / Locality / Street", areaStreet4, (c) objRememberedValue2, false, 0, PlaceKt.getPlace(outlined), composer, 6, 24);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
            String landmark4 = qVar.getLandmark();
            composer.startReplaceGroup(-727093182);
            zChanged3 = composer.changed(cVar) | composer.changed(qVar);
            objRememberedValue3 = composer.rememberedValue();
            if (zChanged3) {
                final int i11111 = 4;
                objRememberedValue3 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11111) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            } else {
                final int i11112 = 4;
                objRememberedValue3 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11112) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            Gd.m("Landmark", landmark4, (c) objRememberedValue3, false, 0, LocationOnKt.getLocationOn(outlined), composer, 6, 24);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
            String postalCode4 = qVar.getPostalCode();
            composer.startReplaceGroup(-727080340);
            zChanged4 = composer.changed(cVar) | composer.changed(qVar);
            objRememberedValue4 = composer.rememberedValue();
            if (zChanged4) {
                final int i11113 = 5;
                objRememberedValue4 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11113) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            } else {
                final int i11114 = 5;
                objRememberedValue4 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11114) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Gd.m("Pincode", postalCode4, (c) objRememberedValue4, false, KeyboardType.Companion.m6125getNumberPjHm6EE(), LocalPostOfficeKt.getLocalPostOffice(outlined), composer, 24582, 8);
            b.m(f11, companion, composer, 6);
            TextStyle labelSmall17 = materialTheme.getTypography(composer, i5).getLabelSmall();
            TextKt.m2432Text4IGK_g("City and state will auto-fill from pincode.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall17.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall17.spanStyle.m5841getColor0d7_KjU() : Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), (16645977 & 2) != 0 ? labelSmall17.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(11), (16645977 & 4) != 0 ? labelSmall17.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? labelSmall17.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall17.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall17.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall17.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall17.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall17.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall17.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall17.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall17.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall17.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall17.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall17.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall17.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall17.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall17.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall17.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall17.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall17.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall17.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall17.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall17.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
            String city4 = qVar.getCity();
            composer.startReplaceGroup(-727052610);
            zChanged5 = composer.changed(cVar) | composer.changed(qVar);
            objRememberedValue5 = composer.rememberedValue();
            if (zChanged5) {
                final int i11115 = 6;
                objRememberedValue5 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11115) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            } else {
                final int i11116 = 6;
                objRememberedValue5 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11116) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Gd.m("City", city4, (c) objRememberedValue5, false, 0, CorporateFareKt.getCorporateFare(outlined), composer, 6, 24);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
            String state4 = qVar.getState();
            composer.startReplaceGroup(-727040705);
            zChanged6 = composer.changed(cVar) | composer.changed(qVar);
            objRememberedValue6 = composer.rememberedValue();
            if (zChanged6) {
                final int i11117 = 7;
                objRememberedValue6 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11117) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            } else {
                final int i11118 = 7;
                objRememberedValue6 = new c() { // from class: x3.lc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        switch (i11118) {
                            case 0:
                                String it = (String) obj4;
                                o.f(it, "it");
                                q qVar2 = qVar;
                                cVar.invoke(qVar2.copy((12287 & 1) != 0 ? qVar2.firstName : it, (12287 & 2) != 0 ? qVar2.lastName : null, (12287 & 4) != 0 ? qVar2.fullName : null, (12287 & 8) != 0 ? qVar2.flatHouse : null, (12287 & 16) != 0 ? qVar2.areaStreet : null, (12287 & 32) != 0 ? qVar2.landmark : null, (12287 & 64) != 0 ? qVar2.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar2.city : null, (12287 & Fields.RotationX) != 0 ? qVar2.state : null, (12287 & Fields.RotationY) != 0 ? qVar2.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar2.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar2.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar2.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar2.shippingAddressId : null));
                                break;
                            case 1:
                                String it2 = (String) obj4;
                                o.f(it2, "it");
                                q qVar3 = qVar;
                                cVar.invoke(qVar3.copy((12287 & 1) != 0 ? qVar3.firstName : null, (12287 & 2) != 0 ? qVar3.lastName : it2, (12287 & 4) != 0 ? qVar3.fullName : null, (12287 & 8) != 0 ? qVar3.flatHouse : null, (12287 & 16) != 0 ? qVar3.areaStreet : null, (12287 & 32) != 0 ? qVar3.landmark : null, (12287 & 64) != 0 ? qVar3.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar3.city : null, (12287 & Fields.RotationX) != 0 ? qVar3.state : null, (12287 & Fields.RotationY) != 0 ? qVar3.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar3.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar3.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar3.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar3.shippingAddressId : null));
                                break;
                            case 2:
                                String it3 = (String) obj4;
                                o.f(it3, "it");
                                q qVar4 = qVar;
                                cVar.invoke(qVar4.copy((12287 & 1) != 0 ? qVar4.firstName : null, (12287 & 2) != 0 ? qVar4.lastName : null, (12287 & 4) != 0 ? qVar4.fullName : null, (12287 & 8) != 0 ? qVar4.flatHouse : it3, (12287 & 16) != 0 ? qVar4.areaStreet : null, (12287 & 32) != 0 ? qVar4.landmark : null, (12287 & 64) != 0 ? qVar4.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar4.city : null, (12287 & Fields.RotationX) != 0 ? qVar4.state : null, (12287 & Fields.RotationY) != 0 ? qVar4.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar4.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar4.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar4.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar4.shippingAddressId : null));
                                break;
                            case 3:
                                String it4 = (String) obj4;
                                o.f(it4, "it");
                                q qVar5 = qVar;
                                cVar.invoke(qVar5.copy((12287 & 1) != 0 ? qVar5.firstName : null, (12287 & 2) != 0 ? qVar5.lastName : null, (12287 & 4) != 0 ? qVar5.fullName : null, (12287 & 8) != 0 ? qVar5.flatHouse : null, (12287 & 16) != 0 ? qVar5.areaStreet : it4, (12287 & 32) != 0 ? qVar5.landmark : null, (12287 & 64) != 0 ? qVar5.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar5.city : null, (12287 & Fields.RotationX) != 0 ? qVar5.state : null, (12287 & Fields.RotationY) != 0 ? qVar5.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar5.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar5.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar5.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar5.shippingAddressId : null));
                                break;
                            case 4:
                                String it5 = (String) obj4;
                                o.f(it5, "it");
                                q qVar6 = qVar;
                                cVar.invoke(qVar6.copy((12287 & 1) != 0 ? qVar6.firstName : null, (12287 & 2) != 0 ? qVar6.lastName : null, (12287 & 4) != 0 ? qVar6.fullName : null, (12287 & 8) != 0 ? qVar6.flatHouse : null, (12287 & 16) != 0 ? qVar6.areaStreet : null, (12287 & 32) != 0 ? qVar6.landmark : it5, (12287 & 64) != 0 ? qVar6.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar6.city : null, (12287 & Fields.RotationX) != 0 ? qVar6.state : null, (12287 & Fields.RotationY) != 0 ? qVar6.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar6.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar6.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar6.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar6.shippingAddressId : null));
                                break;
                            case 5:
                                String it6 = (String) obj4;
                                o.f(it6, "it");
                                String strF0 = j.F0(6, it6);
                                q qVar7 = qVar;
                                cVar.invoke(qVar7.copy((12287 & 1) != 0 ? qVar7.firstName : null, (12287 & 2) != 0 ? qVar7.lastName : null, (12287 & 4) != 0 ? qVar7.fullName : null, (12287 & 8) != 0 ? qVar7.flatHouse : null, (12287 & 16) != 0 ? qVar7.areaStreet : null, (12287 & 32) != 0 ? qVar7.landmark : null, (12287 & 64) != 0 ? qVar7.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar7.city : null, (12287 & Fields.RotationX) != 0 ? qVar7.state : null, (12287 & Fields.RotationY) != 0 ? qVar7.postalCode : strF0, (12287 & Fields.RotationZ) != 0 ? qVar7.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar7.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar7.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar7.shippingAddressId : null));
                                break;
                            case 6:
                                String it7 = (String) obj4;
                                o.f(it7, "it");
                                q qVar8 = qVar;
                                cVar.invoke(qVar8.copy((12287 & 1) != 0 ? qVar8.firstName : null, (12287 & 2) != 0 ? qVar8.lastName : null, (12287 & 4) != 0 ? qVar8.fullName : null, (12287 & 8) != 0 ? qVar8.flatHouse : null, (12287 & 16) != 0 ? qVar8.areaStreet : null, (12287 & 32) != 0 ? qVar8.landmark : null, (12287 & 64) != 0 ? qVar8.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar8.city : it7, (12287 & Fields.RotationX) != 0 ? qVar8.state : null, (12287 & Fields.RotationY) != 0 ? qVar8.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar8.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar8.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar8.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar8.shippingAddressId : null));
                                break;
                            default:
                                String it8 = (String) obj4;
                                o.f(it8, "it");
                                q qVar9 = qVar;
                                cVar.invoke(qVar9.copy((12287 & 1) != 0 ? qVar9.firstName : null, (12287 & 2) != 0 ? qVar9.lastName : null, (12287 & 4) != 0 ? qVar9.fullName : null, (12287 & 8) != 0 ? qVar9.flatHouse : null, (12287 & 16) != 0 ? qVar9.areaStreet : null, (12287 & 32) != 0 ? qVar9.landmark : null, (12287 & 64) != 0 ? qVar9.addressType : null, (12287 & Fields.SpotShadowColor) != 0 ? qVar9.city : null, (12287 & Fields.RotationX) != 0 ? qVar9.state : it8, (12287 & Fields.RotationY) != 0 ? qVar9.postalCode : null, (12287 & Fields.RotationZ) != 0 ? qVar9.country : null, (12287 & Fields.CameraDistance) != 0 ? qVar9.phone : null, (12287 & Fields.TransformOrigin) != 0 ? qVar9.isPhoneVerified : false, (12287 & Fields.Shape) != 0 ? qVar9.shippingAddressId : null));
                                break;
                        }
                        return B3.o.f154a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            Gd.m("State", state4, (c) objRememberedValue6, false, 0, MapKt.getMap(outlined), composer, 6, 24);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f10)), composer, 6);
            composer.startReplaceGroup(-727029430);
            objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = new C0135c(14);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            Gd.m("Country", "India", (c) objRememberedValue7, true, 0, MapKt.getMap(outlined), composer, 3510, 16);
            b.m(f8, companion, composer, 6);
            TextStyle labelSmall18 = materialTheme.getTypography(composer, i5).getLabelSmall();
            TextKt.m2432Text4IGK_g("ADDRESS TYPE", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall18.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall18.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall18.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall18.spanStyle.getFontWeight() : companion4.getBold(), (16645977 & 8) != 0 ? labelSmall18.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall18.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall18.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall18.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall18.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall18.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall18.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall18.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall18.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall18.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall18.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall18.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall18.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall18.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall18.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall18.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall18.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall18.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall18.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall18.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall18.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
            b.m(f6, companion, composer, 6);
            f7 = 0.0f;
            float f115 = f5;
            float f116 = 4;
            Modifier modifierM668padding3ABfNKs4 = PaddingKt.m668padding3ABfNKs(b.e(f115, b.f(f115, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f111), Color.m3926copywmQWz5c$default(companion3.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f116));
            MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(arrangement2.m548spacedBy0680j_4(Dp.m6403constructorimpl(f116)), companion6.getTop(), composer, 6);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap113 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs4);
            constructor2 = companion7.getConstructor();
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
            eVarG = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy14, composerM3407constructorimpl2, currentCompositionLocalMap113);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            p035i0.a.w(companion7, composerM3407constructorimpl2, modifierMaterializeModifier113, composer, -1048339924);
            while (r1.hasNext()) {
                iVar = (i) hVar.a();
                String str4 = (String) hVar.b();
                if (qVar.getAddressType() == iVar) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Modifier modifierG4 = b.g(RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), f6);
                if (z4) {
                    jM3962getTransparent0d7_KjU = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                }
                Modifier modifierM207backgroundbw27NRU$default6 = BackgroundKt.m207backgroundbw27NRU$default(modifierG4, jM3962getTransparent0d7_KjU, null, 2, null);
                composer.startReplaceGroup(839938437);
                zChanged7 = composer.changed(cVar) | composer.changed(qVar) | composer.changed(iVar);
                objRememberedValue9 = composer.rememberedValue();
                if (zChanged7) {
                    objRememberedValue9 = new C2306q(cVar, qVar, iVar, 9);
                    composer.updateRememberedValue(objRememberedValue9);
                } else {
                    objRememberedValue9 = new C2306q(cVar, qVar, iVar, 9);
                    composer.updateRememberedValue(objRememberedValue9);
                }
                composer.endReplaceGroup();
                Modifier modifierM670paddingVpY3zN4$default6 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default6, false, null, null, (a) objRememberedValue9, 7, null), f7, Dp.m6403constructorimpl(10), 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap114 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default6);
                ComposeUiNode.Companion companion116 = ComposeUiNode.Companion;
                constructor5 = companion116.getConstructor();
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
                eVarG4 = p035i0.a.g(companion116, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl5, currentCompositionLocalMap114);
                if (composerM3407constructorimpl5.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier114, companion116.getSetModifier());
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                if (z4) {
                    jG = p107y3.a.d();
                } else {
                    jG = p107y3.a.g();
                }
                long j8 = jG;
                companion2 = FontWeight.Companion;
                if (z4) {
                    normal = companion2.getBold();
                } else {
                    normal = companion2.getNormal();
                }
                TextKt.m2432Text4IGK_g(str4, (Modifier) null, j8, 0L, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 0, 0, 131034);
                composer.endNode();
                f7 = 0.0f;
            }
            composer.endReplaceGroup();
            composer.endNode();
            Modifier.Companion companion117 = Modifier.Companion;
            float f117 = 32;
            b.m(f117, companion117, composer, 6);
            Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion117, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_8 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f115));
            Alignment.Companion companion118 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_8, companion118.getTop(), composer, 6);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap115 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default5);
            ComposeUiNode.Companion companion119 = ComposeUiNode.Companion;
            constructor3 = companion119.getConstructor();
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
            eVarG2 = p035i0.a.g(companion119, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy15, composerM3407constructorimpl3, currentCompositionLocalMap115);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier115, companion119.getSetModifier());
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            Modifier modifierM699height3ABfNKs7 = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance6, companion117, 1.0f, false, 2, null), Dp.m6403constructorimpl(r2));
            ButtonDefaults buttonDefaults4 = ButtonDefaults.INSTANCE;
            Color.Companion companion1110 = Color.Companion;
            long jM3962getTransparent0d7_KjU5 = companion1110.m3962getTransparent0d7_KjU();
            int i11119 = ButtonDefaults.$stable << 12;
            ButtonKt.Button(this.q, modifierM699height3ABfNKs7, false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f115)), buttonDefaults4.m1520buttonColorsro_MJ88(jM3962getTransparent0d7_KjU5, 0L, 0L, 0L, composer, i11119 | 6, 14), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(f111), Color.m3926copywmQWz5c$default(companion1110.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), null, null, X2.g(), composer, 806879232, 420);
            Modifier modifierM699height3ABfNKs8 = SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance6, companion117, 1.0f, false, 2, null), Dp.m6403constructorimpl(f110));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion118.getTopStart(), false);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap116 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composer, modifierM699height3ABfNKs8);
            constructor4 = companion119.getConstructor();
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
            eVarG3 = p035i0.a.g(companion119, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl4, currentCompositionLocalMap116);
            if (composerM3407constructorimpl4.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            } else {
                p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
            }
            Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier116, companion119.getSetModifier());
            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
            Brush.Companion companion1111 = Brush.Companion;
            Brush brushM3876horizontalGradient8A3gB4$default7 = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion1111, v.S(Color.m3917boximpl(p107y3.a.e()), Color.m3917boximpl(p107y3.a.c())), 0.0f, 0.0f, 0, 14, (Object) null);
            Brush brushM3876horizontalGradient8A3gB4$default8 = Brush.Companion.m3876horizontalGradient8A3gB4$default(companion1111, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.c(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
            boolean z11 = this.f15358r;
            boolean z12 = !z11;
            Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion117, 0.0f, 1, null);
            ButtonColors buttonColorsM1520buttonColorsro_MJ811 = buttonDefaults4.m1520buttonColorsro_MJ88(companion1110.m3962getTransparent0d7_KjU(), 0L, companion1110.m3962getTransparent0d7_KjU(), 0L, composer, i11119 | 390, 10);
            PaddingValues paddingValuesM661PaddingValues0680j_7 = PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0));
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f115));
            composer.startReplaceGroup(839997749);
            z3 = this.f15359s;
            boolean zChanged16 = composer.changed(z3);
            aVar = this.t;
            boolean zChanged17 = zChanged16 | composer.changed(aVar) | composer.changed(qVar);
            context = this.u;
            zChangedInstance = zChanged17 | composer.changedInstance(context);
            objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue8 = new K4(2, aVar, qVar, context, z3);
                composer.updateRememberedValue(objRememberedValue8);
            } else {
                objRememberedValue8 = new K4(2, aVar, qVar, context, z3);
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((a) objRememberedValue8, modifierFillMaxSize$default4, z12, roundedCornerShapeM955RoundedCornerShape0680j_7, buttonColorsM1520buttonColorsro_MJ811, null, null, paddingValuesM661PaddingValues0680j_7, null, ComposableLambdaKt.rememberComposableLambda(-927608327, true, new C2580mc(z3, z11, brushM3876horizontalGradient8A3gB4$default7, brushM3876horizontalGradient8A3gB4$default8), composer, 54), composer, 817889328, 352);
            composer.endNode();
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion117, Dp.m6403constructorimpl(f117)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

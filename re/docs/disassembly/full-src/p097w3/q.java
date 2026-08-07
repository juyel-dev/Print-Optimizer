package p097w3;

import O3.a;
import O3.e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void a(final String text, final a onClick, Modifier modifier, ImageVector imageVector, boolean z3, boolean z4, Composer composer, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        ImageVector imageVector2;
        int i9;
        int i10;
        boolean z5;
        int i11;
        int i12;
        Modifier modifier3;
        ImageVector imageVector3;
        float f5;
        Composer composer2;
        final boolean z6;
        final Modifier modifier4;
        final ImageVector imageVector4;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        o.f(text, "text");
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-607049155);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i13 = i6 & 4;
        if (i13 == 0) {
            if ((i5 & 384) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i8 = i6 & 8;
            if (i8 != 0) {
                if ((i5 & 3072) == 0) {
                    imageVector2 = imageVector;
                    if (composerStartRestartGroup.changed(imageVector2)) {
                        i9 = Fields.CameraDistance;
                    } else {
                        i9 = Fields.RotationZ;
                    }
                    i7 |= i9;
                }
                i10 = i6 & 16;
                if (i10 != 0) {
                    if ((i5 & 24576) == 0) {
                        z5 = z3;
                        if (composerStartRestartGroup.changed(z5)) {
                            i11 = Fields.Clip;
                        } else {
                            i11 = Fields.Shape;
                        }
                        i7 |= i11;
                    }
                    i12 = i7 | 196608;
                    if ((74899 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i13 != 0) {
                            modifier3 = Modifier.Companion;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i8 != 0) {
                            imageVector3 = null;
                        } else {
                            imageVector3 = imageVector2;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                        }
                        Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                        if (z5) {
                            f5 = 12;
                        } else {
                            f5 = 0;
                        }
                        float fM6403constructorimpl = Dp.m6403constructorimpl(f5);
                        float f6 = 16;
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6));
                        long j5 = p107y3.a.f15978a;
                        Modifier modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs, fM6403constructorimpl, roundedCornerShapeM955RoundedCornerShape0680j_4, false, j5, j5, 4, null);
                        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6));
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        Color.Companion companion = Color.Companion;
                        boolean z8 = z5;
                        ImageVector imageVector5 = imageVector3;
                        Modifier modifier5 = modifier3;
                        composer2 = composerStartRestartGroup;
                        ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default, z8, roundedCornerShapeM955RoundedCornerShape0680j_5, buttonDefaults.m1520buttonColorsro_MJ88(companion.m3962getTransparent0d7_KjU(), 0L, companion.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z8, false, imageVector5, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z8;
                        modifier4 = modifier5;
                        imageVector4 = imageVector5;
                        z7 = false;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        imageVector4 = imageVector2;
                        z6 = z5;
                        composer2 = composerStartRestartGroup;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.o
                            @Override // O3.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                                boolean z9 = z7;
                                q.a(text, onClick, modifier4, imageVector4, z6, z9, (Composer) obj, iUpdateChangedFlags, i6);
                                return B3.o.f154a;
                            }
                        });
                    }
                }
                i7 |= 24576;
                z5 = z3;
                i12 = i7 | 196608;
                if ((74899 & i12) == 74898) {
                    if (i13 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i8 != 0) {
                        imageVector3 = null;
                    } else {
                        imageVector3 = imageVector2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                    }
                    Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                    if (z5) {
                        f5 = 12;
                    } else {
                        f5 = 0;
                    }
                    float fM6403constructorimpl2 = Dp.m6403constructorimpl(f5);
                    float f7 = 16;
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f7));
                    long j6 = p107y3.a.f15978a;
                    Modifier modifierM3585shadows4CzXII$default2 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs2, fM6403constructorimpl2, roundedCornerShapeM955RoundedCornerShape0680j_6, false, j6, j6, 4, null);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f7));
                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                    Color.Companion companion2 = Color.Companion;
                    boolean z9 = z5;
                    ImageVector imageVector6 = imageVector3;
                    Modifier modifier6 = modifier3;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default2, z9, roundedCornerShapeM955RoundedCornerShape0680j_7, buttonDefaults2.m1520buttonColorsro_MJ88(companion2.m3962getTransparent0d7_KjU(), 0L, companion2.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z9, false, imageVector6, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z9;
                    modifier4 = modifier6;
                    imageVector4 = imageVector6;
                    z7 = false;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i8 != 0) {
                        imageVector3 = null;
                    } else {
                        imageVector3 = imageVector2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                    }
                    Modifier modifierM699height3ABfNKs3 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                    if (z5) {
                        f5 = 12;
                    } else {
                        f5 = 0;
                    }
                    float fM6403constructorimpl3 = Dp.m6403constructorimpl(f5);
                    float f8 = 16;
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_8 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8));
                    long j7 = p107y3.a.f15978a;
                    Modifier modifierM3585shadows4CzXII$default3 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs3, fM6403constructorimpl3, roundedCornerShapeM955RoundedCornerShape0680j_8, false, j7, j7, 4, null);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_9 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f8));
                    ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                    Color.Companion companion3 = Color.Companion;
                    boolean z10 = z5;
                    ImageVector imageVector7 = imageVector3;
                    Modifier modifier7 = modifier3;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default3, z10, roundedCornerShapeM955RoundedCornerShape0680j_9, buttonDefaults3.m1520buttonColorsro_MJ88(companion3.m3962getTransparent0d7_KjU(), 0L, companion3.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z10, false, imageVector7, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z10;
                    modifier4 = modifier7;
                    imageVector4 = imageVector7;
                    z7 = false;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.o
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            boolean z11 = z7;
                            q.a(text, onClick, modifier4, imageVector4, z6, z11, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 3072;
            imageVector2 = imageVector;
            i10 = i6 & 16;
            if (i10 != 0) {
                if ((i5 & 24576) == 0) {
                    z5 = z3;
                    if (composerStartRestartGroup.changed(z5)) {
                        i11 = Fields.Clip;
                    } else {
                        i11 = Fields.Shape;
                    }
                    i7 |= i11;
                }
                i12 = i7 | 196608;
                if ((74899 & i12) == 74898) {
                    if (i13 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i8 != 0) {
                        imageVector3 = null;
                    } else {
                        imageVector3 = imageVector2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                    }
                    Modifier modifierM699height3ABfNKs4 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                    if (z5) {
                        f5 = 12;
                    } else {
                        f5 = 0;
                    }
                    float fM6403constructorimpl4 = Dp.m6403constructorimpl(f5);
                    float f9 = 16;
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_10 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9));
                    long j8 = p107y3.a.f15978a;
                    Modifier modifierM3585shadows4CzXII$default4 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs4, fM6403constructorimpl4, roundedCornerShapeM955RoundedCornerShape0680j_10, false, j8, j8, 4, null);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_11 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9));
                    ButtonDefaults buttonDefaults4 = ButtonDefaults.INSTANCE;
                    Color.Companion companion4 = Color.Companion;
                    boolean z11 = z5;
                    ImageVector imageVector8 = imageVector3;
                    Modifier modifier8 = modifier3;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default4, z11, roundedCornerShapeM955RoundedCornerShape0680j_11, buttonDefaults4.m1520buttonColorsro_MJ88(companion4.m3962getTransparent0d7_KjU(), 0L, companion4.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z11, false, imageVector8, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z11;
                    modifier4 = modifier8;
                    imageVector4 = imageVector8;
                    z7 = false;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i8 != 0) {
                        imageVector3 = null;
                    } else {
                        imageVector3 = imageVector2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                    }
                    Modifier modifierM699height3ABfNKs5 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                    if (z5) {
                        f5 = 12;
                    } else {
                        f5 = 0;
                    }
                    float fM6403constructorimpl5 = Dp.m6403constructorimpl(f5);
                    float f10 = 16;
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_12 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f10));
                    long j9 = p107y3.a.f15978a;
                    Modifier modifierM3585shadows4CzXII$default5 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs5, fM6403constructorimpl5, roundedCornerShapeM955RoundedCornerShape0680j_12, false, j9, j9, 4, null);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_13 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f10));
                    ButtonDefaults buttonDefaults5 = ButtonDefaults.INSTANCE;
                    Color.Companion companion5 = Color.Companion;
                    boolean z12 = z5;
                    ImageVector imageVector9 = imageVector3;
                    Modifier modifier9 = modifier3;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default5, z12, roundedCornerShapeM955RoundedCornerShape0680j_13, buttonDefaults5.m1520buttonColorsro_MJ88(companion5.m3962getTransparent0d7_KjU(), 0L, companion5.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z12, false, imageVector9, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z12;
                    modifier4 = modifier9;
                    imageVector4 = imageVector9;
                    z7 = false;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.o
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            boolean z13 = z7;
                            q.a(text, onClick, modifier4, imageVector4, z6, z13, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 24576;
            z5 = z3;
            i12 = i7 | 196608;
            if ((74899 & i12) == 74898) {
                if (i13 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    imageVector3 = null;
                } else {
                    imageVector3 = imageVector2;
                }
                if (i10 != 0) {
                    z5 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                }
                Modifier modifierM699height3ABfNKs6 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                if (z5) {
                    f5 = 12;
                } else {
                    f5 = 0;
                }
                float fM6403constructorimpl6 = Dp.m6403constructorimpl(f5);
                float f11 = 16;
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_14 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11));
                long j10 = p107y3.a.f15978a;
                Modifier modifierM3585shadows4CzXII$default6 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs6, fM6403constructorimpl6, roundedCornerShapeM955RoundedCornerShape0680j_14, false, j10, j10, 4, null);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_15 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f11));
                ButtonDefaults buttonDefaults6 = ButtonDefaults.INSTANCE;
                Color.Companion companion6 = Color.Companion;
                boolean z13 = z5;
                ImageVector imageVector10 = imageVector3;
                Modifier modifier10 = modifier3;
                composer2 = composerStartRestartGroup;
                ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default6, z13, roundedCornerShapeM955RoundedCornerShape0680j_15, buttonDefaults6.m1520buttonColorsro_MJ88(companion6.m3962getTransparent0d7_KjU(), 0L, companion6.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z13, false, imageVector10, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z13;
                modifier4 = modifier10;
                imageVector4 = imageVector10;
                z7 = false;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    imageVector3 = null;
                } else {
                    imageVector3 = imageVector2;
                }
                if (i10 != 0) {
                    z5 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                }
                Modifier modifierM699height3ABfNKs7 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                if (z5) {
                    f5 = 12;
                } else {
                    f5 = 0;
                }
                float fM6403constructorimpl7 = Dp.m6403constructorimpl(f5);
                float f12 = 16;
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_16 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f12));
                long j11 = p107y3.a.f15978a;
                Modifier modifierM3585shadows4CzXII$default7 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs7, fM6403constructorimpl7, roundedCornerShapeM955RoundedCornerShape0680j_16, false, j11, j11, 4, null);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_17 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f12));
                ButtonDefaults buttonDefaults7 = ButtonDefaults.INSTANCE;
                Color.Companion companion7 = Color.Companion;
                boolean z14 = z5;
                ImageVector imageVector11 = imageVector3;
                Modifier modifier11 = modifier3;
                composer2 = composerStartRestartGroup;
                ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default7, z14, roundedCornerShapeM955RoundedCornerShape0680j_17, buttonDefaults7.m1520buttonColorsro_MJ88(companion7.m3962getTransparent0d7_KjU(), 0L, companion7.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z14, false, imageVector11, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z14;
                modifier4 = modifier11;
                imageVector4 = imageVector11;
                z7 = false;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.o
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        boolean z15 = z7;
                        q.a(text, onClick, modifier4, imageVector4, z6, z15, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 384;
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 != 0) {
            if ((i5 & 3072) == 0) {
                imageVector2 = imageVector;
                if (composerStartRestartGroup.changed(imageVector2)) {
                    i9 = Fields.CameraDistance;
                } else {
                    i9 = Fields.RotationZ;
                }
                i7 |= i9;
            }
            i10 = i6 & 16;
            if (i10 != 0) {
                if ((i5 & 24576) == 0) {
                    z5 = z3;
                    if (composerStartRestartGroup.changed(z5)) {
                        i11 = Fields.Clip;
                    } else {
                        i11 = Fields.Shape;
                    }
                    i7 |= i11;
                }
                i12 = i7 | 196608;
                if ((74899 & i12) == 74898) {
                    if (i13 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i8 != 0) {
                        imageVector3 = null;
                    } else {
                        imageVector3 = imageVector2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                    }
                    Modifier modifierM699height3ABfNKs8 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                    if (z5) {
                        f5 = 12;
                    } else {
                        f5 = 0;
                    }
                    float fM6403constructorimpl8 = Dp.m6403constructorimpl(f5);
                    float f13 = 16;
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_18 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f13));
                    long j12 = p107y3.a.f15978a;
                    Modifier modifierM3585shadows4CzXII$default8 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs8, fM6403constructorimpl8, roundedCornerShapeM955RoundedCornerShape0680j_18, false, j12, j12, 4, null);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_19 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f13));
                    ButtonDefaults buttonDefaults8 = ButtonDefaults.INSTANCE;
                    Color.Companion companion8 = Color.Companion;
                    boolean z15 = z5;
                    ImageVector imageVector12 = imageVector3;
                    Modifier modifier12 = modifier3;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default8, z15, roundedCornerShapeM955RoundedCornerShape0680j_19, buttonDefaults8.m1520buttonColorsro_MJ88(companion8.m3962getTransparent0d7_KjU(), 0L, companion8.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z15, false, imageVector12, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z15;
                    modifier4 = modifier12;
                    imageVector4 = imageVector12;
                    z7 = false;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i8 != 0) {
                        imageVector3 = null;
                    } else {
                        imageVector3 = imageVector2;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                    }
                    Modifier modifierM699height3ABfNKs9 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                    if (z5) {
                        f5 = 12;
                    } else {
                        f5 = 0;
                    }
                    float fM6403constructorimpl9 = Dp.m6403constructorimpl(f5);
                    float f14 = 16;
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_110 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14));
                    long j13 = p107y3.a.f15978a;
                    Modifier modifierM3585shadows4CzXII$default9 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs9, fM6403constructorimpl9, roundedCornerShapeM955RoundedCornerShape0680j_110, false, j13, j13, 4, null);
                    RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_111 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f14));
                    ButtonDefaults buttonDefaults9 = ButtonDefaults.INSTANCE;
                    Color.Companion companion9 = Color.Companion;
                    boolean z16 = z5;
                    ImageVector imageVector13 = imageVector3;
                    Modifier modifier13 = modifier3;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default9, z16, roundedCornerShapeM955RoundedCornerShape0680j_111, buttonDefaults9.m1520buttonColorsro_MJ88(companion9.m3962getTransparent0d7_KjU(), 0L, companion9.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z16, false, imageVector13, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z16;
                    modifier4 = modifier13;
                    imageVector4 = imageVector13;
                    z7 = false;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.o
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            boolean z17 = z7;
                            q.a(text, onClick, modifier4, imageVector4, z6, z17, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i7 |= 24576;
            z5 = z3;
            i12 = i7 | 196608;
            if ((74899 & i12) == 74898) {
                if (i13 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    imageVector3 = null;
                } else {
                    imageVector3 = imageVector2;
                }
                if (i10 != 0) {
                    z5 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                }
                Modifier modifierM699height3ABfNKs10 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                if (z5) {
                    f5 = 12;
                } else {
                    f5 = 0;
                }
                float fM6403constructorimpl10 = Dp.m6403constructorimpl(f5);
                float f15 = 16;
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_112 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f15));
                long j14 = p107y3.a.f15978a;
                Modifier modifierM3585shadows4CzXII$default10 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs10, fM6403constructorimpl10, roundedCornerShapeM955RoundedCornerShape0680j_112, false, j14, j14, 4, null);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_113 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f15));
                ButtonDefaults buttonDefaults10 = ButtonDefaults.INSTANCE;
                Color.Companion companion10 = Color.Companion;
                boolean z17 = z5;
                ImageVector imageVector14 = imageVector3;
                Modifier modifier14 = modifier3;
                composer2 = composerStartRestartGroup;
                ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default10, z17, roundedCornerShapeM955RoundedCornerShape0680j_113, buttonDefaults10.m1520buttonColorsro_MJ88(companion10.m3962getTransparent0d7_KjU(), 0L, companion10.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z17, false, imageVector14, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z17;
                modifier4 = modifier14;
                imageVector4 = imageVector14;
                z7 = false;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    imageVector3 = null;
                } else {
                    imageVector3 = imageVector2;
                }
                if (i10 != 0) {
                    z5 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                }
                Modifier modifierM699height3ABfNKs11 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                if (z5) {
                    f5 = 12;
                } else {
                    f5 = 0;
                }
                float fM6403constructorimpl11 = Dp.m6403constructorimpl(f5);
                float f16 = 16;
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_114 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16));
                long j15 = p107y3.a.f15978a;
                Modifier modifierM3585shadows4CzXII$default11 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs11, fM6403constructorimpl11, roundedCornerShapeM955RoundedCornerShape0680j_114, false, j15, j15, 4, null);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_115 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16));
                ButtonDefaults buttonDefaults11 = ButtonDefaults.INSTANCE;
                Color.Companion companion11 = Color.Companion;
                boolean z18 = z5;
                ImageVector imageVector15 = imageVector3;
                Modifier modifier15 = modifier3;
                composer2 = composerStartRestartGroup;
                ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default11, z18, roundedCornerShapeM955RoundedCornerShape0680j_115, buttonDefaults11.m1520buttonColorsro_MJ88(companion11.m3962getTransparent0d7_KjU(), 0L, companion11.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z18, false, imageVector15, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z18;
                modifier4 = modifier15;
                imageVector4 = imageVector15;
                z7 = false;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.o
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        boolean z19 = z7;
                        q.a(text, onClick, modifier4, imageVector4, z6, z19, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 3072;
        imageVector2 = imageVector;
        i10 = i6 & 16;
        if (i10 != 0) {
            if ((i5 & 24576) == 0) {
                z5 = z3;
                if (composerStartRestartGroup.changed(z5)) {
                    i11 = Fields.Clip;
                } else {
                    i11 = Fields.Shape;
                }
                i7 |= i11;
            }
            i12 = i7 | 196608;
            if ((74899 & i12) == 74898) {
                if (i13 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    imageVector3 = null;
                } else {
                    imageVector3 = imageVector2;
                }
                if (i10 != 0) {
                    z5 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                }
                Modifier modifierM699height3ABfNKs12 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                if (z5) {
                    f5 = 12;
                } else {
                    f5 = 0;
                }
                float fM6403constructorimpl12 = Dp.m6403constructorimpl(f5);
                float f17 = 16;
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_116 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f17));
                long j16 = p107y3.a.f15978a;
                Modifier modifierM3585shadows4CzXII$default12 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs12, fM6403constructorimpl12, roundedCornerShapeM955RoundedCornerShape0680j_116, false, j16, j16, 4, null);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_117 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f17));
                ButtonDefaults buttonDefaults12 = ButtonDefaults.INSTANCE;
                Color.Companion companion12 = Color.Companion;
                boolean z19 = z5;
                ImageVector imageVector16 = imageVector3;
                Modifier modifier16 = modifier3;
                composer2 = composerStartRestartGroup;
                ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default12, z19, roundedCornerShapeM955RoundedCornerShape0680j_117, buttonDefaults12.m1520buttonColorsro_MJ88(companion12.m3962getTransparent0d7_KjU(), 0L, companion12.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z19, false, imageVector16, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z19;
                modifier4 = modifier16;
                imageVector4 = imageVector16;
                z7 = false;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    imageVector3 = null;
                } else {
                    imageVector3 = imageVector2;
                }
                if (i10 != 0) {
                    z5 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
                }
                Modifier modifierM699height3ABfNKs13 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
                if (z5) {
                    f5 = 12;
                } else {
                    f5 = 0;
                }
                float fM6403constructorimpl13 = Dp.m6403constructorimpl(f5);
                float f18 = 16;
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_118 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f18));
                long j17 = p107y3.a.f15978a;
                Modifier modifierM3585shadows4CzXII$default13 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs13, fM6403constructorimpl13, roundedCornerShapeM955RoundedCornerShape0680j_118, false, j17, j17, 4, null);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_119 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f18));
                ButtonDefaults buttonDefaults13 = ButtonDefaults.INSTANCE;
                Color.Companion companion13 = Color.Companion;
                boolean z110 = z5;
                ImageVector imageVector17 = imageVector3;
                Modifier modifier17 = modifier3;
                composer2 = composerStartRestartGroup;
                ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default13, z110, roundedCornerShapeM955RoundedCornerShape0680j_119, buttonDefaults13.m1520buttonColorsro_MJ88(companion13.m3962getTransparent0d7_KjU(), 0L, companion13.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z110, false, imageVector17, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z110;
                modifier4 = modifier17;
                imageVector4 = imageVector17;
                z7 = false;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.o
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        boolean z111 = z7;
                        q.a(text, onClick, modifier4, imageVector4, z6, z111, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 24576;
        z5 = z3;
        i12 = i7 | 196608;
        if ((74899 & i12) == 74898) {
            if (i13 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i8 != 0) {
                imageVector3 = null;
            } else {
                imageVector3 = imageVector2;
            }
            if (i10 != 0) {
                z5 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
            }
            Modifier modifierM699height3ABfNKs14 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
            if (z5) {
                f5 = 12;
            } else {
                f5 = 0;
            }
            float fM6403constructorimpl14 = Dp.m6403constructorimpl(f5);
            float f19 = 16;
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1110 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f19));
            long j18 = p107y3.a.f15978a;
            Modifier modifierM3585shadows4CzXII$default14 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs14, fM6403constructorimpl14, roundedCornerShapeM955RoundedCornerShape0680j_1110, false, j18, j18, 4, null);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1111 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f19));
            ButtonDefaults buttonDefaults14 = ButtonDefaults.INSTANCE;
            Color.Companion companion14 = Color.Companion;
            boolean z111 = z5;
            ImageVector imageVector18 = imageVector3;
            Modifier modifier18 = modifier3;
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default14, z111, roundedCornerShapeM955RoundedCornerShape0680j_1111, buttonDefaults14.m1520buttonColorsro_MJ88(companion14.m3962getTransparent0d7_KjU(), 0L, companion14.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z111, false, imageVector18, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z111;
            modifier4 = modifier18;
            imageVector4 = imageVector18;
            z7 = false;
        } else {
            if (i13 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i8 != 0) {
                imageVector3 = null;
            } else {
                imageVector3 = imageVector2;
            }
            if (i10 != 0) {
                z5 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-607049155, i12, -1, "com.notescrafter.ui.components.GradientButton (GradientButton.kt:28)");
            }
            Modifier modifierM699height3ABfNKs15 = SizeKt.m699height3ABfNKs(modifier3, Dp.m6403constructorimpl(56));
            if (z5) {
                f5 = 12;
            } else {
                f5 = 0;
            }
            float fM6403constructorimpl15 = Dp.m6403constructorimpl(f5);
            float f110 = 16;
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1112 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f110));
            long j19 = p107y3.a.f15978a;
            Modifier modifierM3585shadows4CzXII$default15 = ShadowKt.m3585shadows4CzXII$default(modifierM699height3ABfNKs15, fM6403constructorimpl15, roundedCornerShapeM955RoundedCornerShape0680j_1112, false, j19, j19, 4, null);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_1113 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f110));
            ButtonDefaults buttonDefaults15 = ButtonDefaults.INSTANCE;
            Color.Companion companion15 = Color.Companion;
            boolean z112 = z5;
            ImageVector imageVector19 = imageVector3;
            Modifier modifier19 = modifier3;
            composer2 = composerStartRestartGroup;
            ButtonKt.Button(onClick, modifierM3585shadows4CzXII$default15, z112, roundedCornerShapeM955RoundedCornerShape0680j_1113, buttonDefaults15.m1520buttonColorsro_MJ88(companion15.m3962getTransparent0d7_KjU(), 0L, companion15.m3962getTransparent0d7_KjU(), 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m661PaddingValues0680j_4(Dp.m6403constructorimpl(0)), null, ComposableLambdaKt.rememberComposableLambda(348999213, true, new p(z112, false, imageVector19, text), composerStartRestartGroup, 54), composerStartRestartGroup, ((i12 >> 3) & 14) | 817889280 | ((i12 >> 6) & 896), 352);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z112;
            modifier4 = modifier19;
            imageVector4 = imageVector19;
            z7 = false;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.o
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    boolean z113 = z7;
                    q.a(text, onClick, modifier4, imageVector4, z6, z113, (Composer) obj, iUpdateChangedFlags, i6);
                    return B3.o.f154a;
                }
            });
        }
    }
}

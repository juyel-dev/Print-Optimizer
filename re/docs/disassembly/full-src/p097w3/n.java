package p097w3;

import O3.a;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void a(final a onDismissRequest, Modifier modifier, long j5, DialogProperties dialogProperties, final ComposableLambda content, Composer composer, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        DialogProperties dialogProperties2;
        int i10;
        Modifier modifier3;
        DialogProperties dialogProperties3;
        final Modifier modifier4;
        final long j6;
        final DialogProperties dialogProperties4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        o.f(onDismissRequest, "onDismissRequest");
        o.f(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1138997957);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i12 = i6 & 2;
        if (i12 == 0) {
            if ((i5 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i8 = i7 | 384;
            i9 = i6 & 8;
            if (i9 != 0) {
                if ((i5 & 3072) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                        i10 = Fields.CameraDistance;
                    } else {
                        i10 = Fields.RotationZ;
                    }
                    i8 |= i10;
                }
                if ((i5 & 24576) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i11 = Fields.Clip;
                    } else {
                        i11 = Fields.Shape;
                    }
                    i8 |= i11;
                }
                if ((i8 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i12 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    long j7 = p107y3.a.f15993v;
                    if (i9 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, false, 7, (AbstractC2168g) null);
                    } else {
                        dialogProperties3 = dialogProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1138997957, i8, -1, "com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21)");
                    }
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(904865500, true, new m(modifier3, j7, content), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 384 | ((i8 >> 6) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j6 = j7;
                    dialogProperties4 = dialogProperties3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    dialogProperties4 = dialogProperties2;
                    modifier4 = modifier2;
                    j6 = j5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.k
                        @Override // O3.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                            ComposableLambda composableLambda = content;
                            n.a(onDismissRequest, modifier4, j6, dialogProperties4, composableLambda, (Composer) obj, iUpdateChangedFlags, i6);
                            return B3.o.f154a;
                        }
                    });
                }
            }
            i8 = i7 | 3456;
            dialogProperties2 = dialogProperties;
            if ((i5 & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i11 = Fields.Clip;
                } else {
                    i11 = Fields.Shape;
                }
                i8 |= i11;
            }
            if ((i8 & 9363) == 9362) {
                if (i12 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                long j8 = p107y3.a.f15993v;
                if (i9 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, false, 7, (AbstractC2168g) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1138997957, i8, -1, "com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21)");
                }
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(904865500, true, new m(modifier3, j8, content), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 384 | ((i8 >> 6) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j6 = j8;
                dialogProperties4 = dialogProperties3;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                long j9 = p107y3.a.f15993v;
                if (i9 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, false, 7, (AbstractC2168g) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1138997957, i8, -1, "com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21)");
                }
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(904865500, true, new m(modifier3, j9, content), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 384 | ((i8 >> 6) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j6 = j9;
                dialogProperties4 = dialogProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.k
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        ComposableLambda composableLambda = content;
                        n.a(onDismissRequest, modifier4, j6, dialogProperties4, composableLambda, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i7 |= 48;
        modifier2 = modifier;
        i8 = i7 | 384;
        i9 = i6 & 8;
        if (i9 != 0) {
            if ((i5 & 3072) == 0) {
                dialogProperties2 = dialogProperties;
                if (composerStartRestartGroup.changed(dialogProperties2)) {
                    i10 = Fields.CameraDistance;
                } else {
                    i10 = Fields.RotationZ;
                }
                i8 |= i10;
            }
            if ((i5 & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i11 = Fields.Clip;
                } else {
                    i11 = Fields.Shape;
                }
                i8 |= i11;
            }
            if ((i8 & 9363) == 9362) {
                if (i12 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                long j10 = p107y3.a.f15993v;
                if (i9 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, false, 7, (AbstractC2168g) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1138997957, i8, -1, "com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21)");
                }
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(904865500, true, new m(modifier3, j10, content), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 384 | ((i8 >> 6) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j6 = j10;
                dialogProperties4 = dialogProperties3;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                long j11 = p107y3.a.f15993v;
                if (i9 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, false, 7, (AbstractC2168g) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1138997957, i8, -1, "com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21)");
                }
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(904865500, true, new m(modifier3, j11, content), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 384 | ((i8 >> 6) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j6 = j11;
                dialogProperties4 = dialogProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.k
                    @Override // O3.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                        ComposableLambda composableLambda = content;
                        n.a(onDismissRequest, modifier4, j6, dialogProperties4, composableLambda, (Composer) obj, iUpdateChangedFlags, i6);
                        return B3.o.f154a;
                    }
                });
            }
        }
        i8 = i7 | 3456;
        dialogProperties2 = dialogProperties;
        if ((i5 & 24576) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i11 = Fields.Clip;
            } else {
                i11 = Fields.Shape;
            }
            i8 |= i11;
        }
        if ((i8 & 9363) == 9362) {
            if (i12 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            long j12 = p107y3.a.f15993v;
            if (i9 != 0) {
                dialogProperties3 = new DialogProperties(false, false, false, 7, (AbstractC2168g) null);
            } else {
                dialogProperties3 = dialogProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1138997957, i8, -1, "com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21)");
            }
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(904865500, true, new m(modifier3, j12, content), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 384 | ((i8 >> 6) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j6 = j12;
            dialogProperties4 = dialogProperties3;
        } else {
            if (i12 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            long j13 = p107y3.a.f15993v;
            if (i9 != 0) {
                dialogProperties3 = new DialogProperties(false, false, false, 7, (AbstractC2168g) null);
            } else {
                dialogProperties3 = dialogProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1138997957, i8, -1, "com.notescrafter.ui.components.GlassDialog (GlassDialog.kt:21)");
            }
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties3, ComposableLambdaKt.rememberComposableLambda(904865500, true, new m(modifier3, j13, content), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 384 | ((i8 >> 6) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j6 = j13;
            dialogProperties4 = dialogProperties3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: w3.k
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i5 | 1);
                    ComposableLambda composableLambda = content;
                    n.a(onDismissRequest, modifier4, j6, dialogProperties4, composableLambda, (Composer) obj, iUpdateChangedFlags, i6);
                    return B3.o.f154a;
                }
            });
        }
    }
}

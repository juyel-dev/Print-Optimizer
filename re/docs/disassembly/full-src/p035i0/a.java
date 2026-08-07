package p035i0;

import O3.e;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static float A(float f5, float f6, float f7, float f8) {
        return ((f5 * f6) + f7) * f8;
    }

    public static int B(int i5, int i6, float f5) {
        return (Dp.m6409hashCodeimpl(f5) + i5) * i6;
    }

    public static float a(float f5, float f6, float f7, float f8) {
        return ((f5 - f6) * f7) + f8;
    }

    public static int b(int i5, int i6, float f5) {
        return (Float.hashCode(f5) + i5) * i6;
    }

    public static int c(int i5, int i6, int i7) {
        return (Integer.hashCode(i5) + i6) * i7;
    }

    public static int d(int i5, int i6, boolean z3) {
        return (Boolean.hashCode(z3) + i5) * i6;
    }

    public static int e(long j5, int i5, int i6) {
        return (Color.m3934hashCodeimpl(j5) + i5) * i6;
    }

    public static int f(TextFieldPreparedSelection textFieldPreparedSelection, TextFieldPreparedSelection textFieldPreparedSelection2) {
        textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        return textFieldPreparedSelection2.text.length();
    }

    public static e g(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m3414setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m3414setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static ValueElementSequence h(float f5, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Dp.m6401boximpl(f5));
        return inspectorInfo.getProperties();
    }

    public static ValueElementSequence i(boolean z3, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z3));
        return inspectorInfo.getProperties();
    }

    public static String j(String str, int i5, char c5) {
        return str + i5 + c5;
    }

    public static String k(String str, int i5, String str2) {
        return str + i5 + str2;
    }

    public static String l(String str, int i5, String str2, int i6, String str3) {
        return str + i5 + str2 + i6 + str3;
    }

    public static String m(String str, String str2, int i5, int i6) {
        return str + i5 + str2 + i6;
    }

    public static String n(StringBuilder sb, float f5, char c5) {
        sb.append(f5);
        sb.append(c5);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, char c5) {
        sb.append(str);
        sb.append(c5);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder q(String str, int i5, String str2, int i6, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i5);
        sb.append(str2);
        sb.append(i6);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void s(float f5, StringBuilder sb, String str) {
        sb.append((Object) Dp.m6414toStringimpl(f5));
        sb.append(str);
    }

    public static void t(int i5, Composer composer, int i6, e eVar) {
        composer.updateRememberedValue(Integer.valueOf(i5));
        composer.apply(Integer.valueOf(i6), eVar);
    }

    public static void u(long j5, StringBuilder sb, String str) {
        sb.append((Object) Color.m3935toStringimpl(j5));
        sb.append(str);
    }

    public static void v(DrawContext drawContext, long j5) {
        drawContext.getCanvas().restore();
        drawContext.mo4399setSizeuvyYCjk(j5);
    }

    public static void w(ComposeUiNode.Companion companion, Composer composer, Modifier modifier, Composer composer2, int i5) {
        Updater.m3414setimpl(composer, modifier, companion.getSetModifier());
        composer2.startReplaceGroup(i5);
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static boolean y(e eVar, Composer composer, int i5) {
        eVar.invoke(composer, Integer.valueOf(i5));
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static boolean z(Composer composer) {
        composer.endReplaceGroup();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }
}

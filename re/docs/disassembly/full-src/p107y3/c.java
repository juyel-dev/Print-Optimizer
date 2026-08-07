package p107y3;

import androidx.compose.material3.Typography;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC2168g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Typography f15998a;

    static {
        FontFamily.Companion companion = FontFamily.Companion;
        SystemFontFamily systemFontFamily = companion.getDefault();
        FontWeight.Companion companion2 = FontWeight.Companion;
        FontWeight bold = companion2.getBold();
        TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(40), bold, (FontStyle) null, (FontSynthesis) null, systemFontFamily, (String) null, TextUnitKt.getSp(-0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(48), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily2 = companion.getDefault();
        FontWeight bold2 = companion2.getBold();
        TextStyle textStyle2 = new TextStyle(0L, TextUnitKt.getSp(32), bold2, (FontStyle) null, (FontSynthesis) null, systemFontFamily2, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(40), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily3 = companion.getDefault();
        FontWeight bold3 = companion2.getBold();
        TextStyle textStyle3 = new TextStyle(0L, TextUnitKt.getSp(28), bold3, (FontStyle) null, (FontSynthesis) null, systemFontFamily3, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(36), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily4 = companion.getDefault();
        FontWeight semiBold = companion2.getSemiBold();
        TextStyle textStyle4 = new TextStyle(0L, TextUnitKt.getSp(24), semiBold, (FontStyle) null, (FontSynthesis) null, systemFontFamily4, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(32), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily5 = companion.getDefault();
        FontWeight semiBold2 = companion2.getSemiBold();
        TextStyle textStyle5 = new TextStyle(0L, TextUnitKt.getSp(20), semiBold2, (FontStyle) null, (FontSynthesis) null, systemFontFamily5, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(28), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily6 = companion.getDefault();
        FontWeight semiBold3 = companion2.getSemiBold();
        TextStyle textStyle6 = new TextStyle(0L, TextUnitKt.getSp(18), semiBold3, (FontStyle) null, (FontSynthesis) null, systemFontFamily6, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily7 = companion.getDefault();
        FontWeight medium = companion2.getMedium();
        TextStyle textStyle7 = new TextStyle(0L, TextUnitKt.getSp(18), medium, (FontStyle) null, (FontSynthesis) null, systemFontFamily7, (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily8 = companion.getDefault();
        FontWeight medium2 = companion2.getMedium();
        TextStyle textStyle8 = new TextStyle(0L, TextUnitKt.getSp(16), medium2, (FontStyle) null, (FontSynthesis) null, systemFontFamily8, (String) null, TextUnitKt.getSp(0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily9 = companion.getDefault();
        FontWeight medium3 = companion2.getMedium();
        TextStyle textStyle9 = new TextStyle(0L, TextUnitKt.getSp(14), medium3, (FontStyle) null, (FontSynthesis) null, systemFontFamily9, (String) null, TextUnitKt.getSp(0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily10 = companion.getDefault();
        FontWeight normal = companion2.getNormal();
        TextStyle textStyle10 = new TextStyle(0L, TextUnitKt.getSp(16), normal, (FontStyle) null, (FontSynthesis) null, systemFontFamily10, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily11 = companion.getDefault();
        FontWeight normal2 = companion2.getNormal();
        TextStyle textStyle11 = new TextStyle(0L, TextUnitKt.getSp(14), normal2, (FontStyle) null, (FontSynthesis) null, systemFontFamily11, (String) null, TextUnitKt.getSp(0.25d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily12 = companion.getDefault();
        FontWeight normal3 = companion2.getNormal();
        TextStyle textStyle12 = new TextStyle(0L, TextUnitKt.getSp(12), normal3, (FontStyle) null, (FontSynthesis) null, systemFontFamily12, (String) null, TextUnitKt.getSp(0.4d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily13 = companion.getDefault();
        FontWeight medium4 = companion2.getMedium();
        TextStyle textStyle13 = new TextStyle(0L, TextUnitKt.getSp(14), medium4, (FontStyle) null, (FontSynthesis) null, systemFontFamily13, (String) null, TextUnitKt.getSp(0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily14 = companion.getDefault();
        FontWeight medium5 = companion2.getMedium();
        TextStyle textStyle14 = new TextStyle(0L, TextUnitKt.getSp(12), medium5, (FontStyle) null, (FontSynthesis) null, systemFontFamily14, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null);
        SystemFontFamily systemFontFamily15 = companion.getDefault();
        FontWeight medium6 = companion2.getMedium();
        f15998a = new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, new TextStyle(0L, TextUnitKt.getSp(10), medium6, (FontStyle) null, (FontSynthesis) null, systemFontFamily15, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(14), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (AbstractC2168g) null));
    }
}

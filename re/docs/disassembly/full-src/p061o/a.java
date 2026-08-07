package p061o;

import androidx.compose.ui.graphics.vector.PathBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineToRelative(f8);
    }

    public static void B(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineTo(f8);
        pathBuilder.close();
    }

    public static void C(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineToRelative(f8);
    }

    public static PathBuilder a(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.lineTo(f7, f8);
        pathBuilder.verticalLineTo(f9);
        return pathBuilder;
    }

    public static List b(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineToRelative(f8);
        pathBuilder.horizontalLineTo(f9);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List c(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.lineTo(f6, f7);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List d(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineTo(f8);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void e(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.close();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineTo(f7);
    }

    public static void f(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineTo(f8);
    }

    public static void g(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static PathBuilder h(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineToRelative(f8);
        pathBuilder.verticalLineTo(f9);
        return pathBuilder;
    }

    public static void i(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.close();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
    }

    public static void j(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.close();
        pathBuilder.moveTo(f6, f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static void k(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.close();
    }

    public static void l(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static PathBuilder m(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.lineTo(f7, f8);
        pathBuilder.horizontalLineToRelative(f9);
        return pathBuilder;
    }

    public static void n(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.lineTo(f6, f7);
        pathBuilder.close();
    }

    public static void o(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.close();
        pathBuilder.moveTo(f6, f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static PathBuilder p(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.lineToRelative(f7, f8);
        pathBuilder.horizontalLineTo(f9);
        return pathBuilder;
    }

    public static void q(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineTo(f6);
        pathBuilder.verticalLineTo(f7);
    }

    public static void r(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.close();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static PathBuilder s(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.verticalLineToRelative(f9);
        return pathBuilder;
    }

    public static void t(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineTo(f6);
        pathBuilder.verticalLineToRelative(f7);
    }

    public static void u(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.lineTo(f7, f8);
        pathBuilder.close();
    }

    public static PathBuilder v(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineToRelative(f8);
        pathBuilder.verticalLineTo(f9);
        return pathBuilder;
    }

    public static void w(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.close();
    }

    public static void x(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineToRelative(f8);
    }

    public static PathBuilder y(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.lineTo(f8, f9);
        return pathBuilder;
    }

    public static void z(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineToRelative(f8);
    }
}

package p076s;

import androidx.compose.ui.graphics.vector.PathBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.lineToRelative(f6, f7);
        pathBuilder.verticalLineToRelative(f8);
    }

    public static void B(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.lineTo(f6, f7);
        pathBuilder.verticalLineTo(f8);
    }

    public static void C(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.lineTo(f7, f8);
        pathBuilder.close();
    }

    public static void D(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.close();
    }

    public static PathBuilder a(float f5, float f6, float f7, float f8) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineToRelative(f8);
        return pathBuilder;
    }

    public static PathBuilder b(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.verticalLineToRelative(f9);
        return pathBuilder;
    }

    public static List c(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List d(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineTo(f8);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void e(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.horizontalLineTo(f6);
        pathBuilder.verticalLineToRelative(f7);
    }

    public static void f(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.lineToRelative(f6, f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static PathBuilder g(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineTo(f8);
        pathBuilder.horizontalLineToRelative(f9);
        return pathBuilder;
    }

    public static List h(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List i(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void j(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.horizontalLineTo(f7);
    }

    public static void k(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineTo(f6);
        pathBuilder.lineToRelative(f7, f8);
    }

    public static void l(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.lineToRelative(f6, f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.close();
    }

    public static void m(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineTo(f8);
    }

    public static void n(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.lineToRelative(f6, f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static void o(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.lineTo(f6, f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static PathBuilder p(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineToRelative(f8);
        pathBuilder.horizontalLineTo(f9);
        return pathBuilder;
    }

    public static List q(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List r(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.lineToRelative(f6, f7);
        pathBuilder.verticalLineTo(f8);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void s(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.close();
    }

    public static void t(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineTo(f8);
    }

    public static void u(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineTo(f7);
    }

    public static void v(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.close();
    }

    public static void w(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.lineTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.close();
    }

    public static void x(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.lineToRelative(f6, f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static void y(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineToRelative(f7);
    }

    public static void z(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.close();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineToRelative(f8);
    }
}

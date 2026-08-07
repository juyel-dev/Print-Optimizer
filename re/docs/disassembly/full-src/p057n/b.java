package p057n;

import androidx.compose.ui.graphics.vector.PathBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static void A(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.close();
        pathBuilder.moveTo(f7, f8);
    }

    public static void B(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.lineToRelative(f7, f8);
        pathBuilder.close();
    }

    public static void C(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static void D(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static PathBuilder a(float f5, float f6) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        return pathBuilder;
    }

    public static PathBuilder b(float f5, float f6, float f7, float f8) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineToRelative(f8);
        return pathBuilder;
    }

    public static PathBuilder c(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineToRelative(f8);
        pathBuilder.horizontalLineToRelative(f9);
        return pathBuilder;
    }

    public static List d(PathBuilder pathBuilder, float f5) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List e(PathBuilder pathBuilder, float f5, float f6) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List f(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List g(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineTo(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineToRelative(f8);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void h(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.close();
        pathBuilder.moveTo(f6, f7);
    }

    public static void i(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static PathBuilder j(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineToRelative(f8);
        pathBuilder.horizontalLineToRelative(f9);
        pathBuilder.close();
        return pathBuilder;
    }

    public static List k(PathBuilder pathBuilder, float f5) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List l(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.lineToRelative(f6, f7);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static List m(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void n(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.close();
    }

    public static void o(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.close();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineToRelative(f8);
    }

    public static void p(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineTo(f5, f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineTo(f8);
    }

    public static void q(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineToRelative(f8);
    }

    public static void r(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static void s(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static void t(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.lineTo(f6, f7);
        pathBuilder.horizontalLineToRelative(f8);
        pathBuilder.close();
    }

    public static void u(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.close();
    }

    public static void v(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineTo(f5, f6);
        pathBuilder.lineTo(f7, f8);
        pathBuilder.close();
    }

    public static void w(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineTo(f7);
    }

    public static void x(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.verticalLineToRelative(f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static void y(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineTo(f5, f6);
        pathBuilder.horizontalLineToRelative(f7);
        pathBuilder.verticalLineToRelative(f8);
    }

    public static void z(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.close();
        pathBuilder.moveTo(f7, f8);
    }
}

package p076s;

import android.os.Parcel;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.razorpay.AppSignatureHelper;
import p008b2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static void A(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineTo(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineTo(f8);
        pathBuilder.close();
    }

    public static void B(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineTo(f8);
        pathBuilder.close();
    }

    public static void C(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.lineTo(f6, f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static /* synthetic */ String D(int i5) {
        switch (i5) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static long a(float f5, Modifier.Companion companion, Composer composer, int i5, Color.Companion companion2) {
        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, i5);
        return companion2.m3964getWhite0d7_KjU();
    }

    public static MutableState b(int i5, SnapshotMutationPolicy snapshotMutationPolicy, int i6, Object obj, Composer composer) {
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i5), snapshotMutationPolicy, i6, obj);
        composer.updateRememberedValue(mutableStateMutableStateOf$default);
        return mutableStateMutableStateOf$default;
    }

    public static Alignment.Vertical c(ComposeUiNode.Companion companion, Composer composer, Modifier modifier, Alignment.Companion companion2) {
        Updater.m3414setimpl(composer, modifier, companion.getSetModifier());
        return companion2.getCenterVertically();
    }

    public static Modifier d(float f5, Modifier.Companion companion) {
        return ClipKt.clip(companion, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f5)));
    }

    public static Modifier e(float f5, Modifier modifier, float f6, long j5) {
        return BorderKt.m220borderxT4_qwU(modifier, f6, j5, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f5)));
    }

    public static Modifier f(float f5, Modifier modifier, long j5) {
        return BackgroundKt.m206backgroundbw27NRU(modifier, j5, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f5)));
    }

    public static Modifier g(Modifier modifier, float f5) {
        return ClipKt.clip(modifier, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f5)));
    }

    public static PathBuilder h(float f5, float f6, float f7, float f8, float f9) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f5, f6);
        pathBuilder.horizontalLineTo(f7);
        pathBuilder.verticalLineTo(f8);
        pathBuilder.horizontalLineTo(f9);
        return pathBuilder;
    }

    public static a i(Parcel parcel) {
        a aVarP2 = p008b2.b.P2(parcel.readStrongBinder());
        parcel.recycle();
        return aVarP2;
    }

    public static Object j(int i5, Composer composer, int i6) {
        composer.startReplaceGroup(i5);
        composer.startReplaceGroup(i6);
        return composer.rememberedValue();
    }

    public static Object k(Composer composer, int i5) {
        composer.endReplaceGroup();
        composer.startReplaceGroup(i5);
        return composer.rememberedValue();
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static void m(float f5, Modifier.Companion companion, Composer composer, int i5) {
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, i5);
    }

    public static void n(Composer composer, float f5, Modifier.Companion companion, Composer composer2, int i5) {
        composer.endNode();
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, i5);
    }

    public static void o(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineTo(f6);
        pathBuilder.horizontalLineTo(f7);
    }

    public static void p(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.horizontalLineToRelative(f6);
        pathBuilder.lineToRelative(f7, f8);
    }

    public static boolean q(float f5, Modifier.Companion companion, Composer composer, int i5) {
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer, i5);
        return ComposerKt.isTraceInProgress();
    }

    public static void r(Composer composer, float f5, Modifier.Companion companion, Composer composer2, int i5) {
        composer.endNode();
        composer.endNode();
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, i5);
    }

    public static void s(PathBuilder pathBuilder, float f5, float f6, float f7) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.horizontalLineTo(f6);
        pathBuilder.verticalLineTo(f7);
    }

    public static void t(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.lineToRelative(f5, f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static void u(Composer composer, float f5, Modifier.Companion companion, Composer composer2, int i5) {
        composer.endNode();
        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, i5);
    }

    public static void v(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.close();
        pathBuilder.moveTo(f6, f7);
        pathBuilder.verticalLineTo(f8);
    }

    public static void w(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineToRelative(f5);
        pathBuilder.lineToRelative(f6, f7);
        pathBuilder.verticalLineTo(f8);
        pathBuilder.close();
    }

    public static void x(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.verticalLineTo(f5);
        pathBuilder.horizontalLineTo(f6);
        pathBuilder.verticalLineTo(f7);
        pathBuilder.horizontalLineToRelative(f8);
    }

    public static void y(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineTo(f5);
        pathBuilder.lineTo(f6, f7);
        pathBuilder.horizontalLineTo(f8);
    }

    public static void z(PathBuilder pathBuilder, float f5, float f6, float f7, float f8) {
        pathBuilder.horizontalLineToRelative(f5);
        pathBuilder.verticalLineToRelative(f6);
        pathBuilder.lineToRelative(f7, f8);
        pathBuilder.close();
    }
}

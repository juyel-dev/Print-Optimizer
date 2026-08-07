package p087u3;

import android.graphics.RectF;
import androidx.compose.ui.graphics.Fields;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final int $stable = 8;
    private final int backgroundThreshold;
    private final boolean blackAndWhite;
    private final boolean clearBackground;
    private final boolean grayscale;
    private final boolean invertColors;
    private final RectF logoBox;
    private final String logoShape;
    private final boolean removeLogo;

    public b() {
        this(false, false, false, false, 0, false, null, null, 255, null);
    }

    public final boolean component1() {
        return this.invertColors;
    }

    public final boolean component2() {
        return this.clearBackground;
    }

    public final boolean component3() {
        return this.grayscale;
    }

    public final boolean component4() {
        return this.blackAndWhite;
    }

    public final int component5() {
        return this.backgroundThreshold;
    }

    public final boolean component6() {
        return this.removeLogo;
    }

    public final RectF component7() {
        return this.logoBox;
    }

    public final String component8() {
        return this.logoShape;
    }

    public final b copy(boolean z3, boolean z4, boolean z5, boolean z6, int i5, boolean z7, RectF rectF, String logoShape) {
        o.f(logoShape, "logoShape");
        return new b(z3, z4, z5, z6, i5, z7, rectF, logoShape);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.invertColors == bVar.invertColors && this.clearBackground == bVar.clearBackground && this.grayscale == bVar.grayscale && this.blackAndWhite == bVar.blackAndWhite && this.backgroundThreshold == bVar.backgroundThreshold && this.removeLogo == bVar.removeLogo && o.b(this.logoBox, bVar.logoBox) && o.b(this.logoShape, bVar.logoShape);
    }

    public final int getBackgroundThreshold() {
        return this.backgroundThreshold;
    }

    public final boolean getBlackAndWhite() {
        return this.blackAndWhite;
    }

    public final boolean getClearBackground() {
        return this.clearBackground;
    }

    public final boolean getGrayscale() {
        return this.grayscale;
    }

    public final boolean getInvertColors() {
        return this.invertColors;
    }

    public final RectF getLogoBox() {
        return this.logoBox;
    }

    public final String getLogoShape() {
        return this.logoShape;
    }

    public final boolean getRemoveLogo() {
        return this.removeLogo;
    }

    public int hashCode() {
        int iD = a.d(a.c(this.backgroundThreshold, a.d(a.d(a.d(Boolean.hashCode(this.invertColors) * 31, 31, this.clearBackground), 31, this.grayscale), 31, this.blackAndWhite), 31), 31, this.removeLogo);
        RectF rectF = this.logoBox;
        return this.logoShape.hashCode() + ((iD + (rectF == null ? 0 : rectF.hashCode())) * 31);
    }

    public String toString() {
        return "FilterSettings(invertColors=" + this.invertColors + ", clearBackground=" + this.clearBackground + ", grayscale=" + this.grayscale + ", blackAndWhite=" + this.blackAndWhite + ", backgroundThreshold=" + this.backgroundThreshold + ", removeLogo=" + this.removeLogo + ", logoBox=" + this.logoBox + ", logoShape=" + this.logoShape + ")";
    }

    public b(boolean z3, boolean z4, boolean z5, boolean z6, int i5, boolean z7, RectF rectF, String logoShape) {
        o.f(logoShape, "logoShape");
        this.invertColors = z3;
        this.clearBackground = z4;
        this.grayscale = z5;
        this.blackAndWhite = z6;
        this.backgroundThreshold = i5;
        this.removeLogo = z7;
        this.logoBox = rectF;
        this.logoShape = logoShape;
    }

    public /* synthetic */ b(boolean z3, boolean z4, boolean z5, boolean z6, int i5, boolean z7, RectF rectF, String str, int i6, AbstractC2168g abstractC2168g) {
        this((i6 & 1) != 0 ? true : z3, (i6 & 2) == 0 ? z4 : true, (i6 & 4) != 0 ? false : z5, (i6 & 8) != 0 ? false : z6, (i6 & 16) != 0 ? 180 : i5, (i6 & 32) == 0 ? z7 : false, (i6 & 64) != 0 ? null : rectF, (i6 & Fields.SpotShadowColor) != 0 ? "rectangle" : str);
    }
}

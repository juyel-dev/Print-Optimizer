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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b() {
        this(false, false, false, false, 0, false, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component1() {
        return this.invertColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component2() {
        return this.clearBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component3() {
        return this.grayscale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component4() {
        return this.blackAndWhite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int component5() {
        return this.backgroundThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component6() {
        return this.removeLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RectF component7() {
        return this.logoBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component8() {
        return this.logoShape;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final b copy(boolean z3, boolean z4, boolean z5, boolean z6, int i5, boolean z7, RectF rectF, String logoShape) {
        o.f(logoShape, "logoShape");
        return new b(z3, z4, z5, z6, i5, z7, rectF, logoShape);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getBackgroundThreshold() {
        return this.backgroundThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getBlackAndWhite() {
        return this.blackAndWhite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getClearBackground() {
        return this.clearBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getGrayscale() {
        return this.grayscale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getInvertColors() {
        return this.invertColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RectF getLogoBox() {
        return this.logoBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getLogoShape() {
        return this.logoShape;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getRemoveLogo() {
        return this.removeLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iD = a.d(a.c(this.backgroundThreshold, a.d(a.d(a.d(Boolean.hashCode(this.invertColors) * 31, 31, this.clearBackground), 31, this.grayscale), 31, this.blackAndWhite), 31), 31, this.removeLogo);
        RectF rectF = this.logoBox;
        return this.logoShape.hashCode() + ((iD + (rectF == null ? 0 : rectF.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "FilterSettings(invertColors=" + this.invertColors + ", clearBackground=" + this.clearBackground + ", grayscale=" + this.grayscale + ", blackAndWhite=" + this.blackAndWhite + ", backgroundThreshold=" + this.backgroundThreshold + ", removeLogo=" + this.removeLogo + ", logoBox=" + this.logoBox + ", logoShape=" + this.logoShape + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap boolean:?: TERNARY null = ((wrap int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap boolean:?: TERNARY null = ((wrap int:0x000a: ARITH (r17v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r10v0 boolean) : true)
  (wrap boolean:?: TERNARY null = ((wrap int:0x0010: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap boolean:?: TERNARY null = ((wrap int:0x0018: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap int:?: TERNARY null = ((wrap int:0x001f: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (180 int) : (r13v0 int))
  (wrap boolean:?: TERNARY null = ((wrap int:0x0027: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r14v0 boolean) : false)
  (wrap android.graphics.RectF:?: TERNARY null = ((wrap int:0x002d: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.RectF) : (r15v0 android.graphics.RectF))
  (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0034: ARITH (r17v0 int) & (wrap ??:SGET  A[WRAPPED] androidx.compose.ui.graphics.Fields.SpotShadowColor int) A[WRAPPED]) != (0 int)) ? ("rectangle") : (r16v0 java.lang.String))
 A[MD:(boolean, boolean, boolean, boolean, int, boolean, android.graphics.RectF, java.lang.String):void (m)] (LINE:12) call: u3.b.<init>(boolean, boolean, boolean, boolean, int, boolean, android.graphics.RectF, java.lang.String):void type: THIS */
    public /* synthetic */ b(boolean z3, boolean z4, boolean z5, boolean z6, int i5, boolean z7, RectF rectF, String str, int i6, AbstractC2168g abstractC2168g) {
        this((i6 & 1) != 0 ? true : z3, (i6 & 2) == 0 ? z4 : true, (i6 & 4) != 0 ? false : z5, (i6 & 8) != 0 ? false : z6, (i6 & 16) != 0 ? 180 : i5, (i6 & 32) == 0 ? z7 : false, (i6 & 64) != 0 ? null : rectF, (i6 & Fields.SpotShadowColor) != 0 ? "rectangle" : str);
    }
}

package p108z;

import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f16022k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16026d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f16027f;
    public final float[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f16028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f16029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f16030j;

    static {
        float[] fArr = b.f16006c;
        float fH = (float) ((((double) b.h()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f16004a;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr3[0] * f5;
        float f7 = fArr[1];
        float f8 = (fArr3[1] * f7) + f6;
        float f9 = fArr[2];
        float f10 = (fArr3[2] * f9) + f8;
        float[] fArr4 = fArr2[1];
        float f11 = (fArr4[2] * f9) + (fArr4[1] * f7) + (fArr4[0] * f5);
        float[] fArr5 = fArr2[2];
        float f12 = (f9 * fArr5[2]) + (f7 * fArr5[1]) + (f5 * fArr5[0]);
        float f13 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fH) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = fExp;
        if (d4 > 1.0d) {
            fExp = 1.0f;
        } else if (d4 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp};
        float f14 = 1.0f / ((5.0f * fH) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float fCbrt = (0.1f * f16 * f16 * ((float) Math.cbrt(((double) fH) * 5.0d))) + (f15 * fH);
        float fH2 = b.h() / fArr[1];
        double d5 = fH2;
        float fSqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f11)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f12)) / 100.0d, 0.42d)};
        float f17 = fArr7[0];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[1];
        float f20 = (f19 * 400.0f) / (f19 + 27.13f);
        float f21 = fArr7[2];
        float[] fArr8 = {f18, f20, (400.0f * f21) / (f21 + 27.13f)};
        f16022k = new l(fH2, a.A(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], fPow), fPow, fPow, f13, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public l(float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr, float f11, float f12, float f13) {
        this.f16027f = f5;
        this.f16023a = f6;
        this.f16024b = f7;
        this.f16025c = f8;
        this.f16026d = f9;
        this.e = f10;
        this.g = fArr;
        this.f16028h = f11;
        this.f16029i = f12;
        this.f16030j = f13;
    }
}

package p051l3;

import java.io.IOException;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11841a;

    @Override // p051l3.p
    public final Object a(p079s3.a aVar) {
        switch (this.f11841a) {
            case 0:
                if (aVar.L() != 9) {
                    return Double.valueOf(aVar.C());
                }
                aVar.H();
                return null;
            default:
                if (aVar.L() != 9) {
                    return Float.valueOf((float) aVar.C());
                }
                aVar.H();
                return null;
        }
    }

    @Override // p051l3.p
    public final void b(b bVar, Object obj) throws IOException {
        switch (this.f11841a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    d.a(dDoubleValue);
                    bVar.B(dDoubleValue);
                } else {
                    bVar.y();
                }
                break;
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    d.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    bVar.D(numberValueOf);
                } else {
                    bVar.y();
                }
                break;
        }
    }
}

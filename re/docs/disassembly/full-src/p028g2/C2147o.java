package p028g2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p035i0.a;

/* JADX INFO: renamed from: g2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2147o implements Parcelable {
    public static final Parcelable.Creator<C2147o> CREATOR = new U(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Enum f11219o;

    /* JADX WARN: Multi-variable type inference failed */
    public C2147o(InterfaceC2133a interfaceC2133a) {
        this.f11219o = (Enum) interfaceC2133a;
    }

    public static C2147o a(int i5) throws C2146n {
        InterfaceC2133a interfaceC2133a;
        if (i5 != -262) {
            for (C c5 : C.values()) {
                if (c5.f11175o == i5) {
                    interfaceC2133a = c5;
                }
            }
            for (EnumC2148p enumC2148p : EnumC2148p.values()) {
                if (enumC2148p.f11220o == i5) {
                    interfaceC2133a = enumC2148p;
                }
            }
            throw new C2146n(a.k("Algorithm with COSE value ", i5, " not supported"));
        }
        interfaceC2133a = C.RS1;
        return new C2147o(interfaceC2133a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [g2.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [g2.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof C2147o) && this.f11219o.a() == ((C2147o) obj).f11219o.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11219o});
    }

    public final String toString() {
        return androidx.compose.foundation.text.modifiers.a.z("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f11219o), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [g2.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f11219o.a());
    }
}

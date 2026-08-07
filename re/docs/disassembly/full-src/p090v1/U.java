package p090v1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import com.google.android.gms.internal.ads.AbstractC1955z5;
import com.google.android.gms.internal.ads.BinderC1923ya;
import com.google.android.gms.internal.ads.InterfaceC0697Aa;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends AbstractC1867x5 implements W {
    @Override // p090v1.W
    public final InterfaceC0697Aa getAdapterCreator() {
        Parcel parcelO3 = o3(X1(), 2);
        InterfaceC0697Aa interfaceC0697AaS3 = BinderC1923ya.S3(parcelO3.readStrongBinder());
        parcelO3.recycle();
        return interfaceC0697AaS3;
    }

    @Override // p090v1.W
    public final x0 getLiteSdkVersion() {
        Parcel parcelO3 = o3(X1(), 1);
        x0 x0Var = (x0) AbstractC1955z5.a(parcelO3, x0.CREATOR);
        parcelO3.recycle();
        return x0Var;
    }
}

package p012c1;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1328ku;
import com.google.android.gms.internal.ads.AbstractC1671sm;
import com.google.android.gms.internal.ads.Bm;
import com.google.android.gms.internal.ads.C0929bn;
import com.google.android.gms.internal.ads.C0944c2;
import com.google.android.gms.internal.ads.C1198hu;
import com.google.android.gms.internal.ads.Im;
import com.google.android.gms.internal.ads.InterfaceC1938yp;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.SD;
import com.google.android.gms.internal.ads.Vr;
import com.google.android.gms.internal.ads.X1;
import com.google.android.gms.internal.ads.Yl;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements InterfaceC1938yp {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2543o;
    public int p;
    public Object q;

    public c(int i5, URL url, long j5) {
        this.p = i5;
        this.q = url;
        this.f2543o = j5;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(X1 x4) {
        long j5;
        int i5;
        C0944c2 c0944c2 = (C0944c2) this.q;
        AbstractC0773Md.A(c0944c2.f6807h);
        AbstractC1328ku abstractC1328ku = (AbstractC1328ku) x4.q;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC1328ku.size());
        int i6 = 0;
        C1198hu c1198huListIterator = abstractC1328ku.listIterator(0);
        while (c1198huListIterator.hasNext()) {
            Yl yl = (Yl) c1198huListIterator.next();
            yl.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = yl.f6341a;
            if (charSequence != null) {
                bundle.putCharSequence(Yl.p, charSequence);
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    String str = AbstractC1671sm.f9131a;
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Im[] imArr = (Im[]) spanned.getSpans(i6, spanned.length(), Im.class);
                    int length = imArr.length;
                    for (int i7 = i6; i7 < length; i7++) {
                        Im im = imArr[i7];
                        im.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Im.f4226c, im.f4228a);
                        bundle2.putInt(Im.f4227d, im.f4229b);
                        arrayList2.add(AbstractC1671sm.a(spanned, im, 1, bundle2));
                    }
                    for (C0929bn c0929bn : (C0929bn[]) spanned.getSpans(0, spanned.length(), C0929bn.class)) {
                        c0929bn.getClass();
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt(C0929bn.f6763d, c0929bn.f6765a);
                        bundle3.putInt(C0929bn.e, c0929bn.f6766b);
                        bundle3.putInt(C0929bn.f6764f, c0929bn.f6767c);
                        arrayList2.add(AbstractC1671sm.a(spanned, c0929bn, 2, bundle3));
                    }
                    for (Bm bm : (Bm[]) spanned.getSpans(0, spanned.length(), Bm.class)) {
                        arrayList2.add(AbstractC1671sm.a(spanned, bm, 3, null));
                    }
                    if (!arrayList2.isEmpty()) {
                        bundle.putParcelableArrayList(Yl.q, arrayList2);
                    }
                }
            }
            bundle.putSerializable(Yl.f6334r, yl.f6342b);
            bundle.putSerializable(Yl.f6335s, yl.f6343c);
            bundle.putFloat(Yl.u, yl.e);
            bundle.putInt(Yl.f6336v, yl.f6345f);
            bundle.putInt(Yl.f6337w, yl.g);
            bundle.putFloat(Yl.f6338x, yl.f6346h);
            bundle.putInt(Yl.f6339y, yl.f6347i);
            bundle.putInt(Yl.f6340z, yl.f6350l);
            bundle.putFloat(Yl.f6327A, yl.f6351m);
            bundle.putFloat(Yl.f6328B, yl.f6348j);
            bundle.putFloat(Yl.f6329C, yl.f6349k);
            bundle.putBoolean(Yl.f6331E, false);
            bundle.putInt(Yl.f6330D, -16777216);
            bundle.putInt(Yl.f6332F, yl.f6352n);
            bundle.putFloat(Yl.f6333G, yl.f6353o);
            Bitmap bitmap = yl.f6344d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                i5 = 0;
                AbstractC0773Md.U(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundle.putByteArray(Yl.t, byteArrayOutputStream.toByteArray());
            } else {
                i5 = 0;
            }
            arrayList.add(bundle);
            i6 = i5;
        }
        int i8 = i6;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelableArrayList("c", arrayList);
        bundle4.putLong("d", x4.p);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle4);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        int length2 = bArrMarshall.length;
        Vr vr = c0944c2.f6804c;
        vr.g(bArrMarshall, length2);
        c0944c2.f6802a.a(length2, vr);
        int i9 = this.p & Integer.MAX_VALUE;
        long j6 = x4.f6153o;
        long j7 = this.f2543o;
        if (j6 != -9223372036854775807L) {
            long j8 = c0944c2.f6807h.p;
            if (j8 == Long.MAX_VALUE) {
                j7 += j6;
            } else {
                j5 = j6 + j8;
            }
            c0944c2.f6802a.d(j5, i9, length2, 0, null);
        }
        AbstractC0773Md.U(c0944c2.f6807h.p == Long.MAX_VALUE ? 1 : i8);
        j5 = j7;
        c0944c2.f6802a.d(j5, i9, length2, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1938yp
    /* JADX INFO: renamed from: l */
    public void mo6678l(Object obj) {
        ((SD) obj).l((RD) this.q, this.p, this.f2543o);
    }
}

package p041j2;

import L1.l;
import L1.n;
import L1.o;
import R1.e;
import R1.f;
import Y2.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.C0789Pb;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f11573y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0789Pb f11572z = new C0789Pb("Auth.Api.Identity.CredentialSaving.API", new K1.b(5), new d(7));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0789Pb f11571A = new C0789Pb("Auth.Api.Identity.SignIn.API", new K1.b(6), new d(7));

    public b(Activity activity, o oVar) {
        super(activity, activity, f11571A, oVar, e.f1069c);
        this.f11573y = f.a();
    }

    public String d(Intent intent) {
        Status status = Status.u;
        if (intent == null) {
            throw new R1.d(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : o4.d.g(byteArrayExtra, creator));
        if (status2 == null) {
            throw new R1.d(Status.f2703w);
        }
        if (!status2.g()) {
            throw new R1.d(status2);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new R1.d(status);
    }

    public l e(Intent intent) throws R1.d {
        Status status = Status.u;
        if (intent == null) {
            throw new R1.d(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : o4.d.g(byteArrayExtra, creator));
        if (status2 == null) {
            throw new R1.d(Status.f2703w);
        }
        if (!status2.g()) {
            throw new R1.d(status2);
        }
        Parcelable.Creator<l> creator2 = l.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        l lVar = (l) (byteArrayExtra2 != null ? o4.d.g(byteArrayExtra2, creator2) : null);
        if (lVar != null) {
            return lVar;
        }
        throw new R1.d(status);
    }

    public b(HiddenActivity hiddenActivity, n nVar) {
        super(hiddenActivity, hiddenActivity, f11572z, nVar, e.f1069c);
        this.f11573y = f.a();
    }

    public b(Context context, o oVar) {
        super(context, null, f11571A, oVar, e.f1069c);
        this.f11573y = f.a();
    }
}

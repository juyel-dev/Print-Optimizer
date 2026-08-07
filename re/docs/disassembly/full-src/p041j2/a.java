package p041j2;

import A2.d;
import L1.g;
import L1.k;
import O1.c;
import O1.h;
import R1.e;
import R1.l;
import S1.m;
import S1.s;
import T1.z;
import Y1.b;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {
    public final /* synthetic */ int p;
    public final Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 2);
        this.p = 4;
        this.q = revocationBoundService;
    }

    public void P2() {
        if (!b.j((RevocationBoundService) this.q, Binder.getCallingUid())) {
            throw new SecurityException(p035i0.a.k("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // A2.d
    public final boolean X1(int i5, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        Object obj = this.q;
        switch (this.p) {
            case 0:
                if (i5 != 1) {
                    return false;
                }
                Status status = (Status) g.a(parcel, Status.CREATOR);
                k kVar = (k) g.a(parcel, k.CREATOR);
                g.b(parcel);
                K2.b.r(status, kVar, (i) obj);
                return true;
            case 1:
                if (i5 != 1) {
                    return false;
                }
                Status status2 = (Status) g.a(parcel, Status.CREATOR);
                g gVar = (g) g.a(parcel, g.CREATOR);
                g.b(parcel);
                K2.b.r(status2, gVar, (i) obj);
                return true;
            case 2:
                if (i5 != 1) {
                    return false;
                }
                Status status3 = (Status) g.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) g.a(parcel, PendingIntent.CREATOR);
                g.b(parcel);
                K2.b.r(status3, pendingIntent, (i) obj);
                return true;
            case 3:
                if (i5 != 1) {
                    return false;
                }
                Status status4 = (Status) g.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent2 = (PendingIntent) g.a(parcel, PendingIntent.CREATOR);
                g.b(parcel);
                K2.b.r(status4, pendingIntent2, (i) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i5 != 1) {
                    if (i5 != 2) {
                        return false;
                    }
                    P2();
                    O1.i.G(revocationBoundService).H();
                    return true;
                }
                P2();
                O1.b bVarA = O1.b.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = bVarA.b();
                GoogleSignInOptions googleSignInOptionsC = GoogleSignInOptions.f2678y;
                if (googleSignInAccountB != null) {
                    googleSignInOptionsC = bVarA.c();
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsC;
                z.i(googleSignInOptions);
                N1.a aVar = new N1.a((RevocationBoundService) obj, null, K1.a.f590a, googleSignInOptions, new e(new Y2.d(12), Looper.getMainLooper()));
                s sVar = aVar.f1075v;
                Context context = aVar.f1072o;
                if (googleSignInAccountB == null) {
                    boolean z3 = aVar.d() == 3;
                    W1.a aVar2 = h.f810a;
                    if (aVar2.f1697c <= 3) {
                        Log.d(aVar2.f1696b, ((String) aVar2.f1698d).concat("Signing out"));
                    }
                    h.a(context);
                    if (z3) {
                        Status status5 = Status.f2701s;
                        S1.k kVar2 = new S1.k(sVar);
                        kVar2.S(status5);
                        basePendingResult = kVar2;
                    } else {
                        O1.g gVar2 = new O1.g(sVar, 0);
                        sVar.a(gVar2);
                        basePendingResult = gVar2;
                    }
                    basePendingResult.O(new m(basePendingResult, new i(), new Y2.d(14)));
                    return true;
                }
                boolean z4 = aVar.d() == 3;
                W1.a aVar3 = h.f810a;
                if (aVar3.f1697c <= 3) {
                    Log.d(aVar3.f1696b, ((String) aVar3.f1698d).concat("Revoking access"));
                }
                String strE = O1.b.a(context).e("refreshToken");
                h.a(context);
                if (!z4) {
                    O1.g gVar3 = new O1.g(sVar, 1);
                    sVar.a(gVar3);
                    basePendingResult2 = gVar3;
                } else if (strE == null) {
                    W1.a aVar4 = c.q;
                    Status status6 = new Status(4, null, null, null);
                    z.a("Status code must not be SUCCESS", !status6.g());
                    l lVar = new l(status6);
                    lVar.S(status6);
                    basePendingResult2 = lVar;
                } else {
                    c cVar = new c(strE);
                    new Thread(cVar).start();
                    basePendingResult2 = cVar.p;
                }
                basePendingResult2.O(new m(basePendingResult2, new i(), new Y2.d(14)));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, int i5) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 2);
        this.p = i5;
        switch (i5) {
            case 1:
                this.q = iVar;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 2);
                break;
            case 2:
                this.q = iVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 2);
                break;
            case 3:
                this.q = iVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback", 2);
                break;
            default:
                this.q = iVar;
                break;
        }
    }
}

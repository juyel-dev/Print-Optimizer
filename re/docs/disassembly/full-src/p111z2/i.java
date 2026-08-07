package p111z2;

import A2.m;
import B2.a;
import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f16097s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, p101x2.i iVar, String str) {
        super(jVar, new m("OnRequestInstallCallback"), iVar);
        this.f16097s = jVar;
    }

    @Override // p111z2.g, A2.i
    public final void i2(Bundle bundle) {
        super.i2(bundle);
        int i5 = bundle.getInt("error.code", -2);
        p101x2.i iVar = this.q;
        if (i5 != 0) {
            iVar.c(new a(bundle.getInt("error.code", -2)));
            return;
        }
        bundle.getInt("version.code", -1);
        int i6 = bundle.getInt("update.availability");
        int i7 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        long j5 = bundle.getLong("additional.size.required");
        k kVar = this.f16097s.f16102d;
        kVar.getClass();
        long jA = k.a(new File(kVar.f16103a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet = new HashSet();
        if (integerArrayList != null) {
            hashSet.addAll(integerArrayList);
        }
        map.put("blocking.destructive.intent", hashSet);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet2 = new HashSet();
        if (integerArrayList2 != null) {
            hashSet2.addAll(integerArrayList2);
        }
        map.put("nonblocking.destructive.intent", hashSet2);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet3 = new HashSet();
        if (integerArrayList3 != null) {
            hashSet3.addAll(integerArrayList3);
        }
        map.put("blocking.intent", hashSet3);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet4 = new HashSet();
        if (integerArrayList4 != null) {
            hashSet4.addAll(integerArrayList4);
        }
        map.put("nonblocking.intent", hashSet4);
        iVar.d(new a(i6, i7, j5, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map));
    }
}

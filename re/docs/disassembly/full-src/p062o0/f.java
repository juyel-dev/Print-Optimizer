package p062o0;

import A.e;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import p077s0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f12068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f12069d;
    public Executor e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f12070f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12071h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f12073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f12074k;

    public f(Context context, String str) {
        this.f12067b = context;
        this.f12066a = str;
        e eVar = new e(16, false);
        eVar.p = new HashMap();
        this.f12073j = eVar;
    }

    public final void a(p066p0.a... aVarArr) {
        if (this.f12074k == null) {
            this.f12074k = new HashSet();
        }
        for (p066p0.a aVar : aVarArr) {
            this.f12074k.add(Integer.valueOf(aVar.f12256a));
            this.f12074k.add(Integer.valueOf(aVar.f12257b));
        }
        e eVar = this.f12073j;
        eVar.getClass();
        for (p066p0.a aVar2 : aVarArr) {
            int i5 = aVar2.f12256a;
            HashMap map = (HashMap) eVar.p;
            TreeMap treeMap = (TreeMap) map.get(Integer.valueOf(i5));
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(Integer.valueOf(i5), treeMap);
            }
            int i6 = aVar2.f12257b;
            p066p0.a aVar3 = (p066p0.a) treeMap.get(Integer.valueOf(i6));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i6), aVar2);
        }
    }
}

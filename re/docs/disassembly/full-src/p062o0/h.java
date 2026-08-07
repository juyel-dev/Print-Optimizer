package p062o0;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p077s0.c;
import p080t0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements c, Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final TreeMap f12082w = new TreeMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile String f12083o;
    public final long[] p;
    public final double[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String[] f12084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[][] f12085s;
    public final int[] t;
    public final int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12086v;

    public h(int i5) {
        this.u = i5;
        int i6 = i5 + 1;
        this.t = new int[i6];
        this.p = new long[i6];
        this.q = new double[i6];
        this.f12084r = new String[i6];
        this.f12085s = new byte[i6][];
    }

    public static h h(int i5, String str) {
        TreeMap treeMap = f12082w;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i5));
                if (entryCeilingEntry == null) {
                    h hVar = new h(i5);
                    hVar.f12083o = str;
                    hVar.f12086v = i5;
                    return hVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                h hVar2 = (h) entryCeilingEntry.getValue();
                hVar2.f12083o = str;
                hVar2.f12086v = i5;
                return hVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p077s0.c
    public final void c(b bVar) {
        for (int i5 = 1; i5 <= this.f12086v; i5++) {
            int i6 = this.t[i5];
            if (i6 == 1) {
                bVar.i(i5);
            } else if (i6 == 2) {
                bVar.h(i5, this.p[i5]);
            } else if (i6 == 3) {
                ((SQLiteProgram) bVar.p).bindDouble(i5, this.q[i5]);
            } else if (i6 == 4) {
                bVar.j(i5, this.f12084r[i5]);
            } else if (i6 == 5) {
                bVar.g(this.f12085s[i5], i5);
            }
        }
    }

    @Override // p077s0.c
    public final String g() {
        return this.f12083o;
    }

    public final void i(int i5, long j5) {
        this.t[i5] = 2;
        this.p[i5] = j5;
    }

    public final void j(int i5) {
        this.t[i5] = 1;
    }

    public final void n(int i5, String str) {
        this.t[i5] = 4;
        this.f12084r[i5] = str;
    }

    public final void p() {
        TreeMap treeMap = f12082w;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.u), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i5 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i5;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

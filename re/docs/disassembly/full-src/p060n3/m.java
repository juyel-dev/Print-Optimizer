package p060n3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f11940w = new i(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Comparator f11941o;
    public final boolean p;
    public l q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11943s;
    public final l t;
    public k u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k f11944v;

    public m(boolean z3) {
        i iVar = f11940w;
        this.f11942r = 0;
        this.f11943s = 0;
        this.f11941o = iVar;
        this.p = z3;
        this.t = new l(z3);
    }

    public final l a(Object obj, boolean z3) {
        int iCompareTo;
        l lVar;
        l lVar2 = this.q;
        i iVar = f11940w;
        Comparator comparator = this.f11941o;
        if (lVar2 != null) {
            Comparable comparable = comparator == iVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = lVar2.t;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return lVar2;
                }
                l lVar3 = iCompareTo < 0 ? lVar2.p : lVar2.q;
                if (lVar3 == null) {
                    break;
                }
                lVar2 = lVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z3) {
            return null;
        }
        l lVar4 = this.t;
        if (lVar2 != null) {
            lVar = new l(this.p, lVar2, obj, lVar4, lVar4.f11937s);
            if (iCompareTo < 0) {
                lVar2.p = lVar;
            } else {
                lVar2.q = lVar;
            }
            b(lVar2, true);
        } else {
            if (comparator == iVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.p, lVar2, obj, lVar4, lVar4.f11937s);
            this.q = lVar;
        }
        this.f11942r++;
        this.f11943s++;
        return lVar;
    }

    public final void b(l lVar, boolean z3) {
        while (lVar != null) {
            l lVar2 = lVar.p;
            l lVar3 = lVar.q;
            int i5 = lVar2 != null ? lVar2.f11939w : 0;
            int i6 = lVar3 != null ? lVar3.f11939w : 0;
            int i7 = i5 - i6;
            if (i7 == -2) {
                l lVar4 = lVar3.p;
                l lVar5 = lVar3.q;
                int i8 = (lVar4 != null ? lVar4.f11939w : 0) - (lVar5 != null ? lVar5.f11939w : 0);
                if (i8 == -1 || (i8 == 0 && !z3)) {
                    f(lVar);
                } else {
                    g(lVar3);
                    f(lVar);
                }
                if (z3) {
                    return;
                }
            } else if (i7 == 2) {
                l lVar6 = lVar2.p;
                l lVar7 = lVar2.q;
                int i9 = (lVar6 != null ? lVar6.f11939w : 0) - (lVar7 != null ? lVar7.f11939w : 0);
                if (i9 == 1 || (i9 == 0 && !z3)) {
                    g(lVar);
                } else {
                    f(lVar2);
                    g(lVar);
                }
                if (z3) {
                    return;
                }
            } else if (i7 == 0) {
                lVar.f11939w = i5 + 1;
                if (z3) {
                    return;
                }
            } else {
                lVar.f11939w = Math.max(i5, i6) + 1;
                if (!z3) {
                    return;
                }
            }
            lVar = lVar.f11935o;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.q = null;
        this.f11942r = 0;
        this.f11943s++;
        l lVar = this.t;
        lVar.f11937s = lVar;
        lVar.f11936r = lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        l lVarA = null;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return lVarA != null;
    }

    public final void d(l lVar, boolean z3) {
        l lVar2;
        l lVar3;
        int i5;
        if (z3) {
            l lVar4 = lVar.f11937s;
            lVar4.f11936r = lVar.f11936r;
            lVar.f11936r.f11937s = lVar4;
        }
        l lVar5 = lVar.p;
        l lVar6 = lVar.q;
        l lVar7 = lVar.f11935o;
        int i6 = 0;
        if (lVar5 == null || lVar6 == null) {
            if (lVar5 != null) {
                e(lVar, lVar5);
                lVar.p = null;
            } else if (lVar6 != null) {
                e(lVar, lVar6);
                lVar.q = null;
            } else {
                e(lVar, null);
            }
            b(lVar7, false);
            this.f11942r--;
            this.f11943s++;
            return;
        }
        if (lVar5.f11939w > lVar6.f11939w) {
            l lVar8 = lVar5.q;
            while (true) {
                l lVar9 = lVar8;
                lVar3 = lVar5;
                lVar5 = lVar9;
                if (lVar5 == null) {
                    break;
                } else {
                    lVar8 = lVar5.q;
                }
            }
        } else {
            l lVar10 = lVar6.p;
            while (true) {
                lVar2 = lVar6;
                lVar6 = lVar10;
                if (lVar6 == null) {
                    break;
                } else {
                    lVar10 = lVar6.p;
                }
            }
            lVar3 = lVar2;
        }
        d(lVar3, false);
        l lVar11 = lVar.p;
        if (lVar11 != null) {
            i5 = lVar11.f11939w;
            lVar3.p = lVar11;
            lVar11.f11935o = lVar3;
            lVar.p = null;
        } else {
            i5 = 0;
        }
        l lVar12 = lVar.q;
        if (lVar12 != null) {
            i6 = lVar12.f11939w;
            lVar3.q = lVar12;
            lVar12.f11935o = lVar3;
            lVar.q = null;
        }
        lVar3.f11939w = Math.max(i5, i6) + 1;
        e(lVar, lVar3);
    }

    public final void e(l lVar, l lVar2) {
        l lVar3 = lVar.f11935o;
        lVar.f11935o = null;
        if (lVar2 != null) {
            lVar2.f11935o = lVar3;
        }
        if (lVar3 == null) {
            this.q = lVar2;
        } else if (lVar3.p == lVar) {
            lVar3.p = lVar2;
        } else {
            lVar3.q = lVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k kVar = this.u;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 0);
        this.u = kVar2;
        return kVar2;
    }

    public final void f(l lVar) {
        l lVar2 = lVar.p;
        l lVar3 = lVar.q;
        l lVar4 = lVar3.p;
        l lVar5 = lVar3.q;
        lVar.q = lVar4;
        if (lVar4 != null) {
            lVar4.f11935o = lVar;
        }
        e(lVar, lVar3);
        lVar3.p = lVar;
        lVar.f11935o = lVar3;
        int iMax = Math.max(lVar2 != null ? lVar2.f11939w : 0, lVar4 != null ? lVar4.f11939w : 0) + 1;
        lVar.f11939w = iMax;
        lVar3.f11939w = Math.max(iMax, lVar5 != null ? lVar5.f11939w : 0) + 1;
    }

    public final void g(l lVar) {
        l lVar2 = lVar.p;
        l lVar3 = lVar.q;
        l lVar4 = lVar2.p;
        l lVar5 = lVar2.q;
        lVar.p = lVar5;
        if (lVar5 != null) {
            lVar5.f11935o = lVar;
        }
        e(lVar, lVar2);
        lVar2.q = lVar;
        lVar.f11935o = lVar2;
        int iMax = Math.max(lVar3 != null ? lVar3.f11939w : 0, lVar5 != null ? lVar5.f11939w : 0) + 1;
        lVar.f11939w = iMax;
        lVar2.f11939w = Math.max(iMax, lVar4 != null ? lVar4.f11939w : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        l lVarA;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
                lVarA = null;
            }
        } else {
            lVarA = null;
        }
        if (lVarA != null) {
            return lVarA.f11938v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k kVar = this.f11944v;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.f11944v = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.p) {
            throw new NullPointerException("value == null");
        }
        l lVarA = a(obj, true);
        Object obj3 = lVarA.f11938v;
        lVarA.f11938v = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l lVarA;
        if (obj != null) {
            try {
                lVarA = a(obj, false);
            } catch (ClassCastException unused) {
                lVarA = null;
            }
        } else {
            lVarA = null;
        }
        if (lVarA != null) {
            d(lVarA, true);
        }
        if (lVarA != null) {
            return lVarA.f11938v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11942r;
    }
}

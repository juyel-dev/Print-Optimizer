package p064o2;

import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p076s.b;

/* JADX INFO: renamed from: o2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2215s extends AbstractC2211n implements NavigableMap {
    public static final C2219w t;
    public static final C2215s u;
    public final transient A q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient AbstractC2210m f12154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient C2215s f12155s;

    static {
        C2219w c2219w = C2219w.f12159o;
        t = c2219w;
        A aW = AbstractC2216t.w(c2219w);
        C2206i c2206i = AbstractC2210m.p;
        u = new C2215s(aW, C2221y.f12160s, null);
    }

    public C2215s(A a5, AbstractC2210m abstractC2210m, C2215s c2215s) {
        this.q = a5;
        this.f12154r = abstractC2210m;
        this.f12155s = c2215s;
    }

    public static C2215s b(TreeMap treeMap) {
        Comparator comparator = treeMap.comparator();
        final C2219w c2219w = t;
        int i5 = 1;
        boolean zEquals = comparator == null ? true : c2219w.equals(comparator);
        Collection collectionEntrySet = treeMap.entrySet();
        Map.Entry[] entryArr = AbstractC2211n.p;
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) collectionEntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return d(c2219w);
        }
        int i6 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i7 = 0; i7 < 1; i7++) {
                if (objArr[i7] == null) {
                    throw new NullPointerException(AbstractC1421mz.h(i7, "at index "));
                }
            }
            A a5 = new A(AbstractC2210m.s(1, objArr), c2219w);
            Object[] objArr2 = {value};
            while (i6 < 1) {
                if (objArr2[i6] == null) {
                    throw new NullPointerException(AbstractC1421mz.h(i6, "at index "));
                }
                i6++;
            }
            return new C2215s(a5, AbstractC2210m.s(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i6 < length) {
                Map.Entry entry2 = entryArr2[i6];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                AbstractC2198a.f(key2, value2);
                objArr3[i6] = key2;
                objArr4[i6] = value2;
                i6++;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: o2.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    Objects.requireNonNull(entry3);
                    Objects.requireNonNull(entry4);
                    return c2219w.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = entryArr2[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            AbstractC2198a.f(objArr3[0], value3);
            while (i5 < length) {
                Map.Entry entry4 = entryArr2[i5 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr2[i5];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                AbstractC2198a.f(key4, value4);
                objArr3[i5] = key4;
                objArr4[i5] = value4;
                if (c2219w.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(b.l("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i5++;
                key3 = key4;
            }
        }
        return new C2215s(new A(AbstractC2210m.s(length, objArr3), c2219w), AbstractC2210m.s(length, objArr4), null);
    }

    public static C2215s d(Comparator comparator) {
        if (C2219w.f12159o.equals(comparator)) {
            return u;
        }
        A aW = AbstractC2216t.w(comparator);
        C2206i c2206i = AbstractC2210m.p;
        return new C2215s(aW, C2221y.f12160s, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.q.f12156r;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.q.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C2215s c2215s = this.f12155s;
        if (c2215s != null) {
            return c2215s;
        }
        boolean zIsEmpty = isEmpty();
        A a5 = this.q;
        if (!zIsEmpty) {
            return new C2215s((A) a5.descendingSet(), this.f12154r.o(), this);
        }
        Comparator comparator = a5.f12156r;
        return d((comparator instanceof AbstractC2220x ? (AbstractC2220x) comparator : new C2204g(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C2215s headMap(Object obj, boolean z3) {
        obj.getClass();
        return i(0, this.q.x(obj, z3));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C2215s subMap(Object obj, boolean z3, Object obj2, boolean z4) {
        obj.getClass();
        obj2.getClass();
        if (this.q.f12156r.compare(obj, obj2) <= 0) {
            return headMap(obj2, z4).tailMap(obj, z3);
        }
        throw new IllegalArgumentException(AbstractC2198a.c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().s().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.q.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C2215s tailMap(Object obj, boolean z3) {
        obj.getClass();
        return i(this.q.y(obj, z3), this.f12154r.size());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // p064o2.AbstractC2211n, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        A a5 = this.q;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(a5.t, obj, a5.f12156r);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f12154r.get(iBinarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    public final C2215s i(int i5, int i6) {
        AbstractC2210m abstractC2210m = this.f12154r;
        if (i5 == 0) {
            if (i6 == abstractC2210m.size()) {
                return this;
            }
            i5 = 0;
        }
        A a5 = this.q;
        return i5 == i6 ? d(a5.f12156r) : new C2215s(a5.z(i5, i6), abstractC2210m.subList(i5, i6), null);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.q;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().s().get(this.f12154r.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.q.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.q;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12154r.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f12154r;
    }
}

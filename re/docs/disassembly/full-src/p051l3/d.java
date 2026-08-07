package p051l3;

import com.google.android.gms.internal.measurement.C2117x;
import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p060n3.f;
import p065o3.c;
import p065o3.g;
import p065o3.h;
import p065o3.m;
import p065o3.o;
import p065o3.q;
import p075r3.b;
import p079s3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f11845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2117x f11847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f11848d;
    public final List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f11849f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f11850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f11851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f11852j;

    public d() {
        f fVar = f.q;
        Map mapEmptyMap = Collections.emptyMap();
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        this.f11845a = new ThreadLocal();
        this.f11846b = new ConcurrentHashMap();
        this.f11849f = mapEmptyMap;
        C2117x c2117x = new C2117x(3, mapEmptyMap, listEmptyList4);
        this.f11847c = c2117x;
        this.g = true;
        this.f11850h = listEmptyList;
        this.f11851i = listEmptyList2;
        this.f11852j = listEmptyList4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(q.f12228z);
        arrayList.add(h.f12182b);
        arrayList.add(fVar);
        arrayList.addAll(listEmptyList3);
        arrayList.add(q.p);
        arrayList.add(q.g);
        arrayList.add(q.f12212d);
        arrayList.add(q.e);
        arrayList.add(q.f12213f);
        g gVar = q.f12217k;
        arrayList.add(new m(Long.TYPE, Long.class, gVar));
        arrayList.add(new m(Double.TYPE, Double.class, new a(0)));
        arrayList.add(new m(Float.TYPE, Float.class, new a(1)));
        arrayList.add(g.f12180b);
        arrayList.add(q.f12214h);
        arrayList.add(q.f12215i);
        arrayList.add(new o(AtomicLong.class, new b(new b(gVar, 0), 2), 0));
        arrayList.add(new o(AtomicLongArray.class, new b(new b(gVar, 1), 2), 0));
        arrayList.add(q.f12216j);
        arrayList.add(q.f12218l);
        arrayList.add(q.q);
        arrayList.add(q.f12222r);
        arrayList.add(new o(BigDecimal.class, q.f12219m, 0));
        arrayList.add(new o(BigInteger.class, q.f12220n, 0));
        arrayList.add(new o(p060n3.h.class, q.f12221o, 0));
        arrayList.add(q.f12223s);
        arrayList.add(q.t);
        arrayList.add(q.f12224v);
        arrayList.add(q.f12225w);
        arrayList.add(q.f12227y);
        arrayList.add(q.u);
        arrayList.add(q.f12210b);
        arrayList.add(p065o3.d.f12173b);
        arrayList.add(q.f12226x);
        if (b.f12337a) {
            arrayList.add(b.f12339c);
            arrayList.add(b.f12338b);
            arrayList.add(b.f12340d);
        }
        arrayList.add(p065o3.b.f12168d);
        arrayList.add(q.f12209a);
        arrayList.add(new c(c2117x, 0));
        arrayList.add(new c(c2117x, 2));
        c cVar = new c(c2117x, 1);
        this.f11848d = cVar;
        arrayList.add(cVar);
        arrayList.add(q.f12208A);
        arrayList.add(new m(c2117x, fVar, cVar, listEmptyList4));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d4) {
        if (Double.isNaN(d4) || Double.isInfinite(d4)) {
            throw new IllegalArgumentException(d4 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        Object objA;
        TypeToken typeToken = TypeToken.get(cls);
        a aVar = new a(new StringReader(str));
        boolean z3 = true;
        aVar.p = true;
        try {
            try {
                try {
                    try {
                        aVar.L();
                        try {
                            objA = c(typeToken).a(aVar);
                            aVar.p = false;
                        } catch (EOFException e) {
                            e = e;
                            z3 = false;
                            if (!z3) {
                                throw new g(e);
                            }
                            aVar.p = false;
                            objA = null;
                        }
                    } catch (Throwable th) {
                        aVar.p = false;
                        throw th;
                    }
                } catch (EOFException e3) {
                    e = e3;
                }
                if (objA != null) {
                    try {
                        if (aVar.L() != 10) {
                            throw new g("JSON document was not fully consumed.");
                        }
                    } catch (p079s3.c e5) {
                        throw new g(e5);
                    } catch (IOException e6) {
                        throw new g(e6);
                    }
                }
                if (cls == Integer.TYPE) {
                    cls = Integer.class;
                } else if (cls == Float.TYPE) {
                    cls = Float.class;
                } else if (cls == Byte.TYPE) {
                    cls = Byte.class;
                } else if (cls == Double.TYPE) {
                    cls = Double.class;
                } else if (cls == Long.TYPE) {
                    cls = Long.class;
                } else if (cls == Character.TYPE) {
                    cls = Character.class;
                } else if (cls == Boolean.TYPE) {
                    cls = Boolean.class;
                } else if (cls == Short.TYPE) {
                    cls = Short.class;
                } else if (cls == Void.TYPE) {
                    cls = Void.class;
                }
                return cls.cast(objA);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e7.getMessage(), e7);
            }
        } catch (IOException e8) {
            throw new g(e8);
        } catch (IllegalStateException e9) {
            throw new g(e9);
        }
    }

    public final p c(TypeToken typeToken) {
        boolean z3;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f11846b;
        p pVar = (p) concurrentHashMap.get(typeToken);
        if (pVar != null) {
            return pVar;
        }
        ThreadLocal threadLocal = this.f11845a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            p pVar2 = (p) map.get(typeToken);
            if (pVar2 != null) {
                return pVar2;
            }
            z3 = false;
        }
        try {
            c cVar = new c();
            p pVarA = null;
            cVar.f11844a = null;
            map.put(typeToken, cVar);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                pVarA = ((q) it.next()).a(this, typeToken);
                if (pVarA != null) {
                    if (cVar.f11844a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    cVar.f11844a = pVarA;
                    map.put(typeToken, pVarA);
                    break;
                }
            }
            if (z3) {
                threadLocal.remove();
            }
            if (pVarA != null) {
                if (z3) {
                    concurrentHashMap.putAll(map);
                }
                return pVarA;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z3) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final p079s3.b d(Writer writer) {
        p079s3.b bVar = new p079s3.b(writer);
        bVar.t = this.g;
        bVar.f12365s = false;
        bVar.f12366v = false;
        return bVar;
    }

    public final String e(List list) {
        if (list == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new g(e);
            }
        }
        Class<?> cls = list.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(list, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new g(e3);
        }
    }

    public final void f(List list, Class cls, p079s3.b bVar) {
        p pVarC = c(TypeToken.get((Type) cls));
        boolean z3 = bVar.f12365s;
        bVar.f12365s = true;
        boolean z4 = bVar.t;
        bVar.t = this.g;
        boolean z5 = bVar.f12366v;
        bVar.f12366v = false;
        try {
            try {
                try {
                    pVarC.b(bVar, list);
                    bVar.f12365s = z3;
                    bVar.t = z4;
                    bVar.f12366v = z5;
                } catch (IOException e) {
                    throw new g(e);
                }
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } catch (Throwable th) {
            bVar.f12365s = z3;
            bVar.t = z4;
            bVar.f12366v = z5;
            throw th;
        }
    }

    public final void g(p079s3.b bVar) {
        h hVar = h.f11854o;
        boolean z3 = bVar.f12365s;
        bVar.f12365s = true;
        boolean z4 = bVar.t;
        bVar.t = this.g;
        boolean z5 = bVar.f12366v;
        bVar.f12366v = false;
        try {
            try {
                o oVar = q.f12209a;
                g.d(bVar, hVar);
                bVar.f12365s = z3;
                bVar.t = z4;
                bVar.f12366v = z5;
            } catch (IOException e) {
                throw new g(e);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } catch (Throwable th) {
            bVar.f12365s = z3;
            bVar.t = z4;
            bVar.f12366v = z5;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.f11847c + "}";
    }
}

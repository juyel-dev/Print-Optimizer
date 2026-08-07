package p065o3;

import androidx.compose.foundation.text.modifiers.a;
import com.google.android.gms.internal.measurement.C2117x;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p051l3.d;
import p051l3.g;
import p051l3.p;
import p051l3.q;
import p056m3.b;
import p060n3.f;
import p072q3.c;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12200o = 0;
    public final Object p;
    public final Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f12201r;

    public m(C2117x c2117x, f fVar, c cVar, List list) {
        this.p = c2117x;
        this.q = fVar;
        this.f12201r = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!p060n3.q.f11946a.a(obj, accessibleObject)) {
            throw new g(a.l(c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // p051l3.q
    public final p a(d dVar, TypeToken typeToken) {
        switch (this.f12200o) {
            case 0:
                Class rawType = typeToken.getRawType();
                if (!Object.class.isAssignableFrom(rawType)) {
                    return null;
                }
                p060n3.d.e((List) this.f12201r);
                return c.f12317a.E(rawType) ? new l(rawType, c(dVar, typeToken, rawType, true)) : new k(((C2117x) this.p).f(typeToken), c(dVar, typeToken, rawType, false));
            default:
                Class rawType2 = typeToken.getRawType();
                if (rawType2 == ((Class) this.p) || rawType2 == ((Class) this.q)) {
                    return (p) this.f12201r;
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public LinkedHashMap c(d dVar, TypeToken typeToken, Class cls, boolean z3) {
        boolean z4;
        Method method;
        Type typeH;
        b bVar;
        String strValue;
        String[] strArrAlternate;
        List list;
        List listSingletonList;
        int size;
        ?? r4;
        i iVar;
        ?? r5;
        i iVar2;
        Field field;
        int i5;
        boolean z5;
        int i6;
        Field[] fieldArr;
        Class cls2;
        boolean z6;
        TypeToken<?> typeToken2;
        Class<? super Object> rawType;
        boolean z7;
        int modifiers;
        boolean z8;
        p056m3.a aVar;
        i iVar3;
        p pVarC;
        boolean z9;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        TypeToken typeToken3 = typeToken;
        Class rawType2 = cls;
        while (rawType2 != Object.class) {
            Field[] declaredFields = rawType2.getDeclaredFields();
            if (rawType2 != cls && declaredFields.length > 0) {
                p060n3.d.e((List) this.f12201r);
            }
            int length = declaredFields.length;
            boolean z10 = false;
            int i7 = 0;
            while (i7 < length) {
                Field field2 = declaredFields[i7];
                boolean zD = this.d(field2, true);
                boolean zD2 = this.d(field2, z10);
                if (zD || zD2) {
                    if (z3) {
                        if (Modifier.isStatic(field2.getModifiers())) {
                            z4 = z10;
                        } else {
                            Method methodZ = c.f12317a.z(rawType2, field2);
                            c.e(methodZ);
                            if (methodZ.getAnnotation(b.class) != null && field2.getAnnotation(b.class) == null) {
                                throw new g(a.z("@SerializedName on ", c.d(methodZ, z10), " is not supported"));
                            }
                            z4 = zD2;
                            method = methodZ;
                        }
                        if (method == null) {
                            c.e(field2);
                        }
                        typeH = p060n3.d.h(typeToken3.getType(), rawType2, field2.getGenericType(), new HashMap());
                        bVar = (b) field2.getAnnotation(b.class);
                        if (bVar == null) {
                            listSingletonList = Collections.singletonList(field2.getName());
                        } else {
                            strValue = bVar.value();
                            strArrAlternate = bVar.alternate();
                            if (strArrAlternate.length == 0) {
                                listSingletonList = Collections.singletonList(strValue);
                            } else {
                                ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                arrayList.add(strValue);
                                Collections.addAll(arrayList, strArrAlternate);
                                list = arrayList;
                            }
                            size = list.size();
                            r4 = z10;
                            iVar = null;
                            r5 = list;
                            while (r4 < size) {
                                String str = (String) r5.get(r4);
                                if (r4 != 0) {
                                    z6 = z10;
                                } else {
                                    z6 = zD;
                                }
                                typeToken2 = TypeToken.get(typeH);
                                rawType = typeToken2.getRawType();
                                if (rawType == null && rawType.isPrimitive()) {
                                    z7 = true;
                                } else {
                                    z7 = z10;
                                }
                                modifiers = field2.getModifiers();
                                if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                                    z8 = z10;
                                } else {
                                    z8 = true;
                                }
                                aVar = (p056m3.a) field2.getAnnotation(p056m3.a.class);
                                iVar3 = iVar;
                                if (aVar != null) {
                                    pVarC = c.b((C2117x) this.p, dVar, typeToken2, aVar);
                                } else {
                                    pVarC = null;
                                }
                                if (pVarC != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (pVarC == null) {
                                    pVarC = dVar.c(typeToken2);
                                }
                                ?? r25 = r4;
                                int i8 = size;
                                ?? r30 = r5;
                                Field field3 = field2;
                                int i9 = i7;
                                int i10 = length;
                                Field[] fieldArr2 = declaredFields;
                                boolean z11 = z7;
                                Class cls3 = rawType2;
                                iVar = (i) linkedHashMap.put(str, new i(str, field2, z6, z4, false, method, z9, pVarC, dVar, typeToken2, z11, z8));
                                if (iVar3 == null) {
                                    iVar = iVar3;
                                }
                                this = this;
                                dVar = dVar;
                                zD = z6;
                                rawType2 = cls3;
                                z10 = false;
                                length = i10;
                                field2 = field3;
                                declaredFields = fieldArr2;
                                size = i8;
                                r5 = r30;
                                i7 = i9;
                                r4 = (r25 == true ? 1 : 0) + 1;
                            }
                            iVar2 = iVar;
                            field = field2;
                            i5 = i7;
                            z5 = z10;
                            i6 = length;
                            fieldArr = declaredFields;
                            cls2 = rawType2;
                            if (iVar2 == null) {
                                throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + iVar2.f12184a + "'; conflict is caused by fields " + c.c(iVar2.f12185b) + " and " + c.c(field));
                            }
                        }
                        list = listSingletonList;
                        size = list.size();
                        r4 = z10;
                        iVar = null;
                        r5 = list;
                        while (r4 < size) {
                            String str2 = (String) r5.get(r4);
                            if (r4 != 0) {
                                z6 = z10;
                            } else {
                                z6 = zD;
                            }
                            typeToken2 = TypeToken.get(typeH);
                            rawType = typeToken2.getRawType();
                            if (rawType == null) {
                                z7 = z10;
                            } else {
                                z7 = z10;
                            }
                            modifiers = field2.getModifiers();
                            if (Modifier.isStatic(modifiers)) {
                                z8 = z10;
                            } else {
                                z8 = z10;
                            }
                            aVar = (p056m3.a) field2.getAnnotation(p056m3.a.class);
                            iVar3 = iVar;
                            if (aVar != null) {
                                pVarC = c.b((C2117x) this.p, dVar, typeToken2, aVar);
                            } else {
                                pVarC = null;
                            }
                            if (pVarC != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (pVarC == null) {
                                pVarC = dVar.c(typeToken2);
                            }
                            ?? r26 = r4;
                            int i11 = size;
                            ?? r31 = r5;
                            Field field4 = field2;
                            int i12 = i7;
                            int i13 = length;
                            Field[] fieldArr3 = declaredFields;
                            boolean z12 = z7;
                            Class cls4 = rawType2;
                            iVar = (i) linkedHashMap.put(str2, new i(str2, field2, z6, z4, false, method, z9, pVarC, dVar, typeToken2, z12, z8));
                            if (iVar3 == null) {
                                iVar = iVar3;
                            }
                            this = this;
                            dVar = dVar;
                            zD = z6;
                            rawType2 = cls4;
                            z10 = false;
                            length = i13;
                            field2 = field4;
                            declaredFields = fieldArr3;
                            size = i11;
                            r5 = r31;
                            i7 = i12;
                            r4 = (r26 == true ? 1 : 0) + 1;
                        }
                        iVar2 = iVar;
                        field = field2;
                        i5 = i7;
                        z5 = z10;
                        i6 = length;
                        fieldArr = declaredFields;
                        cls2 = rawType2;
                        if (iVar2 == null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + iVar2.f12184a + "'; conflict is caused by fields " + c.c(iVar2.f12185b) + " and " + c.c(field));
                        }
                    } else {
                        z4 = zD2;
                    }
                    method = null;
                    if (method == null) {
                        c.e(field2);
                    }
                    typeH = p060n3.d.h(typeToken3.getType(), rawType2, field2.getGenericType(), new HashMap());
                    bVar = (b) field2.getAnnotation(b.class);
                    if (bVar == null) {
                        listSingletonList = Collections.singletonList(field2.getName());
                    } else {
                        strValue = bVar.value();
                        strArrAlternate = bVar.alternate();
                        if (strArrAlternate.length == 0) {
                            listSingletonList = Collections.singletonList(strValue);
                        } else {
                            ArrayList arrayList2 = new ArrayList(strArrAlternate.length + 1);
                            arrayList2.add(strValue);
                            Collections.addAll(arrayList2, strArrAlternate);
                            list = arrayList2;
                        }
                        size = list.size();
                        r4 = z10;
                        iVar = null;
                        r5 = list;
                        while (r4 < size) {
                            String str3 = (String) r5.get(r4);
                            if (r4 != 0) {
                                z6 = z10;
                            } else {
                                z6 = zD;
                            }
                            typeToken2 = TypeToken.get(typeH);
                            rawType = typeToken2.getRawType();
                            if (rawType == null) {
                                z7 = z10;
                            } else {
                                z7 = z10;
                            }
                            modifiers = field2.getModifiers();
                            if (Modifier.isStatic(modifiers)) {
                                z8 = z10;
                            } else {
                                z8 = z10;
                            }
                            aVar = (p056m3.a) field2.getAnnotation(p056m3.a.class);
                            iVar3 = iVar;
                            if (aVar != null) {
                                pVarC = c.b((C2117x) this.p, dVar, typeToken2, aVar);
                            } else {
                                pVarC = null;
                            }
                            if (pVarC != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (pVarC == null) {
                                pVarC = dVar.c(typeToken2);
                            }
                            ?? r27 = r4;
                            int i14 = size;
                            ?? r32 = r5;
                            Field field5 = field2;
                            int i15 = i7;
                            int i16 = length;
                            Field[] fieldArr4 = declaredFields;
                            boolean z13 = z7;
                            Class cls5 = rawType2;
                            iVar = (i) linkedHashMap.put(str3, new i(str3, field2, z6, z4, false, method, z9, pVarC, dVar, typeToken2, z13, z8));
                            if (iVar3 == null) {
                                iVar = iVar3;
                            }
                            this = this;
                            dVar = dVar;
                            zD = z6;
                            rawType2 = cls5;
                            z10 = false;
                            length = i16;
                            field2 = field5;
                            declaredFields = fieldArr4;
                            size = i14;
                            r5 = r32;
                            i7 = i15;
                            r4 = (r27 == true ? 1 : 0) + 1;
                        }
                        iVar2 = iVar;
                        field = field2;
                        i5 = i7;
                        z5 = z10;
                        i6 = length;
                        fieldArr = declaredFields;
                        cls2 = rawType2;
                        if (iVar2 == null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + iVar2.f12184a + "'; conflict is caused by fields " + c.c(iVar2.f12185b) + " and " + c.c(field));
                        }
                    }
                    list = listSingletonList;
                    size = list.size();
                    r4 = z10;
                    iVar = null;
                    r5 = list;
                    while (r4 < size) {
                        String str4 = (String) r5.get(r4);
                        if (r4 != 0) {
                            z6 = z10;
                        } else {
                            z6 = zD;
                        }
                        typeToken2 = TypeToken.get(typeH);
                        rawType = typeToken2.getRawType();
                        if (rawType == null) {
                            z7 = z10;
                        } else {
                            z7 = z10;
                        }
                        modifiers = field2.getModifiers();
                        if (Modifier.isStatic(modifiers)) {
                            z8 = z10;
                        } else {
                            z8 = z10;
                        }
                        aVar = (p056m3.a) field2.getAnnotation(p056m3.a.class);
                        iVar3 = iVar;
                        if (aVar != null) {
                            pVarC = c.b((C2117x) this.p, dVar, typeToken2, aVar);
                        } else {
                            pVarC = null;
                        }
                        if (pVarC != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (pVarC == null) {
                            pVarC = dVar.c(typeToken2);
                        }
                        ?? r28 = r4;
                        int i17 = size;
                        ?? r33 = r5;
                        Field field6 = field2;
                        int i18 = i7;
                        int i19 = length;
                        Field[] fieldArr5 = declaredFields;
                        boolean z14 = z7;
                        Class cls6 = rawType2;
                        iVar = (i) linkedHashMap.put(str4, new i(str4, field2, z6, z4, false, method, z9, pVarC, dVar, typeToken2, z14, z8));
                        if (iVar3 == null) {
                            iVar = iVar3;
                        }
                        this = this;
                        dVar = dVar;
                        zD = z6;
                        rawType2 = cls6;
                        z10 = false;
                        length = i19;
                        field2 = field6;
                        declaredFields = fieldArr5;
                        size = i17;
                        r5 = r33;
                        i7 = i18;
                        r4 = (r28 == true ? 1 : 0) + 1;
                    }
                    iVar2 = iVar;
                    field = field2;
                    i5 = i7;
                    z5 = z10;
                    i6 = length;
                    fieldArr = declaredFields;
                    cls2 = rawType2;
                    if (iVar2 == null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + iVar2.f12184a + "'; conflict is caused by fields " + c.c(iVar2.f12185b) + " and " + c.c(field));
                    }
                } else {
                    i5 = i7;
                    z5 = z10;
                    i6 = length;
                    fieldArr = declaredFields;
                    cls2 = rawType2;
                }
                i7 = i5 + 1;
                this = this;
                dVar = dVar;
                rawType2 = cls2;
                z10 = z5;
                length = i6;
                declaredFields = fieldArr;
            }
            Class cls7 = rawType2;
            typeToken3 = TypeToken.get(p060n3.d.h(typeToken3.getType(), cls7, cls7.getGenericSuperclass(), new HashMap()));
            rawType2 = typeToken3.getRawType();
        }
        return linkedHashMap;
    }

    public boolean d(Field field, boolean z3) {
        Class<?> type = field.getType();
        f fVar = (f) this.q;
        fVar.getClass();
        if (!f.c(type)) {
            fVar.b(z3);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !f.c(field.getType())) {
                List list = z3 ? fVar.f11927o : fVar.p;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.f12200o) {
            case 1:
                return "Factory[type=" + ((Class) this.q).getName() + "+" + ((Class) this.p).getName() + ",adapter=" + ((p) this.f12201r) + "]";
            default:
                return super.toString();
        }
    }

    public m(Class cls, Class cls2, p pVar) {
        this.p = cls;
        this.q = cls2;
        this.f12201r = pVar;
    }
}

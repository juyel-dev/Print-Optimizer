package p104y0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15850b = m.h("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f15851c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15852a;

    static {
        f fVar = new f(new HashMap());
        c(fVar);
        f15851c = fVar;
    }

    public f(f fVar) {
        this.f15852a = new HashMap(fVar.f15852a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static f a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e;
        String str = f15850b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i5 = objectInputStream.readInt(); i5 > 0; i5--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            Log.e(str, "Error in Data#fromByteArray: ", e3);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        Log.e(str, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e6) {
                                Log.e(str, "Error in Data#fromByteArray: ", e6);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e7) {
                        e = e7;
                        Log.e(str, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (IOException e8) {
                    Log.e(str, "Error in Data#fromByteArray: ", e8);
                }
            } catch (IOException e9) {
                e = e9;
                Throwable th = e;
                objectInputStream = null;
                e = th;
                Log.e(str, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new f(map);
            } catch (ClassNotFoundException e10) {
                e = e10;
                Throwable th2 = e;
                objectInputStream = null;
                e = th2;
                Log.e(str, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new f(map);
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e11) {
                        Log.e(str, "Error in Data#fromByteArray: ", e11);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e12) {
                    Log.e(str, "Error in Data#fromByteArray: ", e12);
                    throw th;
                }
            }
            return new f(map);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static byte[] c(f fVar) throws Throwable {
        String str = f15850b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(fVar.f15852a.size());
                    for (Map.Entry entry : fVar.f15852a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        Log.e(str, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        Log.e(str, "Error in Data#toByteArray: ", e3);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e5) {
                    e = e5;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(str, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        Log.e(str, "Error in Data#toByteArray: ", e7);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e8) {
                            Log.e(str, "Error in Data#toByteArray: ", e8);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e9) {
                        Log.e(str, "Error in Data#toByteArray: ", e9);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public final String b(String str) {
        Object obj = this.f15852a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        HashMap map = this.f15852a;
        Set<String> setKeySet = map.keySet();
        HashMap map2 = ((f) obj).f15852a;
        if (!setKeySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = map.get(str);
            Object obj3 = map2.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f15852a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.f15852a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public f(HashMap map) {
        this.f15852a = new HashMap(map);
    }
}

package p008b2;

import A2.d;
import T1.z;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends d implements a {
    public final Object p;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.p = obj;
    }

    public static a P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 4);
    }

    public static Object o3(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).p;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i5 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i5++;
                field = field2;
            }
        }
        if (i5 != 1) {
            throw new IllegalArgumentException(AbstractC1421mz.h(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        z.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }
}

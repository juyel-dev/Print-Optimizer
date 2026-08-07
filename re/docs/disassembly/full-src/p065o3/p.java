package p065o3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f12207a;

    public p(Class cls) {
        this.f12207a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Field[] declaredFields = this.f12207a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}

package p074r0;

import W.AbstractComponentCallbacksC0170o;
import android.os.Bundle;
import androidx.compose.foundation.text.modifiers.a;
import androidx.lifecycle.EnumC0675n;
import androidx.lifecycle.InterfaceC0670i;
import androidx.lifecycle.InterfaceC0681u;
import androidx.lifecycle.InterfaceC0683w;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.X;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import p010c.C0695h;
import p010c.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC0681u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12320o;
    public final Object p;

    public /* synthetic */ b(Object obj, int i5) {
        this.f12320o = i5;
        this.p = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0681u
    public final void onStateChanged(InterfaceC0683w interfaceC0683w, EnumC0675n enumC0675n) {
        switch (this.f12320o) {
            case 0:
                if (enumC0675n != EnumC0675n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0683w.getLifecycle().c(this);
                g gVar = (g) this.p;
                Bundle bundleA = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        o.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                o.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(gVar instanceof c0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                b0 b0VarE = ((c0) gVar).e();
                                e savedStateRegistry = gVar.getSavedStateRegistry();
                                b0VarE.getClass();
                                LinkedHashMap linkedHashMap = b0VarE.f2336a;
                                for (String key : new HashSet(linkedHashMap.keySet())) {
                                    o.f(key, "key");
                                    X x4 = (X) linkedHashMap.get(key);
                                    o.c(x4);
                                    Q.a(x4, savedStateRegistry, gVar.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(a.y("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e5) {
                        throw new RuntimeException(a.z("Class ", str, " wasn't found"), e5);
                    }
                }
                return;
            case 1:
                if (enumC0675n == EnumC0675n.ON_STOP) {
                    ((AbstractComponentCallbacksC0170o) this.p).getClass();
                    return;
                }
                return;
            case 2:
                new HashMap();
                InterfaceC0670i[] interfaceC0670iArr = (InterfaceC0670i[]) this.p;
                if (interfaceC0670iArr.length > 0) {
                    InterfaceC0670i interfaceC0670i = interfaceC0670iArr[0];
                    throw null;
                }
                if (interfaceC0670iArr.length <= 0) {
                    return;
                }
                InterfaceC0670i interfaceC0670i2 = interfaceC0670iArr[0];
                throw null;
            case 3:
                if (enumC0675n != EnumC0675n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0675n).toString());
                }
                interfaceC0683w.getLifecycle().c(this);
                ((S) this.p).b();
                return;
            default:
                m mVar = (m) this.p;
                if (mVar.f2513s == null) {
                    C0695h c0695h = (C0695h) mVar.getLastNonConfigurationInstance();
                    if (c0695h != null) {
                        mVar.f2513s = c0695h.f2493a;
                    }
                    if (mVar.f2513s == null) {
                        mVar.f2513s = new b0();
                    }
                }
                mVar.f13638o.c(this);
                return;
        }
    }
}

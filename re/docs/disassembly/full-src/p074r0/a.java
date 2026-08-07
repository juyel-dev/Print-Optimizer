package p074r0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f12319a;

    public a(e registry) {
        o.f(registry, "registry");
        this.f12319a = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // p074r0.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f12319a));
        return bundle;
    }
}

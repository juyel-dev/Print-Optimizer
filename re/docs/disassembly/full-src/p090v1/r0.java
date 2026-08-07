package p090v1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f13487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f13489d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13490f;
    public final Set g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f13492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f13493j;

    public r0() {
        this.g = new HashSet();
        this.f13487b = new Bundle();
        this.f13493j = new HashMap();
        this.f13491h = new HashSet();
        this.f13489d = new Bundle();
        this.f13492i = new HashSet();
        this.f13486a = new ArrayList();
        this.f13488c = -1;
        this.f13490f = 60000;
    }

    public r0(r0 r0Var) {
        r0Var.getClass();
        this.f13486a = r0Var.f13486a;
        this.g = Collections.unmodifiableSet((HashSet) r0Var.g);
        this.f13487b = r0Var.f13487b;
        this.f13491h = Collections.unmodifiableMap((HashMap) r0Var.f13493j);
        this.f13488c = r0Var.f13488c;
        this.f13492i = Collections.unmodifiableSet((HashSet) r0Var.f13491h);
        this.f13489d = r0Var.f13489d;
        this.f13493j = Collections.unmodifiableSet((HashSet) r0Var.f13492i);
        this.e = r0Var.e;
        this.f13490f = r0Var.f13490f;
    }
}

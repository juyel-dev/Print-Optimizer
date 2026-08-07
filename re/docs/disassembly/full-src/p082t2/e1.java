package p082t2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.O;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f12634d;
    public b1 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f12635f;

    public e1(j1 j1Var) {
        super(j1Var);
        this.f12634d = (AlarmManager) ((C2236g0) this.f12783a).f12675a.getSystemService("alarm");
    }

    @Override // p082t2.h1
    public final boolean q() {
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        AlarmManager alarmManager = this.f12634d;
        if (alarmManager != null) {
            Context context = c2236g0.f12675a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), O.f10574a));
        }
        JobScheduler jobScheduler = (JobScheduler) c2236g0.f12675a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(s());
        }
        return false;
    }

    public final void r() {
        o();
        j().f12479n.g("Unscheduling upload");
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        AlarmManager alarmManager = this.f12634d;
        if (alarmManager != null) {
            Context context = c2236g0.f12675a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), O.f10574a));
        }
        t().a();
        JobScheduler jobScheduler = (JobScheduler) c2236g0.f12675a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(s());
        }
    }

    public final int s() {
        if (this.f12635f == null) {
            this.f12635f = Integer.valueOf(("measurement" + ((C2236g0) this.f12783a).f12675a.getPackageName()).hashCode());
        }
        return this.f12635f.intValue();
    }

    public final AbstractC2249n t() {
        if (this.e == null) {
            this.e = new b1(this, this.f12662b.f12726l, 1);
        }
        return this.e;
    }
}

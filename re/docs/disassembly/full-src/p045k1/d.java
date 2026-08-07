package p045k1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import p020e1.j;
import p049l1.h;
import p063o1.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p049l1.d f11619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11620c;

    public d(Context context, p049l1.d dVar, b bVar) {
        this.f11618a = context;
        this.f11619b = dVar;
        this.f11620c = bVar;
    }

    public final void a(j jVar, int i5, boolean z3) {
        Context context = this.f11618a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(jVar.f11075a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        p007b1.d dVar = jVar.f11077c;
        adler32.update(byteBufferAllocate.putInt(a.a(dVar)).array());
        byte[] bArr = jVar.f11076b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i6 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i6 < i5) {
                        break;
                    }
                    p003a2.a.q("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", jVar);
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseC = ((h) this.f11619b).c();
        String strValueOf = String.valueOf(a.a(dVar));
        String str = jVar.f11075a;
        Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f11620c;
            builder.setMinimumLatency(bVar.a(dVar, jLongValue, i5));
            Set set = ((c) bVar.f11614b.get(dVar)).f11617c;
            if (set.contains(e.f11621o)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.q)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.p)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i5);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, jLongValue, i5)), lValueOf, Integer.valueOf(i5)};
            String strX = p003a2.a.x("JobInfoScheduler");
            if (Log.isLoggable(strX, 3)) {
                Log.d(strX, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}

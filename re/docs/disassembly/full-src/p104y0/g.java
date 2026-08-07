package p104y0;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f15855c;

    public g(int i5, Notification notification, int i6) {
        this.f15853a = i5;
        this.f15855c = notification;
        this.f15854b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f15853a == gVar.f15853a && this.f15854b == gVar.f15854b) {
            return this.f15855c.equals(gVar.f15855c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15855c.hashCode() + (((this.f15853a * 31) + this.f15854b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f15853a + ", mForegroundServiceType=" + this.f15854b + ", mNotification=" + this.f15855c + '}';
    }
}

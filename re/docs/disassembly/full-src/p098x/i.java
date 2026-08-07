package p098x;

import android.app.Notification;
import p033h3.r;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends l {
    public CharSequence e;

    @Override // p098x.l
    public final void a(r rVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) rVar.p).setBigContentTitle(this.f13662b).bigText(this.e);
        if (this.f13664d) {
            bigTextStyleBigText.setSummaryText(this.f13663c);
        }
    }

    @Override // p098x.l
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}

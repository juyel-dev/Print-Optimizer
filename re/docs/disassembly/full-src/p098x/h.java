package p098x;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import p033h3.r;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends l {
    public IconCompat e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f13645f;
    public boolean g;

    @Override // p098x.l
    public final void a(r rVar) {
        Bitmap bitmapA;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) rVar.p).setBigContentTitle(this.f13662b);
        IconCompat iconCompat = this.e;
        Context context = (Context) rVar.f11487o;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                g.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.e;
                int i5 = iconCompat2.f2207a;
                if (i5 == -1) {
                    Object obj = iconCompat2.f2208b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i5 == 1) {
                    bitmapA = (Bitmap) iconCompat2.f2208b;
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f2208b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f13645f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                f.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (this.f13664d) {
            bigContentTitle.setSummaryText(this.f13663c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            g.c(bigContentTitle, false);
            g.b(bigContentTitle, null);
        }
    }

    @Override // p098x.l
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}

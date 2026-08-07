package p098x;

import B.a;
import B.b;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import androidx.core.graphics.drawable.IconCompat;
import com.notescrafter.app.R;
import java.util.ArrayList;
import java.util.Iterator;
import p033h3.r;
import p047l.C2175f;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13646a;
    public CharSequence e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f13650f;
    public PendingIntent g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f13651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13653j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f13655l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f13657n;
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f13659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Notification f13660s;
    public final ArrayList t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13647b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13648c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13649d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13654k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13656m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13658o = 0;
    public int p = 0;

    public k(Context context, String str) {
        Notification notification = new Notification();
        this.f13660s = notification;
        this.f13646a = context;
        this.q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f13653j = 0;
        this.t = new ArrayList();
        this.f13659r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        int i5;
        ArrayList arrayList;
        int i6;
        r rVar = new r();
        new ArrayList();
        rVar.f11488r = new Bundle();
        rVar.q = this;
        Context context = this.f13646a;
        rVar.f11487o = context;
        if (Build.VERSION.SDK_INT >= 26) {
            rVar.p = a.a(context, this.q);
        } else {
            rVar.p = new Notification.Builder(this.f13646a);
        }
        Notification notification = this.f13660s;
        int i7 = 0;
        ((Notification.Builder) rVar.p).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f13650f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & Fields.SpotShadowColor) != 0).setNumber(this.f13652i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) rVar.p;
        IconCompat iconCompat = this.f13651h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) rVar.p).setSubText(null).setUsesChronometer(false).setPriority(this.f13653j);
        for (e eVar : this.f13647b) {
            int i8 = Build.VERSION.SDK_INT;
            if (eVar.f13641b == null && (i6 = eVar.e) != 0) {
                eVar.f13641b = IconCompat.b(i6);
            }
            IconCompat iconCompat2 = eVar.f13641b;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(null) : null, eVar.f13644f, eVar.g);
            Bundle bundle2 = eVar.f13640a;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            boolean z3 = eVar.f13642c;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z3);
            builder2.setAllowGeneratedReplies(z3);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i8 >= 28) {
                b.l(builder2);
            }
            if (i8 >= 29) {
                A.b.e(builder2);
            }
            if (i8 >= 31) {
                m.a(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", eVar.f13643d);
            builder2.addExtras(bundle3);
            ((Notification.Builder) rVar.p).addAction(builder2.build());
        }
        Bundle bundle4 = this.f13657n;
        if (bundle4 != null) {
            ((Bundle) rVar.f11488r).putAll(bundle4);
        }
        int i9 = Build.VERSION.SDK_INT;
        ((Notification.Builder) rVar.p).setShowWhen(this.f13654k);
        ((Notification.Builder) rVar.p).setLocalOnly(this.f13656m);
        ((Notification.Builder) rVar.p).setGroup(null);
        ((Notification.Builder) rVar.p).setSortKey(null);
        ((Notification.Builder) rVar.p).setGroupSummary(false);
        ((Notification.Builder) rVar.p).setCategory(null);
        ((Notification.Builder) rVar.p).setColor(this.f13658o);
        ((Notification.Builder) rVar.p).setVisibility(this.p);
        ((Notification.Builder) rVar.p).setPublicVersion(null);
        ((Notification.Builder) rVar.p).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.t;
        ArrayList arrayList3 = this.f13648c;
        if (i9 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C2175f c2175f = new C2175f(arrayList2.size() + arrayList.size());
                    c2175f.addAll(arrayList);
                    c2175f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c2175f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) rVar.p).addPerson((String) it2.next());
            }
        }
        ArrayList arrayList4 = this.f13649d;
        if (arrayList4.size() > 0) {
            if (this.f13657n == null) {
                this.f13657n = new Bundle();
            }
            Bundle bundle5 = this.f13657n.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList4.size()) {
                String string = Integer.toString(i10);
                e eVar2 = (e) arrayList4.get(i10);
                Bundle bundle8 = new Bundle();
                if (eVar2.f13641b == null && (i5 = eVar2.e) != 0) {
                    eVar2.f13641b = IconCompat.b(i5);
                }
                IconCompat iconCompat3 = eVar2.f13641b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i7);
                bundle8.putCharSequence("title", eVar2.f13644f);
                bundle8.putParcelable("actionIntent", eVar2.g);
                Bundle bundle9 = eVar2.f13640a;
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", eVar2.f13642c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", eVar2.f13643d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i10++;
                i7 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f13657n == null) {
                this.f13657n = new Bundle();
            }
            this.f13657n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) rVar.f11488r).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i11 = Build.VERSION.SDK_INT;
        ((Notification.Builder) rVar.p).setExtras(this.f13657n);
        ((Notification.Builder) rVar.p).setRemoteInputHistory(null);
        if (i11 >= 26) {
            a.e((Notification.Builder) rVar.p);
            a.g((Notification.Builder) rVar.p);
            a.h((Notification.Builder) rVar.p);
            a.i((Notification.Builder) rVar.p);
            a.f((Notification.Builder) rVar.p);
            if (!TextUtils.isEmpty(this.q)) {
                ((Notification.Builder) rVar.p).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i11 >= 29) {
            A.b.c((Notification.Builder) rVar.p, this.f13659r);
            A.b.d((Notification.Builder) rVar.p);
        }
        k kVar = (k) rVar.q;
        l lVar = kVar.f13655l;
        if (lVar != null) {
            lVar.a(rVar);
        }
        int i12 = Build.VERSION.SDK_INT;
        Notification.Builder builder3 = (Notification.Builder) rVar.p;
        Notification notificationBuild = i12 >= 26 ? builder3.build() : builder3.build();
        if (lVar != null) {
            kVar.f13655l.getClass();
        }
        if (lVar != null && (bundle = notificationBuild.extras) != null) {
            if (lVar.f13664d) {
                bundle.putCharSequence("android.summaryText", lVar.f13663c);
            }
            CharSequence charSequence = lVar.f13662b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", lVar.b());
        }
        return notificationBuild;
    }

    public final void c(boolean z3) {
        Notification notification = this.f13660s;
        if (z3) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f13646a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f2206k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f2208b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f13651h = iconCompat;
    }

    public final void e(l lVar) {
        if (this.f13655l != lVar) {
            this.f13655l = lVar;
            if (lVar.f13661a != this) {
                lVar.f13661a = this;
                e(lVar);
            }
        }
    }
}

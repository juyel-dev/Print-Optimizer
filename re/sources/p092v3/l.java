package p092v3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import W3.q;
import X3.InterfaceC0200y;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.graphics.drawable.IconCompat;
import com.notescrafter.MainActivity;
import com.notescrafter.app.R;
import com.notescrafter.service.NotesCrafterFCMService;
import p047l.C2174e;
import p098x.h;
import p098x.i;
import p098x.k;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ NotesCrafterFCMService f13541o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2174e f13542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13543s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(NotesCrafterFCMService notesCrafterFCMService, String str, String str2, C2174e c2174e, Bitmap bitmap, d dVar) {
        super(2, dVar);
        this.f13541o = notesCrafterFCMService;
        this.p = str;
        this.q = str2;
        this.f13542r = c2174e;
        this.f13543s = bitmap;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new l(this.f13541o, this.p, this.q, this.f13542r, this.f13543s, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        lVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        p098x.l lVar;
        a aVar = a.f448o;
        o4.d.y(obj);
        int i5 = NotesCrafterFCMService.f10915v;
        NotesCrafterFCMService notesCrafterFCMService = this.f13541o;
        notesCrafterFCMService.getClass();
        C2174e c2174e = this.f13542r;
        String str = (String) c2174e.get("type");
        if (str == null) {
            str = "general";
        }
        String str2 = q.Y(str, "order", false) ? "order_updates" : "general";
        Intent intent = new Intent(notesCrafterFCMService, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("notification_type", str);
        String str3 = (String) c2174e.get("orderNumber");
        if (str3 != null) {
            intent.putExtra("order_number", str3);
        }
        String str4 = (String) c2174e.get("deepLink");
        if (str4 != null) {
            intent.putExtra("deep_link", str4);
        }
        PendingIntent activity = PendingIntent.getActivity(notesCrafterFCMService, (int) System.currentTimeMillis(), intent, 201326592);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(notesCrafterFCMService.getResources(), R.drawable.ic_real_logo);
        String str5 = this.p;
        String str6 = this.q;
        Bitmap bitmap = this.f13543s;
        if (bitmap != null) {
            h hVar = new h();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f2208b = bitmap;
            hVar.e = iconCompat;
            hVar.f13645f = null;
            hVar.g = true;
            hVar.f13662b = k.b(str5);
            hVar.f13663c = k.b(str6);
            hVar.f13664d = true;
            lVar = hVar;
        } else {
            i iVar = new i();
            iVar.e = k.b(str6);
            lVar = iVar;
        }
        k kVar = new k(notesCrafterFCMService, str2);
        kVar.f13660s.icon = R.drawable.ic_notification_logo;
        kVar.d(bitmapDecodeResource);
        kVar.e = k.b(str5);
        kVar.f13650f = k.b(str6);
        kVar.e(lVar);
        kVar.c(true);
        kVar.f13653j = str2.equals("order_updates") ? 1 : 0;
        kVar.g = activity;
        Notification notificationA = kVar.a();
        kotlin.jvm.internal.o.e(notificationA, "build(...)");
        Object systemService = notesCrafterFCMService.getSystemService("notification");
        kotlin.jvm.internal.o.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify((int) System.currentTimeMillis(), notificationA);
        return o.f154a;
    }
}

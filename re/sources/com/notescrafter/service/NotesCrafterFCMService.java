package com.notescrafter.service;

import Q3.a;
import X3.A;
import X3.H;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.razorpay.f;
import e4.d;
import kotlin.jvm.internal.o;
import p033h3.q;
import p036i2.e;
import p047l.C2174e;
import p092v3.i;
import p092v3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class NotesCrafterFCMService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f10915v = 0;

    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(q qVar) {
        String str;
        e eVarG;
        String str2;
        String string;
        e eVarG2 = qVar.g();
        Log.d("NotesCrafterFCM", "FCM message received: " + (eVarG2 != null ? (String) eVarG2.p : null));
        e eVarG3 = qVar.g();
        if (eVarG3 == null || (str = (String) eVarG3.p) == null || (eVarG = qVar.g()) == null || (str2 = (String) eVarG.q) == null) {
            return;
        }
        if (qVar.p == null) {
            C2174e c2174e = new C2174e(0);
            Bundle bundle = qVar.f11485o;
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    String str4 = (String) obj;
                    if (!str3.startsWith("google.") && !str3.startsWith("gcm.") && !str3.equals("from") && !str3.equals("message_type") && !str3.equals("collapse_key")) {
                        c2174e.put(str3, str4);
                    }
                }
            }
            qVar.p = c2174e;
        }
        C2174e c2174e2 = qVar.p;
        o.e(c2174e2, "getData(...)");
        e eVarG4 = qVar.g();
        if (eVarG4 == null) {
            string = (String) c2174e2.get("imageUrl");
        } else {
            String str5 = (String) eVarG4.f11537r;
            Uri uri = str5 != null ? Uri.parse(str5) : null;
            if (uri == null || (string = uri.toString()) == null) {
                string = (String) c2174e2.get("imageUrl");
            }
        }
        String str6 = string;
        Object systemService = getSystemService("notification");
        o.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel("order_updates") == null) {
            i.d();
            NotificationChannel notificationChannelB = f.b();
            notificationChannelB.setDescription("Notifications about your print order status");
            notificationChannelB.enableVibration(true);
            notificationChannelB.setShowBadge(true);
            notificationManager.createNotificationChannel(notificationChannelB);
        }
        if (notificationManager.getNotificationChannel("general") == null) {
            i.d();
            NotificationChannel notificationChannelX = f.x();
            notificationChannelX.setDescription("General announcements and updates from NotesCrafter");
            notificationChannelX.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannelX);
        }
        e4.e eVar = H.f1766a;
        A.t(A.a(d.f11107o), null, null, new m(str6, this, str, str2, c2174e2, null), 3);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String token) {
        o.f(token, "token");
        Log.d("NotesCrafterFCM", "New FCM token received");
        Context applicationContext = getApplicationContext();
        o.e(applicationContext, "getApplicationContext(...)");
        a.N(applicationContext, token);
    }
}

package p083t3;

import B3.o;
import O3.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.notescrafter.utils.AnalyticsManager;
import java.net.URLEncoder;
import p102x3.F3;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13030o;
    public final /* synthetic */ Context p;

    public /* synthetic */ J(Context context, int i5) {
        this.f13030o = i5;
        this.p = context;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13030o) {
            case 0:
                Context context = this.p;
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://notescrafter.in/pricing")));
                } catch (Exception unused) {
                    Toast.makeText(context, "Unable to open browser", 0).show();
                }
                break;
            case 1:
                F3.c(this.p);
                break;
            case 2:
                Context context2 = this.p;
                try {
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:support@notescrafter.com"));
                    context2.startActivity(intent);
                } catch (Exception unused2) {
                    Toast.makeText(context2, "No email client found", 0).show();
                }
                break;
            case 3:
                F3.c(this.p);
                break;
            case 4:
                Context context3 = this.p;
                try {
                    Intent intent2 = new Intent("android.intent.action.DIAL");
                    intent2.setData(Uri.parse("tel:+916203770581"));
                    context3.startActivity(intent2);
                } catch (Exception unused3) {
                    Toast.makeText(context3, "Cannot place call", 0).show();
                }
                break;
            case 5:
                Toast.makeText(this.p, "Default address updated!", 0).show();
                break;
            case 6:
                Toast.makeText(this.p, "Address deleted!", 0).show();
                break;
            case 7:
                Context context4 = this.p;
                try {
                    try {
                        String str = "https://api.whatsapp.com/send?phone=916203770581&text=" + URLEncoder.encode("Hi NotesCrafter, I need help with printing my notes. Can you please call/chat with me?", "UTF-8");
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(Uri.parse(str));
                        intent3.setPackage("com.whatsapp");
                        context4.startActivity(intent3);
                    } catch (Exception unused4) {
                        context4.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://wa.me/916203770581?text=" + URLEncoder.encode("Hi NotesCrafter, I need help with printing my notes. Can you please call/chat with me?", "UTF-8"))));
                    }
                } catch (Exception unused5) {
                    Toast.makeText(context4, "WhatsApp is not installed on this device", 0).show();
                }
                break;
            default:
                try {
                    this.p.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/@NotesCrafterApp?sub_confirmation=1")));
                } catch (Exception e) {
                    AnalyticsManager analyticsManager = AnalyticsManager.INSTANCE;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown";
                    }
                    analyticsManager.logError("Subscribe_Intent_Failed", message);
                }
                break;
        }
        return o.f154a;
    }
}

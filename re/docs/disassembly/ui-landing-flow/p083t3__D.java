package p083t3;

import O3.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13014o;
    public final /* synthetic */ Context p;

    public /* synthetic */ D(Context context, int i5) {
        this.f13014o = i5;
        this.p = context;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f13014o) {
            case 0:
                Context context = this.p;
                File file = (File) obj;
                o.f(file, "file");
                try {
                    Uri uriD = FileProvider.d(context, context.getPackageName() + ".provider", file);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriD, "application/pdf");
                    intent.addFlags(1);
                    context.startActivity(intent);
                } catch (Exception unused) {
                    Toast.makeText(context, "Error opening PDF", 0).show();
                }
                break;
            case 1:
                Context context2 = this.p;
                File file2 = (File) obj;
                o.f(file2, "file");
                try {
                    Uri uriD2 = FileProvider.d(context2, context2.getPackageName() + ".provider", file2);
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("application/pdf");
                    intent2.putExtra("android.intent.extra.STREAM", uriD2);
                    intent2.addFlags(1);
                    context2.startActivity(Intent.createChooser(intent2, "Share PDF"));
                } catch (Exception unused2) {
                    Toast.makeText(context2, "Error sharing PDF", 0).show();
                }
                break;
            case 2:
                File file3 = (File) obj;
                o.f(file3, "file");
                if (file3.delete()) {
                    Toast.makeText(this.p, "File deleted", 0).show();
                }
                break;
            case 3:
                String err = (String) obj;
                o.f(err, "err");
                Toast.makeText(this.p, err, 1).show();
                break;
            default:
                String err2 = (String) obj;
                o.f(err2, "err");
                Toast.makeText(this.p, err2, 1).show();
                break;
        }
        return B3.o.f154a;
    }
}

package p102x3;

import O3.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2593n9 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15355o;
    public final /* synthetic */ C2661re p;
    public final /* synthetic */ Context q;

    public /* synthetic */ C2593n9(int i5, Context context, C2661re c2661re) {
        this.f15355o = i5;
        this.p = c2661re;
        this.q = context;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f15355o) {
            case 0:
                Context context = this.q;
                try {
                    String path = this.p.f15506a.getPath();
                    o.c(path);
                    Uri uriD = FileProvider.d(context, context.getPackageName() + ".provider", new File(path));
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriD, "application/pdf");
                    intent.addFlags(1);
                    context.startActivity(intent);
                } catch (Exception unused) {
                    Toast.makeText(context, "No app found to open PDF", 0).show();
                }
                break;
            default:
                Context context2 = this.q;
                try {
                    String path2 = this.p.f15506a.getPath();
                    o.c(path2);
                    Uri uriD2 = FileProvider.d(context2, context2.getPackageName() + ".provider", new File(path2));
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("application/pdf");
                    intent2.putExtra("android.intent.extra.STREAM", uriD2);
                    intent2.addFlags(1);
                    context2.startActivity(Intent.createChooser(intent2, "Share PDF"));
                } catch (Exception unused2) {
                    Toast.makeText(context2, "Error sharing file", 0).show();
                }
                break;
        }
        return B3.o.f154a;
    }
}

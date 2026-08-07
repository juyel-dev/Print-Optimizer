package p102x3;

import O3.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import androidx.core.content.FileProvider;
import com.razorpay.AppSignatureHelper;
import java.io.File;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M5 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14193o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ M5(Context context, MutableState mutableState, int i5) {
        this.f14193o = i5;
        this.p = context;
        this.q = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14193o) {
            case 0:
                Context context = this.p;
                MutableState mutableState = this.q;
                try {
                    String str = context.getPackageName() + ".provider";
                    File file = (File) mutableState.getValue();
                    o.c(file);
                    Uri uriD = FileProvider.d(context, str, file);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriD, "application/pdf");
                    intent.addFlags(1);
                    context.startActivity(intent);
                } catch (Exception unused) {
                    Toast.makeText(context, "No app found to open PDF", 0).show();
                }
                break;
            case 1:
                Context context2 = this.p;
                MutableState mutableState2 = this.q;
                try {
                    String str2 = context2.getPackageName() + ".provider";
                    File file2 = (File) mutableState2.getValue();
                    o.c(file2);
                    Uri uriD2 = FileProvider.d(context2, str2, file2);
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("application/pdf");
                    intent2.putExtra("android.intent.extra.STREAM", uriD2);
                    intent2.addFlags(1);
                    context2.startActivity(Intent.createChooser(intent2, "Share PDF"));
                } catch (Exception unused2) {
                    Toast.makeText(context2, "Error sharing file", 0).show();
                }
                break;
            case 2:
                Context context3 = this.p;
                MutableState mutableState3 = this.q;
                try {
                    String str3 = context3.getPackageName() + ".provider";
                    File file3 = (File) mutableState3.getValue();
                    o.c(file3);
                    Uri uriD3 = FileProvider.d(context3, str3, file3);
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setDataAndType(uriD3, "application/pdf");
                    intent3.addFlags(1);
                    context3.startActivity(intent3);
                } catch (Exception unused3) {
                    Toast.makeText(context3, "No app found to open PDF", 0).show();
                }
                break;
            case 3:
                Context context4 = this.p;
                MutableState mutableState4 = this.q;
                try {
                    String str4 = context4.getPackageName() + ".provider";
                    File file4 = (File) mutableState4.getValue();
                    o.c(file4);
                    Uri uriD4 = FileProvider.d(context4, str4, file4);
                    Intent intent4 = new Intent("android.intent.action.SEND");
                    intent4.setType("application/pdf");
                    intent4.putExtra("android.intent.extra.STREAM", uriD4);
                    intent4.addFlags(1);
                    context4.startActivity(Intent.createChooser(intent4, "Share PDF"));
                } catch (Exception unused4) {
                    Toast.makeText(context4, "Error sharing file", 0).show();
                }
                break;
            case 4:
                Context context5 = this.p;
                MutableState mutableState5 = this.q;
                try {
                    String str5 = context5.getPackageName() + ".provider";
                    File file5 = (File) mutableState5.getValue();
                    o.c(file5);
                    Uri uriD5 = FileProvider.d(context5, str5, file5);
                    Intent intent5 = new Intent("android.intent.action.VIEW");
                    intent5.setDataAndType(uriD5, "application/pdf");
                    intent5.addFlags(1);
                    context5.startActivity(intent5);
                } catch (Exception unused5) {
                    Toast.makeText(context5, "No app found to open PDF", 0).show();
                }
                break;
            case 5:
                Context context6 = this.p;
                MutableState mutableState6 = this.q;
                try {
                    String str6 = context6.getPackageName() + ".provider";
                    File file6 = (File) mutableState6.getValue();
                    o.c(file6);
                    Uri uriD6 = FileProvider.d(context6, str6, file6);
                    Intent intent6 = new Intent("android.intent.action.SEND");
                    intent6.setType("application/pdf");
                    intent6.putExtra("android.intent.extra.STREAM", uriD6);
                    intent6.addFlags(1);
                    context6.startActivity(Intent.createChooser(intent6, "Share PDF"));
                } catch (Exception unused6) {
                    Toast.makeText(context6, "Error sharing file", 0).show();
                }
                break;
            case 6:
                Context context7 = this.p;
                MutableState mutableState7 = this.q;
                try {
                    String str7 = context7.getPackageName() + ".provider";
                    File file7 = (File) mutableState7.getValue();
                    o.c(file7);
                    Uri uriD7 = FileProvider.d(context7, str7, file7);
                    Intent intent7 = new Intent("android.intent.action.VIEW");
                    intent7.setDataAndType(uriD7, "application/pdf");
                    intent7.addFlags(1);
                    context7.startActivity(intent7);
                } catch (Exception unused7) {
                    Toast.makeText(context7, "No app found to open PDF", 0).show();
                }
                break;
            case 7:
                Context context8 = this.p;
                MutableState mutableState8 = this.q;
                try {
                    String str8 = context8.getPackageName() + ".provider";
                    File file8 = (File) mutableState8.getValue();
                    o.c(file8);
                    Uri uriD8 = FileProvider.d(context8, str8, file8);
                    Intent intent8 = new Intent("android.intent.action.SEND");
                    intent8.setType("application/pdf");
                    intent8.putExtra("android.intent.extra.STREAM", uriD8);
                    intent8.addFlags(1);
                    context8.startActivity(Intent.createChooser(intent8, "Share PDF"));
                } catch (Exception unused8) {
                    Toast.makeText(context8, "Error sharing file", 0).show();
                }
                break;
            case 8:
                Context context9 = this.p;
                MutableState mutableState9 = this.q;
                try {
                    String str9 = context9.getPackageName() + ".provider";
                    File file9 = (File) mutableState9.getValue();
                    o.c(file9);
                    Uri uriD9 = FileProvider.d(context9, str9, file9);
                    Intent intent9 = new Intent("android.intent.action.VIEW");
                    intent9.setDataAndType(uriD9, "application/pdf");
                    intent9.addFlags(1);
                    context9.startActivity(intent9);
                } catch (Exception unused9) {
                    Toast.makeText(context9, "No app found to open PDF", 0).show();
                }
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                Context context10 = this.p;
                MutableState mutableState10 = this.q;
                try {
                    String str10 = context10.getPackageName() + ".provider";
                    File file10 = (File) mutableState10.getValue();
                    o.c(file10);
                    Uri uriD10 = FileProvider.d(context10, str10, file10);
                    Intent intent10 = new Intent("android.intent.action.SEND");
                    intent10.setType("application/pdf");
                    intent10.putExtra("android.intent.extra.STREAM", uriD10);
                    intent10.addFlags(1);
                    context10.startActivity(Intent.createChooser(intent10, "Share PDF"));
                } catch (Exception unused10) {
                    Toast.makeText(context10, "Error sharing file", 0).show();
                }
                break;
            case 10:
                Context context11 = this.p;
                MutableState mutableState11 = this.q;
                try {
                    String str11 = context11.getPackageName() + ".provider";
                    File file11 = (File) mutableState11.getValue();
                    o.c(file11);
                    Uri uriD11 = FileProvider.d(context11, str11, file11);
                    Intent intent11 = new Intent("android.intent.action.VIEW");
                    intent11.setDataAndType(uriD11, "application/pdf");
                    intent11.addFlags(1);
                    context11.startActivity(intent11);
                } catch (Exception unused11) {
                    Toast.makeText(context11, "No app found to open PDF", 0).show();
                }
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                Context context12 = this.p;
                MutableState mutableState12 = this.q;
                try {
                    String str12 = context12.getPackageName() + ".provider";
                    File file12 = (File) mutableState12.getValue();
                    o.c(file12);
                    Uri uriD12 = FileProvider.d(context12, str12, file12);
                    Intent intent12 = new Intent("android.intent.action.SEND");
                    intent12.setType("application/pdf");
                    intent12.putExtra("android.intent.extra.STREAM", uriD12);
                    intent12.addFlags(1);
                    context12.startActivity(Intent.createChooser(intent12, "Share PDF"));
                } catch (Exception unused12) {
                    Toast.makeText(context12, "Error sharing file", 0).show();
                }
                break;
            case Matrix.TranslateX /* 12 */:
                Context context13 = this.p;
                MutableState mutableState13 = this.q;
                try {
                    String str13 = context13.getPackageName() + ".provider";
                    File file13 = (File) mutableState13.getValue();
                    o.c(file13);
                    Uri uriD13 = FileProvider.d(context13, str13, file13);
                    Intent intent13 = new Intent("android.intent.action.VIEW");
                    intent13.setDataAndType(uriD13, "application/pdf");
                    intent13.addFlags(1);
                    context13.startActivity(intent13);
                } catch (Exception unused13) {
                    Toast.makeText(context13, "No app found to open PDF", 0).show();
                }
                break;
            case Matrix.TranslateY /* 13 */:
                Context context14 = this.p;
                MutableState mutableState14 = this.q;
                try {
                    String str14 = context14.getPackageName() + ".provider";
                    File file14 = (File) mutableState14.getValue();
                    o.c(file14);
                    Uri uriD14 = FileProvider.d(context14, str14, file14);
                    Intent intent14 = new Intent("android.intent.action.SEND");
                    intent14.setType("application/pdf");
                    intent14.putExtra("android.intent.extra.STREAM", uriD14);
                    intent14.addFlags(1);
                    context14.startActivity(Intent.createChooser(intent14, "Share PDF"));
                } catch (Exception unused14) {
                    Toast.makeText(context14, "Error sharing file", 0).show();
                }
                break;
            default:
                this.q.setValue(Boolean.FALSE);
                Toast.makeText(this.p, "Address saved successfully!", 0).show();
                break;
        }
        return B3.o.f154a;
    }
}

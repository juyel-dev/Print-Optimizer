package p083t3;

import M0.b;
import O3.a;
import O3.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.utils.AnalyticsManager;
import com.razorpay.AppSignatureHelper;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import p015d.l;
import p087u3.v;
import p092v3.h;
import p097w3.r;
import p102x3.A3;
import p102x3.C2646qe;
import p102x3.E6;
import p102x3.EnumC2614oe;
import p102x3.EnumC2677se;
import p102x3.EnumC2778z3;
import p102x3.G5;
import p102x3.Gd;
import p102x3.H5;
import p102x3.Y3;
import p102x3.Ze;

/* JADX INFO: renamed from: t3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2290i implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13178o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ C2290i(int i5, Object obj, Object obj2) {
        this.f13178o = i5;
        this.p = obj;
        this.q = obj2;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13178o) {
            case 0:
                ((c) this.p).invoke((String) this.q);
                break;
            case 1:
                ((b) this.p).getClass();
                ((MutableState) this.q).setValue("pomodoro-setup");
                break;
            case 2:
                AnalyticsManager.INSTANCE.logCtaClick("Continue", "Upload_Screen");
                if (!((List) ((State) this.q).getValue()).isEmpty()) {
                    ((Y) this.p).g(2);
                }
                break;
            case 3:
                ((c) this.p).invoke(((r) this.q).f13634c);
                break;
            case 4:
                C2646qe c2646qe = (C2646qe) this.p;
                Context context = (Context) this.q;
                try {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(c2646qe.f15460d));
                        String str = c2646qe.e;
                        if (str != null) {
                            try {
                                context.getPackageManager().getPackageInfo(str, 0);
                                intent.setPackage(str);
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        context.startActivity(intent);
                    } catch (Exception unused2) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c2646qe.f15460d)));
                    }
                    break;
                } catch (Exception unused3) {
                }
                break;
            case 5:
                ((c) this.p).invoke((List) ((MutableState) this.q).getValue());
                break;
            case 6:
                ((c) this.p).invoke(((Ze) this.q).f14757a);
                break;
            case 7:
                ((MutableState) this.q).setValue((H5) this.p);
                break;
            case 8:
                ((MutableState) this.q).setValue((G5) this.p);
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                MutableIntState mutableIntState = (MutableIntState) this.q;
                if (mutableIntState.getIntValue() < ((List) this.p).size() - 1) {
                    mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                }
                break;
            case 10:
                ((MutableState) this.q).setValue((E6) this.p);
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                ((MutableState) this.q).setValue((EnumC2778z3) this.p);
                break;
            case Matrix.TranslateX /* 12 */:
                ((MutableState) this.q).setValue((A3) this.p);
                break;
            case Matrix.TranslateY /* 13 */:
                ((MutableState) this.q).setValue((EnumC2614oe) this.p);
                break;
            case Matrix.TranslateZ /* 14 */:
                ((MutableState) this.q).setValue((EnumC2677se) this.p);
                break;
            case 15:
                ((MutableState) this.q).setValue((Y3) this.p);
                break;
            case 16:
                ((MutableState) this.q).setValue(((v) this.p).getId());
                break;
            case 17:
                ((MutableState) this.p).setValue((String) this.q);
                break;
            case 18:
                ((Context) this.p).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/" + ((String) this.q))));
                break;
            case 19:
                ((a) this.p).invoke();
                ((a) this.q).invoke();
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                ((PrintOrderViewModel) this.p).m();
                ((a) this.q).invoke();
                break;
            case 21:
                File file = (File) this.q;
                o.c(file);
                ((c) this.p).invoke(file);
                break;
            case 22:
                Gd.w((MutableState) this.q, false);
                ((l) this.p).J("application/pdf");
                break;
            default:
                ((h) this.p).c();
                Toast.makeText((Context) this.q, "Signed out", 0).show();
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ C2290i(int i5, Object obj, String str) {
        this.f13178o = i5;
        this.q = str;
        this.p = obj;
    }
}

package p105y1;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0700Ad;
import java.util.Locale;
import p085u1.k;
import p090v1.C2366q;

/* JADX INFO: loaded from: classes2.dex */
public class J extends H {
    @Override // p105y1.G
    public final int f(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // p105y1.G
    public final void g(final Activity activity) {
        if (((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.f9772V0)).booleanValue() && k.f13311A.g.c().s() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: y1.I
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    k kVar = k.f13311A;
                    if (kVar.g.c().s() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        C0700Ad c0700Ad = kVar.g;
                        String strConcat = "";
                        if (displayCutout != null) {
                            D dC = c0700Ad.c();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                Locale locale = Locale.US;
                                String str = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(str);
                            }
                            dC.c(strConcat);
                        } else {
                            c0700Ad.c().c("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != attributes2.layoutInDisplayCutoutMode) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }
}

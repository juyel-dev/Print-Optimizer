package p102x3;

import android.app.Activity;
import android.view.Window;
import androidx.compose.runtime.DisposableEffectResult;

/* JADX INFO: loaded from: classes2.dex */
public final class Ha implements DisposableEffectResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f14031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Window f14032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f14033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f14034d;

    public Ha(Activity activity, Window window, Integer num, Integer num2) {
        this.f14031a = activity;
        this.f14032b = window;
        this.f14033c = num;
        this.f14034d = num2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        Activity activity = this.f14031a;
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        Window window = this.f14032b;
        if (window != null) {
            Integer num = this.f14033c;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
            Integer num2 = this.f14034d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
    }
}

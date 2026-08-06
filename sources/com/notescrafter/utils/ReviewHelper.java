package com.notescrafter.utils;

import E2.b;
import E2.c;
import E2.f;
import E2.h;
import F2.e;
import G2.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.H1;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import p090v1.u0;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewHelper {
    public static final int $stable = 0;
    public static final ReviewHelper INSTANCE = new ReviewHelper();
    private static final String KEY_LAST_PROMPT_TIME = "last_prompt_time";
    private static final String KEY_RATED_OR_DISMISSED = "rated_or_dismissed";
    private static final String KEY_SUCCESS_COUNT = "success_ops_count";
    private static final int MIN_DAYS_BETWEEN_PROMPTS = 7;
    private static final int MIN_OPS_BEFORE_PROMPT = 3;
    private static final String PREFS_NAME = "notescrafter_review_prefs";

    private ReviewHelper() {
    }

    private final SharedPreferences getPrefs(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        o.e(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    private final void triggerPlayStoreReview(Context context) {
        p101x2.o oVarN;
        String str;
        Context applicationContext = context.getApplicationContext();
        Context applicationContext2 = applicationContext.getApplicationContext();
        if (applicationContext2 != null) {
            applicationContext = applicationContext2;
        }
        H1 h5 = new H1(new h(applicationContext));
        h hVar = (h) h5.p;
        e eVar = h.f375c;
        eVar.a("requestInAppReview (%s)", hVar.f377b);
        if (hVar.f376a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", e.b(eVar.f400b, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap map = a.f446a;
            if (map.containsKey(-1)) {
                str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) a.f447b.get(-1)) + ")";
            } else {
                str = "";
            }
            oVarN = p000a.a.n(new B2.a(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
        } else {
            i iVar = new i();
            F2.h hVar2 = hVar.f376a;
            f fVar = new f(hVar, iVar, iVar, 0);
            synchronized (hVar2.f407f) {
                hVar2.e.add(iVar);
                iVar.f13713a.h(new u0(1, hVar2, iVar));
            }
            synchronized (hVar2.f407f) {
                try {
                    if (hVar2.f411k.getAndIncrement() > 0) {
                        e eVar2 = hVar2.f404b;
                        Object[] objArr2 = new Object[0];
                        eVar2.getClass();
                        if (Log.isLoggable("PlayCore", 3)) {
                            Log.d("PlayCore", e.b(eVar2.f400b, "Already connected to the service.", objArr2));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar2.a().post(new f(hVar2, iVar, fVar, 1));
            oVarN = iVar.f13713a;
        }
        o.e(oVarN, "requestReviewFlow(...)");
        oVarN.h(new p033h3.f(7, context, h5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerPlayStoreReview$lambda$1(Context context, b bVar, p101x2.h task) {
        p101x2.o oVarO;
        o.f(task, "task");
        if (task.g()) {
            E2.a aVar = (E2.a) task.e();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            H1 h5 = (H1) bVar;
            h5.getClass();
            c cVar = (c) aVar;
            if (cVar.p) {
                oVarO = p000a.a.o(null);
            } else {
                Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                intent.putExtra("confirmation_intent", cVar.f370o);
                intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
                i iVar = new i();
                intent.putExtra("result_receiver", new E2.e((Handler) h5.q, iVar));
                activity.startActivity(intent);
                oVarO = iVar.f13713a;
            }
            o.e(oVarO, "launchReviewFlow(...)");
            oVarO.h(new N.b(context, 21));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerPlayStoreReview$lambda$1$lambda$0(Context context, p101x2.h hVar) {
        o.f(hVar, "<unused var>");
        INSTANCE.getPrefs(context).edit().putLong(KEY_LAST_PROMPT_TIME, System.currentTimeMillis()).putInt(KEY_SUCCESS_COUNT, 0).apply();
    }

    public final void incrementSuccessAndPrompt(Context context) {
        o.f(context, "context");
        SharedPreferences prefs = getPrefs(context);
        if (prefs.getBoolean(KEY_RATED_OR_DISMISSED, false)) {
            return;
        }
        int i5 = prefs.getInt(KEY_SUCCESS_COUNT, 0) + 1;
        prefs.edit().putInt(KEY_SUCCESS_COUNT, i5).apply();
        if (i5 >= 3) {
            long j5 = prefs.getLong(KEY_LAST_PROMPT_TIME, 0L);
            long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j5);
            if (j5 == 0 || days >= 7) {
                triggerPlayStoreReview(context);
            }
        }
    }
}

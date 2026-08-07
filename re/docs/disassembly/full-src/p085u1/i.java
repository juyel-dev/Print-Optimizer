package p085u1;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import androidx.compose.foundation.text.modifiers.a;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.L7;
import com.google.android.gms.internal.ads.M4;
import com.google.android.gms.internal.ads.N4;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p020e1.h;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f13305a;

    public /* synthetic */ i(j jVar) {
        this.f13305a = jVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        j jVar = this.f13305a;
        try {
            jVar.f13309v = (M4) jVar.q.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            AbstractC1223ib.t("", e);
        } catch (ExecutionException e3) {
            e = e3;
            AbstractC1223ib.t("", e);
        } catch (TimeoutException e5) {
            AbstractC1223ib.t("", e5);
        }
        jVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) L7.f4718d.p());
        h hVar = jVar.f13308s;
        builder.appendQueryParameter("query", (String) hVar.e);
        builder.appendQueryParameter("pubId", (String) hVar.f11066b);
        builder.appendQueryParameter("mappver", (String) hVar.g);
        TreeMap treeMap = (TreeMap) hVar.f11068d;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        M4 m5 = jVar.f13309v;
        if (m5 != null) {
            try {
                uriBuild = M4.d(uriBuild, m5.f4804b.c(jVar.f13307r));
            } catch (N4 e6) {
                AbstractC1223ib.t("Unable to process ad data", e6);
            }
        }
        return a.m(jVar.t(), "#", uriBuild.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.f13305a.t;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}

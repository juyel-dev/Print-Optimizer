package p085u1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC0773Md;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.C0743Hd;
import com.google.android.gms.internal.ads.N4;
import p090v1.C2362o;
import p090v1.InterfaceC2371w;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f13303a;

    public g(j jVar) {
        this.f13303a = jVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        j jVar = this.f13303a;
        InterfaceC2371w interfaceC2371w = jVar.u;
        if (interfaceC2371w != null) {
            try {
                interfaceC2371w.a(AbstractC0773Md.I(1, null, null));
            } catch (RemoteException e) {
                AbstractC1223ib.u("#007 Could not call remote method.", e);
            }
        }
        InterfaceC2371w interfaceC2371w2 = jVar.u;
        if (interfaceC2371w2 != null) {
            try {
                interfaceC2371w2.A(0);
            } catch (RemoteException e3) {
                AbstractC1223ib.u("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        j jVar = this.f13303a;
        int iL = 0;
        if (str.startsWith(jVar.t())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            InterfaceC2371w interfaceC2371w = jVar.u;
            if (interfaceC2371w != null) {
                try {
                    interfaceC2371w.a(AbstractC0773Md.I(3, null, null));
                } catch (RemoteException e) {
                    AbstractC1223ib.u("#007 Could not call remote method.", e);
                }
            }
            InterfaceC2371w interfaceC2371w2 = jVar.u;
            if (interfaceC2371w2 != null) {
                try {
                    interfaceC2371w2.A(3);
                } catch (RemoteException e3) {
                    AbstractC1223ib.u("#007 Could not call remote method.", e3);
                }
            }
            jVar.S3(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            InterfaceC2371w interfaceC2371w3 = jVar.u;
            if (interfaceC2371w3 != null) {
                try {
                    interfaceC2371w3.a(AbstractC0773Md.I(1, null, null));
                } catch (RemoteException e5) {
                    AbstractC1223ib.u("#007 Could not call remote method.", e5);
                }
            }
            InterfaceC2371w interfaceC2371w4 = jVar.u;
            if (interfaceC2371w4 != null) {
                try {
                    interfaceC2371w4.A(0);
                } catch (RemoteException e6) {
                    AbstractC1223ib.u("#007 Could not call remote method.", e6);
                }
            }
            jVar.S3(0);
            return true;
        }
        boolean zStartsWith = str.startsWith("gmsg://adResized");
        Context context = jVar.f13307r;
        if (zStartsWith) {
            InterfaceC2371w interfaceC2371w5 = jVar.u;
            if (interfaceC2371w5 != null) {
                try {
                    interfaceC2371w5.f();
                } catch (RemoteException e7) {
                    AbstractC1223ib.u("#007 Could not call remote method.", e7);
                }
            }
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    C0743Hd c0743Hd = C2362o.f13474f.f13475a;
                    iL = C0743Hd.l(context, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            jVar.S3(iL);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        InterfaceC2371w interfaceC2371w6 = jVar.u;
        if (interfaceC2371w6 != null) {
            try {
                interfaceC2371w6.l();
                jVar.u.d();
            } catch (RemoteException e8) {
                AbstractC1223ib.u("#007 Could not call remote method.", e8);
            }
        }
        if (jVar.f13309v != null) {
            Uri uriA = Uri.parse(str);
            try {
                uriA = jVar.f13309v.a(uriA, context, null, null);
            } catch (N4 e9) {
                AbstractC1223ib.t("Unable to process ad data", e9);
            }
            str = uriA.toString();
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
        return true;
    }
}

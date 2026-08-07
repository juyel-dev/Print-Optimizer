package p090v1;

import J2.a;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.ads.AbstractC1223ib;
import com.google.android.gms.internal.ads.P4;
import java.util.concurrent.atomic.AtomicBoolean;
import p003a2.c;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Bundle bundle = null;
        try {
            bundle = c.a(context).a(Fields.SpotShadowColor, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC1223ib.q("Failed to load metadata: Package name not found.", e);
        } catch (NullPointerException e3) {
            AbstractC1223ib.q("Failed to load metadata: Null pointer exception.", e3);
        }
        if (P4.q == null) {
            P4.q = new P4(11);
        }
        P4 p5 = P4.q;
        if (bundle == null) {
            AbstractC1223ib.p("Metadata was null.");
        } else {
            try {
                String str = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                    try {
                        String str2 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                        if (str != null) {
                            if (!str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            AbstractC1223ib.m("Publisher provided Google AdMob App ID in manifest: ".concat(str));
                            if ((bool == null || !bool.booleanValue()) && ((AtomicBoolean) p5.p).compareAndSet(false, true)) {
                                new Thread(new a(15, context, str)).start();
                            }
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalStateException("\n\n******************************************************************************\n* Missing application ID. AdMob publishers should follow the instructions    *\n* here:                                                                      *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            AbstractC1223ib.m("The Google Mobile Ads SDK is integrated by ".concat(String.valueOf(str2)));
                        }
                    } catch (ClassCastException e5) {
                        throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e5);
                    }
                } catch (ClassCastException e6) {
                    throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e6);
                }
            } catch (ClassCastException e7) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e7);
            }
        }
        if (bundle != null) {
            boolean z3 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z4 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z3) {
                AbstractC1223ib.m("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z4) {
                AbstractC1223ib.m("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

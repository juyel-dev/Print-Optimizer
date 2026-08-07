package p082t2;

import android.accounts.AccountManager;
import androidx.compose.foundation.text.modifiers.a;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: t2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2255q extends AbstractC2250n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12819d;
    public AccountManager e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f12820f;
    public long g;

    @Override // p082t2.AbstractC2250n0
    public final boolean n() {
        Calendar calendar = Calendar.getInstance();
        this.f12818c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f12819d = a.m(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long o() {
        k();
        return this.f12818c;
    }

    public final String p() {
        k();
        return this.f12819d;
    }
}

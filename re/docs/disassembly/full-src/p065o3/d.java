package p065o3;

import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p051l3.p;
import p060n3.g;
import p079s3.a;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12173b = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12174a;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f12174a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (g.f11928a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // p051l3.p
    public final Object a(a aVar) {
        Date dateB;
        if (aVar.L() == 9) {
            aVar.H();
            return null;
        }
        String strJ = aVar.J();
        synchronized (this.f12174a) {
            try {
                Iterator it = this.f12174a.iterator();
                while (it.hasNext()) {
                    try {
                        dateB = ((DateFormat) it.next()).parse(strJ);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    dateB = p069p3.a.b(strJ, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder sbK = AbstractC1421mz.k("Failed parsing '", strJ, "' as Date; at path ");
                    sbK.append(aVar.u(true));
                    throw new p051l3.g(sbK.toString(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dateB;
    }

    @Override // p051l3.p
    public final void b(b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.y();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f12174a.get(0);
        synchronized (this.f12174a) {
            str = dateFormat.format(date);
        }
        bVar.E(str);
    }
}

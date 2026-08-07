package p075r3;

import com.google.android.gms.internal.ads.AbstractC1421mz;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p051l3.g;
import p051l3.p;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p065o3.a f12333c = new p065o3.a(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p065o3.a f12334d = new p065o3.a(5);
    public static final p065o3.a e = new p065o3.a(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12336b;

    public a(int i5) {
        this.f12335a = i5;
        switch (i5) {
            case 1:
                this.f12336b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f12336b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // p051l3.p
    public final Object a(p079s3.a aVar) {
        Date date;
        Time time;
        switch (this.f12335a) {
            case 0:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                String strJ = aVar.J();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.f12336b).parse(strJ);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e3) {
                    StringBuilder sbK = AbstractC1421mz.k("Failed parsing '", strJ, "' as SQL Date; at path ");
                    sbK.append(aVar.u(true));
                    throw new g(sbK.toString(), e3);
                }
            case 1:
                if (aVar.L() == 9) {
                    aVar.H();
                    return null;
                }
                String strJ2 = aVar.J();
                try {
                    synchronized (this) {
                        try {
                            time = new Time(((SimpleDateFormat) this.f12336b).parse(strJ2).getTime());
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return time;
                } catch (ParseException e5) {
                    StringBuilder sbK2 = AbstractC1421mz.k("Failed parsing '", strJ2, "' as SQL Time; at path ");
                    sbK2.append(aVar.u(true));
                    throw new g(sbK2.toString(), e5);
                }
            default:
                Date date2 = (Date) ((p) this.f12336b).a(aVar);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    @Override // p051l3.p
    public final void b(b bVar, Object obj) throws IOException {
        String str;
        String str2;
        switch (this.f12335a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    bVar.y();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.f12336b).format((Date) date);
                    break;
                }
                bVar.E(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    bVar.y();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.f12336b).format((Date) time);
                    break;
                }
                bVar.E(str2);
                return;
            default:
                ((p) this.f12336b).b(bVar, (Timestamp) obj);
                return;
        }
    }

    public a(p pVar) {
        this.f12335a = 2;
        this.f12336b = pVar;
    }
}

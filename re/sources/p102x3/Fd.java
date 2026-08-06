package p102x3;

import B3.o;
import C3.u;
import F3.d;
import G3.a;
import H3.j;
import N0.C0135c;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import a4.T;
import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c4.n;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C;
import p083t3.C2281d0;
import p087u3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Fd extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13964o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Uri f13965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13966s;
    public final /* synthetic */ PDFProcessor t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fd(String str, Context context, Uri uri, PrintOrderViewModel printOrderViewModel, PDFProcessor pDFProcessor, d dVar) {
        super(2, dVar);
        this.p = str;
        this.q = context;
        this.f13965r = uri;
        this.f13966s = printOrderViewModel;
        this.t = pDFProcessor;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Fd(this.p, this.q, this.f13965r, this.f13966s, this.t, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Fd) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x014a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0178  */
    /* JADX WARN: Code duplicated, block: B:71:0x0183  */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        Object objM;
        String id;
        File fileF;
        int iIntValue;
        String strZ;
        File fileF2;
        a aVar = a.f448o;
        int i5 = this.f13964o;
        o oVar = o.f154a;
        Uri uri = this.f13965r;
        String str = this.p;
        Context context = this.q;
        PrintOrderViewModel printOrderViewModel = this.f13966s;
        if (i5 == 0) {
            o4.d.y(obj);
            if (str == null) {
                C c5 = new C();
                c5.f11692o = -1;
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                            c5.f11692o = pdfRenderer.getPageCount();
                            pdfRenderer.close();
                            Q3.a.l(parcelFileDescriptorOpenFileDescriptor, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                Q3.a.l(parcelFileDescriptorOpenFileDescriptor, th);
                                throw th2;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                int i6 = c5.f11692o;
                if (i6 <= 0) {
                    e4.e eVar = H.f1766a;
                    Y3.e eVar2 = n.f2606a;
                    Cd cd = new Cd(context, null);
                    this.f13964o = 1;
                    return A.C(eVar2, cd, this) == aVar ? aVar : oVar;
                }
                if (i6 < 20) {
                    e4.e eVar3 = H.f1766a;
                    Y3.e eVar4 = n.f2606a;
                    Dd dd = new Dd(context, c5, null);
                    this.f13964o = 2;
                    return A.C(eVar4, dd, this) == aVar ? aVar : oVar;
                }
                if (i6 > 250) {
                    e4.e eVar5 = H.f1766a;
                    Y3.e eVar6 = n.f2606a;
                    Ed ed = new Ed(context, c5, null);
                    this.f13964o = 3;
                    return A.C(eVar6, ed, this) == aVar ? aVar : oVar;
                }
                String strZ2 = Gd.z(context, uri);
                int i7 = c5.f11692o;
                printOrderViewModel.getClass();
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.o.e(string, "toString(...)");
                m mVar = new m(string, "", i7, p087u3.j.BW, null, null, null, 1, strZ2, null, null, "idle", 0, null, null, null, 63088, null);
                T t = printOrderViewModel.g;
                t.j(null, u.A0((Collection) t.getValue(), mVar));
                printOrderViewModel.q();
                printOrderViewModel.e();
                m mVar2 = (m) u.x0((List) ((T) printOrderViewModel.f10897h.f1964o).getValue());
                if (mVar2 != null && (id = mVar2.getId()) != null && (fileF = PrintOrderViewModel.f(context, uri)) != null) {
                    printOrderViewModel.s(fileF, id);
                }
            } else {
                printOrderViewModel.r(str, new C0135c(17));
                this.f13964o = 4;
                objM = this.t.m(uri, this);
                if (objM == aVar) {
                    return aVar;
                }
                iIntValue = ((Number) objM).intValue();
                if (iIntValue <= 0) {
                    printOrderViewModel.r(str, new C0135c(18));
                    return oVar;
                }
                if (iIntValue < 20) {
                    printOrderViewModel.r(str, new C2281d0(iIntValue, 1));
                    return oVar;
                }
                if (iIntValue > 250) {
                    printOrderViewModel.r(str, new C2281d0(iIntValue, 2));
                    return oVar;
                }
                strZ = Gd.z(context, uri);
                printOrderViewModel.getClass();
                fileF2 = PrintOrderViewModel.f(context, uri);
                if (fileF2 == null) {
                    printOrderViewModel.r(str, new C0135c(19));
                    return oVar;
                }
                printOrderViewModel.r(str, new C2770yb(iIntValue, strZ));
                printOrderViewModel.s(fileF2, str);
            }
        } else {
            if (i5 == 1) {
                o4.d.y(obj);
            }
            if (i5 == 2) {
                o4.d.y(obj);
            }
            if (i5 == 3) {
                o4.d.y(obj);
            }
            if (i5 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
            objM = obj;
            iIntValue = ((Number) objM).intValue();
            if (iIntValue <= 0) {
                printOrderViewModel.r(str, new C0135c(18));
                return oVar;
            }
            if (iIntValue < 20) {
                printOrderViewModel.r(str, new C2281d0(iIntValue, 1));
                return oVar;
            }
            if (iIntValue > 250) {
                printOrderViewModel.r(str, new C2281d0(iIntValue, 2));
                return oVar;
            }
            strZ = Gd.z(context, uri);
            printOrderViewModel.getClass();
            fileF2 = PrintOrderViewModel.f(context, uri);
            if (fileF2 == null) {
                printOrderViewModel.r(str, new C0135c(19));
                return oVar;
            }
            printOrderViewModel.r(str, new C2770yb(iIntValue, strZ));
            printOrderViewModel.s(fileF2, str);
        }
        return oVar;
    }
}

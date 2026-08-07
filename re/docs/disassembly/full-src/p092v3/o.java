package p092v3;

import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.notescrafter.service.PDFProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f13553o;
    public final /* synthetic */ Uri p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PDFProcessor pDFProcessor, Uri uri, d dVar) {
        super(2, dVar);
        this.f13553o = pDFProcessor;
        this.p = uri;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new o(this.f13553o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(B3.o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        PdfRenderer pdfRenderer;
        Exception e;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        a aVar = a.f448o;
        o4.d.y(obj);
        int pageCount = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        PdfRenderer pdfRenderer2 = null;
        try {
            try {
                parcelFileDescriptorOpenFileDescriptor = this.f13553o.f10916a.getContentResolver().openFileDescriptor(this.p, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                        try {
                            pageCount = pdfRenderer.getPageCount();
                            pdfRenderer2 = pdfRenderer;
                        } catch (Exception e3) {
                            e = e3;
                            e.printStackTrace();
                            if (pdfRenderer != null) {
                                pdfRenderer.close();
                            }
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                            }
                            return new Integer(pageCount);
                        }
                    } catch (Exception e5) {
                        pdfRenderer = null;
                        e = e5;
                    } catch (Throwable th) {
                        th = th;
                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                        if (parcelFileDescriptor != 0) {
                            parcelFileDescriptor.close();
                        }
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                        throw th;
                    }
                }
                if (pdfRenderer2 != null) {
                    pdfRenderer2.close();
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            pdfRenderer = null;
            e = e6;
            parcelFileDescriptorOpenFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            if (parcelFileDescriptor != 0) {
                parcelFileDescriptor.close();
            }
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            throw th;
        }
        return new Integer(pageCount);
    }
}

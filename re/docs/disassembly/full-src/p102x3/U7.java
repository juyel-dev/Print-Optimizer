package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.MutableState;

/* JADX INFO: loaded from: classes2.dex */
public final class U7 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f14493o;
    public final /* synthetic */ Uri p;
    public final /* synthetic */ int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14494r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7(Context context, Uri uri, int i5, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f14493o = context;
        this.p = uri;
        this.q = i5;
        this.f14494r = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new U7(this.f14493o, this.p, this.q, this.f14494r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        U7 u7 = (U7) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        u7.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        PdfRenderer pdfRenderer;
        Throwable th;
        ParcelFileDescriptor parcelFileDescriptor;
        PdfRenderer pdfRenderer2;
        Exception e;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        a aVar = a.f448o;
        o4.d.y(obj);
        PdfRenderer pdfRenderer3 = null;
        try {
            try {
                parcelFileDescriptorOpenFileDescriptor = this.f14493o.getContentResolver().openFileDescriptor(this.p, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        pdfRenderer2 = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                        try {
                            int pageCount = pdfRenderer2.getPageCount();
                            int i5 = this.q;
                            if (i5 < pageCount) {
                                PdfRenderer.Page pageOpenPage = pdfRenderer2.openPage(i5);
                                kotlin.jvm.internal.o.e(pageOpenPage, "openPage(...)");
                                try {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (pageOpenPage.getWidth() * 1.5f), (int) (pageOpenPage.getHeight() * 1.5f), Bitmap.Config.ARGB_8888);
                                    kotlin.jvm.internal.o.e(bitmapCreateBitmap, "createBitmap(...)");
                                    bitmapCreateBitmap.eraseColor(-1);
                                    pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                                    this.f14494r.setValue(bitmapCreateBitmap);
                                    pageOpenPage.close();
                                } catch (Throwable th2) {
                                    pageOpenPage.close();
                                    throw th2;
                                }
                            }
                            pdfRenderer3 = pdfRenderer2;
                        } catch (Exception e3) {
                            e = e3;
                            parcelFileDescriptorOpenFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                            e.printStackTrace();
                            if (pdfRenderer2 != null) {
                                pdfRenderer2.close();
                            }
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                            }
                            return o.f154a;
                        }
                    } catch (Exception e5) {
                        pdfRenderer2 = null;
                        e = e5;
                        parcelFileDescriptorOpenFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    } catch (Throwable th3) {
                        pdfRenderer = null;
                        th = th3;
                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                        if (pdfRenderer != null) {
                            pdfRenderer.close();
                        }
                        if (parcelFileDescriptor != 0) {
                            parcelFileDescriptor.close();
                        }
                        throw th;
                    }
                }
                if (pdfRenderer3 != null) {
                    pdfRenderer3.close();
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            } catch (Throwable th4) {
                th = th4;
                parcelFileDescriptor = aVar;
            }
        } catch (Exception e6) {
            pdfRenderer2 = null;
            e = e6;
            parcelFileDescriptorOpenFileDescriptor = null;
        } catch (Throwable th5) {
            pdfRenderer = null;
            th = th5;
            parcelFileDescriptor = 0;
        }
        return o.f154a;
    }
}

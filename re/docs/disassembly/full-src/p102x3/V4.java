package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Fields;
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public final class V4 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f14510o;
    public final /* synthetic */ g p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(Context context, g gVar, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f14510o = context;
        this.p = gVar;
        this.q = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new V4(this.f14510o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        V4 v4 = (V4) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        v4.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0082 A[EXC_TOP_SPLITTER, PHI: r1
  0x0082: PHI (r1v7 android.os.ParcelFileDescriptor) = (r1v6 android.os.ParcelFileDescriptor), (r1v10 android.os.ParcelFileDescriptor) binds: [B:38:0x0096, B:28:0x0080] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        PdfRenderer pdfRenderer;
        ParcelFileDescriptor parcelFileDescriptor2;
        PdfRenderer pdfRenderer2;
        ParcelFileDescriptor parcelFileDescriptor3;
        Exception e;
        g gVar = this.p;
        a aVar = a.f448o;
        o4.d.y(obj);
        PdfRenderer pdfRenderer3 = null;
        try {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f14510o.getContentResolver().openFileDescriptor(gVar.getSourceUri(), "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        pdfRenderer2 = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                        try {
                            if (gVar.getOriginalPageIndex() < pdfRenderer2.getPageCount()) {
                                PdfRenderer.Page pageOpenPage = pdfRenderer2.openPage(gVar.getOriginalPageIndex());
                                kotlin.jvm.internal.o.e(pageOpenPage, "openPage(...)");
                                try {
                                    int height = (int) (pageOpenPage.getHeight() * (Fields.RotationY / pageOpenPage.getWidth()));
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Fields.RotationY, height, Bitmap.Config.ARGB_8888);
                                    kotlin.jvm.internal.o.e(bitmapCreateBitmap, "createBitmap(...)");
                                    bitmapCreateBitmap.eraseColor(-1);
                                    pageOpenPage.render(bitmapCreateBitmap, new Rect(0, 0, Fields.RotationY, height), null, 1);
                                    this.q.setValue(bitmapCreateBitmap);
                                    pageOpenPage.close();
                                } catch (Throwable th) {
                                    pageOpenPage.close();
                                    throw th;
                                }
                            }
                            pdfRenderer3 = pdfRenderer2;
                        } catch (Exception e3) {
                            e = e3;
                            parcelFileDescriptorOpenFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                            e.printStackTrace();
                            if (pdfRenderer2 != null) {
                                try {
                                    pdfRenderer2.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        pdfRenderer2 = null;
                        parcelFileDescriptor2 = parcelFileDescriptorOpenFileDescriptor;
                        e = e;
                        parcelFileDescriptorOpenFileDescriptor = parcelFileDescriptor2;
                        e.printStackTrace();
                        if (pdfRenderer2 != null) {
                            pdfRenderer2.close();
                        }
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        return o.f154a;
                    } catch (Throwable th2) {
                        th = th2;
                        pdfRenderer = null;
                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                        th = th;
                        parcelFileDescriptor3 = parcelFileDescriptor;
                        if (pdfRenderer != null) {
                            try {
                                pdfRenderer.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (parcelFileDescriptor3 != 0) {
                            throw th;
                        }
                        try {
                            parcelFileDescriptor3.close();
                            throw th;
                        } catch (Exception unused4) {
                            throw th;
                        }
                    }
                }
                if (pdfRenderer3 != null) {
                    try {
                        pdfRenderer3.close();
                    } catch (Exception unused5) {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptor3 = aVar;
                if (pdfRenderer != null) {
                    pdfRenderer.close();
                }
                if (parcelFileDescriptor3 != 0) {
                    throw th;
                }
                parcelFileDescriptor3.close();
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            parcelFileDescriptor2 = null;
            pdfRenderer2 = null;
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptor = null;
            pdfRenderer = null;
        }
        return o.f154a;
    }
}

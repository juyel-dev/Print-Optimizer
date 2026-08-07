package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.MutableState;

/* JADX INFO: loaded from: classes2.dex */
public final class W7 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f14582o;
    public final /* synthetic */ Uri p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7(Context context, Uri uri, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f14582o = context;
        this.p = uri;
        this.q = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new W7(this.f14582o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W7) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        PdfRenderer pdfRenderer;
        Throwable th;
        o oVar = o.f154a;
        MutableState mutableState = this.q;
        a aVar = a.f448o;
        o4.d.y(obj);
        ParcelFileDescriptor parcelFileDescriptor = null;
        PdfRenderer pdfRenderer2 = null;
        try {
            parcelFileDescriptorOpenFileDescriptor = this.f14582o.getContentResolver().openFileDescriptor(this.p, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                    try {
                        mutableState.setValue(Integer.valueOf(pdfRenderer.getPageCount()));
                        pdfRenderer2 = pdfRenderer;
                    } catch (Exception unused) {
                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                        try {
                            mutableState.setValue(0);
                            if (pdfRenderer != null) {
                                pdfRenderer.close();
                            }
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            parcelFileDescriptorOpenFileDescriptor = parcelFileDescriptor;
                            th = th;
                            if (pdfRenderer != null) {
                                pdfRenderer.close();
                            }
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (pdfRenderer != null) {
                            pdfRenderer.close();
                        }
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                    pdfRenderer = null;
                } catch (Throwable th4) {
                    th = th4;
                    pdfRenderer = null;
                    th = th;
                    if (pdfRenderer != null) {
                        pdfRenderer.close();
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    throw th;
                }
            } else {
                oVar = null;
            }
            if (pdfRenderer2 != null) {
                pdfRenderer2.close();
            }
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
            }
        } catch (Exception unused3) {
            pdfRenderer = null;
        } catch (Throwable th5) {
            th = th5;
            parcelFileDescriptorOpenFileDescriptor = null;
            pdfRenderer = null;
        }
        return oVar;
    }
}

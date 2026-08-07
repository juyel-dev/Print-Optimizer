package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.MutableState;
import c4.n;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: x3.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2659rc extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15499o;
    public final /* synthetic */ String p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15500r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2659rc(String str, MutableState mutableState, MutableState mutableState2, d dVar) {
        super(2, dVar);
        this.p = str;
        this.q = mutableState;
        this.f15500r = mutableState2;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2659rc(this.p, this.q, this.f15500r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2659rc) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        PdfRenderer pdfRenderer;
        Y3.e eVar;
        C2628pc c2628pc;
        a aVar = a.f448o;
        int i5 = this.f15499o;
        if (i5 == 0) {
            o4.d.y(obj);
            File file = new File(this.p);
            boolean zExists = file.exists();
            MutableState mutableState = this.f15500r;
            PdfRenderer pdfRenderer2 = null;
            if (zExists) {
                ArrayList arrayList = new ArrayList();
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                    try {
                        pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                        try {
                            try {
                                int iMin = Math.min(pdfRenderer.getPageCount(), 12);
                                for (int i6 = 0; i6 < iMin; i6++) {
                                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i6);
                                    kotlin.jvm.internal.o.e(pageOpenPage, "openPage(...)");
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(350, (int) ((350 / pageOpenPage.getWidth()) * pageOpenPage.getHeight()), Bitmap.Config.ARGB_8888);
                                    kotlin.jvm.internal.o.e(bitmapCreateBitmap, "createBitmap(...)");
                                    bitmapCreateBitmap.eraseColor(-1);
                                    pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                                    pageOpenPage.close();
                                    arrayList.add(bitmapCreateBitmap);
                                }
                                pdfRenderer.close();
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                                if (pdfRenderer != null) {
                                    pdfRenderer.close();
                                }
                                if (parcelFileDescriptorOpen != null) {
                                }
                                e4.e eVar2 = H.f1766a;
                                eVar = n.f2606a;
                                c2628pc = new C2628pc(arrayList, this.q, mutableState, null);
                                this.f15499o = 1;
                                if (A.C(eVar, c2628pc, this) == aVar) {
                                    return aVar;
                                }
                                return o.f154a;
                            }
                        } catch (Throwable th) {
                            th = th;
                            pdfRenderer2 = pdfRenderer;
                            if (pdfRenderer2 != null) {
                                pdfRenderer2.close();
                            }
                            if (parcelFileDescriptorOpen != null) {
                                parcelFileDescriptorOpen.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        pdfRenderer = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (pdfRenderer2 != null) {
                            pdfRenderer2.close();
                        }
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    parcelFileDescriptorOpen = null;
                    pdfRenderer = null;
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptorOpen = null;
                }
                e4.e eVar3 = H.f1766a;
                eVar = n.f2606a;
                c2628pc = new C2628pc(arrayList, this.q, mutableState, null);
                this.f15499o = 1;
                if (A.C(eVar, c2628pc, this) == aVar) {
                    return aVar;
                }
            } else {
                e4.e eVar4 = H.f1766a;
                Y3.e eVar5 = n.f2606a;
                C2644qc c2644qc = new C2644qc(mutableState, null);
                this.f15499o = 2;
                if (A.C(eVar5, c2644qc, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i5 != 1 && i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        return o.f154a;
    }
}

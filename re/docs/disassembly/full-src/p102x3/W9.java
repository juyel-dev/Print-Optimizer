package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import K2.b;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.MutableState;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public final class W9 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f14585o;
    public final /* synthetic */ Uri p;
    public final /* synthetic */ float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ E f14586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14587s;
    public final /* synthetic */ File t;
    public final /* synthetic */ String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14590x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14591y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W9(Context context, Uri uri, float f5, E e, ArrayList arrayList, File file, String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, d dVar) {
        super(2, dVar);
        this.f14585o = context;
        this.p = uri;
        this.q = f5;
        this.f14586r = e;
        this.f14587s = arrayList;
        this.t = file;
        this.u = str;
        this.f14588v = mutableState;
        this.f14589w = mutableState2;
        this.f14590x = mutableState3;
        this.f14591y = mutableState4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new W9(this.f14585o, this.p, this.q, this.f14586r, this.f14587s, this.t, this.u, this.f14588v, this.f14589w, this.f14590x, this.f14591y, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        W9 w9 = (W9) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        w9.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.graphics.Matrix, android.graphics.Rect] */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        PdfRenderer pdfRenderer;
        int i5 = 1;
        float f5 = this.q;
        MutableState mutableState = this.f14588v;
        a aVar = a.f448o;
        o4.d.y(obj);
        PdfRenderer pdfRenderer2 = null;
        ?? r4 = 0;
        try {
            parcelFileDescriptorOpenFileDescriptor = this.f14585o.getContentResolver().openFileDescriptor(this.p, "r");
            ArrayList<G3> arrayList = this.f14587s;
            MutableState mutableState2 = this.f14589w;
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                    try {
                        int iB = Z9.b(mutableState);
                        int i6 = 0;
                        while (i6 < iB) {
                            int i7 = i6 + 1;
                            mutableState2.setValue("Converting page " + i7 + " of " + ((Number) mutableState.getValue()).intValue() + "...");
                            this.f14590x.setValue(Float.valueOf(((float) i6) / ((float) ((Number) mutableState.getValue()).intValue())));
                            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i6);
                            kotlin.jvm.internal.o.e(pageOpenPage, "openPage(...)");
                            try {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (pageOpenPage.getWidth() * f5), (int) (pageOpenPage.getHeight() * f5), Bitmap.Config.ARGB_8888);
                                kotlin.jvm.internal.o.e(bitmapCreateBitmap, "createBitmap(...)");
                                bitmapCreateBitmap.eraseColor(-1);
                                pageOpenPage.render(bitmapCreateBitmap, r4, r4, i5);
                                File file = new File((File) this.f14586r.f11694o, "page_" + i7 + ".jpg");
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 92, fileOutputStream);
                                    Q3.a.l(fileOutputStream, null);
                                    bitmapCreateBitmap.recycle();
                                    String name = file.getName();
                                    kotlin.jvm.internal.o.e(name, "getName(...)");
                                    float f6 = f5;
                                    MutableState mutableState3 = mutableState;
                                    arrayList.add(new G3(file, name, file.length()));
                                    pageOpenPage.close();
                                    if (i6 % 5 == 0) {
                                        System.gc();
                                    }
                                    i6 = i7;
                                    f5 = f6;
                                    mutableState = mutableState3;
                                    i5 = 1;
                                    r4 = 0;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        Q3.a.l(fileOutputStream, th);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                pageOpenPage.close();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        pdfRenderer2 = pdfRenderer;
                        if (pdfRenderer2 != null) {
                            pdfRenderer2.close();
                        }
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    pdfRenderer2 = null;
                }
            } else {
                pdfRenderer = null;
            }
            if (pdfRenderer != null) {
                pdfRenderer.close();
            }
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (arrayList.size() > 1) {
                mutableState2.setValue("Creating ZIP archive...");
                String str = this.u;
                String strConcat = str.concat("_images.zip");
                File file2 = this.t;
                File file3 = new File(file2, strConcat);
                int i8 = 1;
                while (file3.exists()) {
                    file3 = new File(file2, str + "_images_(" + i8 + ").zip");
                    i8++;
                }
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file3)));
                try {
                    for (G3 g5 : arrayList) {
                        FileInputStream fileInputStream = new FileInputStream(g5.f13975a);
                        try {
                            zipOutputStream.putNextEntry(new ZipEntry(g5.f13976b));
                            b.d(fileInputStream, zipOutputStream);
                            zipOutputStream.closeEntry();
                            Q3.a.l(fileInputStream, null);
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                Q3.a.l(fileInputStream, th6);
                                throw th7;
                            }
                        }
                    }
                    Q3.a.l(zipOutputStream, null);
                    this.f14591y.setValue(file3);
                } catch (Throwable th8) {
                    try {
                        throw th8;
                    } catch (Throwable th9) {
                        Q3.a.l(zipOutputStream, th8);
                        throw th9;
                    }
                }
            }
            return o.f154a;
        } catch (Throwable th10) {
            th = th10;
            parcelFileDescriptorOpenFileDescriptor = null;
        }
    }
}

package com.notescrafter.service;

import H3.j;
import M3.a;
import N0.q;
import X3.A;
import X3.H;
import a4.AbstractC0211j;
import a4.InterfaceC0207f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import p087u3.b;
import p087u3.d;
import p087u3.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PDFProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10916a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PDFProcessor(Context context) {
        o.f(context, "context");
        this.f10916a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void fillRegion(int[] iArr, int i5, int i6, float f5, float f6, float f7, float f8, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void fillRegionOval(int[] iArr, int i5, int i6, float f5, float f6, float f7, float f8, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean finishPdfWriter(long j5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final d i(PDFProcessor pDFProcessor, e eVar) {
        pDFProcessor.getClass();
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = (runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory())) / ((long) 1048576);
        if (jFreeMemory < 50) {
            return d.LOW;
        }
        return (jFreeMemory >= 100 || eVar.getQuality() != d.HIGH) ? eVar.getQuality() : d.MEDIUM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native long initPdfWriter(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void invertRegion(int[] iArr, int i5, int i6, float f5, float f6, float f7, float f8);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void invertRegionOval(int[] iArr, int i5, int i6, float f5, float f6, float f7, float f8);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int processPage(int[] iArr, int i5, int i6, boolean z3, boolean z4, boolean z5, boolean z6, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void removeLogo(int[] iArr, int i5, int i6, float f5, float f6, float f7, float f8, boolean z3);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean writePageNative(long j5, byte[] bArr, int i5, int i6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(Bitmap bitmap, b filterSettings) {
        o.f(filterSettings, "filterSettings");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        processPage(iArr, width, height, filterSettings.getInvertColors(), filterSettings.getGrayscale(), filterSettings.getClearBackground(), filterSettings.getBlackAndWhite(), filterSettings.getBackgroundThreshold());
        if (filterSettings.getRemoveLogo() && filterSettings.getLogoBox() != null) {
            RectF logoBox = filterSettings.getLogoBox();
            removeLogo(iArr, width, height, logoBox.left, logoBox.top, logoBox.width(), logoBox.height(), o.b(filterSettings.getLogoShape(), "circle"));
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File l() {
        Object next = null;
        File[] fileArrListFiles = new File(this.f10916a.getExternalFilesDir(null), "NotesCrafterFiles").listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            o.c(file);
            if (a.y(file).equalsIgnoreCase("pdf")) {
                arrayList.add(file);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jLastModified = ((File) next).lastModified();
                do {
                    Object next2 = it.next();
                    long jLastModified2 = ((File) next2).lastModified();
                    if (jLastModified < jLastModified2) {
                        next = next2;
                        jLastModified = jLastModified2;
                    }
                } while (it.hasNext());
            }
        }
        return (File) next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object m(Uri uri, j jVar) {
        e4.e eVar = H.f1766a;
        return A.C(e4.d.f11107o, new p092v3.o(this, uri, null), jVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0207f n(List pagesToProcess, b filterSettings, e outputSettings, String outputFileName) {
        o.f(pagesToProcess, "pagesToProcess");
        o.f(filterSettings, "filterSettings");
        o.f(outputSettings, "outputSettings");
        o.f(outputFileName, "outputFileName");
        q qVar = new q(new p092v3.q(outputFileName, this, pagesToProcess, outputSettings, filterSettings, null));
        e4.e eVar = H.f1766a;
        return AbstractC0211j.i(qVar, e4.d.f11107o);
    }
}

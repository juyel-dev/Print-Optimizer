package p083t3;

import O3.c;
import androidx.compose.foundation.text.modifiers.a;
import androidx.compose.ui.graphics.Fields;
import com.notescrafter.PrintOrderViewModel;
import kotlin.jvm.internal.o;
import p011c0.d;
import p087u3.m;

/* JADX INFO: renamed from: t3.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2281d0 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13158o;
    public final /* synthetic */ int p;

    public /* synthetic */ C2281d0(int i5, int i6) {
        this.f13158o = i6;
        this.p = i5;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        int i5 = this.p;
        switch (this.f13158o) {
            case 0:
                m it = (m) obj;
                d dVar = PrintOrderViewModel.f10861f0;
                o.f(it, "it");
                return it.copy((55295 & 1) != 0 ? it.id : null, (55295 & 2) != 0 ? it.name : null, (55295 & 4) != 0 ? it.pages : 0, (55295 & 8) != 0 ? it.color : null, (55295 & 16) != 0 ? it.duplex : null, (55295 & 32) != 0 ? it.size : null, (55295 & 64) != 0 ? it.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? it.copies : 0, (55295 & Fields.RotationX) != 0 ? it.fileName : null, (55295 & Fields.RotationY) != 0 ? it.previewUri : null, (55295 & Fields.RotationZ) != 0 ? it.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? it.uploadStatus : null, (55295 & Fields.TransformOrigin) != 0 ? it.uploadProgress : this.p, (55295 & Fields.Shape) != 0 ? it.uploadError : null, (55295 & Fields.Clip) != 0 ? it.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? it.localPath : null);
            case 1:
                m mVar = (m) obj;
                return mVar.copy((55295 & 1) != 0 ? mVar.id : null, (55295 & 2) != 0 ? mVar.name : null, (55295 & 4) != 0 ? mVar.pages : 0, (55295 & 8) != 0 ? mVar.color : null, (55295 & 16) != 0 ? mVar.duplex : null, (55295 & 32) != 0 ? mVar.size : null, (55295 & 64) != 0 ? mVar.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? mVar.copies : 0, (55295 & Fields.RotationX) != 0 ? mVar.fileName : null, (55295 & Fields.RotationY) != 0 ? mVar.previewUri : null, (55295 & Fields.RotationZ) != 0 ? mVar.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? mVar.uploadStatus : "error", (55295 & Fields.TransformOrigin) != 0 ? mVar.uploadProgress : 0, (55295 & Fields.Shape) != 0 ? mVar.uploadError : a.o(new StringBuilder("Too short: "), i5, " pages. Each notebook must have at least 20 pages."), (55295 & Fields.Clip) != 0 ? mVar.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? mVar.localPath : null);
            default:
                m mVar2 = (m) obj;
                return mVar2.copy((55295 & 1) != 0 ? mVar2.id : null, (55295 & 2) != 0 ? mVar2.name : null, (55295 & 4) != 0 ? mVar2.pages : 0, (55295 & 8) != 0 ? mVar2.color : null, (55295 & 16) != 0 ? mVar2.duplex : null, (55295 & 32) != 0 ? mVar2.size : null, (55295 & 64) != 0 ? mVar2.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? mVar2.copies : 0, (55295 & Fields.RotationX) != 0 ? mVar2.fileName : null, (55295 & Fields.RotationY) != 0 ? mVar2.previewUri : null, (55295 & Fields.RotationZ) != 0 ? mVar2.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? mVar2.uploadStatus : "error", (55295 & Fields.TransformOrigin) != 0 ? mVar2.uploadProgress : 0, (55295 & Fields.Shape) != 0 ? mVar2.uploadError : a.o(new StringBuilder("Exceeds 250 pages limit ("), i5, " pages). Please split the PDF."), (55295 & Fields.Clip) != 0 ? mVar2.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? mVar2.localPath : null);
        }
    }
}

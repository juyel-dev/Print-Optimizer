package p083t3;

import O3.c;
import androidx.compose.ui.graphics.Fields;
import com.notescrafter.PrintOrderViewModel;
import java.io.File;
import kotlin.jvm.internal.o;
import p011c0.d;
import p087u3.m;

/* JADX INFO: renamed from: t3.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2279c0 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13155o;
    public final /* synthetic */ File p;

    public /* synthetic */ C2279c0(File file, int i5) {
        this.f13155o = i5;
        this.p = file;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        File file = this.p;
        switch (this.f13155o) {
            case 0:
                m it = (m) obj;
                d dVar = PrintOrderViewModel.f10861f0;
                o.f(it, "it");
                return it.copy((55295 & 1) != 0 ? it.id : null, (55295 & 2) != 0 ? it.name : null, (55295 & 4) != 0 ? it.pages : 0, (55295 & 8) != 0 ? it.color : null, (55295 & 16) != 0 ? it.duplex : null, (55295 & 32) != 0 ? it.size : null, (55295 & 64) != 0 ? it.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? it.copies : 0, (55295 & Fields.RotationX) != 0 ? it.fileName : null, (55295 & Fields.RotationY) != 0 ? it.previewUri : null, (55295 & Fields.RotationZ) != 0 ? it.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? it.uploadStatus : null, (55295 & Fields.TransformOrigin) != 0 ? it.uploadProgress : 0, (55295 & Fields.Shape) != 0 ? it.uploadError : null, (55295 & Fields.Clip) != 0 ? it.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? it.localPath : file.getAbsolutePath());
            case 1:
                m it2 = (m) obj;
                d dVar2 = PrintOrderViewModel.f10861f0;
                o.f(it2, "it");
                return it2.copy((55295 & 1) != 0 ? it2.id : null, (55295 & 2) != 0 ? it2.name : null, (55295 & 4) != 0 ? it2.pages : 0, (55295 & 8) != 0 ? it2.color : null, (55295 & 16) != 0 ? it2.duplex : null, (55295 & 32) != 0 ? it2.size : null, (55295 & 64) != 0 ? it2.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? it2.copies : 0, (55295 & Fields.RotationX) != 0 ? it2.fileName : null, (55295 & Fields.RotationY) != 0 ? it2.previewUri : null, (55295 & Fields.RotationZ) != 0 ? it2.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? it2.uploadStatus : "uploading", (55295 & Fields.TransformOrigin) != 0 ? it2.uploadProgress : 10, (55295 & Fields.Shape) != 0 ? it2.uploadError : null, (55295 & Fields.Clip) != 0 ? it2.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? it2.localPath : file.getAbsolutePath());
            default:
                m mVar = (m) obj;
                return mVar.copy((55295 & 1) != 0 ? mVar.id : null, (55295 & 2) != 0 ? mVar.name : null, (55295 & 4) != 0 ? mVar.pages : 0, (55295 & 8) != 0 ? mVar.color : null, (55295 & 16) != 0 ? mVar.duplex : null, (55295 & 32) != 0 ? mVar.size : null, (55295 & 64) != 0 ? mVar.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? mVar.copies : 0, (55295 & Fields.RotationX) != 0 ? mVar.fileName : null, (55295 & Fields.RotationY) != 0 ? mVar.previewUri : null, (55295 & Fields.RotationZ) != 0 ? mVar.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? mVar.uploadStatus : null, (55295 & Fields.TransformOrigin) != 0 ? mVar.uploadProgress : 0, (55295 & Fields.Shape) != 0 ? mVar.uploadError : null, (55295 & Fields.Clip) != 0 ? mVar.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? mVar.localPath : file.getAbsolutePath());
        }
    }
}

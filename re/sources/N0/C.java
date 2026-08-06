package N0;

import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C implements O3.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f696o;
    public final /* synthetic */ String p;

    public /* synthetic */ C(String str, int i5) {
        this.f696o = i5;
        this.p = str;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f696o) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.p);
                SemanticsPropertiesKt.m5720setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5704getImageo7Vup1c());
                return B3.o.f154a;
            case 1:
                Throwable thA = B3.k.a(((B3.k) obj).f150o);
                if (thA != null) {
                    Log.e("PrintOrderViewModel", "Failed to delete cloud draft ".concat(this.p), thA);
                }
                return B3.o.f154a;
            case 2:
                p087u3.m mVar = (p087u3.m) obj;
                StringBuilder sb = new StringBuilder("https://notescrafter.com/api/print/preview-pdf/");
                String str = this.p;
                sb.append(str);
                return mVar.copy((55295 & 1) != 0 ? mVar.id : null, (55295 & 2) != 0 ? mVar.name : null, (55295 & 4) != 0 ? mVar.pages : 0, (55295 & 8) != 0 ? mVar.color : null, (55295 & 16) != 0 ? mVar.duplex : null, (55295 & 32) != 0 ? mVar.size : null, (55295 & 64) != 0 ? mVar.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? mVar.copies : 0, (55295 & Fields.RotationX) != 0 ? mVar.fileName : null, (55295 & Fields.RotationY) != 0 ? mVar.previewUri : sb.toString(), (55295 & Fields.RotationZ) != 0 ? mVar.r2FileKey : str, (55295 & Fields.CameraDistance) != 0 ? mVar.uploadStatus : "success", (55295 & Fields.TransformOrigin) != 0 ? mVar.uploadProgress : 100, (55295 & Fields.Shape) != 0 ? mVar.uploadError : null, (55295 & Fields.Clip) != 0 ? mVar.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? mVar.localPath : null);
            default:
                p087u3.m prev = (p087u3.m) obj;
                kotlin.jvm.internal.o.f(prev, "prev");
                String upperCase = this.p.toUpperCase();
                kotlin.jvm.internal.o.e(upperCase, "toUpperCase(...)");
                return prev.copy((55295 & 1) != 0 ? prev.id : null, (55295 & 2) != 0 ? prev.name : upperCase, (55295 & 4) != 0 ? prev.pages : 0, (55295 & 8) != 0 ? prev.color : null, (55295 & 16) != 0 ? prev.duplex : null, (55295 & 32) != 0 ? prev.size : null, (55295 & 64) != 0 ? prev.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? prev.copies : 0, (55295 & Fields.RotationX) != 0 ? prev.fileName : null, (55295 & Fields.RotationY) != 0 ? prev.previewUri : null, (55295 & Fields.RotationZ) != 0 ? prev.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? prev.uploadStatus : null, (55295 & Fields.TransformOrigin) != 0 ? prev.uploadProgress : 0, (55295 & Fields.Shape) != 0 ? prev.uploadError : null, (55295 & Fields.Clip) != 0 ? prev.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? prev.localPath : null);
        }
    }
}

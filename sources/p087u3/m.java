package p087u3;

import androidx.compose.ui.graphics.Fields;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public static final int $stable = 0;
    private final String binding;
    private final j color;
    private final int copies;
    private final k duplex;
    private final String fileName;
    private final String id;
    private final String localPath;
    private final String name;
    private final int pages;
    private final String previewUri;
    private final Long pricePaise;
    private final String r2FileKey;
    private final String size;
    private final String uploadError;
    private final int uploadProgress;
    private final String uploadStatus;

    public m() {
        this(null, null, 0, null, null, null, null, 0, null, null, null, null, 0, null, null, null, 65535, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.previewUri;
    }

    public final String component11() {
        return this.r2FileKey;
    }

    public final String component12() {
        return this.uploadStatus;
    }

    public final int component13() {
        return this.uploadProgress;
    }

    public final String component14() {
        return this.uploadError;
    }

    public final Long component15() {
        return this.pricePaise;
    }

    public final String component16() {
        return this.localPath;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.pages;
    }

    public final j component4() {
        return this.color;
    }

    public final k component5() {
        return this.duplex;
    }

    public final String component6() {
        return this.size;
    }

    public final String component7() {
        return this.binding;
    }

    public final int component8() {
        return this.copies;
    }

    public final String component9() {
        return this.fileName;
    }

    public final m copy(String id, String name, int i5, j color, k duplex, String size, String binding, int i6, String str, String str2, String str3, String uploadStatus, int i7, String str4, Long l5, String str5) {
        o.f(id, "id");
        o.f(name, "name");
        o.f(color, "color");
        o.f(duplex, "duplex");
        o.f(size, "size");
        o.f(binding, "binding");
        o.f(uploadStatus, "uploadStatus");
        return new m(id, name, i5, color, duplex, size, binding, i6, str, str2, str3, uploadStatus, i7, str4, l5, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return o.b(this.id, mVar.id) && o.b(this.name, mVar.name) && this.pages == mVar.pages && this.color == mVar.color && this.duplex == mVar.duplex && o.b(this.size, mVar.size) && o.b(this.binding, mVar.binding) && this.copies == mVar.copies && o.b(this.fileName, mVar.fileName) && o.b(this.previewUri, mVar.previewUri) && o.b(this.r2FileKey, mVar.r2FileKey) && o.b(this.uploadStatus, mVar.uploadStatus) && this.uploadProgress == mVar.uploadProgress && o.b(this.uploadError, mVar.uploadError) && o.b(this.pricePaise, mVar.pricePaise) && o.b(this.localPath, mVar.localPath);
    }

    public final String getBinding() {
        return this.binding;
    }

    public final j getColor() {
        return this.color;
    }

    public final int getCopies() {
        return this.copies;
    }

    public final k getDuplex() {
        return this.duplex;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPages() {
        return this.pages;
    }

    public final String getPreviewUri() {
        return this.previewUri;
    }

    public final Long getPricePaise() {
        return this.pricePaise;
    }

    public final String getR2FileKey() {
        return this.r2FileKey;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getUploadError() {
        return this.uploadError;
    }

    public final int getUploadProgress() {
        return this.uploadProgress;
    }

    public final String getUploadStatus() {
        return this.uploadStatus;
    }

    public int hashCode() {
        int iC = a.c(this.copies, androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c((this.duplex.hashCode() + ((this.color.hashCode() + a.c(this.pages, androidx.compose.foundation.text.modifiers.a.c(this.id.hashCode() * 31, 31, this.name), 31)) * 31)) * 31, 31, this.size), 31, this.binding), 31);
        String str = this.fileName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previewUri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.r2FileKey;
        int iC2 = a.c(this.uploadProgress, androidx.compose.foundation.text.modifiers.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.uploadStatus), 31);
        String str4 = this.uploadError;
        int iHashCode3 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l5 = this.pricePaise;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str5 = this.localPath;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        int i5 = this.pages;
        j jVar = this.color;
        k kVar = this.duplex;
        String str3 = this.size;
        String str4 = this.binding;
        int i6 = this.copies;
        String str5 = this.fileName;
        String str6 = this.previewUri;
        String str7 = this.r2FileKey;
        String str8 = this.uploadStatus;
        int i7 = this.uploadProgress;
        String str9 = this.uploadError;
        Long l5 = this.pricePaise;
        String str10 = this.localPath;
        StringBuilder sbR = a.r("PrintNotebookItem(id=", str, ", name=", str2, ", pages=");
        sbR.append(i5);
        sbR.append(", color=");
        sbR.append(jVar);
        sbR.append(", duplex=");
        sbR.append(kVar);
        sbR.append(", size=");
        sbR.append(str3);
        sbR.append(", binding=");
        sbR.append(str4);
        sbR.append(", copies=");
        sbR.append(i6);
        sbR.append(", fileName=");
        p061o.a.g(sbR, str5, ", previewUri=", str6, ", r2FileKey=");
        p061o.a.g(sbR, str7, ", uploadStatus=", str8, ", uploadProgress=");
        androidx.compose.foundation.text.modifiers.a.v(sbR, i7, ", uploadError=", str9, ", pricePaise=");
        sbR.append(l5);
        sbR.append(", localPath=");
        sbR.append(str10);
        sbR.append(")");
        return sbR.toString();
    }

    public m(String id, String name, int i5, j color, k duplex, String size, String binding, int i6, String str, String str2, String str3, String uploadStatus, int i7, String str4, Long l5, String str5) {
        o.f(id, "id");
        o.f(name, "name");
        o.f(color, "color");
        o.f(duplex, "duplex");
        o.f(size, "size");
        o.f(binding, "binding");
        o.f(uploadStatus, "uploadStatus");
        this.id = id;
        this.name = name;
        this.pages = i5;
        this.color = color;
        this.duplex = duplex;
        this.size = size;
        this.binding = binding;
        this.copies = i6;
        this.fileName = str;
        this.previewUri = str2;
        this.r2FileKey = str3;
        this.uploadStatus = uploadStatus;
        this.uploadProgress = i7;
        this.uploadError = str4;
        this.pricePaise = l5;
        this.localPath = str5;
    }

    public /* synthetic */ m(String str, String str2, int i5, j jVar, k kVar, String str3, String str4, int i6, String str5, String str6, String str7, String str8, int i7, String str9, Long l5, String str10, int i8, AbstractC2168g abstractC2168g) {
        this((i8 & 1) != 0 ? UUID.randomUUID().toString() : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? 1 : i5, (i8 & 8) != 0 ? j.BW : jVar, (i8 & 16) != 0 ? k.DOUBLE : kVar, (i8 & 32) != 0 ? "A4" : str3, (i8 & 64) != 0 ? "Wiro" : str4, (i8 & Fields.SpotShadowColor) == 0 ? i6 : 1, (i8 & Fields.RotationX) != 0 ? null : str5, (i8 & Fields.RotationY) != 0 ? null : str6, (i8 & Fields.RotationZ) != 0 ? null : str7, (i8 & Fields.CameraDistance) != 0 ? "idle" : str8, (i8 & Fields.TransformOrigin) != 0 ? 0 : i7, (i8 & Fields.Shape) != 0 ? null : str9, (i8 & Fields.Clip) != 0 ? null : l5, (i8 & Fields.CompositingStrategy) != 0 ? null : str10);
    }
}

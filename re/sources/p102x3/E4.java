package p102x3;

import O3.c;
import androidx.compose.ui.graphics.Fields;
import com.notescrafter.utils.AnalyticsManager;
import kotlin.jvm.internal.o;
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class E4 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13909o;
    public final /* synthetic */ c p;
    public final /* synthetic */ b q;

    public /* synthetic */ E4(c cVar, b bVar, int i5) {
        this.f13909o = i5;
        this.p = cVar;
        this.q = bVar;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f13909o) {
            case 0:
                String preset = (String) obj;
                o.f(preset, "preset");
                boolean zEquals = preset.equals("bw");
                b bVar = this.q;
                this.p.invoke(zEquals ? bVar.copy((247 & 1) != 0 ? bVar.invertColors : true, (247 & 2) != 0 ? bVar.clearBackground : true, (247 & 4) != 0 ? bVar.grayscale : true, (247 & 8) != 0 ? bVar.blackAndWhite : true, (247 & 16) != 0 ? bVar.backgroundThreshold : 0, (247 & 32) != 0 ? bVar.removeLogo : false, (247 & 64) != 0 ? bVar.logoBox : null, (247 & Fields.SpotShadowColor) != 0 ? bVar.logoShape : null) : bVar.copy((247 & 1) != 0 ? bVar.invertColors : true, (247 & 2) != 0 ? bVar.clearBackground : true, (247 & 4) != 0 ? bVar.grayscale : false, (247 & 8) != 0 ? bVar.blackAndWhite : false, (247 & 16) != 0 ? bVar.backgroundThreshold : 0, (247 & 32) != 0 ? bVar.removeLogo : false, (247 & 64) != 0 ? bVar.logoBox : null, (247 & Fields.SpotShadowColor) != 0 ? bVar.logoShape : null));
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AnalyticsManager.INSTANCE.logFilterUsed("Invert_Colors", zBooleanValue);
                b bVar2 = this.q;
                this.p.invoke(bVar2.copy((247 & 1) != 0 ? bVar2.invertColors : zBooleanValue, (247 & 2) != 0 ? bVar2.clearBackground : false, (247 & 4) != 0 ? bVar2.grayscale : false, (247 & 8) != 0 ? bVar2.blackAndWhite : false, (247 & 16) != 0 ? bVar2.backgroundThreshold : 0, (247 & 32) != 0 ? bVar2.removeLogo : false, (247 & 64) != 0 ? bVar2.logoBox : null, (247 & Fields.SpotShadowColor) != 0 ? bVar2.logoShape : null));
                break;
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                AnalyticsManager.INSTANCE.logFilterUsed("Clear_Background", zBooleanValue2);
                b bVar3 = this.q;
                this.p.invoke(bVar3.copy((247 & 1) != 0 ? bVar3.invertColors : false, (247 & 2) != 0 ? bVar3.clearBackground : zBooleanValue2, (247 & 4) != 0 ? bVar3.grayscale : false, (247 & 8) != 0 ? bVar3.blackAndWhite : false, (247 & 16) != 0 ? bVar3.backgroundThreshold : 0, (247 & 32) != 0 ? bVar3.removeLogo : false, (247 & 64) != 0 ? bVar3.logoBox : null, (247 & Fields.SpotShadowColor) != 0 ? bVar3.logoShape : null));
                break;
            case 3:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                AnalyticsManager.INSTANCE.logFilterUsed("Grayscale", zBooleanValue3);
                b bVar4 = this.q;
                this.p.invoke(bVar4.copy((247 & 1) != 0 ? bVar4.invertColors : false, (247 & 2) != 0 ? bVar4.clearBackground : false, (247 & 4) != 0 ? bVar4.grayscale : zBooleanValue3, (247 & 8) != 0 ? bVar4.blackAndWhite : false, (247 & 16) != 0 ? bVar4.backgroundThreshold : 0, (247 & 32) != 0 ? bVar4.removeLogo : false, (247 & 64) != 0 ? bVar4.logoBox : null, (247 & Fields.SpotShadowColor) != 0 ? bVar4.logoShape : null));
                break;
            default:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                AnalyticsManager.INSTANCE.logFilterUsed("Black_White", zBooleanValue4);
                b bVar5 = this.q;
                this.p.invoke(bVar5.copy((247 & 1) != 0 ? bVar5.invertColors : false, (247 & 2) != 0 ? bVar5.clearBackground : false, (247 & 4) != 0 ? bVar5.grayscale : false, (247 & 8) != 0 ? bVar5.blackAndWhite : zBooleanValue4, (247 & 16) != 0 ? bVar5.backgroundThreshold : 0, (247 & 32) != 0 ? bVar5.removeLogo : false, (247 & 64) != 0 ? bVar5.logoBox : null, (247 & Fields.SpotShadowColor) != 0 ? bVar5.logoShape : null));
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ E4(b bVar, c cVar) {
        this.f13909o = 0;
        this.q = bVar;
        this.p = cVar;
    }
}

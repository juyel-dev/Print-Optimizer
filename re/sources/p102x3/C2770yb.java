package p102x3;

import O3.c;
import Q3.a;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.internal.o;
import p087u3.m;

/* JADX INFO: renamed from: x3.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2770yb implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15785o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ int q;

    public /* synthetic */ C2770yb(int i5, String str) {
        this.f15785o = 2;
        this.q = i5;
        this.p = str;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f15785o) {
            case 0:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                o.f(graphicsLayer, "$this$graphicsLayer");
                PagerState pagerState = (PagerState) this.p;
                float fAbs = Math.abs(pagerState.getCurrentPageOffsetFraction() + (pagerState.getCurrentPage() - this.q));
                float fQ = ((1.0f - a.q(fAbs, 0.0f, 1.0f)) * 0.14999998f) + 0.85f;
                graphicsLayer.setScaleX(fQ);
                graphicsLayer.setScaleY(fQ);
                graphicsLayer.setAlpha(((1.0f - a.q(fAbs, 0.0f, 1.0f)) * 0.5f) + 0.5f);
                return B3.o.f154a;
            case 1:
                GraphicsLayerScope graphicsLayer2 = (GraphicsLayerScope) obj;
                o.f(graphicsLayer2, "$this$graphicsLayer");
                PagerState pagerState2 = (PagerState) this.p;
                float fAbs2 = Math.abs(pagerState2.getCurrentPageOffsetFraction() + (pagerState2.getCurrentPage() - this.q));
                float fQ2 = ((1.0f - a.q(fAbs2, 0.0f, 1.0f)) * 0.14999998f) + 0.85f;
                graphicsLayer2.setScaleX(fQ2);
                graphicsLayer2.setScaleY(fQ2);
                graphicsLayer2.setAlpha(((1.0f - a.q(fAbs2, 0.0f, 1.0f)) * 0.5f) + 0.5f);
                return B3.o.f154a;
            default:
                m mVar = (m) obj;
                return mVar.copy((55295 & 1) != 0 ? mVar.id : null, (55295 & 2) != 0 ? mVar.name : null, (55295 & 4) != 0 ? mVar.pages : this.q, (55295 & 8) != 0 ? mVar.color : null, (55295 & 16) != 0 ? mVar.duplex : null, (55295 & 32) != 0 ? mVar.size : null, (55295 & 64) != 0 ? mVar.binding : null, (55295 & Fields.SpotShadowColor) != 0 ? mVar.copies : 0, (55295 & Fields.RotationX) != 0 ? mVar.fileName : (String) this.p, (55295 & Fields.RotationY) != 0 ? mVar.previewUri : null, (55295 & Fields.RotationZ) != 0 ? mVar.r2FileKey : null, (55295 & Fields.CameraDistance) != 0 ? mVar.uploadStatus : null, (55295 & Fields.TransformOrigin) != 0 ? mVar.uploadProgress : 0, (55295 & Fields.Shape) != 0 ? mVar.uploadError : null, (55295 & Fields.Clip) != 0 ? mVar.pricePaise : null, (55295 & Fields.CompositingStrategy) != 0 ? mVar.localPath : null);
        }
    }

    public /* synthetic */ C2770yb(PagerState pagerState, int i5, int i6) {
        this.f15785o = i6;
        this.p = pagerState;
        this.q = i5;
    }
}

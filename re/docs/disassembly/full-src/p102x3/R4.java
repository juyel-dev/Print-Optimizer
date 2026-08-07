package p102x3;

import O3.c;
import O3.e;
import android.content.Context;
import android.graphics.RectF;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Fields;
import kotlin.jvm.internal.o;
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class R4 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14350o = 0;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14351r;

    public /* synthetic */ R4(c cVar, MutableState mutableState, b bVar) {
        this.q = cVar;
        this.f14351r = bVar;
        this.p = mutableState;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14350o) {
            case 0:
                RectF box = (RectF) obj;
                String shape = (String) obj2;
                o.f(box, "box");
                o.f(shape, "shape");
                b bVar = (b) this.f14351r;
                ((c) this.q).invoke(bVar.copy((247 & 1) != 0 ? bVar.invertColors : false, (247 & 2) != 0 ? bVar.clearBackground : false, (247 & 4) != 0 ? bVar.grayscale : false, (247 & 8) != 0 ? bVar.blackAndWhite : false, (247 & 16) != 0 ? bVar.backgroundThreshold : 0, (247 & 32) != 0 ? bVar.removeLogo : true, (247 & 64) != 0 ? bVar.logoBox : box, (247 & Fields.SpotShadowColor) != 0 ? bVar.logoShape : shape));
                this.p.setValue(Boolean.FALSE);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                this.p.setValue(Boolean.FALSE);
                if (zBooleanValue) {
                    Gd.v((MutableState) this.f14351r, false);
                } else {
                    if (str == null) {
                        str = "Failed to save address. Please check your network or try again.";
                    }
                    Toast.makeText((Context) this.q, str, 1).show();
                }
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ R4(Context context, MutableState mutableState, MutableState mutableState2) {
        this.q = context;
        this.p = mutableState;
        this.f14351r = mutableState2;
    }
}

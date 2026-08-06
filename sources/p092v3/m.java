package p092v3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import c4.n;
import com.notescrafter.service.NotesCrafterFCMService;
import java.io.IOException;
import java.net.URL;
import p047l.C2174e;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13544o;
    public final /* synthetic */ String p;
    public final /* synthetic */ NotesCrafterFCMService q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f13546s;
    public final /* synthetic */ C2174e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, NotesCrafterFCMService notesCrafterFCMService, String str2, String str3, C2174e c2174e, d dVar) {
        super(2, dVar);
        this.p = str;
        this.q = notesCrafterFCMService;
        this.f13545r = str2;
        this.f13546s = str3;
        this.t = c2174e;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new m(this.p, this.q, this.f13545r, this.f13546s, this.t, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f13544o;
        if (i5 == 0) {
            o4.d.y(obj);
            Bitmap bitmapDecodeStream = null;
            String str = this.p;
            if (str != null) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str).openStream());
                } catch (IOException e) {
                    Log.w("NotesCrafterFCM", "Failed to download notification image: ".concat(str), e);
                }
            }
            Bitmap bitmap = bitmapDecodeStream;
            e4.e eVar = H.f1766a;
            Y3.e eVar2 = n.f2606a;
            l lVar = new l(this.q, this.f13545r, this.f13546s, this.t, bitmap, null);
            this.f13544o = 1;
            if (A.C(eVar2, lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        return o.f154a;
    }
}

package p102x3;

import B3.o;
import C3.C;
import C3.u;
import C3.w;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class O3 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f14249o;
    public final /* synthetic */ MutableState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(Context context, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f14249o = context;
        this.p = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new O3(this.f14249o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        O3 o5 = (O3) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        o5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        List listD0;
        a aVar = a.f448o;
        o4.d.y(obj);
        File file = new File(this.f14249o.getExternalFilesDir(null), "NotesCrafterFiles");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                ArrayList<File> arrayList = new ArrayList();
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        String lowerCase = M3.a.y(file2).toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.o.e(lowerCase, "toLowerCase(...)");
                        if (lowerCase.equals("pdf")) {
                            arrayList.add(file2);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.Y(arrayList));
                for (File file3 : arrayList) {
                    kotlin.jvm.internal.o.c(file3);
                    String name = file3.getName();
                    kotlin.jvm.internal.o.e(name, "getName(...)");
                    arrayList2.add(new H3(file3, name, file3.length(), file3.lastModified()));
                }
                listD0 = u.D0(arrayList2, new N3(0));
            } else {
                listD0 = C.f167o;
            }
            this.p.setValue(listD0);
        }
        return o.f154a;
    }
}

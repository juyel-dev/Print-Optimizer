package p053m0;

import C.c;
import F3.d;
import G3.a;
import X3.C0185i;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import androidx.compose.foundation.text.input.internal.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import o4.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopicsManager f11881a;

    public f(TopicsManager mTopicsManager) {
        o.f(mTopicsManager, "mTopicsManager");
        this.f11881a = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(f fVar, a aVar, d dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i5 = eVar.f11880r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.f11880r = i5 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar, dVar);
            }
        } else {
            eVar = new e(fVar, dVar);
        }
        Object objT = eVar.p;
        a aVar2 = a.f448o;
        int i6 = eVar.f11880r;
        if (i6 == 0) {
            o4.d.y(objT);
            GetTopicsRequest getTopicsRequestA = fVar.a(aVar);
            eVar.f11879o = fVar;
            eVar.f11880r = 1;
            C0185i c0185i = new C0185i(1, l.n(eVar));
            c0185i.u();
            fVar.f11881a.getTopics(getTopicsRequestA, new I.d(0), new c(c0185i));
            objT = c0185i.t();
            if (objT == aVar2) {
                return aVar2;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = eVar.f11879o;
            o4.d.y(objT);
        }
        GetTopicsResponse response = e.i(objT);
        fVar.getClass();
        o.f(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicJ = e.j(it.next());
            arrayList.add(new c(topicJ.getTaxonomyVersion(), topicJ.getModelVersion(), topicJ.getTopicId()));
        }
        return new b(arrayList);
    }

    public GetTopicsRequest a(a request) {
        o.f(request, "request");
        GetTopicsRequest getTopicsRequestBuild = e.e().setAdsSdkName("com.google.android.gms.ads").build();
        o.e(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public Object b(a aVar, d dVar) {
        return c(this, aVar, dVar);
    }
}

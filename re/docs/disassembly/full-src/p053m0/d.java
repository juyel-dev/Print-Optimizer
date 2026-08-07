package p053m0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import androidx.compose.foundation.text.input.internal.e;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11878b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i5) {
        super(topicsManager);
        this.f11878b = i5;
    }

    @Override // p053m0.f
    public GetTopicsRequest a(a request) {
        switch (this.f11878b) {
            case 1:
                o.f(request, "request");
                GetTopicsRequest getTopicsRequestBuild = e.e().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(request.f11873a).build();
                o.e(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild;
            default:
                return super.a(request);
        }
    }
}

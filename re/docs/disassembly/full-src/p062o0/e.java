package p062o0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f12065a;

    public e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f12065a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        HashMap map = this.f12065a.p;
        Integer num = (Integer) obj;
        num.intValue();
        map.remove(num);
    }
}

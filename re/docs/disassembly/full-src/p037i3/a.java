package p037i3;

import W2.c;

/* JADX INFO: loaded from: classes2.dex */
public enum a implements c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11541o;

    a(int i5) {
        this.f11541o = i5;
    }

    @Override // W2.c
    public final int a() {
        return this.f11541o;
    }
}

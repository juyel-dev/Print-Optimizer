package p102x3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.notescrafter.service.PDFProcessor;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class A9 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f13757A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f13758B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f13759C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f13760D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f13761E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f13762F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ MutableState f13763G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ MutableState f13764H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ MutableState f13765I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ MutableState f13766J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ MutableState f13767K;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Serializable f13768o;
    public List p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13770s;
    public int t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f13772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Uri f13773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f13774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f13775z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A9(PDFProcessor pDFProcessor, Uri uri, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, d dVar) {
        super(2, dVar);
        this.f13772w = pDFProcessor;
        this.f13773x = uri;
        this.f13774y = context;
        this.f13775z = mutableState;
        this.f13757A = mutableState2;
        this.f13758B = mutableState3;
        this.f13759C = mutableState4;
        this.f13760D = mutableState5;
        this.f13761E = mutableState6;
        this.f13762F = mutableState7;
        this.f13763G = mutableState8;
        this.f13764H = mutableState9;
        this.f13765I = mutableState10;
        this.f13766J = mutableState11;
        this.f13767K = mutableState12;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new A9(this.f13772w, this.f13773x, this.f13774y, this.f13775z, this.f13757A, this.f13758B, this.f13759C, this.f13760D, this.f13761E, this.f13762F, this.f13763G, this.f13764H, this.f13765I, this.f13766J, this.f13767K, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A9) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x01c8 A[Catch: all -> 0x025d, Exception -> 0x0261, TryCatch #17 {Exception -> 0x0261, all -> 0x025d, blocks: (B:48:0x0164, B:49:0x01c4, B:51:0x01c8, B:53:0x01d0, B:33:0x0104, B:42:0x0121), top: B:200:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d0 A[Catch: all -> 0x025d, Exception -> 0x0261, TRY_LEAVE, TryCatch #17 {Exception -> 0x0261, all -> 0x025d, blocks: (B:48:0x0164, B:49:0x01c4, B:51:0x01c8, B:53:0x01d0, B:33:0x0104, B:42:0x0121), top: B:200:0x0104 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x031d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x031e  */
    /* JADX WARN: Code duplicated, block: B:72:0x032c A[Catch: all -> 0x0251, Exception -> 0x0256, TryCatch #3 {Exception -> 0x0256, blocks: (B:70:0x0326, B:72:0x032c, B:74:0x0332, B:77:0x0357, B:55:0x021c, B:64:0x0267, B:65:0x0270, B:66:0x0271, B:89:0x04a1, B:91:0x04a7, B:93:0x04ad, B:96:0x04d6, B:85:0x03c6, B:81:0x0389, B:82:0x0392, B:83:0x0393, B:97:0x04e3, B:98:0x04fe, B:99:0x0504), top: B:188:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0353  */
    /* JADX WARN: Code duplicated, block: B:77:0x0357 A[Catch: all -> 0x0251, Exception -> 0x0256, TryCatch #3 {Exception -> 0x0256, blocks: (B:70:0x0326, B:72:0x032c, B:74:0x0332, B:77:0x0357, B:55:0x021c, B:64:0x0267, B:65:0x0270, B:66:0x0271, B:89:0x04a1, B:91:0x04a7, B:93:0x04ad, B:96:0x04d6, B:85:0x03c6, B:81:0x0389, B:82:0x0392, B:83:0x0393, B:97:0x04e3, B:98:0x04fe, B:99:0x0504), top: B:188:0x0025 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x031e -> B:70:0x0326). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x049f -> B:89:0x04a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r79) {
        /*
            Method dump skipped, instruction units count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.A9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

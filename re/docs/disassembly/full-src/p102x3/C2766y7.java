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
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: x3.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2766y7 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f15753A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f15754B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f15755C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f15756D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f15757E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f15758F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ Uri f15759G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ MutableState f15760H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ MutableState f15761I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ MutableState f15762J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ MutableState f15763K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ MutableState f15764L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ MutableState f15765M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final /* synthetic */ MutableState f15766N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final /* synthetic */ MutableState f15767O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final /* synthetic */ MutableState f15768P;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f15769o;
    public List p;
    public List q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public File f15770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f15771s;
    public long t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15772v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15773w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15774x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f15775y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f15776z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2766y7(PDFProcessor pDFProcessor, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Uri uri, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, d dVar) {
        super(2, dVar);
        this.f15775y = pDFProcessor;
        this.f15776z = context;
        this.f15753A = mutableState;
        this.f15754B = mutableState2;
        this.f15755C = mutableState3;
        this.f15756D = mutableState4;
        this.f15757E = mutableState5;
        this.f15758F = mutableState6;
        this.f15759G = uri;
        this.f15760H = mutableState7;
        this.f15761I = mutableState8;
        this.f15762J = mutableState9;
        this.f15763K = mutableState10;
        this.f15764L = mutableState11;
        this.f15765M = mutableState12;
        this.f15766N = mutableState13;
        this.f15767O = mutableState14;
        this.f15768P = mutableState15;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2766y7(this.f15775y, this.f15776z, this.f15753A, this.f15754B, this.f15755C, this.f15756D, this.f15757E, this.f15758F, this.f15759G, this.f15760H, this.f15761I, this.f15762J, this.f15763K, this.f15764L, this.f15765M, this.f15766N, this.f15767O, this.f15768P, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2766y7) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x026d A[Catch: all -> 0x00fb, Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:81:0x0310, B:83:0x0316, B:85:0x031c, B:95:0x034e, B:97:0x035e, B:98:0x0378, B:92:0x0336, B:77:0x026d, B:75:0x0236), top: B:118:0x0236 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x030d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x030e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0316 A[Catch: all -> 0x00fb, Exception -> 0x032f, TryCatch #1 {Exception -> 0x032f, blocks: (B:81:0x0310, B:83:0x0316, B:85:0x031c, B:95:0x034e, B:97:0x035e, B:98:0x0378, B:92:0x0336, B:77:0x026d, B:75:0x0236), top: B:118:0x0236 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0325  */
    /* JADX WARN: Code duplicated, block: B:88:0x032a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x030e -> B:81:0x0310). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.C2766y7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package p102x3;

import O3.a;
import W3.j;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import p087u3.q;

/* JADX INFO: renamed from: x3.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2453ed implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14976o = 2;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14978s;

    public /* synthetic */ C2453ed(SharedPreferences sharedPreferences, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.q = sharedPreferences;
        this.p = mutableState;
        this.f14977r = mutableState2;
        this.f14978s = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14976o) {
            case 0:
                this.p.setValue("add");
                Gd.v(this.f14977r, true);
                this.f14978s.setValue((q) ((State) this.q).getValue());
                break;
            case 1:
                this.p.setValue("add");
                this.f14977r.setValue(new q(null, null, null, null, null, null, null, null, null, null, null, ((q) ((State) this.q).getValue()).getPhone(), false, null, 14335, null));
                Gd.v(this.f14978s, true);
                break;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) this.q;
                String string = sharedPreferences.getString("user_phone", "");
                if (string == null) {
                    string = "";
                }
                MutableState mutableState = this.p;
                mutableState.setValue(string);
                this.f14977r.setValue(Boolean.valueOf(sharedPreferences.getBoolean("user_phone_verified", false)));
                String input = (String) mutableState.getValue();
                Pattern patternCompile = Pattern.compile("\\D");
                o.e(patternCompile, "compile(...)");
                o.f(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                o.e(strReplaceAll, "replaceAll(...)");
                this.f14978s.setValue(j.G0(strReplaceAll));
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ C2453ed(MutableState mutableState, MutableState mutableState2, State state, MutableState mutableState3) {
        this.p = mutableState;
        this.f14977r = mutableState2;
        this.q = state;
        this.f14978s = mutableState3;
    }

    public /* synthetic */ C2453ed(MutableState mutableState, State state, MutableState mutableState2, MutableState mutableState3) {
        this.p = mutableState;
        this.q = state;
        this.f14977r = mutableState2;
        this.f14978s = mutableState3;
    }
}

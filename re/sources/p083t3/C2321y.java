package p083t3;

import B3.o;
import O3.c;
import W3.j;
import android.graphics.RectF;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.unit.IntSize;
import com.razorpay.AppSignatureHelper;
import java.util.List;
import java.util.regex.Pattern;
import p102x3.AbstractC2642qa;

/* JADX INFO: renamed from: t3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2321y implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13226o;
    public final /* synthetic */ MutableState p;

    public /* synthetic */ C2321y(int i5, MutableState mutableState) {
        this.f13226o = i5;
        this.p = mutableState;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        int i5 = 0;
        o oVar = o.f154a;
        MutableState mutableState = this.p;
        switch (this.f13226o) {
            case 0:
                String route = (String) obj;
                kotlin.jvm.internal.o.f(route, "route");
                mutableState.setValue(route);
                break;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                mutableState.setValue(num);
                break;
            case 2:
                String route2 = (String) obj;
                kotlin.jvm.internal.o.f(route2, "route");
                mutableState.setValue(route2);
                break;
            case 3:
                String it = (String) obj;
                kotlin.jvm.internal.o.f(it, "it");
                mutableState.setValue(it);
                break;
            case 4:
                String it2 = (String) obj;
                kotlin.jvm.internal.o.f(it2, "it");
                mutableState.setValue(it2);
                break;
            case 5:
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                kotlin.jvm.internal.o.f(coordinates, "coordinates");
                mutableState.setValue(IntSize.m6565boximpl(coordinates.mo5265getSizeYbymL2g()));
                break;
            case 6:
                RectF newSel = (RectF) obj;
                kotlin.jvm.internal.o.f(newSel, "newSel");
                mutableState.setValue(newSel);
                break;
            case 7:
                String it3 = (String) obj;
                kotlin.jvm.internal.o.f(it3, "it");
                StringBuilder sb = new StringBuilder();
                int length = it3.length();
                while (i5 < length) {
                    char cCharAt = it3.charAt(i5);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i5++;
                }
                String string = sb.toString();
                kotlin.jvm.internal.o.e(string, "toString(...)");
                mutableState.setValue(string);
                break;
            case 8:
                String it4 = (String) obj;
                kotlin.jvm.internal.o.f(it4, "it");
                StringBuilder sb2 = new StringBuilder();
                int length2 = it4.length();
                while (i5 < length2) {
                    char cCharAt2 = it4.charAt(i5);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                    i5++;
                }
                String string2 = sb2.toString();
                kotlin.jvm.internal.o.e(string2, "toString(...)");
                mutableState.setValue(string2);
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                String it5 = (String) obj;
                kotlin.jvm.internal.o.f(it5, "it");
                StringBuilder sb3 = new StringBuilder();
                int length3 = it5.length();
                while (i5 < length3) {
                    char cCharAt3 = it5.charAt(i5);
                    if (Character.isDigit(cCharAt3)) {
                        sb3.append(cCharAt3);
                    }
                    i5++;
                }
                String string3 = sb3.toString();
                kotlin.jvm.internal.o.e(string3, "toString(...)");
                mutableState.setValue(string3);
                break;
            case 10:
                String it6 = (String) obj;
                kotlin.jvm.internal.o.f(it6, "it");
                mutableState.setValue(it6);
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                String it7 = (String) obj;
                kotlin.jvm.internal.o.f(it7, "it");
                mutableState.setValue(it7);
                break;
            case Matrix.TranslateX /* 12 */:
                String it8 = (String) obj;
                kotlin.jvm.internal.o.f(it8, "it");
                StringBuilder sb4 = new StringBuilder();
                int length4 = it8.length();
                while (i5 < length4) {
                    char cCharAt4 = it8.charAt(i5);
                    if (Character.isDigit(cCharAt4)) {
                        sb4.append(cCharAt4);
                    }
                    i5++;
                }
                String string4 = sb4.toString();
                kotlin.jvm.internal.o.e(string4, "toString(...)");
                mutableState.setValue(string4);
                break;
            case Matrix.TranslateY /* 13 */:
                Integer num2 = (Integer) obj;
                num2.intValue();
                List list = AbstractC2642qa.f15449c;
                mutableState.setValue(num2);
                break;
            case Matrix.TranslateZ /* 14 */:
                Integer num3 = (Integer) obj;
                num3.intValue();
                List list2 = AbstractC2642qa.f15449c;
                mutableState.setValue(num3);
                break;
            case 15:
                Integer num4 = (Integer) obj;
                num4.intValue();
                List list3 = AbstractC2642qa.f15449c;
                mutableState.setValue(num4);
                break;
            case 16:
                Integer num5 = (Integer) obj;
                num5.intValue();
                List list4 = AbstractC2642qa.f15449c;
                mutableState.setValue(num5);
                break;
            case 17:
                String it9 = (String) obj;
                kotlin.jvm.internal.o.f(it9, "it");
                List list5 = AbstractC2642qa.f15449c;
                mutableState.setValue(it9);
                break;
            case 18:
                String it10 = (String) obj;
                kotlin.jvm.internal.o.f(it10, "it");
                mutableState.setValue(it10);
                break;
            case 19:
                String it11 = (String) obj;
                kotlin.jvm.internal.o.f(it11, "it");
                mutableState.setValue(it11);
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                String it12 = (String) obj;
                kotlin.jvm.internal.o.f(it12, "it");
                mutableState.setValue(it12);
                break;
            case 21:
                String it13 = (String) obj;
                kotlin.jvm.internal.o.f(it13, "it");
                mutableState.setValue(it13);
                break;
            case 22:
                kotlin.jvm.internal.o.f((String) obj, "it");
                mutableState.setValue(Boolean.FALSE);
                break;
            case 23:
                String it14 = (String) obj;
                kotlin.jvm.internal.o.f(it14, "it");
                mutableState.setValue(it14);
                break;
            case 24:
                String it15 = (String) obj;
                kotlin.jvm.internal.o.f(it15, "it");
                mutableState.setValue(it15);
                break;
            case 25:
                String it16 = (String) obj;
                kotlin.jvm.internal.o.f(it16, "it");
                mutableState.setValue(it16);
                break;
            case 26:
                String it17 = (String) obj;
                kotlin.jvm.internal.o.f(it17, "it");
                mutableState.setValue(it17);
                break;
            case 27:
                String it18 = (String) obj;
                kotlin.jvm.internal.o.f(it18, "it");
                mutableState.setValue(it18);
                break;
            case 28:
                String it19 = (String) obj;
                kotlin.jvm.internal.o.f(it19, "it");
                Pattern patternCompile = Pattern.compile("\\D");
                kotlin.jvm.internal.o.e(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(it19).replaceAll("");
                kotlin.jvm.internal.o.e(strReplaceAll, "replaceAll(...)");
                mutableState.setValue(j.F0(6, strReplaceAll));
                break;
            default:
                String it20 = (String) obj;
                kotlin.jvm.internal.o.f(it20, "it");
                mutableState.setValue(it20);
                break;
        }
        return oVar;
    }
}

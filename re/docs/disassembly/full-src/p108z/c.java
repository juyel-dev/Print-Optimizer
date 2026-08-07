package p108z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.notescrafter.app.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p093w.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f16008a = new ThreadLocal();

    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i5;
        int[] iArr;
        boolean z3;
        int iB;
        float f5;
        float f6;
        TypedValue typedValue;
        int next;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = a.f13589a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i6, i6);
                int resourceId = ObtainAttributes.getResourceId(i6, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f16008a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i8 = typedValue.type;
                    if (i8 < 28 || i8 > 31) {
                        try {
                            XmlResourceParser xml = resources.getXml(resourceId);
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                            do {
                                next = xml.next();
                                if (next == 2) {
                                    break;
                                }
                            } while (next != 1);
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found");
                            }
                            color = a(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i6, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i6, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i6, -65281);
                }
                float f7 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f8 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i9 = i6;
                for (int i10 = i9; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i11 = i9 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i9] = attributeNameResource;
                        i9 = i11;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i9);
                float f9 = 0.0f;
                float f10 = 100.0f;
                boolean z4 = f8 >= 0.0f && f8 <= 100.0f;
                if (f7 != 1.0f || z4) {
                    int iAlpha = (int) ((Color.alpha(color) * f7) + 0.5f);
                    if (iAlpha < 0) {
                        i5 = 0;
                    } else {
                        i5 = 255;
                        if (iAlpha <= 255) {
                            i5 = iAlpha;
                        }
                    }
                    if (z4) {
                        a aVarA = a.a(color);
                        l lVar = l.f16022k;
                        float f11 = aVarA.f16000b;
                        if (f11 >= 1.0d && Math.round(f8) > 0.0d && Math.round(f8) < 100.0d) {
                            float f12 = aVarA.f15999a;
                            float fMin = f12 < 0.0f ? 0.0f : Math.min(360.0f, f12);
                            float f13 = 0.0f;
                            float f14 = f11;
                            a aVar = null;
                            boolean z5 = true;
                            while (true) {
                                if (Math.abs(f13 - f11) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    depth2 = depth2;
                                    z3 = true;
                                    if (aVar != null) {
                                        iB = aVar.c(lVar);
                                        break;
                                    }
                                    iB = b.b(f8);
                                    break;
                                }
                                float f15 = 1000.0f;
                                float f16 = f9;
                                float f17 = f10;
                                float f18 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f16 - f17) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        f10 = f10;
                                        z3 = true;
                                        float f19 = f9;
                                        iArr = iArrTrimStateSet;
                                        f5 = f19;
                                        break;
                                    }
                                    float f20 = ((f17 - f16) / 2.0f) + f16;
                                    int iC = a.b(f20, f14, fMin).c(l.f16022k);
                                    float fC = b.c(Color.red(iC));
                                    float fC2 = b.c(Color.green(iC));
                                    float fC3 = b.c(Color.blue(iC));
                                    z3 = true;
                                    float[] fArr = b.f16007d[1];
                                    f10 = 100.0f;
                                    float f21 = ((fC3 * fArr[2]) + ((fC2 * fArr[1]) + (fC * fArr[0]))) / 100.0f;
                                    float fCbrt = f21 <= 0.008856452f ? f21 * 903.2963f : (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f8 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        a aVarB = a.b(aVarA2.f16001c, aVarA2.f16000b, fMin);
                                        f6 = f20;
                                        float f22 = aVarA2.f16002d - aVarB.f16002d;
                                        fMin = fMin;
                                        float f23 = aVarA2.e - aVarB.e;
                                        float f24 = aVarA2.f16003f - aVarB.f16003f;
                                        double dSqrt = Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f18 = fPow;
                                            aVar2 = aVarA2;
                                            f15 = fAbs;
                                        }
                                    } else {
                                        f6 = f20;
                                        fMin = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f5 = 0.0f;
                                    if (f15 == 0.0f && f18 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f8) {
                                        f16 = f6;
                                    } else {
                                        f17 = f6;
                                    }
                                    f10 = 100.0f;
                                    depth2 = depth2;
                                    fMin = fMin;
                                    int[] iArr5 = iArr;
                                    f9 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                a aVar3 = aVar2;
                                if (!z5) {
                                    if (aVar3 == null) {
                                        f11 = f14;
                                    } else {
                                        aVar = aVar3;
                                        f13 = f14;
                                    }
                                    f14 = ((f11 - f13) / 2.0f) + f13;
                                } else {
                                    if (aVar3 != null) {
                                        iB = aVar3.c(lVar);
                                        break;
                                    }
                                    f14 = ((f11 - f13) / 2.0f) + f13;
                                    z5 = false;
                                }
                                int[] iArr6 = iArr;
                                f9 = f5;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            depth2 = depth2;
                            z3 = true;
                            iB = b.b(f8);
                        }
                        color = iB;
                    } else {
                        iArr = iArrTrimStateSet;
                        depth2 = depth2;
                        z3 = true;
                    }
                    color = (16777215 & color) | (i5 << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    depth2 = depth2;
                    z3 = true;
                }
                int i12 = i7 + 1;
                if (i12 > iArr2.length) {
                    int[] iArr7 = new int[i7 <= 4 ? 8 : i7 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i7);
                    iArr2 = iArr7;
                }
                iArr2[i7] = color;
                if (i12 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7 > 4 ? i7 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i7);
                    objArr = objArr2;
                }
                objArr[i7] = iArr;
                objArr = (int[][]) objArr;
                i7 = i12;
                r4 = z3;
                depth2 = depth2;
                i6 = 0;
            } else {
                int i13 = depth2;
                r4 = r4 == true ? 1 : 0;
                depth2 = i13;
                i6 = 0;
            }
        }
        int[] iArr8 = new int[i7];
        int[][] iArr9 = new int[i7][];
        System.arraycopy(iArr2, 0, iArr8, 0, i7);
        System.arraycopy(objArr, 0, iArr9, 0, i7);
        return new ColorStateList(iArr9, iArr8);
    }
}

package p108z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import f1.g;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p093w.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f16009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16010b;

    public d(Shader shader, ColorStateList colorStateList, int i5) {
        this.f16009a = shader;
        this.f16010b = i5;
    }

    public static d a(Resources resources, int i5, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f5;
        float f6;
        float f7;
        int i6;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i5);
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
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListA = c.a(resources, xml, attributeSetAsAttributeSet, theme);
                return new d(null, colorStateListA, colorStateListA.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayD = b.d(resources, theme, attributeSetAsAttributeSet, a.f13592d);
        float f8 = !b.a(xml, "startX") ? 0.0f : typedArrayD.getFloat(8, 0.0f);
        float f9 = !b.a(xml, "startY") ? 0.0f : typedArrayD.getFloat(9, 0.0f);
        float f10 = !b.a(xml, "endX") ? 0.0f : typedArrayD.getFloat(10, 0.0f);
        float f11 = !b.a(xml, "endY") ? 0.0f : typedArrayD.getFloat(11, 0.0f);
        float f12 = !b.a(xml, "centerX") ? 0.0f : typedArrayD.getFloat(3, 0.0f);
        float f13 = !b.a(xml, "centerY") ? 0.0f : typedArrayD.getFloat(4, 0.0f);
        int i7 = !b.a(xml, "type") ? 0 : typedArrayD.getInt(2, 0);
        int color = !b.a(xml, "startColor") ? 0 : typedArrayD.getColor(0, 0);
        boolean zA = b.a(xml, "centerColor");
        int color2 = !b.a(xml, "centerColor") ? 0 : typedArrayD.getColor(7, 0);
        int color3 = !b.a(xml, "endColor") ? 0 : typedArrayD.getColor(1, 0);
        int i8 = !b.a(xml, "tileMode") ? 0 : typedArrayD.getInt(6, 0);
        float f14 = !b.a(xml, "gradientRadius") ? 0.0f : typedArrayD.getFloat(5, 0.0f);
        typedArrayD.recycle();
        int depth = xml.getDepth() + 1;
        float f15 = f14;
        ArrayList arrayList = new ArrayList(20);
        float f16 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f10;
            if (next2 == 1) {
                f6 = f9;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f9;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayD2 = b.d(resources, theme, attributeSetAsAttributeSet, a.e);
                boolean zHasValue = typedArrayD2.hasValue(0);
                boolean zHasValue2 = typedArrayD2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayD2.getColor(0, 0);
                float f17 = typedArrayD2.getFloat(1, 0.0f);
                typedArrayD2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f17));
            }
            f10 = f5;
            f9 = f6;
        }
        g gVar = arrayList2.size() > 0 ? new g(arrayList2, arrayList) : null;
        if (gVar == null) {
            gVar = zA ? new g(color, color2, color3) : new g(color, color3);
        }
        if (i7 == 1) {
            float f18 = f12;
            i6 = 0;
            if (f15 <= 0.0f) {
                f7 = f13;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i8 == 1) {
                f7 = f13;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i8 != 2) {
                f7 = f13;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f7 = f13;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f18, f7, f15, (int[]) gVar.p, (float[]) gVar.q, tileMode);
        } else if (i7 != 2) {
            if (i8 != 1) {
                tileMode2 = i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            Shader.TileMode tileMode3 = tileMode2;
            i6 = 0;
            radialGradient = new LinearGradient(f8, f6, f5, f16, (int[]) gVar.p, (float[]) gVar.q, tileMode3);
        } else {
            i6 = 0;
            radialGradient = new SweepGradient(f12, f13, (int[]) gVar.p, (float[]) gVar.q);
        }
        return new d(radialGradient, null, i6);
    }
}

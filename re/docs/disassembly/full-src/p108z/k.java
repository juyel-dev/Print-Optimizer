package p108z;

import A.f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p047l.C2191w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16021a = 0;

    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    public static Typeface a(Context context, int i5) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i5, new TypedValue(), null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    public static Typeface b(Context context, int i5, TypedValue typedValue, AndroidFontLoader_androidKt$loadAsync$2$1 androidFontLoader_androidKt$loadAsync$2$1) {
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i5) + "\" (" + Integer.toHexString(i5) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i6 = typedValue.assetCookie;
            C2191w c2191w = f.f71b;
            Typeface typeface = (Typeface) c2191w.c(f.b(resources, i5, string, i6));
            if (typeface != null) {
                if (androidFontLoader_androidKt$loadAsync$2$1 != null) {
                    androidFontLoader_androidKt$loadAsync$2$1.callbackSuccessAsync(typeface, null);
                }
                typefaceA = typeface;
            } else {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        e eVarE = b.e(resources.getXml(i5), resources);
                        if (eVarE == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (androidFontLoader_androidKt$loadAsync$2$1 != null) {
                                androidFontLoader_androidKt$loadAsync$2$1.callbackFailAsync(-3, null);
                            }
                        } else {
                            typefaceA = f.a(context, eVarE, resources, i5, string, typedValue.assetCookie, androidFontLoader_androidKt$loadAsync$2$1);
                        }
                    } else {
                        int i7 = typedValue.assetCookie;
                        Typeface typefaceJ = f.f70a.j(context, resources, i5, string);
                        if (typefaceJ != null) {
                            c2191w.d(f.b(resources, i5, string, i7), typefaceJ);
                        }
                        if (androidFontLoader_androidKt$loadAsync$2$1 != null) {
                            if (typefaceJ != null) {
                                androidFontLoader_androidKt$loadAsync$2$1.callbackSuccessAsync(typefaceJ, null);
                            } else {
                                androidFontLoader_androidKt$loadAsync$2$1.callbackFailAsync(-3, null);
                            }
                        }
                        typefaceA = typefaceJ;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (androidFontLoader_androidKt$loadAsync$2$1 != null) {
                        androidFontLoader_androidKt$loadAsync$2$1.callbackFailAsync(-3, null);
                    }
                } catch (XmlPullParserException e3) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e3);
                    if (androidFontLoader_androidKt$loadAsync$2$1 != null) {
                        androidFontLoader_androidKt$loadAsync$2$1.callbackFailAsync(-3, null);
                    }
                }
            }
        } else if (androidFontLoader_androidKt$loadAsync$2$1 != null) {
            androidFontLoader_androidKt$loadAsync$2$1.callbackFailAsync(-3, null);
        }
        if (typefaceA != null || androidFontLoader_androidKt$loadAsync$2$1 != null) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i5) + " could not be retrieved.");
    }
}

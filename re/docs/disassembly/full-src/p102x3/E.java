package p102x3;

import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.razorpay.AppSignatureHelper;
import kotlin.jvm.internal.o;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13892o;
    public static final E p = new E(0);
    public static final E q = new E(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E f13885r = new E(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final E f13886s = new E(3);
    public static final E t = new E(4);
    public static final E u = new E(5);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final E f13887v = new E(6);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final E f13888w = new E(7);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final E f13889x = new E(8);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final E f13890y = new E(9);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final E f13891z = new E(10);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final E f13879A = new E(11);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final E f13880B = new E(12);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final E f13881C = new E(13);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final E f13882D = new E(14);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final E f13883E = new E(15);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final E f13884F = new E(16);

    public /* synthetic */ E(int i5) {
        this.f13892o = i5;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f13892o) {
            case 0:
                RowScope TextButton = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                o.f(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1136965630, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$ContactUsScreenKt.lambda-3.<anonymous> (ContactUsScreen.kt:321)");
                    }
                    TextKt.m2432Text4IGK_g("Visit Help Center →", (Modifier) null, a.f15980c, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                RowScope TextButton2 = (RowScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                o.f(TextButton2, "$this$TextButton");
                if ((iIntValue2 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-325243625, iIntValue2, -1, "com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-1.<anonymous> (DownloadsScreen.kt:127)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 2:
                RowScope TextButton3 = (RowScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                o.f(TextButton3, "$this$TextButton");
                if ((iIntValue3 & 17) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1584574080, iIntValue3, -1, "com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-2.<anonymous> (DownloadsScreen.kt:148)");
                    }
                    TextKt.m2432Text4IGK_g("Rename", (Modifier) null, a.f15978a, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 3:
                RowScope TextButton4 = (RowScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                o.f(TextButton4, "$this$TextButton");
                if ((iIntValue4 & 17) == 16 && composer4.getSkipping()) {
                    composer4.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1575712626, iIntValue4, -1, "com.notescrafter.ui.screens.ComposableSingletons$DownloadsScreenKt.lambda-3.<anonymous> (DownloadsScreen.kt:181)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 4:
                RowScope OutlinedButton = (RowScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                o.f(OutlinedButton, "$this$OutlinedButton");
                if ((iIntValue5 & 17) == 16 && composer5.getSkipping()) {
                    composer5.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(917964968, iIntValue5, -1, "com.notescrafter.ui.screens.ComposableSingletons$EditPageScreenKt.lambda-2.<anonymous> (EditPageScreen.kt:490)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 5:
                RowScope Button = (RowScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                o.f(Button, "$this$Button");
                if ((iIntValue6 & 17) == 16 && composer6.getSkipping()) {
                    composer6.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(847364473, iIntValue6, -1, "com.notescrafter.ui.screens.ComposableSingletons$EnhanceScreenKt.lambda-1.<anonymous> (EnhanceScreen.kt:313)");
                    }
                    TextKt.m2432Text4IGK_g("Edit Selection", (Modifier) null, a.f15978a, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 6:
                RowScope OutlinedButton2 = (RowScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                o.f(OutlinedButton2, "$this$OutlinedButton");
                if ((iIntValue7 & 17) == 16 && composer7.getSkipping()) {
                    composer7.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-427917850, iIntValue7, -1, "com.notescrafter.ui.screens.ComposableSingletons$LogoSelectionScreenKt.lambda-2.<anonymous> (LogoSelectionScreen.kt:352)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer7, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 7:
                RowScope TextButton5 = (RowScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                o.f(TextButton5, "$this$TextButton");
                if ((iIntValue8 & 17) == 16 && composer8.getSkipping()) {
                    composer8.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1826926906, iIntValue8, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-1.<anonymous> (PreviewScreen.kt:137)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer8, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 8:
                RowScope TextButton6 = (RowScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                o.f(TextButton6, "$this$TextButton");
                if ((iIntValue9 & 17) == 16 && composer9.getSkipping()) {
                    composer9.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1861503234, iIntValue9, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-10.<anonymous> (PreviewScreen.kt:339)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer9, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                RowScope TextButton7 = (RowScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                o.f(TextButton7, "$this$TextButton");
                if ((iIntValue10 & 17) == 16 && composer10.getSkipping()) {
                    composer10.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1808982777, iIntValue10, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-11.<anonymous> (PreviewScreen.kt:363)");
                    }
                    TextKt.m2432Text4IGK_g("Add Slide", (Modifier) null, a.f15978a, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer10, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 10:
                RowScope TextButton8 = (RowScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                o.f(TextButton8, "$this$TextButton");
                if ((iIntValue11 & 17) == 16 && composer11.getSkipping()) {
                    composer11.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2005912929, iIntValue11, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-12.<anonymous> (PreviewScreen.kt:403)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer11, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case AppSignatureHelper.NUM_BASE64_CHAR /* 11 */:
                RowScope TextButton9 = (RowScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                o.f(TextButton9, "$this$TextButton");
                if ((iIntValue12 & 17) == 16 && composer12.getSkipping()) {
                    composer12.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(901733617, iIntValue12, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-2.<anonymous> (PreviewScreen.kt:153)");
                    }
                    TextKt.m2432Text4IGK_g("Yes, Move", (Modifier) null, a.f15978a, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer12, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case Matrix.TranslateX /* 12 */:
                RowScope TextButton10 = (RowScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                o.f(TextButton10, "$this$TextButton");
                if ((iIntValue13 & 17) == 16 && composer13.getSkipping()) {
                    composer13.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1717093539, iIntValue13, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-7.<anonymous> (PreviewScreen.kt:247)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer13, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case Matrix.TranslateY /* 13 */:
                RowScope TextButton11 = (RowScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Number) obj3).intValue();
                o.f(TextButton11, "$this$TextButton");
                if ((iIntValue14 & 17) == 16 && composer14.getSkipping()) {
                    composer14.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1664573082, iIntValue14, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-8.<anonymous> (PreviewScreen.kt:275)");
                    }
                    TextKt.m2432Text4IGK_g("Move Slide", (Modifier) null, a.f15978a, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer14, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case Matrix.TranslateZ /* 14 */:
                RowScope OutlinedButton3 = (RowScope) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Number) obj3).intValue();
                o.f(OutlinedButton3, "$this$OutlinedButton");
                if ((iIntValue15 & 17) == 16 && composer15.getSkipping()) {
                    composer15.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1323282687, iIntValue15, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-14.<anonymous> (PrintOrderScreens.kt:2793)");
                    }
                    TextKt.m2432Text4IGK_g("Resend", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer15, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 15:
                RowScope TextButton12 = (RowScope) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Number) obj3).intValue();
                o.f(TextButton12, "$this$TextButton");
                if ((iIntValue16 & 17) == 16 && composer16.getSkipping()) {
                    composer16.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-862332204, iIntValue16, -1, "com.notescrafter.ui.screens.ComposableSingletons$ReorderScreenKt.lambda-1.<anonymous> (ReorderScreen.kt:90)");
                    }
                    TextKt.m2432Text4IGK_g("Cancel", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer16, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                RowScope OutlinedButton4 = (RowScope) obj;
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Number) obj3).intValue();
                o.f(OutlinedButton4, "$this$OutlinedButton");
                if ((iIntValue17 & 17) == 16 && composer17.getSkipping()) {
                    composer17.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1376700267, iIntValue17, -1, "com.notescrafter.ui.screens.ComposableSingletons$UploadScreenKt.lambda-1.<anonymous> (UploadScreen.kt:179)");
                    }
                    TextKt.m2432Text4IGK_g("Clear", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer17, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return B3.o.f154a;
    }
}

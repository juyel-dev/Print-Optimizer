package p102x3;

import B3.o;
import O3.c;
import O3.e;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.razorpay.AppSignatureHelper;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class W implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14553o;
    public static final W p = new W(0);
    public static final W q = new W(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final W f14546r = new W(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final W f14547s = new W(3);
    public static final W t = new W(4);
    public static final W u = new W(5);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final W f14548v = new W(6);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final W f14549w = new W(7);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final W f14550x = new W(8);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final W f14551y = new W(9);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final W f14552z = new W(10);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final W f14545A = new W(11);

    public /* synthetic */ W(int i5) {
        this.f14553o = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14553o) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if ((iIntValue & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-755475541, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$HelpCenterScreenKt.lambda-1.<anonymous> (HelpCenterScreen.kt:146)");
                    }
                    TextKt.m2432Text4IGK_g("Search for help...", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if ((iIntValue2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1949283643, iIntValue2, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-10.<anonymous> (PdfAddPageNumbersScreen.kt:1104)");
                    }
                    TextKt.m2432Text4IGK_g("Font Size", (Modifier) null, a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 3462, 0, 131058);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if ((iIntValue3 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1542010084, iIntValue3, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-12.<anonymous> (PdfAddPageNumbersScreen.kt:1123)");
                    }
                    TextKt.m2432Text4IGK_g("Start From", (Modifier) null, a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3462, 0, 131058);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if ((iIntValue4 & 3) == 2 && composer4.getSkipping()) {
                    composer4.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(149076675, iIntValue4, -1, "com.notescrafter.ui.screens.ComposableSingletons$PdfAddPageNumbersScreenKt.lambda-14.<anonymous> (PdfAddPageNumbersScreen.kt:1142)");
                    }
                    TextKt.m2432Text4IGK_g("Skip Pages", (Modifier) null, a.p, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 3462, 0, 131058);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if ((iIntValue5 & 3) == 2 && composer5.getSkipping()) {
                    composer5.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1882603108, iIntValue5, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-3.<anonymous> (PreviewScreen.kt:189)");
                    }
                    TextKt.m2432Text4IGK_g("From Slide No.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if ((iIntValue6 & 3) == 2 && composer6.getSkipping()) {
                    composer6.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-3076485, iIntValue6, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-4.<anonymous> (PreviewScreen.kt:190)");
                    }
                    TextKt.m2432Text4IGK_g("e.g. 1", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if ((iIntValue7 & 3) == 2 && composer7.getSkipping()) {
                    composer7.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1164456083, iIntValue7, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-5.<anonymous> (PreviewScreen.kt:214)");
                    }
                    TextKt.m2432Text4IGK_g("To Position", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer7, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if ((iIntValue8 & 3) == 2 && composer8.getSkipping()) {
                    composer8.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-791690830, iIntValue8, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-6.<anonymous> (PreviewScreen.kt:215)");
                    }
                    TextKt.m2432Text4IGK_g("e.g. 5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer8, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 8:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if ((iIntValue9 & 3) == 2 && composer9.getSkipping()) {
                    composer9.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1738193413, iIntValue9, -1, "com.notescrafter.ui.screens.ComposableSingletons$PreviewScreenKt.lambda-9.<anonymous> (PreviewScreen.kt:307)");
                    }
                    TextKt.m2432Text4IGK_g("Position", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer9, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if ((iIntValue10 & 3) == 2 && composer10.getSkipping()) {
                    composer10.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-366948222, iIntValue10, -1, "com.notescrafter.ui.screens.ComposableSingletons$PrintOrderScreensKt.lambda-12.<anonymous> (PrintOrderScreens.kt:2703)");
                    }
                    TextKt.m2432Text4IGK_g("+91 Mobile", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer10, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 10:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if ((iIntValue11 & 3) == 2 && composer11.getSkipping()) {
                    composer11.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-675348570, iIntValue11, -1, "com.notescrafter.ui.screens.ComposableSingletons$QuickToolsScreenKt.lambda-1.<anonymous> (QuickToolsScreen.kt:101)");
                    }
                    TextKt.m2432Text4IGK_g("Search tools...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer11, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if ((iIntValue12 & 3) == 2 && composer12.getSkipping()) {
                    composer12.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1073923141, iIntValue12, -1, "com.notescrafter.ui.screens.ComposableSingletons$ToDoScreenKt.lambda-5.<anonymous> (ToDoScreen.kt:413)");
                    }
                    TextKt.m2432Text4IGK_g("Exam Name", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer12, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return o.f154a;
    }
}

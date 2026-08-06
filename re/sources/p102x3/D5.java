package p102x3;

import C3.D;
import C3.u;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DescriptionKt;
import androidx.compose.material.icons.outlined.HelpOutlineKt;
import androidx.compose.material.icons.outlined.SecurityKt;
import androidx.compose.material.icons.outlined.SettingsKt;
import androidx.compose.material.icons.outlined.WarningKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2292j;
import p083t3.C2321y;
import p097w3.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D5 {
    public static final void a(C2413c5 c2413c5, boolean z3, a onToggle, Composer composer, int i5) {
        int i6;
        Composer composer2;
        o.f(onToggle, "onToggle");
        Composer composerStartRestartGroup = composer.startRestartGroup(1809821941);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(c2413c5) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onToggle) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1809821941, i6, -1, "com.notescrafter.ui.screens.FAQCard (HelpCenterScreen.kt:334)");
            }
            composer2 = composerStartRestartGroup;
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0L, 0L, 0.0f, onToggle, ComposableLambdaKt.rememberComposableLambda(-1065706982, true, new C2764y5(z3, c2413c5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 << 6) & 57344) | 196614, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2732w5(c2413c5, z3, onToggle, i5, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0611  */
    /* JADX WARN: Code duplicated, block: B:117:0x061d  */
    /* JADX WARN: Code duplicated, block: B:120:0x068a  */
    /* JADX WARN: Code duplicated, block: B:122:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:125:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:126:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:134:0x0739  */
    /* JADX WARN: Code duplicated, block: B:137:0x0745  */
    /* JADX WARN: Code duplicated, block: B:138:0x0749  */
    /* JADX WARN: Code duplicated, block: B:143:0x0768  */
    /* JADX WARN: Code duplicated, block: B:147:0x078f  */
    /* JADX WARN: Code duplicated, block: B:153:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:157:0x0831  */
    /* JADX WARN: Code duplicated, block: B:160:0x083d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0841  */
    /* JADX WARN: Code duplicated, block: B:166:0x0860  */
    /* JADX WARN: Code duplicated, block: B:170:0x0896  */
    /* JADX WARN: Code duplicated, block: B:176:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:179:0x090b  */
    /* JADX WARN: Code duplicated, block: B:182:0x094d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0959  */
    /* JADX WARN: Code duplicated, block: B:186:0x095d  */
    /* JADX WARN: Code duplicated, block: B:191:0x097c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0994  */
    /* JADX WARN: Code duplicated, block: B:196:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:197:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:200:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:203:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:209:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:213:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:219:0x0aa7  */
    /* JADX WARN: Code duplicated, block: B:224:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:227:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:231:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0a14 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(Modifier modifier, c onNavigate, Composer composer, int i5) {
        Composer composer2;
        LinkedHashMap linkedHashMap;
        Object obj;
        float f5;
        MutableState mutableState;
        float f6;
        Object objRememberedValue;
        MutableState mutableState2;
        MutableState mutableState3;
        int i6;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        boolean zChanged;
        Object objRememberedValue2;
        c cVar;
        Modifier modifier2;
        String str;
        Iterator it;
        Object next;
        C2503i c2503i;
        boolean zChanged2;
        Object objRememberedValue3;
        final MutableState mutableState4;
        final int i7;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        RowScopeInstance rowScopeInstance;
        MutableState mutableState5;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG4;
        RowScopeInstance rowScopeInstance2;
        boolean zChanged3;
        Object objRememberedValue4;
        final MutableState mutableState6;
        boolean zChanged4;
        Object objRememberedValue5;
        final MutableState mutableState7;
        Composer composer3;
        o.f(onNavigate, "onNavigate");
        Composer composerStartRestartGroup = composer.startRestartGroup(1727850806);
        int i8 = ((i5 & 6) == 0 ? (composerStartRestartGroup.changedInstance(onNavigate) ? 4 : 2) | i5 : i5) | 48;
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            cVar = onNavigate;
            composer3 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1727850806, i8, -1, "com.notescrafter.ui.screens.HelpCenterScreen (HelpCenterScreen.kt:45)");
            }
            composerStartRestartGroup.startReplaceGroup(1155950285);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (objRememberedValue6 == companion3.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue6;
            Object objK = b.k(composerStartRestartGroup, 1155952148);
            if (objK == companion3.getEmpty()) {
                objK = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("general", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK);
            }
            MutableState mutableState9 = (MutableState) objK;
            Object objK2 = b.k(composerStartRestartGroup, 1155954136);
            if (objK2 == companion3.getEmpty()) {
                objK2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objK2);
            }
            final MutableState mutableState10 = (MutableState) objK2;
            Object objK3 = b.k(composerStartRestartGroup, 1155956751);
            if (objK3 == companion3.getEmpty()) {
                Icons.Outlined outlined = Icons.Outlined.INSTANCE;
                objK3 = v.S(new C2503i(HelpOutlineKt.getHelpOutline(outlined), "general", "General Questions"), new C2503i(DescriptionKt.getDescription(outlined), "processing", "PDF Processing"), new C2503i(SecurityKt.getSecurity(outlined), "privacy", "Privacy & Security"), new C2503i(SettingsKt.getSettings(outlined), "technical", "Technical Issues"), new C2503i(WarningKt.getWarning(outlined), "troubleshooting", "Troubleshooting"));
                composerStartRestartGroup.updateRememberedValue(objK3);
            }
            List list = (List) objK3;
            Object objK4 = b.k(composerStartRestartGroup, 1155975142);
            if (objK4 == companion3.getEmpty()) {
                objK4 = v.S(new C2413c5("what-is-notescrafter", "What is NotesCrafter?", "NotesCrafter is a powerful mobile app that enhances and merges PDFs. Transform dark lecture slides to print-ready documents, merge multiple PDFs, remove backgrounds, and optimize for printing - all locally on your device.", "general"), new C2413c5("is-it-really-free", "Is NotesCrafter really free?", "Yes! 100% free forever. We are supported by short ads to keep the service running without any subscription fees.", "general"), new C2413c5("how-to-print-online-lecture-notes", "How does it work?", "Select your PDF file, choose enhancement options (invert colors, remove background, grayscale, merge PDFs), and tap process. Everything happens on your device - no servers involved.", "general"), new C2413c5("no-account-needed", "Do I need to create an account?", "Nope! No account, no login, no signup required. Just open the app and start processing PDFs immediately.", "general"), new C2413c5("file-upload", "Are my files uploaded to your servers?", "No. Your files never leave your device. All processing happens locally within the app. We cannot see, access, or store your PDFs.", "privacy"), new C2413c5("data-collection", "What data do you collect?", "We collect anonymous usage statistics and crash logs to improve the app. We use AdMob to serve ads, which may collect anonymous data as per Google's policies.", "privacy"), new C2413c5("privacy-verify", "How can I verify my files aren't uploaded?", "You can verify this by checking your data usage. Since no document data leaves your device, it's completely secure.", "privacy"), new C2413c5("supported-formats", "What file formats are supported?", "PDF files. Most standard PDFs work great, though very large files (100MB+) may take longer depending on your device's memory.", "processing"), new C2413c5("processing-time", "How long does processing take?", "Most PDFs process in seconds. Time depends on file size, page count, and your device's processing power. Newer phones will process faster.", "processing"), new C2413c5("merge-pdfs", "Can I merge multiple PDFs?", "Yes! Select multiple PDF files from your storage and they'll be combined into one document. All processing happens locally on your device.", "processing"), new C2413c5("jpeg2000-issue", "What does the JPEG2000 warning mean?", "Some PDFs contain specialized images that might be harder to process. We detect this automatically. If you see this, try using standard enhancement options.", "technical"), new C2413c5("browser-compatibility", "What devices are supported?", "NotesCrafter works on most modern Android devices. Keep your Android OS updated for the best performance and security.", "technical"), new C2413c5("offline-use", "Can I use NotesCrafter offline?", "An internet connection is required to verify the free version and load ads. However, the actual document processing logic still runs locally on your device for privacy.", "technical"), new C2413c5("poor-quality", "The output quality isn't good. How to improve it?", "Start with high-quality PDFs (avoid low-resolution scans). Try different enhancement combinations. For very dark slides, use \"Invert Colors\". For busy backgrounds, try \"Remove Background\".", "troubleshooting"), new C2413c5("processing-slow", "Processing is slow. What can I do?", "Large PDFs or complex pages take longer. Try closing other background apps to free up memory or processing fewer files at once.", "troubleshooting"), new C2413c5("browser-crash", "The app crashes or freezes. Help!", "Very large PDFs (100MB+) or hundreds of pages can use a lot of memory. Try splitting the PDF into smaller files or restarting the app to free up resources.", "troubleshooting"));
                Composer composer4 = composerStartRestartGroup;
                composer4.updateRememberedValue(objK4);
                composer2 = composer4;
            } else {
                composer2 = composerStartRestartGroup;
            }
            List list2 = (List) objK4;
            composer2.endReplaceGroup();
            Object obj2 = (String) mutableState8.getValue();
            Object obj3 = (String) mutableState9.getValue();
            composer2.startReplaceGroup(1156099650);
            boolean zChanged5 = composer2.changed(obj2) | composer2.changed(obj3);
            Object objRememberedValue7 = composer2.rememberedValue();
            if (zChanged5 || objRememberedValue7 == companion3.getEmpty()) {
                if (W3.j.m0((String) mutableState8.getValue())) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((C2413c5) obj4).f14863d.equals((String) mutableState9.getValue())) {
                            arrayList.add(obj4);
                        }
                    }
                    objRememberedValue7 = arrayList;
                } else {
                    String lowerCase = W3.j.I0((String) mutableState8.getValue()).toString().toLowerCase(Locale.ROOT);
                    o.e(lowerCase, "toLowerCase(...)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : list2) {
                        C2413c5 c2413c5 = (C2413c5) obj5;
                        String str2 = c2413c5.f14861b;
                        Locale locale = Locale.ROOT;
                        String lowerCase2 = str2.toLowerCase(locale);
                        o.e(lowerCase2, "toLowerCase(...)");
                        if (!W3.j.c0(lowerCase2, lowerCase, false)) {
                            String lowerCase3 = c2413c5.f14862c.toLowerCase(locale);
                            o.e(lowerCase3, "toLowerCase(...)");
                            if (!W3.j.c0(lowerCase3, lowerCase, false)) {
                                String lowerCase4 = c2413c5.f14863d.toLowerCase(locale);
                                o.e(lowerCase4, "toLowerCase(...)");
                                if (W3.j.c0(lowerCase4, lowerCase, false)) {
                                }
                            }
                        }
                        arrayList2.add(obj5);
                    }
                    objRememberedValue7 = arrayList2;
                }
                composer2.updateRememberedValue(objRememberedValue7);
            }
            List<C2413c5> list3 = (List) objRememberedValue7;
            composer2.endReplaceGroup();
            Object obj6 = (String) mutableState8.getValue();
            composer2.startReplaceGroup(1156117105);
            boolean zChanged6 = composer2.changed(obj6) | composer2.changed(list3);
            Object objRememberedValue8 = composer2.rememberedValue();
            if (zChanged6 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                obj = objRememberedValue8;
                if (W3.j.m0((String) mutableState8.getValue())) {
                    linkedHashMap = D.f168o;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj7 : list3) {
                        String str3 = ((C2413c5) obj7).f14863d;
                        Object arrayList3 = linkedHashMap.get(str3);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(str3, arrayList3);
                        }
                        ((List) arrayList3).add(obj7);
                    }
                }
                composer2.updateRememberedValue(linkedHashMap);
                obj = linkedHashMap;
            }
            obj = objRememberedValue8;
            Map map = (Map) obj;
            composer2.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor5 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer2);
            e eVarG5 = p035i0.a.g(companion5, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion6 = Modifier.Companion;
            float f7 = 24;
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null);
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM672paddingqDBjuR0$default);
            a constructor6 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor6);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
            e eVarG6 = p035i0.a.g(companion5, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap2);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier2, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f8 = 48;
            float f9 = 32;
            float f10 = 16;
            Modifier modifierM671paddingqDBjuR0 = PaddingKt.m671paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f10), Dp.m6403constructorimpl(f8), Dp.m6403constructorimpl(f10), Dp.m6403constructorimpl(f9));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composer2, 48);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM671paddingqDBjuR0);
            a constructor7 = companion5.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor7);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer2);
            e eVarG7 = p035i0.a.g(companion5, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap3);
            if (composerM3407constructorimpl7.getInserting()) {
                f5 = f9;
            } else {
                f5 = f9;
                if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier3, companion5.getSetModifier());
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i9 = MaterialTheme.$stable;
                TextStyle headlineLarge = materialTheme.getTypography(composer2, i9).getHeadlineLarge();
                FontWeight bold = FontWeight.Companion.getBold();
                long j5 = p107y3.a.f15990o;
                float f11 = f5;
                mutableState = mutableState9;
                TextKt.m2432Text4IGK_g("Help Center", PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f10), 7, null), j5, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineLarge, composer2, 197046, 0, 65496);
                TextKt.m2432Text4IGK_g("Find answers to common questions and get help with using NotesCrafter", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i9).getBodyLarge(), composer2, 390, 0, 65018);
                composer2.endNode();
                String str4 = (String) mutableState8.getValue();
                f6 = 8;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f7), Dp.m6403constructorimpl(f6));
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                long j6 = p107y3.a.g;
                long j7 = p107y3.a.f15978a;
                TextFieldColors textFieldColorsM2076colors0hiis_0 = outlinedTextFieldDefaults.m2076colors0hiis_0(j5, j5, 0L, 0L, j6, j6, 0L, 0L, j7, 0L, null, j7, Color.Companion.m3962getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 100884534, 432, 0, 0, 3072, 2147477196, 4095);
                RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
                composer2.startReplaceGroup(-311070656);
                objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    mutableState2 = mutableState8;
                    objRememberedValue = new C2321y(4, mutableState2);
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    mutableState2 = mutableState8;
                }
                composer2.endReplaceGroup();
                mutableState3 = mutableState2;
                OutlinedTextFieldKt.OutlinedTextField(str4, (c) objRememberedValue, modifierM669paddingVpY3zN4, false, false, (TextStyle) null, (e) null, (e) AbstractC2376a0.f14761a, (e) AbstractC2376a0.f14762b, (e) ComposableLambdaKt.rememberComposableLambda(331484009, true, new C2780z5(0, mutableState2), composer2, 54), (e) null, (e) null, (e) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2076colors0hiis_0, composer2, 918553008, 12582912, 0, 1965176);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f11)), composer2, 6);
                composer2.startReplaceGroup(-311024539);
                if (((String) mutableState3.getValue()).length() == 0) {
                    Modifier modifierM672paddingqDBjuR0$default2 = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion4.getStart(), composer2, 6);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM672paddingqDBjuR0$default2);
                    constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                    eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier4, companion5.getSetModifier());
                    i6 = 2;
                    Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f10), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion4.getTop(), composer2, 6);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default);
                    constructor3 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                    eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier5, companion5.getSetModifier());
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(983497013);
                    List list4 = list;
                    for (final C2503i c2503i2 : u.E0(list4, 3)) {
                        boolean zB = o.b((String) mutableState.getValue(), c2503i2.f15167a);
                        composer2.startReplaceGroup(-2047830327);
                        zChanged4 = composer2.changed(c2503i2);
                        objRememberedValue5 = composer2.rememberedValue();
                        if (!zChanged4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                            mutableState7 = mutableState;
                            final int i10 = 0;
                            objRememberedValue5 = new a() { // from class: x3.u5
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            mutableState7.setValue(c2503i2.f15167a);
                                            break;
                                        default:
                                            mutableState7.setValue(c2503i2.f15167a);
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        } else {
                            mutableState7 = mutableState;
                        }
                        composer2.endReplaceGroup();
                        AbstractC2535k.a(c2503i2, zB, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composer2, 0);
                        mutableState = mutableState7;
                    }
                    mutableState5 = mutableState;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    Modifier.Companion companion7 = Modifier.Companion;
                    Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), Dp.m6403constructorimpl(f10), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), Alignment.Companion.getTop(), composer2, 6);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default2);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                    constructor4 = companion8.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
                    eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier6, companion8.getSetModifier());
                    rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, companion7, 0.5f, false, 2, null), composer2, 0);
                    composer2.startReplaceGroup(983525206);
                    for (final C2503i c2503i3 : u.n0(list4, 3)) {
                        boolean zB2 = o.b((String) mutableState5.getValue(), c2503i3.f15167a);
                        composer2.startReplaceGroup(-2047802135);
                        zChanged3 = composer2.changed(c2503i3);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (!zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            mutableState6 = mutableState5;
                            final int i11 = 1;
                            objRememberedValue4 = new a() { // from class: x3.u5
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            mutableState6.setValue(c2503i3.f15167a);
                                            break;
                                        default:
                                            mutableState6.setValue(c2503i3.f15167a);
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            mutableState6 = mutableState5;
                        }
                        composer2.endReplaceGroup();
                        AbstractC2535k.a(c2503i3, zB2, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null), composer2, 0);
                        mutableState5 = mutableState6;
                    }
                    composer2.endReplaceGroup();
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, Modifier.Companion, 0.5f, false, 2, null), composer2, 0);
                    composer2.endNode();
                    composer2.endNode();
                } else {
                    i6 = 2;
                }
                composer2.endReplaceGroup();
                companion = Modifier.Companion;
                Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f7), 0.0f, i6, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), Alignment.Companion.getStart(), composer2, 6);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default3);
                ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
                constructor = companion9.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
                eVarG = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap7);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier7, companion9.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                if (((String) mutableState3.getValue()).length() > 0) {
                    composer2.startReplaceGroup(733495280);
                    if (list3.isEmpty()) {
                        composer2.startReplaceGroup(733510284);
                        j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(454472314, true, new A5(mutableState3), composer2, 54), composer2, 196614, 30);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(734051141);
                        for (Map.Entry entry : map.entrySet()) {
                            str = (String) entry.getKey();
                            List<C2413c5> list5 = (List) entry.getValue();
                            it = list.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((C2503i) next).f15167a.equals(str));
                            c2503i = (C2503i) next;
                            if (c2503i != null) {
                                str = c2503i.f15168b;
                            }
                            TextKt.m2432Text4IGK_g(str, PaddingKt.m669paddingVpY3zN4(Modifier.Companion, Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(4)), p107y3.a.p, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleSmall(), composer2, 197040, 0, 65496);
                            composer2.startReplaceGroup(23698985);
                            for (final C2413c5 c2413c6 : list5) {
                                boolean zB3 = o.b((String) mutableState10.getValue(), c2413c6.f14860a);
                                composer2.startReplaceGroup(-2047736410);
                                zChanged2 = composer2.changed(c2413c6);
                                objRememberedValue3 = composer2.rememberedValue();
                                if (!zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                    mutableState4 = mutableState10;
                                    i7 = 0;
                                    objRememberedValue3 = new a() { // from class: x3.v5
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // O3.a
                                        public final Object invoke() {
                                            switch (i7) {
                                                case 0:
                                                    MutableState mutableState11 = mutableState4;
                                                    String str5 = (String) mutableState11.getValue();
                                                    C2413c5 c2413c7 = c2413c6;
                                                    mutableState11.setValue(o.b(str5, c2413c7.f14860a) ? null : c2413c7.f14860a);
                                                    break;
                                                default:
                                                    MutableState mutableState12 = mutableState4;
                                                    String str6 = (String) mutableState12.getValue();
                                                    C2413c5 c2413c8 = c2413c6;
                                                    mutableState12.setValue(o.b(str6, c2413c8.f14860a) ? null : c2413c8.f14860a);
                                                    break;
                                            }
                                            return B3.o.f154a;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                } else {
                                    mutableState4 = mutableState10;
                                    i7 = 0;
                                }
                                composer2.endReplaceGroup();
                                a(c2413c6, zB3, (a) objRememberedValue3, composer2, i7);
                                mutableState10 = mutableState4;
                            }
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                } else {
                    i6 = i6;
                    composer2.startReplaceGroup(735088463);
                    for (final C2413c5 c2413c7 : list3) {
                        boolean zB4 = o.b((String) mutableState10.getValue(), c2413c7.f14860a);
                        composer2.startReplaceGroup(983612519);
                        zChanged = composer2.changed(c2413c7);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            final int i12 = 1;
                            objRememberedValue2 = new a() { // from class: x3.v5
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // O3.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            MutableState mutableState11 = mutableState10;
                                            String str5 = (String) mutableState11.getValue();
                                            C2413c5 c2413c8 = c2413c7;
                                            mutableState11.setValue(o.b(str5, c2413c8.f14860a) ? null : c2413c8.f14860a);
                                            break;
                                        default:
                                            MutableState mutableState12 = mutableState10;
                                            String str6 = (String) mutableState12.getValue();
                                            C2413c5 c2413c9 = c2413c7;
                                            mutableState12.setValue(o.b(str6, c2413c9.f14860a) ? null : c2413c9.f14860a);
                                            break;
                                    }
                                    return B3.o.f154a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        a(c2413c7, zB4, (a) objRememberedValue2, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                Modifier.Companion companion10 = Modifier.Companion;
                b.m(f8, companion10, composer2, 6);
                cVar = onNavigate;
                j.a(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), Dp.m6403constructorimpl(f7), 0.0f, i6, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1721436631, true, new C5(cVar), composer2, 54), composer2, 196614, 30);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f8)), composer2, 6);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion2;
                composer3 = composer2;
            }
            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier3, companion5.getSetModifier());
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            TextStyle headlineLarge2 = materialTheme2.getTypography(composer2, i13).getHeadlineLarge();
            FontWeight bold2 = FontWeight.Companion.getBold();
            long j8 = p107y3.a.f15990o;
            float f12 = f5;
            mutableState = mutableState9;
            TextKt.m2432Text4IGK_g("Help Center", PaddingKt.m672paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f10), 7, null), j8, 0L, (FontStyle) null, bold2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineLarge2, composer2, 197046, 0, 65496);
            TextKt.m2432Text4IGK_g("Find answers to common questions and get help with using NotesCrafter", (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composer2, i13).getBodyLarge(), composer2, 390, 0, 65018);
            composer2.endNode();
            String str5 = (String) mutableState8.getValue();
            f6 = 8;
            Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f7), Dp.m6403constructorimpl(f6));
            OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.INSTANCE;
            long j9 = p107y3.a.g;
            long j10 = p107y3.a.f15978a;
            TextFieldColors textFieldColorsM2076colors0hiis_1 = outlinedTextFieldDefaults2.m2076colors0hiis_0(j8, j8, 0L, 0L, j9, j9, 0L, 0L, j10, 0L, null, j10, Color.Companion.m3962getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 100884534, 432, 0, 0, 3072, 2147477196, 4095);
            RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12));
            composer2.startReplaceGroup(-311070656);
            objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                mutableState2 = mutableState8;
                objRememberedValue = new C2321y(4, mutableState2);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                mutableState2 = mutableState8;
            }
            composer2.endReplaceGroup();
            mutableState3 = mutableState2;
            OutlinedTextFieldKt.OutlinedTextField(str5, (c) objRememberedValue, modifierM669paddingVpY3zN5, false, false, (TextStyle) null, (e) null, (e) AbstractC2376a0.f14761a, (e) AbstractC2376a0.f14762b, (e) ComposableLambdaKt.rememberComposableLambda(331484009, true, new C2780z5(0, mutableState2), composer2, 54), (e) null, (e) null, (e) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_5, textFieldColorsM2076colors0hiis_1, composer2, 918553008, 12582912, 0, 1965176);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion6, Dp.m6403constructorimpl(f12)), composer2, 6);
            composer2.startReplaceGroup(-311024539);
            if (((String) mutableState3.getValue()).length() == 0) {
                Modifier modifierM672paddingqDBjuR0$default3 = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f7), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion4.getStart(), composer2, 6);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierM672paddingqDBjuR0$default3);
                constructor2 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                eVarG2 = p035i0.a.g(companion5, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap8);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier8, companion5.getSetModifier());
                i6 = 2;
                Modifier modifierM670paddingVpY3zN4$default4 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), Dp.m6403constructorimpl(f10), 0.0f, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), companion4.getTop(), composer2, 6);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default4);
                constructor3 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap9);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier9, companion5.getSetModifier());
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composer2.startReplaceGroup(983497013);
                List list6 = list;
                while (r14.hasNext()) {
                    boolean zB5 = o.b((String) mutableState.getValue(), c2503i2.f15167a);
                    composer2.startReplaceGroup(-2047830327);
                    zChanged4 = composer2.changed(c2503i2);
                    objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged4) {
                        mutableState7 = mutableState;
                        final int i14 = 0;
                        objRememberedValue5 = new a() { // from class: x3.u5
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        mutableState7.setValue(c2503i2.f15167a);
                                        break;
                                    default:
                                        mutableState7.setValue(c2503i2.f15167a);
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    } else {
                        mutableState7 = mutableState;
                        final int i15 = 0;
                        objRememberedValue5 = new a() { // from class: x3.u5
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        mutableState7.setValue(c2503i2.f15167a);
                                        break;
                                    default:
                                        mutableState7.setValue(c2503i2.f15167a);
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    AbstractC2535k.a(c2503i2, zB5, (a) objRememberedValue5, RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composer2, 0);
                    mutableState = mutableState7;
                }
                mutableState5 = mutableState;
                composer2.endReplaceGroup();
                composer2.endNode();
                Modifier.Companion companion11 = Modifier.Companion;
                Modifier modifierM670paddingVpY3zN4$default5 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), Dp.m6403constructorimpl(f10), 0.0f, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f6)), Alignment.Companion.getTop(), composer2, 6);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default5);
                ComposeUiNode.Companion companion12 = ComposeUiNode.Companion;
                constructor4 = companion12.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
                eVarG4 = p035i0.a.g(companion12, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap10);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier10, companion12.getSetModifier());
                rowScopeInstance2 = RowScopeInstance.INSTANCE;
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, companion11, 0.5f, false, 2, null), composer2, 0);
                composer2.startReplaceGroup(983525206);
                while (r5.hasNext()) {
                    boolean zB6 = o.b((String) mutableState5.getValue(), c2503i3.f15167a);
                    composer2.startReplaceGroup(-2047802135);
                    zChanged3 = composer2.changed(c2503i3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3) {
                        mutableState6 = mutableState5;
                        final int i16 = 1;
                        objRememberedValue4 = new a() { // from class: x3.u5
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        mutableState6.setValue(c2503i3.f15167a);
                                        break;
                                    default:
                                        mutableState6.setValue(c2503i3.f15167a);
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        mutableState6 = mutableState5;
                        final int i17 = 1;
                        objRememberedValue4 = new a() { // from class: x3.u5
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        mutableState6.setValue(c2503i3.f15167a);
                                        break;
                                    default:
                                        mutableState6.setValue(c2503i3.f15167a);
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    AbstractC2535k.a(c2503i3, zB6, (a) objRememberedValue4, RowScope.weight$default(rowScopeInstance2, Modifier.Companion, 1.0f, false, 2, null), composer2, 0);
                    mutableState5 = mutableState6;
                }
                composer2.endReplaceGroup();
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, Modifier.Companion, 0.5f, false, 2, null), composer2, 0);
                composer2.endNode();
                composer2.endNode();
            } else {
                i6 = 2;
            }
            composer2.endReplaceGroup();
            companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default6 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f7), 0.0f, i6, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f10)), Alignment.Companion.getStart(), composer2, 6);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierM670paddingVpY3zN4$default6);
            ComposeUiNode.Companion companion13 = ComposeUiNode.Companion;
            constructor = companion13.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
            eVarG = p035i0.a.g(companion13, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl, currentCompositionLocalMap11);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier11, companion13.getSetModifier());
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            if (((String) mutableState3.getValue()).length() > 0) {
                composer2.startReplaceGroup(733495280);
                if (list3.isEmpty()) {
                    composer2.startReplaceGroup(733510284);
                    j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(454472314, true, new A5(mutableState3), composer2, 54), composer2, 196614, 30);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(734051141);
                    while (r2.hasNext()) {
                        str = (String) entry.getKey();
                        List<C2413c5> list7 = (List) entry.getValue();
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!((C2503i) next).f15167a.equals(str));
                        c2503i = (C2503i) next;
                        if (c2503i != null) {
                            str = c2503i.f15168b;
                        }
                        TextKt.m2432Text4IGK_g(str, PaddingKt.m669paddingVpY3zN4(Modifier.Companion, Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(4)), p107y3.a.p, 0L, (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleSmall(), composer2, 197040, 0, 65496);
                        composer2.startReplaceGroup(23698985);
                        while (r3.hasNext()) {
                            boolean zB7 = o.b((String) mutableState10.getValue(), c2413c6.f14860a);
                            composer2.startReplaceGroup(-2047736410);
                            zChanged2 = composer2.changed(c2413c6);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2) {
                                mutableState4 = mutableState10;
                                i7 = 0;
                                objRememberedValue3 = new a() { // from class: x3.v5
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i7) {
                                            case 0:
                                                MutableState mutableState11 = mutableState4;
                                                String str6 = (String) mutableState11.getValue();
                                                C2413c5 c2413c8 = c2413c6;
                                                mutableState11.setValue(o.b(str6, c2413c8.f14860a) ? null : c2413c8.f14860a);
                                                break;
                                            default:
                                                MutableState mutableState12 = mutableState4;
                                                String str7 = (String) mutableState12.getValue();
                                                C2413c5 c2413c9 = c2413c6;
                                                mutableState12.setValue(o.b(str7, c2413c9.f14860a) ? null : c2413c9.f14860a);
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            } else {
                                mutableState4 = mutableState10;
                                i7 = 0;
                                objRememberedValue3 = new a() { // from class: x3.v5
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // O3.a
                                    public final Object invoke() {
                                        switch (i7) {
                                            case 0:
                                                MutableState mutableState11 = mutableState4;
                                                String str6 = (String) mutableState11.getValue();
                                                C2413c5 c2413c8 = c2413c6;
                                                mutableState11.setValue(o.b(str6, c2413c8.f14860a) ? null : c2413c8.f14860a);
                                                break;
                                            default:
                                                MutableState mutableState12 = mutableState4;
                                                String str7 = (String) mutableState12.getValue();
                                                C2413c5 c2413c9 = c2413c6;
                                                mutableState12.setValue(o.b(str7, c2413c9.f14860a) ? null : c2413c9.f14860a);
                                                break;
                                        }
                                        return B3.o.f154a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            a(c2413c6, zB7, (a) objRememberedValue3, composer2, i7);
                            mutableState10 = mutableState4;
                        }
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            } else {
                i6 = i6;
                composer2.startReplaceGroup(735088463);
                while (r2.hasNext()) {
                    boolean zB8 = o.b((String) mutableState10.getValue(), c2413c7.f14860a);
                    composer2.startReplaceGroup(983612519);
                    zChanged = composer2.changed(c2413c7);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged) {
                        final int i18 = 1;
                        objRememberedValue2 = new a() { // from class: x3.v5
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        MutableState mutableState11 = mutableState10;
                                        String str6 = (String) mutableState11.getValue();
                                        C2413c5 c2413c8 = c2413c7;
                                        mutableState11.setValue(o.b(str6, c2413c8.f14860a) ? null : c2413c8.f14860a);
                                        break;
                                    default:
                                        MutableState mutableState12 = mutableState10;
                                        String str7 = (String) mutableState12.getValue();
                                        C2413c5 c2413c9 = c2413c7;
                                        mutableState12.setValue(o.b(str7, c2413c9.f14860a) ? null : c2413c9.f14860a);
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        final int i19 = 1;
                        objRememberedValue2 = new a() { // from class: x3.v5
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // O3.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        MutableState mutableState11 = mutableState10;
                                        String str6 = (String) mutableState11.getValue();
                                        C2413c5 c2413c8 = c2413c7;
                                        mutableState11.setValue(o.b(str6, c2413c8.f14860a) ? null : c2413c8.f14860a);
                                        break;
                                    default:
                                        MutableState mutableState12 = mutableState10;
                                        String str7 = (String) mutableState12.getValue();
                                        C2413c5 c2413c9 = c2413c7;
                                        mutableState12.setValue(o.b(str7, c2413c9.f14860a) ? null : c2413c9.f14860a);
                                        break;
                                }
                                return B3.o.f154a;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    a(c2413c7, zB8, (a) objRememberedValue2, composer2, 0);
                }
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            Modifier.Companion companion14 = Modifier.Companion;
            b.m(f8, companion14, composer2, 6);
            cVar = onNavigate;
            j.a(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion14, 0.0f, 1, null), Dp.m6403constructorimpl(f7), 0.0f, i6, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1721436631, true, new C5(cVar), composer2, 54), composer2, 196614, 30);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion14, Dp.m6403constructorimpl(f8)), composer2, 6);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion2;
            composer3 = composer2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2292j(modifier2, cVar, i5));
        }
    }
}

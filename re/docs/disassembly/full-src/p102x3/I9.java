package p102x3;

import K2.b;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ArchiveKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class I9 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f14089o;
    public final /* synthetic */ File p;

    public I9(Context context, File file) {
        this.f14089o = context;
        this.p = file;
    }

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
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1152661365, iIntValue, -1, "com.notescrafter.ui.screens.PdfToJpgScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfToJpgScreen.kt:409)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(ArchiveKt.getArchive(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(32)), p107y3.a.f15978a, composer, 3504, 0);
            androidx.compose.foundation.text.modifiers.a.q(f5, companion, composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            a constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            final File file = this.p;
            String name = file.getName();
            o.e(name, "getName(...)");
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
            TextKt.m2432Text4IGK_g(name, (Modifier) null, p107y3.a.f15990o, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodyMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodyMedium.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodyMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodyMedium.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (16645977 & 8) != 0 ? bodyMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodyMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodyMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodyMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodyMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodyMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodyMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodyMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodyMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodyMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodyMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodyMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodyMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodyMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodyMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodyMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodyMedium.platformStyle : null, (16645977 & 1048576) != 0 ? bodyMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodyMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodyMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodyMedium.paragraphStyle.getTextMotion() : null), composer, 384, 3120, 55290);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(4)), composer, 6);
            TextKt.m2432Text4IGK_g("ZIP Archive • ".concat(Z9.d(file.length())), (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 384, 0, 65530);
            composer.endNode();
            composer.startReplaceGroup(1597527630);
            final Context context = this.f14089o;
            boolean zChangedInstance = composer.changedInstance(context) | composer.changedInstance(file);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                final int i6 = 0;
                objRememberedValue = new a() { // from class: x3.H9
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                Context context2 = context;
                                try {
                                    ContentResolver contentResolver = context2.getContentResolver();
                                    int i7 = Build.VERSION.SDK_INT;
                                    File file2 = file;
                                    if (i7 >= 29) {
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("_display_name", file2.getName());
                                        contentValues.put("mime_type", "application/zip");
                                        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                                        Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                                        if (uriInsert != null) {
                                            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                                            if (outputStreamOpenOutputStream != null) {
                                                try {
                                                    FileInputStream fileInputStream = new FileInputStream(file2);
                                                    try {
                                                        b.d(fileInputStream, outputStreamOpenOutputStream);
                                                        Q3.a.l(fileInputStream, null);
                                                        Q3.a.l(outputStreamOpenOutputStream, null);
                                                    } catch (Throwable th) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            Q3.a.l(fileInputStream, th);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } catch (Throwable th4) {
                                                        Q3.a.l(outputStreamOpenOutputStream, th3);
                                                        throw th4;
                                                    }
                                                }
                                            }
                                        } else {
                                            Toast.makeText(context2, "Failed to save to Downloads. Use Share instead.", 1).show();
                                        }
                                        return B3.o.f154a;
                                    }
                                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                    if (!externalStoragePublicDirectory.exists()) {
                                        externalStoragePublicDirectory.mkdirs();
                                    }
                                    File file3 = new File(externalStoragePublicDirectory, file2.getName());
                                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            b.d(fileInputStream2, fileOutputStream);
                                            Q3.a.l(fileOutputStream, null);
                                            Q3.a.l(fileInputStream2, null);
                                        } catch (Throwable th5) {
                                            try {
                                                throw th5;
                                            } catch (Throwable th6) {
                                                Q3.a.l(fileOutputStream, th5);
                                                throw th6;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            throw th7;
                                        } catch (Throwable th8) {
                                            Q3.a.l(fileInputStream2, th7);
                                            throw th8;
                                        }
                                    }
                                    Toast.makeText(context2, "Saved to Downloads folder!", 0).show();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    Toast.makeText(context2, "Failed to save to Downloads. Use Share instead.", 1).show();
                                }
                                return B3.o.f154a;
                            default:
                                Context context3 = context;
                                File file4 = file;
                                try {
                                    Uri uriD = FileProvider.d(context3, context3.getPackageName() + ".provider", file4);
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("application/zip");
                                    intent.putExtra("android.intent.extra.STREAM", uriD);
                                    intent.addFlags(1);
                                    context3.startActivity(Intent.createChooser(intent, "Share ZIP"));
                                    break;
                                } catch (Exception unused) {
                                    Toast.makeText(context3, "Error sharing file", 0).show();
                                }
                                return B3.o.f154a;
                        }
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            float f6 = 36;
            Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f6)), RoundedCornerShapeKt.getCircleShape());
            Color.Companion companion4 = Color.Companion;
            IconButtonKt.IconButton((a) objRememberedValue, BackgroundKt.m207backgroundbw27NRU$default(modifierClip, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, W1.f14556b, composer, 196608, 28);
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(8)), composer, 6);
            composer.startReplaceGroup(1597573363);
            boolean zChangedInstance2 = composer.changedInstance(context) | composer.changedInstance(file);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                final int i7 = 1;
                objRememberedValue2 = new a() { // from class: x3.H9
                    @Override // O3.a
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                Context context2 = context;
                                try {
                                    ContentResolver contentResolver = context2.getContentResolver();
                                    int i8 = Build.VERSION.SDK_INT;
                                    File file2 = file;
                                    if (i8 >= 29) {
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("_display_name", file2.getName());
                                        contentValues.put("mime_type", "application/zip");
                                        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                                        Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                                        if (uriInsert != null) {
                                            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                                            if (outputStreamOpenOutputStream != null) {
                                                try {
                                                    FileInputStream fileInputStream = new FileInputStream(file2);
                                                    try {
                                                        b.d(fileInputStream, outputStreamOpenOutputStream);
                                                        Q3.a.l(fileInputStream, null);
                                                        Q3.a.l(outputStreamOpenOutputStream, null);
                                                    } catch (Throwable th) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            Q3.a.l(fileInputStream, th);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } catch (Throwable th4) {
                                                        Q3.a.l(outputStreamOpenOutputStream, th3);
                                                        throw th4;
                                                    }
                                                }
                                            }
                                        } else {
                                            Toast.makeText(context2, "Failed to save to Downloads. Use Share instead.", 1).show();
                                        }
                                        return B3.o.f154a;
                                    }
                                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                    if (!externalStoragePublicDirectory.exists()) {
                                        externalStoragePublicDirectory.mkdirs();
                                    }
                                    File file3 = new File(externalStoragePublicDirectory, file2.getName());
                                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            b.d(fileInputStream2, fileOutputStream);
                                            Q3.a.l(fileOutputStream, null);
                                            Q3.a.l(fileInputStream2, null);
                                        } catch (Throwable th5) {
                                            try {
                                                throw th5;
                                            } catch (Throwable th6) {
                                                Q3.a.l(fileOutputStream, th5);
                                                throw th6;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            throw th7;
                                        } catch (Throwable th8) {
                                            Q3.a.l(fileInputStream2, th7);
                                            throw th8;
                                        }
                                    }
                                    Toast.makeText(context2, "Saved to Downloads folder!", 0).show();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    Toast.makeText(context2, "Failed to save to Downloads. Use Share instead.", 1).show();
                                }
                                return B3.o.f154a;
                            default:
                                Context context3 = context;
                                File file4 = file;
                                try {
                                    Uri uriD = FileProvider.d(context3, context3.getPackageName() + ".provider", file4);
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("application/zip");
                                    intent.putExtra("android.intent.extra.STREAM", uriD);
                                    intent.addFlags(1);
                                    context3.startActivity(Intent.createChooser(intent, "Share ZIP"));
                                    break;
                                } catch (Exception unused) {
                                    Toast.makeText(context3, "Error sharing file", 0).show();
                                }
                                return B3.o.f154a;
                        }
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            IconButtonKt.IconButton((a) objRememberedValue2, BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f6)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), false, null, null, W1.f14557c, composer, 196608, 28);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}

package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.app.R;
import java.util.List;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.C2290i;
import p083t3.C2292j;
import p097w3.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(a onContactClick, Modifier modifier, Composer composer, int i5) {
        Composer composer2;
        Modifier modifier2;
        o.f(onContactClick, "onContactClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-186314473);
        int i6 = ((i5 & 6) == 0 ? (composerStartRestartGroup.changedInstance(onContactClick) ? 4 : 2) | i5 : i5) | 48;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-186314473, i6, -1, "com.notescrafter.ui.screens.CommunityScreen (CommunityScreen.kt:88)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            List<C2646qe> listS = v.S(new C2646qe("Telegram", "Join our Telegram group for instant updates and community chat", new C2630pe(R.drawable.ic_telegram_glyph), "https://t.me/notescrafter", "org.telegram.messenger", ColorKt.Color(4284524026L), ColorKt.Color(4282090230L), ColorKt.Color(4284524026L)), new C2646qe("YouTube", "Subscribe for tutorials, demos, and feature showcases", new C2630pe(R.drawable.ic_youtube_glyph), "https://youtube.com/@NotesCrafterApp", "com.google.android.youtube", ColorKt.Color(4292617766L), ColorKt.Color(4290321436L), ColorKt.Color(4292617766L)), new C2646qe("Discord", "Join our Discord community to chat with the team and other users", new C2630pe(R.drawable.ic_discord_glyph), "https://discord.gg/bKU7Fw53Hp", "com.discord", ColorKt.Color(4283983346L), ColorKt.Color(4282864324L), ColorKt.Color(4283983346L)), new C2646qe("Twitter/X", "Follow us on Twitter for the latest updates and announcements", new C2630pe(R.drawable.ic_x_glyph), "https://x.com/notescrafter", "com.twitter.android", ColorKt.Color(4281811281L), ColorKt.Color(4279310375L), ColorKt.Color(4285231744L)), new C2646qe("Reddit", "Join discussions and share feedback with our Reddit community", new C2630pe(R.drawable.ic_reddit_glyph), "https://reddit.com/r/NotesCrafter", "com.reddit.frontpage", ColorKt.Color(4294538006L), ColorKt.Color(4293548044L), ColorKt.Color(4294538006L)), new C2646qe("Instagram", "Follow us on Instagram for behind-the-scenes content and updates", new C2630pe(R.drawable.ic_instagram_glyph), "https://instagram.com/notescrafterapp", "com.instagram.android", ColorKt.Color(4293675161L), ColorKt.Color(4294538006L), ColorKt.Color(4293675161L)));
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null), Dp.m6403constructorimpl(24), Dp.m6403constructorimpl(32));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("Join Our ");
            int iPushStyle = builder.pushStyle(new SpanStyle(Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4290807036L)), Color.m3917boximpl(ColorKt.Color(4283385573L))), 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 131070, null));
            try {
                builder.append("Community");
                builder.pop(iPushStyle);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i7 = MaterialTheme.$stable;
                TextStyle displaySmall = materialTheme.getTypography(composerStartRestartGroup, i7).getDisplaySmall();
                FontWeight extraBold = FontWeight.Companion.getExtraBold();
                long j5 = p107y3.a.f15990o;
                TextAlign.Companion companion3 = TextAlign.Companion;
                TextKt.m2433TextIbK3jfQ(annotatedString, null, j5, 0L, null, extraBold, null, 0L, null, TextAlign.m6285boximpl(companion3.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, displaySmall, composerStartRestartGroup, 196992, 0, 130522);
                float f5 = 16;
                b.m(f5, companion, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("Connect with us on your favorite platforms. Get updates, share feedback, and be part of the NotesCrafter community.", PaddingKt.m670paddingVpY3zN4$default(companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion3.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composerStartRestartGroup, i7).getBodyLarge(), composerStartRestartGroup, 438, 0, 65016);
                float f6 = 48;
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(493471747);
                for (C2646qe c2646qe : listS) {
                    composerStartRestartGroup.startReplaceGroup(-750128052);
                    boolean zChanged = composerStartRestartGroup.changed(c2646qe) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new C2290i(4, c2646qe, context);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    c(c2646qe, (a) objRememberedValue, composerStartRestartGroup, 0);
                    b.m(f5, Modifier.Companion, composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.Companion;
                b.m(f6, companion4, composerStartRestartGroup, 6);
                j.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0L, 0L, 0.0f, null, B.f13784a, composerStartRestartGroup, 196614, 30);
                b.m(f6, companion4, composerStartRestartGroup, 6);
                TextKt.m2432Text4IGK_g("Have questions or want to get in touch directly?", PaddingKt.m672paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 7, null), p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, 438, 0, 65528);
                composer2 = composerStartRestartGroup;
                ButtonKt.OutlinedButton(onContactClick, SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(50)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(12)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), p107y3.a.f15990o, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, B.f13785b, composerStartRestartGroup, (i6 & 14) | 806879280, 420);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(100)), composer2, 6);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2599o(onContactClick, modifier2, i5, 0));
        }
    }

    public static final void b(final long j5, String str, Composer composer, int i5) {
        int i6;
        Composer composer2;
        final String str2;
        final int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1637802608);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(j5) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i8 = i6;
        if ((i8 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            str2 = str;
            i7 = i5;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1637802608, i8, -1, "com.notescrafter.ui.screens.CommunityStat (CommunityScreen.kt:369)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f5 = 8;
            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), RoundedCornerShapeKt.getCircleShape()), j5, null, 2, null), composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            str2 = str;
            i7 = i5;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, p107y3.a.q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, ((i8 >> 3) & 14) | 384, 0, 65530);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e() { // from class: x3.p
                @Override // O3.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i7 | 1);
                    r.b(j5, str2, (Composer) obj, iUpdateChangedFlags);
                    return B3.o.f154a;
                }
            });
        }
    }

    public static final void c(C2646qe link, a onClick, Composer composer, int i5) {
        int i6;
        o.f(link, "link");
        o.f(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(108473171);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(link) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(108473171, i6, -1, "com.notescrafter.ui.screens.SocialCard (CommunityScreen.kt:308)");
            }
            j.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(link.f15462h, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), p107y3.a.t, 0.0f, onClick, ComposableLambdaKt.rememberComposableLambda(1065376846, true, new C2631q(link), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 << 9) & 57344) | 196998, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2292j(i5, 3, link, onClick));
        }
    }
}

package p082t2;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: t2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2268x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final F f12886A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final F f12887A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final F f12888B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final F f12889B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final F f12890C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final F f12891C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final F f12892D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final F f12893D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final F f12894E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final F f12895E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final F f12896F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final F f12897F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final F f12898G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final F f12899G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final F f12900H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final F f12901H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final F f12902I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final F f12903I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final F f12904J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final F f12905J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final F f12906K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final F f12907K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final F f12908L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final F f12909L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final F f12910M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final F f12911M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final F f12912N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final F f12913N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final F f12914O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final F f12915O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final F f12916P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public static final F f12917P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final F f12918Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public static final F f12919Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final F f12920R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static final F f12921R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final F f12922S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static final F f12923S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final F f12924T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static final F f12925T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final F f12926U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final F f12927U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final F f12928V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final F f12929W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final F f12930X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final F f12931Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final F f12932Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final F f12934a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final F f12936b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final F f12938c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final F f12940d0;
    public static final F e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final F f12941e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F f12942f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final F f12943f0;
    public static final F g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final F f12944g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F f12945h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final F f12946h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final F f12947i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final F f12948i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final F f12949j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final F f12950j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F f12951k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final F f12952k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final F f12953l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final F f12954l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final F f12955m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final F f12956m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final F f12957n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final F f12958n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final F f12959o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final F f12960o0;
    public static final F p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final F f12961p0;
    public static final F q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final F f12962q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final F f12963r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final F f12964r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final F f12965s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final F f12966s0;
    public static final F t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final F f12967t0;
    public static final F u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final F f12968u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final F f12969v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final F f12970v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final F f12971w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final F f12972w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final F f12973x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final F f12974x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final F f12975y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final F f12976y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final F f12977z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final F f12978z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f12933a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f12935b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F f12937c = a("measurement.ad_id_cache_time", 10000L, 10000L, C2233f.f12643d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f12939d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, C2233f.f12645h);

    static {
        Long lValueOf = Long.valueOf(CalendarModelKt.MillisecondsIn24Hours);
        e = a("measurement.monitoring.sample_period_millis", lValueOf, lValueOf, C2233f.t);
        f12942f = a("measurement.config.cache_time", lValueOf, 3600000L, C2272z.f12987b);
        g = a("measurement.config.url_scheme", "https", "https", C2272z.f12997n);
        f12945h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C2272z.f13005z);
        f12947i = a("measurement.upload.max_bundles", 100, 100, A.f12396h);
        f12949j = a("measurement.upload.max_batch_size", 65536, 65536, A.t);
        f12951k = a("measurement.upload.max_bundle_size", 65536, 65536, C.f12415b);
        f12953l = a("measurement.upload.max_events_per_bundle", 1000, 1000, C2233f.f12644f);
        Integer numValueOf = Integer.valueOf(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        f12955m = a("measurement.upload.max_events_per_day", numValueOf, numValueOf, C2233f.p);
        f12957n = a("measurement.upload.max_error_events_per_day", 1000, 1000, C2233f.f12658y);
        f12959o = a("measurement.upload.max_public_events_per_day", 50000, 50000, C2272z.f12991h);
        p = a("measurement.upload.max_conversions_per_day", 10000, 10000, C2272z.q);
        q = a("measurement.upload.max_realtime_events_per_day", 10, 10, C2272z.f12985D);
        f12963r = a("measurement.store.max_stored_events_per_app", numValueOf, numValueOf, A.f12397i);
        f12965s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", A.f12406v);
        t = a("measurement.upload.backoff_period", 43200000L, 43200000L, A.f12391E);
        a("measurement.upload.window_interval", 3600000L, 3600000L, C2233f.f12642c);
        u = a("measurement.upload.interval", 3600000L, 3600000L, C2233f.e);
        f12969v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C2233f.g);
        f12971w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, C2233f.f12647j);
        f12973x = a("measurement.upload.minimum_delay", 500L, 500L, C2233f.f12646i);
        f12975y = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C2233f.f12649l);
        f12977z = a("measurement.upload.stale_data_deletion_interval", lValueOf, lValueOf, C2233f.f12648k);
        f12886A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C2233f.f12651n);
        f12888B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C2233f.f12650m);
        f12890C = a("measurement.upload.retry_time", 1800000L, 1800000L, C2233f.f12652o);
        f12892D = a("measurement.upload.retry_count", 6, 6, C2233f.f12653r);
        f12894E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C2233f.q);
        f12896F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C2233f.f12654s);
        Integer numValueOf2 = Integer.valueOf(ComposerKt.invocationKey);
        f12898G = a("measurement.audience.filter_result_max_count", numValueOf2, numValueOf2, C2233f.f12655v);
        f12900H = a("measurement.upload.max_public_user_properties", 25, 25, null);
        f12902I = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        f12904J = a("measurement.upload.max_public_event_params", 25, 25, null);
        f12906K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C2233f.u);
        Boolean bool = Boolean.FALSE;
        f12908L = a("measurement.test.boolean_flag", bool, bool, C2233f.f12657x);
        f12910M = a("measurement.test.string_flag", "---", "---", C2233f.f12656w);
        f12912N = a("measurement.test.long_flag", -1L, -1L, C2233f.f12659z);
        f12914O = a("measurement.test.int_flag", -2, -2, C2233f.f12637B);
        Double dValueOf = Double.valueOf(-3.0d);
        f12916P = a("measurement.test.double_flag", dValueOf, dValueOf, C2233f.f12636A);
        f12918Q = a("measurement.experiment.max_ids", 50, 50, C2233f.f12639D);
        f12920R = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, C2233f.f12638C);
        f12922S = a("measurement.upload.max_event_parameter_value_length", 100, 100, C2233f.f12640E);
        f12924T = a("measurement.max_bundles_per_iteration", 100, 100, C2272z.f12989d);
        f12926U = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C2272z.f12988c);
        f12928V = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, C2272z.f12990f);
        f12929W = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, C2272z.e);
        f12930X = a("measurement.rb.attribution.uri_scheme", "https", "https", C2272z.g);
        f12931Y = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", C2272z.f12993j);
        f12932Z = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", C2272z.f12992i);
        f12934a0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots", C2272z.f12995l);
        f12936b0 = a("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", C2272z.f12994k);
        f12938c0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", C2272z.f12996m);
        f12940d0 = a("measurement.rb.attribution.query_parameters_to_remove", "", "", C2272z.p);
        Boolean bool2 = Boolean.TRUE;
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C2272z.f12998o);
        f12941e0 = a("measurement.quality.checksum", bool, bool, null);
        f12943f0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C2272z.f12999r);
        f12944g0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C2272z.t);
        f12946h0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C2272z.f13000s);
        f12948i0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C2272z.f13001v);
        f12950j0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, C2272z.u);
        f12952k0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, C2272z.f13003x);
        f12954l0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C2272z.f13002w);
        f12956m0 = a("measurement.service.storage_consent_support_version", 203600, 203600, C2272z.f13004y);
        f12958n0 = a("measurement.service.store_null_safelist", bool2, bool2, C2272z.f12983B);
        f12960o0 = a("measurement.service.store_safelist", bool2, bool2, C2272z.f12982A);
        f12961p0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, C2272z.f12984C);
        f12962q0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, A.f12392b);
        f12964r0 = a("measurement.session_stitching_token_enabled", bool, bool, C2272z.f12986E);
        a("measurement.sgtm.client.dev", bool, bool, A.f12394d);
        f12966s0 = a("measurement.sgtm.service", bool, bool, A.f12393c);
        f12967t0 = a("measurement.sgtm.preview_mode_enabled.dev", bool, bool, A.f12395f);
        f12968u0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, A.e);
        a("measurement.redaction.scion_payload_generator", bool2, bool2, A.g);
        f12970v0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, A.f12398j);
        f12972w0 = a("measurement.sfmc.client", bool2, bool2, A.f12400l);
        a("measurement.sfmc.service", bool2, bool2, A.f12399k);
        f12974x0 = a("measurement.gmscore_feature_tracking", bool2, bool2, A.f12402n);
        f12976y0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, A.f12401m);
        f12978z0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, A.p);
        f12887A0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, A.f12403o);
        f12889B0 = a("measurement.remove_app_background.client", bool, bool, A.f12404r);
        f12891C0 = a("measurement.rb.attribution.service", bool2, bool2, A.q);
        f12893D0 = a("measurement.rb.attribution.client2", bool2, bool2, A.f12405s);
        f12895E0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, A.u);
        f12897F0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, A.f12408x);
        a("measurement.rb.attribution.followup1.service", bool, bool, A.f12407w);
        f12899G0 = a("measurement.rb.attribution.dma_fix", bool, bool, A.f12410z);
        f12901H0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, A.f12409y);
        f12903I0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, A.f12388B);
        f12905J0 = a("measurement.dma_consent.client", bool2, bool2, A.f12387A);
        f12907K0 = a("measurement.dma_consent.service", bool2, bool2, A.f12390D);
        f12909L0 = a("measurement.dma_consent.client_bow_check2", bool, bool, A.f12389C);
        f12911M0 = a("measurement.dma_consent.service_gcs_v2", bool, bool, C.f12417d);
        f12913N0 = a("measurement.dma_consent.service_npa_remote_default", bool, bool, C.f12416c);
        f12915O0 = a("measurement.dma_consent.service_split_batch_on_consent", bool2, bool2, C.f12418f);
        f12917P0 = a("measurement.service.deferred_first_open", bool2, bool2, C.e);
        f12919Q0 = a("measurement.gbraid_campaign.gbraid.client.dev", bool, bool, C.f12419h);
        a("measurement.gbraid_campaign.gbraid.service", bool, bool, C.g);
        f12921R0 = a("measurement.increase_param_lengths", bool, bool, C.f12421j);
        f12923S0 = a("measurement.disable_npa_for_dasher_and_unicorn", bool, bool, C.f12420i);
        f12925T0 = a("measurement.tcf.client.dev", bool, bool, C.f12423l);
        f12927U0 = a("measurement.tcf.service", bool, bool, C.f12422k);
    }

    public static F a(String str, Object obj, Object obj2, E e3) {
        F f5 = new F(str, obj, obj2, e3);
        f12933a.add(f5);
        return f5;
    }
}

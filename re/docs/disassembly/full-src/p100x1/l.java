package p100x1;

import S1.r;
import T1.K;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1869x7;
import com.google.android.gms.internal.ads.C0809Sd;
import com.google.android.gms.internal.ads.C0935bt;
import com.google.android.gms.internal.ads.K3;
import com.google.android.gms.internal.ads.L3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p070q0.a;
import p070q0.d;
import p070q0.e;
import p080t0.b;
import p090v1.C2366q;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements K3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f13710o;

    public /* synthetic */ l(Object obj) {
        this.f13710o = obj;
    }

    public static void a(b bVar) {
        bVar.p("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.p("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.p("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static K b(b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new a(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new p070q0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new p070q0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
        hashSet2.add(new d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
        e eVar = new e("Dependency", map, hashSet, hashSet2);
        e eVarA = e.a(bVar, "Dependency");
        if (!eVar.equals(eVarA)) {
            return new K(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new a(1, 1, "id", "TEXT", null, true));
        map2.put("state", new a(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new a(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new a(0, 1, "input_merger_class_name", "TEXT", null, false));
        map2.put("input", new a(0, 1, "input", "BLOB", null, true));
        map2.put("output", new a(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new a(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new a(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new a(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new a(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new a(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("period_start_time", new a(0, 1, "period_start_time", "INTEGER", null, true));
        map2.put("minimum_retention_duration", new a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new a(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("required_network_type", new a(0, 1, "required_network_type", "INTEGER", null, false));
        map2.put("requires_charging", new a(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new a(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new a(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
        hashSet4.add(new d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
        e eVar2 = new e("WorkSpec", map2, hashSet3, hashSet4);
        e eVarA2 = e.a(bVar, "WorkSpec");
        if (!eVar2.equals(eVarA2)) {
            return new K(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new a(1, 1, "tag", "TEXT", null, true));
        map3.put("work_spec_id", new a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new p070q0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
        e eVar3 = new e("WorkTag", map3, hashSet5, hashSet6);
        e eVarA3 = e.a(bVar, "WorkTag");
        if (!eVar3.equals(eVarA3)) {
            return new K(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new a(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("system_id", new a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new p070q0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar4 = new e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        e eVarA4 = e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(eVarA4)) {
            return new K(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new a(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new p070q0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
        e eVar5 = new e("WorkName", map5, hashSet8, hashSet9);
        e eVarA5 = e.a(bVar, "WorkName");
        if (!eVar5.equals(eVarA5)) {
            return new K(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new a(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put("progress", new a(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new p070q0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar6 = new e("WorkProgress", map6, hashSet10, new HashSet(0));
        e eVarA6 = e.a(bVar, "WorkProgress");
        if (!eVar6.equals(eVarA6)) {
            return new K(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new a(1, 1, "key", "TEXT", null, true));
        map7.put("long_value", new a(0, 1, "long_value", "INTEGER", null, false));
        e eVar7 = new e("Preference", map7, new HashSet(0), new HashSet(0));
        e eVarA7 = e.a(bVar, "Preference");
        if (eVar7.equals(eVarA7)) {
            return new K(true, (String) null);
        }
        return new K(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7);
    }

    @Override // com.google.android.gms.internal.ads.K3
    public void c(L3 l5) {
        ((C0809Sd) this.f13710o).c(l5);
    }

    public void d(C0935bt c0935bt) {
        r rVar = (r) this.f13710o;
        rVar.getClass();
        String str = c0935bt.f6776b;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) C2366q.f13480d.f13483c.a(AbstractC1869x7.V9)).booleanValue()) {
                rVar.p = str;
            }
        }
        int i5 = c0935bt.f6775a;
        switch (i5) {
            case 8152:
                rVar.c("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                rVar.c("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                rVar.c("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                rVar.p = null;
                rVar.q = null;
                rVar.f1191o = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(i5));
                rVar.c("onLMDOverlayFailedToOpen", map);
                break;
        }
    }
}

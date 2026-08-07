package p109z0;

import p066p0.a;
import p080t0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i5, int i6, int i7) {
        super(i5, i6);
        this.f16045c = i7;
    }

    @Override // p066p0.a
    public final void a(b bVar) {
        switch (this.f16045c) {
            case 0:
                bVar.p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.p("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
                bVar.p("DROP TABLE IF EXISTS alarmInfo");
                bVar.p("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
                break;
            case 1:
                bVar.p("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
                break;
            case 2:
                bVar.p("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                bVar.p("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 3:
                bVar.p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                break;
            case 4:
                bVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
                break;
            case 5:
                bVar.p("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                bVar.p("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
        }
    }
}

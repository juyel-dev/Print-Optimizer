package p070q0;

import androidx.compose.foundation.text.modifiers.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12305d;
    public final List e;

    public b(String str, String str2, String str3, List list, List list2) {
        this.f12302a = str;
        this.f12303b = str2;
        this.f12304c = str3;
        this.f12305d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12302a.equals(bVar.f12302a) && this.f12303b.equals(bVar.f12303b) && this.f12304c.equals(bVar.f12304c) && this.f12305d.equals(bVar.f12305d)) {
            return this.e.equals(bVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.f12305d.hashCode() + a.c(a.c(this.f12302a.hashCode() * 31, 31, this.f12303b), 31, this.f12304c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f12302a + "', onDelete='" + this.f12303b + "', onUpdate='" + this.f12304c + "', columnNames=" + this.f12305d + ", referenceColumnNames=" + this.e + '}';
    }
}

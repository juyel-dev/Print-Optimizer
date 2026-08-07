package p098x;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i5) {
        return builder.setContentType(i5);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i5) {
        return builder.setUsage(i5);
    }
}

package p105y1;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f15971b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f15970a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15972c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        Object obj = f15972c;
        synchronized (obj) {
            HashMap map = f15970a;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (f15971b == null) {
                            f15971b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : f15971b) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap map2 = new HashMap();
                                map2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                map2.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                map2.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                map2.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                map2.put("widths", b(videoCapabilities.getSupportedWidths()));
                                map2.put("heights", b(videoCapabilities.getSupportedHeights()));
                                map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(map2);
                            }
                        }
                        f15970a.put(str, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return arrayList;
            } catch (LinkageError e) {
                e = e;
                HashMap map3 = new HashMap();
                map3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                f15970a.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e3) {
                e = e3;
                HashMap map4 = new HashMap();
                map4.put("error", e.getClass().getSimpleName());
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(map4);
                f15970a.put(str, arrayList4);
                return arrayList4;
            }
        }
    }

    public static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}

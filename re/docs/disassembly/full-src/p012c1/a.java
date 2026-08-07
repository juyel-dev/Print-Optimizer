package p012c1;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p007b1.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2536c = Q3.a.G("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f2537d;
    public static final a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2539b;

    static {
        String strG = Q3.a.G("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strG2 = Q3.a.G("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f2537d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        e = new a(strG, strG2);
    }

    public a(String str, String str2) {
        this.f2538a = str;
        this.f2539b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}

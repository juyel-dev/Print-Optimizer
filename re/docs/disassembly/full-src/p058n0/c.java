package p058n0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.ads.AbstractC1421mz;
import com.google.android.gms.internal.ads.C0972cn;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p035i0.a;
import p046k2.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f11898a = new h(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f11899b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f11900c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f11901d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f11902f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f11903h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f11904i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f11905j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.g * 2) + 7) & (-8)) / 8) + (aVar.e * 2) + d(aVar.f11891a, aVar.f11892b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f11895f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f11902f)) {
            for (a aVar2 : aVarArr) {
                p(byteArrayOutputStream, aVar2, d(aVar2.f11891a, aVar2.f11892b, bArr));
                r(byteArrayOutputStream, aVar2);
                int[] iArr = aVar2.f11896h;
                int length2 = iArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr[i5];
                    u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                q(byteArrayOutputStream, aVar2);
            }
        } else {
            for (a aVar3 : aVarArr) {
                p(byteArrayOutputStream, aVar3, d(aVar3.f11891a, aVar3.f11892b, bArr));
            }
            for (a aVar4 : aVarArr) {
                r(byteArrayOutputStream, aVar4);
                int[] iArr2 = aVar4.f11896h;
                int length3 = iArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length3) {
                    int i10 = iArr2[i8];
                    u(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                q(byteArrayOutputStream, aVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : fileArrListFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f11903h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return a.p(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int i7 = inputStream.read(bArr, i6, i5 - i6);
            if (i7 < 0) {
                throw new IllegalStateException(AbstractC1421mz.h(i5, "Not enough bytes to read: "));
            }
            i6 += i7;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i5) {
        int[] iArr = new int[i5];
        int iM = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i6] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i5, int i6) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[Fields.CameraDistance];
            int i7 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i7 < i5) {
                int i8 = fileInputStream.read(bArr2);
                if (i8 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i5 + " bytes");
                }
                inflater.setInput(bArr2, 0, i8);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i6 - iInflate);
                    i7 += i8;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            if (i7 == i5) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i5 + " actual=" + i7);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = f11904i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f11905j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f11901d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i5, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i5 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i6] = (int) m(byteArrayInputStream, 2);
            strArr[i6] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            a aVar = aVarArr[i7];
            if (!aVar.f11892b.equals(strArr[i7])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i8 = iArr[i7];
            aVar.e = i8;
            aVar.f11896h = g(byteArrayInputStream, i8);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i5, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i5 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i7 = 0; i7 < aVarArr.length; i7++) {
                    if (aVarArr[i7].f11892b.equals(strSubstring)) {
                        aVar = aVarArr[i7];
                        break;
                    }
                }
            }
            if (aVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f11894d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f11903h)) {
                aVar.e = iM;
                aVar.f11896h = iArrG;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i5) throws IOException {
        byte[] bArrF = f(inputStream, i5);
        long j5 = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            j5 += ((long) (bArrF[i6] & 255)) << (i6 * 8);
        }
        return j5;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i5) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            aVarArr[i6] = new a(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i7 = 0; i7 < i5; i7++) {
            a aVar = aVarArr[i7];
            int iAvailable = byteArrayInputStream.available() - aVar.f11895f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = aVar.f11897i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f11896h = g(byteArrayInputStream, aVar.e);
            int i8 = aVar.g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = bitSetValueOf.get(i9) ? 2 : 0;
                if (bitSetValueOf.get(i9 + i8)) {
                    i10 |= 4;
                }
                if (i10 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i9), Integer.valueOf(i10 | num.intValue()));
                }
            }
        }
        return aVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        long j5;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f11901d;
        int i5 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                t(byteArrayOutputStream, aVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f11897i.size() * 4;
                    String strD = d(aVar.f11891a, aVar.f11892b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, aVar.f11896h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, aVar.f11893c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = aVar.f11897i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i6 : aVar.f11896h) {
                        u(byteArrayOutputStream, i6);
                    }
                }
                return true;
            }
            byte[] bArr5 = f11902f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                t(byteArrayOutputStream, aVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f11903h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String strD2 = d(aVar2.f11891a, aVar2.f11892b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = aVar2.f11897i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, aVar2.f11896h.length);
                t(byteArrayOutputStream, aVar2.f11893c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i7 : aVar2.f11896h) {
                    u(byteArrayOutputStream, i7);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, aVarArr.length);
            int i8 = 2;
            int i9 = 2;
            for (a aVar3 : aVarArr) {
                t(byteArrayOutputStream2, aVar3.f11893c, 4);
                t(byteArrayOutputStream2, aVar3.f11894d, 4);
                t(byteArrayOutputStream2, aVar3.g, 4);
                String strD3 = d(aVar3.f11891a, aVar3.f11892b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i9 = i9 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i9 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < aVarArr.length) {
                try {
                    a aVar4 = aVarArr[i10];
                    u(byteArrayOutputStream3, i10);
                    u(byteArrayOutputStream3, aVar4.e);
                    i11 = i11 + 4 + (aVar4.e * 2);
                    int[] iArr = aVar4.f11896h;
                    int length3 = iArr.length;
                    int i12 = i5;
                    while (i5 < length3) {
                        int i13 = iArr[i5];
                        u(byteArrayOutputStream3, i13 - i12);
                        i5++;
                        i12 = i13;
                    }
                    i10++;
                    i5 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i14];
                    Iterator it3 = aVar5.f11897i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream5, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            u(byteArrayOutputStream4, i14);
                            int length4 = byteArray3.length + i8 + byteArray4.length;
                            int i16 = i15 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream4, length4, 4);
                            u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i15 = i16 + length4;
                            i14++;
                            arrayList3 = arrayList4;
                            i8 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i15 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList2.add(jVar3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + ((long) (arrayList2.size() * 16));
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i17);
                int i18 = jVar4.f11914a;
                if (i18 == 1) {
                    j5 = 0;
                } else if (i18 == 2) {
                    j5 = 1;
                } else if (i18 == 3) {
                    j5 = 2;
                } else if (i18 == 4) {
                    j5 = 3;
                } else {
                    if (i18 != 5) {
                        throw null;
                    }
                    j5 = 4;
                }
                t(byteArrayOutputStream, j5, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = jVar4.f11915b;
                if (jVar4.f11916c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i17++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i19));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, aVar.e);
        t(byteArrayOutputStream, aVar.f11895f, 4);
        t(byteArrayOutputStream, aVar.f11893c, 4);
        t(byteArrayOutputStream, aVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        byte[] bArr = new byte[(((aVar.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f11897i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + aVar.g;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i5 = 0;
        for (Map.Entry entry : aVar.f11897i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i5);
                u(byteArrayOutputStream, 0);
                i5 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #2 {all -> 0x01a2, blocks: (B:98:0x0180, B:100:0x018c, B:111:0x01a5, B:112:0x01aa), top: B:235:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a5 A[Catch: all -> 0x01a2, TRY_ENTER, TryCatch #2 {all -> 0x01a2, blocks: (B:98:0x0180, B:100:0x018c, B:111:0x01a5, B:112:0x01aa), top: B:235:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01b7 A[Catch: IllegalStateException -> 0x019b, IOException -> 0x019d, FileNotFoundException -> 0x01a0, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x01a0, IOException -> 0x019d, IllegalStateException -> 0x019b, blocks: (B:96:0x0178, B:101:0x0196, B:120:0x01b7, B:118:0x01b4, B:117:0x01b1), top: B:276:0x0178 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f8 A[Catch: all -> 0x0207, TRY_LEAVE, TryCatch #24 {all -> 0x0207, blocks: (B:137:0x01ec, B:139:0x01f8, B:148:0x020a), top: B:261:0x01ec }] */
    /* JADX WARN: Code duplicated, block: B:148:0x020a A[Catch: all -> 0x0207, TRY_ENTER, TRY_LEAVE, TryCatch #24 {all -> 0x0207, blocks: (B:137:0x01ec, B:139:0x01f8, B:148:0x020a), top: B:261:0x01ec }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0228  */
    /* JADX WARN: Code duplicated, block: B:164:0x0234  */
    /* JADX WARN: Code duplicated, block: B:165:0x0238  */
    /* JADX WARN: Code duplicated, block: B:173:0x0254 A[Catch: all -> 0x0277, TRY_LEAVE, TryCatch #15 {all -> 0x0277, blocks: (B:170:0x024c, B:171:0x024e, B:173:0x0254), top: B:246:0x024c }] */
    /* JADX WARN: Code duplicated, block: B:216:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:219:0x02af  */
    /* JADX WARN: Code duplicated, block: B:224:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:235:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x023c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0178 A[EXC_TOP_SPLITTER, PHI: r6
  0x0178: PHI (r6v27 char) = (r6v26 char), (r6v34 char), (r6v31 char) binds: [B:91:0x016e, B:93:0x0172, B:94:0x0174] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void s(Context context, Executor executor, b bVar, boolean z3) throws Throwable {
        byte[] bArr;
        ?? A4;
        IOException iOException;
        int i5;
        a[] aVarArrL;
        a[] aVarArr;
        C0972cn c0972cn;
        b bVar2;
        a[] aVarArr2;
        ?? r6;
        byte[] bArr2;
        ?? r7;
        boolean z4;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i6;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i7;
        char c5;
        FileInputStream fileInputStreamA;
        boolean zEquals;
        ?? r11;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            ?? r15 = 1;
            if (!z3) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j5 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j5 == packageInfo.lastUpdateTime;
                            if (z5) {
                                bVar.a(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    i.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i8 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0972cn c0972cn2 = new C0972cn(assets, executor, bVar, name, file2);
            byte[] bArr5 = (byte[]) c0972cn2.f6850r;
            if (bArr5 == null) {
                c0972cn2.c(3, Integer.valueOf(i8));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                c0972cn2.c(4, null);
                            }
                            if (z4 || !z3) {
                                r11 = 0;
                            } else {
                                r11 = r15;
                            }
                            i.c(context, r11);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            c0972cn2.c(4, null);
                            z4 = false;
                        }
                        A4 = c0972cn2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e3) {
                        bVar.a(6, e3);
                        A4 = 0;
                    } catch (IOException e5) {
                        bVar.a(7, e5);
                        A4 = 0;
                    }
                    if (A4 != 0) {
                        try {
                            if (!Arrays.equals(bArr, f(A4, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            aVarArrL = l(A4, f(A4, 4), (String) c0972cn2.t);
                            try {
                                A4.close();
                                A4 = A4;
                            } catch (IOException e6) {
                                IOException iOException2 = e6;
                                bVar.a(7, iOException2);
                                A4 = iOException2;
                            }
                            c0972cn2.u = aVarArrL;
                        } catch (IOException e7) {
                            i5 = 7;
                            bVar.a(7, e7);
                            try {
                                A4.close();
                            } catch (IOException e8) {
                                iOException = e8;
                                bVar.a(i5, iOException);
                                aVarArrL = null;
                                A4 = A4;
                                c0972cn2.u = aVarArrL;
                                aVarArr = (a[]) c0972cn2.u;
                                if (aVarArr != null) {
                                    i7 = Build.VERSION.SDK_INT;
                                    A4 = 34;
                                    if (i7 > 34) {
                                        c0972cn = c0972cn2;
                                    } else {
                                        c5 = 24;
                                        if (i7 != 24) {
                                            c5 = 25;
                                            A4 = 25;
                                            c5 = 25;
                                            if (i7 != 25) {
                                                switch (i7) {
                                                    case 31:
                                                    case 32:
                                                    case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                                                    case 34:
                                                        try {
                                                            fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                                            if (fileInputStreamA != null) {
                                                                try {
                                                                    zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                                                    if (!zEquals) {
                                                                        throw new IllegalStateException("Invalid magic");
                                                                    }
                                                                    c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                                                    fileInputStreamA.close();
                                                                    c0972cn = c0972cn2;
                                                                    A4 = zEquals;
                                                                } catch (Throwable th4) {
                                                                    try {
                                                                        fileInputStreamA.close();
                                                                        throw th4;
                                                                    } catch (Throwable th5) {
                                                                        th4.addSuppressed(th5);
                                                                        throw th4;
                                                                    }
                                                                }
                                                            } else {
                                                                if (fileInputStreamA != null) {
                                                                    fileInputStreamA.close();
                                                                }
                                                                c0972cn = null;
                                                                A4 = c5;
                                                            }
                                                        } catch (FileNotFoundException e9) {
                                                            bVar.a(9, e9);
                                                        } catch (IOException e10) {
                                                            bVar.a(7, e10);
                                                        } catch (IllegalStateException e11) {
                                                            c0972cn2.u = null;
                                                            bVar.a(8, e11);
                                                        }
                                                        if (c0972cn == null) {
                                                            c0972cn = c0972cn2;
                                                        }
                                                        break;
                                                    default:
                                                        c0972cn = c0972cn2;
                                                        break;
                                                }
                                            } else {
                                                fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamA != null) {
                                                    zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                                    if (!zEquals) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                                    fileInputStreamA.close();
                                                    c0972cn = c0972cn2;
                                                    A4 = zEquals;
                                                } else {
                                                    if (fileInputStreamA != null) {
                                                        fileInputStreamA.close();
                                                    }
                                                    c0972cn = null;
                                                    A4 = c5;
                                                }
                                                if (c0972cn == null) {
                                                    c0972cn = c0972cn2;
                                                }
                                            }
                                        } else {
                                            fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                            if (fileInputStreamA != null) {
                                                zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                                if (!zEquals) {
                                                    throw new IllegalStateException("Invalid magic");
                                                }
                                                c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                                fileInputStreamA.close();
                                                c0972cn = c0972cn2;
                                                A4 = zEquals;
                                            } else {
                                                if (fileInputStreamA != null) {
                                                    fileInputStreamA.close();
                                                }
                                                c0972cn = null;
                                                A4 = c5;
                                            }
                                            if (c0972cn == null) {
                                                c0972cn = c0972cn2;
                                            }
                                        }
                                    }
                                } else {
                                    c0972cn = c0972cn2;
                                }
                                bVar2 = (b) c0972cn.q;
                                aVarArr2 = (a[]) c0972cn.u;
                                r6 = A4;
                                if (aVarArr2 != null) {
                                    if (!c0972cn.f6849o) {
                                        r6 = bArr4;
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        r6 = bArr4;
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (o(byteArrayOutputStream, bArr4, aVarArr2)) {
                                                c0972cn.f6852v = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                c0972cn.u = null;
                                                r6 = bArr4;
                                            } else {
                                                bVar2.a(5, null);
                                                c0972cn.u = null;
                                                byteArrayOutputStream.close();
                                                r6 = bArr4;
                                            }
                                        } catch (Throwable th6) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th6.addSuppressed(th7);
                                                throw th6;
                                            }
                                        }
                                    } catch (IOException e12) {
                                        bVar2.a(7, e12);
                                    } catch (IllegalStateException e13) {
                                        bVar2.a(8, e13);
                                    }
                                }
                                r6 = bArr4;
                                bArr2 = (byte[]) c0972cn.f6852v;
                                if (bArr2 == null) {
                                    z4 = false;
                                    r15 = 1;
                                } else {
                                    try {
                                        if (!c0972cn.f6849o) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                try {
                                                    fileOutputStream = new FileOutputStream((File) c0972cn.f6851s);
                                                    try {
                                                        try {
                                                            bArr3 = new byte[Fields.RotationY];
                                                            while (true) {
                                                                i6 = byteArrayInputStream.read(bArr3);
                                                                if (i6 > 0) {
                                                                    fileOutputStream.write(bArr3, 0, i6);
                                                                } else {
                                                                    r15 = 1;
                                                                    try {
                                                                        c0972cn.c(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        c0972cn.f6852v = null;
                                                                        c0972cn.u = null;
                                                                        z4 = true;
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th9) {
                                                                    th.addSuppressed(th9);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            Throwable th11 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th11;
                                                            } catch (Throwable th12) {
                                                                th11.addSuppressed(th12);
                                                                throw th11;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                            } catch (FileNotFoundException e14) {
                                                e = e14;
                                                c0972cn.c(6, e);
                                                r7 = r6;
                                                c0972cn.f6852v = null;
                                                c0972cn.u = null;
                                                z4 = false;
                                                r15 = r7;
                                            } catch (IOException e15) {
                                                e = e15;
                                                c0972cn.c(7, e);
                                                r7 = r6;
                                                c0972cn.f6852v = null;
                                                c0972cn.u = null;
                                                z4 = false;
                                                r15 = r7;
                                            }
                                        } catch (FileNotFoundException e16) {
                                            e = e16;
                                            r6 = 1;
                                            c0972cn.c(6, e);
                                            r7 = r6;
                                            c0972cn.f6852v = null;
                                            c0972cn.u = null;
                                            z4 = false;
                                            r15 = r7;
                                        } catch (IOException e17) {
                                            e = e17;
                                            r6 = 1;
                                            c0972cn.c(7, e);
                                            r7 = r6;
                                            c0972cn.f6852v = null;
                                            c0972cn.u = null;
                                            z4 = false;
                                            r15 = r7;
                                        }
                                    } catch (Throwable th15) {
                                        c0972cn.f6852v = null;
                                        c0972cn.u = null;
                                        throw th15;
                                    }
                                }
                                if (z4) {
                                    e(packageInfo, filesDir);
                                }
                                if (z4) {
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                }
                                i.c(context, r11);
                            }
                            aVarArrL = null;
                            A4 = A4;
                        } catch (IllegalStateException e18) {
                            try {
                                bVar.a(8, e18);
                                try {
                                    A4.close();
                                } catch (IOException e19) {
                                    iOException = e19;
                                    i5 = 7;
                                    bVar.a(i5, iOException);
                                    aVarArrL = null;
                                    A4 = A4;
                                    c0972cn2.u = aVarArrL;
                                    aVarArr = (a[]) c0972cn2.u;
                                    if (aVarArr != null) {
                                        i7 = Build.VERSION.SDK_INT;
                                        A4 = 34;
                                        if (i7 > 34) {
                                            c0972cn = c0972cn2;
                                        } else {
                                            c5 = 24;
                                            if (i7 != 24) {
                                                c5 = 25;
                                                A4 = 25;
                                                c5 = 25;
                                                if (i7 != 25) {
                                                    switch (i7) {
                                                        case 31:
                                                        case 32:
                                                        case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                                                        case 34:
                                                            fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                                            if (fileInputStreamA != null) {
                                                                zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                                                if (!zEquals) {
                                                                    throw new IllegalStateException("Invalid magic");
                                                                }
                                                                c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                                                fileInputStreamA.close();
                                                                c0972cn = c0972cn2;
                                                                A4 = zEquals;
                                                            } else {
                                                                if (fileInputStreamA != null) {
                                                                    fileInputStreamA.close();
                                                                }
                                                                c0972cn = null;
                                                                A4 = c5;
                                                            }
                                                            if (c0972cn == null) {
                                                                c0972cn = c0972cn2;
                                                            }
                                                            break;
                                                        default:
                                                            c0972cn = c0972cn2;
                                                            break;
                                                    }
                                                } else {
                                                    fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                                    if (fileInputStreamA != null) {
                                                        zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                                        if (!zEquals) {
                                                            throw new IllegalStateException("Invalid magic");
                                                        }
                                                        c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                                        fileInputStreamA.close();
                                                        c0972cn = c0972cn2;
                                                        A4 = zEquals;
                                                    } else {
                                                        if (fileInputStreamA != null) {
                                                            fileInputStreamA.close();
                                                        }
                                                        c0972cn = null;
                                                        A4 = c5;
                                                    }
                                                    if (c0972cn == null) {
                                                        c0972cn = c0972cn2;
                                                    }
                                                }
                                            } else {
                                                fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamA != null) {
                                                    zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                                    if (!zEquals) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                                    fileInputStreamA.close();
                                                    c0972cn = c0972cn2;
                                                    A4 = zEquals;
                                                } else {
                                                    if (fileInputStreamA != null) {
                                                        fileInputStreamA.close();
                                                    }
                                                    c0972cn = null;
                                                    A4 = c5;
                                                }
                                                if (c0972cn == null) {
                                                    c0972cn = c0972cn2;
                                                }
                                            }
                                        }
                                    } else {
                                        c0972cn = c0972cn2;
                                    }
                                    bVar2 = (b) c0972cn.q;
                                    aVarArr2 = (a[]) c0972cn.u;
                                    r6 = A4;
                                    if (aVarArr2 != null) {
                                        if (!c0972cn.f6849o) {
                                            r6 = bArr4;
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        r6 = bArr4;
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        byteArrayOutputStream.write(bArr);
                                        byteArrayOutputStream.write(bArr4);
                                        if (o(byteArrayOutputStream, bArr4, aVarArr2)) {
                                            bVar2.a(5, null);
                                            c0972cn.u = null;
                                            byteArrayOutputStream.close();
                                            r6 = bArr4;
                                        } else {
                                            c0972cn.f6852v = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            c0972cn.u = null;
                                            r6 = bArr4;
                                        }
                                    }
                                    r6 = bArr4;
                                    bArr2 = (byte[]) c0972cn.f6852v;
                                    if (bArr2 == null) {
                                        if (!c0972cn.f6849o) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        fileOutputStream = new FileOutputStream((File) c0972cn.f6851s);
                                        bArr3 = new byte[Fields.RotationY];
                                        while (true) {
                                            i6 = byteArrayInputStream.read(bArr3);
                                            if (i6 > 0) {
                                                fileOutputStream.write(bArr3, 0, i6);
                                            } else {
                                                r15 = 1;
                                                c0972cn.c(1, null);
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                c0972cn.f6852v = null;
                                                c0972cn.u = null;
                                                z4 = true;
                                            }
                                            th = th;
                                            fileOutputStream.close();
                                            throw th;
                                        }
                                    }
                                    z4 = false;
                                    r15 = 1;
                                    if (z4) {
                                        e(packageInfo, filesDir);
                                    }
                                    if (z4) {
                                        r11 = 0;
                                    } else {
                                        r11 = 0;
                                    }
                                    i.c(context, r11);
                                }
                                aVarArrL = null;
                                A4 = A4;
                            } catch (Throwable th16) {
                                th = th16;
                                Throwable th17 = th;
                                try {
                                    A4.close();
                                    throw th17;
                                } catch (IOException e20) {
                                    bVar.a(7, e20);
                                    throw th17;
                                }
                            }
                        }
                    }
                    aVarArr = (a[]) c0972cn2.u;
                    if (aVarArr != null) {
                        i7 = Build.VERSION.SDK_INT;
                        A4 = 34;
                        if (i7 > 34) {
                            c0972cn = c0972cn2;
                        } else {
                            c5 = 24;
                            if (i7 != 24) {
                                c5 = 25;
                                A4 = 25;
                                c5 = 25;
                                if (i7 != 25) {
                                    switch (i7) {
                                        case 31:
                                        case 32:
                                        case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                                        case 34:
                                            fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                            if (fileInputStreamA != null) {
                                                zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                                if (!zEquals) {
                                                    throw new IllegalStateException("Invalid magic");
                                                }
                                                c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                                fileInputStreamA.close();
                                                c0972cn = c0972cn2;
                                                A4 = zEquals;
                                            } else {
                                                if (fileInputStreamA != null) {
                                                    fileInputStreamA.close();
                                                }
                                                c0972cn = null;
                                                A4 = c5;
                                            }
                                            if (c0972cn == null) {
                                                c0972cn = c0972cn2;
                                            }
                                            break;
                                        default:
                                            c0972cn = c0972cn2;
                                            break;
                                    }
                                } else {
                                    fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA != null) {
                                        zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                        if (!zEquals) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                        fileInputStreamA.close();
                                        c0972cn = c0972cn2;
                                        A4 = zEquals;
                                    } else {
                                        if (fileInputStreamA != null) {
                                            fileInputStreamA.close();
                                        }
                                        c0972cn = null;
                                        A4 = c5;
                                    }
                                    if (c0972cn == null) {
                                        c0972cn = c0972cn2;
                                    }
                                }
                            } else {
                                fileInputStreamA = c0972cn2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA != null) {
                                    zEquals = Arrays.equals(f11900c, f(fileInputStreamA, 4));
                                    if (!zEquals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c0972cn2.u = i(fileInputStreamA, f(fileInputStreamA, 4), bArr5, aVarArr);
                                    fileInputStreamA.close();
                                    c0972cn = c0972cn2;
                                    A4 = zEquals;
                                } else {
                                    if (fileInputStreamA != null) {
                                        fileInputStreamA.close();
                                    }
                                    c0972cn = null;
                                    A4 = c5;
                                }
                                if (c0972cn == null) {
                                    c0972cn = c0972cn2;
                                }
                            }
                        }
                    } else {
                        c0972cn = c0972cn2;
                    }
                    bVar2 = (b) c0972cn.q;
                    aVarArr2 = (a[]) c0972cn.u;
                    r6 = A4;
                    if (aVarArr2 != null && (bArr4 = (byte[]) c0972cn.f6850r) != null) {
                        if (!c0972cn.f6849o) {
                            r6 = bArr4;
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        r6 = bArr4;
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.write(bArr4);
                        if (o(byteArrayOutputStream, bArr4, aVarArr2)) {
                            bVar2.a(5, null);
                            c0972cn.u = null;
                            byteArrayOutputStream.close();
                            r6 = bArr4;
                        } else {
                            c0972cn.f6852v = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            c0972cn.u = null;
                            r6 = bArr4;
                        }
                    }
                    r6 = bArr4;
                    bArr2 = (byte[]) c0972cn.f6852v;
                    if (bArr2 == null) {
                        if (!c0972cn.f6849o) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream((File) c0972cn.f6851s);
                        bArr3 = new byte[Fields.RotationY];
                        while (true) {
                            i6 = byteArrayInputStream.read(bArr3);
                            if (i6 > 0) {
                                fileOutputStream.write(bArr3, 0, i6);
                            } else {
                                r15 = 1;
                                c0972cn.c(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                c0972cn.f6852v = null;
                                c0972cn.u = null;
                                z4 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z4 = false;
                    r15 = 1;
                    if (z4) {
                        e(packageInfo, filesDir);
                    }
                    if (z4) {
                        r11 = 0;
                    } else {
                        r11 = 0;
                    }
                    i.c(context, r11);
                } catch (Throwable th18) {
                    th = th18;
                }
                c0972cn2.f6849o = true;
                bArr = f11899b;
            }
            z4 = false;
            if (z4) {
                r11 = 0;
            } else {
                r11 = 0;
            }
            i.c(context, r11);
        } catch (PackageManager.NameNotFoundException e21) {
            bVar.a(7, e21);
            i.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j5, int i5) throws IOException {
        byte[] bArr = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = (byte) ((j5 >> (i6 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i5) throws IOException {
        t(byteArrayOutputStream, i5, 2);
    }
}

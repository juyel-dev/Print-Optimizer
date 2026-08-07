package p069p3;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f12283a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i5, char c5) {
        return i5 < str.length() && str.charAt(i5) == c5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0205  */
    /* JADX WARN: Code duplicated, block: B:102:0x020b  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ec  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x020b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01ec, please report this as an issue */
    public static Date b(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i5;
        int i6;
        int iC;
        int iC2;
        int length;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int iC3 = c(index, i7, str);
            if (a(str, i7, '-')) {
                i7 = index + 5;
            }
            int i8 = i7 + 2;
            int iC4 = c(i7, i8, str);
            if (a(str, i8, '-')) {
                i8 = i7 + 3;
            }
            int i9 = i8 + 2;
            int iC5 = c(i8, i9, str);
            boolean zA = a(str, i9, 'T');
            if (!zA && str.length() <= i9) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iC3, iC4 - 1, iC5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i10 = i8 + 5;
                int iC6 = c(i8 + 3, i10, str);
                if (a(str, i10, ':')) {
                    i10 = i8 + 6;
                }
                int i11 = i10 + 2;
                int iC7 = c(i10, i11, str);
                if (a(str, i11, ':')) {
                    i11 = i10 + 3;
                }
                if (str.length() <= i11 || (cCharAt = str.charAt(i11)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i6 = iC7;
                    iC = 0;
                    iC2 = 0;
                    i9 = i11;
                    i5 = iC6;
                } else {
                    int i12 = i11 + 2;
                    iC2 = c(i11, i12, str);
                    if (iC2 > 59 && iC2 < 63) {
                        iC2 = 59;
                    }
                    if (a(str, i12, '.')) {
                        int i13 = i11 + 3;
                        int i14 = i11 + 4;
                        while (true) {
                            if (i14 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt2 = str.charAt(i14);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                i14++;
                            }
                            length2 = i14;
                            break;
                        }
                        int iMin = Math.min(length2, i11 + 6);
                        iC = c(i13, iMin, str);
                        int i15 = iMin - i13;
                        if (i15 == 1) {
                            iC *= 100;
                        } else if (i15 == 2) {
                            iC *= 10;
                        }
                        i5 = iC6;
                        i9 = length2;
                        i6 = iC7;
                    } else {
                        i5 = iC6;
                        i9 = i12;
                        i6 = iC7;
                        iC = 0;
                    }
                }
            } else {
                i5 = 0;
                i6 = 0;
                iC = 0;
                iC2 = 0;
            }
            if (str.length() <= i9) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i9);
            TimeZone timeZone = f12283a;
            if (cCharAt3 == 'Z') {
                length = i9 + 1;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                }
                String strSubstring = str.substring(i9);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i9 + strSubstring.length();
                if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                    String str3 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str3);
                    String id = timeZone.getID();
                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iC3);
            gregorianCalendar2.set(2, iC4 - 1);
            gregorianCalendar2.set(5, iC5);
            gregorianCalendar2.set(11, i5);
            gregorianCalendar2.set(12, i6);
            gregorianCalendar2.set(13, iC2);
            gregorianCalendar2.set(14, iC);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e) {
            e = e;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(b.l("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(b.l("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e5) {
            e = e5;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(b.l("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int c(int i5, int i6, String str) {
        int i7;
        int i8;
        if (i5 < 0 || i6 > str.length() || i5 > i6) {
            throw new NumberFormatException(str);
        }
        if (i5 < i6) {
            i8 = i5 + 1;
            int iDigit = Character.digit(str.charAt(i5), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i5, i6));
            }
            i7 = -iDigit;
        } else {
            i7 = 0;
            i8 = i5;
        }
        while (i8 < i6) {
            int i9 = i8 + 1;
            int iDigit2 = Character.digit(str.charAt(i8), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i5, i6));
            }
            i7 = (i7 * 10) - iDigit2;
            i8 = i9;
        }
        return -i7;
    }
}

package p087u3;

import androidx.compose.ui.graphics.Fields;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p035i0.a;
import p056m3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class v {
    public static final int $stable = 0;

    @b("address_type")
    private final String addressType;

    @b("area_street")
    private final String areaStreet;
    private final String city;

    @b("first_name")
    private final String firstName;

    @b("flat_house")
    private final String flatHouse;

    @b("full_name")
    private final String fullName;
    private final String id;

    @b("is_default")
    private final Integer isDefault;

    @b("is_verified")
    private final Integer isVerified;
    private final String landmark;

    @b("last_name")
    private final String lastName;
    private final String phone;
    private final String pincode;
    private final String state;

    public v(String id, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2) {
        o.f(id, "id");
        this.id = id;
        this.firstName = str;
        this.lastName = str2;
        this.fullName = str3;
        this.phone = str4;
        this.flatHouse = str5;
        this.areaStreet = str6;
        this.landmark = str7;
        this.city = str8;
        this.state = str9;
        this.pincode = str10;
        this.addressType = str11;
        this.isVerified = num;
        this.isDefault = num2;
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.state;
    }

    public final String component11() {
        return this.pincode;
    }

    public final String component12() {
        return this.addressType;
    }

    public final Integer component13() {
        return this.isVerified;
    }

    public final Integer component14() {
        return this.isDefault;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.fullName;
    }

    public final String component5() {
        return this.phone;
    }

    public final String component6() {
        return this.flatHouse;
    }

    public final String component7() {
        return this.areaStreet;
    }

    public final String component8() {
        return this.landmark;
    }

    public final String component9() {
        return this.city;
    }

    public final v copy(String id, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2) {
        o.f(id, "id");
        return new v(id, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return o.b(this.id, vVar.id) && o.b(this.firstName, vVar.firstName) && o.b(this.lastName, vVar.lastName) && o.b(this.fullName, vVar.fullName) && o.b(this.phone, vVar.phone) && o.b(this.flatHouse, vVar.flatHouse) && o.b(this.areaStreet, vVar.areaStreet) && o.b(this.landmark, vVar.landmark) && o.b(this.city, vVar.city) && o.b(this.state, vVar.state) && o.b(this.pincode, vVar.pincode) && o.b(this.addressType, vVar.addressType) && o.b(this.isVerified, vVar.isVerified) && o.b(this.isDefault, vVar.isDefault);
    }

    public final String getAddressType() {
        return this.addressType;
    }

    public final String getAreaStreet() {
        return this.areaStreet;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFlatHouse() {
        return this.flatHouse;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLandmark() {
        return this.landmark;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.firstName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phone;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.flatHouse;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.areaStreet;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.landmark;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.city;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pincode;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.addressType;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.isVerified;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isDefault;
        return iHashCode13 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Integer isDefault() {
        return this.isDefault;
    }

    public final Integer isVerified() {
        return this.isVerified;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.fullName;
        String str5 = this.phone;
        String str6 = this.flatHouse;
        String str7 = this.areaStreet;
        String str8 = this.landmark;
        String str9 = this.city;
        String str10 = this.state;
        String str11 = this.pincode;
        String str12 = this.addressType;
        Integer num = this.isVerified;
        Integer num2 = this.isDefault;
        StringBuilder sbR = a.r("SavedAddress(id=", str, ", firstName=", str2, ", lastName=");
        p061o.a.g(sbR, str3, ", fullName=", str4, ", phone=");
        p061o.a.g(sbR, str5, ", flatHouse=", str6, ", areaStreet=");
        p061o.a.g(sbR, str7, ", landmark=", str8, ", city=");
        p061o.a.g(sbR, str9, ", state=", str10, ", pincode=");
        p061o.a.g(sbR, str11, ", addressType=", str12, ", isVerified=");
        sbR.append(num);
        sbR.append(", isDefault=");
        sbR.append(num2);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ v(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, int i5, AbstractC2168g abstractC2168g) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i5 & Fields.TransformOrigin) != 0 ? 0 : num, (i5 & Fields.Shape) != 0 ? 0 : num2);
    }
}

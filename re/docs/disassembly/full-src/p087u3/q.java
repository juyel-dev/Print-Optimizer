package p087u3;

import androidx.compose.ui.graphics.Fields;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class q {
    public static final int $stable = 0;
    private final i addressType;
    private final String areaStreet;
    private final String city;
    private final String country;
    private final String firstName;
    private final String flatHouse;
    private final String fullName;
    private final boolean isPhoneVerified;
    private final String landmark;
    private final String lastName;
    private final String phone;
    private final String postalCode;
    private final Integer shippingAddressId;
    private final String state;

    public q() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, 16383, null);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component10() {
        return this.postalCode;
    }

    public final String component11() {
        return this.country;
    }

    public final String component12() {
        return this.phone;
    }

    public final boolean component13() {
        return this.isPhoneVerified;
    }

    public final Integer component14() {
        return this.shippingAddressId;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.fullName;
    }

    public final String component4() {
        return this.flatHouse;
    }

    public final String component5() {
        return this.areaStreet;
    }

    public final String component6() {
        return this.landmark;
    }

    public final i component7() {
        return this.addressType;
    }

    public final String component8() {
        return this.city;
    }

    public final String component9() {
        return this.state;
    }

    public final q copy(String firstName, String lastName, String fullName, String flatHouse, String areaStreet, String landmark, i addressType, String city, String state, String postalCode, String country, String phone, boolean z3, Integer num) {
        o.f(firstName, "firstName");
        o.f(lastName, "lastName");
        o.f(fullName, "fullName");
        o.f(flatHouse, "flatHouse");
        o.f(areaStreet, "areaStreet");
        o.f(landmark, "landmark");
        o.f(addressType, "addressType");
        o.f(city, "city");
        o.f(state, "state");
        o.f(postalCode, "postalCode");
        o.f(country, "country");
        o.f(phone, "phone");
        return new q(firstName, lastName, fullName, flatHouse, areaStreet, landmark, addressType, city, state, postalCode, country, phone, z3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return o.b(this.firstName, qVar.firstName) && o.b(this.lastName, qVar.lastName) && o.b(this.fullName, qVar.fullName) && o.b(this.flatHouse, qVar.flatHouse) && o.b(this.areaStreet, qVar.areaStreet) && o.b(this.landmark, qVar.landmark) && this.addressType == qVar.addressType && o.b(this.city, qVar.city) && o.b(this.state, qVar.state) && o.b(this.postalCode, qVar.postalCode) && o.b(this.country, qVar.country) && o.b(this.phone, qVar.phone) && this.isPhoneVerified == qVar.isPhoneVerified && o.b(this.shippingAddressId, qVar.shippingAddressId);
    }

    public final i getAddressType() {
        return this.addressType;
    }

    public final String getAreaStreet() {
        return this.areaStreet;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
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

    public final String getLandmark() {
        return this.landmark;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final Integer getShippingAddressId() {
        return this.shippingAddressId;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int iD = a.d(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c((this.addressType.hashCode() + androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(androidx.compose.foundation.text.modifiers.a.c(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.fullName), 31, this.flatHouse), 31, this.areaStreet), 31, this.landmark)) * 31, 31, this.city), 31, this.state), 31, this.postalCode), 31, this.country), 31, this.phone), 31, this.isPhoneVerified);
        Integer num = this.shippingAddressId;
        return iD + (num == null ? 0 : num.hashCode());
    }

    public final boolean isPhoneVerified() {
        return this.isPhoneVerified;
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.fullName;
        String str4 = this.flatHouse;
        String str5 = this.areaStreet;
        String str6 = this.landmark;
        i iVar = this.addressType;
        String str7 = this.city;
        String str8 = this.state;
        String str9 = this.postalCode;
        String str10 = this.country;
        String str11 = this.phone;
        boolean z3 = this.isPhoneVerified;
        Integer num = this.shippingAddressId;
        StringBuilder sbR = a.r("PrintShippingForm(firstName=", str, ", lastName=", str2, ", fullName=");
        p061o.a.g(sbR, str3, ", flatHouse=", str4, ", areaStreet=");
        p061o.a.g(sbR, str5, ", landmark=", str6, ", addressType=");
        sbR.append(iVar);
        sbR.append(", city=");
        sbR.append(str7);
        sbR.append(", state=");
        p061o.a.g(sbR, str8, ", postalCode=", str9, ", country=");
        p061o.a.g(sbR, str10, ", phone=", str11, ", isPhoneVerified=");
        sbR.append(z3);
        sbR.append(", shippingAddressId=");
        sbR.append(num);
        sbR.append(")");
        return sbR.toString();
    }

    public q(String firstName, String lastName, String fullName, String flatHouse, String areaStreet, String landmark, i addressType, String city, String state, String postalCode, String country, String phone, boolean z3, Integer num) {
        o.f(firstName, "firstName");
        o.f(lastName, "lastName");
        o.f(fullName, "fullName");
        o.f(flatHouse, "flatHouse");
        o.f(areaStreet, "areaStreet");
        o.f(landmark, "landmark");
        o.f(addressType, "addressType");
        o.f(city, "city");
        o.f(state, "state");
        o.f(postalCode, "postalCode");
        o.f(country, "country");
        o.f(phone, "phone");
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.flatHouse = flatHouse;
        this.areaStreet = areaStreet;
        this.landmark = landmark;
        this.addressType = addressType;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.isPhoneVerified = z3;
        this.shippingAddressId = num;
    }

    public /* synthetic */ q(String str, String str2, String str3, String str4, String str5, String str6, i iVar, String str7, String str8, String str9, String str10, String str11, boolean z3, Integer num, int i5, AbstractC2168g abstractC2168g) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? "" : str5, (i5 & 32) != 0 ? "" : str6, (i5 & 64) != 0 ? i.HOME : iVar, (i5 & Fields.SpotShadowColor) != 0 ? "" : str7, (i5 & Fields.RotationX) != 0 ? "" : str8, (i5 & Fields.RotationY) != 0 ? "" : str9, (i5 & Fields.RotationZ) != 0 ? "India" : str10, (i5 & Fields.CameraDistance) == 0 ? str11 : "", (i5 & Fields.TransformOrigin) != 0 ? false : z3, (i5 & Fields.Shape) != 0 ? null : num);
    }
}

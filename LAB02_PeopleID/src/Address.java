//Lab02 Exercise 3 
public class Address {
    String houseNo = "-";
    String soi = "-";
    String road = "-";
    String subDistrict = "-";
    String district = "-";
    String province = "-";
    String postcode = "-";

    public Address(String houseNo, String soi, String road, String subDistrict, String district, String province, String postcode) {
        this.houseNo = houseNo;
        this.soi = soi;
        this.road = road;
        this.subDistrict = subDistrict;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
    }

    public Address(String province, String postcode) {
        this.province = province;
        this.postcode = postcode;
    }

    void printFullAddress() {
        System.out.println(houseNo + ", " + road + ", " + subDistrict + ", " + district + ", " + province + ", " + postcode);
    }

    void printShortAddress() {
        System.out.println(district + ", " + province);
    }
    
}

package oop2;

public class Address {private String line1;
    private String city;
    private String zip;

    // 모든 항목이 필수라고 생각하고 로직 만들기
    public Address(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return line1 + " " + city + " " + zip;
    }
}

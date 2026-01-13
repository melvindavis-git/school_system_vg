public class School {

    private String name;
    private int yearFounded;
    private String schoolType;
    private String country;
    private String address;
    private String phoneNumber;
    private String orgNumber;

    public School(String name, int yearFounded, String schoolType, String country, String address,
                  String phoneNumber, String orgNumber) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.schoolType = schoolType;
        this.country = country;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.orgNumber = orgNumber;
    }

    public String getName() {
        return name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOrgNumber() {
        return orgNumber;
    }
}

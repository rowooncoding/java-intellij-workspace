package inheritance;

public class Student extends Person {
    private String collegeNameString;
    private int year;

    public String getCollegeNameString() {
        return collegeNameString;
    }

    public void setCollegeNameString(String collegeNameString) {
        this.collegeNameString = collegeNameString;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

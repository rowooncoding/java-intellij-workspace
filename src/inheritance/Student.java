package inheritance;

public class Student extends Person {

    private String collegeName;
    private int year;

    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
    }

    public String getCollegeNameString() {
        return collegeName;
    }

    public void setCollegeNameString(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}


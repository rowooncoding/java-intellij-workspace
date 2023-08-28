package inheritance;

public class StudentRunner {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("rowoon");
        employee.setEmail("dev.rowoon@gmail.com");
        employee.setPhoneNumber("010-1234-1234");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.println(employee);
    }
}

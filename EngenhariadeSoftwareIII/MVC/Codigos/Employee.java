package EngenhariadeSoftwareIII.MVC.Codigos;

public class Employee {

    private String EmployeeName;
    private String EmployeeId;
    private String EmployeeDepartment;

    public String getName() {
        return EmployeeName;
    }

    public void setName(String name) {
        this.EmployeeName = name;
    }

    public String getId() {
        return EmployeeId;
    }

    public void setId(String id) {
        this.EmployeeId = id;
    }

    public String getDepartment() {
        return EmployeeDepartment;
    }

    public void setDepartment(String Department) {
        this.EmployeeDepartment = Department;
    }
}

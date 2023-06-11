package EngenhariadeSoftwareIII.MVC.Codigos;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeId(String id) {
        model.setId(id);
    }

    public String getEmployeeId() {
        return model.getId();
    }

    public void setEmployeeDepartment(String Department) {
        model.setDepartment(Department);
    }

    public String getEmployeeDepartment() {
        return model.getDepartment();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getId(), model.getDepartment());
    }
}

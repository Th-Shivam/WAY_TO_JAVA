public class MVCMain {
    public static void main(String[] args) {

        Employee model = new Employee();
        model.setName("VIT");
        model.setId("101");
        model.setDepartment("CSE");

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        // Update data
        controller.setEmployeeName("Bhopal");

        System.out.println("After Update:");
        controller.updateView();
    }
}
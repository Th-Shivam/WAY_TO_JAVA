public class Main2 {
    public static void main(String[] args) {
       Employee2 model = new Employee2() ;
       model.setDepartment("CSE");
       model.setId(11052);
       model.setName("Shivam");

       View2 view = new View2() ;

       Controller2 controller = new Controller2(model, view) ;

       controller.updateView();

       controller.setEmpName("Singh"); 

        System.out.println("Name updated successfully");

       controller.updateView();
    }
}
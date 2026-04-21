public class Controller2 {
    private Employee2 model;
    private View2 view;

    public Controller2(Employee2 model, View2 view) {
        this.model = model;
        this.view = view;
    }

    public void setEmpName(String name){
        model.setName(name); 
    }

    public String getEmpName(){
        return model.getName();
    }

    // Similarly implement all other functions and in last make a function that updates the view and show the details 
    
    public void updateView(){
        view.printDetails(model.getName() , model.getDepartment() , model.getId());
    }

}

class StudentBean {

    // Private property
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

class TestBean {
    public static void main(String[] args) {

        StudentBean obj = new StudentBean();

        // Setting value
        obj.setName("Shivam");

        // Getting value
        System.out.println("Student Name: " + obj.getName());
    }
}
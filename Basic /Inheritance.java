class A {

    public int index = 0 ;

    public void display() {
        System.out.println("The current index is: " + index);
    }

    public void increment() {
        index++;
    }

}

class B extends A {
    public void decrement(){
        index--;
    }
}


public class Inheritance {
    public static void main(String args[]){
        
        B Index2 = new B();

        Index2.display(); // Calling the function from base class A
        Index2.increment(); // Calling the function from base class A
        Index2.display(); // Calling the function from base class A
        Index2.decrement(); // Calling the function from derived class B
        Index2.display(); // Calling the function from base class A
    }
}

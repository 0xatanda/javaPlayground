public class nameCov {
    public static void main(String[] args) {
        new A().show();  // anonymous obj
    }
}



class A {

    public A() {
        System.out.println("Objec created");
    }

    public void show() {
        System.out.println("in A show");
    }
}
public class polymo {
    public static void main(String[] args) {
        A objA = new A();
        objA.show();

        System.out.println("");

        objA = new B();
        objA.show();
    
    }
}

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}
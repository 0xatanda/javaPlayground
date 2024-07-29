public class inherit {
    public static void main(String[] args) {
        B obj = new B(5);
        System.out.println(obj);
       
    }
}


class A {
    public A() {
        super();
        System.out.println("in a");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in b");
    }

    public B(int n) {
        this();
        System.out.println("in B int");
    }
}
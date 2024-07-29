public class inClass {
    public static void main(String[] args) {
        A objA = new A();
        objA.show();

        A.B objB = objA.new B();
        objB.config();
    }
}


class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void config() {
            System.out.println("config");
        }
    }
}
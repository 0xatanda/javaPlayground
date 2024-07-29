public class anonInClass {
    public static void main(String[] args) {
        A objA = new A() {
            @Override
            public void show() {
               System.out.println("in new show");
            }
        };
        objA.show();
    }
}


class A {
    public void show() {
        System.out.println("in a show");
    }
}
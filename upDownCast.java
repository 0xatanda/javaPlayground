public class upDownCast {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int)d;

        System.out.println(i);

        // up casting
        A objA = (A) new B();
        objA.show1();

        B objB = (B) objA;
        objB.show2();
    }
}


class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2() {
        System.out.println("in B show");
    }
}
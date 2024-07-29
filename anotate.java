public class anotate {
    public static void main(String[] args) {
        B objB = new B();
        objB.showTheData();
    }
}


class A {
    public void showTheData() {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void showTheData() {
        System.out.println("in B show");
    }
}
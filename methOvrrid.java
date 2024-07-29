public class methOvrrid {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();

        System.out.println("");
        System.out.println("");

        AdvCalc obCalc = new AdvCalc();
        int r = obCalc.add(3, 7);
        System.out.println(r);

    }
}

class A {
    public void show() {
        System.out.println("in  A show");
    }

    public void config() {
        System.out.println("in A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvCalc extends Calc {
    public int add(int a, int b) {
        return a + b+1;
    }
}
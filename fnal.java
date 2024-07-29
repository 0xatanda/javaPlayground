public class fnal {
    public static void main(String[] args) {
        
        final int num = 9;
        System.out.println(num);
    }
}


final class Calc {
    public final void show() {
        System.out.println("in Calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc {
    public void show() {
        System.out.println("in Calc show");
    }
}
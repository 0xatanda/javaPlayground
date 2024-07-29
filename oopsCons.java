public class oopsCons {
    public static void main(String[] args) {
        AdvCalc objCalc = new AdvCalc();

        int r1  = objCalc.add(22, 33);
        int r2 = objCalc.sub(30, 10);
        int r3 = objCalc.div(100, 10);
        int r4 = objCalc.mult(100, 10000);

        System.out.println(r1 + " : "+ r2 + " : " + r3 + " : " + r4);
    }
}


class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvCalc extends Calc{
    public int mult(int a, int b) {
        return a * b;
    }
    
    public int div(int a, int b) {
        return a / b;
    }
}
public class inheritance {
    public static void main(String[] args) {
        VeryAdvCalc objCalc = new VeryAdvCalc();

        int r1  = objCalc.add(22, 33);
        int r2 = objCalc.sub(30, 10);
        int r3 = objCalc.div(100, 10);
        int r4 = objCalc.mult(100, 10000);
        double r5 = objCalc.power(10, 2);

        System.out.println(r1 + " : "+ r2 + " : " + r3 + " : " + r4 + " : " + r5);
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

class VeryAdvCalc extends AdvCalc{
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}
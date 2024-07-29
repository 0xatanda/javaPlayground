class Main {
    public static void main(String arg[]) {
        int num = 4;
        int num1 = 5;

        Calculator cal = new Calculator();

        int result = cal.add(num, num1);
        System.out.println(result);
    }
}

class Calculator {
    public int add(int n1, int n2) {
       int r = n1 + n2;
        return r;
    }
}
public class mem {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.add(10, 33);
        System.out.println(result);
    }
}


class Calculator {
    int num;

    public int add(int a, int b) {
        return a + b;
    }
}
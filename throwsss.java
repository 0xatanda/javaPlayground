public class throwsss {

    static {
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        A objA = new A();
        try {
            objA.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}



class A {
    public void show() throws ClassNotFoundException {
        try {
            Class.forName("Calc");
        } catch (ClassNotFoundException e) {
            System.out.println("not able t find th class");
        }
    }
}
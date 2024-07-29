public class abstAnonClass {
    public static void main(String[] args) {
        A objA = new A() {
            public void show() {
                System.out.println("in new show");
            }
        };  
        objA.show(); 
    }
}


abstract class A {
    public abstract void show();
}

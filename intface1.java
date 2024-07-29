public class intface1 {
    public static void main(String[] args) {
        A objA;
        objA = new B();
        objA.show();
        objA.config();

        x obX = new B();
        obX.run();
        
        System.out.println(A.area);
    }
}


interface A {
    int age = 6;
    String area = "Lagos";

    void show();
    void config();
}

interface x {
    void run();
}

interface y extends x {
    
}


class B implements A, x {

    @Override
    public void config() {
        System.out.println("in config");
        
    }

    @Override
    public void show() {
        System.out.println("in show");        
    }

    @Override
    public void run() {
        System.out.println("in run");
        
    }

    
    
}

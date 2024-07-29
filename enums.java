public class enums {
    public static void main(String[] args) {
        int i = 5;
        Staus[] ss = Staus.values();
        for (Staus s : ss) {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}


enum Staus {
    Running, Failed, Pending, Success;
}
public class enums {
    public static void main(String[] args) {
        Staus[] ss = Staus.values();
        for (Staus s : ss) {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}


enum Staus {
    Running, Failed, Pending, Success;
}
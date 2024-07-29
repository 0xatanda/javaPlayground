public class funInterface {
    public static void main(String[] args) {
        Calc objA = (i, j) -> 
            {
                return i + j;
            }
        ;
        int result = objA.add(5, 2);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Calc {
    int add(int i, int j);

}




public class wrapCast {
    public static void main(String[] args) {
         int num = 7;
        Integer nuInteger = num; // autoboxing

        int num1 = nuInteger;  // autounboxing



        System.out.println(num1);

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 2);
        
    }
}

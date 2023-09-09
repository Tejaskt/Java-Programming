package generic;

public class genericDemo {

    public static void main(String[] args) {

        Integer[] ar1 = {10, 20, 30};
        String[] ar2 = {"Tejas", "kt", "tej"};
        Double[] ar3 = {1.2, 2.3, 3.4};

        print(ar2);
        print(ar1);
        print(ar3);

    }
    
    //here defining the generic type T
    public static <T> void print(T[] ar) {

        for (T s : ar) {
            System.out.println(s);
        }
    }

}

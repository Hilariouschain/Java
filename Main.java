import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Integer[] ar = {3, 3, 3, 3};
//        List<Integer> lst1 = Arrays.asList(ar);

//        Func<String> stringFunc = (str) -> {
//            String result = "";
//            int i;
//            for (i = str.length() - 1; i >= 0; i--)
//                result += str.charAt(i);
//            return result;
//        };
//        System.out.println("Java " + stringFunc.func("Java"));


        MaxNum mx = z -> {
            int max = z[0];
            for (int i = 1; i < z.length; i++) {
                if (max < z[i]) {
                    max = z[i];
                }
            }
            return max;
        };
        System.out.println(foo(arr, mx));




       Search search = (x, b) -> {
            for (int i = 0; i < b.length ; i++) {
                if (b[i] == x) {
                    return i;
                }
            }
            return -1;
        };
        System.out.println(foo1(search, 3, arr));

        Average m = md->{
            double avg = 0;
            for (int i = 0; i < md.length ; i++){
                avg += md[i]/ ar.length; ;
            }
            return avg;
        };
        System.out.println(foo2(m,ar));

    }



    public static int foo(int[] arr, MaxNum a) {
        return a.max(arr);
    }

    public static int foo1(Search search, int number, int[] arr) {
        return search.apply(number, arr);

    }
    public static Double foo2(Average average, Integer[] a ){
       return average.average(a);
    }
}




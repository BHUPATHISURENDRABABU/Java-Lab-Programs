public class SumOfArr {
    public static void main(String[] args) {

        Integer arr[] = {1, 2, 3, 4, 5};
        int res = 0;
        for(int ele : arr) {
            res += ele;
        }

        System.out.println(res);

    }
}

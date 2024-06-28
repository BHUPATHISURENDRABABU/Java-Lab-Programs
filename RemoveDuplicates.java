import java.util.ArrayList;


public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        ArrayList<Integer> res = new ArrayList<>();

        for(Integer ele : arr) {
            if(!res.contains(ele)) {
                res.add(ele);
            }
        }

        System.out.println(res);

    }
}

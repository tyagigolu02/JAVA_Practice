import java.util.Arrays;

class array{
    void sorted(){
        int [] arr = {1,5,8,4,6,2,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

public class Day04Array {
    public static void main(String[] args) {
        array obj = new array();
        obj.sorted();
    }
}

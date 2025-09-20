package Day13_Practice;

public class findSumOfElement {
    static int sumOf() {
        int[] arr = {1, 2, 5, 3, 7, 9, 5, 2, 0, 10, 11, 19};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void main() {
        findSumOfElement ss =  new findSumOfElement();
        System.out.println(ss.sumOf());
    }
}

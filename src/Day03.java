public class Day03 {
    void bToD(){
        int bNum = 1001;
        int ans = 0;
        int pw = 1;

        while(bNum > 0){
            int uDigit = bNum % 10;
            ans += (uDigit*pw);
            bNum /=10;
            pw *=2;
        }
        System.out.println(ans);
    }
    void dToB(){
        int dNum = 13;
        int ans = 0;
        int pw = 1;
        while(dNum>0){
            int p = dNum%2;
            ans += (p*pw);
            pw*=10;
            dNum/=2;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        Day03 obj = new Day03();
//        obj.bToD();
//        obj.dToB();
    }
}

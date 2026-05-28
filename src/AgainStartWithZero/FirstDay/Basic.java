package AgainStartWithZero.FirstDay;

public class Basic
{
    int totalPrice = 0;
    public int resBill(String item, int price)
    {
        totalPrice += price;
        return totalPrice;
    }
    public int finalBill()
    {
        return totalPrice;
    }
    static void main()
    {
        Basic obj1 = new Basic();
        obj1.resBill("Hazmola",20 );
        obj1.resBill("AnarDana",80 );
        obj1.resBill("Tarbooj",200 );
        obj1.resBill("Cow Dung",202 );
        int result = obj1.finalBill();
        System.out.println("Sir, Your total bill is "+ result +" rupees.");
    }
}

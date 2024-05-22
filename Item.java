public class Item{
    public static void main(String[] args){
        ItemBill bill = new ItemBill();
        bill.calculatePrice();
        bill.printPrice(); // can not be accessed because it is private
    }
}
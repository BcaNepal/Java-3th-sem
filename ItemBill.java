public class ItemBill{

    //abstraction

    String item;
    float cost, discount = .05F;
    int qty;
    private float price;  // encapsulation
    // constant values are generally written in capital letter
    final float VAT = 0.13f; // 13 percentage
    // write code 

    public ItemBill(){
        // write code
        // initialize the item, qty and cost
        item = "Apple";
        cost = 120.0f;
        qty = 12;
    }

    public ItemBill(String item, int qty, float cost){
        // write code
        // initialize the item, qty and cost
        this.item = item;
        this.cost = cost;
        this.qty = qty;
    }
    public void calculatePrice2(){
        // write code to caluculate price
       
        price = cost * qty;      
        price = price - price * discount;        
        price = price + price * VAT;
    }
    public void calculatePrice(){
        // write code to caluculate price
        price = cost - cost * discount;
       // price = price + price * VAT;
        price += price * VAT;
        //price = price * qty;
        price *=  qty;
        printPrice();
    }

    private void printPrice(){
        System.out.println(price);
    }

    public float getPrice(){
        return price;
    }
    // main method
    public static void main(Sring[] args){
        // write code
        //ItemBill bill = new ItemBill();
        ItemBill bill = new ItemBill("Banana", 20, 20.0f);
        bill.calculatePrice();
        //float totalPrice = bill.getPrice();
        //System.out.println("Price: " + bill.price)
        //bill.printPrice();
    }
}
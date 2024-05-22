//Access modifiers
//access modifiers
//public,  protected, private
//default

public class ElectricityBill
{    
    int  curReading, amp, unitConsumed;
    int prevReading;
    public float cost, serviceCharge;

    ElectricityBill(int amp){ // constructor
        //initialization 
        this.amp = amp;
        prevReading = 120;
        curReading = 0;
        cost = 0.0f;
        serviceCharge = 125.0f;
    }

    protected void setReadings(int curReading, int prevReading){
        this.curReading = curReading;
        this.prevReading = prevReading;
    }

    float calculateCost(){
        switch(amp){
            case 5:
                serviceCharge = 100.0f;
                break;
            case 15:
                 serviceCharge = 120.0f;
                break;
            case 30:
                 serviceCharge = 135.7f;
                break;
            default:
                serviceCharge = 150.5f;
        }
        float rate = 8.75f;
        unitConsumed = curReading - prevReading;
        cost = unitConsumed * rate + serviceCharge;
        return cost;
    }

    public static void main(String args[])
    {
        //ArrayDemo2 arrd = new ArrayDemo2();
        System.out.println("******");

        ElectricityBill bill = new ElectricityBill(15);
        System.out.println(bill.prevReading);
        bill.setReadings(90, 30);
        float totalPayment = bill.calculateCost();
        System.out.print("Total Charge: " + totalPayment);

    }
    
}
package methodandconstructor;
/* a phone bill should have an ID, a base class, a number of allotted minutes and a number of minutes used. And then, it should also be able to calculate the overage, calculate the tax, and calculate the total.

And then, it should also be able to print an itemized bill.

You should also include three constructors

a default one
one that accepts the ID only
one that accepts all fields
Now no matter which of these constructors you use, all fields should be set eventually.

Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.*/

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    private final double overageRate=0.25; //final because the overageRate value is a constant/fixed
    private final double taxRate=0.15;
    //default constructor
    public PhoneBill(){
        this(0,70.0,700,0);
    }
    //constructor with ID only
    public PhoneBill(int id){
        this(id,70.0,700,0);
    }
    //constructor with all the fields
    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id=id;
        this.baseCost=baseCost;
        this.allottedMinutes=allottedMinutes;
        this.minutesUsed=minutesUsed;
    }
    public double calculateOverage(){
        int overageMinutes= (minutesUsed - allottedMinutes);
        if(overageMinutes > 0){
            return (overageMinutes * overageRate);
        }
        else{
            return 0;
        }
    }
    public double calculateTax(){
        return ((baseCost + calculateOverage()) * taxRate);
    }
    public double calculateTotal() {
        return (baseCost + calculateOverage() + calculateTax());
    }
    public void printItemizedBill() {
        System.out.println("The Phone Bill ID: " + id);
        System.out.println("The Basecost: $"+baseCost);
        System.out.println("The Overage Charges: $" +calculateOverage());
        System.out.println("The Tax: $" +calculateTax());
        System.out.println("Total Bill: $" +calculateTotal());
    }
}

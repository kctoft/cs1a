/*
* name: "Adding Sales Tax"
* created: 5/19/2018
* author: Kitana Toft
* Adds 8% sales tax to a purchase amount and prints the total.
* Input:
* using $4000 as the car's purchase value
 */
public class AddingSalesTax {
    public static void main(String[] args) {
        // declare vars
        int purchase;
        double total;

        // perform calculations & store result
        purchase = 4000;
        total = purchase + (purchase * 0.08);
        System.out.println("The total including tax on a purchase of $" + purchase + " will be $" + total);
    }
}
/*
* Output:
* The total including tax on a purchase of $4000 will be $4320.0
* Process finished with exit code 0
 */

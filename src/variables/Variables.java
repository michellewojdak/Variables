/*
*March 1st 2017
*Michelle Wojdak
*Variables Assignment
*Becoming familiar using variables to store inforamtion
 */

package variables;
public class Variables  {    
    public static void main(String[] args) {
        /*Area of a Circle
        *Calculating the area of a cicle given the radius
        */
        double radius=15;
        double pi=3.14;
        double area=(pi*radius*radius); 
        System.out.println("The area of the circle is " + area);
        
        /*Wayne Gretzky
        *Stating the jersey number of Wayne Gretzky 
        */ 
        String hockeyPlayer="Wayne Gretzky";
        int hockeyNumber=99;
        System.out.println(hockeyPlayer+" is number "+hockeyNumber);
        
        /*Area of a Rectangle
        *Calculate the length, width, and area of a rectangle when given the length and  width
        */
        double length=4.8;
        double width=5.7 ;
        area=length*width;
        System.out.println("Length is "+length+"m");
        System.out.println("Width is "+width+"m");
        System.out.println("Area is "+area+"m^2");
        
        /*NetPay
        *Calculating the total net pay of an employee considering insurance, hours, salary, and taxes
        */        
        double insuranceDeduction=2.00;
        double hoursWorked=40;
        double taxes= 0.22;
        double salary=10.55;
        double netPay=(hoursWorked*salary-insuranceDeduction)-taxes*(hoursWorked*salary-insuranceDeduction);
        System.out.println("The net pay of the employee is $"+netPay);
        
        /*Carpet
        *Calculate the cost of a carpet when given width, length, and price per square metre
        */        
        double carpetWidth = 8.5;
        double carpetLength = 6;
        double carpetPrice = 19.95;
        area=carpetWidth*carpetLength;
        double cost=area*carpetPrice;
        System.out.println("The cost of the carpet is $"+cost);
        
        /*Bill of sale
        Calculate purchased price, tax, total, and chnage of a shirt and output on a bill of sale
        */     
        double shirtPrice = 12.49;
        double amountPaid = 20.00;
        double hst = 0.13;
        double tax= shirtPrice*hst;
        double finalPrice = shirtPrice+tax;
        double change=amountPaid-finalPrice;
        System.out.println("");
        System.out.println("BILL OF SALE");
        System.out.println("------------");
        System.out.println("Purchased price= $"+shirtPrice);
        System.out.println("Tax= $"+tax);
        System.out.println("Total= $ "+finalPrice);
        System.out.println("Change= $"+change);
    }
    
}
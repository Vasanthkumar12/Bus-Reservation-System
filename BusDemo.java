import java.text.ParseException;
import java.util.*;
public class BusDemo {
    public static void main(String []args) throws ParseException{
        Scanner scan = new Scanner(System.in);

        System.out.println("========================== Welcome to SUNDRAA TRAVELS ========================== ");
        System.out.println("Our Buses List Here......");
        System.out.println("--------------------------------------------------------------");
        
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 1));
        buses.add(new Bus(3, false, 1));

        for(Bus bus : buses){
            bus.displayBusInfo();
        }
        System.out.println("--------------------------------------------------------------");

        System.out.println("Are you booking ?");
        
        
        char userOpt = 'y';
        while(userOpt == 'y' || userOpt == 'Y'){
            System.out.println("Enter 'y' to book seats or enter 'n' to exit");
            userOpt = scan.next().charAt(0);
            
            if(userOpt == 'y' || userOpt == 'Y'){
                // System.out.println("Booking......");
                Booking booking = new Booking();
                
                if(booking.isAvailable(buses, bookings)){
                    bookings.add(booking);
                    System.out.println("You are Booked successfully !!!!!");
                    System.out.println("Thank you for your arraival !!!!!");
                    System.out.println("=============================================================================");
                }
                else{
                    System.out.println("Sorry the Bus Number "+booking.getBusNo()+" is Full....So please try another bus or another Date");
                }

            }
        }
        if(userOpt != 'y' || userOpt != 'Y' )
            System.out.println("THANK YOU FOR VISITING OUR SITE !!!!!!! SEE YOU ON NEXT TIME.....");
    
    }
    
}

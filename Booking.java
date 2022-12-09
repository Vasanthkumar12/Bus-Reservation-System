import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    private String passengerName;
    private int busNo;
    private Date date;

    Scanner scan = new Scanner(System.in);
    public Booking() throws ParseException{
        System.out.println("Enter your Name : ");
        passengerName = scan.nextLine();
        System.out.println("Enter Bus Number : ");
        busNo = scan.nextInt();
        System.out.println("Enter Date of Booking in \"dd-mm-yyyy\" formate : ");
        String dateInput = scan.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        date = dateFormat.parse(dateInput);
    }
    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
        int capacity = 0;
        for(Bus bus : buses){
            if(bus.getBusNo() == busNo){
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for(Booking booking : bookings){
            if(booking.busNo == busNo && booking.date.equals(date)){
                booked++;
            }
        }
        return booked < capacity ? true : false;
    }
    public int getBusNo(){
        return busNo;
    }
    
}

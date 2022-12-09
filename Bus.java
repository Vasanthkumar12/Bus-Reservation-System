public class Bus{
    private int busNo;
    private boolean ac;
    private int capacity;

    public Bus(int bNo, boolean ac, int cap){
        this.busNo = bNo;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo(){
        return busNo;
    }
    public boolean isAc(){
        return ac;
    }
    public void setAc(boolean val){
        ac = val;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int val){
        capacity = val;
    }

    public void displayBusInfo(){
        System.out.println("Bus No : "+ busNo +", AC : "+ac+", Bus Capacity : "+capacity);
    }

    
}
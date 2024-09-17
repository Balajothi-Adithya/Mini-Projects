abstract class Travels extends Transport
{
    int cap;
    String ac;
    String seatType;
    public abstract double fare();
    Travels()
    {
        
    }
    Travels(String dest ,int cap,String ac,String seatType)
    {
        super(dest);
        this.cap=cap;
        this.ac=ac;
        this.seatType=seatType;
    }
    void display(Bus t)
    {
      
        super.display(t);
        System.out.println("Capacity of the bus - "+t.cap);
        System.out.println("Type - "+t.ac);
        System.out.println("Seat Type - "+t.seatType);
        
    }
   
}

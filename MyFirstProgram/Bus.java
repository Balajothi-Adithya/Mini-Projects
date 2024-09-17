import java.util.*;
import java.io.*;
class Bus extends Travels
{
    String name;
    int price;
    Employee e;
    BoardingPoint b;
    
    public double fare()
    {
        double f=
        f=price+50;
        return f;    
    }
    Employee getEmployee()
    {
        return e;
    }
    void setEmployee(Employee e)
    {
        this.e=e;
    }
    Bus()
    {
        
    }
    Bus(String dest,int cap,String ac,String seatType,String name,int price,BoardingPoint b)
    {
        super(dest,cap,ac,seatType);
        this.name=name;
        this.price=price;
        this.b=b;
    }
    int Choice(int i)
    {
        if(i==1)
        return 1;
        else
        return 2;
    }
    void display(ArrayList<Bus> b)
    {
        for(Bus bus:b)
        {
        super.display(bus);
        System.out.println("Name of the Travels - "+bus.name);
        System.out.println("Ticket price - "+bus.price);
        System.out.println("Boarding Point - "+bus.b.name);
        }
    }
    void display(Bus b)
    {
        super.display(b);
        System.out.println("Name of the Travels - "+b.name);
        System.out.println("Ticket price - "+b.price);
    }
    public static void main(String args[])
    {
        int i;
        i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Our buses");
        BoardingPoint b1=new BoardingPoint("Matuthavani Omni Bus stand");
        BoardingPoint b2=new BoardingPoint("Arapalaiyam");
        BoardingPoint b3=new BoardingPoint("Periyar");
        BoardingPoint b4=new BoardingPoint("Matuthavani Omni Bus stand");
        Bus t1=new Bus("Chennai",1,"Ac","Sleeper","Intercity",900,b1);
        Bus t2=new Bus("Chennai",50," Non Ac","Sleeper","Angel",650,b2);
        Bus t3=new Bus("Bangalore",48,"Ac","Sleeper","Parveen",856,b3);
        Bus t4=new Bus("Bangalore",50,"Ac","Sleeper","Intercity",890,b4);
        ArrayList<Bus> buses=new ArrayList<Bus>();
        buses.add(t1);
        buses.add(t2);
        buses.add(t3);
        buses.add(t4);
        Bus obj=new Bus();
        Employee e1=new Employee("Anthony","1234");
        Employee e2=new Employee("Mark","34567");
        Employee e3=new Employee("Pandian","7890");
        Employee e4=new Employee("Selvan","4567");
        t1.setEmployee(e1);
        t2.setEmployee(e2);
        t3.setEmployee(e3);
        t4.setEmployee(e4);
        obj.display(buses);
        Availability v=new Availability();
        try{
        while(obj.Choice(i)==1)
        {
          System.out.println("Enter Info");
          System.out.println("Enter your name");
          User obj1=new User(sc.next());
          System.out.println("Enter age & Destination and contact number");
          User obj2=new User(sc.nextInt(),sc.next(),sc.nextInt());
          
            Thread1 d1=new Thread1(v);
          Thread2 d2=new Thread2(v);
          try{
          FileOutputStream fileout=new FileOutputStream("C:\\Users\\bubbl\\OneDrive\\Desktop\\businfo.ser");
          try
          {
          ObjectOutputStream out=new ObjectOutputStream(fileout);
          out.writeObject(buses);
          out.close();
          fileout.close();
          }
          catch (IOException ioe)
          {
              ioe.printStackTrace();
          }
          }
          catch(FileNotFoundException e){
          }
          Booking obj3=new Booking(obj2.dest);
          Booking.Book(buses,obj3,obj1,obj2,obj);
          ticketfile t=new ticketfile();
          t.PassengerList(obj1.name);
          System.out.println("Enter 1 for booking and 2 to exit");
          i=sc.nextInt();
        }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a Proper word or number");
        }
    }
}

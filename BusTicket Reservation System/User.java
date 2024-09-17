class User 
{
    String name;
    String dest;
    int age;
    int no;
    User()
    {
        
    }
    User(String name)
    {
        this.name=name;
        
    }
    User(int age,String dest,int no)
    {
        this.age=age;
        this.dest=dest;
        this.no=no;
    }
    static void displayUserInfo(User obj1,User obj2,Bus b)
    {
        System.out.println("********* Your Ticket **********");
        System.out.println("Passenger details");
        System.out.println("Passenger Name "+obj1.name);
        System.out.println("Passenger Age "+obj2.age);
        System.out.println("Destination "+obj2.dest);
        System.out.println("Ticket Fare-"+b.fare()+" rupees");
        System.out.println("*********************");
        System.out.println("Transport details");
        System.out.println("Bus name "+b.name);
        System.out.println("Bus type "+b.ac);
        System.out.println("Employee name-"+b.getEmployee().getName());
        System.out.println("Employee contact number-"+b.getEmployee().getNo());
    }
}
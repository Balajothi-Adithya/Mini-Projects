class Transport
{
    public String dest;
    
    Transport()
    {
        
    }
    public Transport(String dest)
    {
        this.dest=dest;
    }
    void display(Bus u)
    {
       
        System.out.println("Destination - "+u.dest);
        
    }
   
}

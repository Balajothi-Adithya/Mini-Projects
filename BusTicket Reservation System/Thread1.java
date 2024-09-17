class Thread1 extends Thread
{
    int n;
    Availability a;
    int s;
    Thread1(int n)
    {
        this.n=n;
        
    }
    Thread1(Availability a)
    {
        this.a=a;
    }
    public void run()
    {
        
        this.s=a.isAvailable(n);
        
    }
    void display()
    {
        System.out.println(this.n);
    }
    int getValue()
    {
        return this.s;
    }
}
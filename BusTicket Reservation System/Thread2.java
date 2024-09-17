class Thread2 extends Thread
{
    int n;
    Availability a;
    int s;
    Thread2(int n)
    {
        this.n=n;
        this.a=a;
    }
    Thread2(Availability a)
    {
        this.a=a;
    }
    public void run()
    {
        this.s=a.isAvailable(n);
    }
    int getValue()
    {
        return s;
    }
}
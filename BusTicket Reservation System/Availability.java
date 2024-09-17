class Availability
{
    synchronized static int isAvailable(int n)
    {
        if(n != 0)
        {
            n--;
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
            return 1;
        }
        else
        {
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
            return 0;
        }
    }
}
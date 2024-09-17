import java.io.*;
class ticketfile{
     void PassengerList(String name)
    {
        try{
            FileWriter writer=new FileWriter("C:\\Users\\bubbl\\OneDrive\\Desktop\\passengerlist.txt");
            
            writer.write("                         Passenger List \n         ");
            writer.write(name+"\n");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
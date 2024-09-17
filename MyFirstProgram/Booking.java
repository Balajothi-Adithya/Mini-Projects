import javax.swing.*;
import javax.swing.JButton;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
class Booking extends JFrame implements ActionListener
{
    int amount;
    String dest;
    Scanner sc=new Scanner(System.in);
    Booking(String dest)
    {
        this.dest=dest;
        
    }
    JButton button;
    User b;
    User b1;
    Bus t;
    Booking(User b,User b1,Bus t)
    {
        this.b=b;
        this.b1=b1;
        this.t=t;
        button=new JButton("view");
        button.setBounds(200,100,100,50);
        button.setBackground(Color.blue);
        button.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(420,420);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(123,50,250));
        this.add(button);
        ImageIcon image = new ImageIcon("C:\\Users\\bubbl\\Downloads\\buslogo.png");
        this.setIconImage(image.getImage());
    }
    static void Book(ArrayList<Bus> b,Booking a,User ob1,User ob2,Bus t)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press B to book buses and T to book trains");
        char choice=sc.next().charAt(0);
        switch (choice)
        {
        case 'B':
        System.out.println("Available transport for that destination");
        for(Bus bus:b)
        {
                System.out.println(bus.cap);
                Thread1 u=new Thread1(bus.cap);
                Thread2 u1=new Thread2(bus.cap);
                if(a.dest.equalsIgnoreCase(bus.dest))
                {
                t.display(bus);
                System.out.println("Press 1 to book tickets in the current transport and 2 to go to other options");
                int c=sc.nextInt();
                if(c==1)
                {
                    u.run();
                    u1.run();
                    if(u.getValue()==1||u1.getValue()==1)
                    {
                        
                        bus.cap--;
                        System.out.println("Booking is confirmed");
                        System.out.println("press view button  to view your ticket");
                        Booking g=new Booking(ob1,ob2,bus);
                        break;
                    }
                    else
                    {
                        System.out.println("Booking is full try other transport");
                        break;
                    }
                }
            }
            
        }
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            User.displayUserInfo(b,b1,t);
        }
    }
}
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame f;
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bm,bd,be;
        JLabel l;
        JTextField t;
        int n=0;
    int ch=0,sum=0;
    calculator()
    {
        t=new JTextField(10);
        f=new JFrame();
        l=new JLabel("Enter number");
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        ba=new JButton("+");
        bs=new JButton("-");
        bm=new JButton("*");
        bd=new JButton("/");
        be=new JButton("=");
        f.setLayout(null);

        t.setBounds(50,10,50,20);
        f.getContentPane().add(t);

        l.setBounds(10,10,50,50);
        f.getContentPane().add(l);

        b0.setBounds(50,50,40,40);
        f.getContentPane().add(b0);

        b1.setBounds(100,50,40,40);
        f.getContentPane().add(b1);

        b2.setBounds(150,50,40,40);
        f.getContentPane().add(b2);

        b3.setBounds(200,50,40,40);
        f.getContentPane().add(b3);

        b4.setBounds(250,50,40,40);
        f.getContentPane().add(b4);

        b5.setBounds(300,50,40,40);
        f.getContentPane().add(b5);

        b6.setBounds(350,50,40,40);
        f.getContentPane().add(b6);

        b7.setBounds(400,50,40,40);
        f.getContentPane().add(b7);

        b8.setBounds(450,50,40,40);
        f.getContentPane().add(b8);

        b9.setBounds(500,50,40,40);
        f.getContentPane().add(b9);

        ba.setBounds(550,50,40,40);
        f.getContentPane().add(ba);

        bs.setBounds(600,50,40,40);
        f.getContentPane().add(bs);

        bm.setBounds(650,50,40,40);
        f.getContentPane().add(bm);

        bd.setBounds(700,50,40,40);
        f.getContentPane().add(bd);

        be.setBounds(750,50,50,40);
        f.getContentPane().add(be);

        f.setSize(800,300);
        f.setVisible(true);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String  num=null,temp=null ;

        if (e.getSource()==b0)
        {
           //num= t.getText()+0;
            t.setText(t.getText()+0);
        }
        else if (e.getSource()==b1)
        {
            //num= t.getText()+1;
            t.setText(t.getText()+1);
            //t.setText(num);
        }
        else if (e.getSource()==b2)
        {
            num= t.getText()+2;
            t.setText(num);
        }
        else if (e.getSource()==b3)
        {
            num= t.getText()+3;
            t.setText(num);
        }
        else if (e.getSource()==b4)
        {
            num= t.getText()+4;
            t.setText(num);
        }
        else if (e.getSource()==b5)
        {
            num= t.getText()+5;
            t.setText(num);
        }
        else if (e.getSource()==b6)
        {
            num= t.getText()+6;
            t.setText(num);
        }
        else if (e.getSource()==b7)
        {
            num= t.getText()+7;
            t.setText(num);
        }
        else if (e.getSource()==b8)
        {
            num= t.getText()+8;
            t.setText(num);
        }
        else if (e.getSource()==b9)
        {
            num= t.getText()+9;
            t.setText(num);
        }
        else if (e.getSource()==ba)
        {
               //  temp=num;
                // num=null;
                 ch=1;
              n= Integer.parseInt(t.getText());
            System.out.println(n);
                 t.setText("");
        }
        else if (e.getSource()==bs)
        {
            temp=num;
            num=null;
            ch=2;
        }
        else if (e.getSource()==bm)
        {
            temp=num;
            num=null;
            ch=3;
        }
        else if (e.getSource()==bd)
        {
           // temp=Integer.parseInt(num);
            num=null;
            ch=4;
        }
        else if (e.getSource()==be)
        {
            if (ch==1)
            {
                //sum=Integer.parseInt(t.getText()) +Integer.parseInt(temp);
            sum=n+ Integer.parseInt(t.getText());
                System.out.println(n);

                    t.setText(String.valueOf(sum));
            }
            else if (ch==2)
            {
                sum=Integer.parseInt(num)-Integer.parseInt(temp);
            }
            else if (ch==3)
            {
                sum=Integer.parseInt(num)*Integer.parseInt(temp);
            }
            else if (ch==4)
            {
                sum=Integer.parseInt(num)/Integer.parseInt(temp);
            }

            t.setText(String.valueOf(sum));
        }

    }

    public static void main(String[] args) {
        calculator c=new calculator();

    }
}

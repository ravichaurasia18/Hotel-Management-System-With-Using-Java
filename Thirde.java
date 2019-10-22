import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Thirde extends JFrame implements ActionListener{
	JButton b1;
	JMenuItem open,copy;
public static void main(String[] args){
	Thirde thr = new Thirde();
	thr.karle();
}
public void karle(){
	
JFrame fr = new JFrame();
JPanel pan = new JPanel();
pan.setLayout(new GridLayout(3,2,5,10));
JMenuBar menu = new JMenuBar();

JMenu file = new JMenu("FILE");
JMenu edit = new JMenu("EDIT");
open = new JMenuItem("OPEN");
copy = new JMenuItem("COPY");
open.addActionListener(this);
copy.addActionListener(this);

//JMenuItem open = new JMenuItem("OPEN");
//JMenuItem copy = new JMenuItem("COPY");

file.add(open);
edit.add(copy);
file.add(edit);

menu.add(file);
//edit.add(edit);
b1 = new JButton("EAST");
JButton b1 = new JButton("NORTH");
JButton b2 = new JButton("EAST");
JButton b3 = new JButton("WEST");
JButton b4 = new JButton("SOUTH");
JButton b5 = new JButton("CENTER");
JButton b6 = new JButton("difhei");
/*
fr.add(b1,BorderLayout.NORTH);
fr.add(b2,BorderLayout.EAST);
fr.add(b3,BorderLayout.WEST);
fr.add(b4,BorderLayout.SOUTH);
fr.add(b5,BorderLayout.CENTER);
*/
fr.add(menu,BorderLayout.NORTH);
pan.add(b1);
pan.add(b2);
pan.add(b3);
pan.add(b4);
pan.add(b5);
pan.add(b6);
fr.add(pan);

fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fr.setSize(200,200);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==open){
	b1.setText("Hello");}
	else if(e.getSource()==copy){
		b1.setText("Chal Nikal");
	}
}
}
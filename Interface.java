

import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interface   {
	public static void main (String [] args) {
		
		JTextField Text = new JTextField ();
		level_of_damage T1= new level_of_damage();
		level_of_probability_of_attack T2=new level_of_probability_of_attack();
		
		JPanel p1=new JPanel(); 
		p1.setLayout(new GridLayout(10,1)); 
		
		JLabel L1 = new JLabel ();
		L1.setText("Величина ущерба");
		
		JComboBox CB1 = new JComboBox(T1.t1);
		
		JLabel L2 = new JLabel ();
		L2.setText("Уровень вероятности атаки");
		
		JComboBox CB2 = new JComboBox(T2.t2);

		JLabel L3 = new JLabel ();

		JButton b2 =new JButton("Вычислить оценку риска ИБ ");
		b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	risk_level_of_information_security q= new risk_level_of_information_security();
            	if (((String) CB1.getSelectedItem()=="") || ((String) CB2.getSelectedItem()==""))
{
		Text.setText("введены не верные данные");
}
            	Text.setText(q.level((String) CB1.getSelectedItem(),(String) CB2.getSelectedItem()));
            }    
       });
       
		L3.setText("Оценка риска ИБ");
		
		Text.setEditable(false);
		p1.add(L1);
		p1.add(CB1);
		p1.add(L2);
		p1.add(CB2);
		p1.add(b2);
		p1.add(L3);
		p1.add(Text);
		JFrame myWindow = new JFrame("Интерфэйс");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(400, 300);
		myWindow.setVisible(true); 
		myWindow.setContentPane(p1);
		}
		

}


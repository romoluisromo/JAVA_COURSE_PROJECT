import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
  private JMenuBar menubar;
  private JMenu menu1, menu2, menu3, menu4;
  private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6, menuitem7;
  private JTextField textfield1, textfield2, textfield3;
  private JTextArea textarea1;
  private JComboBox combo1, combo2;
  String rutaicon = "images/icon.png";
  String rutalogo = "images/logo-coca.png";

  public Principal(){
    setLayout(null);
    setTitle("Pantalla principal");
    setIconImage(new ImageIcon(getClass().getResource(rutaicon)).getImage());

    menubar = new JMenuBar();
    setJMenuBar(menubar);

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    menu2 = new JMenu("Color de fondo");
    menu1.add(menu2);

    menu3 = new JMenu("Calcular");
    menubar.add(menu3);

    menu4 = new JMenu("Acerca de");
    menubar.add(menu4);

    menuitem1 = new JMenuItem("Rojo");
    menuitem1.addActionListener(this);
    menu2.add(menuitem1);    

    menuitem2 = new JMenuItem("Negro");
    menuitem2.addActionListener(this);
    menu2.add(menuitem2);  

    menuitem3 = new JMenuItem("Morado");
    menuitem3.addActionListener(this);
    menu2.add(menuitem3);  

    menuitem4 = new JMenuItem("Nuevo");
    menuitem4.addActionListener(this);
    menu1.add(menuitem4);  

    menuitem5 = new JMenuItem("Salir");
    menuitem5.addActionListener(this);
    menu1.add(menuitem5);  

    menuitem6 = new JMenuItem("Vacaciones");
    menuitem6.addActionListener(this);
    menu3.add(menuitem6);  

    menuitem7 = new JMenuItem("El creador");
    menuitem7.addActionListener(this);
    menu4.add(menuitem7);  
 
    ImageIcon logo = new ImageIcon(rutalogo);    
    label1 = new JLabel(logo);
    label1.setBounds(10,10,300,100);
    add(label1);
    
  }  

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == menuitem5){
      System.exit(0);
    }
  }

  public static void main(String args[]){
    Principal principal = new Principal();
    principal.setBounds(0,0,500,400);
    principal.setVisible(true);
    principal.setResizable(false);
    principal.setLocationRelativeTo(null);
  }
}
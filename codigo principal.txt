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
    getContentPane().setBackground(new Color(255,0,0));
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
    label1.setBounds(5,5,230,80);
    add(label1);
    
    label2 = new JLabel("Bienvenido");
    label2.setBounds(290,30,200,40);
    label2.setFont(new Font("Andale Mono", 1, 30));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Datos del trabajador para el cálculo de vacaciones");
    label3.setBounds(40,110,620,40);
    label3.setFont(new Font("Andale Mono", 1, 23));
    label3.setForeground(new Color(255,255,255));
    add(label3);
    
    label4 = new JLabel("Nombre completo:");
    label4.setBounds(20,160,150,20);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);
  }  

  public void actionPerformed(ActionEvent e){
    Container fondo = this.getContentPane();

    if(e.getSource() == menuitem1){
      fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuitem2){
      fondo.setBackground(new Color(0,0,0));
    }
    if(e.getSource() == menuitem3){
      fondo.setBackground(new Color(87,35,100));
    }
    if(e.getSource() == menuitem5){
      System.exit(0);
    }
  }

  public static void main(String args[]){
    Principal principal = new Principal();
    principal.setBounds(0,0,650,550);
    principal.setVisible(true);
    principal.setResizable(false);
    principal.setLocationRelativeTo(null);
  }
}
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{

  private JLabel label1, label2;
  private JTextArea textarea1;
  private JCheckBox check1;
  private JButton boton1, boton2;
  String rutalogo = "images/coca-cola.png", rutaicon = "images/icon.png";
  
  public Licencia(){
    setLayout(null);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource(rutaicon)).getImage());
    
    ImageIcon logo = new ImageIcon(rutalogo);
    label1 = new JLabel(logo);
    label1.setBounds(280,150,200,100);
    add(label1);

    label2 = new JLabel("TÉRMINOS Y CONDICIONES");
    label2.setBounds(100,20,300,200);
    label2.setFont(new Font("Andale Mono", 1, 18));
    add(label2);
  }

  public static void main(String args[]){
    Licencia licencia = new Licencia();
    licencia.setBounds(0,0,500,400);
    licencia.setVisible(true);
    licencia.setResizable(false);
    licencia.setLocationRelativeTo(null);
  }
}
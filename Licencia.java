import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{

  private JLabel label1, label2;
  private JTextArea textarea1;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1;
  String rutalogo = "images/coca-cola.png", rutaicon = "images/icon.png";
  
  public Licencia(){
    setLayout(null);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource(rutaicon)).getImage());
    
    ImageIcon logo = new ImageIcon(rutalogo);
    label1 = new JLabel(logo);
    label1.setBounds(280,210,300,170);
    add(label1);

    label2 = new JLabel("TÉRMINOS Y CONDICIONES");
    label2.setBounds(150,20,300,40);
    label2.setFont(new Font("Andale Mono", 1, 18));
    add(label2);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0, 14));
    textarea1.setForeground(new Color(0,0,0));
    textarea1.setText("Terminos y condiciones:");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(20,80,520,160);
    add(scrollpane1);
    
    check1 = new JCheckBox("Yo Acepto");
    check1.setBounds(20,250,100,30);
    check1.addChangeListener(this);
    add(check1);
    
    boton1 = new JButton("Continuar");
    boton1.setBounds(20,300,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(150,300,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);
    
  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else {
        boton1.setEnabled(false);
        boton2.setEnabled(true);
      }
  } 

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      System.exit(0);
    }
    if(e.getSource() == boton2){
      System.exit(0);
    }
  } 

  public static void main(String args[]){
    Licencia licencia = new Licencia();
    licencia.setBounds(0,0,580,400);
    licencia.setVisible(true);
    licencia.setResizable(false);
    licencia.setLocationRelativeTo(null);
  }
}
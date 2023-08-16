import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{

  private JLabel label1, label2;
  private JTextArea textarea1;
  private JCheckBox check1;
  private JButton botonContinuar, botonNoAcepto;
  private JScrollPane scrollpane1;
  String rutalogo = "images/coca-cola.png", rutaicon = "images/icon.png";
  String nombre = "";
  
  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource(rutaicon)).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.usuario;
    
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
    
    check1 = new JCheckBox("Yo " + nombre +" Acepto");
    check1.setBounds(20,250,200,30);
    check1.addChangeListener(this);
    add(check1);
    
    botonContinuar = new JButton("Continuar");
    botonContinuar.setBounds(20,300,100,30);
    botonContinuar.addActionListener(this);
    botonContinuar.setEnabled(false);
    add(botonContinuar);

    botonNoAcepto = new JButton("No Acepto");
    botonNoAcepto.setBounds(150,300,100,30);
    botonNoAcepto.addActionListener(this);
    botonNoAcepto.setEnabled(true);
    add(botonNoAcepto);
    
  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
      botonContinuar.setEnabled(true);
      botonNoAcepto.setEnabled(false);
    } else {
        botonContinuar.setEnabled(false);
        botonNoAcepto.setEnabled(true);
      }
  } 

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == botonContinuar){
      Principal principal = new Principal();
      principal.setBounds(0,0,650,550);
      principal.setVisible(true);
      principal.setResizable(false);
      principal.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if(e.getSource() == botonNoAcepto){
      Bienvenida bienvenida = new Bienvenida();
      bienvenida.setBounds(0,0,350,450);
      bienvenida.setVisible(true);
      bienvenida.setResizable(false);
      bienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
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
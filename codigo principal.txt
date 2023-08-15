import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, 
                 labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, 
                 labelFooter;
  private JMenuBar menubar;
  private JMenu menuOpciones, menuColorFondo, menuCalcular, menuAcercaDe;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  private JComboBox comboDepartamento, comboAntiguedad;
  String rutaicon = "images/icon.png";
  String rutalogo = "images/logo-coca.png";

  public Principal(){
    setLayout(null);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource(rutaicon)).getImage());

    menubar = new JMenuBar();
    menubar.setBackground(new Color(255,0,0));
    setJMenuBar(menubar);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Andale Mono", 1, 14));
    menuOpciones.setForeground(new Color(255,255,255));
    menubar.add(menuOpciones);

    menuColorFondo = new JMenu("Color de fondo");
    menuColorFondo.setBackground(new Color(255,0,0));
    menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
    menuColorFondo.setForeground(new Color(255,0,0));
    menuOpciones.add(menuColorFondo);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255,0,0));
    menuCalcular.setFont(new Font("Andale Mono", 1, 14));
    menuCalcular.setForeground(new Color(255,255,255));
    menubar.add(menuCalcular);

    menuAcercaDe = new JMenu("Acerca de");
    menuAcercaDe.setBackground(new Color(255,0,0));
    menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
    menuAcercaDe.setForeground(new Color(255,255,255));
    menubar.add(menuAcercaDe);

    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Andale Mono", 1, 14));
    miRojo.setForeground(new Color(255,0,0));
    miRojo.addActionListener(this);
    menuColorFondo.add(miRojo);    

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono", 1, 14));
    miNegro.setForeground(new Color(255,0,0));
    miNegro.addActionListener(this);
    menuColorFondo.add(miNegro);  

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Andale Mono", 1, 14));
    miMorado.setForeground(new Color(255,0,0));
    miMorado.addActionListener(this);
    menuColorFondo.add(miMorado);  

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono", 1, 14));
    miNuevo.setForeground(new Color(255,0,0));
    miNuevo.addActionListener(this);
    menuOpciones.add(miNuevo);  

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1, 14));
    miSalir.setForeground(new Color(255,0,0));
    miSalir.addActionListener(this);
    menuOpciones.add(miSalir);  

    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono", 1, 14));
    miCalculo.setForeground(new Color(255,0,0));
    miCalculo.addActionListener(this);
    menuCalcular.add(miCalculo);  

    miElCreador = new JMenuItem("El creador");
    miElCreador.setFont(new Font("Andale Mono", 1, 14));
    miElCreador.setForeground(new Color(255,0,0));
    miElCreador.addActionListener(this);
    menuAcercaDe.add(miElCreador);  
 
    ImageIcon logo = new ImageIcon(rutalogo);    
    labelLogo = new JLabel(logo);
    labelLogo.setBounds(5,5,230,80);
    add(labelLogo);
    
    labelBienvenido = new JLabel("Bienvenido");
    labelBienvenido.setBounds(290,30,200,40);
    labelBienvenido.setFont(new Font("Andale Mono", 1, 30));
    labelBienvenido.setForeground(new Color(255,255,255));
    add(labelBienvenido);

    labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
    labelTitle.setBounds(40,110,620,40);
    labelTitle.setFont(new Font("Andale Mono", 1, 23));
    labelTitle.setForeground(new Color(255,255,255));
    add(labelTitle);
    
    labelNombre = new JLabel("Nombre(s):");
    labelNombre.setBounds(20,160,150,20);
    labelNombre.setFont(new Font("Andale Mono", 1, 13));
    labelNombre.setForeground(new Color(255,255,255));
    add(labelNombre);

    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(20,185,170,25);
    add(txtNombreTrabajador);

    labelAPaterno = new JLabel("Apellido Paterno:");
    labelAPaterno.setBounds(20,220,150,20);
    labelAPaterno.setFont(new Font("Andale Mono", 1, 13));
    labelAPaterno.setForeground(new Color(255,255,255));
    add(labelAPaterno);

    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(20,245,170,25);
    add(txtAPaternoTrabajador);

    labelAMaterno = new JLabel("Apellido Materno:");
    labelAMaterno.setBounds(20,280,150,20);
    labelAMaterno.setFont(new Font("Andale Mono", 1, 13));
    labelAMaterno.setForeground(new Color(255,255,255));
    add(labelAMaterno);

    txtAMaternoTrabajador = new JTextField();
    txtAMaternoTrabajador.setBounds(20,305,170,25);
    add(txtAMaternoTrabajador);

    labelDepartamento = new JLabel("Selecciona el Departamento:");
    labelDepartamento.setBounds(220,160,200,20);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 13));
    labelDepartamento.setForeground(new Color(255,255,255));
    add(labelDepartamento);
  
    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220,185,250,25);
    comboDepartamento.setBackground(new Color(224,224,224));
    comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
    comboDepartamento.setForeground(new Color(255,0,0));
    add(comboDepartamento);
    comboDepartamento.addItem("Atención al cliente");
    comboDepartamento.addItem("Departamento de Logística");
    comboDepartamento.addItem("Departamento de Gerencia");

    labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
    labelAntiguedad.setBounds(220,220,200,20);
    labelAntiguedad.setFont(new Font("Andale Mono", 1, 13));
    labelAntiguedad.setForeground(new Color(255,255,255));
    add(labelAntiguedad);
  
    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220,245,250,25);
    comboAntiguedad.setBackground(new Color(224,224,224));
    comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
    comboAntiguedad.setForeground(new Color(255,0,0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 años o más de servicio");

    labelResultado = new JLabel("Resultado del Cálculo:");
    labelResultado.setBounds(220,280,200,20);
    labelResultado.setFont(new Font("Andale Mono", 1, 13));
    labelResultado.setForeground(new Color(255,255,255));
    add(labelResultado);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(224,224,224));
    textarea1.setFont(new Font("Andale Mono", 1, 12));
    textarea1.setForeground(new Color(255,0,0));
    textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(220,305,400,100);
    add(scrollpane1);

    labelFooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
    labelFooter.setBounds(120,450,500,30);
    labelFooter.setFont(new Font("Andale Mono", 1, 13));
    labelFooter.setForeground(new Color(255,255,255));
    add(labelFooter);

  }  

  public void actionPerformed(ActionEvent e){
    Container fondo = this.getContentPane();

    if(e.getSource() == miRojo){
      fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == miNegro){
      fondo.setBackground(new Color(0,0,0));
    }
    if(e.getSource() == miMorado){
      fondo.setBackground(new Color(87,35,100));
    }
    if(e.getSource() == miSalir){
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
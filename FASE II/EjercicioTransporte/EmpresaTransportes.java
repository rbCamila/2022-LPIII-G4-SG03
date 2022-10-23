/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTransporte;

/**
 *
 * @author CAMILA
 */
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JList;
public class EmpresaTransportes extends JFrame{
    private final JLabel Titulo; 
    private final JLabel Nombre;
    private final JLabel Apellido;
    private final JLabel DNI;
    private final JLabel Fecha;
    private JComboBox Dia;
    private JComboBox Mes;
    private JComboBox Anio;
    
    private final JLabel extra;
    private final JTextField texNombre;
    private final JTextField texApellido;
    private final JTextField texDNI;
    private JCheckBox audifonos;
    private JCheckBox mantas;
    private JCheckBox revistas;
    private final JButton Registrar;
    private final JButton Reiniciar;
    private final JLabel nivel;
    private final JRadioButton primerPiso;
    private final JRadioButton segundoPiso;
    private final JLabel origen;
    private final JLabel destino;
    private JComboBox lugarOrigen;
    private JComboBox lugarDestino;
    private final JLabel TipoViaje;
    private JList tipo;
    private ButtonGroup grupoOpciones;
    
    private String Dias[] = 
    {"--","01","02","03","04","05","06","07","08","09","10",
        "11","12","13","14","15","16","17","18",
        "19","20","21","22","23","24","25","26",
        "27","28","29","30","31"};
    private String Meses[]= 
    { "------","Enero", "Febrero", "Marzo", "Abril","Mayo",
            "Junio", "Julio", "Agosto","Septiembre",
            "Octubre", "Noviembre", "Diciembre" };
    private String Anios[]= 
    { "----","2019", "2020","2021", "2022",
            "2023", "2024","2025", "2026"};
    private String tipoViaje[] = 
    { "      Economico            ", "      Estandar", "      VIP" };
    private String lugares[] = 
    { "----","Caraveli", "Camana", "Islay", "Arequipa",
        "Caylloma","Castilla","Condesuyos","La Union"};
    
public EmpresaTransportes() {           
    super("Prueba de Camila y Elmer");
    setLayout(new FlowLayout()); 
    Titulo = new JLabel("    >>>  Compra De Pasajes <<<    ");
    Titulo.setFont(new Font("Serif", Font.BOLD, 30));
    Titulo.setHorizontalTextPosition(SwingConstants.CENTER);
    add(Titulo);
    
    Nombre = new JLabel(" Ingresar Nombres:  ");
    add(Nombre);    
    texNombre = new JTextField("",20);
    add(texNombre); 
    
    Apellido = new JLabel(" Ingresar Apellidos: ");
    add(Apellido);    
    texApellido  = new JTextField("",20);
    add(texApellido); 
    
    DNI = new JLabel("Ingresar DNI          : ");
    add(DNI);
    texDNI = new JTextField("", 20);    
    add(texDNI); 
    
    Fecha = new JLabel("    Ingrese fecha de Viaje: ");
    add(Fecha);
    Dia = new JComboBox(Dias);
    add(Dia);
    Mes = new JComboBox(Meses);
    add(Mes);
    Anio = new JComboBox(Anios);
    add(Anio);
    
    TipoViaje= new JLabel("            Tipo de Viaje             :                 ");
    add(TipoViaje); 
    tipo = new JList(tipoViaje);
    tipo.setBackground(Color.CYAN);
    add(tipo);
    
    origen = new JLabel("                     Origen: ");
    add(origen);
    lugarOrigen = new JComboBox(lugares);
    add(lugarOrigen);
    destino = new JLabel("     Destino: ");
    add(destino);
    lugarDestino = new JComboBox(lugares);
    add(lugarDestino);
    
    nivel = new JLabel("Asiento por nivel: ");
    add(nivel);
    primerPiso = new JRadioButton("Primer piso");
    add(primerPiso);
    segundoPiso = new JRadioButton("Segundo piso");
    add(segundoPiso);
    grupoOpciones = new ButtonGroup();
    grupoOpciones.add(primerPiso);
    grupoOpciones.add(segundoPiso);
    
    extra = new JLabel("Elija servicio opcional: ");
    add(extra);
    audifonos = new JCheckBox("audifonos");
    mantas = new JCheckBox("mantas");
    revistas = new JCheckBox("revistas");
    add(audifonos);
    add(mantas);
    add(revistas);
    
    Registrar = new JButton("Registrar");
    add(Registrar);
    Reiniciar = new JButton("Reiniciar");
    add(Reiniciar);
    
    Manejador manejador = new Manejador();
    Registrar.addActionListener(manejador);
    Reiniciar.addActionListener(manejador);
 }   
    
  
private class Manejador implements ActionListener{
   
        @Override        
        public void actionPerformed(ActionEvent evento) 
        {            
            if (evento.getSource() == Registrar) {            
                String data = "                  \fRegistro de Viaje\f \n";
                String data1
                    =   "Nombres : "
                      + texNombre.getText() + "\n"
                      + "Apellidos : "
                      + texApellido.getText() + "\n"
                      + "DNI           : "
                      + texDNI.getText() + "\n";
    
                String data2
                    = "\nFecha de Viaje : "
                      + (String)Dia.getSelectedItem()
                      + " / " + (String)Mes.getSelectedItem()
                      + " / " + (String)Anio.getSelectedItem();
 
                String data3 = "\nTipo de servicio : "+tipo.getSelectedValue() ;
                String data4 = "\nOrigen : "+lugarOrigen.getSelectedItem();
                String data5 = "\nDestino : "+lugarDestino.getSelectedItem();
                String data6 = "\nPiso : " + (primerPiso.isSelected()
                                                 ? primerPiso.getText()
                                                 : "")+(segundoPiso.isSelected()?
                                                 segundoPiso.getText():"");
                String data7 = "\nServicios Extra : "+(audifonos.isSelected()
                                                 ? audifonos.getText()+", "
                                                 : ".")+(mantas.isSelected()
                                                 ? mantas.getText()+", "
                                                 : ".")+(revistas.isSelected()
                                                 ? revistas.getText()+" "
                                                 : ".");
                
                JOptionPane.showMessageDialog(null, data + data1 + data2 + data3 + data4 + data5 + data6 + data7, "Registro",JOptionPane.PLAIN_MESSAGE);
            
            }
            else if (evento.getSource() == Reiniciar) {
            String def = "";
            texNombre.setText(def);
            texApellido.setText(def);
            texDNI.setText(def);
            Dia.setSelectedIndex(0);
            Mes.setSelectedIndex(0);
            Anio.setSelectedIndex(0);
            tipo.clearSelection();
            lugarOrigen.setSelectedIndex(0);
            lugarDestino.setSelectedIndex(0);
            grupoOpciones.clearSelection();
            audifonos.setSelected(false);
            mantas.setSelected(false);
            revistas.setSelected(false);
            JOptionPane.showMessageDialog(null, "Se esta realizando el borrado de datos ingresados", "Error",JOptionPane.WARNING_MESSAGE);
            }  
        }
    }

    
}
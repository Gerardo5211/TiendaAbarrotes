
package Controlador;


import Modelo.ModeloUsuario;
import Vistas.Proveedores;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lpzlu
 */
public class ControladorProveedores implements ActionListener{
    
   // private Proveedores _view;
    private Proveedores _proved;
    private ModeloUsuario _model2;
    
     @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String leyenda="";
     
     if(e.getSource()==_proved.btninsertarproveedores){
         leyenda=_model2.alta("proveedores","null,'"+_proved.txtnombreproveedor.getText()+"','"+_proved.txtdireccionproveedores.getText()+"','"+_proved.txtgmailprovedores.getText()+"'"+_proved.txttelefonoprovedores.getText()+"'");
         JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
        limpiar();//se limpian las cajas de texto
         
         }
    
     if(e.getSource()==_proved.btneditarprovedor){
            leyenda = _model2.editar("proveedores", "nombre='"+_proved.txtnombreproveedor.getText()+"' , direcion = '"+_proved.txtdireccionproveedores.getText()+"', email = '"+_proved.txtgmailprovedores.getText()+"' , telefono= '"+_proved.txttelefonoprovedores, "idProducto = "+_proved.txtidproveedor.getText());
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    
    public void iniciar(){
        _proved.setTitle("MVC_Visual");
    }
    public  ControladorProveedores(Proveedores provedores,ModeloUsuario model){
        this._model2=model;
        this._proved=provedores;
        this._proved.btninsertarproveedores.addActionListener(this);
        this._proved.btneditarprovedor.addActionListener(this);
    }
        public void limpiar(){
        _proved.txtidproveedor.setText(null);  
        _proved.txtnombreproveedor.setText(null);
        _proved.txtdireccionproveedores.setText(null);
        _proved.txtgmailprovedores.setText(null);
        _proved.txtgmailprovedores.setText(null);
       
        
    }

}
        
        
        
        
        

package Controlador;


import Modelo.ModeloUsuario;

import Vistas.Productos;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lpzlu
 */
public class ControladorProductos implements ActionListener{
    
   // private Proveedores _view;
    private Productos _product;
    private ModeloUsuario _model;
    
     @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String leyenda="";
     
     if(e.getSource()==_product.btninsertarproductos){
         leyenda=_model.alta("prouctos","null,'"+_product.txtnombreproducto.getText()+"','"+_product.txtdescripcionproducto.getText()+"','"+_product.txtprecioproducto.getText()+"'");
         JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
        limpiar();//se limpian las cajas de texto
         
         }
    
     if(e.getSource()==_product.btneditarproductos){
            leyenda = _model.editar("productos", "nombre='"+_product.txtnombreproducto.getText()+"' , descripcion = '"+_product.txtdescripcionproducto.getText()+"' ,  precio= '"+_product.txtprecioproducto, "idProducto = "+_product.txtidproductoss.getText());
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    
    public void iniciar(){
        _product.setTitle("MVC_Visual");
    }
    public  ControladorProductos(Productos productoss,ModeloUsuario model){
        this._model=model;
        this._product=productoss;
        this._product.btninsertarproductos.addActionListener(this);
        this._product.btneditarproductos.addActionListener(this);
    }
        public void limpiar(){
        _product.txtidproductoss.setText(null);  
        _product.txtnombreproducto.setText(null);
        _product.txtdescripcionproducto.setText(null);
        _product.txtprecioproducto.setText(null);
       
        
    }

}
        
        
        
        
        
        
       
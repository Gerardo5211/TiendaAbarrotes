
package controlador;


import Modelo.ModeloUsuario;
import Vistas.Proveedores;
import Vistas.Productos;


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
    private Productos _product;
    private ModeloUsuario _model;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    String leyenda="";
     
     if(e.getSource()==_product.btninsertarproductos){
         leyenda=_model.alta("productos","null,'"+_product.txtnombreproducto.getText()+",'"+  _product.txtdescripcionproducto.getText()+"',"+
               "',"+  _product.txtprecioproducto.getText()+",'");
                 
           
     JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
     
     limpiar();//se limpian las cajas de texto
     //agregar otros botones si se necesitan implementar
        
     }
     
     
 //ELIMNAR     
     if(e.getSource()==_product.btneliminarproductos){
           
     JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
     
    limpiar();//se limpian las cajas de texto
         leyenda = _model.eliminar("productos", "id ="+ _product.txtidproductos.getText());
               
          leyenda = administradorBD.borrarRegistro("productos", "id = 4");
  //agregar otros botones si se necesitan implementar
        
    } ///MODFICAR
//     
     if(e.getSource()==_product.btneditarproductos){
            leyenda = _model.modificar("productos", "null,'"+_product.txtidproductos.getText()+"' , nombre = '"+ _product.txtnombreproducto.getText()+"' ,  descripcion= '"+_product.txtdescripcionproducto.getText()+"' , precio='"+_product.txtprecioproducto.getText()+"'","precio= "+_product.txtprecioproducto.getText());
            JOptionPane.showMessageDialog(null, leyenda);
         
        limpiar();//se limpian las cajas de texto
     //agregar otros botones si se necesitan implementar
        
        }
     
     
     //CONSULTAR
      if(e.getSource()==_product.btnconsultarproductos){
        
          String[]datos = new String[0];
          String consulta,info;
          DefaultTableModel TablaProductos = new DefaultTableModel();
          TablaProductos.addColumn("id_produtpos");
          TablaProductos.addColumn("nombreProductos");
          TablaProductos.addColumn("descripcion");
          TablaProductos.addColumn("precio");
      
         
         
          
          _product.tabla.setModel(TablaProductos);
          
          int i,j;
          
          consulta = _model.Consultar("productos","nombreProductos,Descripción,precio","id_productos>=1");
          datos = consulta.split(",");
          
          for(i=0; i<datos.length;i++){
              System.out.println(datos[i]);
          }
      
     }
    // poner tdododododododdo
    
    
    
    
    }
    
    public ControladorProveedores(Productos producto,ModeloUsuario model){
        this._model=model;
        this._product=producto;
        
        this._product.btninsertarproductos.addActionListener(this);
    }
    
    
    public void iniciar(){
        _product.setTitle("MVC_Visual");
    }
    
    public void limpiar(){
        _product.txtnombreproducto.setText(null);
        _product.txtdescripcionproducto.setText(null);
        _product.txtprecioproducto.setText(null);
       
    }
    
    }

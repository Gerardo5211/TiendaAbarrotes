package ABARROTES;

import controlador.ControladorProveedores;
import Vistas.Productos;
import Vistas.Proveedores;
import Modelo.ModeloUsuario;


public class abarrotes{

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Productos objV = new Productos();
      //  Productos objA = new Proveedores();
       // Productos objA = new Productos();
        ModeloUsuario objM = new ModeloUsuario();
        //abarrotes objM = new abarrotes();
        objV.setVisible(true);
     
        ControladorProveedores objC = new ControladorProveedores(objV,objM);
        
    }
    
}

package Controlador;

import Modelo.ModeloUsuario;
import Vistas.Cliente;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ulesg
 */
public class ControladorClientes implements ActionListener {
    
    private Cliente _client;
    private ModeloUsuario _model;
    public ControladorClientes(Cliente client, ModeloUsuario model)
    {
      this._client=client;
      this._model=model;
      
      this._client.btninsertarclientes.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String leyenda="";
        
         if(e.getSource() == _client.btninsertarclientes){
            leyenda = _model.alta("cliente", "null, '" +_client.txtnombrecliente.getText() + "','" +_client.txtapellidoclinetes.getText()+"','" +_client.txttelefonoclientes.getText()+","
           + _client.txtgmailclientes.getText() + "', '" + _client.txtdireccionclientes.getText() + "'");
            
            JOptionPane.showMessageDialog(null, leyenda);
            
        }
        
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgWEB;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pgkModelo.MDB;

/**
 *
 * @author gerar
 */
@WebService(serviceName = "WSBD")
public class WSBD {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }






    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public String eliminar(@WebParam(name = "tabla") final String tabla, @WebParam(name = "datos") final String datos) {
        //TODO write your implementation code here:
        
        
        MDB administradorBD = new MDB();
        String leyenda;
        leyenda = administradorBD.borrarRegistro(tabla, datos);
        
        return  leyenda;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultar")
    public String consultar(@WebParam(name = "tabla") final String tabla, @WebParam(name = "datos") final String datos, @WebParam(name = "condicion") final String condicion) {
        //TODO write your implementation code here:
        
        
         MDB administradorBD = new MDB();
        String leyenda;
        leyenda = administradorBD.borrarRegistro(tabla, datos);
        return  leyenda;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public String editar(@WebParam(name = "tabla") final String tabla, @WebParam(name = "datos") final String datos, @WebParam(name = "condicion") final String condicion) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "alta")
    public String alta(@WebParam(name = "tabla") final String tabla, @WebParam(name = "datos") final String datos) {
        //TODO write your implementation code here:
        return null;
    }




}

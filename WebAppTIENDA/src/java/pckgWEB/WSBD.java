/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgWEB;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

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
    @WebMethod(operationName = "Altas")
    public String Altas(@WebParam(name = "id_proveedor") String id_proveedor, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "gmail") String gmail, @WebParam(name = "telefono") String telefono) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eliminar")
    public String Eliminar(@WebParam(name = "id_proveedor") String id_proveedor, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "email") String email, @WebParam(name = "telefono") String telefono) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Editar")
    public String Editar(@WebParam(name = "id_proveedor") String id_proveedor, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "email") String email, @WebParam(name = "telefono") String telefono) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Consulta")
    public String Consulta() {
        //TODO write your implementation code here:
        return null;
    }

}

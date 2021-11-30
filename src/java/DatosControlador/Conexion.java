/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosControlador;

/**
 *
 * @author Carlos
 */
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedSatement;
//import com.mysql.jdbc.Statement;
//import com.mysql.jdbc.jdbc2.optional.*;
import java.sql.ResultSet;
import java.sql.SQLException;
//import javax.servelt.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.struts2.interceptor.SessionAware;
public class Conexion extends ActionSupport implements SessionAware{

    
    // Valores de la conexión a la Base de Datos con el SGBD
      final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    //la ruta de la conexion con el puerto 3306
    static final String DB_URL="jdbc:derby://localhost:1527/sample ";
    //Declaramos el usuario con el que vamos a acceder
    static final String USER="root";
    static final String PASSWD="root";
    
    //Variables para el return
    
    public String resultado="error";
   //success
    
    //Variables
    private String nickUsr;
    private String passwd;
    
    //generar los getters y setters de las variables

    public String getNickUsr() {
        return nickUsr;
    }

    public void setNickUsr(String nickUsr) {
        this.nickUsr = nickUsr;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    Connection ConexionBD=null;
    
    public String ConectarBD(){
        
        try{
            Class.forName(JDBC_DRIVER);
            ConexionBD=(Connection)DriverManager.getConnection(DB_URL, USER, PASSWD);
            resultado="success";
        }catch(Exception e)
        {
            resultado="error";
            
        }
        
        return resultado;
    }
    
    
    @Override
    public void setSession(Map<String, Object> map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

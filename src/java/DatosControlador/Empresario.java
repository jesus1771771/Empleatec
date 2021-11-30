/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosControlador;
//import DatosControlador.Conexion.JDBC_DIRVER;
import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.sql.*;
import com.mysql.jdbc.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class Empresario extends ActionSupport {
    
    //Metodo execute
    @Override
    public String execute () throws Exception{
        ConsultaEmpresarios();
        return SUCCESS;
    }
    
    // Valores de la conexión a la Base de Datos con el SGBD
    static  final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    //la ruta de la conexion con el puerto 3306
    static final String DB_URL="jdbc:mysql://localhost:3306/empleatecpw";
    //Declaramos el usuario con el que vamos a acceder
    static final String USER="root";
    static final String PASSWD="root";
    
    /*
    Datos del empresario
    nick
    nombre
    apaterno
    amaterno
    telefono
    correo
    passwd
    */
    // Colocamos las variables privadas para implementar el encapsulamiento.
    private String nickUsr;
    private String nombreUsr;
    private String apaternoUsr;
    private String amaternoUsr;
    private String telefonoUsr;
    private String correoUsr;
    private String passwdUsr;
    private String fRegistro;
    
    // Colocamos nuestra variable result.
    private String resultado;
    //Nueva variable result para la consulta de las empresas
    private String resultadoLE;

    public String getNickUsr() {
        return nickUsr;
    }

    public void setNickUsr(String nickUsr) {
        this.nickUsr = nickUsr;
    }

    public String getNombreUsr() {
        return nombreUsr;
    }

    public void setNombreUsr(String nombreUsr) {
        this.nombreUsr = nombreUsr;
    }

    public String getApaternoUsr() {
        return apaternoUsr;
    }

    public void setApaternoUsr(String apaternoUsr) {
        this.apaternoUsr = apaternoUsr;
    }

    public String getAmaternoUsr() {
        return amaternoUsr;
    }

    public void setAmaternoUsr(String amaternoUsr) {
        this.amaternoUsr = amaternoUsr;
    }

    public String getTelefonoUsr() {
        return telefonoUsr;
    }

    public void setTelefonoUsr(String telefonoUsr) {
        this.telefonoUsr = telefonoUsr;
    }

    public String getCorreoUsr() {
        return correoUsr;
    }

    public void setCorreoUsr(String correoUsr) {
        this.correoUsr = correoUsr;
    }

    public String getPasswdUsr() {
        return passwdUsr;
    }

    public void setPasswdUsr(String passwdUsr) {
        this.passwdUsr = passwdUsr;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getfRegistro() {
        return fRegistro;
    }

    public void setfRegistro(String fRegistro) {
        this.fRegistro = fRegistro;
    }
    
    
    
    
    //Lista de arreglo para recopilar a los empresarios que se eneucnetran registrados
    public List<Empresario> Empresario= new ArrayList<Empresario>();

    public List<Empresario> getEmpresario() {
        return Empresario;
    }

    public void setEmpresario(List<Empresario> Empresas) {
        this.Empresario = Empresas;
    }
    
    
    
    
    Conexion cnBD = new Conexion();
    
    //Variable para la conexion
    Connection conectandoBD=null;
    
    
    
    // Nuevo método de conectar
    public String ConectarBD(){
        
        try{
            Class.forName(JDBC_DRIVER);
            conectandoBD=(Connection)DriverManager.getConnection(DB_URL, USER, PASSWD);
            System.out.println("Direccción: "+conectandoBD);
            resultado="success";
        }catch(Exception e)
        {
            System.out.println("Problema con el driver por la excepcion: "+e);
            
            resultado="error";
            
        }
        
        return resultado;
    }
    
    
    //Método para almacenar un empresario
    public String NuevoEmpresario(){
        //Manda llamar el método conectar
          ConectarBD();
        try{
            String registrarE="insert into empresario values(?,?,?,?,?,?,?, now())";
            PreparedStatement DatosEmpresarioRegistro;
              DatosEmpresarioRegistro = (PreparedStatement)conectandoBD.prepareStatement(registrarE);
                    DatosEmpresarioRegistro.setString(1, nickUsr);
                    DatosEmpresarioRegistro.setString(2, nombreUsr);
                    DatosEmpresarioRegistro.setString(3, apaternoUsr);
                    DatosEmpresarioRegistro.setString(4, amaternoUsr);
                    DatosEmpresarioRegistro.setString(5, telefonoUsr);
                    DatosEmpresarioRegistro.setString(6, correoUsr);
                    DatosEmpresarioRegistro.setString(7, passwdUsr);
                    
                    //Finalmente ejecuta las instrucciones de la consulta
                    DatosEmpresarioRegistro.executeUpdate();
                    resultado="success";//success se utiliza para decir que fue exitoso
                    ConsultaEmpresarios();
        }catch(Exception ee)
        {
            System.out.println("ERROR de insercion");
        resultado="error";
        }
        
        
        
     return resultado;  
    }
    
    
    // Consulta para listar a los empresarios
    String resultadoCGE;
    public String ConsultaEmpresarios(){
        ConectarBD();
        Empresario.clear();
        try{
            String sentenciaConsulta="select * from empresario";
            PreparedStatement CGEmpresario=(PreparedStatement)
                    conectandoBD.prepareStatement(sentenciaConsulta);
            ResultSet datosConsultados=CGEmpresario.executeQuery(sentenciaConsulta);
            while(datosConsultados.next()){
                Empresario emp= new Empresario();
                //Toma como texto lo que encuentra en el campo consultado
                emp.setNickUsr(datosConsultados.getString("nickUsr"));
                emp.setNombreUsr(datosConsultados.getString("nombre"));
                emp.setApaternoUsr(datosConsultados.getString("apaterno"));
                emp.setAmaternoUsr(datosConsultados.getString("amaterno"));
                emp.setTelefonoUsr(datosConsultados.getString("telefono"));
                emp.setCorreoUsr(datosConsultados.getString("correo"));
                emp.setPasswdUsr(datosConsultados.getString("passwd"));
                emp.setfRegistro(datosConsultados.getString("fregistro"));
                this.Empresario.add(emp);
                
            }
            resultadoCGE="success";
            
            
        }catch(Exception ee){
            resultadoCGE="error";
        }
        return resultadoCGE;
        
    }
    
    
    //Consulta detallada de un solo empresario
    String resultadoDE;
    public String DetalleEmpresario(){
        ConectarBD();
        try{
            String consultaDE="select nickUsr,nombre, apaterno, amaterno, telefono, correo,passwd, fregistro from Empresario where nickUsr='"+nickUsr+"'";
            PreparedStatement datosEmpresario= 
                    (PreparedStatement)conectandoBD.prepareStatement(consultaDE);
            //datosEmpresario.setString(1, nickUsr);
            ResultSet RDEmpresario=datosEmpresario.executeQuery(consultaDE);
         
            while(RDEmpresario.next()){
                setNickUsr(RDEmpresario.getString("nickUsr"));
                setNombreUsr(RDEmpresario.getString("nombre"));
                setApaternoUsr(RDEmpresario.getString("apaterno"));
                setAmaternoUsr(RDEmpresario.getString("amaterno"));
                setCorreoUsr(RDEmpresario.getString("correo"));
                setTelefonoUsr(RDEmpresario.getString("telefono"));
                setPasswdUsr(RDEmpresario.getString("passwd"));
                setfRegistro(RDEmpresario.getString("fregistro"));
                
            }
                    
                resultadoDE="success";    
            
        }catch(Exception ee){
            resultadoDE="error";
        }
        return resultadoDE;
    }
    
    
    //Método para modificar un empresario
    //El nick del empresario no se va modificar
    String resultModEmpresario;
    public String ModificaEmpresario(){
        
        ConectarBD();
        try{
            String modEmpresario= "update empresario set nombre=?, apaterno=?, amaterno=?,telefono=?, correo=?, passwd=? where nickUsr=? ";
            PreparedStatement mE=(PreparedStatement)conectandoBD.prepareStatement(modEmpresario);
            mE.setString(1, nombreUsr);
            mE.setString(2, apaternoUsr);
            mE.setString(3, amaternoUsr);
            mE.setString(4, telefonoUsr);
            mE.setString(5, correoUsr);
            mE.setString(6, passwdUsr);
            mE.setString(7, nickUsr);
            mE.executeUpdate();
            resultModEmpresario="success";
        }catch(Exception e){
            resultModEmpresario="error";
        }
        
        return resultModEmpresario;
    }
    
    //Método elimina empresario
    String resultEE;
    public String EliminaEmpresario(){
        ConectarBD();
        try{
            String eliminaE="delete from empresario where nickUsr=?";
            PreparedStatement eE=(PreparedStatement)conectandoBD.prepareStatement(eliminaE);
            eE.setString(1, nickUsr);
            eE.executeUpdate();
            resultEE="success";
            
        }catch(Exception ee){
            resultEE="error";
        }
        return resultEE;
    }
    
    
    
    
    
}


package control;
import 

public class Conexion {
    private static final String drive="com.mysql.jdbc.Drive";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/Estudiante";
    
    Connection conectar=null;
    
    public Connection conexion(){
        try{
            Class.forName(Drive);
            conectar=(Connection)DriveManager.getConnection(url,user,pass);
        }
        
    }
}

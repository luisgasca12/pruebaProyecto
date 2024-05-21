package cdo.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
//	static final private String USUARIO_BD = "admin.cfdi";
//	static final private String PASSWORD_BD = "cfdi130920";
	
	static  private String USUARIO_BD = "";
	static  private String PASSWORD_BD = "";
	public static Connection AbrirConexionBD(String servidorCdo) throws Exception{
		Connection conexionBD = null;
		String nombreServidorBD = "";
		if(servidorCdo.equalsIgnoreCase("a03")) {
		USUARIO_BD = "admin.cfdi";
		PASSWORD_BD = "cfdi030519";
		//PRODUCTIVO
		nombreServidorBD = "jdbc:mysql://a03:3306/CFDI";
		}else {
		// System.out.println("Conexion: "+nombreServidorBD);
//			KWXKF		//PARA PUEBAS:
		if(servidorCdo.equalsIgnoreCase("kwx")) {
			 USUARIO_BD = "admin.cfdi";
			 PASSWORD_BD = "cfdi130920";
			 
		}else {
			USUARIO_BD = "admin.loader";
			PASSWORD_BD = "loader.admin";
		}
		nombreServidorBD = "jdbc:mysql://"+servidorCdo.toLowerCase()+":3306/"+servidorCdo.toUpperCase();
		}
		Class.forName("com.mysql.jdbc.Driver");
		conexionBD = DriverManager.getConnection(nombreServidorBD, USUARIO_BD, PASSWORD_BD);

		return conexionBD;
	}
}


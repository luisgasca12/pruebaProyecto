package cdo.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cdo.Datos.LogPDF;


public class Cls_Logs {
	public static void insertarLog(String cdo,String serie,String folio,String descripcion)
	{

	Connection connBD = null;
	PreparedStatement pstmt = null;
	String qry = "";
	try
	{
		qry = "INSERT INTO CFDI.l_log_cfdi "+
				 "(uname, "+
				  "serie, "+
				  "folio, " +
				  "descripcion, "+
				  "documento,"+
				  "documento_cfdi, "+
				  "ode,"+
				  "fecha_pro,"+
				  "hora_pro) "+
		  "VALUES " +
				"('" + cdo + "'," +
					"'"+serie+"', " +
				 ""+folio+", " +
				 "'"+descripcion+"', " +
				 "  ' ' , " +
				 "  ' ', " +
				 " 0, " +
				 "CURDATE(), " +
				 "CURTIME()); ";
		// System.out.println("qry log cfdi: "+qry);
		connBD = ConexionBD.AbrirConexionBD(cdo);
	//System.out.println(qry);
		pstmt = connBD.prepareStatement(qry);
		pstmt.executeUpdate();
	}
	catch(Exception ex)
	{
	}
	finally 
	{
		try 
		{
			connBD.close();
			pstmt.close();
		} 
		catch (SQLException e) {e.printStackTrace();}
	}
	}
	public static String Qry(String qry) 
	{
		return qry.toString().replace("'","´");
	}
}

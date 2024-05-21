package cdo.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cdo.Datos.LogPDF;
import cdo.Datos.Querys;
import cdo.Util.ClsQuery;
import cdo.Util.Cls_Logs;

public class GestorPDF {
	public static String recuperaCuerpo(String cdo, Connection connBD, PreparedStatement pstmt,
			List<Querys> listaQuerys, String serie, String folio) {
		String[] querys = new String[25];
		String cuerpo = ""; 
		try {			   
	        querys = ClsQuery.LimpiaListaQuerys(querys);
	        querys = ClsQuery.ObtieneQuerys(1,listaQuerys, querys);
	        ClsQuery.ImprimeQuerysConsola(querys, false, "query 1");
	        querys = inicializaQuery(cdo,serie,folio,querys);
	        ResultSet rs = ClsQuery.EjecutarQuery(querys[0], querys[1], querys[2], querys[3], querys[4], querys[5], querys[6], querys[7], querys[8], querys[9], querys[10], querys[11], 
					querys[12], querys[13], querys[14], querys[15], querys[16], querys[17], querys[18], querys[19], querys[20], querys[21], querys[22], querys[23], querys[24], cdo, pstmt, connBD);
	        while (rs.next())
            {
                try
                {
                	cuerpo = rs.getString("cuerpo");
                }
                catch (Exception e) 
                {	                	 
                   // System.out.println( "Error al obtener Ruta de almacenamiento: "+ e.toString());
                }
            }
		
		}catch(Exception e) {
			//Cls_Logs.insertarLog(new LogPDF(),cdo,"","","No se pudo recuperar el cuerpo del correo");
			//System.out.println("Error al entrar al metodo RecuperaRuta: " + e);
		}finally
		{
			try {connBD.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return cuerpo;
	}
	public static String recuperaBase64(String cdo, Connection connBD, PreparedStatement pstmt,
			List<Querys> listaQuerys, String serie, String folio, boolean valida) {
		String[] querys = new String[25];
		String base64 = ""; 
		try {			   
	        querys = ClsQuery.LimpiaListaQuerys(querys);
//	        if(cdo.equalsIgnoreCase("kwx")||cdo.equalsIgnoreCase("a03")) {
//	        	querys = ClsQuery.ObtieneQuerys(6,listaQuerys, querys); 
//	        }else {
	        	querys = ClsQuery.ObtieneQuerys(2,listaQuerys, querys); 
	    //    }
	        querys = inicializaQuery(cdo,serie,folio,querys);
	        ClsQuery.ImprimeQuerysConsola(querys, false, "query 2 ");
	        ResultSet rs = ClsQuery.EjecutarQuery(querys[0], querys[1], querys[2], querys[3], querys[4], querys[5], querys[6], querys[7], querys[8], querys[9], querys[10], querys[11], 
					querys[12], querys[13], querys[14], querys[15], querys[16], querys[17], querys[18], querys[19], querys[20], querys[21], querys[22], querys[23], querys[24], cdo, pstmt, connBD);
	        while (rs.next())
            {
                try
                {
//                	if(valida) {
                		base64 = rs.getString("base64");
//                	}else {
//                		base64 = rs.getString("base642");
//                	}
                	
                }
                catch (Exception e) 
                {	                	 
                   // System.out.println( "Error al obtener Ruta de almacenamiento: "+ e.toString());
                }
            }
		
		}catch(Exception e) {
			//Cls_Logs.insertarLog(new LogPDF(),cdo,"","","No se pudo recuperar la cadena del PDF del folio: "+folio+", serie: "+serie);
			//System.out.println("Error al entrar al metodo RecuperaRuta: " + e);
		}finally
		{
			try {connBD.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return base64;
	}
	public static String recuperaXML(String cdo, Connection connBD, PreparedStatement pstmt,
			List<Querys> listaQuerys, String serie, String folio) {
		String[] querys = new String[25];
		String xml = ""; 
		try {			   
	        querys = ClsQuery.LimpiaListaQuerys(querys);
	        querys = ClsQuery.ObtieneQuerys(3,listaQuerys, querys); 
	        querys = inicializaQuery(cdo,serie,folio,querys);
	        ClsQuery.ImprimeQuerysConsola(querys, false, "query 3 ");
	        ResultSet rs = ClsQuery.EjecutarQuery(querys[0], querys[1], querys[2], querys[3], querys[4], querys[5], querys[6], querys[7], querys[8], querys[9], querys[10], querys[11], 
					querys[12], querys[13], querys[14], querys[15], querys[16], querys[17], querys[18], querys[19], querys[20], querys[21], querys[22], querys[23], querys[24], cdo, pstmt, connBD);
	        while (rs.next())
            {
                try
                {
                xml = rs.getString("xml");
                }
                catch (Exception e) 
                {	                	 
                    System.out.println( "Error al obtener Ruta de almacenamiento: "+ e.toString());
                }
            }
		
		}catch(Exception e) {
			//Cls_Logs.(new LogPDF(),cdo,"","","No se pudo recuperar la cadena del XML del folio: "+folio+", serie: "+serie);
			//System.out.println("Error al entrar al metodo RecuperaRuta: " + e);
		}finally
		{
			try {connBD.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return xml;
	}

	private static String[] inicializaQuery(String cdo, String serie, String folio, String[] ListaQuerys) {
		for (int i=0;i <ListaQuerys.length; i++)
		{
			ListaQuerys[i]= ListaQuerys[i].replace("{SERIE}", serie);
			ListaQuerys[i]= ListaQuerys[i].replace("{FOLIO}", folio);
		}
		return ListaQuerys;
	}
	public static String recuperaRemitente(String cdo, Connection connBD, PreparedStatement pstmt, List<Querys> listaQuerys) {
		String[] querys = new String[25];
		String remitente = ""; 
		try {			   
	        querys = ClsQuery.LimpiaListaQuerys(querys);
	        querys = ClsQuery.ObtieneQuerys(4,listaQuerys, querys); 
	        ClsQuery.ImprimeQuerysConsola(querys, false, "query 2 ");
	        ResultSet rs = ClsQuery.EjecutarQuery(querys[0], querys[1], querys[2], querys[3], querys[4], querys[5], querys[6], querys[7], querys[8], querys[9], querys[10], querys[11], 
					querys[12], querys[13], querys[14], querys[15], querys[16], querys[17], querys[18], querys[19], querys[20], querys[21], querys[22], querys[23], querys[24], cdo, pstmt, connBD);
	        while (rs.next())
            {
                try
                {
                	remitente = rs.getString("remitente");
                }
                catch (Exception e) 
                {	                
                //	Cls_Logs.insertarLog(new LogPDF(),cdo,"","","No se pudo recuperar la pass");
                    //System.out.println( "Error al obtener Ruta de almacenamiento: "+ e.toString());
                }
            }
		
		}catch(Exception e) {
			//Cls_Logs.insertarLog(new LogPDF(),cdo,"","","No se pudo recuperar la remitente");
			//System.out.println("Error al entrar al metodo RecuperaRuta: " + e);
		}finally
		{
			try {connBD.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return remitente;
	}
	public static String recuperaPass(String cdo, Connection connBD, PreparedStatement pstmt,
			List<Querys> listaQuerys) {
		String[] querys = new String[25];
		String pass = ""; 
		try {			   
	        querys = ClsQuery.LimpiaListaQuerys(querys);
	        querys = ClsQuery.ObtieneQuerys(5,listaQuerys, querys); 
	        ClsQuery.ImprimeQuerysConsola(querys, false, "query  ");
	        ResultSet rs = ClsQuery.EjecutarQuery(querys[0], querys[1], querys[2], querys[3], querys[4], querys[5], querys[6], querys[7], querys[8], querys[9], querys[10], querys[11], 
					querys[12], querys[13], querys[14], querys[15], querys[16], querys[17], querys[18], querys[19], querys[20], querys[21], querys[22], querys[23], querys[24], cdo, pstmt, connBD);
	        while (rs.next())
            {
                try
                {
                	pass = rs.getString("pass");
                }
                catch (Exception e) 
                {	               
                	//Cls_Logs.insertarLog(new LogPDF(),cdo,"","","No se pudo recuperar la pass");
                   // System.out.println( "Error al obtener Ruta de almacenamiento: "+ e.toString());
                }
            }
		
		}catch(Exception e) {
		//	Cls_Logs.insertarLog(new LogPDF(),cdo,"","","No se pudo recuperar la pass");
			//System.out.println("Error al entrar al metodo RecuperaRuta: " + e);
		}finally
		{
			try {connBD.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return pass;
	}
	public static List<String> recuperaCorreos(String cdo, Connection connBD, PreparedStatement pstmt,
			List<Querys> listaQuerys, String grupo) {
		List<String> correos=new ArrayList<>();
		String[] querys = new String[25];
		try {			   
	        querys = ClsQuery.LimpiaListaQuerys(querys);
	        querys = ClsQuery.ObtieneQuerys(7,listaQuerys, querys); 
	        querys = inicializaQuery7(cdo,grupo,querys);
	        ClsQuery.ImprimeQuerysConsola(querys, false, "query 2 ");
	        ResultSet rs = ClsQuery.EjecutarQuery(querys[0], querys[1], querys[2], querys[3], querys[4], querys[5], querys[6], querys[7], querys[8], querys[9], querys[10], querys[11], 
					querys[12], querys[13], querys[14], querys[15], querys[16], querys[17], querys[18], querys[19], querys[20], querys[21], querys[22], querys[23], querys[24], cdo, pstmt, connBD);
	        while (rs.next())
            {
                try
                {
                	correos.add(rs.getString("correo"));
                }
                catch (Exception e) 
                {	                
                //	Cls_Logs.insertarLog(new LogPDF(),cdo,"","","No se pudo recuperar la pass");
                    //System.out.println( "Error al obtener Ruta de almacenamiento: "+ e.toString());
                }
            }
		
		}catch(Exception e) {
			//Cls_Logs.insertarLog(new LogPDF(),cdo,"","","No se pudo recuperar la remitente");
			//System.out.println("Error al entrar al metodo RecuperaRuta: " + e);
		}finally
		{
			try {connBD.close();} catch (SQLException e) {e.printStackTrace();}
			
		}
		return correos;
	}
	private static String[] inicializaQuery7(String cdo, String grupo, String[] ListaQuerys) {
		for (int i=0;i <ListaQuerys.length; i++)
		{
				ListaQuerys[i]= ListaQuerys[i].replace("{GRUPO}", grupo);
				
		}
		return ListaQuerys;
	}
}

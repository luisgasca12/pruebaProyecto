package cdo.Datos;

public class PdfXmlCartaPorte {
		
	private String uname;
	private String unameBr;
	private String idTrayecto;
	private String numChofer;
	private String idEstatus;
	private int codigoRespuesta;
	private String mensajeRespuesta;
	private String folioCartaPorte;
	private String codigoPdf;
	private String codigoXml;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUnameBr() {
		return unameBr;
	}
	public void setUnameBr(String unameBr) {
		this.unameBr = unameBr;
	}
	public String getIdTrayecto() {
		return idTrayecto;
	}
	public void setIdTrayecto(String idTrayecto) {
		this.idTrayecto = idTrayecto;
	}
	public String getNumChofer() {
		return numChofer;
	}
	public void setNumChofer(String numChofer) {
		this.numChofer = numChofer;
	}
	public String getIdEstatus() {
		return idEstatus;
	}
	public void setIdEstatus(String idEstatus) {
		this.idEstatus = idEstatus;
	}
	public int getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(int codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
	public String getFolioCartaPorte() {
		return folioCartaPorte;
	}
	public void setFolioCartaPorte(String folioCartaPorte) {
		this.folioCartaPorte = folioCartaPorte;
	}
	public String getCodigoPdf() {
		return codigoPdf;
	}
	public void setCodigoPdf(String codigoPdf) {
		this.codigoPdf = codigoPdf;
	}
	public String getCodigoXml() {
		return codigoXml;
	}
	public void setCodigoXml(String codigoXml) {
		this.codigoXml = codigoXml;
	}
	
	public PdfXmlCartaPorte() {
		super();
		this.uname = "";
		this.unameBr = "";
		this.idTrayecto = "";
		this.numChofer = "";
		this.idEstatus ="";
		this.codigoRespuesta = 0;
		this.mensajeRespuesta = "";
		this.folioCartaPorte = "";
		this.codigoPdf = "";
		this.codigoXml = "";
	}
	
	public PdfXmlCartaPorte(String uname, String unameBr, String idTrayecto, String numChofer, String idEstatus,
			int codigoRespuesta, String mensajeRespuesta, String folioCartaPorte, String codigoPdf, String codigoXml) {
		super();
		this.uname = uname;
		this.unameBr = unameBr;
		this.idTrayecto = idTrayecto;
		this.numChofer = numChofer;
		this.idEstatus = idEstatus;
		this.codigoRespuesta = codigoRespuesta;
		this.mensajeRespuesta = mensajeRespuesta;
		this.folioCartaPorte = folioCartaPorte;
		this.codigoPdf = codigoPdf;
		this.codigoXml = codigoXml;
	}
	
	
}

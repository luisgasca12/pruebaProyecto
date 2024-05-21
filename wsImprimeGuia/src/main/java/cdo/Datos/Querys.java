package cdo.Datos;

public class Querys {
	public int proceso;
    public int indice_query;
    public int sub_indice_query;
    public String descripcion;
    public String query;
     
     
    public Querys() {
        super();
        this.proceso =0;
        this.indice_query = 0;
        this.sub_indice_query = 0;
        this.descripcion = "";
        this.query = "";
    }


    public int getProceso() {
        return proceso;
    }
    public void setProceso(int proceso) {
        this.proceso = proceso;
    }
    public int getIndice_query() {
        return indice_query;
    }
   public void setIndice_query(int indice_query) {
        this.indice_query = indice_query;
    }
   public int getSub_indice_query() {
        return sub_indice_query;
    }
   public void setSub_indice_query(int sub_indice_query) {
        this.sub_indice_query = sub_indice_query;
    }
   public String getDescripcion() {
        return descripcion;
    }
   public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   public String getQuery() {
        return query;
    }
   public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "Querys [proceso=" + proceso + ", indice_query=" + indice_query + ", sub_indice_query="
                + sub_indice_query + ", descripcion=" + descripcion + ", query=" + query + "]";
    }
}

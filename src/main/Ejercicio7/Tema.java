public class Tema {
    private String codTema;
    private String descripcion;

    public Tema(String codTema, String descripcion) {
        this.codTema = codTema;
        this.descripcion = descripcion;
    }
    public String getCodTema() {
        return codTema;
    }
    public void setCodTema(String codTema) {
        this.codTema = codTema;
    }
}

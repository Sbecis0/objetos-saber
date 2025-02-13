import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int DNI;
    private List<Prestamoo> prestamos;
    private List<CompteCorrent> ccs;

    public Cliente(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        prestamos = new ArrayList<>();
        ccs = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void addPrestamo(Prestamoo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Prestamoo> getPrestamos() {
        return prestamos;
    }
    public List<CompteCorrent> getCcs() {
        return ccs;
    }
    public void addCcs(CompteCorrent cc) {
        this.ccs.add(cc);
    }

    @Override
    public String toString() {
        return "Cliente | " + "nombre=" + nombre + ", DNI=" + DNI;
    }
}

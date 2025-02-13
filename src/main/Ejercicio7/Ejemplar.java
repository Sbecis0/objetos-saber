public class Ejemplar {
    private int numReg;
    private Libro libro;

    public Ejemplar(int numReg, Libro libro) {
        this.numReg = numReg;
        this.libro = libro;
    }
    public int getNumReg() {
        return numReg;
    }
    public Libro getLibro() {
        return libro;
    }
}

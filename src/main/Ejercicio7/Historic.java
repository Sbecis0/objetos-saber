import java.util.Date;

public class Historic {
    private Ejemplar ejemplar;
    private Lector lector;
    private Date dateT;
    private Date dateP;

    public Historic(Ejemplar ejemplar, Lector lector, Date dateT, Date dateP) {
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.dateT = dateT;
        this.dateP = dateP;
    }
    public Ejemplar getEjemplar() {
        return ejemplar;
    }
    public Lector getLector() {
        return lector;
    }
    public Date getDateT() {
        return dateT;
    }
    public Date getDateP() {
        return dateP;
    }
}

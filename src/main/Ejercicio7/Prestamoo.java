
import java.util.Date;

public class Prestamoo {
        private Ejemplar ejemplar;
        private Lector lector;
        private Date dataP;

        public Prestamoo(Ejemplar ejemplar, Lector lector, Date dataP) {
            this.ejemplar = ejemplar;
            this.lector = lector;

            this.dataP = dataP;
        }
        public Ejemplar getEjemplar() {
            return ejemplar;
        }

        public Lector getLector() {
            return lector;
        }
        public Date getDataP() {
            return dataP;
        }
    }


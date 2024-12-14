package ec.espe.edu.estudiantes.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import jakarta.persistence.Column;
import java.math.BigDecimal;

@Embeddable
public class AulaPK implements Serializable {
    @Column(name = "COD_AULA", nullable = false)
    private BigDecimal codAula;
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codEdicio;
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String codEdificioBloque;

    public AulaPK(BigDecimal codAula, String codEdicio, String codEdificioBloque) {
        this.codAula = codAula;
        this.codEdicio = codEdicio;
        this.codEdificioBloque = codEdificioBloque;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAula == null) ? 0 : codAula.hashCode());
        result = prime * result + ((codEdicio == null) ? 0 : codEdicio.hashCode());
        result = prime * result + ((codEdificioBloque == null) ? 0 : codEdificioBloque.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AulaPK other = (AulaPK) obj;
        if (codAula == null) {
            if (other.codAula != null)
                return false;
        } else if (!codAula.equals(other.codAula))
            return false;
        if (codEdicio == null) {
            if (other.codEdicio != null)
                return false;
        } else if (!codEdicio.equals(other.codEdicio))
            return false;
        if (codEdificioBloque == null) {
            if (other.codEdificioBloque != null)
                return false;
        } else if (!codEdificioBloque.equals(other.codEdificioBloque))
            return false;
        return true;
    }

}

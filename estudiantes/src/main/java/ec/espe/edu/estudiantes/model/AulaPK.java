package ec.espe.edu.estudiantes.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
@Embeddable
public class AulaPK implements Serializable {
    @Column(name = "COD_AULA", nullable = false)
    private BigDecimal codAula;
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codEdicio;
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String codEdificioBloque;
}

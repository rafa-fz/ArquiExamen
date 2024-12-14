package ec.espe.edu.estudiantes.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import java.math.BigDecimal;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;

@Entity
@Table(name = "OFI_AULA")
public class Aula implements Serializable {
    @EmbeddedId
    private AulaPK pk;
    @Column(name = "COD_TIPO_AULA", length = 10, nullable = false)
    private String codTipoAula;
    @Column(name = "COD_ALTERNO", length = 10, nullable = false)
    private String codAlterno;
    @Column(name = "CAPACIDAD", nullable = false)
    private BigDecimal capacidad;
    @Column(name = "PISO", nullable = false)
    private BigDecimal piso;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ULT_ACTUALIZACION", nullable = false)
    private LocalDate fechaUltActualizacion;

    public Aula() {
    }

    public Aula(AulaPK pk) {
        this.pk = pk;
    }

    public AulaPK getPk() {
        return pk;
    }

    public void setPk(AulaPK pk) {
        this.pk = pk;
    }

    public String getCodTipoAula() {
        return codTipoAula;
    }

    public void setCodTipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getCodAlterno() {
        return codAlterno;
    }

    public void setCodAlterno(String codAlterno) {
        this.codAlterno = codAlterno;
    }

    public BigDecimal getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(BigDecimal capacidad) {
        this.capacidad = capacidad;
    }

    public BigDecimal getPiso() {
        return piso;
    }

    public void setPiso(BigDecimal piso) {
        this.piso = piso;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(LocalDate fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        Aula other = (Aula) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aula [pk=" + pk + ", codTipoAula=" + codTipoAula + ", codAlterno=" + codAlterno + ", capacidad="
                + capacidad + ", piso=" + piso + ", fechaCreacion=" + fechaCreacion + ", fechaUltActualizacion="
                + fechaUltActualizacion + "]";
    }

}

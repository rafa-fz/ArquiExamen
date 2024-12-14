package ec.espe.edu.estudiantes.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;

@Entity
@Table(name = "OFI_TIPO_AULA")
public class TipoAula implements Serializable {

    @Id
    @Column(name = "COD_TIPO_AULA", length = 10, nullable = false)
    private String codTipoAula;
    @Column(name = "DESCRIPCION", length = 128, nullable = false)
    private String descripcion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;

    public TipoAula() {
    }

    public TipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getCodTipoAula() {
        return codTipoAula;
    }

    public void setCodTipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codTipoAula == null) ? 0 : codTipoAula.hashCode());
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
        TipoAula other = (TipoAula) obj;
        if (codTipoAula == null) {
            if (other.codTipoAula != null)
                return false;
        } else if (!codTipoAula.equals(other.codTipoAula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TipoAula [codTipoAula=" + codTipoAula + ", descripcion=" + descripcion + ", fechaCreacion="
                + fechaCreacion + "]";
    }

}

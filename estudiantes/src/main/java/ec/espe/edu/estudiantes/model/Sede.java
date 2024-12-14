package ec.espe.edu.estudiantes.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "OFI_SEDE")
public class Sede implements Serializable {

    @Id
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codSede;
    @Column(name = "COD_INSTITUCION", length = 3, nullable = false)
    private BigDecimal codInstitucion;
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @Column(name = "DIRECCION", length = 128, nullable = false)
    private String direccion;
    @Column(name = "ES_PRINCIPAL", nullable = false)
    private Boolean esPrincipal;
    @Column(name = "PRESUPUESTO", precision = 18, scale = 2, nullable = false)
    private BigDecimal presupuesto;

    public Sede() {
    }

    public Sede(String codSede) {
        this.codSede = codSede;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public BigDecimal getCodInstitucion() {
        return codInstitucion;
    }

    public void setCodInstitucion(BigDecimal codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public BigDecimal getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(BigDecimal presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codSede == null) ? 0 : codSede.hashCode());
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
        Sede other = (Sede) obj;
        if (codSede == null) {
            if (other.codSede != null)
                return false;
        } else if (!codSede.equals(other.codSede))
            return false;
        return true;
    }

}

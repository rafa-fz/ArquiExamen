package ec.espe.edu.estudiantes.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "OFI_INSTITUCION")
public class Institucion implements Serializable {
    @Id
    @Column(name = "COD_INSTITUCION", length = 3, nullable = false)
    private BigDecimal codInstitucion;
    @Column(name = "RUC", length = 13, nullable = false)
    private String ruc;
    @Column(name = "RAZON_SOCIAL", length = 250, nullable = false)
    private String razonSocial;
    @Column(name = "NOMBRE_COMERCIAL", length = 250, nullable = false)
    private String nombreComercial;

    public Institucion() {
    }

    public Institucion(BigDecimal codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public BigDecimal getCodInstitucion() {
        return codInstitucion;
    }

    public void setCodInstitucion(BigDecimal codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codInstitucion == null) ? 0 : codInstitucion.hashCode());
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
        Institucion other = (Institucion) obj;
        if (codInstitucion == null) {
            if (other.codInstitucion != null)
                return false;
        } else if (!codInstitucion.equals(other.codInstitucion))
            return false;
        return true;
    }

}

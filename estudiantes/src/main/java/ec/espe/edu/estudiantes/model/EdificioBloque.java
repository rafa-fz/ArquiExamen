package ec.espe.edu.estudiantes.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFI_EDIFICIO_BLOQUE")
public class EdificioBloque implements Serializable {

    @Id
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String codEdificioBloque;
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codEdificio;
    @Column(name = "NOMBRE_BLOQUE", length = 128, nullable = false)
    private String nombreBloque;
    @Column(name = "DESCRIPCION", length = 500, nullable = false)
    private String descripcion;

    public EdificioBloque() {
    }

    public EdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public String getCodEdificioBloque() {
        return codEdificioBloque;
    }

    public void setCodEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        EdificioBloque other = (EdificioBloque) obj;
        if (codEdificioBloque == null) {
            if (other.codEdificioBloque != null)
                return false;
        } else if (!codEdificioBloque.equals(other.codEdificioBloque))
            return false;
        return true;
    }

}
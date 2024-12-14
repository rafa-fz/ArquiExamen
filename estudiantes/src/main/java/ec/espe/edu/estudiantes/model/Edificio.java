package ec.espe.edu.estudiantes.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "OFI_EDIFICIO")
public class Edificio implements Serializable {

    @Id
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codEdificio;
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codSede;
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    @Column(name = "COD_ALTERNO", length = 16, nullable = false)
    private String codAlterno;
    @Column(name = "DESCRIPCION", length = 500, nullable = false)
    private String descripcion;
    @Column(name = "DIRECCION", length = 256, nullable = false)
    private String direccion;
    @Column(name = "COMENTARIO", length = 1000)
    private String comentario;
    @Column(name = "MANEJA_BLOQUES", nullable = false)
    private Boolean manajaBloques;
    @Column(name = "POSEE_AULAS", nullable = false)
    private Boolean poseeAulas;
    @Column(name = "PISOS", length = 2, nullable = false)
    private BigDecimal pisos;

    @ManyToOne
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE", insertable = false, updatable = false)
    private Sede sede;

    public Edificio() {
    }

    public Edificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodAlterno() {
        return codAlterno;
    }

    public void setCodAlterno(String codAlterno) {
        this.codAlterno = codAlterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getManajaBloques() {
        return manajaBloques;
    }

    public void setManajaBloques(Boolean manajaBloques) {
        this.manajaBloques = manajaBloques;
    }

    public Boolean getPoseeAulas() {
        return poseeAulas;
    }

    public void setPoseeAulas(Boolean poseeAulas) {
        this.poseeAulas = poseeAulas;
    }

    public BigDecimal getPisos() {
        return pisos;
    }

    public void setPisos(BigDecimal pisos) {
        this.pisos = pisos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codEdificio == null) ? 0 : codEdificio.hashCode());
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
        Edificio other = (Edificio) obj;
        if (codEdificio == null) {
            if (other.codEdificio != null)
                return false;
        } else if (!codEdificio.equals(other.codEdificio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Edificio [codEdificio=" + codEdificio + ", codSede=" + codSede + ", nombre=" + nombre + ", codAlterno="
                + codAlterno + ", descripcion=" + descripcion + ", direccion=" + direccion + ", comentario="
                + comentario + ", manajaBloques=" + manajaBloques + ", poseeAulas=" + poseeAulas + ", pisos=" + pisos
                + "]";
    }

}

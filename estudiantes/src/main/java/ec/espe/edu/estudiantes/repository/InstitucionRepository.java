package ec.espe.edu.estudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.espe.edu.estudiantes.model.Institucion;
import java.math.BigDecimal;

public interface InstitucionRepository extends JpaRepository<Institucion, BigDecimal> {

}

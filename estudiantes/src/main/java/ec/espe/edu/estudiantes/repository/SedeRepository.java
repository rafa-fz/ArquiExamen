package ec.espe.edu.estudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.espe.edu.estudiantes.model.Sede;

public interface SedeRepository extends JpaRepository<Sede, String> {

}

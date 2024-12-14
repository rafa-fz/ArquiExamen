package ec.espe.edu.estudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.espe.edu.estudiantes.model.Edificio;

public interface EdificioRepository extends JpaRepository<Edificio, String> {

}

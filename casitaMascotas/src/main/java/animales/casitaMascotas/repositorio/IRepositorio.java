package animales.casitaMascotas.repositorio;

import animales.casitaMascotas.modelo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                  //Obtenemos metodos CRUD
public interface IRepositorio extends JpaRepository<Animal, Integer> {

}

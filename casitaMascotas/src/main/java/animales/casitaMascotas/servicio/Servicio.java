package animales.casitaMascotas.servicio;

import animales.casitaMascotas.modelo.Animal;
import animales.casitaMascotas.repositorio.IRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio implements IServicio {

    @Autowired
    private IRepositorio mascotaRepo;

    @Override
    public void saveAnimal(Animal ani) {
        mascotaRepo.save(ani);
    }

    @Override
    public void deleteAnimal(Integer id) {
        mascotaRepo.deleteById(id);
    }

    @Override          //En este metodo se usan metodos de esta misma clase
    public void editAnimal(Integer id, String nombre, String raza, Integer edad) {
        Animal ani = this.getAnimal(id);
        ani.setId(id);
        ani.setNombre(nombre);
        ani.setRaza(raza);
        ani.setEdad(edad);

        this.saveAnimal(ani);
    }

    @Override
    public Animal getAnimal(Integer ani) {
        Animal masco = mascotaRepo.findById(ani).orElse(null);
        return masco;
    }

    @Override
    public List<Animal> getAnimales() {
        List<Animal> listaAnimales = mascotaRepo.findAll();
        return listaAnimales;
    }


}

package animales.casitaMascotas.controlador;

import animales.casitaMascotas.modelo.Animal;
import animales.casitaMascotas.servicio.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controlador {

    @Autowired
    private IServicio mascotaServi;

    @GetMapping("/")
    public String inicio() {
        return "API funcionando";
    }

    @PostMapping("/crear")
    public String crearPersona(@RequestBody Animal ani){
        mascotaServi.saveAnimal(ani);
        return "El animal fué añadido exitosamente!";
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Integer id){
        mascotaServi.deleteAnimal(id);
        return "Se eliminó correctamente";
    }

    @PutMapping("/modificar/{id}")
    public String modificarPersona(@PathVariable Integer id, @RequestBody Animal ani){
        ani.setId(id);
        mascotaServi.saveAnimal(ani);
        return "Animal modificado exitosamente!";
    }

    @GetMapping("/animales")
    public List<Animal> listaAnimales(){
        List<Animal> listaAnimales = mascotaServi.getAnimales();
        return listaAnimales;
    }

    @GetMapping("/animal/{id}")
    public Animal mostrarAnimal(@PathVariable Integer id){
        return mascotaServi.getAnimal(id);
    }
}

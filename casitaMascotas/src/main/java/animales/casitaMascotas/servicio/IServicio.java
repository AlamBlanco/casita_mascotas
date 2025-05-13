package animales.casitaMascotas.servicio;

import animales.casitaMascotas.modelo.Animal;

import java.util.List;


public interface IServicio {

    //alta
    public void saveAnimal(Animal ani);

    //baja
    public void deleteAnimal(Integer id);

    //modificacion
    public void editAnimal(Integer id, String nombre, String raza, Integer edad);

    //lectura de un animal
    public Animal getAnimal(Integer ani);

    //lectura
    public List<Animal> getAnimales();
}

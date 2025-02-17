/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos_polimorfismo;

/**
 *
 * @author Soporte
 */
public class Animal {
  protected void hacerSonido(){
      System.out.println("El animal hace un sonido");
  }
}

class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wauf");
    }
}

class Gato extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace miau");
    }

}

class PruebaAnimal{

    // Metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        // Objeto de la clase Padre (Animal)
        //var animal = new Animal();
        //var animal = new Perro();
        var animal = new Gato();
        imprimirSonido(animal);
    }
}

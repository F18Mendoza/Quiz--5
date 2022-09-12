package ejercicio;


//3. Existen los super héroes, cada super héroe tiene sus propios poderes, 
//algunos no tienen poderes pero usan tecnología o artefactos para ser super. 
//Algunos son humanos, otros son extraterrestres y otros son criaturas artificiales. 
//Asumiendo que dependiendo de la especie que sean poseen características y habilidades propias; 
//y que sin importar la fuente de su poder lo pueden usar a su voluntad. Cómo diseñaría usted usando herencia e interfaces, 
//una jerarquía de objetos para modelar el mundo de los super héroes pensando en un futuro uso de polimorfismo
//cuando de los poderes se trata. Escriba su respuesta en Java. 75pts

public class mainP {

    public static void main (String []args){

        ser heroe = new ser();
        características amigo = new características();
        heroe.especie("humano");
        heroe.poder("tecnología");
        amigo.cosas();

    }
    
}


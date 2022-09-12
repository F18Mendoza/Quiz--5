package ejercicio;

public class características extends ser {

    public String vida;
    public String cancion;
    public String habilidad;

    public void cosas(){
        ser nuevoHeroe = new ser();
        if (nuevoHeroe.getEspecie() == "humano"){
            this.vida = "mortal";
            this.cancion = "blackbird";
            this.habilidad = "bondad";
            System.out.println(vida + cancion + habilidad);

        }
        if (nuevoHeroe.getEspecie() == "extraterestre"){
            this.vida = "mortal";
            this.cancion = "monster";
            this.habilidad = "fuerza";
            System.out.println(vida + cancion + habilidad);
        }
        if (nuevoHeroe.getEspecie() == "artificial"){
            this.vida = "inmortal";
            this.cancion = "clay";
            this.habilidad = "inteligencia";
            System.out.println(vida + cancion + habilidad);
        }
    }
}
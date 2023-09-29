package pokemon;

public class Mewtwo extends Pokemon implements Agua, Fuego {

    public Mewtwo(String nombre) {
        super(nombre);
    }

    @Override
    protected void placaje(Pokemon placaje) {
    //este ataque lo vamos a reservar
    }



    @Override
    public void llamarada(Pokemon llamarada) {
            //comprogbaciones en el if para que si el pokemon esta vivo
            if(this.vida>0){
                if(llamarada.vida>0){
                   llamarada.vida -= atacarFuego();//decrementamos ataque fuego
                }
        }
    }
    //ataque agua tiene mas daño a los tipo fuego
        @Override
    public void hidroBomba(Pokemon hidroBomba) {
           //comprogbaciones en el if para que si el pokemon esta vivo
            if(this.vida>0){
                if(hidroBomba.vida>0){
                    hidroBomba.vida-=atacar();//decrementamos en vida el metodo que teniamos atacar   
                }

            
        }
        }
    }
 



    


    
    






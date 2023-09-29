package pokemon;


public class Charizard extends Pokemon implements Fuego {

    public Charizard(String nombre) {
        super(nombre);
    }
    //aplicamos que placaje bajara 20 puntos de vida
    @Override
    protected void placaje(Pokemon placaje) {
        if(this.vida>0){
                if(placaje.vida>0){
                   placaje.vida -= 20; 
                }
                  
        }
    }
    //ataque tipo fuego, puede dejar tocado a mewtwo si es critico
    @Override
    public void llamarada(Pokemon llamarada) {
        //el mismo ataque que tiene mewtwo
            if(this.vida>0){
                if(llamarada.vida>0){
                   llamarada.vida -= atacarFuego();
                }
        }
        
    }

    }
    


    

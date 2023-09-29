package pokemon;

import java.util.Random;


public abstract class Pokemon {
    
    protected String nombre;
    protected int vida = 100;
    protected Random azar = new Random();

    public Pokemon(String nombre) {
        this.nombre = nombre;
        
    }
    //placaje el ataque que pueden todos los pokemon
    protected abstract void placaje(Pokemon placaje);
    
  //creamos una probabilidad de 1/5 para que dentro de ese rango haya un ataque se incremente el doble
    public boolean golpeCritico(){
       int valor = azar.nextInt(100);
        return valor%20 == 0;
    }
    
    	public int atacar() {
	//este ataque es mas potente y afectara mas al tipo fuego	
        int ataque = azar.nextInt(11) + 50;//ramdom para que no siempre los ataques afecten lo mismo
         if (golpeCritico()) {//metodo si el ataque agua es critico
                System.out.println("¡" + nombre + ": Golpe crítico! Es muy efectivo!");
                ataque =  (int)(ataque * 2);
        }

        System.out.println("Es muy efectivo!: " + ataque + " puntos");
        return ataque;
	}
        
        public int atacarFuego() {
	//sin embargo el atque fuego tendra menos daño pero podra dejar al otro pokemon muy tocado si llega a ser muy critico	
        int ataque = azar.nextInt(11) + 35;////ramdom para que no siempre los ataques afecten lo mismo
         if (golpeCritico()) {//metodo si el ataque agua es critico
                System.out.println("¡" + nombre + ": Golpe crítico! No es muy efectivo...");
                ataque =  (int)(ataque * 2);
        }

        System.out.println("No es muy efectivo...: " + ataque + " puntos");
        return ataque;
	}
             
        
    @Override
    public String toString(){
    return "Nombre: " +nombre+ "vida: "+vida;
    }
}

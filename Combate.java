package pokemon;

import java.util.Scanner;

public class Combate {
    public static void main(String[] args) {
         //un bienvenido y escoge pokemon sencillo
        System.out.println("BIENVENIDO AL MUNDO POKEMON");
        int numero = 0;
        while(numero!=1 && numero!=2){
        System.out.println("Que Pokemon eliges:\n1.Mewtwo\n2.Charizard");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        }
        //objetos y nombres asignados a los pokemon
        Mewtwo m1 = new Mewtwo("mew");
        Charizard c1 = new Charizard("char");
        //mientras la vida de los dos pokemon se mayor a 0 siguen los turnos
        while(m1.vida>0 && c1.vida>0){
        if(numero == 1){//si escogemos el primer pokemon empezara atacando
        
        int numAtaque = 0;
        //mientras la vida es mayor a 0 y los ataques son correctos
        while(m1.vida>0 && numAtaque!=1 && numAtaque!=2){
        System.out.println("Turno para Mewtwo");
        System.out.println("Que ataque quieres usar\n1.Llamarada\n2.Hidrobomba");
        Scanner sc = new Scanner(System.in);
        numAtaque = sc.nextInt();
        }//switch para los ataques
        switch (numAtaque) {
            case 1 -> {
                m1.llamarada(c1);
                System.out.println(c1.nombre+" tiene: "+c1.vida+" PS\n");
            }
            case 2 -> {
                m1.hidroBomba(c1);
                System.out.println(c1.nombre+" tiene: "+c1.vida+" PS\n");
            }

            default -> {
            }
        }
        //luego atacara el segundo pokemon 
        
        int numAtaque2 = 0;
        while(c1.vida>0 && numAtaque2!=1 && numAtaque2!=2){
        System.out.println("Turno para Charizard");
        System.out.println("Que ataque quieres usar\n1.Placaje\n2.Llamarada");
        Scanner sc = new Scanner(System.in);
        numAtaque2 = sc.nextInt();
        }
        switch (numAtaque2) {
            case 1 -> {
                c1.placaje(m1);
                System.out.println(m1.nombre+" tiene: "+m1.vida+" PS\n");
            }
            case 2 -> {
                c1.llamarada(m1);
                System.out.println(m1.nombre+ " tiene: "+m1.vida+" PS\n");
            }

            default -> {
            }
        
        
    }
        
         
    }else if(numero == 2){
        //si escogemos el segundo pokemon empezara el segundo 
        //en el primer turno esta explicado todo es lo mismo
        int numAtaque2 = 0;
        while(c1.vida>0 && numAtaque2!=1 && numAtaque2!=2){
        System.out.println("Turno para Charizard");
        System.out.println("Que ataque quieres usar\n1.Placaje\n2.Llamarada");
        Scanner sc = new Scanner(System.in);
        numAtaque2 = sc.nextInt();
        }
        switch (numAtaque2) {
            case 1 -> {
                c1.placaje(m1);
                System.out.println(m1.nombre+" tiene: "+m1.vida+" PS\n");
            }
            case 2 -> {
                c1.llamarada(m1);
                System.out.println(m1.nombre+ " tiene: "+m1.vida+" PS\n");
            }

            default -> {
            }
        
        
    }
    
        
        
        int numAtaque3 = 0;
        while(m1.vida>0 && numAtaque3!=1 && numAtaque3!=2){
        System.out.println("Turno para Mewtwo");
        System.out.println("Que ataque quieres usar\n1.Llamarada\n2.Hidrobomba");
        Scanner sc = new Scanner(System.in);
        numAtaque3 = sc.nextInt();
        }
        switch (numAtaque3) {
            case 1 -> {
                m1.llamarada(c1);
                System.out.println(c1.nombre+" tiene: "+c1.vida+" PS\n");
            }
            case 2 -> {
                m1.hidroBomba(c1);
                System.out.println(c1.nombre+" tiene: "+c1.vida+" PS\n");
            }

            default -> {
            }
        }
    
    }
       
        
        }
    //en caso que uno de los pokemon llege la vida a 0 o menos sale estos mensajes y acabaria el juego
                if(m1.vida <=0){
            System.out.println("ENHORABUENA "+c1.nombre +" HA GANADO!!");
        }else if(c1.vida <= 0){
        System.out.println("ENHORABUENA "+m1.nombre +" HA GANADO!!");
    }
    }


  
}

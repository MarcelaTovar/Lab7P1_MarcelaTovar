
package lab7p1_marcelatovar;
import java.util.*;
public class Lab7P1_MarcelaTovar {

    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner ObiWan = new Scanner(System.in);
        System.out.println("Bienvenido a mi laboratorio #5");
        System.out.println("¡Hola Stephanie!");
        System.out.println("¿Como desearías que te llamará?");
        String nombre = ObiWan.nextLine();
        int opcion = 0;
        do{
            System.out.println("---Menu---");
            System.out.println("1. El calamar Pablo");
            System.out.println("2. Torre de control");
            System.out.println("3. Salir");
            System.out.println("¿Que deseas hacer "+nombre +"?");
            opcion = ObiWan.nextInt();
            while(opcion != 1 || opcion !=2 || opcion !=3){
                break;
            }
            switch(opcion){
                case 1->{
                   Calamar(); 
                }
                case 2->{
                    TorreDeControl();
                }
            }
        }while(opcion == 1 || opcion == 2 || opcion !=3);
    }
    
    public static void Calamar(){
        Scanner ObiWan = new Scanner(System.in);
        System.out.println("¡Hola!");
        System.out.println("Ingrese la selección: ");
        System.out.println("1. Espana");
        System.out.println("2. Alemania");
        System.out.println("3. CostaRica");
        System.out.println("4. Japon");
        System.out.println("5. Belgica");
        System.out.println("6. Croacia");
        System.out.println("7. Canada");
        System.out.println("8. Marruecos");
        System.out.println("Ingrese el primer país: ");
        String opcion = ObiWan.next();
        System.out.println("Ingrese el segundo país: ");
        String opcion2 = ObiWan.next();
        System.out.println("Ingrese el tercer país: ");
        String opcion3 = ObiWan.next();
        System.out.println("Ingrese el cuarto país: ");
        String opcion4 = ObiWan.next();
        System.out.println("Ingrese el quinto país: ");
        String opcion5 = ObiWan.next();
        System.out.println("Ingrese el sexto país: ");
        String opcion6 = ObiWan.next();
        System.out.println("Ingrese el septimo país: ");
        String opcion7 = ObiWan.next();
        System.out.println("Ingrese el octavo país: ");
        String opcion8 = ObiWan.next();
        if(Validacion(opcion)&&Validacion(opcion2)&&Validacion(opcion3)&&Validacion(opcion4)&&Validacion(opcion5)&&Validacion(opcion6)&&Validacion(opcion7)&&Validacion(opcion8)){
          
           String minuscula = opcion.toLowerCase();
           String minuscula2 = opcion2.toLowerCase();
           String minuscula3 = opcion3.toLowerCase();
           String minuscula4 = opcion4.toLowerCase();
           String minuscula5 = opcion5.toLowerCase();
           String minuscula6 = opcion6.toLowerCase();
           String minuscula7 = opcion7.toLowerCase();
           String minuscula8 = opcion8.toLowerCase();
           Pais(minuscula);
              System.out.println("-------------------------------------");
           Pais(minuscula2);
           Pais(minuscula3);
              System.out.println("-------------------------------------");
           Pais(minuscula4);
              System.out.println("-------------------------------------");
            Pais(minuscula5);
              System.out.println("-------------------------------------");
            Pais(minuscula6);
              System.out.println("-------------------------------------");
            Pais(minuscula7);
              System.out.println("-------------------------------------");
            Pais(minuscula8);
              System.out.println("-------------------------------------");
   
           Selección alemania = new Selección("Grupo E", "Alemania", "Hansi Flick", 26, "Si", "Tercero", 0);
           Selección españa = new Selección("Grupo E", "España", "Luis Enrique", 26, "Si", "Primera", 0); 
           Selección costarica = new Selección("Grupo E", "Costa Rica", "Luis Fernando Suarez", 26, "No", "Cuarto", 0);
           Selección japon = new Selección("Grupo E", "Japón", "Hajime Moriyasu", 26, "No", "Segundo", 0);
           Selección belgica = new Selección("Grupo F", "Bélgica", "Roberto Martínez", 26, "No", "Primero", 0);
           Selección croacia = new Selección("Grupo F", "Croacia", "Zlatko Dalić", 26, "No", "Segundo", 0);
           Selección canada = new Selección("Grupo F", "Canadá", "John Herdamn", 26, "no", "Cuarto", 0);
           Selección marruecos = new Selección("Grupo F", "Marruecos", "Walid Regragui", 26, "No", "Tercero", 0);
           
           
           
           int random = new Random().nextInt((7-0)+1)+0;
           
           alemania.setGoles(new Random().nextInt((7-0)+1)+0);
           españa.setGoles(new Random().nextInt((7-0)+1)+0);
           costarica.setGoles(new Random().nextInt((7-0)+1)+0);
           japon.setGoles(new Random().nextInt((7-0)+1)+0);
           belgica.setGoles(new Random().nextInt((7-0)+1)+0);
           croacia.setGoles(new Random().nextInt((7-0)+1)+0);
           canada.setGoles(new Random().nextInt((7-0)+1)+0);
           marruecos.setGoles(new Random().nextInt((7-0)+1)+0);
           
           int golale = alemania.getGoles();
           int golesp = españa.getGoles();
           int golcosta = costarica.getGoles();
           int goljap = japon.getGoles();
           int golbel = belgica.getGoles();
           int golcroa = croacia.getGoles();
           int golcan = canada.getGoles();
           int golmarr = marruecos.getGoles();
           
           if(goljap > golcosta){
               System.out.println("Japón contra Costa Rica");
               System.out.println("Japon "+goljap+" Costa Rica "+golcosta);
               System.out.println("Ha ganado japon");
           }else if(goljap == golcosta){
               System.out.println("Japón contra Costa Rica");
               System.out.println("Japon "+goljap+" Costa Rica "+golcosta);
               System.out.println("Fue un empate");
           }
           else{
               System.out.println("Japón contra Costa Rica");
               System.out.println("Japon "+goljap+" Costa Rica "+golcosta);
               System.out.println("Ha ganado Costa Rica");
               
           }
           System.out.println("");
           if(golbel > golmarr){
               System.out.println("Belgica contra Maruecos");
               System.out.println("Belgica "+golbel+" Marruecos "+golmarr);
               System.out.println("Ha ganado Belgica");
           }else if (golbel == golmarr){
               System.out.println("Belgica contra Maruecos");
               System.out.println("Belgica "+golbel+" Marruecos "+golmarr);
               System.out.println("Fue un empate");
           }
           else{
               System.out.println("Belgica contra Maruecos");
               System.out.println("Belgica "+golbel+" Marruecos "+golmarr);
               System.out.println("Ha ganado Marruecos");
           }
           System.out.println("");
           if(golcan > golcroa){
               System.out.println("Croacia contra Canada");
               System.out.println("Canada "+golcan+" Croacia "+golcroa);
               System.out.println("Ha ganado Canada");
           }else if(golcan == golcroa){
               System.out.println("Croacia contra Canada");
               System.out.println("Canada "+golcan+" Croacia "+golcroa);
               System.out.println("Fue un empate");
           }
           else{
               System.out.println("Croacia contra Canada");
               System.out.println("Canada "+golcan+" Croacia "+golcroa);
               System.out.println("Ha ganado Croacia");
           }
           System.out.println("");
           if(golale > golesp){
               System.out.println("Alemania contra España");
               System.out.println("Alemania "+golale+" España "+golesp);
               System.out.println("Ha ganado Alemania");
           }else if(golale == golesp){
                System.out.println("Alemania contra España");
               System.out.println("Alemania "+golale+" España "+golesp);
               System.out.println("Fue un empate");
           }
           else{
               System.out.println("Alemania contra España");
               System.out.println("Alemania "+golale+" España "+golesp);
               System.out.println("Ha ganado España");
           }
        }
        else{
            System.out.println("Favor ingrese una selección válida");
            }
        
    }
    public static void Pais(String minuscula){
        Selección country=null;
        Selección alemania = new Selección("Grupo E", "Alemania", "Hansi Flick", 26, "Si", "Tercero", 0);
           Selección españa = new Selección("Grupo E", "España", "Luis Enrique", 26, "Si", "Primera", 0); 
           Selección costarica = new Selección("Grupo E", "Costa Rica", "Luis Fernando Suarez", 26, "No", "Cuarto", 0);
           Selección japon = new Selección("Grupo E", "Japón", "Hajime Moriyasu", 26, "No", "Segundo", 0);
           Selección belgica = new Selección("Grupo F", "Bélgica", "Roberto Martínez", 26, "No", "Primero", 0);
           Selección croacia = new Selección("Grupo F", "Croacia", "Zlatko Dalić", 26, "No", "Segundo", 0);
           Selección canada = new Selección("Grupo F", "Canadá", "John Herdamn", 26, "No", "Cuarto", 0);
           Selección marruecos = new Selección("Grupo F", "Marruecos", "Walid Regragui", 26, "No", "Tercero", 0);
        switch(minuscula){
                case "espana" ->{
                    System.out.println(españa);
                    country=españa;
                   
                }
                case "alemania"->{
                    System.out.println(alemania);
                    country=alemania;
                    
                }
                case "costarica"->{
                    System.out.println(costarica);
                    country=costarica;
                    
                }
                case "japon"->{
                    System.out.println(japon);
                    country=japon;
                   
                }
                case "belgica"->{
                    System.out.println(belgica);
                    country=belgica;
                    
                }
                case "croacia"->{
                    System.out.println(croacia);
                    country=croacia;
                  
                }
                case "canada"->{
                    System.out.println(canada);
                    country=canada;
                   
                }
                case "marruecos"->{
                    System.out.println(marruecos);
                    country=marruecos;
                   
                }
            }
        
    
    }
   /* public static Selección Country(String minuscula){
        Selección country = null;
        int random = new Random().nextInt((7-0)+1)+0;
    Selección alemania = new Selección("Grupo E", "Alemania", "Hansi Flick", 26, true, "Tercero", 0);
           Selección españa = new Selección("Grupo E", "España", "Luis Enrique", 26, true, "Primera", 0); 
           Selección costarica = new Selección("Grupo E", "Costa Rica", "Luis Fernando Suarez", 26, false, "Cuarto", 0);
           Selección japon = new Selección("Grupo E", "Japón", "Hajime Moriyasu", 26, false, "Segundo", 0);
           Selección belgica = new Selección("Grupo F", "Bélgica", "Roberto Martínez", 26, false, "Primero", 0);
           Selección croacia = new Selección("Grupo F", "Croacia", "Zlatko Dalić", 26, false, "Segundo", 0);
           Selección canada = new Selección("Grupo F", "Canadá", "John Herdamn", 26, false, "Cuarto", 0);
           Selección marruecos = new Selección("Grupo F", "Marruecos", "Walid Regragui", 26, false, "Tercero", 0);
        switch(minuscula){
                case "espana" ->{
                    españa.setGoles(random);
                    country=españa;
                    break;
                }
                case "alemania"->{
                    alemania.setGoles(random);
                    country=alemania;
                    break;
                }
                case "costarica"->{
                   costarica.setGoles(random);
                    country=costarica;
                    break;
                }
                case "japon"->{
                    japon.setGoles(random);
                    country=japon;
                    break;
                }
                case "belgica"->{
                    belgica.setGoles(random);
                    country=belgica;
                    break;
                }
                case "croacia"->{
                    croacia.setGoles(random);
                    country=croacia;
                    break;
                }
                case "canada"->{
                    
                    country=canada;
                    break;
                }
                case "marruecos"->{
                   
                    country=marruecos;
                    break;
                }
            }
        return country;
    
    }*/
    public static void TorreDeControl(){
        Scanner ObiWan = new Scanner(System.in);
        System.out.println("--Bienvenido al nuevo sistema de torre de control--");
        System.out.println("---Primer Avion---");
        System.out.println("Ingrese el modelo del avion: ");
        String modelo = ObiWan.nextLine();
        System.out.println("Ingrese el codigo: ");
        char codigo = ObiWan.next().charAt(0);
        System.out.println("Ingrese el año de fabricacion: ");
        int anio = ObiWan.nextInt();
        System.out.println("Ingrese la capacidad maxima: ");
        int capacidad = ObiWan.nextInt();
        System.out.println("Ingrese el peso del avion: ");
        int peso = ObiWan.nextInt();
        System.out.println("Ingrese el nombre de la aerolínea: ");
        ObiWan.nextLine();
        String aereo = ObiWan.nextLine();
        
        Avion Avion1 = new Avion ( modelo,  codigo,  anio,  capacidad,  peso,  aereo);
        System.out.println("---Se ha agregado el avion exitosamente---");
        
        System.out.println("---Segundo Avion---");
        System.out.println("--Bienvenido al nuevo sistema de torre de control--");
        System.out.println("Ingrese el modelo del avion: ");
        String modelo2 = ObiWan.nextLine();
        System.out.println("Ingrese el codigo: ");
        char codigo2 = ObiWan.next().charAt(0);
        System.out.println("Ingrese el año de fabricacion: ");
        int anio2 = ObiWan.nextInt();
        System.out.println("Ingrese la capacidad maxima: ");
        int capacidad2 = ObiWan.nextInt();
        System.out.println("Ingrese el peso del avion: ");
        int peso2 = ObiWan.nextInt();
        System.out.println("Ingrese el nombre de la aerolínea: ");
        ObiWan.nextLine();
        String aereo2 = ObiWan.nextLine();
        Avion Avion2 = new Avion ( modelo2,  codigo2,  anio2,  capacidad2,  peso2,  aereo2);
        System.out.println("---Se ha agregado el avion exitosamente---");
        
        System.out.println("---Tercer Avion---");
        System.out.println("--Bienvenido al nuevo sistema de torre de control--");
        System.out.println("Ingrese el modelo del avion: ");
        String modelo3 = ObiWan.nextLine();
        System.out.println("Ingrese el codigo: ");
        char codigo3 = ObiWan.next().charAt(0);
        System.out.println("Ingrese el año de fabricacion: ");
        int anio3 = ObiWan.nextInt();
        System.out.println("Ingrese la capacidad maxima: ");
        int capacidad3 = ObiWan.nextInt();
        System.out.println("Ingrese el peso del avion: ");
        int peso3 = ObiWan.nextInt();
        System.out.println("Ingrese el nombre de la aerolínea: ");
        ObiWan.nextLine();
        String aereo3 = ObiWan.nextLine();
        Avion Avion3 = new Avion ( modelo3,  codigo3,  anio3,  capacidad3,  peso3,  aereo3);
        System.out.println("---Se ha agregado el avion exitosamente---");
        
        
        String opcion = "";
        
        do{
        System.out.println("¿Desea cambiar el estado de un avión?(Ingrese S si la respuesta es sí y N si la respuesta es no");
        opcion = ObiWan.next();

        switch(opcion){
            
            case "S" ->{
                System.out.println("Aviones disponibles(Ingrese numero): ");
                System.out.println(Avion1.getModelo());
                System.out.println(Avion2.getModelo());
                System.out.println(Avion3.getModelo());
                int opcion2 = ObiWan.nextInt();
                if(opcion2 <=3){
                switch(opcion2){
                    case 1 ->{
                        System.out.println("---Se ha elegido el avion "+Avion1.getModelo()+"---");
                        System.out.println("Estados disponibles: ");
                        System.out.println("1. Despegando");
                        System.out.println("2. Aterrizando");
                        System.out.println("3. Estacionado");
                        int opcion3 = ObiWan.nextInt();
                        if(opcion3 > 3){
                            System.out.println("Favor ingrese un número válido");
                            break;
                        }else{
                        
                        if(opcion3 == 1){
                         Avion1.setEstado("Despegando");
                         
                        }else if(opcion3 == 2){
                             Avion1.setEstado("Aterrizando");
                        }else if (opcion3 ==3){
                           Avion1.setEstado("Estacionado"); 
                        }
                         System.out.println("El avion "+Avion1.getModelo()+" ahora está "+Avion1.getEstado());
                        break;
                        }
                    }
                    case 2 ->{
                        System.out.println("---Se ha elegido el avion "+Avion2.getModelo()+"---");
                        System.out.println("Estados disponibles: ");
                        System.out.println("1. Despegando");
                        System.out.println("2. Aterrizando");
                        System.out.println("3. Estacionado");
                        int opcion3 = ObiWan.nextInt();
                         if(opcion3 == 1){
                         Avion2.setEstado("Despegando");
                         
                        }else if(opcion3 == 2){
                             Avion2.setEstado("Aterrizando");
                        }else if(opcion3 ==3){
                           Avion2.setEstado("Estacionado"); 
                        }
                         System.out.println("El avion "+Avion2.getModelo()+" ahora está "+Avion2.getEstado());
                         break;
                    }
                    case 3 ->{
                        System.out.println("---Se ha elegido el avion "+Avion3.getModelo()+"---");
                        System.out.println("Estados disponibles: ");
                        System.out.println("1. Despegando");
                        System.out.println("2. Aterrizando");
                        System.out.println("3. Estacionado");
                        int opcion3 = ObiWan.nextInt();
                         if(opcion3 == 1){
                         Avion3.setEstado("Despegando");
                         
                        }else if(opcion3 == 2){
                             Avion3.setEstado("Aterrizando");
                        }else if(opcion3 ==3){
                           Avion3.setEstado("Estacionado"); 
                        }
                         System.out.println("El avion "+Avion3.getModelo()+" ahora está "+Avion3.getEstado());
                         break;
                    }
                }
            }else{
                    System.out.println("Favor ingrese un numero valido");
                }
        }
        

        
    }
    }while(!opcion.equalsIgnoreCase("N") || opcion.equalsIgnoreCase("S"));
}
    public static boolean Validacion(String opcion){
         if(opcion.equalsIgnoreCase("Alemania") || opcion.equalsIgnoreCase("Espana") ||opcion.equalsIgnoreCase("CostaRica") || opcion.equalsIgnoreCase("Japon") || opcion.equalsIgnoreCase("Belgica") || opcion.equalsIgnoreCase("Marruecos") || opcion.equalsIgnoreCase("Canada") || opcion.equalsIgnoreCase("Croacia")){
    return true;
         }else{
             return false;
         }
    }
}

    

    


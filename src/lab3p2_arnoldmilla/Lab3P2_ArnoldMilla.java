package lab3p2_arnoldmilla;
import java.util.*;

public class Lab3P2_ArnoldMilla {

    
    public static void main(String[] args) {
        String nats [] = {"timido","energetico","misterioso"};
        ArrayList <Pokemon> pokes = new ArrayList();
        ArrayList <Pokebola> pokebolas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        System.out.println("-------Menu------- \n"
                + "1. Crear Pokemon \n"
                + "2. Crear Pokebola \n"
                + "3. Listar Pokemon \n"
                + "4. Eliminar Pokemon \n"
                + "5. Capturar Pokemon \n"
                + "6. Modificar Pokemon \n"
                + "7. Salir");
        int opc = sc.nextInt();
        while (opc != 7){
            switch (opc){
                case 1:{//Opcion para crear un pokemon
                    System.out.println("Crear pokemon");
                    System.out.println("Ingrese nombre del pokemon");
                    String name = scS.nextLine();
                    System.out.println("Ingrese la naturaleza del pokemon");////Sin tildes :)
                    String nat = scS.nextLine();
                    boolean retirar = false;
                    while (retirar == false){
                        for (int cont = 0; cont < nats.length; cont++) {
                            if(nat.equalsIgnoreCase(nats[cont])){
                                retirar = true;
                                break;
                            }
                            else{
                                retirar = false;                               
                            }
                            
                        }
                        if(retirar == false){
                                System.out.println("Naturaleza no valida");
                                System.out.println("Ingrese la naturaleza del pokemon");
                                nat = scS.nextLine();                    
                        }
                    }
                    
                    System.out.println("Ingrese el id del pokemon");
                    int id = sc.nextInt();
                    System.out.println("¿De que tipo es el pokemon? \n"
                            + "1. fuego \n"
                            + "2. grama \n"
                            + "3. agua");
                    int opc2 = sc.nextInt();
                    while (opc2 != 1 && opc2 != 2 && opc2 != 3){
                        System.out.println("Tipo no valido ingrese otron tipo");
                        System.out.println("¿De que tipo es el pokemon? \n"
                            + "1. fuego \n"
                            + "2. grama \n"
                            + "3. agua");
                        opc2 = sc.nextInt();
                    }
                    switch (opc2){
                        case 1:{///fuego
                            System.out.println("Ingrese la potencia de las llamas");
                            int potencia = sc.nextInt();
                            pokes.add(new fire_Type(potencia, name, nat, id, null));
                        }break;
                        
                        case 2:{///grass
                            System.out.println("Ingrese el habitat donde vive el pokemon");
                            String habitat = scS.nextLine();
                            System.out.println("Ingrese su dominio de las plantas");
                            int dom = sc.nextInt();
                            pokes.add(new grass_Type(habitat, dom, name, nat, id, null));
                        }break;
                        
                        case 3:{////agua
                            System.out.println("¿Puede vivir dentro del agua? [s/n]");
                            char life = sc.next().charAt(0);
                            boolean vivir;
                            if(life == 's' || life == 'S'){
                                vivir = true;
                            }
                            else{
                                vivir = false;
                            }
                            System.out.println("Ingrese la velocidad a la que puede nadar");
                            int velocidad = sc.nextInt();
                            pokes.add(new water_Type(vivir, velocidad, name, nat, id, null));
                        }break;
                    }
                }break;
                
                case 2:{//////crear una pokebola
                    System.out.println("Crear pokebola");
                    System.out.println("Ingrese el color de la pokebola");
                    String color = scS.nextLine();
                    System.out.println("Ingrese el numero de serie de la pokebola");
                    int serie = sc.nextInt();
                    System.out.println("Ingrese la eficiencia de la pokebola con un numero del 1 al 3");
                    int efficiencia = sc.nextInt();
                    pokebolas.add(new Pokebola(color, serie, efficiencia));
                }break;
                
                case 3:{///////listar pokes dependiendo del tipo
                    System.out.println("Lista de pokemons");
                    for (int cont = 0; cont < pokes.size(); cont++) {
                        if(pokes.get(cont) instanceof fire_Type){
                            System.out.println(cont + " - " + pokes.get(cont));
                        }
                    }
                    
                    for (int cont = 0; cont < pokes.size(); cont++) {
                        if(pokes.get(cont) instanceof water_Type){
                            System.out.println(cont + " - " + pokes.get(cont));
                        }
                    }
                    
                    for (int cont = 0; cont < pokes.size(); cont++) {
                        if(pokes.get(cont) instanceof grass_Type){
                            System.out.println(cont + " - " + pokes.get(cont));
                        }
                    }
                }break;
                
                case 4:{//Eliminar pokemon
                    System.out.println("Ingrese el tipo de pokemon que quiera eliminar \n"
                            + "1. Fuego\n"
                            + "2. Grama\n"
                            + "3. Agua");
                    int opc3 = sc.nextInt();
                    switch(opc3){
                        case 1:{////eliminar tipo fuego
                            for (int cont = 0; cont < pokes.size(); cont++) {
                                if(pokes.get(cont) instanceof fire_Type){
                                    System.out.println(pokes.indexOf(pokes.get(cont)) +  "-" + pokes.get(cont));
                                }
                            }
                            System.out.println("Ingrese la posicion del pokemon que quiere eliminar");
                            int pos = sc.nextInt();
                            
                            if(pokes.get(pos)instanceof fire_Type || pos < pokes.size() || pos >= 0){
                                pokes.remove(pos);
                                System.out.println("Pokemon eliminado");
                            }
                            else{
                                System.out.println("Posicion no valida");
                            }
                        }break; 
                        
                        case 2:{/////eliminar tipo grama
                            for (int cont = 0; cont < pokes.size(); cont++) {
                                if(pokes.get(cont) instanceof grass_Type){
                                    System.out.println(pokes.indexOf(pokes.get(cont)) +  "-" + pokes.get(cont));
                                }
                            }
                            System.out.println("Ingrese la posicion del pokemon que quiere eliminar");
                            int pos = sc.nextInt();
                            
                            if(pokes.get(pos)instanceof grass_Type || pos < pokes.size() || pos >= 0){
                                pokes.remove(pos);
                                System.out.println("Pokemon eliminado");
                            }
                            else{
                                System.out.println("Posicion no valida");
                            }
                        }break;
                        
                        case 3:{/////eliminar tipo agua
                            for (int cont = 0; cont < pokes.size(); cont++) {
                                if(pokes.get(cont) instanceof water_Type){
                                    System.out.println(pokes.indexOf(pokes.get(cont)) +  "-" + pokes.get(cont));
                                }
                            }
                            System.out.println("Ingrese la posicion del pokemon que quiere eliminar");
                            int pos = sc.nextInt();
                            
                            if(pokes.get(pos)instanceof water_Type || pos < pokes.size() || pos >= 0){
                                pokes.remove(pos);
                                System.out.println("Pokemon eliminado");
                            }
                            else{
                                System.out.println("Posicion no valida");
                            }
                        }
                    }///fin opc3 switch
                }break;
                
                case 5:{////capturar
                
                }break;////fin emulacion capturar
                
                case 6:{/////Modificar pokemon
                    System.out.println("Modificar pokemon");
                    
                    System.out.println("Ingrese el tipo de pokemon que quiera eliminar \n"
                            + "1. Fuego\n"
                            + "2. Grama\n"
                            + "3. Agua");
                    int opc3 = sc.nextInt();
                    switch(opc3){
                        case 1:{////modificar tipo fuego
                            for (int cont = 0; cont < pokes.size(); cont++) {
                                if(pokes.get(cont) instanceof fire_Type){
                                    System.out.println(pokes.indexOf(pokes.get(cont)) +  "-" + pokes.get(cont));
                                }
                            }
                            System.out.println("Elija la posicion del pokemon a modificar");
                            int pos = sc.nextInt();
                            
                            System.out.println("Elija opcion a modificar \n"
                                    + "1. Nombre\n"
                                    + "2. Numero de pokedex\n"
                                    + "3. Potencia de llamas");
                            int modif = sc.nextInt();
                            
                            if(pokes.get(pos)instanceof fire_Type && pos < pokes.size() && pos >= 0){                               
                                if(modif == 1){////cambiar nombre tipo fuego
                                    System.out.println("Ingrese nuevo nombre");
                                    String newname = scS.nextLine();
                                    pokes.get(pos).setNombre(newname);
                                }
                                else if(modif == 2){/////cambiar id de tipo fuego
                                    System.out.println("Ingrese el nuevo id");
                                    int newid = sc.nextInt();
                                    pokes.get(pos).setId(newid);
                                }
                                else if(modif == 3){/////cambiar potencia de fuego
                                    System.out.println("Ingrese la nueva potencia de llamas");
                                    int newpot = sc.nextInt();
                                    fire_Type nuevotipo = (fire_Type) pokes.get(pos);
                                    nuevotipo.setPotencia(newpot);
                                    pokes.set(pos, nuevotipo);
                                }
                                else{
                                
                                }
                            }
                            else{
                                System.out.println("Posicion no valida");
                            }
                        }break; 
                        
                        case 2:{/////modificar tipo grama
                            for (int cont = 0; cont < pokes.size(); cont++) {
                                if(pokes.get(cont) instanceof grass_Type){
                                    System.out.println(pokes.indexOf(pokes.get(cont)) +  "-" + pokes.get(cont));
                                }
                            }
                            System.out.println("Elija la posicion del pokemon a modificar");
                            int pos = sc.nextInt();
                            
                            System.out.println("Elija opcion a modificar \n"
                                    + "1. Nombre\n"
                                    + "2. Numero de pokedex\n"
                                    + "3. Habitat");
                            int modif = sc.nextInt();
                            
                            if(pokes.get(pos)instanceof grass_Type && pos < pokes.size() && pos >= 0){                               
                                if(modif == 1){////cambiar nombre tipo grama
                                    System.out.println("Ingrese nuevo nombre");
                                    String newname = scS.nextLine();
                                    pokes.get(pos).setNombre(newname);
                                }
                                else if(modif == 2){/////cambiar id de tipo grama
                                    System.out.println("Ingrese el nuevo id");
                                    int newid = sc.nextInt();
                                    pokes.get(pos).setId(newid);
                                }
                                else if(modif == 3){/////cambiar habitat
                                    System.out.println("Ingrese el nuevo habitat");
                                    String newH = scS.nextLine();
                                    grass_Type nuevotipo = (grass_Type) pokes.get(pos);
                                    nuevotipo.setHabitat(newH);
                                    pokes.set(pos, nuevotipo);
                                }
                                else{
                                
                                }
                            }
                            else{
                                System.out.println("Posicion no valida");
                            }
                        }break;
                        
                        case 3:{/////modificar tipo agua
                            for (int cont = 0; cont < pokes.size(); cont++) {
                                if(pokes.get(cont) instanceof water_Type){
                                    System.out.println(pokes.indexOf(pokes.get(cont)) +  "-" + pokes.get(cont));
                                }
                            }
                            System.out.println("Elija la posicion del pokemon a modificar");
                            int pos = sc.nextInt();
                            
                            System.out.println("Elija opcion a modificar \n"
                                    + "1. Nombre\n"
                                    + "2. Numero de pokedex\n"
                                    + "3. Puede vivir fuera del agua");
                            int modif = sc.nextInt();
                            
                            if(pokes.get(pos)instanceof water_Type && pos < pokes.size() && pos >= 0){                               
                                if(modif == 1){////cambiar nombre tipo agua
                                    System.out.println("Ingrese nuevo nombre");
                                    String newname = scS.nextLine();
                                    pokes.get(pos).setNombre(newname);
                                }
                                else if(modif == 2){/////cambiar id de tipo grama
                                    System.out.println("Ingrese el nuevo id");
                                    int newid = sc.nextInt();
                                    pokes.get(pos).setId(newid);
                                }
                                else if(modif == 3){/////cambiar habitat
                                    System.out.println("¿Puede el pokemon vivir fuera del agua? s/n");
                                    char newV = scS.next().charAt(0);
                                    boolean verif = false;
                                    if (newV == 's' || newV == 'S'){
                                        verif = true;
                                    }
                                    water_Type nuevotipo = (water_Type) pokes.get(pos);
                                    nuevotipo.setVivir(verif);
                                    pokes.set(pos, nuevotipo);
                                }
                                else{
                                
                                }
                            }
                            else{
                                System.out.println("Posicion no valida");
                            }
                        }break;
                }
            }break;///fin switch de la opcion
            
        }///fin while de menu para salir
                System.out.println("-------Menu------- \n"
                + "1. Crear Pokemon \n"
                + "2. Crear Pokebola \n"
                + "3. Listar Pokemon \n"
                + "4. Eliminar Pokemon \n"
                + "5. Capturar Pokemon \n"
                + "6. Modificar Pokemon \n"
                + "7. Salir");
                opc = sc.nextInt();
    }
    } 
}

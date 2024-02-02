package lab3p2_arnoldmilla;
import java.util.*;

public class Lab3P2_ArnoldMilla {

    
    public static void main(String[] args) {
        String nats [] = {"timido","energetico","misterioso"};
        ArrayList <Pokemon> pokes = new ArrayList();
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
                    System.out.println("Ingrese nombre del pokemon");
                    String name = scS.nextLine();
                    System.out.println("Ingrese la naturaleza del pokemon");
                    String nat = scS.nextLine();
                    boolean retirar = false;
                    while (retirar != true){
                        for (int cont = 0; cont < nats.length; cont++) {
                            if(nats[cont].equals(nat)){
                                retirar = true;
                            }
                            else{
                                retirar = false;
                        }
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
                    while (opc2 != 1 || opc2 != 2 || opc2 != 3){
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
                
                case 2:{
                
                }break;
                
                case 3:{
                
                }break;
                
                case 4:{
                
                }break;
                
                case 5:{
                
                }break;
                
                case 6:{
                
                }break;
            }///fin switch de la opcion
            System.out.println("-------Menu------- \n"
                + "1. Crear Pokemon \n"
                + "2. Crear Pokebola \n"
                + "3. Listar Pokemon \n"
                + "4. Eliminar Pokemon \n"
                + "5. Capturar Pokemon \n"
                + "6. Modificar Pokemon \n"
                + "7. Salir");
            opc = sc.nextInt();
        }///fin while de menu para salir
    }
    
}

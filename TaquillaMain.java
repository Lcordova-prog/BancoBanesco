
package Banco;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.io.*; 


public class TaquillaMain {

    
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        LocalTime hora =  LocalTime.now();
        Date fechaActual = new Date();
        Cola imprimir = new Cola();
        int opcion = 0;
        int opcion1 = 0;
        int tiempo1 = 3;
        int atender = 0;
        int ce;
        Cola cola = new Cola();
        Pila pila = new Pila();
       
        do{
            try{                          
                 System.out.println(sdf.format(fechaActual)+" "+hora+"\n"
                         + "Bienvenido al Banco Banesco\n"
                         + "Preciona 1 para iniciar el programa\n"
                         + "Precione 2 para salir");
                int ce1;
                opcion = ce1 = leer.nextInt();
                 switch(opcion){
                   
                 case 1:
                     do{
                     System.out.println("\n 1.Agregar personas a la cola\n"
                             + "2. Hacer un deposito\n"
                             + "3. Consulta de saldo\n"
                             + "4. Hacer un retiro\n"
                             + "5. Actualizar libreta\n"
                             + "6. Pagar servicio\n"
                             + "7. Ver cola\n"
                             + "8 Atender\n"
                             + "9. Salir del banco");
                       opcion1 = ce = leer.nextInt();
                       
                       if(atender < 5) {
                              
                       switch(opcion1){
                          

                         case 1:
                             Cola d = new Cola();
                             System.out.println("Introduzca nombre y cedula para ingresar a la cola");
                             System.out.println("Nombre: ");
                             String nombre = bf.readLine();
                             System.out.println("Cedula");
                             int cliente = leer.nextInt();
                             cola.taquilla(cliente, nombre);
                           
                             break;
                             
                              case 2:
                                    atender ++;

                                  if (tiempo1 == 3) {
                      System.out.println("Por favor espere 3 minutos....");
                     System.out.println(".....");
                       System.out.println("...");
                    System.out.println("Ya puede ser atendido");
                    System.out.println("Introduzca la cantidad de dinero que va a depositar");
                                  int c = leer.nextInt();
                                pila.deposito(c);
                            
        }     

                                  
                                
                                  break;
                                  
                              case 3:
                                   atender ++;
                                  if (!pila.vacioPila()) {
                                      System.out.println("Saldo disponible: "+ pila.Mostrar());  
                                  } else {
                                      System.out.println("Saldo disponible: "+"0");
                                  }
                                    
                                  break;
                              case 4:
                                   atender ++;
                                  if (!pila.vacioPila()) {
                                       System.out.println("Se retiro una cantidad de: "+pila.retiro()+"$");   
                                  }else{
                                      System.out.println("No hay dinero");
                                  }
                                 
                                  
                                  break;
                                  
                                  
                              case 6:
                                  int opcion3 =0;
                                   int opcion4 = 0;   
                                  int c;
                                  do{
                                      try{
                                          System.out.println("1. Luz = 20$"); 
                                         opcion3 = c  = leer.nextInt();
                                      }catch(NumberFormatException a){
                                          System.out.println("error");
                                      }
                                   

                                 

                                  
                         switch(opcion3){
                                  case 1:
                                  int cantidad;
                                  int Luz = 20;
                                      if (!pila.vacioPila()) {
                                     System.out.println("Pago exitoso!!. Saldo actual: "+pila.cima());                                    

                                      }else{
                                          System.out.println("No tienes dinero para pagar");
                                      }
                                 break;
                              }
                                   }while(opcion3 != 3);
                                  break;
                              case 7:
                                  if(!cola.vaciaCola()){
                              cola.MostrarCola();

                                  }else{
                                      System.out.println("Ya no hay personas");
                                  }
                                  break;
                                  
                              case 8:
                                  atender = 0;
                                  if (!cola.vaciaCola()){
                         System.out.print("Se atendio al numero de cedula: "+cola.SalirBanco());
                                     
                         if (!cola.vaciaCola()) {
                                         System.out.println(" Ahora se atiende: "+cola.siguiente()); 
                                      }
            
                         
                                
                                  }else{
                             System.out.println("No hay personas");

                                  }
                                  break;
                       }
                    
                      
                                                
              
                     
                         }else{
                          
                           if (!cola.vaciaCola()){ 
                                atender = 0;
           System.out.println("Ya no puede hacer mas operaciones, Pase a la siguiente persona");
                           }
                              
                           }
                             
                         
                         
                       
                             
                             
                     
                     

                     }while(opcion1 != 9); 
                     
                 break;
                 
                 }   
            }catch(NumberFormatException e){
                
            }
                          
                    
        
             
            
        }while(opcion !=2);
    }
    
}

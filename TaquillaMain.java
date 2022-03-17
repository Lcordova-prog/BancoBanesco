
package Banco;

import java.util.Scanner;


public class TaquillaMain {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int opcion1 = 0;
        int ce;
        Cola cola = new Cola();
       
        do{
            try{
                 System.out.println("Bienvenido al Banco Banesco\n"
                         + "Preciona 1 para iniciar el programa\n"
                         + "Precione 2 para salir");
                int ce1;
                opcion = ce1 = leer.nextInt();
                 switch(opcion){
                   
                 case 1:
                     do{
                     System.out.println("1.Agregar personas a la cola\n"
                             + "2. Hacer un deposito\n"
                             + "3. Consulta de saldo\n"
                             + "4. Hacer un retiro\n"
                             + "5. Actualizar libreta\n"
                             + "6. Pagar servicio\n"
                             + "7. Ver cola\n"
                             + "8. Salir del banco");
                       opcion1 = ce = leer.nextInt();
                     switch(opcion1){
                         
                         case 1:
                             System.out.println("Introduzca la cedula para ingresar a la cola");
                             int cliente = leer.nextInt();
                             cola.taquilla(cliente);
                             break;
                             
                              case 2:
                                  System.out.println("Introduzca la cantidad de dinero que va a depositar");
                                  int dinero = leer.nextInt();
                                  cola.deposito(dinero);
                     break;
                      }
                    
              
                     
                             
                             
                     
                     
                     }while(opcion != 8);           
                 break;
                 }   
            }catch(NumberFormatException e){
                
            }
                          
                    
        
             
            
        }while(opcion !=2);
    }
    
}

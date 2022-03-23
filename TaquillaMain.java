
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalTime hora =  LocalTime.now();
        Date fechaActual = new Date();
        int opcion = 0;
        int opcion1 = 0;
       float tiempo =  8.00F;
        int atender = 0;
        int ce;
        String nombre = "";
        Cola cola = new Cola();
      
        Pila pila = new Pila();
       
        do{
            try{                          
                 System.out.println(sdf.format(fechaActual)+" "+hora+"\n"
                         + "Bienvenido a Banesco Banco Universal, C.A. (Banesco)\n"
                         + "Preciona 1 para iniciar el programa\n"
                         + "Precione 2 para salir");
                int ce1;
                opcion = ce1 = leer.nextInt();
                 switch(opcion){
                   
                 case 1:
                     do{
                         if (tiempo >= 450) {
                             System.out.println("Cierre del Banco");
                              
                                        try(
            FileWriter fw = new FileWriter("Clientes_Pendientes1.in", true);
            FileReader fr = new FileReader("Clientes_Pendientes1.in")
                ){
            fw.write("Pendientes: "+cola.MostrarCola()); 

            fw.flush();
            int valor = fr.read();
            while(valor !=-1){
               
                valor = fr.read();
            }
        }catch(IOException e){
                            System.out.println("ERROR E/S: "+e);
        }
        
                             opcion = ce1 = leer.nextInt();
                         }else{
                           System.out.println("Hora: "+tiempo+"\n 1.Agregar personas a la cola\n"
                             + "2. Hacer un deposito\n"
                             + "3. Consulta de saldo\n"
                             + "4. Hacer un retiro\n"
                             + "5. Actualizar libreta\n"
                             +"6. Pagar servicios\n"
                             + "7. Ver cola\n"
                             + "8 Atender\n"
                             + "9. Atender prioridad\n"
                             + "10. Salir del banco");
                       opcion1 = ce = leer.nextInt();

                       if(atender < 5) {
                              
                       switch(opcion1){
                             case 1:
                             Cola d = new Cola();
                             System.out.println("Introduzca nombre y cedula para ingresar a la cola");
                             System.out.println("Nombre: ");
                              nombre = bf.readLine();
                             System.out.println("Edad");
                             int cliente = leer.nextInt();
                             cola.taquilla(cliente, nombre);
                           
                             break;
                             
                              case 2:
                                  
                                  tiempo += 3;
                                    atender ++;

                                 
                         System.out.println("Por favor espere 3 minutos....");
                         System.out.println(".....");
                         System.out.println("...");
                         System.out.println("Ya puede ser atendido");
                         System.out.println("Introduzca la cantidad de dinero que va a depositar");
                                  int c = leer.nextInt();
                                pila.deposito(c);
                                  break;
                                  
                              case 3:
                              tiempo += 1.5;
                        System.out.println("Por favor espere 1.5 minutos....");
                        System.out.println(".....");
                        System.out.println("...");
                        System.out.println("Ya puede ser atendido");
                                    atender ++;
                                  if (!pila.vacioPila()) {
                                      System.out.println("Saldo disponible: "+ pila.Mostrar());  
                                  } else {
                                      System.out.println("Saldo disponible: "+"0");
                                  }
                                    
                                  break;
                              case 4:
                        System.out.println("Por favor espere 4 minutos....");
                        System.out.println(".....");
                        System.out.println("...");
                        System.out.println("Ya puede ser atendido");
                                  tiempo += 4;
                                   atender ++;
                                  if (!pila.vacioPila()) {
                                       System.out.println("Se retiro una cantidad de: "+pila.retiro()+"$");   
                                  }else{
                                      System.out.println("No hay dinero");
                                  }
                                 
                                  
                                  break;
                              case 5:
                                  tiempo += 5;
                        System.out.println("Por favor espere 5 minutos....");
                        System.out.println(".....");
                        System.out.println("...");
                        System.out.println("Ya puede ser atendido");
                                                      
                        
                                  int pe = 0;  
                                do{
                                      try{
                        System.out.println("1. Actualizar libreta\n"
                                         + "2. Salir");                   
                                            pe = c  = leer.nextInt();

                                      }catch(NumberFormatException W){
                        System.out.println("ERROR");
                                      }
                        switch(pe){
                            case 1:
                        System.out.println("Cargando........");
                        System.out.println("    Cargando.......");
                        System.out.println("            Cargando......");
                        System.out.println("Libreta Actualizada!!");
                                  break;
                                    
                                    }
                                  
                                  }while(pe != 2);
                                   break;
                                
                                  
                              case 6:
                                  tiempo += 2;
                        System.out.println("Por favor espere 2 minutos....");
                        System.out.println(".....");
                        System.out.println("...");
                        System.out.println("Ya puede ser atendido");
                                 tiempo += 2;
                                  int opcion3 =0;
                                  int cc = 0;
                                  do{
                                      try{
                        System.out.println("Hora: "+tiempo);
                        System.out.println("1. Luz"); 
                        System.out.println("2. Agua"); 
                        System.out.println("3. CANTV"); 
                        System.out.println("4. Salir"); 

                                         opcion3 = c  = leer.nextInt();
                                      }catch(NumberFormatException a){
                        System.out.println("error");
                                      }
                                                                                              
                         switch(opcion3){
                                  case 1:
                                      if (!pila.vacioPila()) {
                        System.out.println("Pago exitoso!!.");                                    

                                      }else{
                        System.out.println("No tienes dinero para pagar");
                                      }
                                 break;
                                   case 2:
                                      if (!pila.vacioPila()) {
                        System.out.println("Pago exitoso!!.");                                    

                                      }else{
                        System.out.println("No tienes dinero para pagar");
                                      }
                                 break;
                                   case 3:
                                        if (!pila.vacioPila()) {
                        System.out.println("Pago exitoso!!.");                                    

                                      }else{
                        System.out.println("No tienes dinero para pagar");
                                      }
                                 break;
                              }
                                   }while(opcion3 != 4);
                                 
                                  
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
                        System.out.print("Se atendio : "+cola.SalirBanco()+"\n");
                                     
                         if (!cola.vaciaCola()) {
                        System.out.println(" Ahora se atiende: "+cola.siguiente()); 
                                      }
                                                           
                                  }else{
                        System.out.println("No hay gente");
                        
                                  }
                                  
                                  break;
                                  
                                  case 9:
                                      cola.prioridad();
                       break;
                       
                             
                       } 
                       }else{
                          atender = 0;
                           if (!cola.vaciaCola()){ 
                        System.out.println("Ya no puede hacer mas operaciones, Pase a la siguiente persona");
                           }
                              
                           }
                       
                         
                         
                       
                       
                         }
                       
                       
                         
                       
                             
                             
                     
                     

                     }while(opcion1 != 10); 
                     
                 break;
                     
                 }   
                     
            }catch(NumberFormatException e){
                    
            }
                  
                    
            
             
            
        }while(opcion !=2);
        
    }
        
    
}

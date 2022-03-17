
package Banco;


public class Cola {
  Nodo frente;
  Nodo atras;
  private Nodo depositoInt;
  int retiro, deposito,consulta, libreta, pagoServicio, cliente;
  String cola;
  
  Cola(){
      deposito = 0;
      frente = null;
      atras = null;
      retiro = deposito;
      consulta = retiro;
  }
  
  boolean vaciaCola(){
      if (frente == null) {
          return true;
      }else{
          return false;
      }
  }
  
  boolean SinSaldo(){
      if (deposito == 0) {
          return true;
      } else {
          return false;
      }
  }
  
  public void taquilla(int fila){
      Nodo a = new Nodo(fila);
       a.fila = cliente;
       a.siguiente = null;
       
        if (vaciaCola()) {
            frente = a;
            atras = a;
        } else {
           atras.siguiente = a;
           atras = a;
        }
  
    }
  
  public void deposito(int deposito){
      Nodo depo = new Nodo(deposito);
        depo.fila = deposito;
        depo = depositoInt.siguiente;
  }
public void retiro(){
    if (retiro > 0) {
        System.out.println("Saldo: "+deposito);
    }else{
        System.out.println("No cuenta con saldo"+deposito);
    }
}

public int consulta(){
    return depositoInt.deposito1;
}

 public void MostrarCola(){
        Nodo recorrido = frente;
        String ColaInvertida = " ";
        
        while(recorrido != null){
            cola += recorrido.fila+" ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = cola.split(" ");
        
        for (int i = cadena.length -1; i >= 0; i--) {
            ColaInvertida += " "+cadena[i];
            
        }
        System.out.println(ColaInvertida);
        cola = "";
  
  
  
}

    void deposito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

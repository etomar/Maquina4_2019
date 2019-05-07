package maquinabebidas4_2019;
/**
 * @author Javier
 */
public class MaquinaDeBebidas { 
  /*Contador de monedas de la maquina*/
    private ContadorDeMonedas contador; 
    /*Cinco dispensadores de botes*/
    private DispensadorDeBotes cola, limon, naranja, tonica, agua; 
    /*Precio de las bebidas(común paratodas)*/
    private float precio;
    
    /* Inicializa la maquina y todos los elementos asociados */ 
    /* Entradas: float m, cantidad inicial de monedas para el cambio */ 
    /* int b, cantidad inicial de botes en los dispensadores */ 
    /* float pvp, precio de las bebidas */ 
    /* Salidas: Ninguna */ 
    public void iniciarMaquinaDeBebidas (float m, int b, float pvp){
    contador=new ContadorDeMonedas(m);
    this.cola= new DispensadorDeBotes(b);
    precio=pvp;
    
}
    
    /* Responder a una acción del usuario. Discrimina el tipo de accion */ 
    /* y utiliza las operaciones privadas */ 
    /* Entradas: char o, la orden del usuario */ 
    /* Salidas: Ninguna */ 
    public void darOrden (char o){
        
        if(o=='1'||o=='2'||o=='3'||o=='4'||o=='5'){
            ordenSeleccion(o);
        }
        
        if(o=='A'||o=='B'||o=='C'||o=='D'||o=='E'||o=='R'){
            ordenMonedas(o);
        }
    }
    /* Visualiza la informacion de interes sobre la maquina */ 
    /* Botes en cada dispensador, precio de las bebidas, saldo del cliente */ 
    /* Entradas: Ninguna */ 
    /* Salidas: Ninguna */ 
    public void visualizarMaquina (){
       /* Botes en cada dispensador, precio de las bebidas, saldo del cliente */ 
        System.out.println("Saldo Disponible: "+contador.getSaldo());
        
    } 
    /* Realiza las acciones relacionadas con la introducción de monedas */ 
    /* Entradas: char o, la orden del usuario */ 
    /* Salidas: Ninguna */ 
    private void ordenMonedas (char o){
        
        switch (o){
        case 'A': //- Introducir moneda de 5 cent. (Pulsar 'A') 
        break;
        case 'B': //- Introducir moneda de 10 cent. (Pulsar 'B') 
        break;  
        case 'C': //- Introducir moneda de 20 cent. (Pulsar 'C') 
        break;  
        case 'D': //- Introducir moneda de 50 cent. (Pulsar 'D')
        break;   
        case 'E': //- Introducir moneda de 1 € (Pulsar 'E') 
        break;   
        case 'R': //- Solicitar devolver las monedas introducidas (Pulsar 'R')
        break;
        }
        
    }
    /* Realiza las acciones relacionadas con la selección de una bebida */ 
    /* Entradas: char o, la orden del usuario */ 
    /* Salidas: Ninguna */ 
    private void ordenSeleccion (char o){
        //- Seleccionar un tipo de bebida (Pulsar '1', '2', '3', '4', '5' para cola, limón, naranja, tónica y agua, respectivamente) 
        
        switch(o){
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
            break;
            
        }
    
    }
} 
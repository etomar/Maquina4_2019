package maquinabebidas4_2019;
/** 
 * @author Daniel Sanchez
 */
class DispensadorDeBotes
{
    
public DispensadorDeBotes(int b){
    iniciarDispensadorDeBotes(b);
    
}    
    
private int botes; 
//Numero actual de botes.
/* Inicializa el dispensador y pone i botes en él*/
/* Entrada: int i, numero de botes en el dispensador*/
/* Salidas: Ninguna */
public void iniciarDispensadorDeBotes (int i){
    botes = i;
};
/* 
* Intenta dar un bote, devuelve true si es posible y falso
* si no hay botes. 
* Entrada: Ninguna 
* Salidas: bool, true si entrega el bote */
public boolean pulsarBoton (){
    boolean hayBotes = false;
    if(botes>0){
        hayBotes= true;
        botes--;
    }
    else
        hayBotes= false;
    return hayBotes;
};
/*Muestra el numero de botes disponibles en el dispensador*/
/* Entrada: Ninguna */
/* Salidas: int, el numero de botes */
public int botesDisponibles (){
    return botes;
};
}

package Dominio;

public class Deposito implements ObserverVenta{


    @Override
    public void notificarVentaDe(Producto producto) {
        this.preparar(producto);
    }

    void preparar(Producto producto){
       //preparando
    }

}

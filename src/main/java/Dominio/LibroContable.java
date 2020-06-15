package Dominio;

public class LibroContable implements ObserverVenta {

    private double valorTotal = 0;

    @Override
    public void notificarVentaDe(Producto producto) {
    valorTotal += producto.precioFinal();
    }



    public double getValorTotal() {
        return valorTotal;
    }

}

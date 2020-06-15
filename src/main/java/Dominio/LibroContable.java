package Dominio;

public class LibroContable implements ObserverVenta {
    private double valorTotal;

    @Override
    public void notificarVentaDe(Producto producto) {
    valorTotal += producto.precioFinal();
    }

}

package Dominio;
import java.util.Calendar;
import java.util.TimeZone;


public class ContadorVentas implements ObserverVenta {


    private int contador=0;
    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
    private int diaActual = calendar.get(Calendar.DATE);


    @Override
    public void notificarVentaDe(Producto producto) {
        int diaVenta = calendar.get(Calendar.DATE);
            if (diaVenta == diaActual) {
            contador++;
        }
            else {
            contador = 0;
            }
    }


    public void setDiaActual() {
        this.diaActual = calendar.get(Calendar.DATE);
    }


    public int getContador() { return contador; }
}
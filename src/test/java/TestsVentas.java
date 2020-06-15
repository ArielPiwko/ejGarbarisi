
import Dominio.*;
import Exceptions.Exceptions.VentaException;
import org.junit.Assert;
import org.junit.Test;



public class TestsVentas {


    @Test
    public void funcionanObservers() throws VentaException {
        TipoProducto elec1 = new TipoProducto("electronico");
        Producto prod1 = new Producto(2000, 12, elec1);
        Sucursal sucursal = new Sucursal();
        Deposito deposito = new Deposito();
        LibroContable libroContable = new LibroContable();
        ContadorVentas contadorVentas = new ContadorVentas();
        contadorVentas.setDiaActual();
        sucursal.agregarObserver(deposito);
        sucursal.agregarObserver(libroContable);
        sucursal.agregarObserver(contadorVentas);
        sucursal.getObserversVenta().forEach(observerVenta -> observerVenta.notificarVentaDe(prod1));
        //suma 1 venta
        Assert.assertEquals(1, contadorVentas.getContador());
        //se podria verificar que deposito llama a preparar() 1 vez con Mockito
        Assert.assertEquals(2000, libroContable.getValorTotal(), .2);
        //ventas totales en pesos es igual a 2000, que es el valor base de prod1
    }


}
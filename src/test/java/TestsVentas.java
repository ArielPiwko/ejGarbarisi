
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
        sucursal.agregarObserver(deposito);
        sucursal.agregarObserver(libroContable);
        sucursal.agregarObserver(contadorVentas);

    }


}
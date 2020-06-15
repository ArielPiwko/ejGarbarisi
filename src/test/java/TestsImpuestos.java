
import Dominio.*;
import org.junit.Assert;
import org.junit.Test;

public class TestsImpuestos {


/*producto
precio base: 2000
ganancias: 12
aplico EI
(2000/4)+(0.3*12)=503,6*/
    @Test
    public void impuestoEIAplicado() throws Exceptions.Exceptions.ImpuestoException {
     double totalImpuestos = 0;
        TipoProducto elec1 = new TipoProducto("electronico");
        Producto prod1 = new Producto(2000,12, elec1);
        EI impEI1 = new EI(prod1.getGananciasImpositivas());
        prod1.getTipoProducto().agregarImpuesto(impEI1);
        totalImpuestos = prod1.getTipoProducto().sumaTotalImpuestos(prod1);
        Assert.assertEquals(503.6,totalImpuestos,.2);
    }

}


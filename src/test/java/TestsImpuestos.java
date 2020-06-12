package test.java;

import main.java.*;
import org.junit.Test;

public class TestsImpuestos {


    public void impuestoEIAplicado(){
    TipoProducto elec1 = new TipoProducto("electronico");
    Producto prod1 = new Producto(2000,12, elec1);
    EI impEI1 = new EI(prod1.getGananciasImpositivas());
    }

}

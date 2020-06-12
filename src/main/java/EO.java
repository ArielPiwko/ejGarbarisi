package main.java;

public class EO implements ImpuestoAplicable{
    private double factorGananciasImp = 4;
    private double factorPrecioBase = 0.5;
    private double gananciasImpositivas;


    public EO(double gananciasImpositivas) {
        this.gananciasImpositivas = gananciasImpositivas;
    }

    @Override
    public double calculoImpuesto(double precioProducto){
        return (factorPrecioBase * precioProducto) / (factorGananciasImp * gananciasImpositivas);
    }


}

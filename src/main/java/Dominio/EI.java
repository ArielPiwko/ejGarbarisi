package Dominio;

public class EI implements ImpuestoAplicable{
    private double factorGananciasImp = 0.3;
    private double factorPrecioBase = 4;
    private double gananciasImpositivas;


    public EI(double gananciasImpositivas) {
        this.gananciasImpositivas = gananciasImpositivas;
    }

    @Override
    public double calculoImpuesto(double precioProducto){
        return (precioProducto / factorPrecioBase) + (factorGananciasImp * gananciasImpositivas);
    }


}

package Dominio;

public class IVA implements ImpuestoAplicable {
    private double porcentajeIVA = 0.21;


    @Override
    public double calculoImpuesto(double precioProducto){
        return porcentajeIVA * precioProducto;
    }
}

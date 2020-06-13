package Dominio;

import main.java.Exceptions.ImpuestoException;
import java.util.ArrayList;
import java.util.List;

public class TipoProducto {
    private String tipo;
    private List<ImpuestoAplicable> impuestos = new ArrayList<>();

    public TipoProducto(String tipo) {
        this.tipo = tipo;
    }


    public void agregarImpuesto(ImpuestoAplicable impuestoNuevo) throws ImpuestoException {
        if (!impuestos.contains(impuestoNuevo)) {
            this.impuestos.add(impuestoNuevo);
        } else {
            throw new ImpuestoException("El producto ya contiene ese impuesto.");
        }

    }

    public void eliminarImpuesto(ImpuestoAplicable impuestoAQuitar) throws ImpuestoException {
        if (impuestos.contains(impuestoAQuitar)){
            this.impuestos.remove(impuestoAQuitar);
        }
        else {
            throw new ImpuestoException("El producto no contiene ese impuesto.");
        }

    }

    public double sumaTotalImpuestos(Producto producto){
        double total = 0;
            for (int i=0; i<producto.getTipoProducto().impuestos.size(); i++){
                total += producto.getTipoProducto().impuestos.get(i).calculoImpuesto(producto.getPrecioBaseProducto());

            }
    return total;
        }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<ImpuestoAplicable> getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(List<ImpuestoAplicable> impuestos) {
        this.impuestos = impuestos;
    }


}
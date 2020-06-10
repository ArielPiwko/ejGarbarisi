package main.java;

import main.Exceptions.ImpuestoException;

import java.util.ArrayList;
import java.util.List;

public class TipoProducto {
    private String tipo;
    private List<ImpuestoAplicable> impuestos = new ArrayList<>();


    public void agregarImpuesto(ImpuestoAplicable impuestoNuevo) throws ImpuestoException {
        if (!impuestos.contains(impuestoNuevo)) {
            this.impuestos.add(impuestoNuevo);
        } else {
            throw new ImpuestoException("El producto ya contiene ese impuesto.");
        }

    }

    public void eliminarImpuesto(ImpuestoAplicable impuestoAQuitar){

        this.impuestos.remove(impuestoAQuitar);
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

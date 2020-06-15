package Dominio;

import Exceptions.Exceptions.ImpuestoException;
import Exceptions.Exceptions.VentaException;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private List<ObserverVenta> observersVenta = new ArrayList<>();


    public void agregarObserver(ObserverVenta observerNuevo) throws VentaException {
        if (!observersVenta.contains(observerNuevo)) {
            this.observersVenta.add(observerNuevo);
        } else {
            throw new Exceptions.Exceptions.VentaException("El producto ya contiene ese observer.");
        }
    }

        public void eliminarObserver(ObserverVenta observerAQuitar) throws VentaException {
            if (observersVenta.contains(observerAQuitar)) {
                this.observersVenta.remove(observerAQuitar);
            } else {
                throw new VentaException("El producto no contiene ese observer.");
            }

        }



    public List<ObserverVenta> getObserversVenta() {
        return observersVenta;
    }
}
package main.java;

public class Producto {
    private float precioBaseProducto;
    private float gananciasImpositivas;
    private TipoProducto tipo;

    public Producto(float precioBaseProducto, float gananciasImpositivas, TipoProducto tipo) {
        this.precioBaseProducto = precioBaseProducto;
        this.gananciasImpositivas = gananciasImpositivas;
        this.tipo = tipo;
    }


    public float precioFinal() {
        return 0;
    }


    public float getPrecioBaseProducto() {
        return precioBaseProducto;
    }

    public void setPrecioBaseProducto(float precioBaseProducto) {
        this.precioBaseProducto = precioBaseProducto;
    }

    public float getGananciasImpositivas() {
        return gananciasImpositivas;
    }

    public void setGananciasImpositivas(float gananciasImpositivas) {
        this.gananciasImpositivas = gananciasImpositivas;
    }

    public TipoProducto getTipoProducto() { return tipo; }
}


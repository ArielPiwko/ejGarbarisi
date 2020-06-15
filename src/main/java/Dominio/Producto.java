package Dominio;

public class Producto {
    private float precioBaseProducto;
    private float gananciasImpositivas;
    private TipoProducto tipo;

    public Producto(float precioBaseProducto, float gananciasImpositivas, TipoProducto tipo) {
        this.precioBaseProducto = precioBaseProducto;
        this.gananciasImpositivas = gananciasImpositivas;
        this.tipo = tipo;
    }


    public double precioFinal() {
        return (precioBaseProducto + tipo.sumaTotalImpuestos(this));
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


package Evaluacion;
public class Pedidos {
    private Producto producto;
    private Proovedor proovedor;
    private double precioUnitario;
    private int unidades;

    public Pedidos(Producto producto, Proovedor proveedor, double precioUnitario, int unidades) {
        this.producto = producto;
        this.proovedor = proveedor;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
    }

    public Producto getProducto() {
        return producto;
    }

    public Proovedor getProovedor() {
        return proovedor;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getUnidades() {
        return unidades;
    }

    @Override
    public String toString() {
        return producto.getNombre() + "|" + proovedor.getNombre() + "|" + precioUnitario + "|" + unidades + "|";
    }
}


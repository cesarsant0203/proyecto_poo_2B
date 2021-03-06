package final_poo;

/*
 * @author s-vel
 */


public class Almacenamiento extends Producto{
    private String tipo;
    private String size;

    public Almacenamiento(String tipo, String size, String tipoComputador, String fabricante, String tienda, double precio) {
        super(tipoComputador, fabricante, tienda, precio);
        this.tipo = tipo;
        this.size = size;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getSize() {
        return size;
    }
    
    @Override
    public String toString() {
        return "Producto: Disco\nTipo: "+tipo+"\nTamaño: "+size+"\nMarca: "
                +super.getFabricante()+"\nTienda: "+super.getTienda()+"\nPrecio: "
                +super.getPrecio()+"\nPara: "+super.tipoComputador+"\n\n";
    }
    
}

package sv.udu.utec.modelo;

public class producto {
    private int id;
    private int stock;
    private String nombre;
    private double precio;

    public producto(int id, int stock,String nombre,double precio){
        this.id = id;
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;

    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }



}

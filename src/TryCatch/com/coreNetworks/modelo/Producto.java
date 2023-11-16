package TryCatch.com.coreNetworks.modelo;

public class Producto {
    private int id;

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                '}';
    }

    public Producto() {
    }

    public Producto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void comprobarID() throws Exception {
        if (id!=0){
            this.id=id;
        }else {
            throw new Exception("el ID no puede ser 0");
        }
    }

    public void setId(int id) {
        this.id = id;
    }
}

package Modelo;

public class Mesa {

    //Me indica si ya se han cocinado los platos
    private int proceso;
    private int id;

    private int ventas = 0;

    private MiLista pedidos;
    private double total;
    private Camarero camarero;
    public int NumeroOrden;

    //Esto me indica si la mesa esta siendo usada por un camarero
    public int uso;

    public Mesa(int id) {
        this.id = id;
        pedidos = new MiLista();
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setPedidos(String ped, double precio) {
        pedidos.add(ped, precio);
        pedidos.getPedidos();
    }

    public MiLista getPedidos() {
        return pedidos;
    }

    public void setNumeroOrden(int NumeroOrden) {
        this.NumeroOrden = NumeroOrden;
        System.out.println(NumeroOrden);
    }

    public int getNumeroOrden() {
        return NumeroOrden;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public int getId() {
        return id;
    }

    public int getProceso() {
        return proceso;
    }

    public void setProceso(int proceso) {
        this.proceso = proceso;
    }

    public double getTotal() {
        return total;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}

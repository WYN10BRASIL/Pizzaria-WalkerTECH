public class Pedido extends MammaMiaPizzaria{
    private Cliente cliente;
    private Pizza pizza;
    private String tipoEntrega;
    private Pagamento pagamento;
    private Pizza[] pizzas;
    private Bebida[] bebidas;

    public Pedido(Cliente cliente, Pizza pizza, String tipoEntrega, Pagamento pagamento) {
        this.cliente = cliente;
        this.pizza = pizza;
        this.tipoEntrega = tipoEntrega;
        this.pagamento = pagamento;
    }

    // Métodos get e set para cada atributo

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public Bebida[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }
}

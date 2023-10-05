import java.util.ArrayList;
import java.util.List;

public class Sistema extends MammaMiaPizzaria {
private List<Cliente> clientes;
private List<Pedido> pedidos;

public Sistema() {
    this.clientes = new ArrayList<>();
    this.pedidos = new ArrayList<>();
}

// Métodos de cadastro e realização de pedidos

public void cadastrarCliente(Cliente cliente) {
    if (!clientes.contains(cliente)) {
        clientes.add(cliente);
    }
}

public void realizarPedido(Pedido pedido) {
    if (!pedidos.contains(pedido)) {
        pedidos.add(pedido);
    }
}

// Métodos de obtenção de clientes e pedidos

public List<Cliente> getClientes() {
    return clientes;
}

public List<Pedido> getPedidos() {
    return pedidos;
}
}
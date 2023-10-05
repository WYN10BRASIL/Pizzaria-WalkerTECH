/**
 * Pagamento
 */
public class Pagamento extends MammaMiaPizzaria{
    private String tipo;

    public Pagamento(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("O tipo de pagamento não pode ser nulo");
        }
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("O tipo de pagamento não pode ser nulo");
        }
        this.tipo = tipo;
    }
}

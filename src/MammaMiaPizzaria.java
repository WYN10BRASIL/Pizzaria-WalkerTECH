import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MammaMiaPizzaria {
    
    private static final String[] PIZZAS_DOCES = {"Chocolate", "Banana com Canela", "Romeu e Julieta", "Brigadeiro", "Nutella", "Morango", "Abacaxi com Creme"};
    private static final String[] PIZZAS_SALGADAS = {"Mussarela", "Calabresa", "Frango com Catupiry", "Portuguesa", "Atum", "Marguerita", "Quatro Queijos"};
    private static final String[] TAMANHOS = {"Pequena", "Média", "Grande"};
    private static final String[] BEBIDAS = {"Água", "Refrigerante", "Suco", "Cerveja", "Vinho", "Chá", "Café"};
    
    private static final double[] PRECOS_PIZZAS_DOCES = {20.0, 30.0, 40.0};
    private static final double[] PRECOS_PIZZAS_SALGADAS = {25.0, 35.0, 45.0};
    private static final double[] PRECOS_BEBIDAS = {5.0, 7.0, 10.0};
    
    private static final String FORMA_PAGAMENTO_PIX = "PIX";
    private static final String FORMA_PAGAMENTO_CARTAO = "Cartão";
    
    private static final String SENHA_CARTAO_PADRAO = "1234";
    
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Cadastro de clientes
        System.out.println("Deseja cadastrar um novo cliente? (S/N)");
        String opcaoCadastro = scanner.next();
        if (opcaoCadastro.equalsIgnoreCase("S")) {
            System.out.print("Nome do cliente: ");
            String nomeCliente = scanner.next();
            System.out.print("Endereço do cliente: ");
            String enderecoCliente = scanner.next();
            System.out.print("Telefone do cliente: ");
            String telefoneCliente = scanner.next();
            Cliente novoCliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente);
            clientes.add(novoCliente);
            System.out.println("Cliente cadastrado com sucesso!");
        }
        System.out.println("Lista de clientes cadastrados:");
        for (Cliente c : clientes) {
            System.out.println("Nome: " + c.getNome() + " | Endereço: " + c.getEndereco() + " | Telefone: " + c.getTelefone());
        }
                
        // Apresenta o cardápio
        System.out.println("Bem-vindo(a) à Mamma Mia Pizzaria!");
        System.out.println("------------------------------");
        System.out.println("Pizzas doces:");
        for (int i = 0; i < PIZZAS_DOCES.length; i++) {
            System.out.println((i+1) + ". " + PIZZAS_DOCES[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Pizzas salgadas:");
        for (int i = 0; i < PIZZAS_SALGADAS.length; i++) {
            System.out.println((i+1) + ". " + PIZZAS_SALGADAS[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Bebidas:");
        for (int i = 0; i < BEBIDAS.length; i++) {
            System.out.println((i+1) + ". " + BEBIDAS[i]);
        }
        System.out.println("------------------------------");
        
        // Solicita o pedido do usuário
        System.out.println("Por favor, faça o seu pedido:");
        System.out.print("Pizza doce (0 se não quiser): ");
        int opcaoPizzaDoce = scanner.nextInt();
        System.out.print("Pizza salgada (0 se não quiser): ");
        int opcaoPizzaSalgada = scanner.nextInt();
        System.out.print("Tamanho (1=Pequena, 2=Média, 3=Grande): ");
        int opcaoTamanho = scanner.nextInt();
        System.out.print("Bebida (0 se não quiser): ");
        int opcaoBebida = scanner.nextInt();
    
        double valorTotal = 0.0;
        if (opcaoPizzaDoce > 0) {
        valorTotal += PRECOS_PIZZAS_DOCES[opcaoTamanho-1];
        }
        if (opcaoPizzaSalgada > 0) {
        valorTotal += PRECOS_PIZZAS_SALGADAS[opcaoTamanho-1];
        }
        if (opcaoBebida > 0) {
        valorTotal += PRECOS_BEBIDAS[opcaoBebida-1];
        }
    
            // Solicita a forma de pagamento
            System.out.println("------------------------------");
            System.out.println("Valor total do pedido: R$ " + valorTotal);
            System.out.println("Por favor, escolha a forma de pagamento:");
            System.out.println("1. " + FORMA_PAGAMENTO_PIX);
            System.out.println("2. " + FORMA_PAGAMENTO_CARTAO);
            int opcaoPagamento = scanner.nextInt();
            
            // Processa o pagamento
            if (opcaoPagamento == 1) {
                System.out.println("Por favor, realize o pagamento via PIX para a chave 123456789-0");
            } else if (opcaoPagamento == 2) {
                System.out.print("Por favor, insira a senha do cartão: ");
                String senhaCartao = scanner.next();
                if (senhaCartao.equals(SENHA_CARTAO_PADRAO)) {
                    System.out.println("Pagamento processado com sucesso!");
                } else {
                    System.out.println("Senha inválida. Pagamento não autorizado.");
                }
            } else {
                System.out.println("Opção de pagamento inválida. Pagamento não realizado.");
            }
            
            // Encerra o programa
            System.out.println("Obrigado por comprar na Mamma Mia Pizzaria!");
            scanner.close();
    }
}
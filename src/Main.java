public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.preencherPilha();

        System.out.println("===========================================");
        System.out.println("Histórico de Solicitações:");
        System.out.println("===========================================");
        pilha.imprime();

        System.out.println("\nRemoção de solicitação da pilha...");
        System.out.println("Solicitação removida: " + pilha.remove());
        System.out.println("\nPilha atualizada...\n");
        pilha.imprime();

        System.out.println("\nInserindo nova solicitação...\n");
        pilha.insere(new Historico("REQ011","Troca de equipamento","2024-08-20 16:45"));
        pilha.imprime();


        Fila fila = new Fila();
        fila.preencherFila();
        System.out.println("\n===========================================");
        System.out.println("Fila de Antendimento:");
        System.out.println("===========================================");
        fila.imprimir();

        System.out.println("\nAtendendo Clientes...\n");

        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();

        System.out.println("\nFila atualizada...\n");
        fila.imprimir();
        System.out.println("\nAdicionando clientes na fila...\n");

        fila.adicionarCliente(new Atendimento("CLI011","André Oliveira","Cancelamento do pedido"));
        fila.adicionarCliente(new Atendimento("CLI012","Luiza Souza","Renovação de assinatura"));

        System.out.println("\nNova fila...\n");
        fila.imprimir();

    }
}

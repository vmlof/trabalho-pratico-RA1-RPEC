public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        preencherPilha(pilha);

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
        preencherFila(fila);
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

    public static void preencherFila(Fila f) {
        f.adicionarCliente(new Atendimento("CLI001", "Maria Silva", "Dúvida sobre produto"));
        f.adicionarCliente(new Atendimento("CLI002", "João Souza", "Reclamação de serviço"));
        f.adicionarCliente(new Atendimento("CLI003", "Ana Costa", "Solicitação de reembolso"));
        f.adicionarCliente(new Atendimento("CLI004", "Pedro Alves", "Informações de entrega"));
        f.adicionarCliente(new Atendimento("CLI005", "Carla Dias", "Agendamento de visita"));
        f.adicionarCliente(new Atendimento("CLI006", "Lucas Martins", "Alteração de pedido"));
        f.adicionarCliente(new Atendimento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"));
        f.adicionarCliente(new Atendimento("CLI008", "Rafael Lima", "Renovação de assinatura"));
        f.adicionarCliente(new Atendimento("CLI009", "Fernanda Gomes", "Suporte para instalação"));
        f.adicionarCliente(new Atendimento("CLI010", "Carlos Eduardo", "Pedido de orçamento"));
    }

    public static void preencherPilha(Pilha p) {
        p.insere(new Historico("REQ001", "Instalação de software", "2024-08-20 10:30"));
        p.insere(new Historico("REQ002", "Manutenção preventiva", "2024-08-20 11:00"));
        p.insere(new Historico("REQ003", "Atualização de sistema", "2024-08-20 11:30"));
        p.insere(new Historico("REQ004", "Suporte técnico", "2024-08-20 12:00"));
        p.insere(new Historico("REQ005", "Troca de equipamento", "2024-08-20 12:30"));
        p.insere(new Historico("REQ006", "Consulta de garantia", "2024-08-20 13:00"));
        p.insere(new Historico("REQ007", "Reparo de impressora", "2024-08-20 13:30"));
        p.insere(new Historico("REQ008", "Configuração de rede", "2024-08-20 14:00"));
        p.insere(new Historico("REQ009", "Restauração de dados", "2024-08-20 14:30"));
        p.insere(new Historico("REQ010", "Consulta técnica", "2024-08-20 15:00"));
    }

}

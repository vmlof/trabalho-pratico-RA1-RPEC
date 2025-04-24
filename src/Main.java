public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.preencherPilha();

        System.out.println("Histórico de Solicitações:");
        pilha.imprime();

        System.out.println("\nRemoção de solicitação da pilha...");
        System.out.println("Solicitação removida: " + pilha.remove());
        System.out.println("\nPilha atualizada...\n");
        pilha.imprime();

        System.out.println("\nInserindo nova solicitação...\n");
        pilha.insere(new Elemento("REQ011","Troca de equipamento","2024-08-20 16:45"));
        pilha.imprime();


        System.out.println("\nFila de atendimento:");



    }
}

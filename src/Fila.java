public class Fila extends Elemento {
    private No inicio;
    private No fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public boolean vazia() {
        return inicio == null && fim == null;
    }

    public No getInicio() {
        return inicio;
    }

    public void adicionarCliente(Elemento elemento) {
        No novoNo = new No(elemento);
        if (vazia()) {
            inicio = novoNo;
        } else {
            fim.setProximo(novoNo);
        }
        fim = novoNo;
        System.out.println("Cliente adicionado com sucesso, dados: " + elemento);
    }

    private Elemento remover() {
        if (vazia()) {
            System.out.println("fila vazia");
            return null;
        }
        Elemento elemento = inicio.getElemento();
        inicio = inicio.getProximo();

        if (inicio == null) {
            fim = null;
        }
        return elemento;
    }

    public void atenderCliente() {
        System.out.println("Atender cliente: " + remover());
    }

    public void imprimir() {
        if (vazia()) {
            System.out.println("Fila vazia");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.print("[ " + atual.getElemento() + " ]");
            if (atual.getProximo() != null) {
                System.out.print(" → ");
            }
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public void preencherFila() {
        adicionarCliente(new Atendimento("CLI001", "Maria Silva", "Dúvida sobre produto"));
        adicionarCliente(new Atendimento("CLI002", "João Souza", "Reclamação de serviço"));
        adicionarCliente(new Atendimento("CLI003", "Ana Costa", "Solicitação de reembolso"));
        adicionarCliente(new Atendimento("CLI004", "Pedro Alves", "Informações de entrega"));
        adicionarCliente(new Atendimento("CLI005", "Carla Dias", "Agendamento de visita"));
        adicionarCliente(new Atendimento("CLI006", "Lucas Martins", "Alteração de pedido"));
        adicionarCliente(new Atendimento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"));
        adicionarCliente(new Atendimento("CLI008", "Rafael Lima", "Renovação de assinatura"));
        adicionarCliente(new Atendimento("CLI009", "Fernanda Gomes", "Suporte para instalação"));
        adicionarCliente(new Atendimento("CLI010", "Carlos Eduardo", "Pedido de orçamento"));
    }

}
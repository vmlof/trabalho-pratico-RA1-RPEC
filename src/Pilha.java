public class Pilha {
    private No topo;

    public Pilha() {
        topo = null;
    }

    private boolean vazia() {
        return topo == null;
    }

    public void insere(Elemento elemento) {
        No novoNo = new No(elemento);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public Elemento remove() {
        if (vazia()) {
            System.out.println("pilha vazia");
            return null;
        }
        Elemento noTopo = topo.getElemento();
        topo = topo.getProximo();
        return noTopo;
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("pilha vazia");
            return;
        }
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }

    public void preencherPilha() {
        insere(new Historico("REQ001", "Instalação de software", "2024-08-20 10:30"));
        insere(new Historico("REQ002", "Manutenção preventiva", "2024-08-20 11:00"));
        insere(new Historico("REQ003", "Atualização de sistema", "2024-08-20 11:30"));
        insere(new Historico("REQ004", "Suporte técnico", "2024-08-20 12:00"));
        insere(new Historico("REQ005", "Troca de equipamento", "2024-08-20 12:30"));
        insere(new Historico("REQ006", "Consulta de garantia", "2024-08-20 13:00"));
        insere(new Historico("REQ007", "Reparo de impressora", "2024-08-20 13:30"));
        insere(new Historico("REQ008", "Configuração de rede", "2024-08-20 14:00"));
        insere(new Historico("REQ009", "Restauração de dados", "2024-08-20 14:30"));
        insere(new Historico("REQ010", "Consulta técnica", "2024-08-20 15:00"));
    }
}

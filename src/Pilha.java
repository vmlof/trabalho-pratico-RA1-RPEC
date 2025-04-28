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

}

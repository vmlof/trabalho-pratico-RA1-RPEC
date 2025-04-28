public class Fila {
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

}
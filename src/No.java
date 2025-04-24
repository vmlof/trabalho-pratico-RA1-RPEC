public class No {
    private Elemento elemento;
    private No proximo;

    public No(Elemento elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}

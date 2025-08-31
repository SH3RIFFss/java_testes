import java.util.ArrayList;
// import java.util.Objects;

public class myHash<k, v> {
    private ArrayList<hashNode<k, v>> buckets;
    private int capacidade;
    private int tamanho;

    public myHash() {
        capacidade = 16;
        buckets = new ArrayList<>();
        tamanho = 0;
        for (int i = 0; i < capacidade; i++) {
            buckets.add(null);
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    private int getIndiceBucket(k chave) {
        if (chave == null) {
            return 0;
        }
        int hashCode = chave.hashCode();
        int indice = (hashCode & 0x7ffffff) % capacidade;
        return indice;
    }

    public void put(k chave, v valor) {
        int indiceBucket = getIndiceBucket(chave);
        hashNode<k, v> cabeca = buckets.get(indiceBucket);
        hashNode<k, v> atual = cabeca;
        while (atual != null) {
            if (atual.chave.equals(chave)) {
                atual.valor = valor;
                return;
            }
            atual = atual.prx;
        }
        tamanho++;
        int hashCode = (chave == null) ? 0 : chave.hashCode();
        hashNode<k, v> novoNoh = new hashNode<>(chave, valor, hashCode);
        novoNoh.prx = cabeca;
        buckets.set(indiceBucket, novoNoh);
        if ((1.0 * tamanho) / capacidade >= 0.75) {
            redimensionar();
        }
    }

    public v get(k chave) {
        int indiceBucket = getIndiceBucket(chave);
        hashNode<k, v> cabeca = buckets.get(indiceBucket);
        hashNode<k, v> atual = cabeca;
        while (atual != null) {
        if (atual.chave.equals(chave)) {
            return atual.valor;
        }else{
            atual=atual.prx;
        }
        }
        return null;
    }

    public v remove(k chave) {
        int indiceBucket = getIndiceBucket(chave);
        hashNode<k, v> cabeca = buckets.get(indiceBucket);
        hashNode<k, v> atual = cabeca;
        hashNode<k, v> anterior = null;
        while (atual != null) {
            if (atual.chave.equals(chave)) {
                break;
            }else{
                anterior = atual;
                atual = atual.prx;
            }
            
        }
        if (atual == null) {
            return null;
        }
        tamanho--;
        if (anterior != null) {
            anterior.prx = atual.prx;
        } else {
            buckets.set(indiceBucket, atual.prx);
        }
        return atual.valor;
    }

    private void redimensionar() {
        ArrayList<hashNode<k, v>> buketsAntigos = buckets;
        capacidade = 2 * capacidade;
        buckets = new ArrayList<>();
        tamanho = 0;
        for (int i = 0; i < capacidade; i++) {
            buckets.add(null);
        }
        for (hashNode<k, v> noCabeca : buketsAntigos) {
            while (noCabeca != null) {
                put(noCabeca.chave, noCabeca.valor);
                noCabeca = noCabeca.prx;
            }
        }
    }
}
    class hashNode<k, v> {
        final k chave;
        v valor;
        final int hashCode;
        hashNode<k, v> prx;

        public hashNode(k chave, v valor, int hashCode) {
            this.chave = chave;
            this.valor = valor;
            this.hashCode = hashCode;
        }
    }


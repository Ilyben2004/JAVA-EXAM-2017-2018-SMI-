import java.util.Objects;

public class Produit {

    String code ;
    int quantite;

    public Produit(String code, int quantite) {
        this.code = code;
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return quantite == produit.quantite && Objects.equals(code, produit.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, quantite);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "code='" + code + '\'' +
                ", quantite=" + quantite +
                '}';
    }
}

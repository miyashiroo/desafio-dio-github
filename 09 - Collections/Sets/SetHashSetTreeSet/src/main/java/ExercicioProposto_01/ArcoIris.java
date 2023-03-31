package ExercicioProposto_01;

import java.util.Comparator;
import java.util.Objects;

public class ArcoIris implements Comparable<ArcoIris> {
    private String cor;

    public ArcoIris(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "ArcoIris{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return Objects.equals(cor, arcoIris.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    public String getCor() {
        return cor;
    }



    @Override
    public int compareTo(ArcoIris arcoIris) {
        return this.getCor().compareToIgnoreCase(arcoIris.getCor());
    }
}

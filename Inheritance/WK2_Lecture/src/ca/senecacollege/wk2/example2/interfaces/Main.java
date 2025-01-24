package ca.senecacollege.wk2.example2.interfaces;

public class Main {
    public static void main(String[] args) {
        Ceetah cCat = new Ceetah();
        System.out.printf("%s with %s fur\n", cCat.getCatKind(), cCat.getFurDesc());
    }
}

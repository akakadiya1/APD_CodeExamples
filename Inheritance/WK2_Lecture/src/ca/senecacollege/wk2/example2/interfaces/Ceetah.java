package ca.senecacollege.wk2.example2.interfaces;

public class Ceetah implements Cat, Roarable{


    @Override
    public String getCatKind() {
        return getClass().getSimpleName();
    }

    @Override
    public String getFurDesc(){
        return "spotted";
    }
}

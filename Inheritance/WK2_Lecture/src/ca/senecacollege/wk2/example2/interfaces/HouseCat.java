package ca.senecacollege.wk2.example2.interfaces;

public class HouseCat implements Cat, Meowler,Purrable{
    @Override
    public String getCatKind() {
        return getClass().getSimpleName();
    }

    @Override
    public String getFurDesc(){
        return "Mix gray with White";
    }


}

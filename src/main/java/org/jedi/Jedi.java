package org.jedi;

public abstract class Jedi implements IEroErzekeny{
    private float ero;
    private boolean atallhatE;

    public Jedi (float ero, boolean atallhatE){
        this.ero = ero;
        this.atallhatE = atallhatE;
    }

    public float getEro() {return this.ero;}
    public void setEro(float ero) {this.ero = ero;}
    public boolean getAtallhatE() {return this.atallhatE;}
    public void setAtallhatE(boolean atallhatE) {this.atallhatE = atallhatE;}
    public void printErtekek(){
        if (this.atallhatE){
            System.out.println("A Jedi ereje: " + this.ero + " és átállhat a sötét oldalra.");
        } else {
            System.out.println("A Jedi ereje: " + this.ero + " és nem állhat át a sötét oldalra.");
        }
    }

    public abstract boolean megteremtiAzEgyensulyt();
    @Override
    public float mekkoraAzEreje() {
        return this.ero;
    }
    @Override
    public boolean atallithato(){
        return this.atallhatE;
    }
    @Override
    public boolean legyoziE(IEroErzekeny ellenfel){
        if (!ellenfel.atallithato()){
            return false;
        } else if (this.ero <= ellenfel.mekkoraAzEreje()){
            return false;
        } else {
            return true;
        }
    }
}

package model;

public class Notation {
    private int coef;
    private float note;
    private String matiere;
    public Notation(int coef, float note) {
        this.coef = coef;
        this.note = note;
    }
    public int getCoef() {
        return coef;
    }
    public float getNote() {
        return note;
    }
    public String getMatiere() {
        return matiere;
    }
    public void afficher() {
        System.out.printf("le coefficient est %d et la note est %f",coef,note);
    }
}

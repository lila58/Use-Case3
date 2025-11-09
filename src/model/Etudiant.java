package model;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private String avis;
    private ArrayList<Notation> notation;
    private float moyenne;

        public Etudiant(String nom) {
            this.nom = nom;
            this.prenom = prenom;
            this.avis = avis;
            this.notation = new ArrayList<>();
        }
        public Etudiant(String nom, String prenom, String avis, float moyenne) {
            this.nom = nom;
            this.prenom = prenom;
            this.avis = avis;
            this.moyenne = moyenne;


        }

        public void moyenne() {
            var sumCoef = 0;
            var sumcoefxnote=0;
            for(var n : notation){
                sumCoef+=n.getCoef();
                sumcoefxnote+=(n.getCoef()*n.getNote());
            }
            this.moyenne = sumCoef/sumcoefxnote;
            determinerAvis();
        }
        private void determinerAvis(){
            //Operateur ternaire
            avis =(moyenne >= 10) ? "Passe en classe supérieur" : "Autorisé à redoubler";;
        }
        public void ajouterNote(Notation n) {
            notation.add(n);

        }
        public void afficher() {
            System.out.println("Etudiant: " + this.nom);
            System.out.println("Etudiant: " + this.prenom);
            for (var n : notation){
                System.out.println(String.format("%S , %s",n.getMatiere(),n.getCoef(),n.getNote()));
            }
        }
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                ", avis='" + avis + '\'' +
                '}';
    }

}

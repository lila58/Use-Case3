package test;

import model.Etudiant;
import model.Notation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;


public class TestEtudiant {
    public static void main(String[] args) {
        String username = "root" , password ="root";
        String url = "jdbc:mysql://localhost:3306/gestionetudiant";

        try{
            Connection con = DriverManager.getConnection(url,username,password);

            var data=con.prepareStatement("select * from etudiant").executeQuery();
            ArrayList<Etudiant> etudiant = new ArrayList<Etudiant>();
            while(data.next()){
                String nom=data.getString("nom");
                String prenom=data.getString("prenom");
                float moyenne=data.getFloat("moyenne");
                String avis=data.getString("avis");

               Etudiant t1 = new Etudiant(nom,prenom,avis,moyenne);
               etudiant.add(t1);


            }
            for(Etudiant t:etudiant){
                System.out.println(t);
            }


        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}

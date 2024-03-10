package tp22;

import java.util.ArrayList;
import java.util.Collection;

public class TacheComplexe implements Tache {
    private String nom;
    private Collection<Tache> sousTaches;

    public TacheComplexe(String nom) {
        this.nom = nom;
        this.sousTaches = new ArrayList<>();
    }

    public void ajouter(Tache tache) {
        sousTaches.add(tache);
    }

    public void supprimer(Tache tache) {
        sousTaches.remove(tache);
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public int getCout() {
        int coutTotal = 0;
        for (Tache tache : sousTaches) {
            coutTotal += tache.getCout();
        }
        return coutTotal;
    }
}


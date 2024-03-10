package tp22;

public class Test{
    public static void main(String[] args) {
        TacheElementaire tache1 = new TacheElementaire("Tâche 1", 10);
        TacheElementaire tache2 = new TacheElementaire("Tâche 2", 20);
        TacheComplexe tacheComplexe = new TacheComplexe("Tâche complexe");
        tacheComplexe.ajouter(tache1);
        tacheComplexe.ajouter(tache2);

        System.out.println("Coût total de la tâche complexe : " + tacheComplexe.getCout());
    }
}


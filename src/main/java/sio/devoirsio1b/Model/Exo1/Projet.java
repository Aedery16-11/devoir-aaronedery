package sio.devoirsio1b.Model.Exo1;

public class Projet implements Comparable<Projet>
{
    // A vous de jouer
    private  int idProjet;
    private  String nomProjet;
    private int duree;
    private  double tauxHoraire;

    public Projet(int idProjet, String nomProjet, int duree, double tauxHoraire) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.duree = duree;
        this.tauxHoraire = tauxHoraire;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public int getDuree() {
        return duree;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public double calculerMontant()
    {
        return getDuree() * getTauxHoraire() * 8;
    }
    public String getInfos()
    {
        return "Numéro : " + getIdProjet() + " Nom : " + getNomProjet() + " Durée : " + getDuree() + " Taux horaire : " + getTauxHoraire();
    }
    @Override
    public int compareTo(Projet o) {
        return Integer.compare((int)o.getTauxHoraire(), (int) this.getTauxHoraire()  );
    }
}

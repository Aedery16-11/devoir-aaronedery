package sio.devoirsio1b.Model.Exo1;

public class ProjetMobile extends Projet
{
    // A vous de jouer
    private  int nbEcrans;

    public ProjetMobile(int idProjet, String nomProjet, int duree, double tauxHoraire, int nbEcrans) {
        super(idProjet, nomProjet, duree, tauxHoraire);
        this.nbEcrans = nbEcrans;
    }

    public int getNbEcrans() {
        return nbEcrans;
    }
    public double calculerMontant()
    {
        return getDuree() * getTauxHoraire() * 8 + getNbEcrans() * 200;
    }
    public String getInfos()
    {
        return super.getInfos() + " Nb écrans : " + getNbEcrans();
    }
}

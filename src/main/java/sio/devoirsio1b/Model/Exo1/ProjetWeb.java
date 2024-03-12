package sio.devoirsio1b.Model.Exo1;

public class ProjetWeb extends Projet
{
    // A vous de jouer

    private  boolean responsive;
    private int nbPages;

    public ProjetWeb(int idProjet, String nomProjet, int duree, double tauxHoraire, boolean responsive, int nbPages) {
        super(idProjet, nomProjet, duree, tauxHoraire);
        this.nbPages = nbPages;
        this.responsive = responsive;
    }

    public boolean isResponsive() {
        return responsive;
    }

    public int getNbPages() {
        return nbPages;
    }

    public double calculerMontant() {
        if (isResponsive()) {
            return getDuree() * getTauxHoraire() * 8 + getNbPages() * 100 + 500;
        }
        else
        {
            return getDuree() * getTauxHoraire() * 8 + getNbPages() * 100;
        }
    }
    public String getInfos()
    {
        return super.getInfos() + " Nb pages : " + getNbPages() + " Responsive : " + isResponsive();
    }

}

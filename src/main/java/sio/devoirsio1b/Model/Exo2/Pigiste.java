package sio.devoirsio1b.Model.Exo2;

import java.util.ArrayList;

public class Pigiste
{
    private int idPigiste;
    private String nomPigiste;
    private double prixPage;
    private ArrayList<Article> lesArticles;

    public Pigiste(int idPigiste, String nomPigiste, double prixPage) {
        this.idPigiste = idPigiste;
        this.nomPigiste = nomPigiste;
        this.prixPage = prixPage;
        this.lesArticles = new ArrayList<>();
    }

    public int getIdPigiste() {
        return idPigiste;
    }

    public String getNomPigiste() {
        return nomPigiste;
    }

    public double getPrixPage() {
        return prixPage;
    }

    public ArrayList<Article> getLesArticles() {
        return lesArticles;
    }

    public void ajouterArticle(Article article)
    {
        lesArticles.add(article);
    }

    // Cette méthode calcule le chiffre d'affaires d'un pigiste
    // Ce dernier se détermine de la façon suivante
    // ca = somme des prix * nbPages
    public double calculerCA()
    {
        double ca = 0;
        double somme = 0;

        // A vous de jouer
        for (Article article : lesArticles)
        {
            somme =  getPrixPage() * article.getNbPages();
            ca  = article.getNbPages() * somme;

        }
        return ca;
    }

    // Cette méthode calcule le nombre
    // d'articles en fonction d'un numéro
    // de mois passé en paramètre
    public int getNbArticles(int mois) {


        return 0;
}}

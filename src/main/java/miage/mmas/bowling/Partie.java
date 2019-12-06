package miage.mmas.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {

    private List<Jeu> jeux = new ArrayList<>();

    public Partie(Jeu leJeu) {
        for (int i = 0; i < 10; i++) {
            jeux.add(leJeu);
        }
        if(jeux.get(9).estUnSpare() || leJeu.estUnStrike()) {
            jeux.add(leJeu);
        }
        if(jeux.get(9).estUnStrike()) {
            jeux.add(leJeu);
        }
    }

    public Integer calculeScore() {
        Integer score = 0;
        for (int i=0; i < 10; i++) {
            Jeu jeuCourant = jeux.get(i);
            if(jeuCourant.estUnSpare()) {
                score += jeux.get(i+1).getLancer1();
            }
            score += jeuCourant.nombreQuillesTombees();
            // Le jeu courant est un strike
            if(jeuCourant.estUnStrike()) {
                score += jeux.get(i+1).getLancer1();
                if(jeux.get(i+1).getLancer2() != null) {
                    score += jeux.get(i+1).getLancer2();
                } else {
                    score += jeux.get(i+2).getLancer1();
                }
            }
        }
        return score;
    }
}
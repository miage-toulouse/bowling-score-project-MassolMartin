package miage.mmas.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {

    // Cas nominaux
    // ici le cas nominal c'est a chaque jeu on fait tomber 6 quilles par exemple
    @Test
    public void testCalculeScorePartieNominale() {
        // given : Une partie de 10 jeux avec 6 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(6, 0);
        Partie laPartie = new Partie(leJeu);
        // when : on calcule le score
        //ici integer car le score peut être à null
        Integer score = laPartie.calculeScore();
        // then : On obtient un score de 60
        assertEquals(Integer.valueOf(60), score);
    }

    // Cas Limites
    @Test
    public void testCalculeScorePartieAvecQueDesSpare() {
        // given : Une partie de 10 jeux avec 5, 5 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(5, 5);
        Partie laPartie = new Partie(leJeu);
        // when : on calcule le score
        Integer score = laPartie.calculeScore();
        // then : On obtient un score de 150
        assertEquals(Integer.valueOf(150), score);
    }

    @Test
    public void testCalculeScorePartieAvecQueDesStrike() {
        // given : Une partie de 10 jeux avec 10, 0 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(10, NULL);
        Partie laPartie = new Partie(leJeu);
        // when : on calcule le score
        Integer score = laPartie.calculeScore();
        // then : On obtient un score de 300
        assertEquals(Integer.valueOf(300), score);
    }

    // Cas d'erreurs

}
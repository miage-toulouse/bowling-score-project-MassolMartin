package miage.mmas.bowling;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Jeu {

    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Integer nombreQuillesTombees() {
        return lancer1 + lancer2;
    }

    public Integer getLancer1() {
        return lancer1;
    }

    public Integer getLancer2() {
        return lancer2;
    }

    public Boolean estUnSpare() {
        if(lancer1 + lancer2 == 10 && lancer1 != 10) {
            return true;
        }
        return false;
    }

    public Boolean estUnStrike() {
        if(lancer1 == 10) {
            return true;
        }
        return false;
    }
}

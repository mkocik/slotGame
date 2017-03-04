package handlers.checkers;


/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class WinChecker implements IWinChecker {
    private double winningChance;

    public WinChecker(double winningChance) {
        this.winningChance = winningChance;
    }

    public boolean isWin() {
        return Math.random() < winningChance;
    }
}

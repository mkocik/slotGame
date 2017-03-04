package accounts;

/**
 * Created by maciej.kocik on 2/6/2017.
 */
public class Player {
    private Integer id;
    private Bet bet;

    public Player(Integer id, Bet bet) {
        this.id = id;
        this.bet = bet;
    }

    public Bet getBet() {
        return this.bet;
    }

    public String toString() {
        return "Player: " + this.id.toString() + " => " + this.bet.toString();
    }
}

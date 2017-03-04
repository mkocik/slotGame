package accounts;

import java.math.BigInteger;

/**
 * Created by maciej.kocik on 2/6/2017.
 */
public class Bet {
    private BigInteger coinsPerBet;

    public Bet(BigInteger coins) {
        this.coinsPerBet = coins;
    }

    public BigInteger getCoinsPerBet() {
        return this.coinsPerBet;
    }

    public String toString() {
        return "Current bet: " + this.coinsPerBet.toString();
    }
}

package accounts;

import java.math.BigInteger;

/**
 * Created by maciej.kocik on 2/6/2017.
 */
public class Wallet {
    private BigInteger coinBalance;

    public Wallet() {
        this.coinBalance = new BigInteger("0");
    }

    public void addCoinsToBalance(BigInteger coins) {
        coinBalance = coinBalance.add(coins);
    }

    public void chargeWallet(BigInteger coins) {
        coinBalance = coinBalance.subtract(coins);
    }

    public BigInteger getCoinsBalance() {
        return this.coinBalance;
    }

    public String toString() {
        return "Current amount of coins: " + this.coinBalance.toString();
    }
}

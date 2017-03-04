package handlers.appliers;

import accounts.Player;
import accounts.Wallet;

import java.math.BigInteger;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class CoinWinApplier implements IWinApplier {
    private static final BigInteger COIN_WIN = new BigInteger("20");
    private Wallet wallet;

    public CoinWinApplier(Wallet wallet){
        this.wallet = wallet;
    }

    public void applyWin() {
        wallet.addCoinsToBalance(COIN_WIN);
    }
}

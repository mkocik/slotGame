package handlers;

import java.util.HashSet;

/**
 * Created by maciej.kocik on 2/7/2017.
 */
public class WinHandlersManager {
    private HashSet<IWinHandler> winHandlers;

    public WinHandlersManager() {
        this.winHandlers = new HashSet<>();
    }

    public void registerWinHandler(IWinHandler winHandlers) {
        this.winHandlers.add(winHandlers);
    }

    public HashSet<IWinHandler> getWinHandlers() {
        return this.winHandlers;
    }

    public void handleWinSituations() {
        for(IWinHandler winHandler: winHandlers){
            winHandler.handleWinSituation();
        }
    }
}

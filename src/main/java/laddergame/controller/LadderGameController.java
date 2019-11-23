package laddergame.controller;

import laddergame.domain.player.LadderPlayers;
import laddergame.service.LadderGameService;
import laddergame.view.InputView;
import laddergame.view.OutputView;

public class LadderGameController {

    private final InputView inputView;
    private final OutputView outputView;
    private final LadderGameService ladderGameService = new LadderGameService();

    public LadderGameController(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        String playerNameInputs = inputView.inputPlayerNames();
        LadderPlayers ladderPlayers = ladderGameService.createPlayers(playerNameInputs);
    }
}

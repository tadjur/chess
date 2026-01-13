package engine.api;

import java.util.UUID;


public interface ChessEngine {

  EngineMoveResponse getBestMove(UUID gameId, String fen);

  EngineMoveResponse getBestMove(UUID gameId, String fen, long remainingMs, long incrementMs);
}


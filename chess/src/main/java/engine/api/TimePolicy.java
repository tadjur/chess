package engine.api;

import engine.board.Board;

public interface TimePolicy
{
  long computeTime(Board board, long remainingMs, long incrementMs)ł
}

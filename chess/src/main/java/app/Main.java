package app;

import engine.board.Board;

import engine.move.Move;
import engine.move.MoveGenerator;
import engine.search.Search;
import engine.search.TranspositionTable;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MainGameLoop mgl = new MainGameLoop(new Search(new TranspositionTable(1024)), 600000,600000,0,0);
        Board b = new Board();
        b.loadFEN("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        mgl.play(b,true);

    }
}




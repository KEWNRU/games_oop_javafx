package ru.job4j.chess.firuges.black;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        BishopBlack bp = new BishopBlack(Cell.A6);
        assertThat(bp.position(), is(Cell.A6));
    }

    @Test
    public void way(){
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(expected));
    }

    @Test
    void copy() {
        BishopBlack bp = new BishopBlack(Cell.A6);
        assertThat(bp.copy(Cell.A6).position(), is(Cell.A6));
    }
}
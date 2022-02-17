package es.sralloza.year_2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class Day02Test {

    private String filedata = "forward 5\ndown 5\nforward 8\nup 3\ndown 8\nforward 2";

    @Test
    public void testPart1() {
        Day02 day = new Day02();
        day.setFiledata(filedata);
        assertEquals(Optional.of(150), day.runPartA());
    }

    @Test
    public void testPart2() {
    Day02 day = new Day02();
    day.setFiledata(filedata);
    assertEquals(Optional.of(900), day.runPartB());
    }
}

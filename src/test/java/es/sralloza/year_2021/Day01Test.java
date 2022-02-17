package es.sralloza.year_2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class Day01Test {

    private String filedata = "199\n200\n208\n210\n200\n207\n240\n269\n260\n263";

    @Test
    public void testPart1() {
        Day01 day = new Day01();
        day.setFiledata(filedata);
        assertEquals(Optional.of(7), day.runPartA());
    }

    @Test
    public void testPart2() {
        Day01 day = new Day01();
        day.setFiledata(filedata);
        assertEquals(Optional.of(5), day.runPartB());
    }
}

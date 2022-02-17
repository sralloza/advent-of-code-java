package es.sralloza.year_2021;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class Day03Test {

    private String filedata = "00100\n11110\n10110\n10111\n10101\n01111\n" + "00111\n11100\n10000\n11001\n00010\n01010";

    @Test
    public void testPart1() {
        Day03 day = new Day03();
        day.setFiledata(filedata);
        assertEquals(Optional.of(198), day.runPartA());
    }

    // @Test
    // public void testPart2() {
    //     Day02 day = new Day02();
    //     day.setFiledata(filedata);
    //     assertEquals(Optional.of("900"), day.runPartB());
    // }
}

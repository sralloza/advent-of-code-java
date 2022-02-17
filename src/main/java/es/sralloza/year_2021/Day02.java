package es.sralloza.year_2021;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import es.sralloza.AOCBase;

public class Day02 extends AOCBase <Integer> {
    public static void main(String[] args) {
        Day02 day = new Day02();
        day.run();
    }

    @Override
    public Optional<Integer> runPartA() {
        List<String> inputLines = getFiledata().lines().collect(Collectors.toList());
        Integer x = 0;
        Integer y = 0;
        for (String line : inputLines) {
            Integer number = Integer.parseInt(line.split(" ")[1]);
            if (line.contains("forward"))
                x += number;
            else if (line.contains("down"))
                y += number;
            else if (line.contains("up"))
                y -= number;
        }
        return Optional.of(x * y);
    }

    @Override
    public Optional<Integer> runPartB() {

        List<String> inputLines = getFiledata().lines().collect(Collectors.toList());
        Integer aim = 0;
        Integer x = 0;
        Integer y = 0;
        for (String line : inputLines) {
            Integer number = Integer.parseInt(line.split(" ")[1]);
            if (line.contains("forward")) {
                x += number;
                y += number * aim;
            } else if (line.contains("down"))
                aim += number;
            else if (line.contains("up"))
                aim -= number;
        }
        return Optional.of(x * y);
    }
}

package es.sralloza.year_2021;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import es.sralloza.AOCBase;

public class Day01 extends AOCBase {
    public static void main(String[] args) {
        Day01 day = new Day01();
        day.run();
    }

    @Override
    public Optional<String> runPartA() {
        Stream<String> inputLinesStream = getFiledata().lines();
        List<Integer> lectures = inputLinesStream.map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> differences = IntStream.range(0, lectures.size() - 1)
                .map(i -> lectures.get(i + 1) - lectures.get(i)).boxed().collect(Collectors.toList());

        Integer increases = (int) differences.stream().filter(t -> t > 0).count();
        return Optional.of(increases.toString());
    }

    @Override
    public Optional<String> runPartB() {
        Stream<String> inputLinesStream = getFiledata().lines();
        List<Integer> lectures = inputLinesStream.map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> windows = IntStream.range(0, lectures.size() - 2)
                .map(i -> lectures.get(i) + lectures.get(i + 1) + lectures.get(i + 2))
                .boxed()
                .collect(Collectors.toList());
        List<Integer> differences = IntStream.range(0, windows.size() - 1)
                .map(i -> windows.get(i + 1) - windows.get(i)).boxed().collect(Collectors.toList());

        Integer increases = (int) differences.stream().filter(t -> t > 0).count();
        return Optional.of(increases.toString());
    }
}

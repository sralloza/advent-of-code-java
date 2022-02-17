package es.sralloza.year_2021;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import es.sralloza.AOCBase;

public class Day03 extends AOCBase<Integer> {
    public static void main(String[] args) {
        Day03 day = new Day03();
        day.run();
    }

    @Override
    public Optional<Integer> runPartA() {
        String input = getFiledata();
        ArrayList<String> charlist = new ArrayList<>();
        for (int i = 0; i < input.split("\n")[0].length(); i++) {

            final int index = i;
            var occurrences = input.lines()
                    .map(s -> s.charAt(index))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue());
            charlist.add(occurrences.get().getKey().toString());
        }
        String binaryGamma = String.join("", charlist);
        String binaryEpsilon = binaryGamma.replace("0", "-").replace("1", "0").replace("-", "1");

        return Optional.of(Integer.parseInt(binaryGamma, 2) * Integer.parseInt(binaryEpsilon, 2));
    }

    @Override
    public Optional<Integer> runPartB() {
        return Optional.empty();
    }
}

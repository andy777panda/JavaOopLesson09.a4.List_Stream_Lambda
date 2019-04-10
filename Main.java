package net.ukr.andy777;

/*
Lesson09add
4. Найдите максимальное число из набора чисел, которые хранятся в текстовом файле.
*/

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
        try {
        	double max = Files.lines(Paths.get("file.txt"))
                    .flatMapToDouble(n -> Stream.of(n.split(","))
                    .mapToDouble(d -> Double.parseDouble(d)))
                    .max().getAsDouble();
            System.out.println(max);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}

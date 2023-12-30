package inOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("resources", "task1.txt");
		BufferedReader bufferedReader = Files.newBufferedReader(path);
		List<String[]> collect = bufferedReader.lines().map(line -> line.replaceAll("[!,–]", "").toLowerCase())
				.map(line -> line.split(" ")).collect(Collectors.toList());
		List<String> collect2 = collect.stream().flatMap(Arrays::stream).filter(t -> !t.isBlank())
				.collect(Collectors.toList());
		for (int i = 1; i < collect2.size(); i++) {
			String current = collect2.get(i);
			String prev;
			if (i == 1) {
				prev = collect2.get(0);
			} else {
				prev = collect2.get(i - 1);
			}
			if (prev.charAt(prev.length() - 1) == current.charAt(0)) {
				System.out.println(prev + " " + current);
			}
		}
	}
}

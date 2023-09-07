package dataStrcutures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


import static java.util.stream.Collectors.toList;

public class Array2D {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        Integer[][] arrayTwoDim = new Integer[arr.size()][];
        for (int i = 0; i < arrayTwoDim.length; i++) {
			List<Integer> row = arr.get(i);
			arrayTwoDim[i] = row.toArray(new Integer[row.size()]);
		}
        int sum = 0;
        for (int i = 0; i < 4; i++) {
        	int counter = 0;
        	while (counter < 4) {
        		int hourGlassSum = 0;
        		for (int j = 0; j < 3; j++) {
    				Integer[] row = Arrays.copyOfRange(arrayTwoDim[i+j], counter, counter + 3);
    				if(j != 1) {
    					for (int s = 0; s < row.length; s++) {
    						hourGlassSum = hourGlassSum + row[s];
    					}
					} else {
    						hourGlassSum = hourGlassSum + row[1];
    					}
    				}
        		if (counter == 0 && i == 0) {
					sum = hourGlassSum;
				}
        		if (sum < hourGlassSum) {
					sum = hourGlassSum;
				}
    				counter++;
			}
        }
        System.out.println(sum);
	}
}


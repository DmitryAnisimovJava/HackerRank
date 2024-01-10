package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class QueryCreator {

	private static final String INSERT = "INSERT INTO %s.%s (%s, %s) VALUES ('%s', '%s');";

	public static String insert(String brand, String model) throws Exception {

		Constructor<Car> constructor = Car.class.getConstructor(String.class, String.class);
		Car car = constructor.newInstance(model, brand);
		Table annotationTable = car.getClass().getAnnotation(Table.class);

		Field[] fields = Car.class.getDeclaredFields();

		List<String> fieldNames = Arrays.stream(fields).filter(field -> field.isAnnotationPresent(Column.class))
				.sorted(Comparator.comparing(Field::getName)).map(field -> field.getAnnotation(Column.class))
				.map(Column::column).collect(Collectors.toList());

		List<String> fieldValues = Arrays.stream(fields).filter(field -> field.isAnnotationPresent(Column.class))
				.sorted(Comparator.comparing(Field::getName)).peek(field -> field.setAccessible(true)).map(field -> {
					try {
						return String.valueOf(field.get(car));
					} catch (Exception e) {
						return "";
					}
				}).collect(Collectors.toList());
		return INSERT.formatted(annotationTable.schema(), annotationTable.table(), fieldNames.get(0), fieldNames.get(1),
				brand, model);
	}

	public static void main(String[] args) throws Exception {
		System.out.println(insert("Toyota", "supra"));
	}
}

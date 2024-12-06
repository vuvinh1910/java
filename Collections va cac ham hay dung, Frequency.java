List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int index = Collections.binarySearch(numbers, 3); // chi tim kiem khi da duoc sap xep,
System.out.println(index); // 2

// dao nguoc chuoi
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Collections.reverse(numbers);
System.out.println(numbers); // [5, 4, 3, 2, 1]

// nho nhat lon nhat trong chuoi
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
System.out.println(Collections.max(numbers)); // 5
System.out.println(Collections.min(numbers)); // 5

// thay the
List<String> names = Arrays.asList("Alice", "Bob", "Alice");
Collections.replaceAll(names, "Alice", "Eve");
System.out.println(names); // [Eve, Bob, Eve]

// dem so lan xuat hien
List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
System.out.println(Collections.frequency(names, "Alice")); // 2

// xoay chuoi
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Collections.rotate(numbers, 2);
System.out.println(numbers); // [4, 5, 1, 2, 3]


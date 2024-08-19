String str1 = "Hello";
String str2 = "Hello";
String str3 = "hello";

if (str1.equals(str2)) {
    System.out.println("str1 và str2 có nội dung giống nhau.");
} else {
    System.out.println("str1 và str2 có nội dung khác nhau.");
}

if (str1.equals(str3)) {
    System.out.println("str1 và str3 có nội dung giống nhau.");
} else {
    System.out.println("str1 và str3 có nội dung khác nhau.");
}

String str1 = "Hello";
String str2 = "hello";

if (str1.equalsIgnoreCase(str2)) {
    System.out.println("str1 và str2 có nội dung giống nhau (không phân biệt chữ hoa chữ thường).");
} else {
    System.out.println("str1 và str2 có nội dung khác nhau.");
}

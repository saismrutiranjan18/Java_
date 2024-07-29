public class typeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening Conversion)
        int intVal = 100;
        double doubleVal = intVal; // int to double
        System.out.println("Implicit Conversion (int to double): " + doubleVal);

        // Explicit Type Conversion (Narrowing Conversion)
        double largeDouble = 100.99;
        int intFromDouble = (int) largeDouble; // double to int
        System.out.println("Explicit Conversion (double to int): " + intFromDouble);

        // Another example with char and int
        char charVal = 'A';
        int charToInt = charVal; // char to int (implicit)
        System.out.println("Implicit Conversion (char to int): " + charToInt);

        // Explicit conversion from int to char
        int intToChar = 66;
        char intAsChar = (char) intToChar; // int to char
        System.out.println("Explicit Conversion (int to char): " + intAsChar);
    }
}

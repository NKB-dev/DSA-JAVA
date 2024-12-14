public class PRETTY_PRINTING {
    public static void main(String[] args) {
        String name = new String("helen");// same vale but different memory locations in heap
        String naam= new String("helen");
        System.out.println(name==naam);//== checks whether the values have same memory locations (OP FALSE)
        System.out.println(name.equals(naam)); // checks whether both values are equal (OP TRUE)

        // PRETTY PRINTING
        float f=2334.344f;
        System.out.printf("Formatted string is %.2f" , f ); // % is for placeholder .2f - will take up to 2 places after decimal
        System.out.printf("Formatted string is %.2f" , Math.PI );
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Java offers a variety of format specifiers for formatting strings, especially with String.format() and System.out.printf() methods. Here’s a list of common string formatters in Java:
//
//        General Format Specifiers:
//
//%s - Formats strings.
//                %c - Formats characters.
//                %d - Formats decimal integers.
//%f - Formats floating-point numbers.
//                %b - Formats Boolean values.
//%e - Formats floating-point numbers in scientific notation.
//%x / %X - Formats integers as hexadecimal (lowercase/uppercase).
//                %o - Formats integers as octal.
//                %h - Formats values with their hash code in hexadecimal.
//                Width and Precision:
//
//%[width]s - Sets minimum width for a string. E.g., %10s right-aligns a string in a 10-character wide field.
//%.precision - Specifies precision for floating-point numbers or max length for strings. E.g., %.2f limits a float to 2 decimal places.
//        Flags:
//
//        - - Left-aligns within a specified width. E.g., %-10s left-aligns a string in a 10-character field.
//                + - Shows the + or - sign for numerical values.
//        0 - Pads numbers with leading zeros. E.g., %05d formats an integer with a width of 5, padded with zeros.
//, - Adds comma separators for large numbers. E.g., %,d formats 10000 as 10,000.
//        ( - Encloses negative numbers in parentheses.
//        Date and Time:
//
//%t - Specifies date/time values, followed by a character for specific formats (requires java.util.Date or java.time types).
//%tY - Four-digit year.
//                %ty - Last two digits of the year.
//                %tm - Month as two digits.
//                %td - Day of the month as two digits.
//%tH - Hour (24-hour format).
//                %tI - Hour (12-hour format).
//                %tM - Minutes.
//                %tS - Seconds.
//                %Tp - AM/PM.
//                Argument Index:
//
//%[index]$s - Specifies the argument position, useful for reordering or reusing arguments. E.g., %1$s %2$s %1$s for repeated use of the same argument.
    }
}

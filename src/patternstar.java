public class patternstar {
    public static void main(String[] args) {
        int n = 10; // Number of rows and columns
        for (int i = 0; i < n; n--) { // Iterate through rows
            for (int j = 0; j < n; j++) { // Iterate through columns
                System.out.print("pottan "+" ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}


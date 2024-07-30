public class CharAt {
    public static void main(String[] args) {
        String firstName = "sai";
        printLetters(firstName);
    }

    public static void printLetters(String firstName) {
        for (int i = 0; i<firstName.length(); i++){
            System.out.print(firstName.charAt(i) + " ");
        }
        System.out.println();
    }
}

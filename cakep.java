import java.util.Scanner;

public class cakep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input prompt
        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\nJawab (Yoi/Enggak): ");
        String answer = scanner.nextLine();
        
        // Check answer and provide appropriate output
        if (answer.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else if (answer.equalsIgnoreCase("Enggak")) {
            System.out.println("Tetep cakep sih.\nSing penting paham konsep nya yee.\nKeep the code works dude");
        } else {
            System.out.println("Jawaban tidak valid. Silakan jawab dengan 'Yoi' atau 'Enggak'.");
        }
        
        scanner.close();
    }
}

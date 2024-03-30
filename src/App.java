import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to (insert name here). To begin, press the enter key.");
        Scanner reader = new Scanner(System.in);
        reader.nextLine();
        System.out.println("In this game you will play as Bob. He lives in the village of Aquarine. He works as a dragon breeder and breeds many dragons for the village folk. (Type next to continue)");
        new Question("Next", null, null, null);
    }
}

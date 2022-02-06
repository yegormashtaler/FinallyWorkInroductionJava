package H13;

import java.util.Scanner;

public class MainClass {

    public static String[] definitely;

    public static int getUserData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("""
                > Enter 1 to display dialogs in Russian
                > Enter 2 to display dialogues in Ukrainian
                > Enter 3 to display dialogues in English
                > Enter 4 to display dialogues in Spanish
                > Enter 5 to display dialogues in Italian""");
        String[] dialogOnRussianLanguage = {"> " + "0 - выход, 1 - поиск по Эльфам Лучникам, 2 - поиск по обычным Эльфам, 3 - поиск по Эльфам Мечникам\n"};
        String[] dialogOnUkrainianLanguage = {"> " + "0 - вихід, 1 - пошук по Ельфам Лучникам, 2 - пошук за звичайним Ельфам, 3 - пошук по Ельфам Мечникам\n"};
        String[] dialogOnEnglishLanguage = {"> " + "0 - exit, 1 - search for Elf Archers, 2 - search for regular Elves, 3 - search for Elf Swordsmen\n"};
        String[] dialogOnSpanishLanguage = {"> " + "0 - salir, 1 - buscar arqueros elfos, 2 - buscar elfos normales, 3 - buscar espadachines elfos\n"};
        String[] dialogOnItalianLanguage = {"> " + "0 - uscita, 1 - cerca arcieri elfi, 2 - cerca elfi normali, 3 - cerca spadaccini elfi\n"};
        System.out.println();
        System.out.println("> " + "Enter the language number and choose a new action: ");
        Scanner scanner = new Scanner(System.in);
        int userOption = getUserData(scanner);
        switch (userOption) {
            case 1 -> definitely = dialogOnRussianLanguage;
            case 2 -> definitely = dialogOnUkrainianLanguage;
            case 4 -> definitely = dialogOnSpanishLanguage;
            case 5 -> definitely = dialogOnItalianLanguage;
            default -> definitely = dialogOnEnglishLanguage;
        }
        System.out.println();
        System.out.println(definitely[0]);
        int userData = getUserData(scanner);
        switch (userData) {
            case 1 -> {
                ElfArcher ElfArcher = new ElfArcher();
                ElfArcher.outputGreetingsForElfArcher();
            }
            case 2 -> {
                ElfOrdinary ElfOrdinary = new ElfOrdinary();
                ElfOrdinary.outputGreetingsForElfOrdinary();
            }
            case 3 -> {
                ElfSwordsman ElfSwordsman = new ElfSwordsman();
                ElfSwordsman.outputGreetingsForElfSwordsman();
            }
        }
        scanner.close();
    }
}
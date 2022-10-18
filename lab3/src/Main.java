import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsItEd();
        SumOfNumbers();
        FindingTheLongestBlock();
        FindIsolatedWords();
        ConnectTwoWords();
    }


    public static boolean IsItEd() { //первое задание
        Scanner in = new Scanner(System.in);
        System.out.println("Введитесловодляпроверки");
        String word = in.next();
        int wordLength = word.length();
        if (word.charAt(wordLength - 1) == 'd' && (word.charAt(wordLength - 2)) == 'e')
            return true;
        else
            return false;
    }

    public static void SumOfNumbers() { //второе задание
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст, где вы хотите проверить количество цифр:");
        String WordWithNumbers = in.next();
        float NumberFromWord = 0;//создание переменной с суммой чисел
        int sum = 0;
        /* int lengthOfWord=WordWithNumbers.length();*/
        for (int i = 0; i < WordWithNumbers.length(); i++) {
            if (WordWithNumbers.charAt(i) >= '0' && WordWithNumbers.charAt(i) <= '9') {
                NumberFromWord = Character.getNumericValue(WordWithNumbers.charAt(i));
                sum += NumberFromWord;
            }
        }
        System.out.println("Сумма цифр равна " + sum);
    }

    public static void FindingTheLongestBlock() { //третье задание
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите слово, в котром надо найти самы длинный блок с подряд идущими одинаковыми символами");
        String WordWithBlocks = in.next();
        int max = 0;
        int comparable = 0;
        for (int i = 0; i < WordWithBlocks.length() - 1; i++) {
            if (WordWithBlocks.charAt(i) == WordWithBlocks.charAt(i + 1)) {
                comparable++;
                if (comparable > max) max = comparable;
            }
            if (WordWithBlocks.charAt(i) != WordWithBlocks.charAt(i + 1)) comparable = 0;
        }
        System.out.println("Длина самого длинного блока : " + max);
    }

    public static void FindIsolatedWords() { //четвертое задане
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите какую-нибудь фразу");
        String line = in.nextLine();
        String[] words = line.split(" ");
        System.out.println("Вот слова из вашей фразы : " + Arrays.toString(words));
    }

    public static void ConnectTwoWords() { //пятое задание
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите два слова");
        System.out.println("Первое слово: ");
        String firstWord = in.next();
        System.out.println("Второе слово: ");
        String secondWord = in.next();
        StringBuffer NewWord = new StringBuffer();
        int biggestLength = 0;
        if (firstWord.length() > secondWord.length()) biggestLength = firstWord.length();
        int elsebiggestLength = secondWord.length();
        for (int i = 0; i < biggestLength; i++) {
            if (firstWord.length() > i) {
                NewWord.append(firstWord.charAt(i));
            }
            if (secondWord.length() > i) NewWord.append(secondWord.charAt(i));
        }
        System.out.println("Полученное слово: " + NewWord);
    }
}
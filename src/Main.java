import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.println("Введите строку, например: 'I love java 8 Я люблю java 14 core1'");
        String str1 = input.nextLine();

        Pattern pattern = Pattern.compile("[A-Za-z]+\s");
        Matcher matcher = pattern.matcher(str1);
        System.out.print("Слова состоящие только из латиницы: ");
        while (matcher.find()) {
            System.out.print(matcher.group());   // вопрос 1
        }

        String[] array = str1.split(" ");
        System.out.println("Количество введенных слов: " + array.length); // вопрос 2
    }
}


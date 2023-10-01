import java.util.Arrays;
import java.util.Comparator;

public class SortByUppercaseLetters {
    public static void main(String[] args) {
        String[] strings = {"Hello", "WORLD", "abc", "DefG", "Java"};

        // Використовуємо компаратор для сортування за кількістю великих літер
        Arrays.sort(strings, new UppercaseLetterComparator());

        // Виводимо відсортований масив
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

class UppercaseLetterComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int count1 = countUppercaseLetters(s1);
        int count2 = countUppercaseLetters(s2);

        // Порівнюємо рядки за кількістю великих літер
        return Integer.compare(count1, count2);
    }

    private int countUppercaseLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}

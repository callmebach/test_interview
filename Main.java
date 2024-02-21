import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi chu cai Latin: ");
        String latinString = scanner.nextLine();

        int result = countCharacters(latinString);
        System.out.println("So luong chu cai tieng viet co the tao thanh trong chuoi la: " + result);

        scanner.close();
    }

    public static int countCharacters(String latinString) {
        Set<String> vietnameseCharacters = new HashSet<>();
        vietnameseCharacters.add("aa");
        vietnameseCharacters.add("aw");
        vietnameseCharacters.add("ee");
        vietnameseCharacters.add("dd");
        vietnameseCharacters.add("ow");
        vietnameseCharacters.add("oo");
        vietnameseCharacters.add("w");

        int count = 0;
        int i = 0;
        while (i < latinString.length() - 1) {
            if (vietnameseCharacters.contains(latinString.substring(i, i + 2))) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count;
    }
}

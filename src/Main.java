import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> name = new LinkedHashMap<>();
        ArrayList<StringBuilder> selectionName = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i =1; i<15; i++){
            name.put(i,scanner.nextLine());
            switch (i){
                case 1,2,5,8,9,13 -> selectionName.add(new StringBuilder(name.get(i)));
            }
        }
        selectionName.stream().filter(n-> (n.length()%2==1)).map(StringBuilder::reverse).collect(Collectors.toList());
        System.out.println(selectionName);
    }
}

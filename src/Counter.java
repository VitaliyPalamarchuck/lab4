import java.util.HashMap;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть слово для підрахунку кількості повторів букв у ньому: ");
        String word= scanner.nextLine();
        HashMap<Character, Integer> counter = new HashMap<>();
        //підрахунок букв
        for(char letter : word.toCharArray()){
            if(counter.containsKey(letter)){//якщо буква вже є в мапі
                counter.put(letter,counter.get(letter)+1);//збільшуємо її к-сть на 1
            }else{
                counter.put(letter,1);//якщо немає то додаємо букву з к-стю 1
            }
        }
        //Виведення результату
        for(Character key : counter.keySet()){
            Integer value =counter.get(key);
            System.out.println(key+" ---> "+value);
        }


    }
}

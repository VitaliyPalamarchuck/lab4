import java.util.HashMap;
import java.util.Scanner;
public class PhoneList {
    public static void main(String[] args) {
        HashMap<String, String> phoneList=new HashMap<>();

        phoneList.put("Сергій","380985637836");
        phoneList.put("Андрій","380985673886");
        phoneList.put("Юра","380985671996");
        phoneList.put("Віталій","380985005836");
        phoneList.put("Інна","380985137311");

        Scanner scanner=new Scanner(System.in);
        //Пошук номера
        System.out.println("Введіть ім'я для пошуку: ");
        String name= scanner.nextLine();
        String phonenumber= phoneList.get(name);
        if(phonenumber==null){
            System.out.println("Абонента не знайдено");
        }else{
            System.out.println("Номер телефону: "+phonenumber);
        }
        //Видалення номера
        System.out.println("Введіть ім'я для видалення: ");
        name = scanner.nextLine();
        String removeNumber=phoneList.remove(name);
        if(removeNumber==null){
            System.out.println("Абонента не знайдено");
        }else{
            System.out.println("Номер телефону видалено ");
        }
        System.out.println("<<Номера телефонів що залишились>>");
        for(String key : phoneList.keySet()){
            String value =phoneList.get(key);
            System.out.println(key+" ---> "+value);
        }
    }
}

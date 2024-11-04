import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class StudentsName {
    public static void main(String[] args) {
        String [] namesArrey={"Анна","Олексій","Анна","Іван","Марія"};

        Set <String> uniqueNames = new HashSet<>();//Використання ХешСет для унікальних імен

        for(String name : namesArrey){//додавання унікальних імен в ХешСет
            uniqueNames.add(name);
        }
        System.out.println("Унікальні імена: "+uniqueNames);

        Set <String> linkedNames=new LinkedHashSet<>();//Використання ЛінкедХешСет

        for(String name : namesArrey){//додавання імен в ЛінкедХешСет
            linkedNames.add(name);
        }
        System.out.println("Унікальні імена в порядку їх додавання: "+linkedNames);

        String yourName="Віталій";
        System.out.println("Ваше ім'я: "+yourName);
        boolean containName= linkedNames.contains(yourName);
        System.out.println("Чи входить ваше ім'я в список: "+containName);

    }
}
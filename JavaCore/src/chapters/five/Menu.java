package chapters.five;

import java.io.IOException;

//Использование цикла do-while для обработки выбора пункты меню.
public class Menu {
    public static void main(String[] args) throws IOException {
        char choice;

        do {
            System.out.println("Кратка справка по: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println(" Выберите вариант: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice){
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператора;");
                System.out.println("else оператор");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch(выражение)");
        }
    }
}

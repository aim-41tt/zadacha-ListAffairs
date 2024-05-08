package zadacha_ListAffairs;

import java.util.List;
import java.util.Scanner;

public class Main {
	 static ListAffairs ListAffairs = new ListAffairs();
     
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

        while (true){
           System.out.println("0. Выход из программы\n" +
                   "1. Добавить дело\n" +
                   "2. Показать дела\n" +
                   "3. Удалить дело по номеру\n" +
                   "4. Удалить дело по названию");
            int scanContext = sc.nextInt();
            System.out.println("Ваш выбор:"+scanContext);
            
            scanindex(scanContext);
            
          
        }
    }
    
    private static void scanindex(int index) {
    	Scanner sc = new Scanner(System.in);
    	switch (index) {
        case 0: {
            System.exit(0);
            break;
        }
        case 1: {
            System.out.println("Введите название задачи:");
            
            if (ListAffairs.add(sc.nextLine())) {
                System.out.println("Добавлено!");
                break;
            }

            break;
        }
        case 2: {
            System.out.println("Дела:");
            List<String> list = ListAffairs.getListaffairs();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(1 + i + ") " + list.get(i));
            }
            System.out.println();
            break;
        }
        case 3: {
            System.out.println("введите номер задачи");
            int indexe = sc.nextInt();
            System.out.println(ListAffairs.removeIndex(indexe));
            break;
        }
        case 4: {
            System.out.println("введите полное навание задачи");
            String text = sc.nextLine();
            System.out.println(ListAffairs.removeText(text));
            break;
        }

    }
    }
    
}

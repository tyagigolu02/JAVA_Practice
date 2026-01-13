package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProject {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();
        boolean isTrue = true;
        while(isTrue){
            System.out.println("-----Menu------");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display All Task");
            System.out.println("4. Exit");
            System.out.print("What would you like to do?");

            int choice = sc.nextInt();
            //sc.nextLine(); // consume
            switch (choice){
                case 1:
                    System.out.print("Enter Task : ");
                    String task = sc.next();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;
                case 3:
                    System.out.println("Your tasks.");
                    for(int i = 0; i < tasks.size(); i++){
                        System.out.println(tasks.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Enter number of tasks to remove: ");
                    int num = sc.nextInt();
                    tasks.remove(num);
                    System.out.println("Task removed successfully!");
                    break;
                case 4:
                    isTrue = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        }
    }
}

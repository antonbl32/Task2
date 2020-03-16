package by.home.task;
import java.text.ParseException;
import java.util.Scanner;

import static by.home.task.Test.selectGroup;
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 */
//Группа 1- комната
//Группа 2- ванна
//Группа 3- кухня

public class Runner {
        public static void main(String[] args) throws ParseException {
            try {Test.addPribor();}catch (ParseException s) {System.out.println("Не верные данные");}
            int key=addCheck();
            switch (key){
                case 1:
                    System.out.println(selectGroup(1).toString());
                    break;
                case 2:

                    break;
                case 3:

                    break;

            }

        }

/*
        private static int addVibor() throws NumberFormatException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int key=0;
            try {
                key=Integer.parseInt(br.readLine());

            }catch (NumberFormatException | IOException s){
                System.out.println("Введите целое число");
                addVibor();
            }
            System.out.println();
            return key;
        }
*/
        private static int addCheck(){
            int i=0;
            Scanner sc=new Scanner(System.in);
            while(!sc.hasNextInt()){
                System.out.println("Введите целое число");
                sc.next();
            }
            i=sc.nextInt();
            sc.close();
            return i;

        }

}


package by.home.task;
import java.text.ParseException;
import java.util.Scanner;

import static by.home.task.Test.*;
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 */
//Группа 1- комната
//Группа 2- ванна
//Группа 3- кухня

public class Runner {
        public static void main(String[] args)  {
            Test.addPribor();
            int key=addCheck();
            switch (key){
                case 1:
                    System.out.println(selectGroup(1).toString());
                    break;
                case 2:
                    //System.out.println(selectGroup(2).toString());
                    onDevice(4);
                    System.out.println("Общая можность подключенных устройств:"+sumPower());
                    break;
                case 3:
                    System.out.println(selectGroup(3).toString());
                    break;

            }


        }


        private static int addCheck(){
            int i;
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


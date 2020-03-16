package by.home.task;
import java.util.Scanner;
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 */
//Группа 1- комната
//Группа 2- ванна
//Группа 3- кухня

public class Runner {
        public static void main(String[] args)  {
            int key=addVibor();
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
        private static int addVibor(){
            Scanner sc=new Scanner(System.in);
            while(!sc.hasNextInt()){
                sc.next();
            }
            return sc.nextInt();

        }

}


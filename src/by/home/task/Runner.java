package by.home.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {
        public static void main(String[] args)  {
            int key=addVibor();
        }


        private static int addVibor() throws NumberFormatException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int key=0;
            try {
                key=Integer.parseInt(br.readLine());

            }catch (NumberFormatException | IOException s){
                System.out.println("Введите целое число");
                addVibor();
            }

            return key;
        }


}


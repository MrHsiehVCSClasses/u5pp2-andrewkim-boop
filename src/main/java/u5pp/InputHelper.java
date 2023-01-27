package u5pp;

import java.util.Scanner;

public class InputHelper {

    Scanner myScanner;

    InputHelper(Scanner scanner){
        myScanner = scanner;
    }    

    public int[] getChessLocation(String prompt){

        System.out.println(prompt);
        String input = myScanner.nextLine();
        input = (input.toLowerCase());
        System.out.println(input);
        char[] cInput = input.toCharArray();
        int letter = cInput[0]-97;
        int num = cInput[1]-49;
        System.out.println(letter);
        System.out.println(num);

        while (cInput.length != 2 || (letter < 0 || letter > 7) || (num < 0 || num > 7)){
            System.out.println("Please type a Letter followed by a Number \nExample: A4");
            System.out.println(prompt);
            input = myScanner.nextLine();
            input = (input.toLowerCase());
            cInput = input.toCharArray();
            letter = cInput[0]-97;
            num = cInput[1]-49;
        }
        
        int[] location = new int[2];
        location[1] = letter;
        location[0] = num;
        System.out.println(location[0]);
        System.out.println(location[1]);
        return location;

    }

}
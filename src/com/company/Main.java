package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        List<Character> characters = new ArrayList<>();
        int chooser;
        char chooserChar;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Press 1 to enter a new character, 2 to exit");
            chooser = Integer.parseInt(scanner.nextLine());
            if (chooser == 1) {
                System.out.println("Enter e to create an elf, d for dwarf, w for wizard");
                chooserChar = scanner.nextLine().charAt(0);

                System.out.println("What is the character's name?");
                String name = scanner.nextLine();

                if (chooserChar == 'e') {
                    characters.add(new Elf(name));
                } else if (chooserChar == 'd') {
                    characters.add(new Dwarf(name));
                } else {
                    characters.add(new Wizard(name));
                }
                printList(characters);
            } else if(chooser == 2) {
                return;
            }
        }
    }

    public static void printList(List<Character> characters){
        for(Character chr: characters){
            System.out.println(chr);
        }
    }
}

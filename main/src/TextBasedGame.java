import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class TextBasedGame {

    public static void main(String[] args){
        int result_s1 = s1();
        if (result_s1 == 1){
            int result_s2 = s2();
            if (result_s2 == 1){
                char result_g1 = g1();
                if (result_g1 == 'w'){
                    s4();
                }
                else{
                    s5();
                }
            }
            else{
                char result_g2 = g2();
                if (result_g2=='w'){
                    s6();
                }
                else{
                    s7();
                }

            }
        }
        else{
            int result_s3 = s3();
            if (result_s3 == 1){
                char result_g3 = g3();
                if (result_g3=='w'){
                    s8();
                }
                else{
                    s9();
                }

            }
            else{
                g4();
            }
        }
    }



    //L1
    public static int s1(){
        clear();
        System.out.println("You have been kidnapped by a psychopath that enjoys inflicting pain on people. What do you do?");
        System.out.println("Option1: Escape from his bunker\nOption2: Do nothing.\nEnter the number 1 or 2");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1 || input == 2){
            return input;
        }
        else{
            s1();
            System.out.println("Enter a valid input.");
        }
        return 1;
    }

    //L2
    public static int s2(){
        clear();
        System.out.println("The psychopath catches you and is very angered. He wants to challenge you to some games of your choosing. If you lose he will shoot you.");
        System.out.println("Option1: Choose game #1\nOption2: Choose game #2. \nEnter 1 or 2: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1 || input == 2){
            return input;
        }
        else{
            s2();
            System.out.println("Enter a valid input");
        }
        return 1;

    }
    public static int s3(){
        clear();
        System.out.println("The pyschopath finds you and is ready to begin his torture.");
        System.out.println("He wants to challenge you to some games of your choosing. If you lose you die.");
        System.out.println("Option1: Choose game #1\nOption2: Choose game #2. Enter 1 or 2");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        if (input == 1 || input == 2){
            return input;
        }
        else{
            s3();
            System.out.println("Enter a valid input.");
        }
        return 1;
    }

    //L3
    public static char g1(){
        //human and computer each make three random nums between 1 and 5, sum together. If human's sum is within 2 of computer sum, win. Else lose
        clear();
        System.out.println("Come up with 3 random integers between 1 and 5 and sum them together. The psychopath will do the same.");
        System.out.println("If your sum is within 1 of the pyscopath's sum, you win. Else, you lose. Enter you three numbers, separated by commas.");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] human_strs = input.split(",");
        int[] human_ints = new int[3];
        for (int i = 0; i<human_strs.length; i++){
            human_ints[i] = Integer.parseInt(human_strs[i]);
        }

        if (human_ints.length != 3){
            System.out.println("Enter three numbers, separate using comma");
            g1();
        }
        int humansum = 0;
        for (int i = 0; i<3; i++){
            humansum += human_ints[i];
        }
        scan.close();
        int randsum = 0;
        Random rand = new Random();
        for (int i = 0; i<3; i++){
            randsum += rand.nextInt(6);
        }
        if (Math.abs(humansum-randsum)<1){

            return 'w';
        }
        return 'l';
    }
    public static char g2(){
        clear();
        System.out.println("The psychopath now wants you to choose any 5 letters between a and g. He will do the same.");
        System.out.println("If you both choose the same letters, you win. If not you lose. Enter your five letters here, without commas or spaces: ");
        Scanner scanner = new Scanner(System.in);
        String human_str = scanner.nextLine();
        if (human_str.length() !=5){
            g2();
            System.out.println("Enter 5 letters between a and g.");
        }
        scanner.close();
        Random rand = new Random();
        char[] letts = {'a','b','c','d','e','f','g'};
        String set = "";
        for (int i = 0; i<5; i++){
            set += letts[rand.nextInt(7)];
        }
        for (char x: set.toCharArray()){
            if (human_str.contains(String.valueOf(x)) == false){
                return 'l';
            }
        }
        return 'w';
    }
    public static char g3(){
        System.out.println("The psycopath will pick a number between 1 and 10. You do the same.");
        System.out.println("If your number is larger or equal to the psychopath's, you win. Else, you lose. Enter here: ");
        Scanner scan = new Scanner(System.in);
        int hum_choice = scan.nextInt();
        Random rand = new Random();
        int comp_choice = rand.nextInt(11);
        if (hum_choice>=comp_choice){
            return 'w';
        }
        return 'l';

    }
    public static void g4(){
        clear();
        System.out.println("Haha, the psychopath was lying. He just shoots you. You're dead. I made this game I get to do whatever I want HAHAHAHAHAHAHAH");
    }
    public static void s4(){
        clear();
        System.out.println("You win. The psychopath allows you to escape. But on your way home you get hit by a bus, so you die anyways :)");
    }
    public static void s5(){
        clear();
        System.out.println("You lose. The psychopath rips your intensines out and cooks delicious noodles with them. Delicious!");
    }
    public static void s6(){
        clear();
        System.out.println("You win. The psychopath, in despair, collapses in death. You then proceed to mutilate his corpse.");
    }
    public static void s7(){
        clear();
        System.out.println("You lose. The psychopath eats your brain.");
    }
    public static void s8(){
        clear();
        System.out.println("You win. The psychopath lets you leave and you get home safety. But you soon contract malaria and die anyways.");
    }
    public static void s9(){
        clear();
        System.out.println("You lose. The psychopath drowns you in the sea. But you make friends with a shark and get revenge on the psychopath. You win in the end :)");
    }

    public static void clear(){
        System.out.println("\u001b[2J\u001b[H");
    }




}

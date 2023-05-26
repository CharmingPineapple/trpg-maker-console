package com.company;

import Blocks.Block;
import Blocks.MultipleChoiceBlock;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Block b_1 = new Block("text of first block");

        b_1.p_next = new Block("text of second block");

        System.out.println(b_1.getMainText() + "\n" + b_1.p_next.getMainText());*/



        make_blocks();


    }

    static LinkedList<Block> blocks = new LinkedList<Block>();

    public static void make_blocks(){
        Scanner in = new Scanner(System.in);
        //String text;


        while(true){
            System.out.print("\nAction:\n" + "1. Add block. \n2. Print text of blocks. \n3. Stop program. \nAnswer: ");
            int answer = in.nextInt();
            in.nextLine();

            switch (answer){
                case 1 :
                    System.out.print("Write text of new block: ");
                    String text = in.nextLine();
                    //System.out.println("string added");
                    //blocks.addLast(new Block(text));
                    //blocks.addLast(new MultipleChoiceBlock(text));
                    break;
                case 2 :
                    for(Block block : blocks){
                        System.out.println(block.getMainText());
                    }
                    break;
                case 3 :
                    in.close();
                    return;
            }

        }
    }

    public static void make_story(){

    }

    public static void play_story(){

    }
}


package UsersSet;

import Blocks.Block;
import Blocks.MultipleChoiceBlock;
import Blocks.TextBlock;

import java.util.LinkedList;
import java.util.Scanner;

//import java.sql.

// (#) - Сделать все наборы Set в виде БД? (!!!)
public class SetBlocks {

    private LinkedList<Block> blocks = new LinkedList<Block>();

    public void addBlock(){
        Scanner in = new Scanner(System.in);
        System.out.println("Select the type of block:\n1. TextBlock\n2. MultipleChoiceBlock");
        //(!) - Добавить исключения
        int answer = in.nextInt();
        in.nextLine();
        System.out.print("Input id of new block: ");
        int id = in.nextInt();


        switch (answer){
            case 1:
                blocks.addLast(new TextBlock(id));
                break;
            case 2:
                blocks.addLast(new MultipleChoiceBlock(id));
                break;
        }

    }

}

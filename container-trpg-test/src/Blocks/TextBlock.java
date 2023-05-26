package Blocks;

public class TextBlock extends Block{
    public TextBlock(int id) {
        super(id);
    }

    private String next;

    public void setNext(String text){
        this.next = text;
    }

    public String getNext(){
        return this.next;
    }
}

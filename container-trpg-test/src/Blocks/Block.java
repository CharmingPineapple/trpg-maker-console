package Blocks;

public class Block {

    private int id;

    private String title;       //Заголовок
    private String mainText;    //Основной текст

    public void setId(int id){ this.id = id; }
    public int getId(int id){ return this.id; }


    public void setMainText(String text){
        this.mainText = text;
    }

    public String getMainText(){
        return this.mainText;
    }

    public void setTitle(String text){
        this.title = text;
    }

    public String getTitle(){
        return this.title;
    }

    //public Block p_next;

    public Block(int id){
        setId(id);
    }

}



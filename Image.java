public class Image extends Paragraph {
    String img;

    public Image (String img){
        super();
        this.img = img ;
    }

    @Override
    public String toString(){
        return img;
    }
}
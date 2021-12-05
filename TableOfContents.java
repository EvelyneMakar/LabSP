import java.util.ArrayList;

public class TableOfContents {
    private ArrayList<String> content=new ArrayList<String>();

    public TableOfContents(ArrayList<String> content) {
        this.content = content;
    }

    public ArrayList<String> getContent() {
        return content;
    }

    public void setContent(ArrayList<String> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TableOfContents{" +
                "content=" + content +
                '}';
    }
}

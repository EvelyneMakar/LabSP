public class Section {
    private String title;

    public Section(String title) {
        this.title = title;
    }

    public Section() {

    }

    public void add(Paragraph moto_capitol) {
        title = String.valueOf(moto_capitol);
    }
    public void print(){
        System.out.println(title);
    }

    public void add(Section cap111) {
        title = String.valueOf(cap111);
    }
}

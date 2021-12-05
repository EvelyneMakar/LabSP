public  class Paragraph {
    String title;
    AlignStrategy alignStrategy;
    String text;

    public Paragraph(String title){
        super();
        this.title = title;
    }

    public Paragraph() {
    }

    @Override
    public String toString(){
        return title;
    }

    public void add(Element text){}

    public void print(){
        if (this.alignStrategy !=null){
            this.alignStrategy.render(this.text);
        }
        else
            System.out.println(this.text);
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;

    }

}
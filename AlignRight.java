public class AlignRight implements AlignStrategy {
    String text;
    AlignStrategy alignStrategy;

    @Override
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;}

        @Override
        public void render(String text){
            System.out.println("###" + text);
        }

}

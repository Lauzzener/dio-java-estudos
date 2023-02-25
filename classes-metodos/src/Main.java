public class Main {
    public static void main(String[] args) throws Exception {

        Tv tv = new Tv();

        tv.setStateLigada(false);
        tv.setStateCanal(7);
        tv.setStateVolume(40);
        
        tv.getStateLigada();
        tv.getStateCanal();
        tv.getStateVolume();
    } 
}

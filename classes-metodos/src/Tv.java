public class Tv{
    private boolean _ligada;
    private int _canal;
    private int _volume;

    void setStateLigada(boolean ligada){
        _ligada = ligada;
    }

    void setStateCanal(int canal){
        _canal = canal;
    }

    void setStateVolume(int volume){
        _volume = volume;
    }

    void getStateLigada(){
        System.out.println(_ligada);
    }

    void getStateCanal(){
        System.out.println(_canal);
    }

    void getStateVolume(){
        System.out.println(_volume);
    }

}

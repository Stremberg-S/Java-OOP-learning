public interface ITelephoneMic {
    boolean micOn();

    boolean micOff();

    void setVolume(int vol);

    int getVolume();
}

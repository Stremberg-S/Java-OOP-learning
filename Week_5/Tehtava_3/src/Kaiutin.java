public class Kaiutin implements ITelephoneSpeaker {
    private int _volume;


    @Override
    public boolean mute() {
        return true;
    }

    @Override
    public boolean unMute() {
        return true;
    }

    @Override
    public void setVolume(int vol) {
        this._volume = vol;
    }

    @Override
    public int getVolume() {
        return _volume;
    }
}

public class Mikrofoni implements ITelephoneMic {
    private int _volume;


    @Override
    public boolean micOn() {
        return true;
    }

    @Override
    public boolean micOff() {
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

import static Utils.Colors.*;

public class BroadcomMikrofoni implements ITelephoneMic {
    private int _volume = 0;
    private boolean _onOff = false;


    public BroadcomMikrofoni() {
    }

    public BroadcomMikrofoni(int volume, boolean onOff) {
        setVolume(volume);
        setOnOff(onOff);
    }


    public boolean isOnOff() {
        return _onOff;
    }

    public void setOnOff(boolean onOff) {
        this._onOff = onOff;
    }


    @Override
    public boolean micOn() {
        _onOff = true;
        return true;
    }

    @Override
    public boolean micOff() {
        _onOff = false;
        return false;
    }

    @Override
    public void setVolume(int vol) {
        if (vol > 100 || vol <= 0) {
            micOff();
            this._volume = 0;
        } else this._volume = vol;
    }

    @Override
    public int getVolume() {
        return _volume;
    }

    @Override
    public String toString() {
        String status = isOnOff()
                ? GREEN + "ON" + RESET
                : RED + "OFF" + RESET;
        return "Broadcom\t" +
                "Vol: " + getVolume() +
                " | " + status;
    }
}

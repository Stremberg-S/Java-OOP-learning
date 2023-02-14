import static Utils.Colors.*;

public class BroadcomKaiutin implements ITelephoneSpeaker {
    private int _volume = 0;
    private boolean _mute = false;


    public BroadcomKaiutin() {
    }

    public BroadcomKaiutin(int vol, boolean mute) {
        setVolume(vol);
        setMute(mute);
    }


    public boolean isMute() {
        return _mute;
    }

    public void setMute(boolean mute) {
        this._mute = mute;
    }


    @Override
    public boolean mute() {
        _mute = false;
        return false;
    }

    @Override
    public boolean unMute() {
        _mute = true;
        return true;
    }

    @Override
    public void setVolume(int vol) {
        if (vol > 100 || vol <= 0) {
            mute();
            this._volume = 0;
        } else _volume = vol;
    }

    @Override
    public int getVolume() {
        return _volume;
    }

    @Override
    public String toString() {
        String status = isMute()
                ? GREEN + "UNMUTE" + RESET
                : RED + "MUTE" + RESET;
        return "Broadcom\t" +
                "Vol: " + getVolume() +
                " | " + status;
    }
}

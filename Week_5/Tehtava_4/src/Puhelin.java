public class Puhelin {
    private ITelephoneMic _mikrofoni;
    private ITelephoneSpeaker _kaiutin;


    public Puhelin() {
    }

    public Puhelin(ITelephoneMic mikrofoni, ITelephoneSpeaker kaiutin) {
        setMikrofoni(mikrofoni);
        setKaiutin(kaiutin);
    }


    public ITelephoneMic getMikrofoni() {
        return _mikrofoni;
    }

    public void setMikrofoni(ITelephoneMic mikrofoni) {
        this._mikrofoni = mikrofoni;
    }

    public ITelephoneSpeaker getKaiutin() {
        return _kaiutin;
    }

    public void setKaiutin(ITelephoneSpeaker kaiutin) {
        this._kaiutin = kaiutin;
    }

    @Override
    public String toString() {
        return "\nMikrofoni:\t" + getMikrofoni() +
                "\nKaiutin:\t" + getKaiutin();
    }
}

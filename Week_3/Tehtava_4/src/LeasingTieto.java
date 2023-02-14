import java.text.SimpleDateFormat;
import java.util.Scanner;


public class LeasingTieto {
    private Kayttaja _kayttaja;
    private Tietokone _tietokone;
    private SimpleDateFormat _paivamaara;


    public LeasingTieto() {
    }

    public LeasingTieto(Tietokone tietokone, Kayttaja kayttaja, SimpleDateFormat paivamaara) {
        this();
        setTietokone(tietokone);
        setKayttaja(kayttaja);
        setPaivamaara(paivamaara);
    }

    public LeasingTieto(LeasingTieto lt) {
        setKayttaja(lt._kayttaja);
        setTietokone(lt._tietokone);
        setPaivamaara(lt._paivamaara);
    }


    public Tietokone getTietokone() {
        return _tietokone;
    }

    public void setTietokone(Tietokone tietokone) {
        this._tietokone = tietokone;
    }

    public Kayttaja getKayttaja() {
        return _kayttaja;
    }

    public void setKayttaja(Kayttaja kayttaja) {
        this._kayttaja = kayttaja;
    }

    public SimpleDateFormat getPaivamaara() {
        return _paivamaara;
    }

    public void setPaivamaara(SimpleDateFormat paivamaara) {
        this._paivamaara = paivamaara;
    }

    public void getAllInformation() {
        Scanner sc = new Scanner(System.in);

        if (this._kayttaja == null)
            this._kayttaja = new Kayttaja();
        _kayttaja.getKayttajaTiedot();
        if (this._tietokone == null)
            this._tietokone = new Tietokone();
        _tietokone.getTietokoneTiedot();
        String date = LeasingUtils.getValidDate(sc);
        setPaivamaara(new SimpleDateFormat(date));
    }


    @Override
    public String toString() {
        return "Leasing Tieto: {" +
                getKayttaja() +
                getTietokone() + '}';
    }
}

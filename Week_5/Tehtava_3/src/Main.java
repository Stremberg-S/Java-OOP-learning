public class Main {
    public static void main(String[] args) {
        Mikrofoni mic = new Mikrofoni();
        Kaiutin speaker = new Kaiutin();

        System.out.println("Mic on: " + mic.micOn());
        System.out.println("Mic off: " + mic.micOff());
        mic.setVolume(5);
        System.out.println("Mic volume: " + mic.getVolume());

        System.out.println("Speaker mute: " + speaker.mute());
        System.out.println("Speaker unMute: " + speaker.unMute());
        speaker.setVolume(10);
        System.out.println("Speaker volume: " + speaker.getVolume());
    }
}
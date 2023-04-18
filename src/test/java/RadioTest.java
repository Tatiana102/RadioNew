import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        int expected = 8;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 0;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 8;
        int actual = radio.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 9;
        int actual = radio.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest() {
        Radio radio = new Radio();

        radio.setVolume(100);

        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(90);

        int expected = 91;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(25);

        int expected = 24;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMinIfCurrentMin() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(110);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationQuantityTest() {
        Radio radio = new Radio(11);

        Assertions.assertEquals(11, radio.getStationQuantity());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(10, radio.getMaxStation());
    }
}

package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void increaseVolumeOn1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeWhenVolMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reductionVolumeOn1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.reductionVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void reductionVolumeWhenVolMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextStatoinOn1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextStatoinWhenStat9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStatoinOn1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void PrevStatoinWnenStat0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSetCurrentVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.getCurrentVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void TestSetCurrentVolumeMoreThanTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.getCurrentVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void TestSetCurrentStationLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.getCurrentStation();

        int expected = 0;

        Assertions.assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void TestSetCurrentStationMoreThanNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.getCurrentStation();

        int expected = 0;

        Assertions.assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void maxSt() {
        Radio radio = new Radio(100);

        radio.setCurrentStation(99);

        int actual = radio.getCurrentStation();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }
}
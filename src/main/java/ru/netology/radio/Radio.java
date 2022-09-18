package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;
    protected int maxSt;


    public Radio() {
        maxSt = 9;

    }

    public Radio(int StCount) {
        maxSt = StCount - 1;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;

        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxSt) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }


    public void reductionVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public void nextStation() {
        if (currentStation < maxSt) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxSt;
        }
    }
}

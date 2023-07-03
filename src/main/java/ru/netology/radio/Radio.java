package ru.netology.radio;

public class Radio {

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void prev() {
        int target = currentStation - 1;
        setCurrentStation(target);
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void reduceVolume() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }

}
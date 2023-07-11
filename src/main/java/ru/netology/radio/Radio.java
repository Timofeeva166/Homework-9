package ru.netology.radio;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int currentVolume;

    public Radio(int size) {
        maxStation = minStation + size - 1;
    }

    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        currentStation = newCurrentStation;
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

    public void next() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void prev() {
        int target = currentStation - 1;
        setCurrentStation(target);
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
package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            setCurrentStation(getMinStation());
            return;
        }
        if (currentStation < minStation) {
            setCurrentStation(getMaxStation());
            return;
        }

        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void increaseCurrentStation() {
        int increaseStation = getCurrentStation() + 1;
        setCurrentStation(increaseStation);
    }

    public void decreaseCurrentStation() {
        int decreaseStation = getCurrentStation() - 1;
        setCurrentStation(decreaseStation);
    }

    public void increaseCurrentVolume() {
        int increaseVolume = getCurrentVolume() + 1;
        setCurrentVolume(increaseVolume);
    }

    public void decreaseCurrentVolume() {
        int decreaseVolume = getCurrentVolume() - 1;
        setCurrentVolume(decreaseVolume);
    }


}

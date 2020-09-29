package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;


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

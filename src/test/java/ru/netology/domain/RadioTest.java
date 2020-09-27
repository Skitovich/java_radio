package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void increaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() - 1);
        radio.increaseCurrentStation();
        radio.increaseCurrentStation();
        assertEquals(radio.getMinStation(),radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation());
        radio.decreaseCurrentStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void increaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume() - 1);
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        assertEquals(radio.getMaxVolume(),radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        System.out.println(radio.getCurrentVolume());
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        assertEquals(radio.getMinVolume(),radio.getCurrentVolume());
    }


}
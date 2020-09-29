package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    void increaseCurrentStation() {
        Radio radio = new Radio(10,10,0,0);
        radio.increaseCurrentStation();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());

    }

    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio(0,10,0,0);
        radio.decreaseCurrentStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void increaseCurrentVolume() {
        Radio radio = new Radio(0,10,100,100);
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio(0,10,0,0);
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }


}
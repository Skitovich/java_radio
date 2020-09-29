package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio(9,10,0,10,100,0);


    @Test
    void increaseCurrentStation() {
        radio.increaseCurrentStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());


    }

    @Test
    void decreaseCurrentStation() {
        radio.decreaseCurrentStation();
        assertEquals(radio.getMaxStation(),10);
    }

    @Test
    void increaseCurrentVolume() {
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        assertEquals(radio.getMaxVolume(),radio.getMaxVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        assertEquals(radio.getMinVolume(),radio.getMinVolume());
    }


}
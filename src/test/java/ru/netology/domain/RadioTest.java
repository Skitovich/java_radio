package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        assertEquals(radio.getMaxStation(),radio.getCurrentStation());
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

    @Test
    void firstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.firstStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void secondStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.secondStation();
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    void thirdStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.thirdStation();
        assertEquals(2,radio.getCurrentStation());
    }

    @Test
    void forthStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.forthStation();
        assertEquals(3,radio.getCurrentStation());
    }

    @Test
    void fiveStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.fiveStation();
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    void sixStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.sixStation();
        assertEquals(5,radio.getCurrentStation());
    }

    @Test
    void seventStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.seventStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void eightStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.eightStation();
        assertEquals(7,radio.getCurrentStation());
    }

    @Test
    void nineStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.nineStation();
        assertEquals(8,radio.getCurrentStation());
    }

    @Test
    void tenStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() - 5);
        radio.tenStation();
        assertEquals(9,radio.getCurrentStation());
    }
}
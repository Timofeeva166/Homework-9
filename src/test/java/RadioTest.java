package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //тесты на номер радиостанции

    @Test
    public void shouldGetCurrentStation() { //получить номер текущей радиостанции
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectly() { //переключает непосредственно при допустимых значениях
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.getCurrentStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectlyAboveMax() { //переключает непосредственно при значениях больше 9
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.getCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDirectlyBelowMin() { //переключает непосредственно при значениях меньше 0
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.getCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNext() { //переключение на следующую радиостанцию
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevious() { //переключение на предыдущую радиостанцию
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAboveMax() { //переключает на минимальное при нажатии next при максимальном значении
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNineIfBelowMin() { //переключает на максимальное при нажатии prev при минимальном значении
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //тесты на уровень громкости

    @Test
    public void shouldGetCurrentVolume() { //получить текущий уровень громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(56);

        int expected = 56;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() { //прибавить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(34);

        radio.increaseVolume();

        int expected = 35;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() { //убавить громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(67);

        radio.reduceVolume();

        int expected = 66;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMax() { //выставление громкости больше максимального значения
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMin() { //выставление громкости меньше минимального значения
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
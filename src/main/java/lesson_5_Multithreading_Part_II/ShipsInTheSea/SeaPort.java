package lesson_5_Multithreading_Part_II.ShipsInTheSea;

import java.math.BigInteger;

public class SeaPort extends SeaAdventure{

    private BigInteger portCapacity;                //Текущая вместимость порта, ед BigInteger - для синхронизации
    private int maxPortCapacity;                    //Максимальная вместимость порта, ед
    private int loadingSpeed;                       //Скорость погрузки на корабль ед/с
    private String portName;                        //Название порта

    public SeaPort(String portName,int maxPortCapacity, BigInteger portCapacity, int loadingSpeed) {
        this.portName = portName;
        this.portCapacity = portCapacity;
        this.maxPortCapacity = maxPortCapacity;
        this.loadingSpeed = loadingSpeed;
    }

    public synchronized BigInteger getPortCapacity() {
        return portCapacity;
    }

    public synchronized void setPortCapacity(BigInteger portCapacity) {
        this.portCapacity = portCapacity;
    }

    public String getPortName() {
        return portName;
    }

    public void seaPortInformation(){
        System.out.println(this.portName + " сейчас вмещает: " + this.portCapacity.intValue());
    }

    //Удалить
    @Override
    public void go(Ship ship) {
//
    }
}

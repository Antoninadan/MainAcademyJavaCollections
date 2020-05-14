package com.mainacad.service.usbdrive;

public class UsbDrive {
    int capacity;
    String name;

    public UsbDrive(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public String toString() {
        return (name + " " + capacity + " Gb");
    }

}

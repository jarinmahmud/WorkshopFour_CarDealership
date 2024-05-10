package com.ps;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone; // why phone is string?

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    //creating arraylist for inventory
    ArrayList<Vehicle> inventory = new ArrayList<>(); // declaring a new arraylist (inventory) which will hold all the vehicles

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory;
    }

    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }

    //methods
    public static ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> vehiclesByPrice = new ArrayList<>();
        //condition for getting price ranged vehicle

        return vehiclesByPrice;
    }

    public static ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> vehiclesByMakeModel = new ArrayList<>();
        //condition for getting specific make model vehicle

        return vehiclesByMakeModel;
    }

    public static ArrayList<Vehicle> getVehiclesByYear(int minYear, int maxYear){
        ArrayList<Vehicle> vehiclesByYear = new ArrayList<>();
        //condition for getting specific year ranged vehicle

        return vehiclesByYear;
    }

    public static ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> vehiclesByColor = new ArrayList<>();
        //condition for getting specific color vehicle

        return vehiclesByColor;
    }

    public static ArrayList<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage){
        ArrayList<Vehicle> vehiclesByMileage = new ArrayList<>();
        //condition for getting mileage ranged vehicle

        return vehiclesByMileage;
    }

    public static ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        ArrayList<Vehicle> vehiclesByType = new ArrayList<>();
        //condition for getting price ranged vehicle

        return vehiclesByType;
    }










}

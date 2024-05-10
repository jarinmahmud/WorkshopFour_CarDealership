package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.ps.Dealership;
import com.ps.Vehicle;

public class DealershipFileManager {

//get Dealership

    // Method to read data from file and convert it to Dealership object
    public static Dealership getDealership() throws IOException {
//            Dealership dealership = new Dealership();

        try (BufferedReader reader = new BufferedReader(new FileReader("workData.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming each line represents a vehicle in the format: make,model,year,price
                String[] parts = line.split("\\|");
//                    int vin = parts[0];
//                    int year = parts[1];
//                    int year = Integer.parseInt(parts[2]);
//                    double price = Double.parseDouble(parts[3]);
//                    // Assuming you have a method to add vehicles to the dealership
//                    dealership.addVehicle(new Vehicle(make, model, year, price));
            }
        }
        return null;
    }
}

            //int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price

//            return dealership;




// save DDealership

package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
Spring-Assignment
Assignment related to beans, autowiring and dependency injection

Beans:

Person Bean has a dependency on Vehicle Bean
Vehicle Bean has a dependency on VehicleServices Bean, to play music and move the vehicle
Vehicle Services bean depend on the implementations of Speakers and Tyres to serve vehicle bean requests

Interfaces:

Tyres interface with rotate() method
Speakers interface with makeSound() method

Bean implementations:

SonySpeakers Bean implementation of Speakers
BoseSpeakers Bean implementation of Speakers
BridgeStoneTyres Bean implementation of Tyres
MichelinTyres Bean implementation of Tyres
*/

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //receives the name of the person and the vehicle bean
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);

        /*
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();
        */

        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}
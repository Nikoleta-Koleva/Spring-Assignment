Spring-Assignment

Assignment related to beans, autowiring and dependency injection

Beans:
- Person Bean has a dependency on Vehicle Bean
- Vehicle Bean has a dependency on VehicleServices Bean, to play music and move the vehicle
- Vehicle Services bean depend on the implementations of Speakers and Tyres to serve vehicle bean requests

Interfaces:
- Tyres interface with rotate() method
- Speakers interface with makeSound() method

Bean implementations:
- SonySpeakers Bean implementation of Speakers
- BoseSpeakers Bean implementation of Speakers
- BridgeStoneTyres Bean implementation of Tyres
- MichelinTyres Bean implementation of Tyres

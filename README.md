Nano
-------
>Random musings on nano.

Model
-----
>All classes extend NanoParticle and Graphene, less NanoNetwork.
* NanoParticle ---> Graphene
* Hydrogel
* CarbonNanoTube 1 ---> 1 Walled
* QuantumCell 1 ---> * QuantumDot
* Layer 1 ---> * QuantumCell
* Circuit 1 ---> * Layer
* Router 1 ---> * Circuit
* Antenna
* Router 1 ---> 1 Transceiver | NetworkInterface
* Ribbon
* Signal 1 ---> * QuantumDot
* Sensor
* Actuator
* NanoNetwork 1 ---> * NanoParticle
>A ***wireless*** NanoNetwork may contain multiple Routers, Transceivers and NetworkInterfaces.

Scale
-----
>Measurements to nanometers:
1. meter = 1,000,000,000
2. millimeter = 1,000,000
3. micrometer = 1000
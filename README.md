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
>Within a NanoNetwork, multiple Routers, Transceivers and NetworkInterfaces exist.
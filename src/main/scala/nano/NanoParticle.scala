package nano

sealed trait Graphene

sealed trait Hydrogel

sealed trait NanoParticle extends Graphene

final case class QuantumDot() extends NanoParticle

final case class QuantumCell(quantumDots: Seq[QuantumDot]) extends NanoParticle

final case class Layer(quantumCells: Seq[QuantumCell]) extends NanoParticle

final case class Circuit(layers: Seq[Layer]) extends NanoParticle

final case class Antenna() extends NanoParticle

final case class Transceiver(circuits: Seq[Circuit]) extends NanoParticle

final case class Router(circuits: Seq[Circuit], transceiver: Transceiver, networkInterface: NetworkInterface) extends NanoParticle

final case class NetworkInterface(circuits: Seq[Circuit]) extends NanoParticle

enum Walled:
  case single, multi

final case class CarbonNanoTube(walled: Walled) extends NanoParticle

final case class Signal(quantumDots: Seq[QuantumDot]) extends NanoParticle

final case class Sensor() extends NanoParticle

final case class Actuator() extends NanoParticle
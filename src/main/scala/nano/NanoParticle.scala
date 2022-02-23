package nano

sealed trait NanoParticle

final case class QuantumDot() extends NanoParticle

final case class QuantumCell(quantumDots: Seq[QuantumDot]) extends NanoParticle

final case class Layer(quantumCells: Seq[QuantumCell]) extends NanoParticle

final case class Circuit(layers: Seq[Layer]) extends NanoParticle

final case class Router(circuits: Seq[Circuit]) extends NanoParticle
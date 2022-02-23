package nano

sealed trait NanoParticle

final case class QuantumDot() extends NanoParticle

final case class QuantumCell(quantumDots: Seq[QuantumDot]) extends NanoParticle

final case class Layer(quantumCells: Seq[QuantumCell]) extends NanoParticle
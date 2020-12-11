package java.util.zip

import scala.scalanative.unsigned._
import scala.scalanative.unsafe._
import scala.scalanative.runtime.{ByteArray, zlib}

// Ported from Apache Harmony

class CRC32 extends Checksum {
  private var crc: CUnsignedLong = 0.toUInt
  private[zip] var tbytes: Long = 0

  def getValue(): Long =
    crc.toLong

  def reset(): Unit = {
    tbytes = 0
    crc = 0.toUInt
  }

  def update(v: Int): Unit =
    update(Array(v.toByte))

  def update(buf: Array[Byte]): Unit =
    update(buf, 0, buf.length)

  def update(buf: Array[Byte], off: Int, nbytes: Int): Unit = {
    // avoid int overflow, check null buf
    if (off <= buf.length && nbytes >= 0 && off >= 0 && buf.length - off >= nbytes) {
      tbytes += nbytes
      crc = updateImpl(buf, off, nbytes, crc)
    } else {
      throw new ArrayIndexOutOfBoundsException()
    }
  }

  private def updateImpl(buf: Array[Byte],
                         off: Int,
                         nbytes: Int,
                         crc1: CUnsignedLong): CUnsignedLong =
    zlib
      .crc32(crc1, buf.asInstanceOf[ByteArray].at(off), nbytes.toUInt)
}

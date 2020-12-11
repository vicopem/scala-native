package java.util.zip

import scala.scalanative.unsigned._
import scala.scalanative.unsafe._
import scala.scalanative.runtime.{ByteArray, zlib}

// Ported from Apache Harmony

class Adler32 extends Checksum {
  private var adler: CUnsignedLong = 1.toUInt

  def getValue(): Long =
    adler.toLong

  def reset(): Unit =
    adler = 1.toUInt

  def update(i: Int): Unit =
    update(Array(i.toByte))

  def update(buf: Array[Byte]): Unit =
    update(buf, 0, buf.length)

  def update(buf: Array[Byte], off: Int, nbytes: Int): Unit = {
    // avoid int overflow, check null buf
    if (off <= buf.length && nbytes >= 0 && off >= 0 && buf.length - off >= nbytes) {
      adler = updateImpl(buf, off, nbytes, adler)
    } else {
      throw new ArrayIndexOutOfBoundsException()
    }
  }

  private def updateImpl(buf: Array[Byte],
                         off: Int,
                         nbytes: Int,
                         adler1: CUnsignedLong): CUnsignedLong =
    zlib
      .adler32(adler1,
               buf.asInstanceOf[ByteArray].at(off),
               nbytes.toUInt)
}

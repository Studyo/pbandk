package pbandk

import pbandk.wkt.Timestamp

expect object Util {
    fun stringToUtf8(str: String): ByteArray
    fun utf8ToString(bytes: ByteArray): String

    fun base64ToBytes(str: String): ByteArray
    fun bytesToBase64(bytes: ByteArray): String

    fun timestampToString(ts: Timestamp): String
    fun stringToTimestamp(str: String): Timestamp
}
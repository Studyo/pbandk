@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class Any(
    val typeUrl: String = "",
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Any> {
    override operator fun plus(other: Any?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<Any> {
        val defaultInstance by lazy { Any() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Any.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): Any { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

fun Any?.orDefault() = this ?: Any.defaultInstance

private fun Any.protoMergeImpl(plus: Any?): Any = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Any.protoSizeImpl(): Int {
    var protoSize = 0
    if (typeUrl.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(typeUrl)
    if (value.array.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(2) + pbandk.Sizer.bytesSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Any.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (typeUrl.isNotEmpty()) protoMarshal.writeTag(10).writeString(typeUrl)
    if (value.array.isNotEmpty()) protoMarshal.writeTag(18).writeBytes(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Any.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Any {
    var typeUrl = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Any(typeUrl, value, protoUnmarshal.unknownFields())
        10 -> typeUrl = protoUnmarshal.readString()
        18 -> value = protoUnmarshal.readBytes()
        else -> protoUnmarshal.unknownField()
    }
}

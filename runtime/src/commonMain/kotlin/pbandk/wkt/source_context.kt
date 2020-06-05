@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class SourceContext(
    val fileName: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<SourceContext> {
    override operator fun plus(other: SourceContext?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<SourceContext> {
        val defaultInstance by lazy { SourceContext() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = SourceContext.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): SourceContext { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

fun SourceContext?.orDefault() = this ?: SourceContext.defaultInstance

private fun SourceContext.protoMergeImpl(plus: SourceContext?): SourceContext = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun SourceContext.protoSizeImpl(): Int {
    var protoSize = 0
    if (fileName.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(fileName)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun SourceContext.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (fileName.isNotEmpty()) protoMarshal.writeTag(10).writeString(fileName)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun SourceContext.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): SourceContext {
    var fileName = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return SourceContext(fileName, protoUnmarshal.unknownFields())
        10 -> fileName = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

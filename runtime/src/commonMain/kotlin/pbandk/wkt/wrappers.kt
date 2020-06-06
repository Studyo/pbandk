@file:UseSerializers(pbandk.ser.TimestampSerializer::class)

package pbandk.wkt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

data class DoubleValue(
    val value: Double = 0.0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<DoubleValue> {
    override operator fun plus(other: DoubleValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<DoubleValue> {
        val defaultInstance by lazy { DoubleValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = DoubleValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): DoubleValue { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

data class FloatValue(
    val value: Float = 0.0F,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<FloatValue> {
    override operator fun plus(other: FloatValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<FloatValue> {
        val defaultInstance by lazy { FloatValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = FloatValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): FloatValue { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

data class Int64Value(
    val value: Long = 0L,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Int64Value> {
    override operator fun plus(other: Int64Value?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<Int64Value> {
        val defaultInstance by lazy { Int64Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Int64Value.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): Int64Value { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

data class UInt64Value(
    val value: Long = 0L,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<UInt64Value> {
    override operator fun plus(other: UInt64Value?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<UInt64Value> {
        val defaultInstance by lazy { UInt64Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = UInt64Value.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): UInt64Value { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

data class Int32Value(
    val value: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<Int32Value> {
    override operator fun plus(other: Int32Value?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<Int32Value> {
        val defaultInstance by lazy { Int32Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = Int32Value.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): Int32Value { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

data class UInt32Value(
    val value: Int = 0,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<UInt32Value> {
    override operator fun plus(other: UInt32Value?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<UInt32Value> {
        val defaultInstance by lazy { UInt32Value() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = UInt32Value.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): UInt32Value { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

data class BoolValue(
    val value: Boolean = false,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<BoolValue> {
    override operator fun plus(other: BoolValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<BoolValue> {
        val defaultInstance by lazy { BoolValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = BoolValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): BoolValue { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

data class StringValue(
    val value: String = "",
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<StringValue> {
    override operator fun plus(other: StringValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<StringValue> {
        val defaultInstance by lazy { StringValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = StringValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): StringValue { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

data class BytesValue(
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message<BytesValue> {
    override operator fun plus(other: BytesValue?) = protoMergeImpl(other)
    override val protoSize by lazy { protoSizeImpl() }
    override fun protoMarshal(m: pbandk.Marshaller) = protoMarshalImpl(m)
    override fun jsonMarshal(json: Json): String { throw UnsupportedOperationException("Json support is disabled") }
    companion object : pbandk.Message.Companion<BytesValue> {
        val defaultInstance by lazy { BytesValue() }
        override fun protoUnmarshal(u: pbandk.Unmarshaller) = BytesValue.protoUnmarshalImpl(u)
        override fun jsonUnmarshal(json: Json, data: String): BytesValue { throw UnsupportedOperationException("Json support is disabled")
 }
    }

}

fun DoubleValue?.orDefault() = this ?: DoubleValue.defaultInstance

private fun DoubleValue.protoMergeImpl(plus: DoubleValue?): DoubleValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun DoubleValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0.0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.doubleSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun DoubleValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0.0) protoMarshal.writeTag(9).writeDouble(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun DoubleValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): DoubleValue {
    var value = 0.0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return DoubleValue(value, protoUnmarshal.unknownFields())
        9 -> value = protoUnmarshal.readDouble()
        else -> protoUnmarshal.unknownField()
    }
}

fun FloatValue?.orDefault() = this ?: FloatValue.defaultInstance

private fun FloatValue.protoMergeImpl(plus: FloatValue?): FloatValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun FloatValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0.0F) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.floatSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun FloatValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0.0F) protoMarshal.writeTag(13).writeFloat(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun FloatValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): FloatValue {
    var value = 0.0F
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return FloatValue(value, protoUnmarshal.unknownFields())
        13 -> value = protoUnmarshal.readFloat()
        else -> protoUnmarshal.unknownField()
    }
}

fun Int64Value?.orDefault() = this ?: Int64Value.defaultInstance

private fun Int64Value.protoMergeImpl(plus: Int64Value?): Int64Value = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Int64Value.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Int64Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0L) protoMarshal.writeTag(8).writeInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Int64Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Int64Value {
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Int64Value(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readInt64()
        else -> protoUnmarshal.unknownField()
    }
}

fun UInt64Value?.orDefault() = this ?: UInt64Value.defaultInstance

private fun UInt64Value.protoMergeImpl(plus: UInt64Value?): UInt64Value = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UInt64Value.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0L) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt64Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UInt64Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0L) protoMarshal.writeTag(8).writeUInt64(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun UInt64Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UInt64Value {
    var value = 0L
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UInt64Value(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readUInt64()
        else -> protoUnmarshal.unknownField()
    }
}

fun Int32Value?.orDefault() = this ?: Int32Value.defaultInstance

private fun Int32Value.protoMergeImpl(plus: Int32Value?): Int32Value = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun Int32Value.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.int32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun Int32Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0) protoMarshal.writeTag(8).writeInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun Int32Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): Int32Value {
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return Int32Value(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readInt32()
        else -> protoUnmarshal.unknownField()
    }
}

fun UInt32Value?.orDefault() = this ?: UInt32Value.defaultInstance

private fun UInt32Value.protoMergeImpl(plus: UInt32Value?): UInt32Value = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun UInt32Value.protoSizeImpl(): Int {
    var protoSize = 0
    if (value != 0) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.uInt32Size(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun UInt32Value.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value != 0) protoMarshal.writeTag(8).writeUInt32(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun UInt32Value.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): UInt32Value {
    var value = 0
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return UInt32Value(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readUInt32()
        else -> protoUnmarshal.unknownField()
    }
}

fun BoolValue?.orDefault() = this ?: BoolValue.defaultInstance

private fun BoolValue.protoMergeImpl(plus: BoolValue?): BoolValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun BoolValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.boolSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun BoolValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value) protoMarshal.writeTag(8).writeBool(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun BoolValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): BoolValue {
    var value = false
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return BoolValue(value, protoUnmarshal.unknownFields())
        8 -> value = protoUnmarshal.readBool()
        else -> protoUnmarshal.unknownField()
    }
}

fun StringValue?.orDefault() = this ?: StringValue.defaultInstance

private fun StringValue.protoMergeImpl(plus: StringValue?): StringValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun StringValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.stringSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun StringValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value.isNotEmpty()) protoMarshal.writeTag(10).writeString(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun StringValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): StringValue {
    var value = ""
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return StringValue(value, protoUnmarshal.unknownFields())
        10 -> value = protoUnmarshal.readString()
        else -> protoUnmarshal.unknownField()
    }
}

fun BytesValue?.orDefault() = this ?: BytesValue.defaultInstance

private fun BytesValue.protoMergeImpl(plus: BytesValue?): BytesValue = plus?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

private fun BytesValue.protoSizeImpl(): Int {
    var protoSize = 0
    if (value.array.isNotEmpty()) protoSize += pbandk.Sizer.tagSize(1) + pbandk.Sizer.bytesSize(value)
    protoSize += unknownFields.entries.sumBy { it.value.size() }
    return protoSize
}

private fun BytesValue.protoMarshalImpl(protoMarshal: pbandk.Marshaller) {
    if (value.array.isNotEmpty()) protoMarshal.writeTag(10).writeBytes(value)
    if (unknownFields.isNotEmpty()) protoMarshal.writeUnknownFields(unknownFields)
}

private fun BytesValue.Companion.protoUnmarshalImpl(protoUnmarshal: pbandk.Unmarshaller): BytesValue {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty
    while (true) when (protoUnmarshal.readTag()) {
        0 -> return BytesValue(value, protoUnmarshal.unknownFields())
        10 -> value = protoUnmarshal.readBytes()
        else -> protoUnmarshal.unknownField()
    }
}

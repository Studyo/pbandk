package pbandk.ser

import kotlinx.serialization.*
import pbandk.Util
import pbandk.wkt.Timestamp

@Serializer(forClass = Timestamp.JsonMapper::class)
object TimestampSerializer: KSerializer<Timestamp.JsonMapper> {

    override val descriptor: SerialDescriptor =
        PrimitiveDescriptor("Timestamp.JsonMapper", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, obj: Timestamp.JsonMapper) =
        encoder.encodeString(Util.timestampToString(obj))

    override fun deserialize(decoder: Decoder) =
        Util.stringToTimestamp(decoder.decodeString())

}

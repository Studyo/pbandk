package pbandk.ser

import kotlinx.serialization.*
import pbandk.Util
import pbandk.wkt.Timestamp

@Serializer(forClass = Timestamp::class)
object TimestampSerializer: KSerializer<Timestamp> {

    override val descriptor: SerialDescriptor =
        PrimitiveDescriptor("Timestamp", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, obj: Timestamp) =
        encoder.encodeString(Util.timestampToString(obj))

    override fun deserialize(decoder: Decoder) =
        Util.stringToTimestamp(decoder.decodeString())

}

package friendlyrobot.nyc.govdata

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class ComplaintResponse(
        val complaints: List<Complaint>
)

@JsonClass(generateAdapter = true)
data class Complaint (
        val id: String,
        val description: String,
        val createdAt: Long
)

@JsonClass(generateAdapter = true)
data class Owner (
        val id: String,
        val displayName: String,
        val flags: List<String>
)
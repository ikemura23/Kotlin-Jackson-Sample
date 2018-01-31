package banbara23.com.kotlinjacksonsample

import com.fasterxml.jackson.annotation.JsonProperty

data class PostResponse(
        @field:JsonProperty("card_type") val cardType: String = "",
        @field:JsonProperty("card_id") val cardId: String = "",
        @field:JsonProperty("result_code") val resultCode: Int = 0
) : Response() {
    override fun toString(): String =
            "GetResponse(status='$status' cardStatus='$cardStatus' resultCode='$resultCode')"
}
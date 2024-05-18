package com.giphy.searchapp.data.model

import com.google.gson.annotations.SerializedName

internal data class MetaData(
    @SerializedName("msg")
    val msg: String,
    @SerializedName("status")
    val status: Int,
    @SerializedName("response_id")
    val responseId: String,
)
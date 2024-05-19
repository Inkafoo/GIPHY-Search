package com.giphy.searchapp.data.model.dto

import com.google.gson.annotations.SerializedName

internal data class TrendingRequest(
    @SerializedName("api_key")
    val apiKey: String,
    @SerializedName("api_key")
    val randomId: String,
    @SerializedName("bundle")
    val bundle: String = "messaging_non_clips"
)
package com.giphy.searchapp.data.model

import com.giphy.searchapp.data.model.dto.GifResponse
import com.google.gson.annotations.SerializedName

internal data class TrendingData(
    @SerializedName("data")
    val data: GifResponse,
    @SerializedName("pagination")
    val pagination: PaginationData,
    @SerializedName("meta")
    val meta: MetaData,
)
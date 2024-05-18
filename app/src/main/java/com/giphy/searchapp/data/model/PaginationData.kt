package com.giphy.searchapp.data.model

import com.google.gson.annotations.SerializedName

internal data class PaginationData(
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("total_count")
    val totalCount: Int? = null,
    @SerializedName("count")
    val count: Int,
)
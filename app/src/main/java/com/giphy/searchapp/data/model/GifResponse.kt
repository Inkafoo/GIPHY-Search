package com.giphy.searchapp.data.model

import com.google.gson.annotations.SerializedName

internal data class GifResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("bitly_url")
    val bitlyUrl: String,
    @SerializedName("embed_url")
    val embedUrl: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("rating")
    val rating: String,
    @SerializedName("content_url")
    val contentUrl: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("alt_text")
    val altText: String,
)
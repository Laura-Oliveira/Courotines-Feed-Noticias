package com.feed.noticias.model

//classes de dados do arquivo json
data class Response(
    val feed:Feed
)

data class Feed(
    val falkor:Falkor
)

data class Falkor(
    val itens:List<Item>
)

data class Item(
    val type:String,
    val lastPublication:String,
    val content:Content
)

data class Content(
    val image:String,
    val title:String,
    val summary:String
    //val chapeu:Chapeu
)

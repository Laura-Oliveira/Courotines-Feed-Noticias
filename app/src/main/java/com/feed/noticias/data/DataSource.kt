package com.feed.noticias.data

import com.feed.noticias.model.Feed

class DataSource
{
    fun loadNews():List<Feed>
    {
        return listOf(
            //puxar dados das variaveis requisicao API
           // Feed(R.drawable.imageId, R.string.titleId, R.string.descriptionId)
        )
    }
}
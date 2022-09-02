package com.feed.noticias.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//essa anotações com @ garante que a ordem de dados recebida sera: id imagem, id titulo, id descricao
class FeedInformation (@DrawableRes val imageId:Int, @StringRes val titleId:Int, @StringRes val descriptionId:Int)
{

}
package com.feed.noticias.viewModel

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.feed.noticias.data.HttpHelper

class ViewModel
{
    //mutable permite trocar os dados que sao enviados no canal
    val toast:MutableLiveData<Boolean> = MutableLiveData<Boolean>(false)
    val httpHelper:HttpHelper = HttpHelper()

    fun openDescriptionNews()
    {
        toast.value = true
    }

    fun retrieveDataGET():String?
    {
        val dataNews = httpHelper.requestGET().toString()

        return dataNews;
    }
}
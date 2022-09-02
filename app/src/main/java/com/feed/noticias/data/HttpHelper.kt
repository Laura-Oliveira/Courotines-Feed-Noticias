package com.feed.noticias.data

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

class HttpHelper
{
    fun requestGET(): String?
    {
        lateinit var json:String
        try
        {
            val URL = "url"

            //cria um cliente que dispara a requisicao para a url
            val client = OkHttpClient()

            //criacao requisicao get
            val getRequest = Request.Builder().url(URL).get().build()

            //executa a funcao get no servidor
            val response = client.newCall(getRequest).execute()

            //extrair dados do body do json
            val responseBody = response.body

            if(responseBody !== null)
            {
                json = responseBody?.string().toString()
                println("RESPOSTA ==========" + json)
            }
            // ? antes da variavel garante que o valor nao vira nulo

            return json;

        }
        catch (exception:Exception)
        {
            return exception.toString()
        }
    }
}
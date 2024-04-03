package br.com.fiap.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

/**
A classe MainActivity é a tela principal do aplicativo.
*/

class MainActivity : Activity(){

 /**
 Método chamado quando a atividade é criada
 */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Binding: Processo de vincular o código fonte de um programa com o arquivo de layout correspondente.
            TextView:(componente usado para exibir texto em um app Android).
            Id:(identificador usado para identificar elementos em um app).*/

        /** Encontra o TextView com o ID "nome" no layout e atribui à variável "nome" ao título do item.*/
        val nome: TextView = findViewById(R.id.nome)
        nome.text = "Cesta De Frutas"

        /** Encontra o TextView com o ID "descricao" no layout e atribui à variável "descricao" as frutas que estão na cesta.*/
        val descricao: TextView = findViewById(R.id.descricao)
        descricao.text = "Laranja, Manga e Uva"

        /** Encontra o TextView com o ID "valor" no layout e atribui à variável "valor" o preço final dos itens na cesta.*/
        val valor: TextView = findViewById(R.id.valor)
        valor.text = "19.99"

    }
}
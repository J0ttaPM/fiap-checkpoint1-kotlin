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
            TextView:componente usado para exibir texto em um app Android.
            Id:identificador usado para identificar elementos em um app.*/

        /** Encontrar o TextView com o ID "nome" no layout e atribuir ao título do item a variável "nome".*/
        val nome: TextView = findViewById(R.id.nome)
        nome.text = "Cesta De Frutas"

        /** Encontrar o TextView com o nome "descricao" no layout e atribuir à variável "descricao" as frutas da cesta.*/
        val descricao: TextView = findViewById(R.id.descricao)
        descricao.text = "Laranja, Manga e Uva"

        /** Encontra o TextView com o ID "valor" no layout e atribui à variável "valor" o preço final dos produtos na cesta.*/
        val valor: TextView = findViewById(R.id.valor)
        valor.text = "19.99"

    }
}

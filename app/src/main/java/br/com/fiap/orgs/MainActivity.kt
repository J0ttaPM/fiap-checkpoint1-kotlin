package br.com.fiap.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

/**
 * A classe MainActivity é a tela principal do aplicativo.
 * Ela herda da classe Activity, que é uma parte fundamental para criar uma tela no Android.
 */
class MainActivity : Activity() {

    /**
     * Método onCreate é chamado quando a atividade é iniciada.
     * Aqui definimos o que acontece quando a tela é criada, como configurar o layout.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Chama a implementação original do método.
        setContentView(R.layout.activity_main) // Define qual arquivo de layout usar para a tela.

        // Binding: Processo de vincular o código fonte de um programa com o arquivo de layout correspondente.
        
        // TextView: Componente usado para exibir texto em um app Android.
        // Id: Identificador usado para identificar elementos em um app.

        // Encontrar o TextView com o ID "nome" no layout e atribuir ao título do item a variável "nome".
        val nome: TextView = findViewById(R.id.nome) // Busca na tela um elemento com o ID "nome".
        nome.text = "Cesta De Frutas" // Define o texto do elemento "nome" como "Cesta De Frutas".

        // Encontrar o TextView com o nome "descricao" no layout e atribuir à variável "descricao" as frutas da cesta.
        val descricao: TextView = findViewById(R.id.descricao) // Busca na tela um elemento com o ID "descricao".
        descricao.text = "Laranja, Manga e Uva" // Define o texto do elemento "descricao" com as frutas listadas.

        // Encontra o TextView com o ID "valor" no layout e atribui à variável "valor" o preço final dos produtos na cesta.
        val valor: TextView = findViewById(R.id.valor) // Busca na tela um elemento com o ID "valor".
        valor.text = "19.99" // Define o texto do elemento "valor" como "19.99", que é o preço dos itens.
    }
}

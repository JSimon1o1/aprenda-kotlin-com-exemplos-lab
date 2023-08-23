enum class Nivel { INICIANTE, INTERMEDIARIO, AVANÇADO }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)

        println("Usuário ${usuario} inscrito na formação ${nome}.")
    }
}

class Usuario(val nome: String, val email: String) {
    override fun toString(): String {
        return nome
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 180)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 180)
    val conteudo3 = ConteudoEducacional("Qualidade e Auditoria", 180)
    
    val conteudosFormacao = listOf(conteudo1, conteudo2, conteudo3)
    
    val formacao = Formacao("Análise e Desenvolvimento de Sistemas - ADS: ", conteudosFormacao)

    val usuario1 = Usuario("Sofia", "sofia@email.com, 999553344")
    val usuario2 = Usuario("Márcia", "marcia@email.com, 999887667")
    val usuario3 = Usuario("Tiago", "tiago@email.com, 987544566")
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
}

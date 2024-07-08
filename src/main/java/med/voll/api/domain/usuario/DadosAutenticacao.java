package med.voll.api.domain.usuario;

// DTO (Data Transfer Object) que representa os dados de autenticacao vindos do Formulário de Login do front
public record DadosAutenticacao(String login, String senha) {
}
package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

/*
 * Usar um record em Java é uma forma concisa de definir classes de dados imutáveis.
 * Com um record, o compilador automaticamente gera
 * métodos equals(), hashCode(), toString(), e métodos getters para os campos da classe.
 * Isso reduz a quantidade de boilerplate e deixa o código mais limpo e legível.
 * Além disso, records são imutáveis por padrão, o que pode ajudar na prevenção
 * de bugs relacionados a mutabilidade.*/
public record DadosCadastroMedico(
        @NotBlank(message = "Nome nao pode ser vazio")
        String nome,
        @NotBlank(message = "Email nao pode ser vazio")
        @Email(message = "Email invalido")
        String email,

        @NotBlank(message = "Telefone nao pode ser vazio, por favor insira um numero valido")
        String telefone,

        @NotBlank(message = "Crm nao pode ser vazio")
        @Pattern(regexp = "\\d{4,6}", message = "CRM invalido")
        String crm,
        @NotNull(message = "Especialidade nao pode ser vazia")
        Especialidade especialidade,
        @NotNull(message = "Endereco nao pode ser vazio")
        @Valid
        DadosEndereco endereco) {
}
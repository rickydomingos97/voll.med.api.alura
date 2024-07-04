package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

// Nesse record vou receber as informacoes do medico e nao o medico como um objeto
public record DadosDetalhamentoMedico(Long id,
                                      String nome,
                                      String email,
                                      String telefone,
                                      String crm,
                                      Especialidade especialidade,
                                      Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(),
            medico.getNome(),
            medico.getEmail(),
            medico.getTelefone(),
            medico.getCrm(),
            medico.getEspecialidade(),
            medico.getEndereco());
    }
}
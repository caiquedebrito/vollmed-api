package med.voll.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,

        String numero,

        @NotBlank
        String bairro,

        @NotBlank
        String cidade,

        @NotBlank
        String uf,

        String complemento,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep) {
}

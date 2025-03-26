package com.api.faturas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
@Table(name = "fatura")
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O número do cartão não pode estar em branco")
    @Pattern(regexp = "\\d{16}", message = "O número do cartão deve conter 16 caracteres")
    private String numeroCartao;

    @NotBlank(message = "O nome do titular não pode estar em branco")
    @Size(min = 3, max = 100, message = "O nome do titular deve ter entre 3 a 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "O valor não pode ser nulo")
    @DecimalMin(value = "10.00", message = "O valor deve ser no mínimo 10.00 reais")
    @DecimalMax(value = "5000.00", message = "O valor deve ser no máximo 5000.00 reais")
    private Double valor;

    @NotNull(message = "A data de pagamento não pode ser nula")
    @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "O email do contato deve ser válido")
    private String emailContato;

    // Getters and Setter

    public @NotBlank(message = "O número do cartão não pode estar em branco") @Pattern(regexp = "\\d{16}", message = "O número do cartão deve conter 16 caracteres") String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(@NotBlank(message = "O número do cartão não pode estar em branco") @Pattern(regexp = "\\d{16}", message = "O número do cartão deve conter 16 caracteres") String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public @NotBlank(message = "O nome do titular não pode estar em branco") @Size(min = 3, max = 100, message = "O nome do titular deve ter entre 3 a 100 caracteres") String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(@NotBlank(message = "O nome do titular não pode estar em branco") @Size(min = 3, max = 100, message = "O nome do titular deve ter entre 3 a 100 caracteres") String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public @NotNull(message = "O valor não pode ser nulo") @DecimalMin(value = "10.00", message = "O valor deve ser no mínimo 10.00 reais") @DecimalMax(value = "5000.00", message = "O valor deve ser no máximo 5000.00 reais") Double getValor() {
        return valor;
    }

    public void setValor(@NotNull(message = "O valor não pode ser nulo") @DecimalMin(value = "10.00", message = "O valor deve ser no mínimo 10.00 reais") @DecimalMax(value = "5000.00", message = "O valor deve ser no máximo 5000.00 reais") Double valor) {
        this.valor = valor;
    }

    public @NotNull(message = "A data de pagamento não pode ser nula") @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura") LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(@NotNull(message = "A data de pagamento não pode ser nula") @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura") LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public @NotBlank(message = "O email não pode estar em branco") @Email(message = "O email do contato deve ser válido") String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(@NotBlank(message = "O email não pode estar em branco") @Email(message = "O email do contato deve ser válido") String emailContato) {
        this.emailContato = emailContato;
    }
}

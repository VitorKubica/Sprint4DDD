package vistoria.dominio.ddd;

import java.util.Date;

public class Cliente {
	public int idCliente;
	public String nome;
	public String email;
	public String senha;
	public Date dtNascimento;
	public String logradouro;
	public String nrTelefone;

	public Cliente() {
	}

	public Cliente(String nome, String email, int idCliente, String senha) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome deve ser informado");
		}
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("Email deve ser informado");
		}
		if (idCliente <= 0) {
			throw new IllegalArgumentException("ID de cliente inválido");
		}
		if (senha == null || senha.isBlank()) {
			throw new IllegalArgumentException("senha deve ser informada");
		}
		
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", dtNascimento=" + dtNascimento + ", logradouro=" + logradouro + ", nrTelefone=" + nrTelefone + "]";
	}

	public boolean possuiVistoriasPendentes() {
		return false;
	}
}

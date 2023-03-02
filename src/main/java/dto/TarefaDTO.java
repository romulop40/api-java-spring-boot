package dto;

import company.Aplication;


public class TarefaDTO {
/*
 "cep": "01001-000",
"rua": "Praça da Sé",
"complemento": "lado ímpar",
"bairro": "Sé",
"cidade": "São Paulo",
"estado": "SP",
"frete": 7.85
*/
	
	private long cep;
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private long frete;
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public long getFrete() {
		return frete;
	}
	public void setFrete(long frete) {
		this.frete = frete;
	}
	
}

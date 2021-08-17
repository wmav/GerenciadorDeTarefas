package br.com.gerenciador.entidade.enums;

public enum Prioridade {
	ALTA("Alta"),
	MEDIA("Média"),
	BAIXA("baixa");
	
	private String descricao;

	Prioridade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}

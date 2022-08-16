package com.springbatch.arquivomultiplosformatos.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Transacao {

	private Cliente cliente;
	private String id;
	private String descricao;
	private Double valor;
}

package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.alura.forum.model.Topico;

public class TopicoDTO {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDTO(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public static Page<TopicoDTO> converter(Page<Topico> topicos) {
		return topicos.map(TopicoDTO::new); //transforma page de topico em page topicoDTO
//		return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
		
	}

}

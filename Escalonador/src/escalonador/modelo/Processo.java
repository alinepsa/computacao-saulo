package escalonador.modelo;

import java.util.Random;

public class Processo {

	protected static Random random = new Random();
	
	private int pid;
	private int prioridade;
	private EstadoProcesso estado;
	private int tempoComputacao;
	private int quantum;
	private float solicitacaoES;
	private int tempoES;
	public Tempos tempos;
	
	public Processo() {
		tempos = new Tempos();
	}
	
	public boolean isPronto() {
		return estado == EstadoProcesso.PRONTO;
	}
	
	public boolean isBloqueado() {
		return estado == EstadoProcesso.BLOQUEADO;
	}
	
	public boolean isExecutando() {
		return estado == EstadoProcesso.EXECUTANDO;
	}
	
	public boolean isTerminado() {
		return estado == EstadoProcesso.TERMINADO;
	}
	
	/**
	 * Indica se o processo vai ou n&atilde;o fazer opera&ccedil;&atilde;o de ES.
	 * @return boolean indicando se vai ou n&atilde;o realizar ES.
	 **/
	
	public boolean vaiFazerES() {
		return Math.random() <= solicitacaoES;
	}
	
	public int getQuantum() {
		return quantum;
	}
	
	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public EstadoProcesso getEstado() {
		return estado;
	}

	public void setEstado(EstadoProcesso estado) {
		this.estado = estado;
	}

	public int getTempoComputacao() {
		return tempoComputacao;
	}

	public void setTempoComputacao(int tempoComputacao) {
		this.tempoComputacao = tempoComputacao;
	}

	public float getSolicitacaoES() {
		return solicitacaoES;
	}

	public void setSolicitacaoES(float solicitacaoES) {
		this.solicitacaoES = solicitacaoES;
	}

	public int getTempoES() {
		return tempoES;
	}

	public void setTempoES(int tempoES) {
		this.tempoES = tempoES;
	}
	
	@Override
	public String toString() {
		return "Processo [pid=" + pid + ", prioridade=" + prioridade
				+ ", estado=" + estado + ", tempoComputacao=" + tempoComputacao
				+ ", quantum=" + quantum
				+ ", solicitacaoES=" + solicitacaoES + ", tempoES=" + tempoES
				+ ", tempos=" + tempos + "]";
	}
}

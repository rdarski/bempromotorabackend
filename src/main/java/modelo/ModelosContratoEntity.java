
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import java.util.List;
 

@Entity
@Table(name = "ModelosContrato")
public class ModelosContratoEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idModeloContrato_gen")
	@SequenceGenerator(name= "idModeloContrato_gen", sequenceName="idModeloContrato_seq", allocationSize =1)
	@Column(name = "idModeloContrato", updatable = false, nullable = false)
	private Long idModeloContrato;
	
	@Column(name = "Nome")
	private String nome;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="delodeContrato", cascade=CascadeType.ALL)
	private List<VersoesContratoEntity> delodeContratoVersoesContrato;
	
    	
	

	// gets e sets
	public Long getIdModeloContrato(){
		return this.idModeloContrato;
	};

    	public void setIdModeloContrato(Long idModeloContrato){
        	this.idModeloContrato = idModeloContrato;
	};
	
	@Override
	public Long getId(){
		return getIdModeloContrato();
	};
	
	public String getNome(){
		return this.nome;
	};

	public void setNome(String nome){
        	this.nome = nome;
	};
	
	
	
	//novos
	
  	public List<VersoesContratoEntity> getDelodeContratoVersoesContrato(){
		return this.delodeContratoVersoesContrato;
	};
	public void setDelodeContratoVersoesContrato(List<VersoesContratoEntity> delodeContratoVersoesContrato ){
		this.delodeContratoVersoesContrato=delodeContratoVersoesContrato;
	}
	
    	
	
	
	
	
	
}
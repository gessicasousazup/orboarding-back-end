package br.com.zup.onboarding.models;

//Importações necessárias
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Step implements Serializable {
    private static final long serialVersionUID = 1L;

    //Propriedades da classe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stepName;
    private String description;
    private String duration;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Question> question;

    //Construtores da classe
    public Step() { }

    //Getters e setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStepName() {
        return stepName;
    }
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}
   
}

package spring.estudos.Cadastro.Estudantes;

import jakarta.persistence.*;
import spring.estudos.Cadastro.Cursos.CursosModel;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // um estudante tem um único curso
    @ManyToOne
    @JoinColumn(name = "cursos_id")
    private List<CursosModel> cursos;

    public EstudanteModel() {

    }

    public EstudanteModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

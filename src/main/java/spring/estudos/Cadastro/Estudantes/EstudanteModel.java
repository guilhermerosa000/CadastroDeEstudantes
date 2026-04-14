package spring.estudos.Cadastro.Estudantes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.estudos.Cadastro.Cursos.CursosModel;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // um estudante tem um único curso
    @ManyToOne
    @JoinColumn(name = "cursos_id") // Foreing Key
    private CursosModel curso;


}

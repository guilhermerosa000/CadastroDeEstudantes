package spring.estudos.Cadastro.Cursos;

import jakarta.persistence.*;
import spring.estudos.Cadastro.Estudantes.EstudanteModel;

import java.util.List;

@Entity
@Table(name = "tb_cursos")
public class CursosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int cargaHoraria;

    // um curso pode ter vários estudantes
    @OneToMany(mappedBy = "cursos")
    private List<EstudanteModel> estudantes;
}

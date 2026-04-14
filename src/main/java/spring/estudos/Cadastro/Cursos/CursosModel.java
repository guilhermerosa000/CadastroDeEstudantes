package spring.estudos.Cadastro.Cursos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.estudos.Cadastro.Estudantes.EstudanteModel;

import java.util.List;

@Entity
@Table(name = "tb_cursos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int cargaHoraria;

    // um curso pode ter vários estudantes
    @OneToMany(mappedBy = "curso")
    @JsonIgnore
    private List<EstudanteModel> estudantes;
}

package br.com.codiub.mew.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Table(name = "cores")
public class Cores implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq_cores")
    @SequenceGenerator(sequenceName = "id_seq_cores", allocationSize = 1, name = "id_seq_cores")
    private Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Size(max = 40)
    @NotNull
    @Column(name = "cor", nullable = false, length = 40)
    private String cor;

}
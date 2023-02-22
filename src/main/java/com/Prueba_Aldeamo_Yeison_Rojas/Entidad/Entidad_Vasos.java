package com.Prueba_Aldeamo_Yeison_Rojas.Entidad;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "arrays", schema = "public")
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Entidad_Vasos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "input_array")
    private String input;
}

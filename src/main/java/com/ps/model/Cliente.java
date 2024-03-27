package com.ps.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // me genera SET and GET
@NoArgsConstructor  // Me genera un constructor sin Argumentos
@AllArgsConstructor // Me genera un constructor Con todos Argumentos
@Entity  // Especifica que esta clase representa un model de la base de datos 'Entidad'
@Table(name = "Clientes")   //Especifica el nombre de la tabla en la base de datos
public class Cliente {

    @Id  // Especifica que este campo es el ID
    @Column(name = "client_id") // Especifica el nombre en la base de datos :La Columna:
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera solo el ID
    private Long clientId;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
}

package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "projeto")
public class Projeto {
    @Id
private int Id;
private String descricao;
private LocalDate dataInicio;
    private LocalDate dataprevistaFim;

    public Projeto(int id, String descricao, LocalDate dataInicio, LocalDate dataprevistaFim) {
        Id = id;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataprevistaFim = dataprevistaFim;
    }


}

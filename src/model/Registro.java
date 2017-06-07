/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import data.*;
import java.sql.Date;
import java.sql.Time;


/**
 *
 * @author mariajosineidedefrei
 */
public class Registro {
    private int cod_reg;
    private Date data;
    private Time hora; 
    private double pont_total;

    public Registro() {
    }

    public Registro(int cod_reg, Date data, Time hora, double pont_total) {
        this.cod_reg = cod_reg;
        this.data = data;
        this.hora = hora;
        this.pont_total = pont_total;
    }

    public int getCod_reg() {
        return cod_reg;
    }

    public void setCod_reg(int cod_reg) {
        this.cod_reg = cod_reg;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public double getPont_total() {
        return pont_total;
    }

    public void setPont_total(double pont_total) {
        this.pont_total = pont_total;
    }  
}




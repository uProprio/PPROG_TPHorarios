/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_tphorarios;

import utilitarios.Data;

/**
 ***************************************************************
 * Classe utilizada para a criação de objectos do tipo Professor Atributos: -
 * Nome - Sigla - Endereço e-mail - Data de Contratação
 * *************************************************************
 *
 * @author 1081320
 */
public class Professor {

    private String nome;
    private String sigla;
    private String email;
    private Data dataContrato;

    //Contrutores
    public Professor() {
        this("sem nome", "N.A.", new Data());
    }

    public Professor(String nome, String sigla, Data dataContrato) {
        setNome(nome);
        setSigla(sigla);
        setMail(nome);
        setDataContrato(dataContrato);
    }

    public Professor(Professor p) {
        this.nome = p.getNome();
        this.sigla = p.getSigla();
        this.email = p.getEmail();
        setDataContrato(p.dataContrato);
    }

    //Métodos de Modificação
    private void setNome(String nome) {
        this.nome = "".equals(nome) || nome.isEmpty() ? "sem nome" : nome;
    }

    private void setSigla(String sigla) {
        this.sigla = "".equals(sigla) || sigla.isEmpty() ? "sem sigla" : sigla;
    }

    /**
     * Médoto para criação do endereço de e-mail.
     *
     * Este método recebe um parâmetro do tipo String e constroi o e-mail com
     * base no primeiro e ultimo nome ou só com o primeiro nome (no caso de ser
     * introduzido apenas um nome)
     *
     */
    private void setMail(String nome) {
        String[] temp = nome.split(" ");
        String ultimoNome = temp.length - 1 == 0 ? "" : "." + temp[temp.length - 1];
        String dominio = "@isep.ipp.pt";
        this.nome = (temp[0] + ultimoNome + dominio).toLowerCase();
    }

    private void setDataContrato(Data dataContrato) {
        this.dataContrato = new Data(dataContrato.getAno(), dataContrato.getMes(), dataContrato.getDia());
    }

    public String getNome() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }

    public String getEmail() {
        return email;
    }
    
    public Data getDataContrato(){
        return this.dataContrato;    
    }

    @Override
    public String toString() {
        return String.format("Nome:%n%s%nSigla:%n%s%nE-Mail:%n%s%nData de Contratação:%n%s%n", nome, sigla, email, dataContrato.toAnoMesDiaString());
    }
}

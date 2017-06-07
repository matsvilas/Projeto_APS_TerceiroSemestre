/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Matheus
 */
public class Pergunta {

   
    
    private int codigoPergunta;
    private String pergunta;
    private String respostaA;
    private String respostaB;
    private String respostaC;
    private String respostaCerta;
    private int tema;

    @Override
    public String toString() {
        return "Pergunta{" + "cod_perg=" + codigoPergunta + ", pergunta=" + pergunta + ", respostaA=" + respostaA + ", respostaB=" + respostaB + ", respostaC=" + respostaC + ", respostaCerta=" + respostaCerta + ", tema=" + tema + '}';
    }
    public Pergunta() {

    }

    public Pergunta(String perg, String resp, String respA, String respB, String respC, String respCerta, int tema) {
        this.pergunta = perg;
        this.respostaA = respA;
        this.respostaB = respB;
        this.respostaC = respC;
        this.respostaCerta = respCerta;
        this.tema = tema;
    }

    /**
     * @return the codigoPergunta
     */
    public int getCodigoPergunta() {
        return codigoPergunta;
    }
 /**
     * @return the tema
     */
    public int getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(int tema) {
        this.tema = tema;
    }
    
    public void setCodigoPergunta(int codigo) {
        this.codigoPergunta = codigo;
    }
    /**
     * @param codigoPergunta the codigoPergunta to set
     */
  

    /**
     * @return the pergunta
     */
    public String getPergunta() {
        return pergunta;
    }

    /**
     * @param pergunta the pergunta to set
     */
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    /**
     * @return the respostaA
     */
    public String getRespostaA() {
        return respostaA;
    }

    /**
     * @param respostaA the respostaA to set
     */
    public void setRespostaA(String respostaA) {
        this.respostaA = respostaA;
    }

    /**
     * @return the respostaB
     */
    public String getRespostaB() {
        return respostaB;
    }

    /**
     * @param respostaB the respostaB to set
     */
    public void setRespostaB(String respostaB) {
        this.respostaB = respostaB;
    }

    /**
     * @return the respostaC
     */
    public String getRespostaC() {
        return respostaC;
    }

    /**
     * @param respostaC the respostaC to set
     */
    public void setRespostaC(String respostaC) {
        this.respostaC = respostaC;
    }

    /**
     * @return the respostaCerta
     */
    public String getRespostaCerta() {
        return respostaCerta;
    }

    /**
     * @param respostaCerta the respostaCerta to set
     */
    public void setRespostaCerta(String respostaCerta) {
        this.respostaCerta = respostaCerta;
    }
    

}

/* cod_Perg int not null primary key identity, 
 Pergunta varchar(300) not null,
 Resposta_A varchar (250) not null,
 Resposta_B varchar (250) not null, 
 Resposta_C varchar (250) not null, 
 Resposta_Certa varchar (35) not null,
            
            
            
 */

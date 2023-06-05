package org.lessons.java.bank;

public class Conto {
  private final int nConto;
  private String nomeProprietario;
  private double saldo;
  
  
  public Conto(String nomeProprietario) {
    this.nConto = (int) (Math.random() * (1000 - 1) + 1);
    this.nomeProprietario = nomeProprietario;
    this.saldo = 0.0;
  }
  
  public int getNConto() {
    return nConto;
  }
  
  public String getNomeProprietario() {
    return nomeProprietario;
  }
  
  public void setNomeProprietario(String nomeProprietario) {
    this.nomeProprietario = nomeProprietario;
  }
  
  public double getSaldo() {
    return saldo;
  }
  
  public void setVersamento(double importo) {
    if (importo > 0) {
      saldo += importo;
      System.out.println("Versamento di " + importo + " effettuato con successo.");
    } else {
      System.out.println("L'importo del versamento deve essere maggiore di zero.");
    }
  }
  public void prelievo(double importo) {
    if (importo > 0) {
      if (saldo >= importo) {
        saldo -= importo;
        System.out.println("Prelievo di " + importo + " effettuato con successo.");
      } else {
        System.out.println("Saldo insufficiente per effettuare il prelievo.");
      }
    } else {
      System.out.println("L'importo del prelievo deve essere maggiore di zero.");
    }
}
}

package org.lessons.java.bank;

import java.util.Scanner;
public class Bank {
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Benvenuto in Java Bank!");
      System.out.print("Inserisci il tuo nome: ");
      String nomeProprietario = scanner.next();
      
      Conto conto = new Conto(nomeProprietario);
      
      System.out.println("Conto creato con successo!");
      System.out.println("Numero conto: " + conto.getNConto());
      System.out.println("Nome proprietario: " + conto.getNomeProprietario());
      System.out.println("Saldo attuale: " + conto.getSaldo()+" €");
      
      int scelta;
      do {
        System.out.println("\nCosa vuoi fare?");
        System.out.println("1. Versare una somma");
        System.out.println("2. Prelevare una somma");
        System.out.println("3. Cambia nome proprietario");
        System.out.println("4. Uscire");
        
        System.out.print("Scelta: ");
        scelta = scanner.nextInt();
        
        switch (scelta) {
          case 1 -> {
            System.out.print("Inserisci l'importo da versare: ");
            double importoVersamento = scanner.nextDouble();
            conto.setVersamento(importoVersamento);
            System.out.println("Saldo attuale: " + conto.getSaldo()+" €");
          }
          case 2 -> {
            System.out.print("Inserisci l'importo da prelevare: ");
            double importoPrelievo = scanner.nextDouble();
            conto.prelievo(importoPrelievo);
            System.out.println("Saldo attuale: " + conto.getSaldo()+" €");
          }
          case 3 ->  {
            System.out.print("Cambia il nome proprietario: ");
            conto.setNomeProprietario(scanner.next());
            System.out.println("Il nuovo nome proprietario è: " + conto.getNomeProprietario());
          }
          case 4 -> System.out.println("Grazie per aver utilizzato Java Bank. Arrivederci!");
          
          default -> System.out.println("Scelta non valida. Riprova.");
        }
      } while (scelta != 4);
      
      scanner.close();
    }
  }
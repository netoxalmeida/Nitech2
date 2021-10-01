package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int codigo = 0, quantidade = 0, categoria = 0, opc = 0, qtdRemove;
    double valorProduto = 0, desconto = 0, valorFinalDesconto = 0, valor = 0;
    String nome = "", status = "";




    while(opc != 4) {
        System.out.println("[1]REGISTRAR PRODUTOS // [2]VER PRODUTOS // [3]VENDER PRODUTOS // [4]ENCERRAR PROGRAMA");
        opc = in.nextInt();
        switch (opc) {
            case 1:


                System.out.println("\nCATEGORIA: [1]LIMPEZA / [2]ALIMENTAÇÃO / [3]VESTUÁRIO ");
                categoria = in.nextInt();
                in.nextLine();

                System.out.println("\nREFRIGAÇÃO: [R]REFRIGERADO  /  [NR]NÃO REFRIGERADO");
                status = in.nextLine();

                System.out.println("\nINFORME CÓDIGO DO PRODUTO: ");
                codigo = in.nextInt();
                in.nextLine();

                System.out.println("\nINFORME NOME DO PRODUTO: ");
                nome = in.nextLine();

                System.out.println("\nINFORME A QUANTIDADE DE PRODUTOS: ");
                quantidade = in.nextInt();




                if (codigo <= 10) {
                    valor = 10;
                    valorProduto = valor * quantidade;
                    System.out.println("\nPreço unitário do código " + codigo + " é de: R$10,00");
                    System.out.println("\n*******************");
                    System.out.println("\nQuantidade: " + quantidade);
                    System.out.println("\nValor total: R$" + valorProduto);
                    System.out.println("\n*******************");

                    if (valorProduto <= 250) {
                        desconto = (valorProduto * 0.05);
                        valorFinalDesconto = valorProduto - desconto;

                        System.out.println("\n******Desconto de 5%*****");
                        System.out.println("\nDesconto Recebido: " + desconto);
                        System.out.println("\n***************************");
                        System.out.println("\nValor final: " + valorFinalDesconto);
                        System.out.println("\n***************************");
                    } else if (valorProduto < 500) {
                        desconto = (valorProduto * 0.1);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 10%*****");
                        System.out.println("\nDesconto recebido: " + desconto);
                        System.out.println("\nValor Final: " + valorFinalDesconto);
                    } else if (valorProduto > 500) {
                        desconto = (valorProduto * 0.15);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 15%*****");
                        System.out.println("\nDesconto Recebido: " + desconto);
                        System.out.println("Valor Final: " + valorFinalDesconto);
                    } else {
                        System.out.println("Conta não teve desconto!");
                    }
                } else if (codigo <= 20) {
                    valor = 15;
                    valorProduto = valor * quantidade;
                    System.out.println("\nPreço unitário do código: " + codigo + " é de: R$15,00");
                    System.out.println("\n*********************************");
                    System.out.println("\nQuantidade: " + quantidade);
                    System.out.println("\nValor total: R$" + valorProduto);

                    if (valorProduto <= 250) {
                        desconto = (valorProduto * 0.05);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 5% *****");
                        System.out.println("\nDesconto Recebido: " + desconto);
                        System.out.println("\nValor final: " + valorFinalDesconto);
                    } else if (valorProduto < 500) {
                        desconto = (valorProduto * 0.1);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 10% *****");
                        System.out.println("\nDesconto recebido: " + desconto);
                        System.out.println("\nValor final: " + valorFinalDesconto);
                    } else if (valorProduto > 500) {
                        desconto = (valorProduto * 0.15);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 15% *****");
                        System.out.println("\nDesconto Recebido: " + desconto);
                        System.out.println("\nValor Final: " + valorFinalDesconto);
                    } else {
                        System.out.println("Conta não teve desconto");
                    }
                } else if (codigo <= 30) {
                    valor = 20;
                    valorProduto = valor * quantidade;
                    System.out.println("\nPreço unitário do código " + codigo + " é de: R$20,00");
                    System.out.println("\n*******************************");
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Valor total: R$" + valorProduto);

                    if (valorProduto <= 250) {
                        desconto = (valorProduto * 0.05);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 5% *****");
                        System.out.println("\nDesconto recebido: " + desconto);
                        System.out.println("\nValor final: " + valorFinalDesconto);
                    } else if (valorProduto < 500) {
                        desconto = (valorProduto * 0.1);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 10% *****");
                        System.out.println("\nDesconto recebido: " + desconto);
                        System.out.println("\nValor final: " + valorFinalDesconto);
                    } else if (valorProduto > 500) {
                        desconto = (valorProduto * 0.15);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 15% *****");
                        System.out.println("\nDesconto recebido: " + desconto);
                        System.out.println("\nValor final: " + valorFinalDesconto);
                    } else {
                        System.out.println("\nConta não teve desconto");
                    }
                } else if (codigo <= 40) {
                    valor = 30;
                    valorProduto = valor * quantidade;
                    System.out.println("\nPreço unitário do código " + codigo + " é de: R$30,00");
                    System.out.println("\n*******************************");
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Valor total: R$" + valorProduto);

                    if (valorProduto <= 250) {
                        desconto = (valorProduto * 0.05);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 5% *****");
                        System.out.println("\nDesconto recebido: " + desconto);
                        System.out.println("\nValor final: " + valorFinalDesconto);
                    } else if (valorProduto < 500) {
                        desconto = (valorProduto * 0.1);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 10% *****");
                        System.out.println("\nDesconto recebido: " + desconto);
                        System.out.println("\nValor final: " + valorFinalDesconto);
                    } else if (valorProduto > 500) {
                        desconto = (valorProduto * 0.15);
                        valorFinalDesconto = valorProduto - desconto;
                        System.out.println("\n***** Desconto de 15% *****");
                        System.out.println("\nDesconto recebido: " + desconto);
                        System.out.println("\nValor final: " + valorFinalDesconto);
                    } else {
                        System.out.println("\nConta não teve desconto");
                    }
                } else {
                    System.out.println("************* CÓDIGO INCORRETO *************");
                }
                    //tabela 2
                if(categoria == 1 && valor <=20){
                    valorFinalDesconto =+ valorProduto * 0.05;
                }else if(categoria == 2 && valor <=20){
                    valorFinalDesconto =+ valorProduto * 0.08;
                }else if(categoria == 3 && valor <= 20){
                    valorFinalDesconto =+ valorProduto * 0.1;
                }else if(categoria == 1 && valor >=27){
                    valorFinalDesconto =+ valorProduto * 0.12;
                }else if(categoria == 2 && valor >= 27){
                    valorFinalDesconto =+ valorProduto * 0.15;
                }else{
                    valorFinalDesconto =+ valorProduto * 0.18;
                }

                //tabela 1
                if(valorProduto <= 150){
                    valorProduto =+ valorProduto*0.05;
                }else if(valorProduto > 150 && valorProduto <=350){
                    valorProduto =+ valorProduto*0.1;
                }else{
                    valorProduto =+ valorProduto*0.15;
                }


                break;

            case 2:
                System.out.println("*********************************");
                System.out.println("\nPRODUTO: " + nome);
                System.out.println("\nCODIGO: " + codigo);
                System.out.println("\nCATEGORIA: " + categoria);
                System.out.println("\nSTATUS: " + status);
                System.out.println("\nDESCONTO: " + desconto);
                System.out.println("\nVALOR UNITÁRIO: " + valor);
                System.out.println("\nQUANTIDADE: " + quantidade);
                System.out.println("\nVALOR COM DESCONTO: " + valorFinalDesconto);
                System.out.println("\nVALOR SEM DESCONTO: " + valorProduto);
                break;

            case 3:
                System.out.println("QUANTIDADE A SER REMOVIDA: ");
                 qtdRemove = in.nextInt();
                 quantidade = quantidade - qtdRemove;
                 break;

            default:
                System.out.println("ENCERRANDO PROGRAMA");
                break;

        }

    }




}}

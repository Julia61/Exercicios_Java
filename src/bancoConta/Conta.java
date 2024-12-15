package bancoConta;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Conta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("---BANCO---");
//        System.out.println("Gostaria de se cadrastrar no banco? (s/n)");
//        String opcao = scanner.nextLine().toLowerCase();
//
//        while (!opcao.equals("s") && !opcao.equals("n")){
//            System.out.println("Opção Inválida!! Tente novamente: (s/n)");
//            opcao = scanner.nextLine().toLowerCase();
//        }
//
//        if(opcao.equals("s")){
//            System.out.println("Qual é o seu nome? ");
//            String nome = scanner.nextLine();
//
//
//            while (true) {
//                try {
//                    System.out.println("Digite o seu CPF: ");
//                    String entradaCpf = scanner.nextLine();
//
//                    while (entradaCpf.length() != 11 || !entradaCpf.matches("[0-9]+")){
//                        System.out.println("CPF inválido! Digite um CPF com 11 dígitos numéricos!");
//                        entradaCpf = scanner.nextLine();
//
//                    }
//                    cliente.adicionarCliente(nome,entradaCpf);
//                    cliente.setNome(nome);
//                    System.out.println( cliente.getNome() + " seu cadrastro foi realizado!!");
//                    break;
//                } catch (InputMismatchException e) {
//                    System.out.println("Valor Inválido!! Tente novamamente!");
//                    scanner.nextLine();
//                }
//            }
//
//
//        }else {
//            cliente.horario();
//            System.exit(0);
//        }
//
//        System.out.println("Temos 2 planos disponiveis no momento gostaria de velos? (s/n)");
//        String opcaoPlano = scanner.nextLine().toLowerCase();
//
//        while (!opcaoPlano.equals("s") && !opcaoPlano.equals("n")){
//            System.out.println("Opção Inválida!! Tente novamente: (s/n)");
//            opcaoPlano = scanner.nextLine();
//        }
//
//        if(opcaoPlano.equals("s")){
//            cliente.plano01();
//            cliente.plano02();
//
//            System.out.println("Gostaria de fazer um dos planos (s/n)");
//            String planoEscolha = scanner.nextLine().toLowerCase();
//
//            while (!planoEscolha.equals("s") && !planoEscolha.equals("n")){
//                System.out.println("Opção Inválida!! Tente novamente: (s/n)");
//                planoEscolha = scanner.nextLine().toLowerCase();
//            }
//            if(planoEscolha.equals("s")){
//                //arrumar exeção
//                while (true) {
//                    try {
//                        System.out.println("Qual plano ?\nPlano [1]\nPlano [2]");
//                        int escolha = scanner.nextInt();
//
//                        while (escolha != 1 && escolha != 2) {
//                            System.out.println("Opção Inválida");
//                            System.out.println("Qual plano ?\nPlano [1]\nPlano [2]");
//                            escolha = scanner.nextInt();
//                        }
//
//                        if (escolha == 1) {
//                            while (true) {
//                                try {
//                                    System.out.println("Esse plano tem o valor de 30R$ por mês, Por favor faça o deposito: ");
//                                    double saque = scanner.nextDouble();
//                                    while (saque != 30) {
//                                        System.out.println("Esse plano tem o valor de 30R$ por mês, saque inconpativel!! Tente novamente");
//                                        saque = scanner.nextDouble();
//                                    }
//                                    cliente.setSaque(saque);
//                                    System.out.println("Você escolheu o plano 1:\nDe benefícios");
//                                    cliente.plano01();
//                                    System.out.println("Saque constatado! Seja bem vindo(a)!" + cliente.getNome());
//                                    break;
//                                } catch (InputMismatchException e) {
//                                    System.out.println("Valor inválido!! Tente novamente: ");
//                                    scanner.nextLine();
//
//                                }
//                            }
//
//                        } else {
//                            while (true) {
//                                try {
//                                    System.out.println("Esse plano tem o valor de 15R$ por mês, Por favor faça o deposito: ");
//                                    double saque = scanner.nextDouble();
//                                    while (saque != 15) {
//                                        System.out.println("Esse plano tem o valor de 30R$ por mês, saque inconpativel!! Tente novamente");
//                                        saque = scanner.nextDouble();
//                                    }
//                                    cliente.setSaque(saque);
//                                    System.out.println("Você escolheu o plano 2:\nDe benefícios");
//                                    cliente.plano02();
//                                    System.out.println("Saque constatado! Seja bem vindo(a)!" + cliente.getNome());
//                                    break;
//                                } catch (InputMismatchException e) {
//                                    System.out.println("Valor inválido!! Tente novamente: ");
//                                    scanner.nextLine();
//                                }
//                            }
//
//                        }
//                        break;
//                    }catch (InputMismatchException e){
//                        System.out.println("Plano inválido! Por favor digite um plano valido");
//                        scanner.nextLine();
//                    }
//                }
//            }
//        }else {
//            cliente.horario();
//
//        }

        int contador = 0;

        String resposta = "s";
        while (resposta.equalsIgnoreCase("s")) {


            try {
                System.out.println("Gostaria de:\n[ 1 ] Sacar\n[ 2 ] Depositar\n[ 3 ] Conferir saldo\n[ 4 ] Conferir cadastro\n[ 5 ] Sair\nOpção:  ");
                int opcoes = scanner.nextInt();
                scanner.nextLine();

                while (opcoes <= 0 || opcoes >= 6) {
                    System.out.println("Opção Inválida!! Digite o número correspondende: ");
                    System.out.println("Gostaria de:\n[ 1 ] Sacar\n[ 2 ] Depositar\n[ 3 ] Conferir saldo\n[ 4 ] Conferir cadastro\n[ 5 ] Sair\nOpção:  ");
                    opcoes = scanner.nextInt();
                    scanner.nextLine();
                }

                if (opcoes == 1) {
                    while (true) {
                        try {

                            if(contador >= 2){
                                System.out.println("O recurso de sacar está indisponível, você já vez dois saques hoje!!");

                                String respostaRecurso = "s";

                                while (respostaRecurso.trim().equalsIgnoreCase("s")) {
                                    //fazer exceção
                                    System.out.println("Recursos disponíveis :\n[ 1 ] Conferir saldo\n[ 2 ] Conferir cadastro\n[ 3 ] Sair\nOpção:  ");
                                    int recursos = scanner.nextInt();
                                    scanner.nextLine();

                                    while (recursos <= 0 || recursos >= 4) {
                                        System.out.println("Opção indisponivel!! ");
                                        System.out.println("Recursos disponíveis :\n[ 1 ] Conferir saldo\n[ 2 ] Conferir cadastro\n[ 3 ] Sair\nOpção: ");
                                        recursos = scanner.nextInt();
                                        scanner.nextLine();
                                    }

                                    if (recursos == 1) {
                                        System.out.println("Seu saldo é de " + cliente.getDinheiroNaConta() + "R$");

                                    } else if (recursos == 2) {
                                        cliente.exibirCliente();
                                    } else {
                                        cliente.horario();
                                        System.exit(0);
                                    }
                                    //fazer uma exceção
                                    System.out.println("Gostaria de verificar novamente ? (s/n)");
                                    respostaRecurso = scanner.nextLine().trim();


                                }


                            }

                            System.out.println("Qual o saque que gostaria de fazer ? R$");
                            double fazerSaque = scanner.nextDouble();
                            scanner.nextLine();

                            while (fazerSaque > cliente.getSaque()) {
                                System.out.println("Saldo Insuficiente, faça um saldo valido:");
                                System.out.println("Qual o saque que gostaria de fazer? R$");
                                fazerSaque = scanner.nextDouble();
                                scanner.nextLine();
                            }
                            cliente.setSaque(fazerSaque);
                            contador++;
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Saque Inválido!! digite um número");
                            scanner.nextLine();

                        }


                    }



                } else if (opcoes == 2) {
                    while (true) {
                        try {
                            System.out.println("Qual o deposito que gostaria de fazer ? R$");
                            double fazerDeposito = scanner.nextDouble();
                            scanner.nextLine();

                            while (fazerDeposito < 0) {
                                System.out.println("Deposito Insuficiente, faça um deposito valido:");
                                System.out.println("Qual o deposito que gostaria de fazer ? R$");
                                fazerDeposito = scanner.nextDouble();
                                scanner.nextLine();
                            }

                            cliente.setDeposito(fazerDeposito);

                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Deposito Inválido!! digite um número");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                        contador++;

                    }
                } else if (opcoes == 3) {
                    System.out.println("Seu saldo é de " + cliente.getDinheiroNaConta() + "R$");
                } else if (opcoes == 4) {
                    System.out.println("Cadratro: ");
                    cliente.exibirCliente();
                } else {
                    System.exit(0);
                }




            } catch (InputMismatchException e) {
                System.out.println("Opção Inválida!! Por favor digite um número!!");
                scanner.nextLine();
            }

            try {
                System.out.println("Gostaria de fazer movimentaçõe? (s/n)");
                resposta = scanner.nextLine().trim();

                while (!resposta.trim().equalsIgnoreCase("s") && !resposta.trim().equalsIgnoreCase("n")){
                    System.out.println("Opção Inválida!! Tente novamente: (s/n)");
                    resposta = scanner.nextLine().trim();
                }

            }catch (NumberFormatException e){
                System.out.println("Inválidação!! Tente novamente: (s/n)");
                scanner.nextLine();
            }

        }

        cliente.horario();
        scanner.close();


    }


}

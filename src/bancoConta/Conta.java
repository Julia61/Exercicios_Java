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
//                                    double saldo = scanner.nextDouble();
//                                    while (saldo != 30) {
//                                        System.out.println("Esse plano tem o valor de 30R$ por mês, Saldo inconpativel!! Tente novamente");
//                                        saldo = scanner.nextDouble();
//                                    }
//                                    cliente.setSaldo(saldo);
//                                    System.out.println("Você escolheu o plano 1:\nDe benefícios");
//                                    cliente.plano01();
//                                    System.out.println("Saldo constatado! Seja bem vindo(a)!" + cliente.getNome());
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
//                                    double saldo = scanner.nextDouble();
//                                    while (saldo != 15) {
//                                        System.out.println("Esse plano tem o valor de 30R$ por mês, Saldo inconpativel!! Tente novamente");
//                                        saldo = scanner.nextDouble();
//                                    }
//                                    cliente.setSaldo(saldo);
//                                    System.out.println("Você escolheu o plano 2:\nDe benefícios");
//                                    cliente.plano02();
//                                    System.out.println("Saldo constatado! Seja bem vindo(a)!" + cliente.getNome());
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

        try {
            System.out.println("Gostaria de:\n[ 1 ] Sacar\n[ 2 ] Depositar\n[ 3 ] Conferir saldo\n[ 4 ] Conferir cadastro\n[ 5 ] Sair\nOpção:  ");
            int opcoes = scanner.nextInt();

            while (opcoes < 0 && opcoes > 6){
                System.out.println("Opção Inválida!! Digite o número correspondende: ");
                System.out.println("Gostaria de:\n[ 1 ] Sacar\n[ 2 ] Depositar\n[ 3 ] Conferir saldo\n[ 4 ] Conferir cadastro\n[ 5 ] Sair\nOpção:  ");
                opcoes = scanner.nextInt();
            }

            if(opcoes == 1){
                while (true){
                    try {
                        System.out.println("Qual o saldo que gostaria de fazer? R$");
                        double fazerSaldo = scanner.nextDouble();

                        while (fazerSaldo > cliente.getSaldo()){
                            System.out.println("Saldo Insuficiente, faça um saldo valido:");
                            System.out.println("Qual o saldo que gostaria de fazer? R$");
                            fazerSaldo = scanner.nextDouble();
                        }
                        cliente.setSaldo(fazerSaldo);
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("Saldo Inválido!! digite um número");
                        scanner.nextLine();
                    }
                }
            }



        }catch (InputMismatchException e){
            System.out.println("Opção Inválida!! Por favor digite um número!!");
        }




    }


}

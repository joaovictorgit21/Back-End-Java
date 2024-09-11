package view;

import java.util.*;

public class CardapioView {

    private static double carteiraDoMano = 127.58;

    public static void main(String[] args) {


        System.out.println("----------------------------------------------------------------------------");
        System.out.println("---------------- Seja Bem-Vindo ao Perfect Burger - Cardapio ---------------");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Escolha uma opção do Menu (tecle os numeros especificos de cada categoria): ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("[1] - Sanduíches");
        System.out.println("[2] - Hambúrgueres");
        System.out.println("[3] - Acompanhamentos");
        System.out.println("[4] - Bebidas");
        System.out.println("[5] - Sobremesas");
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Digite agora:");
        
        Scanner scnOptions = new Scanner(System.in);
        int OptionsMenu = scnOptions.nextInt();
        scnOptions.nextLine();

            switch (OptionsMenu) {
                case 1:
                    System.out.println("");
                    System.out.println("----------------------------------");
                    System.out.println("Categoria Sanduíches:");
                    System.out.println("----------------------------------");
                    System.out.println("[1] - Cheeseburger Clássico");
                    System.out.println("[2] - Sanduíche de Frango Grelhado");
                    System.out.println("[3] - Sanduíche Vegetariano");
                    System.out.println("[4] - Club Sandwich");
                    System.out.println("----------------------------------");

                    System.out.println("Digite agora:");

                    Scanner scnOptionsCategoryOne = new Scanner(System.in);
                    int OptionsCategoryOne = scnOptionsCategoryOne.nextInt();
                    scnOptionsCategoryOne.nextLine();

                    switch (OptionsCategoryOne) {
                        case 1:
                            double precoOne = 18.00;

                            System.out.println("Hambúrguer de carne, queijo cheddar, alface, tomate, cebola e maionese no pão de hambúrguer.");
                            System.out.println("Tempo Médio: 15 minutos.");
                            System.out.println("Preço: R$ 18,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoOne = new Scanner(System.in);
                            int validationPagamentoOne = pagamentoOne.nextInt();
                            pagamentoOne.nextLine();

                            if (carteiraDoMano >= precoOne) {
                                switch (validationPagamentoOne) {
                                    case 1:
                                        carteiraDoMano -= precoOne;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 2:
                            double precoTwo = 20.00;

                            System.out.println("Peito de frango grelhado, queijo suíço, alface, tomate e maionese no pão ciabatta.");
                            System.out.println("Tempo Médio: 12 minutos.");
                            System.out.println("Preço: R$ 20,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoTwo = new Scanner(System.in);
                            int validationPagamentoTwo = pagamentoTwo.nextInt();
                            pagamentoTwo.nextLine();

                            if (carteiraDoMano >= precoTwo) {
                                switch (validationPagamentoTwo) {
                                    case 1:
                                        carteiraDoMano -= precoTwo;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 3:
                            double precoThree = 19.00;

                            System.out.println("Hambúrguer de grão-de-bico, queijo muçarela, alface, tomate, pepino e molho de iogurte no pão integral.");
                            System.out.println("Tempo Médio: 10 minutos.");
                            System.out.println("Preço: R$ 19,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoThree = new Scanner(System.in);
                            int validationPagamentoThree = pagamentoThree.nextInt();
                            pagamentoThree.nextLine();

                            if (carteiraDoMano >= precoThree) {
                                switch (validationPagamentoThree) {
                                    case 1:
                                        carteiraDoMano -= precoThree;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                
                                    default:
                                        System.out.println("Opção Inválido");
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 4:
                            double precoFour = 22.00;

                            System.out.println("Pão de forma tostado, peito de peru, bacon crocante, queijo, alface, tomate e maionese.");
                            System.out.println("Tempo Médio: 15 minutos.");
                            System.out.println("Preço: R$ 22,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoFour = new Scanner(System.in);
                            int validationPagamentoFour = pagamentoFour.nextInt();
                            pagamentoFour.nextLine();

                            if (carteiraDoMano >= precoFour) {
                                switch (validationPagamentoFour) {
                                    case 1:
                                        carteiraDoMano -= precoFour;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    System.out.println("Categoria Hambúrguer:");
                    System.out.println("-----------------------------------");
                    System.out.println("[1] - Hambúrguer Bacon & Queijo");
                    System.out.println("[2] - Hambúrguer Especial da Casa");
                    System.out.println("[3] - Hambúrguer Vegano");
                    System.out.println("----------------------------------");

                    System.out.println("Digite agora:");

                    Scanner scnOptionsCategoryTwo  = new Scanner(System.in);
                    int OptionsCategoryTwo = scnOptionsCategoryTwo .nextInt();
                    scnOptionsCategoryTwo.nextLine();

                    switch (OptionsCategoryTwo) {
                        case 1:
                            double precoFive = 25.00;

                            System.out.println("Hambúrguer de carne com bacon crocante, queijo cheddar, cebola caramelizada e molho barbecue no pão brioche.");
                            System.out.println("Tempo Médio: 20 minutos.");
                            System.out.println("Preço: R$ 25,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoFive = new Scanner(System.in);
                            int validationPagamentoFive = pagamentoFive.nextInt();
                            pagamentoFive.nextLine();

                            if (carteiraDoMano >= precoFive) {
                                switch (validationPagamentoFive) {
                                    case 1:
                                        carteiraDoMano -= precoFive;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 2:
                            double precoSix = 28.00;

                            System.out.println("Hambúrguer de carne com queijo gouda, cebola roxa, cogumelos salteados e maionese trufada no pão de hambúrguer.");
                            System.out.println("Tempo Médio: 20 minutos.");
                            System.out.println("Preço: R$ 28,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");
                            
                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoSix = new Scanner(System.in);
                            int validationPagamentoSix = pagamentoSix.nextInt();
                            pagamentoSix.nextLine();

                            if (carteiraDoMano >= precoSix) {
                                switch (validationPagamentoSix) {
                                    case 1:
                                        carteiraDoMano -= precoSix;;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 3:
                            double precoSeven = 24.00;

                            System.out.println("Hambúrguer à base de plantas, queijo vegano, alface, tomate e molho de abacate no pão de grãos.");
                            System.out.println("Tempo Médio: 15 minutos.");
                            System.out.println("Preço: R$ 24,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoSeven = new Scanner(System.in);
                            int validationPagamentoSeven = pagamentoSeven.nextInt();
                            pagamentoSeven.nextLine();

                            if (carteiraDoMano >= precoSeven) {
                                switch (validationPagamentoSeven) {
                                    case 1:
                                        carteiraDoMano -= precoSeven;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        default:
                            System.out.println("Opção Inválido");
                            CardapioView.main(args);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    System.out.println("Categoria Acompanhamentos:");
                    System.out.println("-----------------------------------");
                    System.out.println("[1] - Batata Frita");
                    System.out.println("[2] - Onion Rings");
                    System.out.println("[3] - Nuggets de Frango");
                    System.out.println("[4] - Salada de Repolho");
                    System.out.println("----------------------------------");

                    System.out.println("Digite agora:");

                    Scanner scnOptionsCategoryThree  = new Scanner(System.in);
                    int OptionsCategoryThree = scnOptionsCategoryThree .nextInt();
                    scnOptionsCategoryThree.nextLine();

                    switch (OptionsCategoryThree) {
                        case 1:
                            double precoEight = 12.00;

                            System.out.println("Batatas fritas crocantes, servidas com ketchup e maionese.");
                            System.out.println("Tempo Médio: 10 minutos.");
                            System.out.println("Preço: R$ 12,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoEight = new Scanner(System.in);
                            int validationPagamentoEight = pagamentoEight.nextInt();
                            pagamentoEight.nextLine();

                            if (carteiraDoMano >= precoEight) {
                                switch (validationPagamentoEight) {
                                    case 1:
                                        carteiraDoMano -= precoEight;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 2:
                            double precoNine = 15.00;

                            System.out.println("Anéis de cebola empanados e fritos, servidos com molho barbecue.");
                            System.out.println("Tempo Médio: 12 minutos.");
                            System.out.println("Preço: R$ 15,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoNine = new Scanner(System.in);
                            int validationPagamentoNine = pagamentoNine.nextInt();
                            pagamentoNine.nextLine();

                            if (carteiraDoMano >= precoNine) {
                                switch (validationPagamentoNine) {
                                    case 1:
                                        carteiraDoMano -= precoNine;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 3:
                            double precoTen = 18.00;

                            System.out.println("Peitos de frango empanados e fritos, acompanhados de molho de mostarda e mel.");
                            System.out.println("Tempo Médio: 15 minutos.");
                            System.out.println("Preço: R$ 18,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoTen = new Scanner(System.in);
                            int validationPagamentoTen = pagamentoTen.nextInt();
                            pagamentoTen.nextLine();

                            if (carteiraDoMano >= precoTen) {
                                switch (validationPagamentoTen) {
                                    case 1:
                                        carteiraDoMano -= precoTen;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 4:
                            double precoEleven = 8.00;

                            System.out.println("Repolho fresco, cenoura e molho cremoso.");
                            System.out.println("Tempo Médio: 5 minutos.");
                            System.out.println("Preço: R$ 8,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");
                            
                            Scanner pagamentoEleven = new Scanner(System.in);
                            int validationPagamentoEleven = pagamentoEleven.nextInt();
                            pagamentoEleven.nextLine();

                            if (carteiraDoMano >= precoEleven) {
                                switch (validationPagamentoEleven) {
                                    case 1:
                                        carteiraDoMano -= precoEleven;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        default:
                            System.out.println("Opção Inválido");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    System.out.println("Categoria Bebidas:");
                    System.out.println("-----------------------------------");
                    System.out.println("[1] - Refrigerantes");
                    System.out.println("[2] - Sucos Naturais");
                    System.out.println("[3] - Água Mineral");
                    System.out.println("[4] - Milkshake");
                    System.out.println("-----------------------------------");

                    System.out.println("Digite agora:");

                    Scanner scnOptionsCategoryFour  = new Scanner(System.in);
                    int OptionsCategoryFour = scnOptionsCategoryFour .nextInt();
                    scnOptionsCategoryFour.nextLine();

                    switch (OptionsCategoryFour) {
                        case 1:
                            double precoTwelve = 100;

                            System.out.println("Coca-Cola, Pepsi, Sprite, Fanta Laranja.");
                            System.out.println("Tempo Médio: Disponível imediatamente.");
                            System.out.println("Preço: R$ 6,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");

                            Scanner pagamentoTwelve = new Scanner(System.in);
                            int validationPagamentoTwelve = pagamentoTwelve.nextInt();
                            pagamentoTwelve.nextLine();

                            if (carteiraDoMano >= precoTwelve) {
                                switch (validationPagamentoTwelve) {
                                    case 1:
                                        carteiraDoMano -= precoTwelve;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 2:
                            double precoThirteen = 8.00;

                            System.out.println("Laranja, Maçã, Abacaxi com Hortelã.");
                            System.out.println("Tempo Médio: 5 minutos.");
                            System.out.println("Preço: R$ 8,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");

                            Scanner pagamentoThirteen = new Scanner(System.in);
                            int validationPagamentoThirteen = pagamentoThirteen.nextInt();
                            pagamentoThirteen.nextLine();

                            if (carteiraDoMano >= precoThirteen) {
                                switch (validationPagamentoThirteen) {
                                    case 1:
                                        carteiraDoMano -= precoThirteen;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 3:
                            double precoFourteen = 4.00;
                            System.out.println("Com ou sem gás.");
                            System.out.println("Tempo Médio: Disponível imediatamente.");
                            System.out.println("Preço: R$ 4,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");

                            Scanner pagamentoFourteen = new Scanner(System.in);
                            int validationPagamentoFourteen = pagamentoFourteen.nextInt();
                            pagamentoFourteen.nextLine();

                            if (carteiraDoMano >= precoFourteen) {
                                switch (validationPagamentoFourteen) {
                                    case 1:
                                        carteiraDoMano -= precoFourteen;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 4:
                            double precoFifiteen = 14.00;

                            System.out.println("Chocolate, Morango, Baunilha.");
                            System.out.println("Tempo Médio: 7 minutos.");
                            System.out.println("Preço: R$ 14,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");

                            Scanner pagamentoFifiteen = new Scanner(System.in);
                            int validationPagamentoFifiteen = pagamentoFifiteen.nextInt();
                            pagamentoFifiteen.nextLine();

                            if (carteiraDoMano >= precoFifiteen) {
                                switch (validationPagamentoFifiteen) {
                                    case 1:
                                        carteiraDoMano -= precoFifiteen;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        default:
                            System.out.println("Opção Inválido");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("-----------------------------------");
                    System.out.println("Categoria Sobremesas:");
                    System.out.println("-----------------------------------");
                    System.out.println("[1] - Brownie de Chocolate");
                    System.out.println("[2] - Cheesecake");
                    System.out.println("[3] - Sundae");
                    System.out.println("-----------------------------------");

                    System.out.println("Digite agora:");

                    Scanner scnOptionsCategoryFive  = new Scanner(System.in);
                    int OptionsCategoryFive = scnOptionsCategoryFive .nextInt();
                    scnOptionsCategoryFive.nextLine();

                    switch (OptionsCategoryFive) {
                        case 1:
                            double precoSixteen = 12.00;

                            System.out.println("Brownie quente com pedaços de chocolate, servido com uma bola de sorvete de baunilha.");
                            System.out.println("Tempo Médio: 15 minutos.");
                            System.out.println("Preço: R$ 16,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");

                            Scanner pagamentoSixteen = new Scanner(System.in);
                            int validationPagamentoSixteen = pagamentoSixteen.nextInt();
                            pagamentoSixteen.nextLine();

                            if (carteiraDoMano >= precoSixteen) {
                                switch (validationPagamentoSixteen) {
                                    case 1:
                                    carteiraDoMano -= precoSixteen;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 2:
                            double precoSeventeen = 15.00;

                            System.out.println("Cheesecake cremoso com calda de frutas vermelhas.");
                            System.out.println("Tempo Médio: 10 minutos.");
                            System.out.println("Preço: R$ 15,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");

                            Scanner pagamentoSeventeen = new Scanner(System.in);
                            int validationPagamentoSeventeen = pagamentoSeventeen.nextInt();
                            pagamentoSeventeen.nextLine();

                            if (carteiraDoMano >= precoSeventeen) {
                                switch (validationPagamentoSeventeen) {
                                    case 1:
                                        carteiraDoMano -= precoSeventeen;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        case 3:
                            double precoEightteen = 12.00;
                            
                            System.out.println("Sorvete com cobertura de chocolate, caramelo e chantilly.");
                            System.out.println("Tempo Médio: 5 minutos.");
                            System.out.println("Preço: R$ 12,00.");

                            System.out.println("----------------------------------------------");
                            System.out.println("Deseja realizar o pagamento? 1 - sim | 2 - não");
                            System.out.println("----------------------------------------------");

                            System.out.println("Digite agora:");

                            Scanner pagamentoEightteen = new Scanner(System.in);
                            int validationPagamentoEightteen = pagamentoEightteen.nextInt();
                            pagamentoEightteen.nextLine();

                            if (carteiraDoMano >= precoEightteen) {
                                switch (validationPagamentoEightteen) {
                                    case 1:
                                        carteiraDoMano -= precoEightteen;
                                        System.out.println("Você agora consta com R$" + carteiraDoMano + " na carteira!");
                                        CardapioView.main(args);
                                        break;
                                    case 2:
                                        CardapioView.main(args);
                                        break;
                                
                                    default:
                                        System.out.println("Opção Inválido");
                                        CardapioView.main(args);
                                        break;
                                }
                                break;
                            } else {
                                System.out.println("Saldo Insuficiente");
                                CardapioView.main(args);
                            }
                        default:
                            System.out.println("Opção Inválido");
                            CardapioView.main(args);
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção Inválido");
                    CardapioView.main(args);
                    break;
            }
        scnOptions.close();
    }
}

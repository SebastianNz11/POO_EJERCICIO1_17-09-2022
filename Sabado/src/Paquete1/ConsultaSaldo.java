package Paquete1;

import java.util.Scanner;

public class ConsultaSaldo {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int var;
        boolean bandera = true, ban = true, ban2 = true;
        Cuenta ob1 = new Cuenta();
        Cuenta ob2 = new Cuenta();
        ob1.agregarSaldo(500);
        ob2.agregarSaldo(300);

        do {
            System.out.println("SELECCIONE UNA CUENTA");
            System.out.println("1. - CUENTA NO. 1");
            System.out.println("2. - CUENTA NO. 2");
            System.out.println("3. - SALIR");
            System.out.println("Ingresa tu opcion: ");
            var = en.nextInt();
            switch (var) {
                case 1:
                    do {
                        System.out.println("Cuenta NO.1");
                        System.out.println("1.- Agregar saldo");
                        System.out.println("2. - Retirar dinero");
                        System.out.println("3. - Consultar saldo");
                        System.out.println("4. - Salir");
                        System.out.println("Ingrese su opcion");
                        int a = en.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("Ingrese el valor a abonar a la cuenta: ");
                                double in = en.nextDouble();
                                ob1.agregarSaldo(in);
                                break;

                            case 2:
                                System.out.println("Ingrese el valor a sacar a la cuenta: ");
                                double un = en.nextDouble();
                                ob1.sacarSaldo(un);
                                break;

                            case 3:
                                ob1.saldoActual();
                                break;

                            case 4:
                                System.out.println("Saliendo...");
                                ban = false;
                                break;

                            default:
                                System.out.println("Opcion invalida!");
                        }
                    } while (ban != false);
                    break;

                case 2:
                    do {
                        System.out.println("Cuenta NO.2");
                        System.out.println("1.- Agregar saldo");
                        System.out.println("2. - Retirar dinero");
                        System.out.println("3. - Consultar saldo");
                        System.out.println("4. - Salir");
                        System.out.println("Ingrese su opcion");
                        int b = en.nextInt();
                        switch (b) {
                            case 1:
                                System.out.println("Ingrese el valor a abonar a la cuenta: ");
                                double in = en.nextDouble();
                                ob2.agregarSaldo(in);
                                break;

                            case 2:
                                System.out.println("Ingrese el valor a sacar a la cuenta: ");
                                double un = en.nextDouble();
                                ob2.sacarSaldo(un);
                                break;

                            case 3:
                                ob2.saldoActual();
                                ban2 = false;
                                break;

                            default:
                                System.out.println("Opcion invalida!");
                        }
                    } while (ban2 != false);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    bandera = false;
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida!");
            }
        } while (bandera != false);
    }
}

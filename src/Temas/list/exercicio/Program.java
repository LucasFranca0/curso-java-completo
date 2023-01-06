package Temas.list.exercicio;

import Temas.list.exercicio.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
    N funcionários. Não deve haver repetição de id.
    Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
    Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
    mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
    conforme exemplos.

    Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
    ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
    aumento por porcentagem dada.

 */

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = scan.nextInt();

        List<Employee> employee = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = scan.nextInt();
            while (hasId(employee, id)) {
                System.out.print("Id already taken. Try again: ");
                id = scan.nextInt();
            }
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            employee.add(new Employee(id, name, salary));

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scan.nextInt();

        // Buscar pelo id na lista
        Employee emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        // Verificar se o id existe e incrementa o salário com base na porcentagem
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            Double percentage = scan.nextDouble();
            emp.increaseSalary(percentage);
        }

        // Listar os elementos do List
        System.out.println("List of employees:");
        for (Employee employess : employee) {
            System.out.println(employess);
        }
    }

    // Verificar se o id já existe e retorna false ou true. Se existir, retorna true.
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); // irá procurar pelo id e se não encontrar irá retornar 'null'
        return emp != null; // vai comparar o valor de emp para verificar se é diferente de 'null', se for, então retorna true, pois então existe já um id cadastrado.
    }
}

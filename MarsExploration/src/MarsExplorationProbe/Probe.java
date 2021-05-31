package MarsExplorationProbe;

import java.util.Scanner;

public class Probe {
    //Atributtes
    String direction;
    String moviment;
    String finalStatus;
    String option;
    int x, y, a, l;
    Scanner input = new Scanner(System.in); //Criado o objeto ler do tipo Scanner, responsável pela leitura das entradas de dados.



    public void groundSize(){
		/*O método tamanho terreno, solicita ao usuário para informar o tamanho do terreno.*/

        //Valores digitados pelo usuario para altura e largura ( 'a' e 'l').
        System.out.print("Informe o tamanho do terreno: ");
        String entrada = input.nextLine();

        String[] vetor = entrada.split(",");
        this.a = Integer.valueOf(vetor[0]); // (altura)
        this.l = Integer.valueOf(vetor[1]); // (largura)

		/*Pode-se deixar fixo .
		this.a = 5;
		this.l = 5;*/
    }

    public void probePosition(){
		/*O método posição Sonda, solicita ao usuário para informar a posição inicial da Sonda,
		devendo o mesmo entrar com o valor de x, y e da direção cardeal.*/

        System.out.print("\nInforme a posição da Sonda e a direção cardeal: ");
        String entrada = input.nextLine().toUpperCase(); // x y N - *O métodoo '.toUpperCase()'converte toda a String para caixa alta.

        String[] vetor = entrada.split(",");
        this.x = Integer.valueOf(vetor[0]); // valor de x
        this.y = Integer.valueOf(vetor[1]); // valor de y
        this.direction = vetor[2]; // valor direção cardeal


    }

    public void move(){

        System.out.print("\nEntre com os movimentos: ");
        this.option = input.next().toUpperCase();
        int contador = this.option.length(); //Contador irá receber a entrada de dados como length, onde fará a conta dos caracteres.
        for(int i = 0; i < contador; i++) { //O for será responsável por fazer os comandos e enquanto o contador for menor do que o i.
            char comando = this.option.charAt(i); // Criado o comando como char, responsável por fazer os comandos informados na entrada.

            switch (comando){
                case 'L': //Caso a entrada for igual a 'L' será realizado a lógica abaixo:
                    if (this.direction.equals("N")){
                        //Se a direção cardeal atual for igual a N, será alterado para a direção W.
                        this.direction = "W";

                    }else if (this.direction.equals("E")){
                        //Senão se a direção cardeal atual for igual a E, será alterado para a direção N.
                        this.direction = "N";

                    }else if (this.direction.equals("S")){
                        //Senão se a direção cardeal atual for igual a S, será alterado para a direção E.
                        this.direction = "E";

                    }else if (this.direction.equals("W")){
                        //Senão se a direção cardeal atual for igual a W, será alterado para a direção S.
                        this.direction = "S";
                    }
                    break;

                case 'R': //Caso a entrada for igual a 'R' será realizado a lógica abaixo:
                    if (this.direction.equals("N")){
                        //Se a direção cardeal atual for igual a N, será alterado para a direção E.
                        this.direction = "E";

                    }else if (this.direction.equals("E")){
                        //Senão se a direção cardeal atual for igual a E, será alterado para a direção S.
                        this.direction = "S";

                    }else if (this.direction.equals("S")){
                        //Senão se a direção cardeal atual for igual a S, será alterado para a direção W.
                        this.direction = "W";
                    }else if (this.direction.equals("W")){
                        //Senão se a direção cardeal atual for igual a W, será alterado para a direção N.
                        this.direction = "N";
                    }
                    break;

                case 'M': //Caso a entrada for igual a 'M' será realizado a lógica abaixo:
                    // Caso as posições x ou y forem menor do que l ou a, não será possível realizar o movimento, pois estará fora da área permitida.
                    if (this.direction.equals("N") && this.y < this.l){
                        //Se a direção cardeal atual for igual a N e a posição de y for menor do que l, y irá andar para frente.
                        this.y = this.y + 1;
                    }else if (this.direction.equals("S") && y < this.l){
                        //Senão se a direção cardeal atual for igual a S e a posição de y for menor do que l, y irá andar para trás.
                        this.y = this.y - 1;
                    }else if (direction.equals("E") && this.x < this.a){
                        //Senão se a direção cardeal atual for igual a E e a posição de x for menor do que a, x irá andar para frente.
                        this.x = this.x + 1;
                    }else if (direction.equals("W") && this.x < this.a){
                        //Senão se a direção cardeal atual for igual a W e a posição de x for menor do que a, x irá andar para trás.
                        this.x = this.x - 1;

                    }else {
                        //Senão o movimento não será computado, pois entende-se que estará fora do terreno.
                        System.out.println("Fora da área permitida!"); //Movimento não computado.
                    }
                    break;

                default: //Caso a entrada seja diferente das permitidas irá aparecer a mensagem abaixo.
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        }

    }


    public void status(){
        //O método status irá apresentar a posição final da sonda, pegando a informação de 'x', 'y', 'direcao'.
        System.out.print(+this.getX()+" "+this.getY()+" "+this.getDirection()+"\n");
    }

    //Métodos Getters
    public String getDirection() {
        return this.direction;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getA() {
        return this.a;
    }

    public int getL() {
        return this.l;
    }
}
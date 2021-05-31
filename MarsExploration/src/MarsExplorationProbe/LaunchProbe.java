package MarsExplorationProbe;

public class LaunchProbe {

    public static void main(String[] args){
        Probe probe1 = new Probe();
        Probe probe2 = new Probe();

        probe1.groundSize();
        //Tamanho Terreno = 5, 5
        probe1.probePosition();
        //Posição sonda1 = 1, 2, N
        probe1.move();
        //Movimentos sonda1 = LMLMLMLMM

        probe2.groundSize();
        //Tamanho Terreno = 5, 5
        probe2.probePosition();
        //Posição sonda2 = 3, 3, E
        probe2.move();
        //Movimentos sonda2 = MMRMMRMRRM

        System.out.print("\nPosição Final 1ª Sonda: "); // 1, 3, N
        probe1.status();
        System.out.print("Posição Final 2ª Sonda: "); // 5, 1, E
        probe2.status();
    }
}

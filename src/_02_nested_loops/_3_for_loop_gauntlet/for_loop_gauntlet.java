package _02_nested_loops._3_for_loop_gauntlet;

public class for_loop_gauntlet {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                System.out.println(i+" "+j);
            }
        }
        for (int a = 1; a<10; a++){
            System.out.print(a+ " ");
            if (a % 3 == 0){
                System.out.println();
            }
        }
        for (int b = 1; b<101; b++){
            System.out.print(b+ " ");
            if (b % 10 == 0){
                System.out.println();
            }
        }
        int seven = 1;
        for (int c = 0; c<7; c++){
        	for (int d = 0; d<seven; d++) {
        		System.out.print("* "); 
        	}
        	seven = seven+1;
        	System.out.println("");
        }

    }
}


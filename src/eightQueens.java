import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class eightQueens {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("Data_NO_1000times.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("Using as a 500 generations as stopping condition");
//		bw.newLine();
//		bw.write("Doing it or Traversing it 100000 times");
//		bw.newLine();
//		bw.write("displaying 0 if not found else 1 if found followed by details");
//		bw.newLine();
//		bw.write("found or not, generation, solution(printed)");
//		bw.newLine();
		System.out.println("Using as a 50 generations as stopping condition");
		System.out.println("Doing it or Traversing it 1000 times");
		System.out.println("displaying 0 if not found else 1 if found followed by details");
		System.out.println("found or not, generation, solution(printed)");
		for(int a = 0; a < 1; a++) {
		// Create GA object
		// GeneticAlgorithm(int populationSize, double mutationRate, double crossoverRate, int elitismCount)
		GeneticAlgorithm ga = new GeneticAlgorithm(100, 0.001, 0.95, 2);

		// Initialize population
//		ga.initPopulation(length of genes);
		Population population = ga.initPopulation(8);

		// Evaluate population
		ga.evalPopulation(population);

		// Keep track of current generation
		int generation = 1;
	

	
		while ((ga.isTerminationConditionMet(population) == false)) {
			// Print fittest individual from population
			System.out.println("Best solution: " + population.getFittest(0).toString());
            System.out.println(generation);
			// Apply crossover
			population = ga.crossoverPopulation(population);

			// Apply mutation
			population = ga.mutatePopulation(population);

			// Evaluate population
			ga.evalPopulation(population);

			// Increment the current generation
			generation++;
			if(generation >= 100000) {
				 System.out.println("could not found solution");
//				System.out.println(0);
//				bw.write("0");
//				bw.newLine();
				 break;
			 }
		}
   
		if(!(generation >= 100000)) {
			 System.out.println("Found solution in " + generation + " generations");
				System.out.println("Solution - Queen Indexes: " + population.getFittest(0).toString());
//			 System.out.println(1+ ", " + generation + ", " + population.getFittest(0).toString());
//			 bw.write(1+ ", " + generation + ", " + population.getFittest(0).toString());
//			 bw.newLine();
		 }
				 
		}//forloop end
	  
//		bw.close();
	}
}

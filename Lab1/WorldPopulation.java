import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {

	static SortStrategy sortStrategy;
	long[] population = new long[13484]; 
	public WorldPopulation(){
		sortStrategy = new Insertionsort();
	}
	
	public void readInputFile(){
		population = readPopulationFile("src\\WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
	}
	
	
	public long[] readPopulationFile(String fileName){
		int counter = 0;
		   try {
			  FileReader inputFile = new FileReader(fileName);
			  BufferedReader reader = new BufferedReader(inputFile);
	          String line;
			  
			  while((line = reader.readLine()) != null) {
			     StringTokenizer tokenizer = new StringTokenizer(line, ",");
			     String countryName = tokenizer.nextToken(); 
			     String year = tokenizer.nextToken();
			     String pop = tokenizer.nextToken();
			     long popCount = Long.parseLong(pop);
			     population[counter++]=popCount;
			     counter++;
			  }
			  reader.close();
		    } catch (Exception e) {
			  e.printStackTrace();   
			}   
			
				  
		return population;
	}
	
	
	public void sortPopulation(){		
		
	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new Insertionsort()); 
		worldPopulation.sortPopulation();
		
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new Bubblesort()); 
		worldPopulation.sortPopulation();
		
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new Selectionsort());
		worldPopulation.sortPopulation();
	}

}

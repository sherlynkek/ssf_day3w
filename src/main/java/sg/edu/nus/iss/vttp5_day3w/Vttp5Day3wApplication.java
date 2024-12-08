package sg.edu.nus.iss.vttp5_day3w;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Vttp5Day3wApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Vttp5Day3wApplication.class, args);

		/* /* SpringApplication app = new SpringApplication(Vttp5Day3wApplication.class);
		ApplicationArguments argsOptions = new DefaultApplicationArguments(args);
		String dirPath;

		if(argsOptions.containsOption("dataDir")) {

			System.out.println("in data dir");

			dirPath = argsOptions.getOptionValues("dataDir").get(0);

			File file = new File(dirPath);
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("File created");
			}
			else {
				System.out.println("File already exists");
			}
		}
		else {
			System.out.println("No --datadir arguement provided");
			System.exit(1);
		}
		app.run(args); */
	} 

}

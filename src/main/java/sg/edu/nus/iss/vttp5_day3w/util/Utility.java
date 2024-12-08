package sg.edu.nus.iss.vttp5_day3w.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.vttp5_day3w.model.Contact;

public class Utility {
    public static String dataDir;

    public static void writeToFile(Contact p) {
        try {
            // System.out.println("IN WRITE FILE");
            File file = p.getContactFile();
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(p.getContactFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("ID: " + p.getId() + "\n");
            bw.write("Name: " + p.getName() + "\n");
            bw.write("Email: " + p.getEmail() + "\n");
            bw.write("Phone Number: " + p.getPhoneNum() + "\n");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            bw.write("Date of Birth: " + sdf.format(p.getDob()) + "\n");

            bw.flush();
            fw.flush();
            bw.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Error in writing to file");
            e.printStackTrace();
        }
    }

    public static List<String> readContactFile(Contact foundContact) {
        // System.out.println("IN READ FILE");

        List<String> dataRead = new ArrayList<>();
        try {
            FileReader fr = new FileReader(foundContact.getContactFile());
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while((line = br.readLine()) != null) {
                dataRead.add(line);
            }
            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println("Error in reading file!");
            e.printStackTrace();
        }
        return dataRead;
    }
}

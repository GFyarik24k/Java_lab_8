package lab_8;

import java.io.FileWriter;
import java.io.*;

public class File {
    File A;
    public File(){
    }
    public void addAend(String message){
        try(FileWriter writer = new FileWriter("D:\\lab_8_list_2_var_1.txt",true)){
            String text = message;
            writer.append(" "+text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.util.*;
import java.io.*;
public class Lab11First{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"));
            ArrayList<LabStudent> al = new ArrayList<LabStudent>();
            while(br.ready()){
                String temp = br.readLine();
                String[] data = temp.split(",");
                LabStudent tempStu = new LabStudent(Integer.parseInt(data[0]),data[1],data[2],Integer.parseInt(data[3]));
                al.add(tempStu);
            }
            Iterator<LabStudent> itr = al.iterator();
            while(itr.hasNext()){
                LabStudent temp = itr.next();
                System.out.println(temp.rollNo);
                if(temp.rollNo>40){
                    temp.semester++;
                }
                String studentData = temp.rollNo+","+temp.name+","+temp.email+","+temp.semester;
                bw.write(studentData);
                bw.newLine();
            }
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class LabStudent{
    int rollNo;
    String name;
    String email;
    int semester;
    public LabStudent(int rollNo, String name, String email,int semester){
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.semester = semester;
    }
}
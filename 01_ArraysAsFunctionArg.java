import java.util.*;

public class ArraysAsFunctionArg{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]++;
        }
    }
    public static void main(String args[]){
        int marks[] = {77,23,97,55};
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        } 
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        } 
        
   }
}
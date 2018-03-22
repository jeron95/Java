/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.assignment.pkg7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DAVIDSONJ
 */
public class Albums
{
    private String author;
    private String title;
    private int year;
    private String producer;
    
    Albums(String a, String t, int y, String p)
    {
        author = a;
        title = t;
        year = y;
        producer = p;
    }
    
    public String toString()
    {
        return(author + " " + title + " " + year + " " + producer);
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new FileReader("/Users/Jas/Desktop/albums.txt"));
        Map<String, List<Albums>> map = new HashMap <String, List<Albums>>();
        String line = "";
        while(inFile.hasNext())
        {
            line = inFile.nextLine();
            //System.out.println(LINE: " +line);
            StringTokenizer st = new StringTokenizer(line, ",");
            String author = st.nextToken().trim();
            String title = st.nextToken().trim();
            int year = Integer.valueOf(st.nextToken().trim());
            String producer = st.nextToken().trim();
            //System.out.println ("TOKENS: " + author+title+year+producer);
            Albums a = new Albums(author, title, year, producer);
            
            List <Albums> albumsarray = map.get(author);
            
            if(albumsarray == null)
            {
                albumsarray = new ArrayList<>();
                albumsarray.add(a);
                map.put(author, albumsarray);
            }
            else
            {
                albumsarray.add(a);
            }
        }
        
        String letter = "A";
        while (!letter.equals("1"))
        {
        System.out.println("Please enter an author: ");
        Scanner in = new Scanner(System.in);
        letter = in.next();
        String author = in.nextLine();
        List <Albums> albumsarray = map.get(author);
        if(albumsarray == null)
        {     
          System.out.println("No album with that key or value exist");
        }
        else
        {
            System.out.println(albumsarray);
        }
        
        }
     
    }
}
    
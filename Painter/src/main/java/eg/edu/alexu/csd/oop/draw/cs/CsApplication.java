package eg.edu.alexu.csd.oop.draw.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class CsApplication {

    public static void main(String[] args) {
        /*DrawingEngine d=new DrawingEngine();
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();
        p1.x=1;
        p1.y=2;
        p2.x=1;
        p2.y=2;
        p3.x=1;
        p3.y=2;
        p4.x=1;
        p4.y=2;
        Object[] o =d.Factory("c",p1,p2,"Red","Red");
        d.Factory("c",p1,p2,"Red","Red");
        d.Factory("c",p3,p4,"Red","Red");
        d.Factory("c",p3,p4,"Red","Red");
        /*System.out.println(d.opUndo());
        System.out.println(d.opUndo());
        System.out.println(d.opUndo());
        System.out.println(d.opUndo());*/
        /*d.Factory("c",p1,p2,"Red","Red");
        d.Factory("c",p1,p2,"Red","Red");
        d.Factory("c",p3,p4,"Red","Red");
        d.Factory("c",p3,p4,"Red","Red");
        /*System.out.println(d.opUndo());
        System.out.println(d.opUndo());
        System.out.println(d.opUndo());
        System.out.println(d.opUndo());
        Object[] o1= d.opUndo();
        Object[] o2=d.opRedo();*/
        SpringApplication.run(CsApplication.class, args);
    }

}

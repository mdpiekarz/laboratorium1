package com.company;

import java.util.Locale;

public class Polygon {
    private Point[] vertices;
    Polygon(int numOfVer){
        vertices = new Point[numOfVer];
    }
    public void setVertex(int numOfVer, Point vertex){
        vertices[numOfVer] = vertex;
    }
    public void setVertices(Point[] vertices){
        this.vertices = vertices;
    }
    public String toSvg(){
        String s = "";
        for(Point p: vertices){
            s = s+p.x+","+p.y+" ";
        };
        return String.format(Locale.ENGLISH,"<polygon points=\"%s\"/>",s);
    }
}

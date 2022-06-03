/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("This is the AntSimulator");
        
        Area area;
        
        int xCoordinate;
        int yCoordinate;
        int height;
        int widht;
        
        width = 200;
        height = 100;
        int numberOfPile=2;
        int tickDuration = 2000;
        
        Cell cell;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        cell = new Cell(3,4,pheromoneDrops);
        
        Arraylist<Cell> cells;
        cells = new ArrayList<>();
        
        ArrayList<Colony> colonies;
        foodPiles = new ArrayList<>();
        
        cells = new ArrayList<>();
        System.out.println("cell --> " + cell);
        
    }
}

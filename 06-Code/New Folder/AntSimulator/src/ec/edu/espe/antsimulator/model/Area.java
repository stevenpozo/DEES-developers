/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;


/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Area {
    private int width;
    private int height;
    private int initNumberFoodPules;
    private int tickduration;
    private ArrayList<Cell> cell;
    private ArrayList<Colony> colonies;
    private ArrayList<FoodPile> foodPiles;
    private ArrayList<AntEater> antEaters;
    
    public Area(){
            width=0;
            height=0;
            initNumberFoodPules=0;
            tickduration=0;
            cell=new ArrayList<>();
            colonies=new ArrayList<>();
            foodPiles=new ArrayList<>();
            antEaters=new ArrayList<>();
    }

    public void setup(){
        
    }
    //POLYMORPHIS - polimorfismo
    //OVERLOADING - Spbre carga de funciones
    public void add(Colony colony){
        colonies.add(colony);
        
        
    }
    public void add(AntEater antEater){
        antEaters.add(antEater);
    }
    
    public boolean isAnyFoodReamaining(){
        // todo code to determine if there is no food
        // if(conditional)
        //for/foreach/while/do-while (loop0
        return false;
    }
    public Cell getCell(int row,int col){
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        Cell cell =new Cell(row,col, pheromoneDrops);
        return cell;
    }
    
    public Area(int width, int height, int initNumberFoodPules, int tickduration, ArrayList<Cell> cell, ArrayList<Colony> colonies, ArrayList<FoodPile> foodPiles, ArrayList<AntEater> antEaters) {
        this.width = width;
        this.height = height;
        this.initNumberFoodPules = initNumberFoodPules;
        this.tickduration = tickduration;
        this.cell = cell;
        this.colonies = colonies;
        this.foodPiles = foodPiles;
        this.antEaters = antEaters;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the initNumberFoodPules
     */
    public int getInitNumberFoodPules() {
        return initNumberFoodPules;
    }

    /**
     * @param initNumberFoodPules the initNumberFoodPules to set
     */
    public void setInitNumberFoodPules(int initNumberFoodPules) {
        this.initNumberFoodPules = initNumberFoodPules;
    }

    /**
     * @return the tickduration
     */
    public int getTickduration() {
        return tickduration;
    }

    /**
     * @param tickduration the tickduration to set
     */
    public void setTickduration(int tickduration) {
        this.tickduration = tickduration;
    }

    /**
     * @return the cell
     */
    public ArrayList<Cell> getCell() {
        return cell;
    }

    /**
     * @param cell the cell to set
     */
    public void setCell(ArrayList<Cell> cell) {
        this.cell = cell;
    }

    /**
     * @return the colonies
     */
    public ArrayList<Colony> getColonies() {
        return colonies;
    }

    /**
     * @param colonies the colonies to set
     */
    public void setColonies(ArrayList<Colony> colonies) {
        this.colonies = colonies;
    }

    /**
     * @return the foodPiles
     */
    public ArrayList<FoodPile> getFoodPiles() {
        return foodPiles;
    }

    /**
     * @param foodPiles the foodPiles to set
     */
    public void setFoodPiles(ArrayList<FoodPile> foodPiles) {
        this.foodPiles = foodPiles;
    }

    /**
     * @return the antEaters
     */
    public ArrayList<AntEater> getAntEaters() {
        return antEaters;
    }

    /**
     * @param antEaters the antEaters to set
     */
    public void setAntEaters(ArrayList<AntEater> antEaters) {
        this.antEaters = antEaters;
    }
    
    
}

package model;



public class Die {

    private int numberRolled;
    private int numberOfSides;

    /**
     * Get the value of numberOfSides
     *
     * @return the value of numberOfSides
     */
    public Die(){
        //the default constructor creates a 6-sided die
        this.numberOfSides = 6;
    }

    public Die(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }

    /**
     * Set the value of numberOfSides
     *
     * @param numberOfSides new value of numberOfSides
     */
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    /**
     * Get the value of numberRolled
     *
     * @return the value of numberRolled
     */
    public int getNumberRolled() {
        return numberRolled;
    }

    /**
     * Set the value of numberRolled
     *
     * @param numberRolled new value of numberRolled
     */
    public void setNumberRolled(int numberRolled) {
        
        if(numberRolled<0||numberRolled>this.getNumberOfSides()){
            throw new IllegalArgumentException("Must be a number between 1 and "+ this.getNumberOfSides());
        }
        {
            this.numberRolled = numberRolled;
        }
    }

    public void roll(){
        this.setNumberRolled((int)(this.getNumberOfSides()*Math.random())+1);
    }
    


}

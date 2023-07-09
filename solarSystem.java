class Planet
{
    private String planetName;
    private double dist;
    Planet(String pName, int distance)
    {
        planetName=pName;
        dist=distance;
    }
    void distance(Planet p)
    {
        System.out.println("Distance between "+this.planetName+" and "+p.planetName+" is "+(dist-p.dist));
    }
}
class solarSystem
{
    public static void main(String args[])
    {
        Planet ob1 = new Planet("Earth",30);
        Planet ob2 = new Planet("Jupiter",5);
        //System.out.println(ob2.planetName);
        ob1.distance(ob2);
    }
}
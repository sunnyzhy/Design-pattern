package com.zhy.DesignPattern.Facade;

public class Facade {

    private Noodles noodles;
    private Water water;
    private Tomato tomato;
    private Egg egg;
    private Pepper pepper;

    public Facade()
    {
        this.noodles = new Noodles();
        this.water = new Water();
        this.tomato = new Tomato();
        this.egg = new Egg();
        this.pepper = new Pepper();
    }

    public void Cook()
    {
        this.tomato.Cook();
        this.water.Boil();
        this.noodles.Cook();
        this.egg.Cook();
        this.pepper.Put();
    }
}

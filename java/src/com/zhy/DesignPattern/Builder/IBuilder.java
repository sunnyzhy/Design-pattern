package com.zhy.DesignPattern.Builder;

public interface IBuilder {

    void BuildBody();
    void BuildEngine();
    void BuildWheel();
    Car CreateCar();
}

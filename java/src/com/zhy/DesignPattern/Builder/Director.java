package com.zhy.DesignPattern.Builder;

public class Director {

	 public void Constrcut(IBuilder builder)
     {
         builder.BuildBody();
         builder.BuildEngine();
         builder.BuildWheel();
     }
}

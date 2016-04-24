package edu.ucsd.cs110.temperature;

public abstract class Temperature {

    public Temperature(float v)	{
        value = v;
    }

    public float value;
    public final float getValue()	{
        return value;
    }

    public abstract Temperature toCelsius();

    public abstract Temperature toFahrenheit();
}

import java.text.DecimalFormat
import kotlin.math.roundToLong

class SpaceAge(val initialAge: Long){

    val EarthAge = (initialAge.toDouble()/31557600L )
    val df = DecimalFormat("#.00")
    fun onEarth(): Double{
        return df.format(EarthAge).toDouble()
    }
    fun onMercury(): Double{
        var age =EarthAge / 0.2408467
        return df.format(age).toDouble()
    }
    fun onVenus(): Double{
        var age = EarthAge / 0.61519726
        return df.format(age).toDouble()
    }
    fun onMars(): Double{
        var age = EarthAge / 1.8808158
        return df.format(age).toDouble()
    }
    fun onJupiter(): Double{
        var age = EarthAge /11.862615
        return df.format(age).toDouble()
    }
    fun onSaturn(): Double{
        var age = EarthAge /29.447498
        return df.format(age).toDouble()
    }
    fun onUranus(): Double{
        var age = EarthAge / 84.016846
        return df.format(age).toDouble()
    }
    fun onNeptune(): Double{
        var age = EarthAge / 164.79132
        return df.format(age).toDouble()
    }
}


